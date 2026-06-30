package ib4;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f290214d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f290215e;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, long j17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.k2();
        lVar.f70665b = new r45.l2();
        lVar.f70666c = "/cgi-bin/mmoc-bin/adplayinfo/ad_anti_abuse";
        lVar.f70667d = 4679;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f290214d = a17;
        r45.k2 k2Var = (r45.k2) a17.f70710a.f70684a;
        k2Var.f378316d = str == null ? "" : str;
        k2Var.f378320h = str2 == null ? "" : str2;
        k2Var.f378317e = str3 == null ? "" : str3;
        k2Var.f378318f = i17;
        k2Var.f378319g = str4 == null ? "" : str4;
        k2Var.f378321i = str5 == null ? "" : str5;
        k2Var.f378322m = j17;
        com.tencent.mars.xlog.Log.i("NetSceneAdAntiAbuse", "NetSceneAdAntiAbuse, canvasId=" + str + ", pageId=" + str2 + ", scene=" + i17 + ", uxInfo=" + str3 + ", localTime= " + j17);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        this.f290215e = u0Var;
        int dispatch = dispatch(sVar, this.f290214d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        int i17 = this.f290214d.f70713d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        return i17;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        com.tencent.mars.xlog.Log.i("NetSceneAdAntiAbuse", "NetSceneAdAntiAbuse, errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f290215e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
    }
}
