package wx0;

/* loaded from: classes5.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.k0 f450483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450485f;

    public f0(wx0.k0 k0Var, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        this.f450483d = k0Var;
        this.f450484e = viewGroup;
        this.f450485f = viewGroup2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/CountdownPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.e7(m7Var, null), 3, null);
        wx0.k0 k0Var = this.f450483d;
        android.view.View view2 = k0Var.f331814d;
        kotlin.jvm.internal.o.g(view2, "<this>");
        view2.performHapticFeedback(6);
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView selectorView = k0Var.f450503h;
        if (selectorView == null) {
            k0Var.getClass();
            android.content.Context context = k0Var.f331814d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            selectorView = new com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView(context, null, 0, 6, null);
            selectorView.setId(android.view.View.generateViewId());
            selectorView.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
            selectorView.b(com.tencent.mm.R.string.n1m, com.tencent.mm.R.string.n1l, com.tencent.mm.R.string.n1k);
            selectorView.setElevation(j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 16.0f);
            selectorView.setOnCheckedChangeListener(new wx0.i0(k0Var));
            k0Var.f450503h = selectorView;
            this.f450485f.addView(selectorView);
        }
        selectorView.c(k0Var.f331814d, this.f450484e.getWidth());
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/CountdownPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
