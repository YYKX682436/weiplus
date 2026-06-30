package ib4;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f290216d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f290217e;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ny();
        lVar.f70665b = new r45.oy();
        lVar.f70666c = "/cgi-bin/mmoc-bin/adplayinfo/channelpkginfo";
        lVar.f70667d = 1210;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f290216d = a17;
        r45.ny nyVar = (r45.ny) a17.f70710a.f70684a;
        nyVar.f381744h = str;
        nyVar.f381741e = str3;
        nyVar.f381740d = str2;
        nyVar.f381742f = com.tencent.mm.sdk.platformtools.a0.c();
        nyVar.f381743g = z17 ? 1 : 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
        this.f290217e = u0Var;
        int dispatch = dispatch(sVar, this.f290216d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
        int i17 = this.f290216d.f70713d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
        return i17;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
        com.tencent.mm.modelbase.u0 u0Var = this.f290217e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
    }
}
