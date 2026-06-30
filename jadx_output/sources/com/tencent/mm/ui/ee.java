package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public abstract class ee {
    public static boolean a(android.content.Context context) {
        if (!fp.h.c(30)) {
            return false;
        }
        android.graphics.Rect bounds = ((android.view.WindowManager) context.getSystemService("window")).getCurrentWindowMetrics().getBounds();
        float height = bounds.height();
        float width = bounds.width();
        return ((height > width ? 1 : (height == width ? 0 : -1)) > 0 ? height / width : width / height) <= 1.67f;
    }

    public static boolean b(int i17) {
        com.huawei.easygo.sdk.EasyGo easyGo = com.tencent.mm.ui.fl.f208605a;
        if (easyGo != null && com.tencent.mm.ui.fl.a(easyGo, i17) == 1) {
            return true;
        }
        com.miui.easygo.sdk.EasyGo easyGo2 = com.tencent.mm.ui.w9.f211214a;
        if (easyGo2 != null && com.tencent.mm.ui.w9.a(easyGo2, i17) == 1) {
            return true;
        }
        if (com.tencent.mm.ui.rk.f209754b != null && (com.tencent.mm.ui.bk.g0() || com.tencent.mm.ui.bk.f0()) && com.tencent.mm.ui.rk.a(i17) == 1) {
            return true;
        }
        return com.tencent.mm.ui.eg.f208400a != null && com.tencent.mm.ui.eg.a(i17) == 1;
    }

    public static void c(int i17) {
        if ((com.tencent.mm.ui.bk.U() || com.tencent.mm.ui.bk.S()) && com.tencent.mm.ui.fl.f208605a != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:landMode", i17);
                com.tencent.mars.xlog.Log.i("EasyGo", " setLandscapeMode ret " + com.tencent.mm.ui.fl.f208605a.invokeSync("magicwindow", "setLandScapeMode", jSONObject, null).code + " mode: " + i17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("EasyGo", e17.getMessage());
            }
        }
        if (com.tencent.mm.ui.bk.S() && com.tencent.mm.ui.v7.f211108a != null && com.tencent.mm.ui.v7.c()) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("@int:landMode", i17);
                com.tencent.mars.xlog.Log.i("EasyGo", " setLandscapeMode ret " + com.tencent.mm.ui.v7.f211108a.invokeSync("magicwindow", "setLandScapeMode", jSONObject2, null).code + " mode: " + i17);
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.e("EasyGo", e18.getMessage());
            }
        }
    }

    public static void d(int i17) {
        com.tencent.mm.ui.fl.f(i17);
        com.tencent.mm.ui.v7.e(i17);
        com.tencent.mm.ui.w9.d(i17);
        if ((com.tencent.mm.ui.bk.g0() || com.tencent.mm.ui.bk.f0()) && com.tencent.mm.ui.rk.f209754b != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:loginStatus", i17);
                com.tencent.mm.ui.rk.f209754b.invoke(com.tencent.mm.ui.rk.f209753a, "com.tencent.mm", "setLoginStatus", jSONObject.toString(), null);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException | org.json.JSONException unused) {
            }
        }
        if (com.tencent.mm.ui.eg.f208400a == null || !com.tencent.mm.ui.eg.e()) {
            return;
        }
        if ((com.tencent.mm.ui.bk.Y() || com.tencent.mm.ui.bk.Z()) && com.tencent.mm.ui.eg.b()) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("@int:loginStatus", i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.OPPOUtil", " setLoginStatus ret " + com.tencent.mm.ui.eg.f208400a.a("compactWindow", "setLoginStatus", jSONObject2, null).f393558a);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OPPOUtil", e17.getMessage());
            }
        }
    }

    public static void e(int i17, int i18) {
        if ((com.tencent.mm.ui.bk.U() || com.tencent.mm.ui.bk.R()) && com.tencent.mm.ui.fl.f208605a != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:nightMode", i17);
                com.tencent.mars.xlog.Log.i("EasyGo", " setNightMode ret " + com.tencent.mm.ui.fl.f208605a.invokeSync("magicwindow", "setNightMode", jSONObject, null).code + " mode: " + i17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("EasyGo", e17.getMessage());
            }
        }
        if (com.tencent.mm.ui.bk.S() && com.tencent.mm.ui.v7.f211108a != null && com.tencent.mm.ui.v7.c()) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("@int:nightMode", i17);
                com.tencent.mars.xlog.Log.i("EasyGo", " setNightMode ret " + com.tencent.mm.ui.v7.f211108a.invokeSync("magicwindow", "setNightMode", jSONObject2, null).code + " mode: " + i17);
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.e("EasyGo", e18.getMessage());
            }
        }
        if ((com.tencent.mm.ui.bk.Y() || com.tencent.mm.ui.bk.Z()) && com.tencent.mm.ui.eg.f208400a != null && com.tencent.mm.ui.eg.e() && com.tencent.mm.ui.eg.b()) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("@int:taskId", i18);
                jSONObject3.put("@int:customUIMode", i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.OPPOUtil", " setNightMode ret " + com.tencent.mm.ui.eg.f208400a.a("compactWindow", "setCustomUIMode", jSONObject3, null).f393558a + " mode: " + i17);
            } catch (org.json.JSONException e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OPPOUtil", e19.getMessage());
            }
        }
        if (com.tencent.mm.ui.bk.f0() || com.tencent.mm.ui.bk.g0()) {
            try {
                if (com.tencent.mm.ui.rk.f209754b == null) {
                    return;
                }
                java.lang.Class<?> cls = java.lang.Class.forName("android.app.Application");
                java.lang.reflect.Method method = cls.getMethod("getApplicationInstance", new java.lang.Class[0]);
                java.lang.reflect.Method method2 = cls.getMethod("setWechatDarkModeStatus", java.lang.Integer.TYPE);
                method.setAccessible(true);
                method2.setAccessible(true);
                method2.invoke(method.invoke(null, new java.lang.Object[0]), java.lang.Integer.valueOf(i17));
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("@int:darkModeStatus", i17);
                com.tencent.mm.ui.rk.f209754b.invoke(com.tencent.mm.ui.rk.f209753a, "com.tencent.mm", "setWechatDarkModeStatus", jSONObject4.toString(), null);
            } catch (java.lang.Exception e27) {
                e27.toString();
            }
        }
    }

    public static void f(int i17, com.tencent.mm.ui.de deVar) {
        if (com.tencent.mm.ui.bk.z(i17)) {
            com.tencent.mm.ui.fl.g(com.tencent.mm.ui.fl.f208605a, i17, 0);
            com.tencent.mm.ui.v7.f(com.tencent.mm.ui.v7.f211108a, i17, 0);
            com.tencent.mm.ui.w9.e(com.tencent.mm.ui.w9.f211214a, i17, 0);
            com.tencent.mm.ui.rk.c(i17, 0);
            com.tencent.mm.ui.eg.f(i17, 0);
            if (deVar != null) {
                deVar.b();
                return;
            }
            return;
        }
        com.tencent.mm.ui.fl.g(com.tencent.mm.ui.fl.f208605a, i17, 2);
        com.tencent.mm.ui.v7.f(com.tencent.mm.ui.v7.f211108a, i17, 2);
        com.tencent.mm.ui.w9.e(com.tencent.mm.ui.w9.f211214a, i17, 2);
        com.tencent.mm.ui.rk.c(i17, 2);
        com.tencent.mm.ui.eg.f(i17, 2);
        if (deVar != null) {
            deVar.a();
        }
    }

    public static void g(int i17, int i18) {
        com.tencent.mm.ui.fl.g(com.tencent.mm.ui.fl.f208605a, i17, i18);
        com.tencent.mm.ui.v7.f(com.tencent.mm.ui.v7.f211108a, i17, i18);
        com.tencent.mm.ui.w9.e(com.tencent.mm.ui.w9.f211214a, i17, i18);
        com.tencent.mm.ui.rk.c(i17, i18);
        com.tencent.mm.ui.eg.f(i17, i18);
    }
}
