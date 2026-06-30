package p05;

/* loaded from: classes5.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.a3 f350439a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f350440b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f350441c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f350442d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f350443e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f350444f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f350445g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f350446h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f350447i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f350448j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f350449k;

    /* renamed from: l, reason: collision with root package name */
    public static final p05.c3 f350450l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f350451m;

    static {
        p05.a3 a3Var = new p05.a3();
        f350439a = a3Var;
        f350440b = lp0.b.h();
        java.lang.String str = lp0.b.h() + "xlab";
        f350441c = str;
        f350442d = "Models";
        f350443e = str + "/Models";
        f350444f = "Makeup";
        f350445g = str + "/Makeup";
        f350446h = "LutFilters";
        f350447i = "settings";
        f350448j = str + "/settings";
        f350449k = "ImageLabel81V1.0.0.21.xnet";
        p05.c3 c3Var = new p05.c3();
        f350450l = c3Var;
        java.lang.String str2 = "assets:///xlab/Models";
        f350451m = str2;
        gr.b.f274661a.a(str2 + "/ModelListConfig.xml", c3Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisFileUtil", "init assets config: " + c3Var.f350473c + ", " + c3Var.f350472b);
        int i17 = c3Var.f350472b;
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        if (!(i17 == tq5.i.f421269a)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeVisFileUtil", "assets list config is invalid");
        }
        a3Var.a();
    }

    public final void a() {
        if (c()) {
            return;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        byte[] bArr = com.tencent.mm.plugin.expansions.i0.f99751a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        android.content.res.AssetManager assets = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        e(assets);
    }

    public final boolean b(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        java.lang.String[] list;
        try {
            list = assetManager.list(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeVisFileUtil", e17, "checkFileMd5Match", new java.lang.Object[0]);
        }
        if (list == null) {
            return true;
        }
        if (list.length == 0) {
            java.lang.String p17 = com.tencent.mm.vfs.w6.p("assets:///" + str);
            java.lang.String p18 = com.tencent.mm.vfs.w6.p(str2);
            if (kotlin.jvm.internal.o.b(p17, p18)) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WeVisFileUtil", "checkFileMd5Match: " + str + " is " + p17 + "; " + str2 + " is " + p18);
            d(assetManager, str, str2);
            return false;
        }
        com.tencent.mm.vfs.w6.u(str2);
        for (java.lang.String str3 : list) {
            f350439a.b(assetManager, str + '/' + str3, str2 + '/' + str3);
        }
        return false;
    }

    public final boolean c() {
        java.lang.String M;
        java.lang.String str = f350441c + "/version.txt";
        if (com.tencent.mm.vfs.w6.j(str)) {
            try {
                M = com.tencent.mm.vfs.w6.M(str);
            } catch (java.io.IOException unused) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WeVisFileUtil", "checkVersionMatch: " + M + ", 0b0d3bfcbc324701f09b2f89790f1140");
            kotlin.jvm.internal.o.d(M);
            return kotlin.jvm.internal.o.b("0b0d3bfcbc324701f09b2f89790f1140", M);
        }
        M = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisFileUtil", "checkVersionMatch: " + M + ", 0b0d3bfcbc324701f09b2f89790f1140");
        kotlin.jvm.internal.o.d(M);
        return kotlin.jvm.internal.o.b("0b0d3bfcbc324701f09b2f89790f1140", M);
    }

    public final void d(android.content.res.AssetManager assets, java.lang.String assetsPath, java.lang.String localPath) {
        kotlin.jvm.internal.o.g(assets, "assets");
        kotlin.jvm.internal.o.g(assetsPath, "assetsPath");
        kotlin.jvm.internal.o.g(localPath, "localPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisFileUtil", "copyAssets: " + assetsPath + "; " + localPath);
        try {
            java.lang.String[] list = assets.list(assetsPath);
            if (list == null) {
                return;
            }
            if (!(list.length == 0)) {
                com.tencent.mm.vfs.w6.u(localPath);
                for (java.lang.String str : list) {
                    f350439a.d(assets, assetsPath + '/' + str, localPath + '/' + str);
                }
                return;
            }
            java.io.InputStream open = assets.open(assetsPath);
            try {
                java.io.OutputStream K = com.tencent.mm.vfs.w6.K(localPath, false);
                try {
                    kotlin.jvm.internal.o.d(open);
                    kotlin.jvm.internal.o.d(K);
                    vz5.a.b(open, K, 0, 2, null);
                    vz5.b.a(K, null);
                    vz5.b.a(open, null);
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeVisFileUtil", e17, "copyAssets", new java.lang.Object[0]);
        }
    }

    public final void e(android.content.res.AssetManager assets) {
        kotlin.jvm.internal.o.g(assets, "assets");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("xlab/");
        java.lang.String str = f350444f;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.lang.String str2 = f350441c;
        sb8.append(str2);
        sb8.append('/');
        sb8.append(str);
        d(assets, sb7, sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("xlab/");
        java.lang.String str3 = f350446h;
        sb9.append(str3);
        d(assets, sb9.toString(), str2 + '/' + str3);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("xlab/");
        java.lang.String str4 = f350447i;
        sb10.append(str4);
        d(assets, sb10.toString(), str2 + '/' + str4);
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("xlab/");
        java.lang.String str5 = f350442d;
        sb11.append(str5);
        d(assets, sb11.toString(), str2 + '/' + str5);
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
        sb12.append(str2);
        sb12.append("/version.txt");
        java.lang.String sb13 = sb12.toString();
        byte[] bytes = "0b0d3bfcbc324701f09b2f89790f1140".getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        com.tencent.mm.vfs.w6.S(sb13, bytes, 0, bytes.length);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            pm0.v.L("XLabFileUtil_checkFile", true, p05.z2.f350742d);
        }
    }

    public final java.lang.String f(rh0.z scene) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(scene, "scene");
        switch (scene.ordinal()) {
            case 0:
                str = "voip.ini";
                break;
            case 1:
                str = "zpbq.ini";
                break;
            case 2:
                str = "live.ini";
                break;
            case 3:
                str = "live_highrank.ini";
                break;
            case 4:
                str = "voip_highrank.ini";
                break;
            case 5:
                str = "sightcap.ini";
                break;
            case 6:
                str = "livepusher.ini";
                break;
            default:
                str = null;
                break;
        }
        if (str == null) {
            return null;
        }
        java.lang.String str2 = f350448j + '/' + str;
        if (com.tencent.mm.vfs.w6.j(str2)) {
            return str2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisFileUtil", "getIniFilePath: file not exist " + str2);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String g(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p05.a3.g(java.lang.String):java.lang.String");
    }

    public final java.lang.String h(java.lang.String key) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(key, "key");
        p05.p3 p3Var = p05.p3.f350639a;
        java.util.LinkedList linkedList = p05.p3.f350640b;
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((p05.q3) obj).f350656a, key)) {
                    break;
                }
            }
            p05.q3 q3Var = (p05.q3) obj;
            str = q3Var != null ? q3Var.f350659d : null;
        }
        if (str != null) {
            return str;
        }
        java.util.Iterator it6 = f350450l.f350474d.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (kotlin.jvm.internal.o.b(((p05.b3) obj2).f350462b, key)) {
                break;
            }
        }
        p05.b3 b3Var = (p05.b3) obj2;
        if (b3Var != null) {
            return b3Var.f350464d;
        }
        return null;
    }
}
