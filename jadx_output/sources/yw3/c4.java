package yw3;

/* loaded from: classes.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI f466709d;

    public c4(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        this.f466709d = repairerMvvmDBDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmDBDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pm0.v.O(this.f466709d.d, yw3.b4.f466700d);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmDBDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
