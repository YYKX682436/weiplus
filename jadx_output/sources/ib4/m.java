package ib4;

/* loaded from: classes4.dex */
public class m extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f290241d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f290242e;

    public m(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.em3();
        lVar.f70665b = new r45.fm3();
        lVar.f70666c = "/cgi-bin/mmoc-bin/adplayinfo/get_qywx_qrcode";
        lVar.f70667d = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f290241d = a17;
        r45.em3 em3Var = (r45.em3) a17.f70710a.f70684a;
        em3Var.f373602d = str;
        em3Var.f373603e = str2;
        em3Var.f373604f = str3;
        em3Var.f373605g = str4;
        em3Var.f373606h = str5;
        em3Var.f373607i = str6;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
        this.f290242e = u0Var;
        int dispatch = dispatch(sVar, this.f290241d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
        int i17 = this.f290241d.f70713d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
        return i17;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
        com.tencent.mars.xlog.Log.i("NetSceneUpdateQrUrl", "errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f290242e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
    }
}
