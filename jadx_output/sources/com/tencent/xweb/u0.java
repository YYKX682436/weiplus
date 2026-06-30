package com.tencent.xweb;

/* loaded from: classes13.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f220599a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.xweb.f1 f220600b = com.tencent.xweb.f1.WV_KIND_NONE;

    public boolean a() {
        return by5.d4.e().getBoolean("bEnableLocalDebug", false);
    }

    public com.tencent.xweb.m b(java.lang.String str) {
        com.tencent.xweb.m mVar = com.tencent.xweb.m.none;
        try {
            android.content.SharedPreferences e17 = by5.d4.e();
            if (e17 == null) {
                return mVar;
            }
            java.lang.String string = e17.getString("force_use_office_reader_" + str.toLowerCase(), "");
            if (string == null) {
                return mVar;
            }
            if (!string.isEmpty()) {
                try {
                } catch (java.lang.Throwable unused) {
                    return mVar;
                }
            }
            return com.tencent.xweb.m.valueOf(string);
        } catch (java.lang.Throwable th6) {
            by5.c4.d("WebDebugCfg", "getForceUseOfficeReader error", th6);
            return mVar;
        }
    }

    public com.tencent.xweb.f1 c(java.lang.String str) {
        android.content.SharedPreferences e17;
        com.tencent.xweb.f1 f1Var = com.tencent.xweb.f1.WV_KIND_NONE;
        if (str == null || str.isEmpty() || this.f220599a == null || (e17 = by5.d4.e()) == null) {
            return f1Var;
        }
        java.lang.String string = e17.getString("HardCodeWebView".concat(str), "");
        if (string != null && !string.isEmpty()) {
            by5.c4.f("WebDebugCfg", "has hardcode type:".concat(string));
        }
        if ((string == null || string.isEmpty() || string.equals("WV_KIND_NONE")) && (string = e17.getString("ABTestWebView".concat(str), "")) != null && !string.isEmpty()) {
            by5.c4.f("WebDebugCfg", "has abtest type:".concat(string));
        }
        if (string == null || string.isEmpty()) {
            this.f220600b = f1Var;
        } else {
            try {
                this.f220600b = com.tencent.xweb.f1.valueOf(string);
            } catch (java.lang.Throwable unused) {
                this.f220600b = f1Var;
            }
        }
        return this.f220600b;
    }

    public com.tencent.xweb.f1 d(java.lang.String str, boolean z17) {
        android.content.SharedPreferences e17;
        com.tencent.xweb.f1 f1Var = com.tencent.xweb.f1.WV_KIND_NONE;
        if (str == null || str.isEmpty() || this.f220599a == null || (e17 = by5.d4.e()) == null) {
            return f1Var;
        }
        java.lang.String string = z17 ? e17.getString("ABTestWebView".concat(str), "") : e17.getString("HardCodeWebView".concat(str), "");
        if (string == null || string.isEmpty()) {
            this.f220600b = f1Var;
        } else {
            try {
                this.f220600b = com.tencent.xweb.f1.valueOf(string);
            } catch (java.lang.Throwable unused) {
                this.f220600b = f1Var;
            }
        }
        return this.f220600b;
    }

    public synchronized void e(android.content.Context context) {
        if (this.f220599a != null) {
            return;
        }
        by5.c4.g("WebDebugCfg", "load start");
        android.content.Context b17 = org.xwalk.core.XWalkEnvironment.b(context);
        this.f220599a = b17;
        by5.d4.h(b17);
        by5.c4.g("WebDebugCfg", "load end");
    }

    public void f(java.lang.String str, com.tencent.xweb.f1 f1Var) {
        if (this.f220599a == null || str == null || str.isEmpty()) {
            return;
        }
        by5.c4.f("WebDebugCfg", "setABTestWebViewKind, module:" + str + ", kind:" + f1Var.toString());
        if (f1Var == com.tencent.xweb.f1.WV_KIND_NONE) {
            by5.d4.e().edit().remove("ABTestWebView".concat(str)).commit();
        } else {
            by5.d4.e().edit().putString("ABTestWebView".concat(str), f1Var.toString()).commit();
        }
    }

    public void g(boolean z17) {
        by5.d4.e().edit().putBoolean("bEnableCheckStorage", z17).commit();
    }

    public void h(boolean z17) {
        by5.d4.e().edit().putBoolean("bEnableCheckThread", z17).commit();
    }

    public void i(boolean z17) {
        by5.d4.e().edit().putBoolean("bEnableLocalDebug", z17).commit();
    }

    public java.lang.String j(java.lang.String[] strArr, com.tencent.xweb.m mVar) {
        android.content.SharedPreferences e17;
        android.content.SharedPreferences.Editor edit;
        if (strArr == null || strArr.length == 0 || (e17 = by5.d4.e()) == null || (edit = e17.edit()) == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            java.lang.String[] strArr2 = com.tencent.xweb.n.f220343c;
            for (int i17 = 0; i17 < 9; i17++) {
                java.lang.String str2 = strArr2[i17];
                if (str2.equalsIgnoreCase(str)) {
                    edit.putString("force_use_office_reader_" + str.toLowerCase(), mVar.toString());
                    sb6.append(str2);
                    sb6.append(",");
                }
            }
        }
        if (edit.commit()) {
            return sb6.toString();
        }
        return "";
    }

    public void k(java.lang.String str, com.tencent.xweb.f1 f1Var) {
        if (this.f220599a == null || str == null || str.isEmpty()) {
            return;
        }
        by5.c4.f("WebDebugCfg", "setHardCodeWebViewKind, module:" + str + ", kind:" + f1Var.toString());
        if (f1Var == com.tencent.xweb.f1.WV_KIND_NONE) {
            by5.d4.e().edit().remove("HardCodeWebView".concat(str)).commit();
        } else {
            by5.d4.e().edit().putString("HardCodeWebView".concat(str), f1Var.toString()).commit();
        }
    }

    public void l(boolean z17) {
        by5.d4.e().edit().putBoolean("bRemoteDebugStarted", z17).commit();
    }

    public void m(java.lang.String str) {
        if (str == null) {
            by5.d4.e().edit().remove("bRemoteDebugToken").commit();
        } else {
            by5.d4.e().edit().putString("bRemoteDebugToken", str).commit();
        }
    }
}
