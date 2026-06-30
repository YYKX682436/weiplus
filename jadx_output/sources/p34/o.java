package p34;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f351686a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f351687b = new java.util.HashMap();

    public static void a(java.lang.String str) {
        long currentTimeMillis;
        java.util.HashMap hashMap;
        java.lang.Boolean bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkInit", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
            currentTimeMillis = java.lang.System.currentTimeMillis();
            hashMap = f351687b;
            bool = (java.lang.Boolean) hashMap.get(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdLocalStoreage", "checkInit, exp=" + th6.toString());
        }
        if (hashMap.containsKey(str) && bool != null && bool.booleanValue()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInit", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        try {
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("sns_ad_mmkv").getString(str, "");
            if (!android.text.TextUtils.isEmpty(string)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.String optString = jSONObject.optString(next);
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (optString == null) {
                        optString = "";
                    }
                    if (!android.text.TextUtils.isEmpty(next)) {
                        hashMap2.put(next, optString);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("SnsAdLocalStoreage", "checkInit, snsId=" + str + ", value=" + string + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("SnsAdLocalStoreage", "checkInit exp=" + th7.toString());
        }
        f351686a.put(str, hashMap2);
        hashMap.put(str, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInit", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }

    public static void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearCache", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        com.tencent.mars.xlog.Log.i("SnsAdLocalStoreage", "clearCache");
        java.util.HashMap hashMap = f351686a;
        synchronized (hashMap) {
            try {
                hashMap.clear();
                f351687b.clear();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCache", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCache", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }

    public static java.lang.String c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        java.lang.String d17 = d("", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        return d17;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdLocalStoreage", "getAdValue, exp=" + th6.toString());
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = "default_snsid_123456";
        }
        java.util.HashMap hashMap = f351686a;
        synchronized (hashMap) {
            try {
                a(str);
                java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(str);
                if (hashMap2 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                    return "";
                }
                java.lang.String str3 = (java.lang.String) hashMap2.get(str2);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str3 == null) {
                    str3 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                return str3;
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            }
        }
    }

    public static java.lang.String e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdValueMultiprocess", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.x2.n() ? c(str) : com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getAdValue("", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdValueMultiprocess", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        return c17;
    }

    public static void f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveAdKV", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.HashMap hashMap = (java.util.HashMap) f351686a.get(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mapToJsonStr", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            java.lang.String str2 = "{}";
            if (hashMap == null || hashMap.size() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mapToJsonStr", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            } else {
                try {
                    str2 = new org.json.JSONObject(hashMap).toString();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mapToJsonStr", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                } catch (java.lang.Throwable unused) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mapToJsonStr", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                }
            }
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("sns_ad_mmkv");
            M.getClass();
            M.putString(str, str2).apply();
            com.tencent.mars.xlog.Log.i("SnsAdLocalStoreage", "saveAdKV, snsId=" + str + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", value=" + str2);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdLocalStoreage", "saveAdKV, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveAdKV", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }

    public static void g(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        h("", str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }

    public static void h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdLocalStoreage", "setAdValue, exp=" + th6.toString());
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = "default_snsid_123456";
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        java.util.HashMap hashMap = f351686a;
        synchronized (hashMap) {
            try {
                a(str);
                java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(str);
                if (hashMap2 == null) {
                    hashMap2 = new java.util.HashMap();
                }
                hashMap2.put(str2, str3);
                f(str);
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            }
        }
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdValueMultiprocess", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            g(str, str2);
        } else {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().setAdValue("", str, str2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdValueMultiprocess", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }
}
