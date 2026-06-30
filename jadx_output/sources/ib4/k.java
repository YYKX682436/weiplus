package ib4;

/* loaded from: classes2.dex */
public class k extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f290235d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f290236e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f290237f;

    public k(java.lang.String str) {
        this.f290237f = "";
        this.f290237f = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.up0();
        lVar.f70665b = new r45.vp0();
        lVar.f70666c = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_favofficialitem";
        lVar.f70667d = 2874;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f290235d = a17;
        ((r45.up0) a17.f70710a.f70684a).f387545d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFavOfficialItem", "Req: item_buff[%s]", str);
    }

    public java.lang.String H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemBuff", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        java.lang.String str = this.f290237f;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemBuff", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        return str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        this.f290236e = u0Var;
        int dispatch = dispatch(sVar, this.f290235d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        return 2874;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFavOfficialItem", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        this.f290236e.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
    }
}
