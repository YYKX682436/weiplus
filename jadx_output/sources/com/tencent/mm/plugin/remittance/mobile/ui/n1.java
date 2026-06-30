package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes5.dex */
public class n1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f156697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156698b;

    public n1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f156698b = mobileRemittanceUI;
        this.f156697a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156698b;
        r45.bd0 bd0Var = (r45.bd0) ((java.util.ArrayList) mobileRemittanceUI.f156621n).get(mobileRemittanceUI.S);
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "DelayOption View click confirm! (code:%s option:%s)", java.lang.Integer.valueOf(bd0Var.f370674e), bd0Var.f370673d);
        mobileRemittanceUI.T = mobileRemittanceUI.S;
        mobileRemittanceUI.R = bd0Var.f370674e;
        mobileRemittanceUI.M.setText(bd0Var.f370673d);
        this.f156697a.B();
    }
}
