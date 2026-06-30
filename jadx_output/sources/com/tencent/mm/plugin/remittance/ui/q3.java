package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class q3 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.r3 f157896a;

    public q3(com.tencent.mm.plugin.remittance.ui.r3 r3Var) {
        this.f157896a = r3Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.remittance.ui.r3 r3Var = this.f157896a;
            intent.putExtra(ya.b.TRANSACTION_ID, r3Var.f157916b.f157379x0);
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = r3Var.f157916b;
            intent.putExtra("transfer_id", remittanceDetailUI.f157355l1);
            intent.putExtra("receiver_name", remittanceDetailUI.D1);
            intent.putExtra("resend_msg_from_flag", 3);
            intent.putExtra("is_open_im", remittanceDetailUI.J1 ? 1 : 0);
            remittanceDetailUI.getClass();
            j45.l.j(remittanceDetailUI, "remittance", ".ui.RemittanceResendMsgUI", intent, null);
        }
    }
}
