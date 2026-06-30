package v62;

/* loaded from: classes12.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f433502a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f433503b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f433504c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f433505d = new java.util.HashMap();

    public static boolean a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtQbarDataManager", "hy: null in fastJudgeInBlacklist");
            return false;
        }
        if (!f433503b.contains(str)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtQbarDataManager", "hy: %s already in blacklist", str);
        return true;
    }

    public static java.lang.String b() {
        java.lang.String[] strArr = com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi.f99859t;
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getParent() + "/extqbar";
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtQbarDataManager", "hy: face dir not exist. mk dir");
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        return str.concat("/ext_qbar_config.csv");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v62.e.c(java.lang.String):void");
    }

    public static void d() {
        if (!com.tencent.mm.vfs.w6.j(b())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtQbarDataManager", "hy: not found csv file");
            gm0.j1.d().g(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.k0(46));
            return;
        }
        try {
            java.lang.String M = com.tencent.mm.vfs.w6.M(b());
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtQbarDataManager", "hy: found qrcode config");
            c(M);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExtQbarDataManager", e17, "hy: read config file failed!", new java.lang.Object[0]);
        }
    }
}
