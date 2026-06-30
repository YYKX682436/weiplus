package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class k6 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 implements java.io.Serializable {
    public final ab4.q B;
    public com.tencent.mm.ui.widget.dialog.u3 C;
    public java.lang.String D;
    public final com.tencent.mm.plugin.sns.model.t E;

    public k6(android.content.Context context, ab4.q qVar, android.view.ViewGroup viewGroup) {
        super(context, qVar, viewGroup);
        this.E = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i6(this);
        this.B = qVar;
        this.f165386t.b("wxGroupInfo", qVar.f2889z1);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
        java.lang.String o17 = u().o();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (o17 == null) {
            o17 = "";
        }
        ab4.q qVar = this.B;
        if (android.text.TextUtils.isEmpty(qVar.f2889z1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPagePersonalProfileBtnComp", "onBtnClick, wxGroupInfo==null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPagePersonalProfileBtnComp", "onBtnClick, btnInfo=" + qVar + ", uxinfo=" + o17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
            try {
                if (this.C == null) {
                    android.content.Context context = this.f165049d;
                    this.C = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.ggc), true, true, null);
                }
                if (!this.C.isShowing()) {
                    this.C.show();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPagePersonalProfileBtnComp", "showLoading exp=" + th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getBtnPersonalWxUserName(o17, qVar.f2889z1, this.E);
        }
        P();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
    }
}
