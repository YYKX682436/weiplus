package yw3;

/* loaded from: classes.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI f466888d;

    public t1(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI repairerFlutterHybridNavigatorDemoUI) {
        this.f466888d = repairerFlutterHybridNavigatorDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterHybridNavigatorDemoUI$onCreate$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new yw3.s1(this.f466888d, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterHybridNavigatorDemoUI$onCreate$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
