package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes7.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI f180567d;

    public p0(com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI showWxPayAgreementsUI) {
        this.f180567d = showWxPayAgreementsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/ShowWxPayAgreementsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.events.WxPayPrivacyDutyResultEvent wxPayPrivacyDutyResultEvent = new com.tencent.mm.autogen.events.WxPayPrivacyDutyResultEvent();
        am.y20 y20Var = wxPayPrivacyDutyResultEvent.f54997g;
        y20Var.f8423a = false;
        y20Var.f8424b = false;
        wxPayPrivacyDutyResultEvent.e();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15236, 3);
        this.f180567d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/ShowWxPayAgreementsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
