package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public abstract class w9 {

    /* renamed from: a, reason: collision with root package name */
    public static com.miui.easygo.sdk.EasyGo f211214a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f211215b;

    public static int a(com.miui.easygo.sdk.EasyGo easyGo, int i17) {
        if (easyGo == null) {
            return -1;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            try {
                com.miui.easygo.sdk.module.EasyGoRet invokeSync = easyGo.invokeSync("magicwindow", "getTaskPosition", jSONObject, (android.os.Bundle) null);
                com.tencent.mars.xlog.Log.i("EasyGo", invokeSync.code + "");
                int i18 = invokeSync.result.getInt("int");
                com.tencent.mars.xlog.Log.i("EasyGo", "getTaskPosition" + i18);
                return i18;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("EasyGo", th6.getMessage());
                return -1;
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("EasyGo", e17.getMessage());
            return -1;
        }
    }

    public static void b(android.content.Context context) {
        if (com.tencent.mm.ui.bk.V() || com.tencent.mm.ui.bk.X()) {
            try {
                if (f211214a == null) {
                    f211214a = new com.miui.easygo.sdk.EasyGo(com.tencent.mm.sdk.platformtools.x2.f193071a);
                }
                f211215b = f211214a.init(new java.lang.String[]{"magicwindow"});
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("EasyGo", th6, null, new java.lang.Object[0]);
            }
        }
    }

    public static boolean c(android.content.Context context) {
        return context.getResources().getConfiguration().toString().contains("miui-magic-windows");
    }

    public static void d(int i17) {
        if (f211214a == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:loginStatus", i17);
            try {
                com.tencent.mars.xlog.Log.i("EasyGo", " setLoginStatus ret " + f211214a.invokeSync("magicwindow", "setLoginStatus", jSONObject, (android.os.Bundle) null).code);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("EasyGo", th6.getMessage());
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("EasyGo", e17.getMessage());
        }
    }

    public static void e(com.miui.easygo.sdk.EasyGo easyGo, int i17, int i18) {
        if (easyGo == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            jSONObject.put("@int:targetPosition", i18);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("EasyGo", e17.getMessage());
        }
        try {
            com.tencent.mars.xlog.Log.i("EasyGo", easyGo.invokeSync("magicwindow", "setTaskPosition", jSONObject, (android.os.Bundle) null).code + "");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("EasyGo", th6.getMessage());
        }
    }
}
