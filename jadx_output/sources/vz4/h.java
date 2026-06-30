package vz4;

/* loaded from: classes8.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f441734a = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/jsserver.js?wechat_pkgid=jscore_lib";

    /* renamed from: b, reason: collision with root package name */
    public static vz4.x f441735b;

    public static void a(jh0.s sVar) {
        java.lang.String str;
        com.tencent.mm.plugin.wepkg.model.o oVar;
        if (sVar != null) {
            vz4.x xVar = new vz4.x();
            f441735b = xVar;
            xVar.e(f441734a, true, false);
            com.tencent.mm.plugin.wepkg.model.s sVar2 = f441735b.f441757e;
            if (sVar2 != null && (oVar = sVar2.f188463e) != null) {
                if (!com.tencent.mm.sdk.platformtools.t8.L0(oVar.f188451f) && oVar.f188449d >= 4) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.util.Iterator it = oVar.f188451f.iterator();
                    while (it.hasNext()) {
                        r45.ps0 ps0Var = (r45.ps0) it.next();
                        if (!oVar.e(ps0Var.f383370g)) {
                            try {
                                java.lang.String d17 = ik1.f.d(new a05.b(oVar.f188446a, oVar.f188449d + ps0Var.f383368e, ps0Var.f383369f));
                                if (d17 != null) {
                                    sb6.append("\n");
                                    sb6.append(d17);
                                }
                            } catch (java.io.IOException e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WePkgReader", "getAllCode: " + e17.getMessage());
                            }
                        }
                    }
                    str = sb6.toString();
                    sVar.a(str);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WePkgReader", "getAllCode, mFileIndexList is null");
            }
            str = null;
            sVar.a(str);
        }
    }
}
