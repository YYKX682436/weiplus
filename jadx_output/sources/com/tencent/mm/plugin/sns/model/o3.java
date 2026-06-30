package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class o3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164547d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164548e;

    public o3(java.lang.String str, com.tencent.mm.plugin.sns.storage.d2 d2Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tb6();
        lVar.f70665b = new r45.ub6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnswwlikecover";
        lVar.f70667d = 4051;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164547d = a17;
        r45.tb6 tb6Var = (r45.tb6) a17.f70710a.f70684a;
        tb6Var.f386277d = str;
        java.lang.String str2 = d2Var.field_bgUrl;
        tb6Var.f386278e = str2;
        java.lang.String str3 = d2Var.field_imBGmd5sum;
        tb6Var.f386279f = str3;
        java.lang.String str4 = d2Var.field_imBGfileid;
        tb6Var.f386280g = str4;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsWwLikeCover", "SnsWwLikeCover username:%s, bgUrl:%s, bgMd5:%s, fileId:%s", str, str2, str3, str4);
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
        this.f164548e = u0Var;
        int dispatch = dispatch(sVar, this.f164547d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
        return 4051;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsWwLikeCover", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        this.f164548e.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
    }
}
