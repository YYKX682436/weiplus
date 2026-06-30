package dk5;

/* loaded from: classes9.dex */
public class j4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234689d;

    public j4(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234689d = selectConversationUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/SelectConversationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234689d;
        if (selectConversationUI.E1) {
            selectConversationUI.E7();
        } else {
            java.lang.String stringExtra = selectConversationUI.getIntent().getStringExtra("Select_App_Id");
            if (selectConversationUI.f210992l1 && com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                selectConversationUI.I7();
            } else {
                selectConversationUI.D7();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/SelectConversationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
