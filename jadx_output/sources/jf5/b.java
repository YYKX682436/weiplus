package jf5;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf5.c f299437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f299438e;

    public b(jf5.c cVar, java.lang.String str) {
        this.f299437d = cVar;
        this.f299438e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jf5.c cVar = this.f299437d;
        android.content.Intent intent = new android.content.Intent(cVar.f299440a.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_Id", cVar.f299441b.getMsgId());
        intent.putExtra("Retr_MsgTalker", cVar.f299441b.Q0());
        intent.putExtra("Retr_Msg_content", this.f299438e);
        intent.putExtra("Retr_Msg_Type", 4);
        intent.putExtra("scene_from", 17);
        yb5.d dVar = cVar.f299440a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/ChattingSelectionActionDelegate$onRetransmitSelection$task$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/ChattingSelectionActionDelegate$onRetransmitSelection$task$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
