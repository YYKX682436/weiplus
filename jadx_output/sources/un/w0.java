package un;

/* loaded from: classes11.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f429336d;

    public w0(un.g1 g1Var) {
        this.f429336d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/uic/SelectWxChatRoomAddMemberUIC$onCreate$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "click warn to retry");
        un.g1 g1Var = this.f429336d;
        g1Var.f429264o = null;
        g1Var.f429268s = null;
        g1Var.f429262m = false;
        g1Var.f429266q = false;
        g1Var.f429261i = true;
        g1Var.f429265p = true;
        g1Var.X6();
        ((qg5.p0) ((rd0.v0) i95.n0.c(rd0.v0.class))).getClass();
        java.util.List list = com.tencent.mm.ui.chatting.x3.f206228a.f206201a;
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SelectWxChatRoomAddMemberUIC", "onCreate: msgList is Empty");
        } else {
            g1Var.f429267r = new java.util.ArrayList(list);
        }
        android.util.Pair i17 = com.tencent.mm.ui.chatting.x3.i(g1Var.getActivity(), "msginfo@fakeuser", true, "msginfo@fakeuser");
        g1Var.f429263n = i17;
        if (((java.lang.Boolean) i17.second).booleanValue()) {
            g1Var.Y6();
        } else {
            ((com.tencent.mm.chatroom.ui.uic.SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1) ((jz5.n) g1Var.f429269t).getValue()).alive();
        }
        a14.a.a().f589h++;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "click warn to retry, msgId:%s direct:%s", java.lang.Long.valueOf(((com.tencent.mm.plugin.msg.MsgIdTalker) g1Var.f429263n.first).f149480d), g1Var.f429263n.second);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/uic/SelectWxChatRoomAddMemberUIC$onCreate$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
