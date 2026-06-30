package com.tencent.mm.plugin.sns.model;

/* loaded from: classes.dex */
public class h2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164216d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164217e;

    /* renamed from: f, reason: collision with root package name */
    public final int f164218f;

    public h2(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nx4();
        lVar.f70665b = new r45.ox4();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/oauth_checkgrant";
        lVar.f70667d = 2842;
        this.f164218f = i17;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164216d = a17;
        r45.nx4 nx4Var = (r45.nx4) a17.f70710a.f70684a;
        gm0.j1.i();
        int h17 = gm0.j1.b().h();
        nx4Var.f381722d = h17;
        nx4Var.f381723e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOauthCheckGrant", "init useruin:%d, bizuin:%d", java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(nx4Var.f381723e));
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        this.f164217e = u0Var;
        int dispatch = dispatch(sVar, this.f164216d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        return 2842;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOauthCheckGrant", "onGYNetEnd netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        if (i18 == 0 && i19 == 0) {
            r45.ox4 ox4Var = (r45.ox4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            int i27 = this.f164218f;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOauthCheckGrant", "onGYNetEnd bizUin:%d, status:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(ox4Var.f382605d));
            if (i27 == -1216949095) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_OPEN_UPLOAD_WEISHI_BOOLEAN_SYNC, java.lang.Boolean.valueOf(ox4Var.f382605d == 1));
            }
        }
        this.f164217e.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
    }
}
