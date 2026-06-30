package vz4;

/* loaded from: classes8.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f441744a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f441745b = true;

    /* renamed from: c, reason: collision with root package name */
    public static int f441746c = 0;

    public static int a(java.lang.String str) {
        if (!f441745b) {
            return 12;
        }
        if (com.tencent.mm.plugin.game.commlib.i.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WePkgLoader", "config wepkg disable");
            f441745b = false;
            return 12;
        }
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("we_pkg_sp", 4);
        if (sharedPreferences == null || !sharedPreferences.getBoolean("disable_we_pkg", false)) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WePkgLoader", "white screen, disable wepkg");
        f441745b = false;
        return 11;
    }

    public static com.tencent.mm.plugin.wepkg.model.s b(java.lang.String str, boolean z17) {
        boolean z18;
        if (com.tencent.mm.ipcinvoker.d0.g(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
            z18 = true;
        } else {
            com.tencent.mm.plugin.wepkg.utils.n.a("", new vz4.q());
            com.tencent.mm.plugin.wepkg.utils.a.c("EnterWeb", str, kh0.i.a(str), null, 0L, 0L, com.tencent.mm.plugin.wepkg.utils.a.d(10));
            z18 = false;
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WePkgLoader", "wepkg service is dead, start");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(859, 36);
            return new com.tencent.mm.plugin.wepkg.model.s(10, false, "");
        }
        int a17 = a(str);
        if (a17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WePkgLoader", "load enable false");
            return new com.tencent.mm.plugin.wepkg.model.s(a17, false, "");
        }
        java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
        java.lang.String a18 = kh0.i.a(str);
        if (z17) {
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new vz4.r(a18));
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(a18) ? new com.tencent.mm.plugin.wepkg.model.s(9, false, "") : c(str);
    }

    public static com.tencent.mm.plugin.wepkg.model.s c(java.lang.String str) {
        com.tencent.mm.plugin.wepkg.model.s sVar;
        boolean z17;
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion;
        java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
        java.lang.String a17 = kh0.i.a(str);
        java.util.HashMap hashMap = (java.util.HashMap) f441744a;
        if (hashMap.containsKey(a17)) {
            com.tencent.mm.plugin.wepkg.model.s sVar2 = (com.tencent.mm.plugin.wepkg.model.s) hashMap.get(a17);
            java.lang.String host = com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : android.net.Uri.parse(str).getHost();
            if (sVar2 != null && (wepkgVersion = sVar2.f188462d) != null && host.equalsIgnoreCase(wepkgVersion.f188382o)) {
                com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion2 = sVar2.f188462d;
                com.tencent.mars.xlog.Log.i("MicroMsg.WePkgLoader", "memory has pkgid:%s record, version:%s", wepkgVersion2.f188374d, wepkgVersion2.f188376f);
                return sVar2;
            }
        }
        synchronized (com.tencent.mm.plugin.wepkg.model.z.class) {
            java.lang.String a18 = kh0.i.a(str);
            java.lang.String host2 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : android.net.Uri.parse(str).getHost();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a18) && !com.tencent.mm.sdk.platformtools.t8.K0(host2)) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(859L, 6L, 1L, false);
                com.tencent.mm.plugin.wepkg.model.WepkgVersion e17 = com.tencent.mm.plugin.wepkg.model.o0.e(a18);
                if (e17 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "DB dont have valid record, pkgid:%s, domain:%s, version:%s:", a18, "", "");
                    com.tencent.mm.plugin.wepkg.utils.a.c("EnterWeb", str, a18, null, 0L, 0L, com.tencent.mm.plugin.wepkg.utils.a.d(14));
                    g0Var.idkeyStat(859L, 7L, 1L, false);
                    sVar = new com.tencent.mm.plugin.wepkg.model.s(14, false, "");
                } else {
                    boolean z18 = e17.f188390w;
                    if (z18 && (e17.f188391x || !e17.f188392y)) {
                        if (host2.equalsIgnoreCase(e17.f188382o)) {
                            if (com.tencent.mm.sdk.platformtools.t8.K0(e17.f188376f)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "this pkgid(%s) is disable form server", a18);
                                com.tencent.mm.plugin.wepkg.utils.a.c("EnterWeb", str, a18, null, 0L, 0L, com.tencent.mm.plugin.wepkg.utils.a.d(15));
                                g0Var.idkeyStat(859L, 9L, 1L, false);
                                sVar = new com.tencent.mm.plugin.wepkg.model.s(15, true, e17.f188376f);
                            } else {
                                com.tencent.mm.plugin.wepkg.model.o c17 = com.tencent.mm.plugin.wepkg.model.z.c(a18, e17.f188376f, e17.f188377g, e17.f188383p, e17.f188385r);
                                if (c17 != null || com.tencent.mm.sdk.platformtools.t8.K0(e17.f188377g)) {
                                    java.util.Map d17 = com.tencent.mm.plugin.wepkg.model.z.d(a18, e17.f188392y);
                                    if (d17 == null) {
                                        com.tencent.mm.plugin.wepkg.utils.a.c("EnterWeb", str, a18, e17.f188376f, 0L, 0L, com.tencent.mm.plugin.wepkg.utils.a.d(18));
                                        g0Var.idkeyStat(859L, 11L, 1L, false);
                                        sVar = new com.tencent.mm.plugin.wepkg.model.s(18, true, e17.f188376f);
                                    } else {
                                        com.tencent.mm.plugin.wepkg.model.s sVar3 = new com.tencent.mm.plugin.wepkg.model.s(e17, c17, d17);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "loadWepkg time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                                        g0Var.idkeyStat(859L, 12L, 1L, false);
                                        sVar = sVar3;
                                    }
                                } else {
                                    com.tencent.mm.plugin.wepkg.utils.a.c("EnterWeb", str, a18, e17.f188376f, 0L, 0L, com.tencent.mm.plugin.wepkg.utils.a.d(17));
                                    g0Var.idkeyStat(859L, 11L, 1L, false);
                                    sVar = new com.tencent.mm.plugin.wepkg.model.s(17, true, e17.f188376f);
                                }
                            }
                            z17 = false;
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "the domain not match, pkgid:%s, version:%s, UrlDomain[%s] != DBDomain[%s]", a18, e17.f188376f, host2, e17.f188382o);
                            com.tencent.mm.plugin.wepkg.utils.a.c("EnterWeb", str, a18, null, 0L, 0L, com.tencent.mm.plugin.wepkg.utils.a.d(13));
                            g0Var.idkeyStat(859L, 8L, 1L, false);
                            sVar = new com.tencent.mm.plugin.wepkg.model.s(13, true, e17.f188376f);
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "local cache disable, pkgid:%s, version:%s, bigPackageReady:%s, preloadFilesReady:%s, preloadFilesAtomic:%s", e17.f188374d, e17.f188376f, java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(e17.f188391x), java.lang.Boolean.valueOf(e17.f188392y));
                    com.tencent.mm.plugin.wepkg.utils.a.c("EnterWeb", str, a18, e17.f188376f, 0L, 0L, com.tencent.mm.plugin.wepkg.utils.a.d(16));
                    g0Var.idkeyStat(859L, 10L, 1L, false);
                    sVar = new com.tencent.mm.plugin.wepkg.model.s(16, false, e17.f188376f);
                    z17 = false;
                }
                z17 = false;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgManager", "pkgId = %s, domain = %s", a18, host2);
            z17 = false;
            sVar = new com.tencent.mm.plugin.wepkg.model.s(8, false, "");
        }
        if (sVar.f188395a == 0 ? true : z17) {
            hashMap.put(a17, sVar);
        }
        return sVar;
    }
}
