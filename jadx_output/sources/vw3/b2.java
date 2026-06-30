package vw3;

/* loaded from: classes.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI f440888d;

    public b2(com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI repairerLoginAndRegUI) {
        this.f440888d = repairerLoginAndRegUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI.g;
        com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI repairerLoginAndRegUI = this.f440888d;
        repairerLoginAndRegUI.getClass();
        kotlinx.coroutines.l.d(v65.m.f433580a, kotlinx.coroutines.q1.f310568a, null, new vw3.w1(repairerLoginAndRegUI, null), 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
