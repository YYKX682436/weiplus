package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class b6 {

    /* renamed from: p, reason: collision with root package name */
    public static int f182796p;

    /* renamed from: q, reason: collision with root package name */
    public static int f182797q;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.a6 f182798a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.y5 f182799b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.z5 f182800c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.m5 f182801d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.q3 f182802e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.w5 f182803f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.q5 f182804g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.v5 f182805h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.r5 f182806i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.p5 f182807j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.c5 f182808k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.u4 f182809l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.j5 f182810m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.h4 f182811n;

    /* renamed from: o, reason: collision with root package name */
    public final int f182812o = (int) (java.lang.System.currentTimeMillis() / 1000);

    public static void a(java.lang.String str, java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            arrayList.add(java.lang.String.valueOf(obj));
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.l(11215, arrayList);
        if (str == null || !str.startsWith("official_mall")) {
            return;
        }
        g0Var.l(14919, arrayList);
    }

    public static java.lang.String c() {
        android.net.NetworkInfo activeNetworkInfo;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "no";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        activeNetworkInfo.getExtraInfo();
        activeNetworkInfo.getType();
        activeNetworkInfo.getExtraInfo();
        return activeNetworkInfo.getExtraInfo() != null ? activeNetworkInfo.getExtraInfo().toLowerCase() : "no";
    }

    public static int e() {
        if (com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return 5;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is5G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return 7;
        }
        switch (com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            case -1:
                return 255;
            case 0:
                return 1;
            case 1:
            case 6:
            case 8:
                return 3;
            case 2:
            case 5:
            case 7:
                return 2;
            case 3:
            case 4:
                return 4;
            default:
                return 6;
        }
    }

    public static void l(long j17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1653L, j17, 1L, false);
    }

    public com.tencent.mm.plugin.webview.model.q5 b() {
        if (this.f182804g == null) {
            this.f182804g = new com.tencent.mm.plugin.webview.model.q5();
        }
        return this.f182804g;
    }

    public com.tencent.mm.plugin.webview.model.v5 d() {
        if (this.f182805h == null) {
            this.f182805h = new com.tencent.mm.plugin.webview.model.v5(this);
        }
        return this.f182805h;
    }

    public com.tencent.mm.plugin.webview.model.c5 f() {
        if (this.f182808k == null) {
            this.f182808k = new com.tencent.mm.plugin.webview.model.c5();
        }
        return this.f182808k;
    }

    public com.tencent.mm.plugin.webview.model.q3 g() {
        if (this.f182802e == null) {
            this.f182802e = new com.tencent.mm.plugin.webview.model.q3();
        }
        return this.f182802e;
    }

    public com.tencent.mm.plugin.webview.model.m5 h() {
        if (this.f182801d == null) {
            this.f182801d = new com.tencent.mm.plugin.webview.model.m5();
        }
        return this.f182801d;
    }

    public com.tencent.mm.plugin.webview.model.h4 i() {
        if (this.f182811n == null) {
            this.f182811n = new com.tencent.mm.plugin.webview.model.h4();
        }
        return this.f182811n;
    }

    public void j(java.lang.String str) {
        com.tencent.mm.plugin.webview.model.p5 p5Var = this.f182807j;
        if (p5Var != null) {
            try {
                if (p5Var.f183061a.containsKey(str)) {
                    p5Var.a(str, java.lang.Integer.valueOf(p5Var.f183061a.getInt(str) + 1));
                } else {
                    p5Var.a(str, 1);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void k() {
        if (this.f182800c == null) {
            this.f182800c = new com.tencent.mm.plugin.webview.model.z5(this);
        }
        com.tencent.mm.plugin.webview.model.z5 z5Var = this.f182800c;
        z5Var.getClass();
        int e17 = e();
        for (java.util.Map.Entry entry : z5Var.f183224a.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            long longValue = ((java.lang.Long) entry.getValue()).longValue();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(32L, 0L, 1L, true);
            if (longValue >= 0 && longValue <= 180000) {
                java.lang.String str2 = z5Var.f183226c;
                java.lang.Object[] objArr = new java.lang.Object[11];
                objArr[0] = 3;
                objArr[1] = java.lang.Long.valueOf(longValue);
                objArr[2] = java.lang.Integer.valueOf(e17);
                objArr[3] = str == null ? str : str.replace(",", "!");
                objArr[4] = 0;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = java.lang.Integer.valueOf(f182796p);
                objArr[8] = java.lang.Integer.valueOf(f182797q);
                objArr[9] = java.lang.Integer.valueOf(z5Var.f183225b);
                objArr[10] = z5Var.f183226c;
                a(str2, objArr);
                g0Var.idkeyStat(160L, 0L, 1L, false);
                if (-1 != cx4.a.b(longValue)) {
                    g0Var.idkeyStat(160L, cx4.a.b(longValue), 1L, false);
                }
                g0Var.idkeyStat(32L, 3L, 1L, true);
                g0Var.idkeyStat(32L, 7L, longValue, true);
                if (f182797q == 1) {
                    g0Var.idkeyStat(32L, 16L, 1L, true);
                    g0Var.idkeyStat(32L, 17L, longValue, true);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WebviewReporter", "WebviewOpenUrlReporter.report url : %s, cost time : %d, netType : %d, %d, %d, getA8KeyScene:%d, prePublishid:%s", str, java.lang.Long.valueOf(longValue), java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(f182796p), java.lang.Integer.valueOf(f182797q), java.lang.Integer.valueOf(z5Var.f183225b), z5Var.f183226c);
            }
        }
        com.tencent.mm.plugin.webview.model.m5 h17 = h();
        java.lang.String str3 = h17.f183019d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        try {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.webview.model.k5.f182989d.getClass(), new com.tencent.mm.plugin.webview.model.l5(h17));
        } catch (android.os.RemoteException e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebviewReporter", "invokeAsResult error, %s", e18);
        }
        com.tencent.mm.plugin.webview.model.q3 g17 = g();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(g17.f183071a)) {
            java.lang.String str4 = g17.f183071a;
            kotlin.jvm.internal.o.d(str4);
            if (r26.i0.y(str4, "wrd", false)) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("iswebviewreadtime=1&publishid=");
                stringBuffer.append(g17.f183071a);
                stringBuffer.append("&staytime=");
                stringBuffer.append(g17.f183073c);
                stringBuffer.append("&allstaytime=");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = g17.f183072b;
                stringBuffer.append(currentTimeMillis - j17);
                stringBuffer.append("&maxscrolly=");
                stringBuffer.append(g17.f183074d);
                stringBuffer.append("&totalscrolly=");
                stringBuffer.append(g17.f183075e);
                stringBuffer.append("&scene=");
                stringBuffer.append(g17.f183076f);
                stringBuffer.append("&entertime=");
                stringBuffer.append(j17);
                stringBuffer.append("&screenheight=");
                stringBuffer.append(i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a));
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("reportString", stringBuffer.toString());
                try {
                    com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.model.p3.f183060d.getClass(), null);
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebviewReporter", e19, "TopStory report", new java.lang.Object[0]);
                }
            }
        }
        if (this.f182799b == null) {
            this.f182799b = new com.tencent.mm.plugin.webview.model.y5(this);
        }
        com.tencent.mm.plugin.webview.model.y5 y5Var = this.f182799b;
        y5Var.getClass();
        int e27 = e();
        for (java.util.Map.Entry entry2 : y5Var.f183209a.entrySet()) {
            java.lang.String str5 = (java.lang.String) entry2.getKey();
            long longValue2 = ((java.lang.Long) entry2.getValue()).longValue();
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(32L, 2L, 1L, true);
            if (longValue2 == -1) {
                g0Var2.idkeyStat(32L, 13L, 1L, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebviewReporter", "WebviewGetA8keyReporter.report fail url : %s, netType : %d", str5, java.lang.Integer.valueOf(e27));
            }
            if (longValue2 >= 0 && longValue2 <= 60000) {
                java.lang.Object[] objArr2 = new java.lang.Object[11];
                objArr2[0] = 2;
                objArr2[1] = java.lang.Long.valueOf(longValue2);
                objArr2[2] = java.lang.Integer.valueOf(e27);
                objArr2[3] = str5 == null ? str5 : str5.replace(",", "!");
                objArr2[4] = 0;
                objArr2[5] = 0;
                objArr2[6] = 0;
                objArr2[7] = java.lang.Integer.valueOf(f182796p);
                objArr2[8] = java.lang.Integer.valueOf(f182797q);
                objArr2[9] = 0;
                objArr2[10] = null;
                a(null, objArr2);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebviewReporter", "WebviewGetA8keyReporter.report url : %s, cost time : %d, netType : %d, getA8KeyScene:%d, prePublishid:%s", str5, java.lang.Long.valueOf(longValue2), java.lang.Integer.valueOf(e27), 0, null);
                g0Var2.idkeyStat(32L, 6L, longValue2, true);
            }
        }
        com.tencent.mm.plugin.webview.model.v5 d17 = d();
        d17.getClass();
        int e28 = e();
        java.util.Iterator it = d17.f183152a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                for (java.util.Map.Entry entry3 : d17.f183153b.entrySet()) {
                    java.lang.String str6 = (java.lang.String) entry3.getKey();
                    long longValue3 = ((java.lang.Long) entry3.getValue()).longValue();
                    if (longValue3 < 0 || longValue3 > 180000) {
                        break;
                    }
                    java.lang.String str7 = d17.f183157f;
                    java.lang.Object[] objArr3 = new java.lang.Object[11];
                    objArr3[0] = 6;
                    objArr3[1] = java.lang.Long.valueOf(longValue3);
                    objArr3[2] = java.lang.Integer.valueOf(e28);
                    if (str6 != null) {
                        str6 = str6.replace(",", "!");
                    }
                    objArr3[3] = str6;
                    objArr3[4] = 0;
                    objArr3[5] = 0;
                    objArr3[6] = 0;
                    objArr3[7] = java.lang.Integer.valueOf(f182796p);
                    objArr3[8] = java.lang.Integer.valueOf(f182797q);
                    objArr3[9] = java.lang.Integer.valueOf(d17.f183156e);
                    objArr3[10] = d17.f183157f;
                    a(str7, objArr3);
                    if (f182796p == 1) {
                        com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var3.idkeyStat(32L, 20L, 1L, true);
                        g0Var3.idkeyStat(32L, 21L, longValue3, true);
                    }
                    com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var4.idkeyStat(32L, 10L, 1L, true);
                    g0Var4.idkeyStat(32L, 11L, longValue3, true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebviewReporter", "WebViewRenderReporter.report Render cost time : %d, netType : %d, coreType %d, httpType %d, getA8KeyScene:%d, prePublishid:%s", java.lang.Long.valueOf(longValue3), java.lang.Integer.valueOf(e28), java.lang.Integer.valueOf(f182796p), java.lang.Integer.valueOf(f182797q), java.lang.Integer.valueOf(d17.f183156e), d17.f183157f);
                }
            } else {
                java.util.Map.Entry entry4 = (java.util.Map.Entry) it.next();
                java.lang.String str8 = (java.lang.String) entry4.getKey();
                long longValue4 = ((java.lang.Long) entry4.getValue()).longValue();
                if (longValue4 < 0 || longValue4 > 180000) {
                    break;
                }
                java.lang.String str9 = d17.f183157f;
                java.lang.Object[] objArr4 = new java.lang.Object[11];
                objArr4[0] = 5;
                objArr4[1] = java.lang.Long.valueOf(longValue4);
                objArr4[2] = java.lang.Integer.valueOf(e28);
                if (str8 != null) {
                    str8 = str8.replace(",", "!");
                }
                objArr4[3] = str8;
                objArr4[4] = 0;
                objArr4[5] = 0;
                objArr4[6] = 0;
                objArr4[7] = java.lang.Integer.valueOf(f182796p);
                objArr4[8] = java.lang.Integer.valueOf(f182797q);
                objArr4[9] = java.lang.Integer.valueOf(d17.f183156e);
                objArr4[10] = d17.f183157f;
                a(str9, objArr4);
                if (f182796p == 1) {
                    com.tencent.mm.plugin.report.service.g0 g0Var5 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var5.idkeyStat(32L, 18L, 1L, true);
                    g0Var5.idkeyStat(32L, 19L, longValue4, true);
                }
                com.tencent.mm.plugin.report.service.g0 g0Var6 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var6.idkeyStat(32L, 8L, 1L, true);
                g0Var6.idkeyStat(32L, 9L, longValue4, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebviewReporter", "WebViewRenderReporter.report DomReady cost time : %d, netType : %d, coreType %d, httpType %d, getA8KeyScene:%d, prePublishid:%s", java.lang.Long.valueOf(longValue4), java.lang.Integer.valueOf(e28), java.lang.Integer.valueOf(f182796p), java.lang.Integer.valueOf(f182797q), java.lang.Integer.valueOf(d17.f183156e), d17.f183157f);
            }
        }
        com.tencent.mm.plugin.webview.model.q5 b17 = b();
        b17.getClass();
        int e29 = e();
        if (!b17.f183079b) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11575, b17.f183080c, 3, 1, java.lang.Integer.valueOf(e29));
        } else if (b17.f183078a) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11575, b17.f183080c, 1, 1, java.lang.Integer.valueOf(e29));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11575, b17.f183080c, 2, 1, java.lang.Integer.valueOf(e29));
        }
    }
}
