package yw3;

/* loaded from: classes.dex */
public final class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI f466844d;

    public p1(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI repairerFlutterHybridNavigatorDemoUI) {
        this.f466844d = repairerFlutterHybridNavigatorDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Class<?> cls;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterHybridNavigatorDemoUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String n07 = com.tencent.mm.sdk.platformtools.t8.n0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        try {
            cls = java.lang.Class.forName("com.tencent.mm.plugin.flutter.debug.leak.FlutterLeakActivity");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        if (cls != null && !kotlin.jvm.internal.o.b(n07, cls.getSimpleName())) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new yw3.o1(this.f466844d, cls, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterHybridNavigatorDemoUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
