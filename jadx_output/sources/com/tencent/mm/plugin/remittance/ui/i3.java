package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class i3 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.j3 f157761a;

    public i3(com.tencent.mm.plugin.remittance.ui.j3 j3Var) {
        this.f157761a = j3Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.remittance.ui.j3 j3Var = this.f157761a;
            intent.putExtra(ya.b.TRANSACTION_ID, j3Var.f157779b.f157379x0);
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = j3Var.f157779b;
            intent.putExtra("transfer_id", remittanceDetailUI.f157355l1);
            intent.putExtra("receiver_name", remittanceDetailUI.D1);
            intent.putExtra("resend_msg_from_flag", 3);
            intent.putExtra("is_open_im", remittanceDetailUI.J1 ? 1 : 0);
            remittanceDetailUI.getClass();
            j45.l.j(remittanceDetailUI, "remittance", ".ui.RemittanceResendMsgUI", intent, null);
        }
    }
}
