package yw3;

/* loaded from: classes.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerConversationDemoUI f466756d;

    public h0(com.tencent.mm.plugin.repairer.ui.demo.RepairerConversationDemoUI repairerConversationDemoUI) {
        this.f466756d = repairerConversationDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerConversationDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerConversationDemoUI repairerConversationDemoUI = this.f466756d;
        android.content.Intent className = new android.content.Intent().setClassName((android.content.Context) this.f466756d, "com.tencent.mm.plugin.repairer.ui.demo.RepairerConversationDemoUI");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(className);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerConversationDemoUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/demo/RepairerConversationDemoUI$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerConversationDemoUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerConversationDemoUI, "com/tencent/mm/plugin/repairer/ui/demo/RepairerConversationDemoUI$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerConversationDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
