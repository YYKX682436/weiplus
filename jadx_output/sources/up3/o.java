package up3;

/* loaded from: classes12.dex */
public final class o implements tp3.c {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f429838d = tp3.b.a("\u0098¿´¢¾\u009f «ã\u0088ª¼ª¢\u008f¥±§\u008b¯¦« ");

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f429839e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f429840f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f429841g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f429842h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f429843i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f429844m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f429845n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f429846o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Map f429847p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Map f429848q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f429849r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f429850s;

    static {
        java.lang.String a17 = tp3.b.a("ù³¼¶ý¨¤¯¨¦¦¹¿\u00ad¦è¡¥µ¡«");
        f429839e = a17;
        f429840f = a17 + tp3.b.a("êá²¦²¦§·");
        f429841g = a17 + tp3.b.a("åà«£³·®°¨");
        f429842h = a17 + tp3.b.a("æí¤ª© \u0099µ¥¦§»");
        f429843i = a17 + tp3.b.a("åàµ´¨£¤±°");
        f429844m = a17 + tp3.b.a("çî\u00ad\u00ad©£\u0098° ¶«");
        java.lang.String a18 = tp3.b.a("·¨¤ª");
        f429845n = a18;
        java.lang.String a19 = tp3.b.a(" ¬º");
        f429846o = a19;
        java.util.Comparator comparator = java.lang.String.CASE_INSENSITIVE_ORDER;
        java.util.TreeMap treeMap = new java.util.TreeMap(comparator);
        f429847p = treeMap;
        java.util.TreeMap treeMap2 = new java.util.TreeMap(comparator);
        f429848q = treeMap2;
        f429849r = new com.tencent.mm.sdk.platformtools.n3(tp3.b.a("©§¨¦¦¹¿\u00ad¦ë¡¥µ¡«"));
        f429850s = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName();
        treeMap.put(a18, new up3.d());
        treeMap.put(a19, new up3.e());
        treeMap2.put(tp3.b.a("¦¤µ¢í ²¨"), new up3.f());
        treeMap2.put(tp3.b.a("©¥¶£ê¯¥§»"), new up3.g());
        treeMap2.put(tp3.b.a("©¥¶£ê¶¥§»"), new up3.h());
        treeMap2.put(tp3.b.a("§§´¥ì±¬"), new up3.j());
        treeMap2.put(tp3.b.a("\u00ad ²°"), new up3.k());
        treeMap2.put(tp3.b.a("´\u00ad ²°"), new up3.l());
        treeMap2.put(tp3.b.a("µ¾³ì±¬"), new up3.m());
    }

    public o() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = up3.n.f429833a;
        synchronized (up3.n.class) {
            if (up3.n.f429837e != null) {
                return;
            }
            up3.n.f429837e = new up3.n();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter(up3.n.f429834b);
            try {
                if (fp.h.a(33)) {
                    context.registerReceiver(up3.n.f429837e, intentFilter, up3.n.f429833a, null);
                } else {
                    context.registerReceiver(up3.n.f429837e, intentFilter, up3.n.f429833a, null, 4);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(f429838d, th6, "[-] Fail to register receiver.", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.appenderFlush();
            }
        }
    }

    public static void a(com.tencent.mm.vfs.r6 r6Var) {
        int i17;
        try {
            i17 = gm0.j1.b().h();
        } catch (java.lang.Throwable unused) {
            i17 = 0;
        }
        com.tencent.mm.app.i3.c(r6Var.o(), 12347, i17, null, null, null);
        com.tencent.mars.xlog.Log.i(f429838d, "[+] Explained by src 1: %s", r6Var.o());
    }

    public static java.lang.String e(java.lang.String str, char c17, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        int i17 = str.charAt(0) == c17 ? 1 : 0;
        while (z17 && i17 < str.length() && str.charAt(i17) == c17) {
            i17++;
        }
        return str.substring(i17);
    }

    @Override // tp3.c
    public java.lang.String b() {
        return f429839e;
    }

    @Override // tp3.c
    public void c(java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get(f429840f);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        java.lang.String str2 = f429838d;
        if (K0) {
            com.tencent.mars.xlog.Log.e(str2, "[-] Target is null or empty!");
            return;
        }
        if (!((java.util.TreeMap) f429848q).containsKey(str)) {
            com.tencent.mars.xlog.Log.e(str2, "[-] Target is absent.");
            return;
        }
        java.lang.String str3 = (java.lang.String) map.get(f429841g);
        java.lang.String str4 = f429845n;
        if (str3 == null) {
            str3 = str4;
        }
        java.util.TreeMap treeMap = (java.util.TreeMap) f429847p;
        if (!treeMap.containsKey(str3)) {
            com.tencent.mars.xlog.Log.e(str2, "[-] Explained by src 9: %s", str3);
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) ((up3.p) treeMap.get(str3)).a(map)).booleanValue();
        java.lang.String str5 = f429846o;
        if (!booleanValue) {
            if (!com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                str4 = str5;
            }
            com.tencent.mars.xlog.Log.w(str2, "[!] Explained by src 10: %s, %s", str4, str3);
        } else {
            if (!com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                str4 = str5;
            }
            com.tencent.mars.xlog.Log.i(str2, "[+] Explained by src 11: %s, %s, %s", str, str3, str4);
            f429849r.post(new up3.c(this, str, map));
        }
    }

    @Override // tp3.c
    public void d() {
    }
}
