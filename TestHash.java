/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication1;
import java.util.*;
/**
 *
 * @author 
 * Posathorn Ploykaew 5907101008
 * Pacharapon Sreepiachai 5907101024
 */
public class TestHash {
     public static void main(String[] args){
	        HashTable tableHash = new HashTable();
        Scanner sc = new Scanner(System.in);
 
        System.out.println("============ WELCOME ============");
        System.out.println("1. LOADING");
        System.out.println("============================");
        System.out.print(" WRITE 1 TO CONTINUE :: ");
        
        int ch = sc.nextInt();
        switch(ch){
            case 1 :tableHash.insert("Ability","�������ö"); //a
                    tableHash.insert("Accident","�غѵ��˵�");
                    tableHash.insert("Adventure","��ü�����");
                    
                    tableHash.insert("Beggar","���ͷҹ"); //b
                    tableHash.insert("Blanket","������");
                    tableHash.insert("Bookcase","���˹ѧ���");
                    
                    tableHash.insert("Calculator","����ͧ�Դ�Ţ");//c
                    tableHash.insert("Ceiling","ྴҹ");
                    tableHash.insert("Cheerful","�����ԧ");
                    
                    tableHash.insert("Diligent","��ѹ");//d
                    tableHash.insert("Dread","��Ҵ����");
                    tableHash.insert("Dustbin","�ѧ���");
                    
                    tableHash.insert("Editor","��óҸԡ��");//e1 
                    tableHash.insert("Engineer","���ǡ�");
                    tableHash.insert("Explorer","�ѡ���Ǩ");
                    
                    tableHash.insert("Garment","����ͼ��");//g
                    tableHash.insert("Genius","�Ѩ�����");
                    tableHash.insert("Govern","����ͧ");
                    tableHash.insert("Gun","�׹");
                    
                    tableHash.insert("Hermit","����");//h
                    tableHash.insert("Horrible","��ҡ���");
                    tableHash.insert("Hunter","��¾�ҹ");
                    
                    tableHash.insert("Idiom","�ӹǹ");//i
                    tableHash.insert("Impolite","��Һ���");
                    tableHash.insert("Intend","����");
                    
                    tableHash.insert("Jasmine","������");//j
                    tableHash.insert("Journey","����Թ�ҧ");
                    tableHash.insert("Justice","�����صԸ���");
                    
                    tableHash.insert("Keeper","������ѡ��");//k
                    tableHash.insert("Kingdom","�ҳҨѡ�");
                    tableHash.insert("Knowledge","�������");
                    
                    tableHash.insert("Layoff","�����ԡ��ҧ");//l
                    tableHash.insert("Legend","�ӹҹ");
                    tableHash.insert("License","�͹حҵ�");
                    
                    tableHash.insert("Manniac","�����");//m
                    tableHash.insert("Meeting","��û�Ъ��");
                    tableHash.insert("Miracle","��Ȩ����");
                    
                    tableHash.insert("Narration","��ú�����");//n
                    tableHash.insert("Network","���͢���");
                    tableHash.insert("Nutrition","����ҡ��");
                    
                    tableHash.insert("Obedient","���Ϳѧ");//o
                    tableHash.insert("Ocean","�����ط�");
                    tableHash.insert("Opportunity","�͡��");
                    
                    tableHash.insert("Parliament","�Ѱ���");//p
                    tableHash.insert("Permission","����Թ���");
                    tableHash.insert("Pleasure","�������");
                    
                    tableHash.insert("Quandary","�����ִ�Ѵ�");//q
                    tableHash.insert("Quarrel","������");
                    tableHash.insert("Queer","�����Ҵ");
                    
                    tableHash.insert("Register","ŧ����¹");//r
                    tableHash.insert("Rocket","��Ǵ");
                    tableHash.insert("Ruthless","�˴������");
                    
                    tableHash.insert("Satellite","�������"); //s
                    tableHash.insert("Scientist","�ѡ�Է����ʵ��");
                    tableHash.insert("Skeleton","�ç��д١");
                    
                    tableHash.insert("Talkative","�ٴ�ҡ");//t
                    tableHash.insert("Timetable","���ҧ����");
                    tableHash.insert("Tournament","����觢ѹ");
                    
                    tableHash.insert("Uncomfortable","����дǡ");//u
                    tableHash.insert("Upset","�Ѻʹ");
                    tableHash.insert("Useless","������ª��");
                    
                    tableHash.insert("Vacillate","����¹�ŧ");//v
                    tableHash.insert("Ventilate","�к����");
                    tableHash.insert("Voyage","����Թ�ҧ��");
                    
                    tableHash.insert("Warehouse","��ѧ�Թ���");//w
                    tableHash.insert("Welfare","���ʴԡ��");
                    tableHash.insert("Wicked","�˴����");
                    
                    tableHash.insert("X-ray","�ѧ����硫�");//x
                    tableHash.insert("Xerox","�����͡���");
                    tableHash.insert("Xmas","���ʵ����");
                    
                    tableHash.insert("Yacht","���ͷ�ͧ�����");//y
                    tableHash.insert("Yield","��Ե");
                    tableHash.insert("Yourself","����ͧ");
                    
                    tableHash.insert("Zealously","��е�������"); //z
                    tableHash.insert("Zenith","�ش�ʹ");
                    tableHash.insert("Zoology","�ѵ��Է��");
                    
                    System.out.println("load file complete");            
                    tableHash.MAINMENU();
                    break;
            default :System.out.print(" PLEASE SEECT 1 ONLY ");
            
	    }
    }
}
