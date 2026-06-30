package eg4;

/* loaded from: classes4.dex */
public class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI f252825d;

    public w1(com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI) {
        this.f252825d = fMessageConversationUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        js.x0 b17 = r61.q0.b();
        js.x0 x0Var = js.x0.SUCC;
        com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI = this.f252825d;
        if (b17 != x0Var) {
            android.content.Intent intent = new android.content.Intent(fMessageConversationUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
            intent.putExtra("key_upload_scene", 5);
            com.tencent.mm.ui.MMWizardActivity.X6(fMessageConversationUI.getContext(), intent);
        } else {
            com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI2 = this.f252825d;
            android.content.Intent intent2 = new android.content.Intent(fMessageConversationUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(fMessageConversationUI2, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            fMessageConversationUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(fMessageConversationUI2, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        tf5.j.O6(fMessageConversationUI, "mobile_contacts_add");
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
