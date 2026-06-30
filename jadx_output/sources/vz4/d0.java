package vz4;

/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vz4.d0 f441729a = new vz4.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f441730b = new java.lang.Object();

    public static final void a(vz4.d0 d0Var, com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion, java.lang.String str, java.lang.String str2) {
        d0Var.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(wepkgVersion.f188377g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WePkgUpdateManager", "wepkg pkgPath is empty");
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(wepkgVersion.f188377g);
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WePkgUpdateManager", "wepkg file not exists");
            return;
        }
        com.tencent.mm.plugin.wepkg.model.o oVar = new com.tencent.mm.plugin.wepkg.model.o(r6Var);
        if (oVar.f188447b) {
            java.util.Iterator it = oVar.c().iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.wepkg.model.k kVar = (com.tencent.mm.plugin.wepkg.model.k) it.next();
                if (kVar.f188431a.equals(str)) {
                    if (str2 == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WePkgUpdateManager", "patchId is null");
                        com.tencent.mm.plugin.wepkg.model.j.a(kVar);
                    } else if (!kotlin.jvm.internal.o.b(str2, kVar.f188433c)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WePkgUpdateManager", "patchId does not match");
                        com.tencent.mm.plugin.wepkg.model.j.a(kVar);
                    }
                }
            }
        }
    }

    public static final void b(java.lang.String str, java.lang.String str2, long j17, boolean z17, vz4.j callBack) {
        kotlin.jvm.internal.o.g(callBack, "callBack");
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                com.tencent.mm.plugin.wepkg.model.WepkgVersion d17 = com.tencent.mm.plugin.wepkg.model.o0.d(str);
                r45.m40 m40Var = new r45.m40();
                m40Var.f380136d = str;
                java.lang.String str3 = "";
                if (!z17) {
                    java.lang.String str4 = d17 != null ? d17.f188376f : null;
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
                m40Var.f380137e = str3;
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                r45.c30 c30Var = new r45.c30();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(m40Var);
                c30Var.f371253d = linkedList;
                lVar.f70664a = c30Var;
                lVar.f70665b = new r45.d30();
                lVar.f70666c = "/cgi-bin/mmgame-bin/checkwepkgversion";
                lVar.f70667d = 1313;
                com.tencent.mm.modelbase.o a17 = lVar.a();
                kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                ((ku5.t0) ku5.t0.f312615d).l(new vz4.y(c0Var, str, str2, callBack), 1000 * j17, "MicroMsg.WePkgUpdateManager");
                com.tencent.mm.plugin.wepkg.utils.k.c(a17, new vz4.c0(str, str2, c0Var, callBack, z17, d17, j17));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg , pkgId = " + str + " appId = " + str2);
        callBack.a("pkgId or appId isNullOrEmpty");
    }
}
