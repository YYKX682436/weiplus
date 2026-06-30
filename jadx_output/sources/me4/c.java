package me4;

/* loaded from: classes11.dex */
public abstract class c {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String trim = str.trim();
        if (android.text.TextUtils.isEmpty(trim) || android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return "";
        }
        try {
            java.lang.String g17 = kk.k.g((trim.toLowerCase() + "_" + str2).getBytes(com.tencent.mapsdk.internal.rv.f51270c));
            if (!android.text.TextUtils.isEmpty(g17)) {
                java.lang.String str3 = "waid" + g17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidHelper", "getAppWaid, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return "";
    }

    public static synchronized java.lang.String b(java.lang.String str) {
        java.lang.String a17;
        synchronized (me4.c.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doGetAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                a17 = a(str, g());
                com.tencent.mars.xlog.Log.i("ad.waid.WaidHelper", "doGetAppWaid pkg=" + str + ", appWaid=" + a17 + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doGetAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("ad.waid.WaidHelper", "doGetAppWaid exp=" + th6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doGetAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                return "";
            }
        }
        return a17;
    }

    public static java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dumpKV", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("ad_id_kv_pref");
            java.lang.String[] b17 = M.b();
            if (b17 != null && b17.length > 0) {
                for (java.lang.String str : b17) {
                    jSONObject.put(str, M.getString(str, ""));
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidHelper", "dumpKV exp=" + th6.toString());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpKV", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return jSONObject2;
    }

    public static java.lang.String d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInnerExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        try {
            r5 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_waid_inner_switch, 1) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInnerExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidHelper", "isInnerExptWaidEnable, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInnerExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        }
        if (r5) {
            java.lang.String b17 = b(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return b17;
        }
        com.tencent.mars.xlog.Log.w("ad.waid.WaidHelper", "getAppWaid, isInnerExptWaidEnable==false");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return "";
    }

    public static java.lang.String e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppWaidKey", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appWaid_");
        java.lang.String str = android.os.Build.BRAND;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String replace = str.replace(" ", "_");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        sb6.append(replace);
        sb6.append("_");
        java.lang.String m17 = wo.w0.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        java.lang.String replace2 = m17.replace(" ", "_");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        sb6.append(replace2);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppWaidKey", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return sb7;
    }

    public static int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKVCount", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        int i17 = 0;
        try {
            java.lang.String[] b17 = com.tencent.mm.sdk.platformtools.o4.M("ad_id_kv_pref").b();
            if (b17 != null) {
                i17 = b17.length;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKVCount", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return i17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidHelper", "getKVCount exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKVCount", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return 0;
        }
    }

    public static java.lang.String g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRawWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        try {
            java.lang.String e17 = e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("ad_id_kv_pref").getString(e17, "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            java.lang.String Kc = fo3.s.INSTANCE.Kc();
            com.tencent.mars.xlog.Log.i("ad.waid.WaidHelper", "getRawWaid, key=" + e17 + ", wxWaid=" + Kc + ", localWaid=" + string);
            int i17 = 1;
            if (android.text.TextUtils.isEmpty(string) && !android.text.TextUtils.isEmpty(Kc)) {
                k(e17, Kc);
                java.lang.String c17 = c();
                int f17 = f();
                com.tencent.mars.xlog.Log.w("ad.waid.WaidHelper", "device changed, update localWaid, key=" + e17 + ", kvCount=" + f17);
                if (f17 > 1) {
                    me4.f.b(c17);
                }
                string = Kc;
            }
            if (!android.text.TextUtils.isEmpty(string) && !android.text.TextUtils.isEmpty(Kc) && !string.equals(Kc)) {
                boolean i18 = i();
                com.tencent.mars.xlog.Log.i("ad.waid.WaidHelper", "waid Changed, key=" + e17 + ", localWaid=" + string + ", wxWaid=" + Kc + ", isNeedUpdate=" + i18);
                if (i18) {
                    k(e17, Kc);
                    string = Kc;
                }
                int f18 = f();
                if (!i18) {
                    i17 = 0;
                }
                me4.f.e(string, Kc, i17, f18);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRawWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return string;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidHelper", "getRawWaid exp=" + android.util.Log.getStackTraceString(th6));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRawWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return "";
        }
    }

    public static boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_waid_switch, 0) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidHelper", "isExptWaidEnable, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return false;
        }
    }

    public static boolean i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExptWaidNeedUpdate", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_waid_update_switch, 0) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptWaidNeedUpdate", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidHelper", "isExptWaidNeedUpdate, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptWaidNeedUpdate", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return false;
        }
    }

    public static boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWxEnvInitDone", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        boolean z17 = gm0.j1.i().f273218k && gm0.j1.b().m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWxEnvInitDone", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return z17;
    }

    public static void k(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("ad_id_kv_pref");
        int f17 = f();
        if (f17 >= 10) {
            M.clear();
            com.tencent.mars.xlog.Log.e("ad.waid.WaidHelper", "saveKVString, clearKv, kvCOunt=" + f17);
        }
        M.getClass();
        M.putString(str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
    }
}
