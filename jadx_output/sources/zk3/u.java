package zk3;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473511d;

    public u(zk3.g0 g0Var) {
        this.f473511d = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zk3.g0 g0Var = this.f473511d;
        g0Var.Y6(false, true);
        androidx.appcompat.app.AppCompatActivity activity = g0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.k7((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) a17, true, true, false, false, false, false, false, false, 248, null);
        yj0.a.h(this, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
