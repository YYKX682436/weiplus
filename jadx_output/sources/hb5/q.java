package hb5;

/* loaded from: classes11.dex */
public class q implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatFavUI f280251d;

    public q(com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI) {
        this.f280251d = bizChatFavUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatFavUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI = this.f280251d;
        long j18 = ((s01.h) bizChatFavUI.f197917f.getItem(i17)).field_bizChatLocalId;
        bizChatFavUI.getClass();
        android.content.Intent intent = new android.content.Intent(bizChatFavUI, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
        intent.addFlags(67108864);
        intent.putExtra("Chat_User", bizChatFavUI.f197919h);
        intent.putExtra("key_biz_chat_id", j18);
        intent.putExtra("finish_direct", true);
        intent.putExtra("key_need_send_video", false);
        intent.putExtra("key_is_biz_chat", true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(bizChatFavUI, arrayList2.toArray(), "com/tencent/mm/ui/bizchat/BizChatFavUI", "goToChattingUI", "(J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bizChatFavUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(bizChatFavUI, "com/tencent/mm/ui/bizchat/BizChatFavUI", "goToChattingUI", "(J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.sdk.platformtools.u3.i(new hb5.s(bizChatFavUI), 500L);
        yj0.a.h(this, "com/tencent/mm/ui/bizchat/BizChatFavUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
