package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public class f0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.d0 f137406d;

    public f0(com.tencent.mm.plugin.fts.d0 d0Var) {
        this.f137406d = d0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.i();
        if (com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) != 0) {
            gm0.j1.d().q(138, this.f137406d.f137391s);
            this.f137406d.f137382g = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "*** User has finished initializing.");
            this.f137406d.yj(2);
        }
    }
}
