package ib4;

/* loaded from: classes2.dex */
public class l extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f290238d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f290239e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f290240f;

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jg3();
        lVar.f70665b = new r45.kg3();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getgamecanvasinfo";
        lVar.f70667d = 1337;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f290238d = a17;
        r45.jg3 jg3Var = (r45.jg3) a17.f70710a.f70684a;
        jg3Var.f377790d = str;
        jg3Var.f377791e = str2;
        jg3Var.f377792f = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: shareType:" + str2 + " sharedAppId :" + str);
    }

    public java.lang.String H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJsonString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        java.lang.String str = this.f290240f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJsonString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        return str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        this.f290239e = u0Var;
        int dispatch = dispatch(sVar, this.f290238d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        int i17 = this.f290238d.f70713d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        return i17;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str + " sceneType: " + getType());
        if (getType() == 1337) {
            this.f290240f = ((r45.kg3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f378678d;
        } else if (getType() == 2721) {
            this.f290240f = ((r45.by4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f371146d;
        }
        this.f290239e.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
    }

    public l(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ay4();
        lVar.f70665b = new r45.by4();
        lVar.f70666c = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_officialsync";
        lVar.f70667d = 2721;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f290238d = a17;
        ((r45.ay4) a17.f70710a.f70684a).f370370d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: syncBuffer:" + str);
    }
}
