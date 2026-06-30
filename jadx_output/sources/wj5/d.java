package wj5;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.f f446789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj5.b f446790e;

    public d(wj5.f fVar, xj5.b bVar) {
        this.f446789d = fVar;
        this.f446790e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/ChatRoomInviteTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nn.i iVar = (nn.i) i95.n0.c(nn.i.class);
        wj5.f fVar = this.f446789d;
        android.app.Activity g17 = fVar.f446797e.g();
        java.lang.String x17 = fVar.f446797e.x();
        ((nn.j) iVar).getClass();
        android.content.Intent intent = new android.content.Intent(g17, (java.lang.Class<?>) com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI.class);
        lk5.s.e(intent, true);
        intent.putExtra("intent_chatroom_username", x17);
        intent.putExtra("intent_from_chattingui", true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(g17, arrayList2.toArray(), "com/tencent/mm/chatroom/plugin/PluginChatroomUI", "gotoRoomAccessVerifyApplicationUI", "(Landroid/content/Context;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(g17, "com/tencent/mm/chatroom/plugin/PluginChatroomUI", "gotoRoomAccessVerifyApplicationUI", "(Landroid/content/Context;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f446790e.f454897e = 1;
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/ChatRoomInviteTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
