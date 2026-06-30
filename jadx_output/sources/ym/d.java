package ym;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f463123a = com.tencent.mm.vfs.q7.c("PublicResource") + "/cara/so";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f463124b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f463125c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f463126d = false;

    public static boolean a(ym.c cVar) {
        java.lang.String d17 = d();
        if (!android.text.TextUtils.isEmpty(d17)) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(d17);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(d17);
                if (p17.equals(cVar.f463121b)) {
                    return true;
                }
                com.tencent.mars.xlog.Log.e("Cara.CaraEnv", "so md5 error: %s", p17);
                return false;
            }
        }
        return false;
    }

    public static synchronized void b() {
        boolean z17;
        synchronized (ym.d.class) {
            java.lang.String str = f463123a;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!a17.f213279f.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            ym.c c17 = c();
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e("Cara.CaraEnv", "env null");
                return;
            }
            for (com.tencent.mm.vfs.r6 r6Var : new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)).H(new ym.b(".zst"))) {
                if (r6Var != null) {
                    r6Var.l();
                }
            }
            if (!a(c17)) {
                com.tencent.mars.xlog.Log.e("Cara.CaraEnv", "so md5 not match");
                java.lang.String d17 = d();
                if (android.text.TextUtils.isEmpty(d17)) {
                    com.tencent.mars.xlog.Log.e("Cara.CaraEnv", "checkSoMd5 so path null");
                } else {
                    com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(d17);
                    if (r6Var2.m()) {
                        r6Var2.l();
                    }
                }
            }
            if (c() == null ? false : com.tencent.mm.vfs.w6.j(d())) {
                com.tencent.mars.xlog.Log.i("Cara.CaraEnv", "env ready! just use it!");
                return;
            }
            if (!(com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_plugin_cara_so_download_open", "1", false, true), 1) != 0)) {
                com.tencent.mars.xlog.Log.e("Cara.CaraEnv", "so can't download");
                return;
            }
            java.lang.String str3 = c17.f463121b;
            f463124b = true;
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("cara");
            long j17 = M.getLong("cara_so_download", 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - j17 < 86400000) {
                z17 = true;
            } else {
                M.putLong("cara_so_download", currentTimeMillis);
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.e("Cara.CaraEnv", "so download repeat in 24 hours");
                return;
            }
            if (!f463125c) {
                fp.d0.n("wechatzstd");
                f463125c = true;
            }
            java.lang.String d18 = d();
            java.lang.String str4 = c17.f463122c;
            java.lang.String str5 = d18 + "." + java.lang.System.currentTimeMillis() + ".zst";
            ym.a aVar = new ym.a(d18, str3);
            com.tencent.mm.network.j2 j2Var = new com.tencent.mm.network.j2(str4, 0);
            j2Var.f72045k = false;
            j2Var.f72043i = "GET";
            j2Var.f72047m = true;
            j2Var.f72054t = true;
            j2Var.f72049o = 2;
            j2Var.f72046l = str5;
            j2Var.f72048n = new zm.a(j2Var, aVar, str5);
            j2Var.a();
        }
    }

    public static ym.c c() {
        java.lang.String j17 = j62.e.g().j("clicfg_plugin_cara_env_so_name_64", "", true, true);
        java.lang.String j18 = j62.e.g().j("clicfg_plugin_cara_env_so_md5_64", "", true, true);
        java.lang.String j19 = j62.e.g().j("clicfg_plugin_cara_env_so_min_version", "", true, true);
        java.lang.String j27 = j62.e.g().j("clicfg_plugin_cara_env_so_download_url_64", "", true, true);
        if (android.text.TextUtils.isEmpty(j17) || android.text.TextUtils.isEmpty(j18) || android.text.TextUtils.isEmpty(j19) || android.text.TextUtils.isEmpty(j27)) {
            return null;
        }
        ym.c cVar = new ym.c(null);
        cVar.f463120a = j17;
        cVar.f463121b = j18;
        cVar.f463122c = j27;
        return cVar;
    }

    public static java.lang.String d() {
        ym.c c17 = c();
        if (c17 == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f463123a);
        sb6.append("/");
        sb6.append(c17.f463120a + "_" + c17.f463121b + ".so");
        return sb6.toString();
    }
}
