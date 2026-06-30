package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class a1 implements ca4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 f165048a;

    public a1(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var) {
        this.f165048a = v0Var;
    }

    @Override // ca4.a0
    public void a(java.lang.String str, boolean z17, java.lang.String str2, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$14");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var = this.f165048a;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.S(v0Var);
        java.lang.String str3 = "";
        if (bundle != null) {
            str3 = bundle.getString("jsCallbackId", "");
        } else {
            com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "qr onFinish, extParams==null");
        }
        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "qr onFinish, isSucc=" + z17 + ", errMsg=" + str2 + ", url=" + str + ", jsCallbackId=" + str3);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.T(v0Var, str3, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$14");
    }
}
