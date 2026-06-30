package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes7.dex */
public class n0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.o0 f180503a;

    public n0(com.tencent.mm.plugin.wallet_core.ui.o0 o0Var) {
        this.f180503a = o0Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowWxPayAgreementsUI", "agree, marketingSwitchClosed = %s", str);
        boolean parseBoolean = java.lang.Boolean.parseBoolean(str);
        com.tencent.mm.autogen.events.WxPayPrivacyDutyResultEvent wxPayPrivacyDutyResultEvent = new com.tencent.mm.autogen.events.WxPayPrivacyDutyResultEvent();
        am.y20 y20Var = wxPayPrivacyDutyResultEvent.f54997g;
        y20Var.f8423a = true;
        y20Var.f8424b = parseBoolean;
        wxPayPrivacyDutyResultEvent.e();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15236, 2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_marketing_switch_closed", parseBoolean);
        com.tencent.mm.plugin.wallet_core.ui.o0 o0Var = this.f180503a;
        o0Var.f180546d.setResult(-1, intent);
        o0Var.f180546d.finish();
    }
}
