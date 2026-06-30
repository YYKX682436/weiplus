package kd2;

/* loaded from: classes10.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f306841d;

    public u0(android.view.View.OnClickListener onClickListener) {
        this.f306841d = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/floatball/FinderVideoPassiveMiniViewHelper$generateCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kd2.o0 o0Var = kd2.p1.N;
        kd2.b0 E0 = o0Var.a().E0();
        E0.b();
        E0.d();
        kd2.q0 q0Var = o0Var.a().f306787x;
        if (q0Var != null && q0Var.f306806g != null) {
            o0Var.a().Q0(1);
        }
        this.f306841d.onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/floatball/FinderVideoPassiveMiniViewHelper$generateCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
