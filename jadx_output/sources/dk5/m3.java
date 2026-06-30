package dk5;

/* loaded from: classes.dex */
public class m3 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234732a;

    public m3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234732a = selectConversationUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234732a;
        android.content.Intent intent = new android.content.Intent(selectConversationUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.RetransmitPreviewUI.class);
        intent.putExtra("Retr_Msg_content", selectConversationUI.X1);
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI2 = this.f234732a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(selectConversationUI2, arrayList.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI$30", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        selectConversationUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(selectConversationUI2, "com/tencent/mm/ui/transmit/SelectConversationUI$30", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(selectConversationUI.getContext());
    }
}
