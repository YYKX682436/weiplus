package yw3;

/* loaded from: classes.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI f466915d;

    public w0(com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
        this.f466915d = repairerDemoSelectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qd0.q0 q0Var = (qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class));
        q0Var.getClass();
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI context = this.f466915d;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent Ui = q0Var.Ui(context, true, false, true);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI repairerDemoSelectContactUI = this.f466915d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(Ui);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerDemoSelectContactUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerDemoSelectContactUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerDemoSelectContactUI, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
