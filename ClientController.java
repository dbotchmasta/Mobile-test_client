package client;

import server.ServerCommands;
import structures.goods.AccountingOfOptions;
import structures.entities.PHCounts;
import structures.entities.PHClients;
import structures.operations.PHConnection;
import structures.operations.PHCount;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientController {
    
    private Socket s;
    
    private DataInputStream inStream;
    private DataOutputStream outStream;
    
    public void connect() {
        try {
            s = new Socket("localhost", 5000);
            
            inStream = new DataInputStream(s.getInputStream());
            outStream = new DataOutputStream(s.getOutputStream());
        } catch (IOException ex) {
            System.err.println("Проверьте, запущен ли сервер и перезапустите клиента");
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect() {
        try {
            inStream.close();
            outStream.close();
            s.close();
            System.out.println("Клиент отключился от сервера");
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<AccountingOfOptions> getListOfAllOptions() {
        try {
            outStream.writeUTF(ServerCommands.GET_LIST_OF_ALL_OPTIONS);
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
            
            Type accountingOfGoodsListType = new TypeToken<ArrayList<AccountingOfOptions>>(){}.getType();
            List<AccountingOfOptions> list = new Gson().fromJson(response, accountingOfGoodsListType);
            
            return list;
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<AccountingOfOptions> getListOfOptionsByKind(String kind) {
        try {
            outStream.writeUTF(ServerCommands.GET_LIST_OF_OPTIONS_BY_KIND);
            outStream.writeUTF(kind);
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
            
            Type accountingOfGoodsListType = new TypeToken<ArrayList<AccountingOfOptions>>(){}.getType();
            List<AccountingOfOptions> list = new Gson().fromJson(response, accountingOfGoodsListType);
            
            return list;
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<AccountingOfOptions> getListOfOptionsByCount(int countId) {
        try {
            outStream.writeUTF(ServerCommands.GET_LIST_OF_OPTIONS_BY_COUNT);
            outStream.writeInt(countId);
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
            
            Type accountingOfGoodsListType = new TypeToken<ArrayList<AccountingOfOptions>>(){}.getType();
            List<AccountingOfOptions> list = new Gson().fromJson(response, accountingOfGoodsListType);
            
            return list;
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<AccountingOfOptions> getListOfOptionsByClient(int clientId) {
        try {
            outStream.writeUTF(ServerCommands.GET_LIST_OF_OPTIONS_BY_CLIENT);
            outStream.writeInt(clientId);
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
            
            Type accountingOfOptionsListType = new TypeToken<ArrayList<AccountingOfOptions>>(){}.getType();
            List<AccountingOfOptions> list = new Gson().fromJson(response, accountingOfOptionsListType);
            
            return list;
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<PHCounts> getListOfAllCounts() {
        try {
            outStream.writeUTF(ServerCommands.GET_LIST_OF_ALL_COUNTS);
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
            
            Type countsListType = new TypeToken<ArrayList<PHCounts>>(){}.getType();
            List<PHCounts> list = new Gson().fromJson(response, countsListType);
            
            return list;
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<PHClients> getListOfAllClients() {
        try {
            outStream.writeUTF(ServerCommands.GET_LIST_OF_ALL_CLIENTS);
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
            
            Type countsListType = new TypeToken<ArrayList<PHClients>>(){}.getType();
            List<PHClients> list = new Gson().fromJson(response, countsListType);
            
            return list;
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<PHCounts> getListOfCountsByOptions(int optionsId) {
        try {
            outStream.writeUTF(ServerCommands.GET_LIST_OF_COUNTS_BY_OPTIONS);
            outStream.writeInt(optionsId);
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
            
            Type countsListType = new TypeToken<ArrayList<PHCounts>>(){}.getType();
            List<PHCounts> list = new Gson().fromJson(response, countsListType);
            
            return list;
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<PHClients> getListOfClientsByOptions(int optionsId) {
        try {
            outStream.writeUTF(ServerCommands.GET_LIST_OF_CLIENTS_BY_OPTIONS);
            outStream.writeInt(optionsId);
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
            
            Type countsListType = new TypeToken<ArrayList<PHClients>>(){}.getType();
            List<PHClients> list = new Gson().fromJson(response, countsListType);
            
            return list;
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<PHCount> getListOfCountsByDate(Date begin, Date end) {
        try {
            outStream.writeUTF(ServerCommands.GET_LIST_OF_COUNTS_BY_DATE);
            outStream.writeUTF(new Gson().toJson(begin));
            outStream.writeUTF(new Gson().toJson(end));
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
            
            Type suppliesListType = new TypeToken<ArrayList<PHCount>>(){}.getType();
            List<PHCount> list = new Gson().fromJson(response, suppliesListType);
            
            return list;
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<PHConnection> getListOfConnectionsByDate(Date begin, Date end) {
        try {
            outStream.writeUTF(ServerCommands.GET_LIST_OF_CONNECTIONS_BY_DATE);
            outStream.writeUTF(new Gson().toJson(begin));
            outStream.writeUTF(new Gson().toJson(end));
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
            
            Type connectionsListType = new TypeToken<ArrayList<PHConnection>>(){}.getType();
            List<PHConnection> list = new Gson().fromJson(response, connectionsListType);
            
            return list;
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void completeCount(PHCount phcount) {
        try {
            outStream.writeUTF(ServerCommands.COMPLETE_COUNT);
            outStream.writeUTF(new Gson().toJson(phcount));
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void completeConnection(PHConnection phcon) {
        try {
            outStream.writeUTF(ServerCommands.COMPLETE_CONNECTION);
            outStream.writeUTF(new Gson().toJson(phcon));
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addAccountigOfOptions(AccountingOfOptions acOfOptions) {
        try {
            outStream.writeUTF(ServerCommands.ADD_ACCOUNTING_OF_OPTIONS);
            outStream.writeUTF(new Gson().toJson(acOfOptions));
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updAccountigOfOptions(AccountingOfOptions acOfOptions) {
        try {
            outStream.writeUTF(ServerCommands.UPD_ACCOUNTING_OF_OPTIONS);
            outStream.writeUTF(new Gson().toJson(acOfOptions));
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delAccountigOfOptions(int optionsID) {
        try {
            outStream.writeUTF(ServerCommands.DEL_ACCOUNTING_OF_OPTIONS);
            outStream.writeInt(optionsID);
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addCount(PHCounts phcounts) {
        try {
            outStream.writeUTF(ServerCommands.ADD_COUNT);
            outStream.writeUTF(new Gson().toJson(phcounts));
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addClient(PHClients phclients) {
        try {
            outStream.writeUTF(ServerCommands.ADD_CLIENT);
            outStream.writeUTF(new Gson().toJson(phclients));
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addCountForOptions(int countId, int optionsId) {
        try {
            outStream.writeUTF(ServerCommands.ADD_COUNT_FOR_OPTIONS);
            outStream.writeInt(countId);
            outStream.writeInt(optionsId);
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addClientForOptions(int clientId, int optionsId) {
        try {
            outStream.writeUTF(ServerCommands.ADD_CLIENT_FOR_OPTIONS);
            outStream.writeInt(clientId);
            outStream.writeInt(optionsId);
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updCount(PHCounts phcounts) {
        try {
            outStream.writeUTF(ServerCommands.UPD_COUNT);
            outStream.writeUTF(new Gson().toJson(phcounts));
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updClient(PHClients phclients) {
        try {
            outStream.writeUTF(ServerCommands.UPD_CLIENT);
            outStream.writeUTF(new Gson().toJson(phclients));
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delCount(int phcountsId) {
        try {
            outStream.writeUTF(ServerCommands.DEL_COUNT);
            outStream.writeInt(phcountsId);
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delClient(int phclientsId) {
        try {
            outStream.writeUTF(ServerCommands.DEL_CLIENT);
            outStream.writeInt(phclientsId);
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delCountForOptions(int phcountId, int optionsId) {
        try {
            outStream.writeUTF(ServerCommands.DEL_COUNT_FOR_OPTIONS);
            outStream.writeInt(phcountId);
            outStream.writeInt(optionsId);
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delClientForOptions(int phclientId, int optionsId) {
        try {
            outStream.writeUTF(ServerCommands.DEL_CLIENT_FOR_OPTIONS);
            outStream.writeInt(phclientId);
            outStream.writeInt(optionsId);
            
            String response = inStream.readUTF();
            System.out.println(ClientMessages.ANSWER + " " + response);
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
