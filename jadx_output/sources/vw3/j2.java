package vw3;

/* loaded from: classes.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI f440998d;

    public j2(com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI repairerLoginAndRegUI) {
        this.f440998d = repairerLoginAndRegUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI.g;
        com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI repairerLoginAndRegUI = this.f440998d;
        repairerLoginAndRegUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(repairerLoginAndRegUI.getContext(), "com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI");
        repairerLoginAndRegUI.getIntent().putExtra("from_mobile", repairerLoginAndRegUI.U6().f441131b);
        repairerLoginAndRegUI.getIntent().putExtra("switch_login_wx_id", repairerLoginAndRegUI.U6().f441140k);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerLoginAndRegUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI", "goToVerifySms", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerLoginAndRegUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerLoginAndRegUI, "com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI", "goToVerifySms", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
