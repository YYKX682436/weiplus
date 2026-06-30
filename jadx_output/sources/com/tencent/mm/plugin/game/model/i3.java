package com.tencent.mm.plugin.game.model;

/* loaded from: classes4.dex */
public class i3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f140338d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f140339e;

    public i3(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cv3();
        lVar.f70665b = new r45.dv3();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gethvgamemenu";
        lVar.f70667d = 1369;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f140339e = a17;
        r45.cv3 cv3Var = (r45.cv3) a17.f70710a.f70684a;
        cv3Var.f371852e = com.tencent.mm.sdk.platformtools.m2.d();
        java.lang.String d07 = com.tencent.mm.sdk.platformtools.t8.d0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        cv3Var.f371853f = d07;
        cv3Var.f371851d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneHVGameGetMenu", "lang=%s, country=%s, appid=%s", cv3Var.f371852e, d07, str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f140338d = u0Var;
        return dispatch(sVar, this.f140339e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1369;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneHVGameGetMenu", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        if (i18 != 0 || i19 != 0) {
            this.f140338d.onSceneEnd(i18, i19, str, this);
        } else if (((r45.dv3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a) == null) {
            this.f140338d.onSceneEnd(i18, i19, str, this);
        } else {
            this.f140338d.onSceneEnd(i18, i19, str, this);
        }
    }
}
