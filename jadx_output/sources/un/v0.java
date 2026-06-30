package un;

/* loaded from: classes11.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f429332d;

    public v0(un.g1 g1Var) {
        this.f429332d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/uic/SelectWxChatRoomAddMemberUIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        un.g1 g1Var = this.f429332d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "click selectRecordMsgBt %s", g1Var.T6());
        g1Var.hideVKB();
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", g1Var.T6()).putExtra("finish_direct", true).putExtra("key_record_msg_select", true).putExtra("key_record_select_min_msg_id", g1Var.f429260h).putExtra("key_record_select_msg_num", g1Var.f429257e);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        java.util.ArrayList<java.lang.String> arrayList2 = g1Var.f429259g;
        if (arrayList2 != null) {
            putExtra.putStringArrayListExtra("key_record_selected_msg_list", arrayList2);
        }
        j45.l.v(g1Var.getActivity(), ".ui.chatting.ChattingUI", putExtra, 10001);
        a14.a.a().f582a.f60359f = 1;
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/uic/SelectWxChatRoomAddMemberUIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
