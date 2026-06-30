package ib4;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f290222d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f290223e;

    public e(long j17, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mh3();
        lVar.f70665b = new r45.nh3();
        lVar.f70666c = "/cgi-bin/mmoc-bin/adplayinfo/get_landpage_smartphone";
        lVar.f70667d = 2605;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f290222d = a17;
        r45.mh3 mh3Var = (r45.mh3) a17.f70710a.f70684a;
        mh3Var.f380502d = j17;
        mh3Var.f380503e = i17;
        mh3Var.f380504f = str;
        mh3Var.f380505g = str2;
        mh3Var.f380506h = i18;
        mh3Var.f380507i = str3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
        this.f290223e = u0Var;
        int dispatch = dispatch(sVar, this.f290222d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
        int i17 = this.f290222d.f70713d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
        return i17;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
        com.tencent.mars.xlog.Log.i("NetSceneAdGetSmartPhoneNumber", "errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f290223e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
    }
}
