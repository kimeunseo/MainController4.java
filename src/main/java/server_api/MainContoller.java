package server_api;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.lang.String;
/**
 * Created by aiden on 2017-06-23.
 */
@Controller
public class MainContoller {

    protected Logger logger = Logger.getLogger(this.getClass());


    @RequestMapping("/")
    public String Index(Model model) throws Exception {

        logger.info("index.....");

        System.out.println("index");

        return "index";

    }


    @RequestMapping(value = "/jsonTest1.do")
    public @ResponseBody
    Object jsonTest1() { //가상의 배열및 리스트에 데이터 add
        Board board = new Board();
        board.setSeq(0);
        board.setTitle("학교 검색");
        board.setContent("고등학교 선택");
        board.setRegdate(new Date());
        ArrayList<BoardFile> filelist = new ArrayList<BoardFile>();
        BoardFile boardFile =new BoardFile();
        boardFile.setFileSeq(1); boardFile.setsch_name("송원고등학교");
        filelist.add(boardFile);
        board.setFilelist(filelist);


        boardFile = new BoardFile();
        boardFile.setFileSeq(2);

        boardFile.setsch_name("송원고등학교");
        boardFile.setsch_adrs("위치:광주광역시 송풍로  ");
        boardFile.setsch_locX(68);
     boardFile.setSch_locY(168);

        filelist.add(boardFile);
        board.setFilelist(filelist);


        boardFile = new BoardFile();
        boardFile.setsch_name("송원고등학교");
        boardFile.setFileSeq(3); boardFile.setsch_aftPrgm("방과후프로그램\t      개수:3    "
                        +"프로그램명:수학심화     "
                        +"프로그램명:과학심화    "
                        + "프로그램명:국어기초");


        filelist.add(boardFile);
        board.setFilelist(filelist);

        boardFile = new BoardFile();
        boardFile.setsch_name("송원고등학교");
        boardFile.setFileSeq(4);

        boardFile.setsch_totalStu(300);
        boardFile.setsch_mStu(150);
        boardFile.setsch_fStu(150);


        filelist.add(boardFile);
        board.setFilelist(filelist);

        boardFile = new BoardFile();
        boardFile.setsch_name("송원고등학교");
        boardFile.setFileSeq(5);
        boardFile.setsch_feat("설립구분=인문계" );
        boardFile.setsch_phone( "     학교전화 = 02-877-6333;");
        boardFile.setsch_found("자사고");
        boardFile.setsch_foundDate("  개교일 = 19990304  ");

        filelist.add(boardFile);
        board.setFilelist(filelist);




        boardFile = new BoardFile();
        boardFile.setsch_name("송원고등학교");
        boardFile.setFileSeq(6);

        boardFile.setsch_tchNum(59);
        boardFile.setsch_mTch( 20);
        boardFile.setsch_fTch(  36);
        boardFile.setsch_spTch( 3);
        boardFile.setsch_tchPerStu(     9.3);

        filelist.add(boardFile);
        board.setFilelist(filelist);

        logger.info("jsonTest1.....");

        System.out.println("jsonTest1");
        return board;
    }
    @RequestMapping(value = "/jsonTest2.do")
    public @ResponseBody
    Object jsonTest2() { //가상의 배열및 리스트에 데이터 add
        Board board = new Board();
        board.setSeq(0);
        board.setTitle("학교 검색");
        board.setContent("고등학교 선택");
        board.setRegdate(new Date());
        ArrayList<BoardFile> filelist = new ArrayList<BoardFile>();
        BoardFile boardFile = null; boardFile = new BoardFile();
        boardFile.setFileSeq(1); boardFile.setsch_name("서울여자상업고등학교");
        filelist.add(boardFile);
        board.setFilelist(filelist);



        boardFile = new BoardFile();
        boardFile.setFileSeq(2);
        boardFile.setsch_name("서울여자상업고등학교");
        boardFile.setsch_adrs("위치:서울시 서초구");
        boardFile.setsch_locX(240);
        boardFile.setsch_locX(40);
        boardFile.setSch_locY(255);
        filelist.add(boardFile);
        board.setFilelist(filelist);


        boardFile = new BoardFile();
        boardFile.setsch_name("서울여자상업고등학교");
        boardFile.setFileSeq(3);
        boardFile.setsch_aftPrgm("방과후프로그램\t      개수:2    "
                        +"프로그램명:피부미용의이해     "
                        +"프로그램명:헤어디자인및실습    ");

        filelist.add(boardFile);
        board.setFilelist(filelist);

        boardFile = new BoardFile();
        boardFile.setsch_name("서울여자상업고등학교");

        boardFile.setFileSeq(4);
        boardFile.setsch_fStu(    320);
        boardFile.setsch_totalStu(320);



        filelist.add(boardFile);
        board.setFilelist(filelist);

        boardFile = new BoardFile();
        boardFile.setsch_name("서울여자상업고등학교");
        boardFile.setFileSeq(5);
        boardFile.setsch_feat("설립구분=전문계");
        boardFile.setsch_phone( "     학교전화 = 02-877-6333;");
        boardFile.setsch_found("  사립   ");
        boardFile.setsch_foundDate("  개교일 = 19890904  ");

        filelist.add(boardFile);
        board.setFilelist(filelist);




        boardFile = new BoardFile();
        boardFile.setsch_name("서울여자상업고등학교");
        boardFile.setFileSeq(6);
        boardFile.setsch_tchNum(81);
        boardFile.setsch_fTch(59 );
        boardFile.setsch_mTch(20);
        boardFile.setsch_spTch(2);
        boardFile.setsch_tchPerStu(     11.2);

        filelist.add(boardFile);
        board.setFilelist(filelist);

        logger.info("jsonTest2.....");

        System.out.println("jsonTest2");
        return board;
    }
    @RequestMapping(value = "/jsonTest3.do")
    public @ResponseBody
    Object jsonTest3() { //가상의 배열및 리스트에 데이터 add
        Board board = new Board();
        board.setSeq(0);
        board.setTitle("학교 검색");
        board.setContent("고등학교 선택");
        board.setRegdate(new Date());
        ArrayList<BoardFile> filelist = new ArrayList<BoardFile>();
        BoardFile boardFile = null; boardFile = new BoardFile();
        boardFile.setFileSeq(1); boardFile.setsch_name("한림예술고등학교");
        filelist.add(boardFile);
        board.setFilelist(filelist);


        boardFile = new BoardFile();
        boardFile.setFileSeq(2);

        boardFile.setsch_adrs("위치:서울시 강남구   "); 

        boardFile.setsch_locX  ( 100.8 );
        boardFile.setSch_locY (  90.5 );

        filelist.add(boardFile);
        board.setFilelist(filelist);


        boardFile = new BoardFile();

        boardFile.setFileSeq(3); boardFile.setsch_aftPrgm("방과후프로그램\t     개수:4    "
                        +"프로그램명:실용음악의 이해     "
                        +"프로그램명:고급 보컬트레이닝    "
                        +"프로그램명:기초 한국무용    "
                        +"프로그램명:연기발성과 기초    ");
        filelist.add(boardFile);
        board.setFilelist(filelist);

        boardFile = new BoardFile();
        boardFile.setFileSeq(4);
        boardFile.setsch_mStu( 200 );
        boardFile.setsch_fStu(160);
        boardFile.setsch_totalStu(360);
        filelist.add(boardFile);
        board.setFilelist(filelist);

        boardFile = new BoardFile();
        boardFile.setFileSeq(5);
        boardFile.setsch_feat(   "설립구분=예술계" );
        boardFile.setsch_found("  사립   ");
        boardFile.setsch_phone( " 학교전화 = 02-877-6333;");
        boardFile.setsch_foundDate("개교일 = 20090924  ");



        filelist.add(boardFile);
        board.setFilelist(filelist);




        boardFile = new BoardFile();
        boardFile.setsch_name("한림예술고등학교");
        boardFile.setFileSeq(6);
        boardFile.setsch_tchNum(103);
        boardFile.setsch_fTch( 60);

        boardFile.setsch_mTch(40);
        boardFile.setsch_spTch(3);
        boardFile.setsch_tchPerStu(     12.1);

        filelist.add(boardFile);
        board.setFilelist(filelist);

        logger.info("jsonTest3.....");

        System.out.println("jsonTest3");
        return board;
    }
}

