package yw3;

/* loaded from: classes.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI f466697d;

    public b1(com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
        this.f466697d = repairerDemoSelectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI repairerDemoSelectContactUI = this.f466697d;
        intent.setClassName(repairerDemoSelectContactUI.getContext(), "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        intent.putExtra("titile", "选择群聊");
        intent.putExtra("key_confirm_menu_name", repairerDemoSelectContactUI.getContext().getString(com.tencent.mm.R.string.f490507x1));
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 82);
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("key_filter_associate_chat_room", true);
        intent.putExtra("min_limit_num", 1);
        intent.putExtra("max_limit_num", 3);
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = repairerDemoSelectContactUI.getContext();
        cVar.d(intent);
        cVar.a("com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        cVar.b(com.tencent.mm.ui.halfscreen.custom.SelectChatroomHalfScreenDialogFragment.class);
        cVar.i(yw3.a1.f466684a);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
