package dk5;

/* loaded from: classes9.dex */
public class y3 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f235004a;

    public y3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f235004a = selectConversationUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f235004a;
        intent.setClassName(selectConversationUI.getContext(), "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        intent.putExtra("app_msg_id", selectConversationUI.M1);
        intent.putExtra("msg_talker", selectConversationUI.N1);
        intent.putExtra("app_show_share", false);
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI2 = this.f235004a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(selectConversationUI2, arrayList.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI$41", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        selectConversationUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(selectConversationUI2, "com/tencent/mm/ui/transmit/SelectConversationUI$41", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
