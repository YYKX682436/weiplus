package xn2;

/* loaded from: classes2.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f455588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f455589e;

    public y0(xn2.f1 f1Var, android.view.View view) {
        this.f455588d = f1Var;
        this.f455589e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$retry$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xn2.p0 p0Var = (xn2.p0) this.f455588d.f455493e;
        p0Var.j().requestRefresh();
        p0Var.f455552j++;
        android.view.View view2 = this.f455589e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$retry$2$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$retry$2$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$retry$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
