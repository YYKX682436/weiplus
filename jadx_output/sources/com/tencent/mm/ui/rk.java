package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public abstract class rk {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Object f209753a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Method f209754b;

    public static int a(int i17) {
        if ((!com.tencent.mm.ui.bk.g0() && !com.tencent.mm.ui.bk.f0()) || f209754b == null) {
            return -1;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            return ((android.os.Bundle) f209754b.invoke(f209753a, "com.tencent.mm", "getTaskPosition", jSONObject.toString(), null)).getInt("int");
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException | org.json.JSONException unused) {
            return -1;
        }
    }

    public static boolean b(android.content.Context context) {
        if (!com.tencent.mm.ui.bk.g0() && !com.tencent.mm.ui.bk.f0()) {
            return false;
        }
        try {
            f209753a = (android.view.WindowManager) context.getSystemService("window");
            java.lang.reflect.Method method = android.view.WindowManager.class.getMethod("invokeSync", java.lang.String.class, java.lang.String.class, java.lang.String.class, android.os.Bundle.class);
            f209754b = method;
            if (method != null) {
                return ((android.os.Bundle) method.invoke(f209753a, "com.tencent.mm", "isMultiLandsEnable", null, null)).getBoolean(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN);
            }
            return false;
        } catch (java.lang.Exception e17) {
            e17.toString();
            try {
                f209753a = java.lang.Class.forName("android.view.IWindowManager$Stub").getMethod("asInterface", android.os.IBinder.class).invoke(null, java.lang.Class.forName("android.os.ServiceManager").getMethod("getService", java.lang.String.class).invoke(null, "window"));
                java.lang.reflect.Method method2 = java.lang.Class.forName("android.view.IWindowManager$Stub$Proxy").getMethod("invokeSync", java.lang.String.class, java.lang.String.class, java.lang.String.class, android.os.Bundle.class);
                f209754b = method2;
                if (method2 != null) {
                    return ((android.os.Bundle) method2.invoke(f209753a, "com.tencent.mm", "isMultiLandsEnable", null, null)).getBoolean(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN);
                }
                return false;
            } catch (java.lang.Exception e18) {
                e18.toString();
                return false;
            }
        }
    }

    public static void c(int i17, int i18) {
        java.lang.reflect.Method method;
        if ((!com.tencent.mm.ui.bk.g0() && !com.tencent.mm.ui.bk.f0()) || (method = f209754b) == null || method == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            jSONObject.put("@int:targetPosition", i18);
        } catch (org.json.JSONException e17) {
            e17.getMessage();
        }
        try {
            f209754b.invoke(f209753a, "com.tencent.mm", "setTaskPosition", jSONObject.toString(), null);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
        }
    }
}
