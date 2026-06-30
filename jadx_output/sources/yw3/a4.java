package yw3;

/* loaded from: classes.dex */
public final class a4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI f466689d;

    public a4(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        this.f466689d = repairerMvvmDBDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmDBDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pm0.v.O(this.f466689d.d, yw3.z3.f466943d);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmDBDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
