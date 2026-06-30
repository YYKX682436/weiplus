package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class en implements com.tencent.mm.ui.chatting.viewitems.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.go f203893b;

    public en(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.go goVar) {
        this.f203892a = dVar;
        this.f203893b = goVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.i0
    public void a(android.text.SpannableString spannableString) {
        this.f203893b.S = spannableString;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.i0
    public void b(android.view.View view) {
        yb5.d dVar = this.f203892a;
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.TextPreviewUI.class);
        intent.addFlags(67108864);
        com.tencent.mm.ui.chatting.viewitems.go goVar = (com.tencent.mm.ui.chatting.viewitems.go) view.getTag();
        if (goVar != null) {
            intent.putExtra("Chat_Msg_Id", goVar.c().getMsgId());
            intent.putExtra("Chat_User", goVar.c().Q0());
            intent.putExtra("key_chat_from", view.getContext().getClass().getName());
            intent.putExtra("key_chat_text", ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).q0(goVar.c(), false));
            com.tencent.mm.ui.chatting.viewitems.bo.a(goVar.c(), 1, 0);
        }
        intent.putExtra("is_group_chat", dVar.D());
        android.app.Activity g17 = dVar.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$6", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$6", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(view.getContext());
    }
}
