package Arbitrage;

public class assetList {
    int currentCash;
    int targetCash;
    int porkBellies;
    int froOranJuCon;
    int soybeans;
    
    public assetList(int startCash, int finalCash){
        currentCash = startCash;
        targetCash = finalCash;
        porkBellies = 0;
        froOranJuCon = 0;
        soybeans = 0;
                
    }
    
    public int getCurrentCash(){
        return currentCash;
    }
    
    public int getTargetCash(){
        return targetCash;
    }
    
    public int getPorkBellies(){
        return porkBellies;
    }
    
    public int getFOJC(){
        return froOranJuCon;
    }
       
    public int getSoybeans(){
        return soybeans;
    }
    
    public void setCurrentCash(int cc){
        currentCash = cc;
    }

    public void setTargetCash(int tc){
        targetCash = tc;
    }
    
    public void setPorkBellies(int pb){
        porkBellies = pb;
    }   
 
    public void setFOJC(int fojc){
        froOranJuCon = fojc;
    }
    
    public void setSoybeans(int sb){
        soybeans = sb;
    }    
}
