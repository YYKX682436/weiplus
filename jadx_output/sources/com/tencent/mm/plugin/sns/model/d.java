package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class d implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f164129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164130e;

    public d(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, long j17) {
        this.f164130e = adLandingPagesProxy;
        this.f164129d = j17;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$2");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "getBtnPersonalWxUserNameMM, errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        long j17 = this.f164129d;
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = this.f164130e;
        if (i17 == 0 && i18 == 0) {
            r45.tr3 tr3Var = (r45.tr3) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
            if (tr3Var == null || android.text.TextUtils.isEmpty(tr3Var.f386744e)) {
                com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getBtnPersonalWxUserNameMM, rsp==null");
                adLandingPagesProxy.CLIENT_CALL("onSearchContact", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), null);
            } else {
                adLandingPagesProxy.CLIENT_CALL("onGetBtnPersonalWxUserName", java.lang.Long.valueOf(j17), tr3Var.f386743d, tr3Var.f386744e);
                adLandingPagesProxy.doSearchContactMM(j17, tr3Var.f386744e);
            }
        } else {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getBtnPersonalWxUserNameMM, failed");
            adLandingPagesProxy.CLIENT_CALL("onSearchContact", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), null);
        }
        gm0.j1.d().q(m1Var.getType(), this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$2");
    }
}
