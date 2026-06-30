package hr3;

/* loaded from: classes11.dex */
public class ha implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283610d;

    public ha(hr3.va vaVar) {
        this.f283610d = vaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        hr3.va vaVar = this.f283610d;
        g0Var.d(14553, 2, 4, vaVar.f284109e.L.d1());
        vaVar.f284108d = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", vaVar.f284109e.L.d1());
        intent.addFlags(67108864);
        j45.l.u(vaVar.f284109e.f197770d, ".ui.chatting.ChattingUI", intent, null);
    }
}
