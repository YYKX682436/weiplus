package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class md implements com.tencent.mm.ui.chatting.viewitems.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f204575b;

    public md(yb5.d dVar, java.lang.CharSequence charSequence) {
        this.f204574a = dVar;
        this.f204575b = charSequence;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.i0
    public void a(android.text.SpannableString spannableString) {
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.i0
    public void b(android.view.View view) {
        yb5.d dVar = this.f204574a;
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.TextPreviewUI.class);
        intent.addFlags(67108864);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar != null) {
            intent.putExtra("Chat_Msg_Id", erVar.c().getMsgId());
            intent.putExtra("Chat_User", erVar.c().Q0());
            intent.putExtra("key_chat_from", view.getContext().getClass().getName());
            intent.putExtra("key_chat_text", this.f204575b);
        }
        intent.putExtra("is_group_chat", dVar.D());
        android.app.Activity g17 = dVar.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(view.getContext());
    }
}
