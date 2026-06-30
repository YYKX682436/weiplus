package gp3;

/* loaded from: classes9.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp3.e f274365d;

    public c(gp3.e eVar) {
        this.f274365d = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        gp3.e eVar = this.f274365d;
        intent.putExtra(ya.b.TRANSACTION_ID, eVar.f274367e.f152801x);
        intent.putExtra("receiver_name", eVar.f274367e.T);
        intent.putExtra("resend_msg_from_flag", 1);
        j45.l.j(eVar.f274366d, "remittance", ".ui.RemittanceResendMsgUI", intent, null);
    }
}
