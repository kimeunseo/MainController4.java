package server_api;

/**
 * Created by aiden on 2017-06-27.
 */
public class BoardFile {
    private int fileSeq;
    private String sch_name;
    private String sch_adrs;
    private double sch_locX;
    private double sch_locY;
    private String sch_aftPrgm;

    private String sch_feat;
    private String sch_found;
    private String  sch_phone;
    private int sch_tchNum;
    private int sch_mTch;
    private int sch_fTch;
    private int sch_spTch;
    private int sch_mStu;
    private double	sch_tchPerStu;
    private int sch_fStu;
    private int sch_totalStu;
    private String sch_foundDate;

    public BoardFile() {
    }


    public double getsch_locX() {
        return  sch_locX;
    }  public void setsch_locX(double sch_locX) {
        this.sch_locX = sch_locX;
    }
    public double getsch_locY() {
        return  sch_locY;
    }  public void setSch_locY(double sch_locY) {
        this.sch_locY = sch_locY;
    }
    public int getFileSeq() {
        return fileSeq;
    }
    public void setFileSeq(int fileSeq) {
        this.fileSeq = fileSeq;
    }

    public void setsch_feat(String sch_feat) {
        this.sch_feat = sch_feat;
    }public String getsch_feat() {
        return sch_feat;
    }

   public String getsch_name() {
        return sch_name;
    }public void setsch_name(String sch_name) {
        this.sch_name = sch_name;
    }

  public String getsch_aftPrgm() {
        return  sch_aftPrgm;
    }
    public void setsch_aftPrgm(String sch_aftPrgm) {
        this.sch_aftPrgm =sch_aftPrgm;
    }

    public String getsch_found() {
        return  sch_found;
    }
    public void setsch_found(String  sch_found) {
        this. sch_found = sch_found;
    }
    public int getsch_tchNum() {
        return  sch_tchNum;
    }
    public void setsch_tchNum(int  sch_tchNum) {
        this. sch_tchNum = sch_tchNum;
    }
    public int getsch_mTch () {
        return  sch_mTch ;
    }
    public void setsch_mTch (int sch_mTch ) {
        this.sch_mTch  =sch_mTch ;
    }

    public int getsch_fTch () {
        return  sch_fTch;
    }
    public void setsch_fTch (int sch_fTch ) {
        this.sch_fTch =sch_fTch;
    }
    public int getsch_spTch() {
        return  sch_spTch;
    }
    public void setsch_spTch (int sch_spTch) {
        this.sch_spTch =sch_spTch;
    }
    public double getsch_tchPerStu() {
        return 	sch_tchPerStu;
    }
    public void setsch_tchPerStu (double	sch_tchPerStu) {
        this.sch_tchPerStu  =sch_tchPerStu;
    }


    public String getsch_adrs() {
        return 	sch_adrs;
    }
    public void setsch_adrs(String 	sch_adrs) {
        this.sch_adrs=sch_adrs;
    }
    public int getsch_mStu () {
        return  sch_mStu ;
    }
    public void setsch_mStu (int sch_mStu) {
        this.sch_mStu  =sch_mStu ;
    }
    public int getsch_fStu () {
        return   sch_fStu ;
    }
    public void setsch_fStu (int  sch_fStu) {
        this. sch_fStu = sch_fStu ;
    }

    public String getsch_phone () {
        return    sch_phone ;
    }
    public void setsch_phone (String    sch_phone) {
        this.   sch_phone =  sch_phone ;
    }


    public int getsch_totalStu
            () {
        return       sch_totalStu
                ;
    }
    public void setsch_totalStu
            (int       sch_totalStu
            ) {
        this.     sch_totalStu
                =      sch_totalStu
        ;
    }
    public String getsch_foundDate () {
        return     sch_foundDate ;
    }
    public void setsch_foundDate (String   sch_foundDate) {
        this.  sch_foundDate =   sch_foundDate ;
    }


}
