package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public abstract class fl {

    /* renamed from: a, reason: collision with root package name */
    public static com.huawei.easygo.sdk.EasyGo f208605a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f208606b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f208607c;

    /* renamed from: d, reason: collision with root package name */
    public static int[] f208608d = new int[0];

    public static int a(com.huawei.easygo.sdk.EasyGo easyGo, int i17) {
        if (easyGo != null && c()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:taskId", i17);
                com.huawei.easygo.sdk.module.EasyGoRet invokeSync = easyGo.invokeSync("magicwindow", "getTaskPosition", jSONObject, null);
                com.tencent.mars.xlog.Log.i("EasyGo", invokeSync.code + "");
                int i18 = invokeSync.result.getInt("int");
                com.tencent.mars.xlog.Log.e("EasyGo", "getTaskPosition" + i18);
                return i18;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("EasyGo", e17.getMessage());
            }
        }
        return -1;
    }

    public static void b(android.content.Context context) {
        if (!com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.el(), "initEasyGoManager");
        } else {
            if (f208605a == null) {
                f208605a = new com.huawei.easygo.sdk.EasyGo(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            f208606b = f208605a.init(new java.lang.String[]{"magicwindow"});
            com.tencent.mars.xlog.Log.i("MicroMsg.huaweiUtil", "initEasyGoManager large device!!");
        }
    }

    public static boolean c() {
        java.util.List list = f208606b;
        boolean z17 = false;
        if (list != null && list.size() > 0) {
            f208606b.get(0);
            if (((java.lang.Integer) f208606b.get(0)).intValue() == 0) {
                z17 = true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.huaweiUtil", "initSucceed:%s, retList:%s", java.lang.Boolean.valueOf(z17), f208606b);
        return z17;
    }

    public static boolean d(android.content.Context context) {
        java.lang.String configuration = context.getResources().getConfiguration().toString();
        return configuration.contains("hwMultiwindow-magic") || configuration.contains("hw-magic-windows");
    }

    public static boolean e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isHGSPhone Build.MODEL:");
        java.lang.String str = android.os.Build.MODEL;
        sb6.append(str);
        sb6.append(", ");
        sb6.append(fp.e0.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.huaweiUtil", sb6.toString());
        return fp.e0.c() && ("HGS-AL10".equalsIgnoreCase(str) || "HGS-AL10D".equalsIgnoreCase(str) || "GRL-AL10".equalsIgnoreCase(str) || "GRL-AL10D".equalsIgnoreCase(str));
    }

    public static void f(int i17) {
        if (f208605a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.huaweiUtil", "setLoginStatus easyGoManager is null!!");
            return;
        }
        f208607c = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:loginStatus", i17);
            com.tencent.mars.xlog.Log.i("EasyGo", " setLoginStatus ret " + f208605a.invokeSync("magicwindow", "setLoginStatus", jSONObject, null).code);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("EasyGo", e17.getMessage());
        }
    }

    public static void g(com.huawei.easygo.sdk.EasyGo easyGo, int i17, int i18) {
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
        com.tencent.mars.xlog.Log.i("EasyGo", easyGo.invokeSync("magicwindow", "setTaskPosition", jSONObject, null).code + "");
    }
}
