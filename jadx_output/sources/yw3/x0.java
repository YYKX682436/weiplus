package yw3;

/* loaded from: classes.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI f466924d;

    public x0(com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
        this.f466924d = repairerDemoSelectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class))).getClass();
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI activity = this.f466924d;
        kotlin.jvm.internal.o.g(activity, "activity");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("titile", "选择自动备份的聊天");
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.k.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.v0.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.h1.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, com.tencent.mm.ui.mvvm.uic.conversation.recent.e0.class);
        pf5.j0.a(intent, cj5.j0.class);
        intent.putExtra("KEY_IS_ONLY_MULTI_SELECT_MODE", true);
        pf5.j0.a(intent, ej5.b.class);
        pf5.j0.a(intent, cj5.m0.class);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI repairerDemoSelectContactUI = this.f466924d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerDemoSelectContactUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerDemoSelectContactUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerDemoSelectContactUI, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
