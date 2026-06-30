package ze5;

/* loaded from: classes3.dex */
public final class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471908e;

    public e8(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f471907d = dVar;
        this.f471908e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb5.d dVar = this.f471907d;
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        boolean D = dVar.D();
        com.tencent.mm.storage.f9 f9Var = this.f471908e;
        intent.putExtra("Retr_Msg_content", c01.w9.l(D, f9Var.j(), f9Var.A0()));
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        java.lang.String d17 = te5.e2.d(f9Var);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            intent.putExtra("weAppSourceUserName", d17);
        }
        intent.putExtra("scene_from", 17);
        yb5.d dVar2 = this.f471907d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMarkdownMvvm$ChattingItemMarkdownFrom$onContextItemSelected$task$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar2.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMarkdownMvvm$ChattingItemMarkdownFrom$onContextItemSelected$task$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
