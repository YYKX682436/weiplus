package yn1;

/* loaded from: classes11.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a0 f463922d;

    public y(yn1.a0 a0Var) {
        this.f463922d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/migration/MigrationBanner$onInitializeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on banner clicked, showType=");
        yn1.a0 a0Var = this.f463922d;
        sb6.append(a0Var.f463599p);
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationBanner", sb6.toString());
        if (a0Var.f463599p == yn1.x.f463911f) {
            yn1.k4.e(31, true, 0, 0L, null, 28, null);
            i95.m c17 = i95.n0.c(mv.w.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            mv.w.ni((mv.w) c17, context, mv.d0.f331487e, mv.a.f331470f, null, 8, null);
        } else {
            i95.m c18 = i95.n0.c(mv.w.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            android.content.Context context2 = view.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            mv.w.ni((mv.w) c18, context2, mv.d0.f331488f, mv.a.f331470f, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/migration/MigrationBanner$onInitializeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
