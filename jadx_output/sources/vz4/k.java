package vz4;

/* loaded from: classes8.dex */
public class k implements m43.b {
    public k(vz4.m mVar) {
    }

    @Override // m43.b
    public void a() {
        try {
            java.util.Map map = vz4.s.f441744a;
            if (!com.tencent.mm.ipcinvoker.d0.g(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
                com.tencent.mm.plugin.wepkg.utils.n.a("", new vz4.p());
            }
            vz4.b.b();
            java.lang.String str = vz4.h.f441734a;
            com.tencent.mars.xlog.Log.i("MicroMsg.GameJsServerCommLibPkg", "load");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WePkg.PluginWePkg", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(859L, 19L, 1L, false);
        }
    }
}
