/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI.UMY.Tugassatuu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author AISYAH SUHERMAN
 */
@Controller
public class ktpController {
    
    @RequestMapping("/dataktp")
    //@ResponseBody
    public String getdata(Model tampil){
        
        //ktpdata data = new ktpdata();
        ArrayList<List<String>> data = new ArrayList();
        data.add(Arrays.asList("ID","Nomor KTP", "Nama","Alamat"));
        data.add(Arrays.asList("1","1235608123109149", "Anas Asraf","Kelurahan Kalosi"));
        data.add(Arrays.asList("2","1236837364886265", "Anis Israf","Kelurahan Kalosi"));
        data.add(Arrays.asList("3","2373262387381712", "Asnawi Abdullah","Desa Banti"));
        data.add(Arrays.asList("4","2355632145568643", "Muhammad Khalik","Desa Salukanan"));
        data.add(Arrays.asList("5","3124650987654390", "Herda","Desa Mampu"));
        data.add(Arrays.asList("6","1132355765457876", "Azkiah","Desa Bolang"));
        data.add(Arrays.asList("7","1334543775433012", "Yusri Mahendra","Desa Tongko"));
        data.add(Arrays.asList("8","7313859433932976", "Akmal Waddu","Kelurahan Mataran"));
        data.add(Arrays.asList("9","1243575342476426", "Wahyuni","Lambau"));
        data.add(Arrays.asList("10","6324585964983187", "Sinta Wulandari","Desa Saruran"));
        data.add(Arrays.asList("11","7346868768736823", "Raflysawati","Baraka"));
        data.add(Arrays.asList("12","4864638285682954", "Asri Rahman","Desa Karrang"));
        data.add(Arrays.asList("13","2113456423326845", "Rahmi Salim","Desa Cendana"));
        data.add(Arrays.asList("14","5215578815893287", "Dzakira Raihanah","Kelurahan Kalosi"));
        data.add(Arrays.asList("15","1237546964579532", "Isra Almaiza","Desa Singki"));
        data.add(Arrays.asList("16","4287628328482731", "Mahmuddin","Desa Dulang"));
        data.add(Arrays.asList("17","6383647547348364", "Nur Hikmah","Baraka"));
        data.add(Arrays.asList("18","1234689954333567", "Marjani","Desa Curio"));
        data.add(Arrays.asList("19","2342355787974346", "Salwa Humairah","Desa Singki"));
        data.add(Arrays.asList("20","1230854784345678", "Nurul Hidayah","Garutuk"));
        data.add(Arrays.asList("21","1231306229486579", "Ahmad Yani","Desa Lebang"));
        
        tampil.addAttribute("Dataktp", data);
        
        return "dataview";
    }  
}
