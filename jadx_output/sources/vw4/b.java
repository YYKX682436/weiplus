package vw4;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final vw4.b f441212a = new vw4.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f441213b;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f441213b = hashSet;
        hashSet.add("https://open.weixin.qq.com");
    }

    public final void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Set set = f441213b;
        synchronized (set) {
            ((java.util.HashSet) set).add(str);
        }
        com.tencent.mars.xlog.Log.i("AdH5URLManager", "addDisableUrl, url=" + str);
    }

    public final boolean b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        if (!(!(str == null || str.length() == 0) && (r26.i0.y(str, "http", false) || r26.i0.y(str, "https", false)))) {
            return true;
        }
        java.util.Set set = f441213b;
        synchronized (set) {
            if (((java.util.HashSet) set).contains(str)) {
                return true;
            }
            java.util.Iterator it = ((java.util.HashSet) set).iterator();
            while (it.hasNext()) {
                if (r26.i0.A((java.lang.String) it.next(), str, false, 2, null)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean c() {
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_intercept_high_risk_h5, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "isInterceptEnabled, expt=" + Ni);
            return Ni > 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewHighRiskAdH5Interceptor", "isInterceptEnabled, exp=" + th6);
            return false;
        }
    }

    public final boolean d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return r26.n0.D(str, "adH5Redirect=1", false, 2, null);
    }
}
