package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f160022a = com.tencent.mm.sdk.platformtools.x2.f193072b;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f160023b = {"http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/g/", "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/g/"};

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f160024c = {"http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyp) + "/", "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyp) + "/"};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f160025d = {"http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyv) + "/u/", "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyv) + "/ct/", "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyv) + "/u/", "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyv) + "/ct/"};

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f160026e = {"http://c.weixin.com/g/", "https://c.weixin.com/g/"};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f160027f = {"http://work.weixin.qq.com/m/", "https://work.weixin.qq.com/m/", "http://work.weixin.qq.com/gm/", "https://work.weixin.qq.com/gm/"};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f160028g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f160029h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f160030i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String[] f160031j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f160032k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f160033l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f160034m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f160035n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f160036o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f160037p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f160038q;

    static {
        java.lang.String[] strArr = {"https://wx.tenpay.com/f2f", "wxp://f2f", "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fye) + "/qr/", "https://payapp.wechatpay.cn/qr/", "https://payapp.wechatpay.cn/sjt/qr/", "https://payapp.weixin.qq.com/sjt/qr/"};
        f160028g = strArr;
        f160029h = new java.lang.String[]{strArr[0], strArr[1], strArr[2], "weixin://wxpay/bizpayurl", "wxp://wbf2f", "weixin://wxpay/bindurl", "wxhb://f2f", strArr[3]};
        f160030i = new java.lang.String[]{"m", "n"};
        f160031j = new java.lang.String[]{"https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/f/", "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/f/"};
        f160032k = jd0.y1.f299129a;
        f160033l = jd0.y1.f299130b;
        f160034m = jd0.y1.f299131c;
        f160035n = jd0.y1.f299132d;
        f160036o = 1;
        f160037p = 2;
        f160038q = 4;
    }

    public static java.util.Set a() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(f160032k);
        hashSet.add(f160033l);
        hashSet.add(f160034m);
        hashSet.add(f160035n);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ip.e a17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a();
            java.lang.String b17 = a17 != null ? a17.b(1, "ScanCode", "brandCodePrefix") : "";
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                java.lang.String[] split = b17.split("\\|");
                for (int i17 = 0; i17 < split.length; i17++) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(split[i17])) {
                        hashSet.add(split[i17]);
                    }
                }
            }
        }
        return hashSet;
    }

    public static java.util.Set b() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("k");
        hashSet.add("l");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ip.e a17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a();
            java.lang.String b17 = a17 != null ? a17.b(1, "ScanCode", "weAppCodePrefix") : "";
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                java.lang.String[] split = b17.split("\\|");
                for (int i17 = 0; i17 < split.length; i17++) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(split[i17])) {
                        hashSet.add(split[i17]);
                    }
                }
            }
        }
        return hashSet;
    }

    public static boolean c(int i17, java.lang.String str, boolean z17, boolean z18) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_webview_qrcode_allowed_wx_code, 7);
        if (o(i17, str) && f(Ni, z17, z18)) {
            return true;
        }
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_webview_qrcode_allowed_personal, 3);
        if (l(i17, str) && f(Ni2, z17, z18)) {
            return true;
        }
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_webview_qrcode_allowed_group_chat, 3);
        if (h(i17, str) && f(Ni3, z17, z18)) {
            return true;
        }
        int Ni4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_webview_qrcode_allowed_pay, 0);
        if (j(i17, str) && f(Ni4, z17, z18)) {
            return true;
        }
        int Ni5 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_webview_qrcode_allowed_wework_chat, 3);
        if (n(i17, str) && f(Ni5, z17, z18)) {
            return true;
        }
        int Ni6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_webview_qrcode_allowed_wework_group_chat, 3);
        if (i(i17, str, false) && f(Ni6, z17, z18)) {
            return true;
        }
        int Ni7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_webview_qrcode_allowed_brand_v2, 3);
        if (d(i17, str) && f(Ni7, z17, z18)) {
            return true;
        }
        int Ni8 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_webview_qrcode_allowed_finder, 0);
        if (g(i17, str) && f(Ni8, z17, z18)) {
            return true;
        }
        return f(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_webview_qrcode_allowed_other, 0), z17, z18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (((com.tencent.mm.ipcinvoker.y.b(r3) || ((java.util.concurrent.ConcurrentHashMap) r5.f68390c).get(r3) == null) ? false : true) == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.HashSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(int r5, java.lang.String r6) {
        /*
            r0 = 19
            r1 = 0
            if (r5 == r0) goto L6
            return r1
        L6:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r5 == 0) goto Ld
            return r1
        Ld:
            boolean r5 = com.tencent.mm.sdk.platformtools.x2.n()
            r0 = 1
            if (r5 != 0) goto L71
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            java.lang.String r3 = com.tencent.mm.plugin.scanner.z0.f160022a
            if (r5 != r2) goto L3e
            com.tencent.mm.ipcinvoker.q r5 = com.tencent.mm.ipcinvoker.q.b()
            r5.getClass()
            boolean r2 = com.tencent.mm.ipcinvoker.y.b(r3)
            if (r2 == 0) goto L2e
            goto L3a
        L2e:
            java.util.Map r5 = r5.f68390c
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r5 = r5.get(r3)
            if (r5 == 0) goto L3a
            r5 = r0
            goto L3b
        L3a:
            r5 = r1
        L3b:
            if (r5 != 0) goto L3e
            goto L71
        L3e:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r2 = 0
            java.lang.Class<com.tencent.mm.plugin.scanner.x0> r4 = com.tencent.mm.plugin.scanner.x0.class
            android.os.Parcelable r2 = com.tencent.mm.ipcinvoker.d0.f(r3, r2, r4)
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = ""
            if (r2 == 0) goto L56
            java.lang.String r4 = "brandCodePrefix"
            java.lang.String r3 = r2.getString(r4, r3)
        L56:
            java.lang.String r2 = "\\|"
            java.lang.String[] r2 = r3.split(r2)
            r3 = r1
        L5d:
            int r4 = r2.length
            if (r3 >= r4) goto L75
            r4 = r2[r3]
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 == 0) goto L69
            goto L6e
        L69:
            r4 = r2[r3]
            r5.add(r4)
        L6e:
            int r3 = r3 + 1
            goto L5d
        L71:
            java.util.Set r5 = a()
        L75:
            java.util.Iterator r5 = r5.iterator()
        L79:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L79
            return r0
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.z0.d(int, java.lang.String):boolean");
    }

    public static boolean e(int i17, java.lang.String str) {
        java.lang.String trim = str.trim();
        return o(i17, trim) || d(i17, trim) || h(i17, trim) || l(i17, trim) || n(i17, trim) || k(i17, trim) || m(i17, trim) || g(i17, trim);
    }

    public static boolean f(int i17, boolean z17, boolean z18) {
        return z17 ? (i17 & f160037p) != 0 : z18 ? (i17 & f160038q) != 0 : (i17 & f160036o) != 0;
    }

    public static boolean g(int i17, java.lang.String str) {
        if ((i17 != 19 && i17 != 23) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        for (java.lang.String str2 : f160031j) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(int i17, java.lang.String str) {
        if (i17 != 19 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        for (java.lang.String str2 : f160023b) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(int i17, java.lang.String str, boolean z17) {
        if (i17 != 19 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        for (java.lang.String str2 : f160026e) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        if (z17) {
            for (java.lang.String str3 : f160027f) {
                if (str.startsWith(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j(int i17, java.lang.String str) {
        if (m(i17, str)) {
            return true;
        }
        if (i17 != 19 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        for (java.lang.String str2 : f160029h) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(int i17, java.lang.String str) {
        if (i17 != 19 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        for (java.lang.String str2 : f160028g) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(int i17, java.lang.String str) {
        if (i17 != 19 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        for (java.lang.String str2 : f160024c) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(int i17, java.lang.String str) {
        if (i17 != 22 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        for (java.lang.String str2 : f160030i) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(int i17, java.lang.String str) {
        if (i17 != 19 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        for (java.lang.String str2 : f160025d) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (((com.tencent.mm.ipcinvoker.y.b(r3) || ((java.util.concurrent.ConcurrentHashMap) r5.f68390c).get(r3) == null) ? false : true) == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.HashSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o(int r5, java.lang.String r6) {
        /*
            r0 = 22
            r1 = 0
            if (r5 == r0) goto L6
            return r1
        L6:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r5 == 0) goto Ld
            return r1
        Ld:
            boolean r5 = com.tencent.mm.sdk.platformtools.x2.n()
            r0 = 1
            if (r5 != 0) goto L73
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            java.lang.String r3 = com.tencent.mm.plugin.scanner.z0.f160022a
            if (r5 != r2) goto L3e
            com.tencent.mm.ipcinvoker.q r5 = com.tencent.mm.ipcinvoker.q.b()
            r5.getClass()
            boolean r2 = com.tencent.mm.ipcinvoker.y.b(r3)
            if (r2 == 0) goto L2e
            goto L3a
        L2e:
            java.util.Map r5 = r5.f68390c
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r5 = r5.get(r3)
            if (r5 == 0) goto L3a
            r5 = r0
            goto L3b
        L3a:
            r5 = r1
        L3b:
            if (r5 != 0) goto L3e
            goto L73
        L3e:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r2 = 0
            java.lang.Class<com.tencent.mm.plugin.scanner.y0> r4 = com.tencent.mm.plugin.scanner.y0.class
            android.os.Parcelable r2 = com.tencent.mm.ipcinvoker.d0.f(r3, r2, r4)
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = ""
            if (r2 == 0) goto L57
            java.lang.String r4 = "wxCodePrefix"
            java.lang.String r3 = r2.getString(r4, r3)
        L57:
            java.lang.String r2 = "|"
            java.lang.String[] r2 = r3.split(r2)
            r3 = r1
        L5f:
            int r4 = r2.length
            if (r3 >= r4) goto L77
            r4 = r2[r3]
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 == 0) goto L6b
            goto L70
        L6b:
            r4 = r2[r3]
            r5.add(r4)
        L70:
            int r3 = r3 + 1
            goto L5f
        L73:
            java.util.Set r5 = b()
        L77:
            java.util.Iterator r5 = r5.iterator()
        L7b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L8e
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L7b
            return r0
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.z0.o(int, java.lang.String):boolean");
    }
}
