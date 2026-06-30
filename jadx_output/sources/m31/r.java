package m31;

/* loaded from: classes9.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI f323205d;

    public r(com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI subscribeMsgDetailUI) {
        this.f323205d = subscribeMsgDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI subscribeMsgDetailUI = this.f323205d;
        intent.putExtra("Chat_User", subscribeMsgDetailUI.f71863i);
        intent.putExtra("key_biz_half_screen_chat_style", true);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("key_template_msg_username", subscribeMsgDetailUI.f71863i);
        intent.putExtra("key_template_history_msg", true);
        intent.putExtra("finish_direct", true);
        intent.putExtra("key_template_msg_id", subscribeMsgDetailUI.f71864m);
        j45.l.u(subscribeMsgDetailUI, "com.tencent.mm.ui.chatting.BizHalfScreenChattingUI", intent, null);
        j31.e.d(4, subscribeMsgDetailUI.f71865n);
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
