package dk5;

/* loaded from: classes.dex */
public class v3 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f234960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234961b;

    public v3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, ot0.q qVar) {
        this.f234961b = selectConversationUI;
        this.f234960a = qVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234961b;
        android.content.Intent intent = new android.content.Intent(selectConversationUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.RetransmitPreviewUI.class);
        intent.putExtra("Retr_Msg_content", this.f234960a.f348654f);
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI2 = this.f234961b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(selectConversationUI2, arrayList.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI$39", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        selectConversationUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(selectConversationUI2, "com/tencent/mm/ui/transmit/SelectConversationUI$39", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(selectConversationUI.getContext());
    }
}
