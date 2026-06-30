package ib4;

/* loaded from: classes4.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f290226d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f290227e;

    public g(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pp3();
        lVar.f70665b = new r45.qp3();
        lVar.f70666c = "/cgi-bin/mmoc-bin/adplayinfo/get_twist_card_status";
        lVar.f70667d = 4689;
        lVar.f70672i = 5000;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f290226d = a17;
        r45.pp3 pp3Var = (r45.pp3) a17.f70710a.f70684a;
        pp3Var.f383286d = str;
        pp3Var.f383287e = i17;
        pp3Var.f383291i = str2;
        pp3Var.f383288f = str3;
        pp3Var.f383289g = 0;
        pp3Var.f383290h = str4;
        pp3Var.f383292m = i18;
        com.tencent.mars.xlog.Log.i("NetSceneAdGetTwistCardStatus", "scene=" + i17 + ", canvasId=" + str2 + ", cardId=" + str3 + ", giveCardId=" + str4 + ", uxInfo=" + str + ", opType=" + i18);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        this.f290227e = u0Var;
        int dispatch = dispatch(sVar, this.f290226d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        int i17 = this.f290226d.f70713d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        return i17;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        com.tencent.mars.xlog.Log.i("NetSceneAdGetTwistCardStatus", "errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f290227e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
    }
}
