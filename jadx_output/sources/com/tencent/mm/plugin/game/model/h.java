package com.tencent.mm.plugin.game.model;

/* loaded from: classes4.dex */
public class h implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140322d;

    public h(java.lang.String str) {
        this.f140322d = str;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2 = this.f140322d;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "pull menu data fail. appid:%s", str2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "pull menu data success. appid:%s", str2);
        gm0.j1.d().q(1369, this);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.model.g(this, (r45.dv3) ((com.tencent.mm.plugin.game.model.i3) m1Var).f140339e.f70711b.f70700a));
    }
}
