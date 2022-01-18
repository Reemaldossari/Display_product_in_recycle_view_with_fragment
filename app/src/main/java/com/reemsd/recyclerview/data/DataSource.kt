package com.reemsd.recyclerview.data
import com.reemsd.recyclerview.R
import com.reemsd.recyclerview.model.SmartPhone

object DataSource {

    val smartPhone :List<SmartPhone> = listOf(
        SmartPhone(R.drawable.iphone,"Iphone_12_64GB","4500 SR",false,5),
        SmartPhone(R.drawable.samsung_galaxy_z_flip,"Samsung_Galaxy_Z_Flip3","5000 SR",true,70),
        SmartPhone(R.drawable.iphone13,"Iphone_13","6000 SR",false,36),
        SmartPhone(R.drawable.samsung_galaxy_uitra,"Samsung_Galaxy_S21_Ultra","3500 SR",true,5),
        SmartPhone(R.drawable.huawei_yp,"Huawei_Y6p","2900 SR" ,false,29))
}