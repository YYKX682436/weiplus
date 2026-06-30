package lu2;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321377d;

    public k(android.content.Context context) {
        this.f321377d = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.app.Activity activity;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/tools/FinderRedDotMockHelper$show$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lu2.m mVar = lu2.m.f321379a;
        android.content.Context context = this.f321377d;
        kotlin.jvm.internal.o.f(context, "$context");
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        if (activity == null) {
            db5.t7.makeText(context, "顶部activity是空的", 0).show();
        } else {
            com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(activity, lu2.m.f321384f, lu2.m.f321385g, lu2.m.f321386h);
            c0Var.i(0);
            c0Var.f212260u = new lu2.l(c0Var);
            c0Var.l();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/tools/FinderRedDotMockHelper$show$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
