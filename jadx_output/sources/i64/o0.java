package i64;

/* loaded from: classes4.dex */
public class o0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f289261d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f289262e;

    public o0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, int i27) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fo3();
        lVar.f70665b = new r45.go3();
        lVar.f70666c = "/cgi-bin/mmoc-bin/adplayinfo/get_sns_ad_metric";
        lVar.f70667d = 4342;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f289261d = a17;
        r45.fo3 fo3Var = (r45.fo3) a17.f70710a.f70684a;
        fo3Var.f374481d = i17;
        fo3Var.f374482e = str;
        fo3Var.f374483f = str2;
        fo3Var.f374484g = str3;
        fo3Var.f374485h = str4;
        fo3Var.f374486i = i18;
        fo3Var.f374487m = i19;
        fo3Var.f374488n = i27;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        this.f289262e = u0Var;
        int dispatch = dispatch(sVar, this.f289261d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        int i17 = this.f289261d.f70713d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        return i17;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        com.tencent.mars.xlog.Log.i("NetSceneDynamicAdDataUpdate", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f289262e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
    }
}
