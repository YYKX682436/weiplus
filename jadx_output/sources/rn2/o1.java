package rn2;

/* loaded from: classes15.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397810d;

    public o1(rn2.t2 t2Var) {
        this.f397810d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.t2 t2Var = this.f397810d;
        rn2.t2.g(t2Var, t2Var.F);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
