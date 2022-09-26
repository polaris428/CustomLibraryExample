package com.android.customlibraryexample

import android.content.Context
import android.content.res.Resources
import android.widget.Toast

class MyToast {

   fun showMyToast(context: Context,string:String  ){
        Toast.makeText(context,string, Toast.LENGTH_SHORT).show()
    }
    fun showMyToast(context: Context,int:Int  ){
        Toast.makeText(context,int.toString(), Toast.LENGTH_SHORT).show()
    }
    fun showMyToast(context: Context,double:Double  ){
        Toast.makeText(context,double.toString(), Toast.LENGTH_SHORT).show()
    }
    fun showMyToast(context: Context,float: Float  ){
        Toast.makeText(context,float.toString(), Toast.LENGTH_SHORT).show()
    }
    fun showMyToast(context: Context,char: Char  ){
        Toast.makeText(context,char.toString(), Toast.LENGTH_SHORT).show()
    }
    fun showMyToast(context: Context,  ){
        Toast.makeText(context,context.toString(), Toast.LENGTH_SHORT).show()
    }



}