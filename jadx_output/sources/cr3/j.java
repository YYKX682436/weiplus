package cr3;

/* loaded from: classes11.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f221952d;

    public j(cr3.d0 d0Var) {
        this.f221952d = d0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        cr3.d0 d0Var = this.f221952d;
        g0Var.d(14553, 2, 4, d0Var.f221932e.d1());
        d0Var.f221936i = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", d0Var.f221932e.d1());
        intent.addFlags(67108864);
        j45.l.u(d0Var.f221931d, ".ui.chatting.ChattingUI", intent, null);
    }
}
