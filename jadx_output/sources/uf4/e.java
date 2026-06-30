package uf4;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.app.z2 {
    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (k35.r.a() != null) {
            com.tencent.mm.plugin.subapp.jdbiz.q.Di().getClass();
            if (gm0.j1.a()) {
                if (!com.tencent.mm.plugin.subapp.jdbiz.q.Di().bj()) {
                    com.tencent.mm.plugin.subapp.jdbiz.q.Di().getClass();
                    if (!"1".equals((java.lang.String) c01.d9.b().p().l(327938, ""))) {
                        return;
                    }
                }
                com.tencent.mm.plugin.subapp.jdbiz.o Zi = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi();
                if ((!com.tencent.mm.sdk.platformtools.t8.K0(Zi.f172138g) || Zi.f172137f) && Zi.d()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreJdIP6", "clear red dot/friend dot");
                    com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ai();
                    com.tencent.mm.plugin.subapp.jdbiz.q.Di().wi();
                    com.tencent.mm.plugin.subapp.jdbiz.q Di = com.tencent.mm.plugin.subapp.jdbiz.q.Di();
                    Di.getClass();
                    new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.subapp.jdbiz.p(Di));
                }
            }
        }
    }
}
