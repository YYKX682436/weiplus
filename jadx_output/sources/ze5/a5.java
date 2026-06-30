package ze5;

/* loaded from: classes9.dex */
public final class a5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471816e;

    public a5(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f471815d = dVar;
        this.f471816e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgRecordMvvm$Companion$fillRecordView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = this.f471816e;
        java.lang.String V1 = f9Var.V1();
        if (V1 == null) {
            V1 = f9Var.y0();
        }
        pt.k0 k0Var = (pt.k0) i95.n0.c(pt.k0.class);
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        boolean oj6 = ((ot.q) k0Var).oj(Q0);
        yb5.d dVar = this.f471815d;
        if (oj6) {
            te5.t.f(dVar, f9Var);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("message_id", f9Var.getMsgId());
            intent.putExtra("message_talker", f9Var.Q0());
            intent.putExtra("Retr_Security_Msg_Id", f9Var.getMsgId());
            intent.putExtra("Retr_Security_Msg_Talker", f9Var.Q0());
            intent.putExtra("big_appmsg", false);
            intent.putExtra("blacklist_file_md5", te5.p1.a(f9Var));
            int a17 = c01.h2.a(V1, dVar.x());
            intent.putExtra("prePublishId", "msg_" + f9Var.I0());
            intent.putExtra("preUsername", V1);
            intent.putExtra("preChatName", dVar.x());
            intent.putExtra("preChatTYPE", a17);
            intent.putExtra("msgUsername", V1);
            intent.putExtra("serverMsgID", java.lang.String.valueOf(f9Var.I0()));
            intent.putExtra("chatTypeForAppbrand", k01.d.a(dVar.x()));
            com.tencent.mm.ui.chatting.w5.c(intent, dVar, f9Var);
            com.tencent.mm.modelstat.b.a(f9Var);
            j45.l.j(dVar.g(), "record", ".ui.RecordMsgDetailUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgRecordMvvm$Companion$fillRecordView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
