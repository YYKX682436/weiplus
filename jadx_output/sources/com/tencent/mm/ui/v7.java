package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public abstract class v7 {

    /* renamed from: a, reason: collision with root package name */
    public static com.hihonor.easygo.sdk.EasyGo f211108a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f211109b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f211110c;

    public static int a(com.hihonor.easygo.sdk.EasyGo easyGo, int i17) {
        if (easyGo == null || !c()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HonorUtil", "getTaskPos return -1!");
            return -1;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            com.hihonor.easygo.sdk.module.EasyGoRet invokeSync = easyGo.invokeSync("magicwindow", "getTaskPosition", jSONObject, null);
            com.tencent.mars.xlog.Log.i("EasyGo", invokeSync.code + "");
            int i18 = invokeSync.result.getInt("int");
            com.tencent.mars.xlog.Log.e("EasyGo", "getTaskPosition" + i18);
            return i18;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("EasyGo", e17.getMessage());
            return -1;
        }
    }

    public static void b(android.content.Context context) {
        if (fp.e0.b()) {
            if (!com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.u7(), "initEasyGoManager");
            } else {
                if (f211108a == null) {
                    f211108a = new com.hihonor.easygo.sdk.EasyGo(com.tencent.mm.sdk.platformtools.x2.f193071a);
                }
                f211109b = f211108a.init(new java.lang.String[]{"magicwindow"});
                com.tencent.mars.xlog.Log.i("MicroMsg.HonorUtil", "initEasyGoManager large device!!");
            }
        }
    }

    public static boolean c() {
        java.util.List list = f211109b;
        boolean z17 = false;
        if (list != null && list.size() > 0) {
            f211109b.get(0);
            if (((java.lang.Integer) f211109b.get(0)).intValue() == 0) {
                z17 = true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HonorUtil", "initSucceed:%s, retList:%s", java.lang.Boolean.valueOf(z17), f211109b);
        return z17;
    }

    public static boolean d(android.content.Context context) {
        if (!fp.e0.b()) {
            return false;
        }
        boolean contains = context.getResources().getConfiguration().toString().contains("hn-magic-windows");
        com.tencent.mars.xlog.Log.i("MicroMsg.HonorUtil", "isExpandStatus:%s", java.lang.Boolean.valueOf(contains));
        return contains;
    }

    public static void e(int i17) {
        if (f211108a == null || !c()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HonorUtil", "setLoginStatus easyGoManager is null!!");
            return;
        }
        f211110c = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:loginStatus", i17);
            com.tencent.mars.xlog.Log.i("EasyGo", " setLoginStatus ret " + f211108a.invokeSync("magicwindow", "setLoginStatus", jSONObject, null).code);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("EasyGo", e17.getMessage());
        }
    }

    public static void f(com.hihonor.easygo.sdk.EasyGo easyGo, int i17, int i18) {
        if (easyGo == null || !c()) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            jSONObject.put("@int:targetPosition", i18);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("EasyGo", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("EasyGo", easyGo.invokeSync("magicwindow", "setTaskPosition", jSONObject, null).code + "");
    }
}
