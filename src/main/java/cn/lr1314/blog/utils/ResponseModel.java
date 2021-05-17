package cn.lr1314.blog.utils;

import com.alibaba.fastjson.JSONObject;

public class ResponseModel {
    public static JSONObject fail(int status, String msg) {
        JSONObject resJSon = new JSONObject();
        resJSon.put("status", status);
        resJSon.put("msg", msg);
        return resJSon;
    }

    public static JSONObject fail(String msg) {
        JSONObject resJSon = new JSONObject();
        resJSon.put("status", 400);
        resJSon.put("msg", msg);
        return resJSon;
    }

    public static JSONObject fail(int status, String msg, Object obj) {
        JSONObject resJSon = new JSONObject();
        resJSon.put("status", status);
        resJSon.put("msg", msg);
        resJSon.put("data", obj);
        return resJSon;
    }

    public static JSONObject suc(Object obj) {
        JSONObject resJSon = new JSONObject();
        resJSon.put("status", 200);
        resJSon.put("msg", "suc");
        resJSon.put("data", obj);
        return resJSon;
    }
    public static JSONObject suc() {
        JSONObject resJSon = new JSONObject();
        resJSon.put("status", 200);
        resJSon.put("msg", "suc");
        return resJSon;
    }

}
