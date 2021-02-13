package com.example.galleryapp.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.JsonObject
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

class HomeViewModel(application: Application) : AndroidViewModel(application){

    var mContext:Context? = null


     fun getBannerImage(ctx:Context){
         mContext = ctx
        val queue = Volley.newRequestQueue(mContext)
        val url = "https://api.pexels.com/v1/curated/?page=1&per_page=1"

         val stringReq = StringRequest(Request.Method.GET, url,
             Response.Listener<String> { response ->

                 var strResp = response.toString()
                 val jsonObj: JSONObject = JSONObject(strResp)
                 val jsonArray: JSONArray = jsonObj.getJSONArray("items")
                 var str_user: String = ""
                 for (i in 0 until jsonArray.length()) {
                     var jsonInner: JSONObject = jsonArray.getJSONObject(i)
                    
                 }

             },
             Response.ErrorListener {  })
         queue.add(stringReq)
     }
    }



}