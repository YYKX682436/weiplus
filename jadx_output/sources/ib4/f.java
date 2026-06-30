package ib4;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f290224d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f290225e;

    public f(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.np3();
        lVar.f70665b = new r45.op3();
        lVar.f70666c = "/cgi-bin/mmoc-bin/adplayinfo/get_twist_adcard";
        lVar.f70667d = 4729;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f290224d = a17;
        r45.np3 np3Var = (r45.np3) a17.f70710a.f70684a;
        np3Var.f381567d = str;
        np3Var.f381569f = str2;
        np3Var.f381568e = i17;
        np3Var.f381570g = str3;
        np3Var.f381572i = str4;
        np3Var.f381571h = str5;
        com.tencent.mars.xlog.Log.i("NetSceneAdGetTwistCard", "snsId=" + str2 + ", scene=" + i17 + ", canvasId=" + str3 + ", pageId=" + str4 + ", uxInfo=" + str + ", extra=" + str5);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
        this.f290225e = u0Var;
        int dispatch = dispatch(sVar, this.f290224d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
        int i17 = this.f290224d.f70713d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
        return i17;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
        com.tencent.mars.xlog.Log.i("NetSceneAdGetTwistCard", "errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f290225e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
    }
}
