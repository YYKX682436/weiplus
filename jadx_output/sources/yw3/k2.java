package yw3;

/* loaded from: classes2.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterStatusDemoUI f466784d;

    public k2(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterStatusDemoUI repairerFlutterStatusDemoUI) {
        this.f466784d = repairerFlutterStatusDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterStatusDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map l17 = kz5.c1.l(new jz5.l("status_card_scene", 1));
        i95.m c17 = i95.n0.c(xe0.c0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        xe0.c0.d9((xe0.c0) c17, this.f466784d, "StatusDemo", l17, null, null, 24, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterStatusDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
