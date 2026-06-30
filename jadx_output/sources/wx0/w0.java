package wx0;

/* loaded from: classes5.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.z0 f450559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450561f;

    public w0(wx0.z0 z0Var, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        this.f450559d = z0Var;
        this.f450560e = viewGroup;
        this.f450561f = viewGroup2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/MaxRecordDurationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.j7(m7Var, null), 3, null);
        wx0.z0 z0Var = this.f450559d;
        android.view.View view2 = z0Var.f331814d;
        kotlin.jvm.internal.o.g(view2, "<this>");
        view2.performHapticFeedback(6);
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView selectorView = z0Var.f450575h;
        if (selectorView == null) {
            z0Var.getClass();
            android.content.Context context = z0Var.f331814d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            selectorView = new com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView(context, null, 0, 6, null);
            selectorView.setId(android.view.View.generateViewId());
            selectorView.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
            selectorView.b(com.tencent.mm.R.string.jv9, com.tencent.mm.R.string.jxf, com.tencent.mm.R.string.jx9);
            selectorView.setElevation(j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 16.0f);
            selectorView.setCheckedBtn(com.tencent.mm.R.id.f486780s46);
            selectorView.setOnCheckedChangeListener(new wx0.y0(z0Var));
            z0Var.f450575h = selectorView;
            this.f450561f.addView(selectorView);
        }
        selectorView.c(z0Var.f331814d, this.f450560e.getWidth());
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/MaxRecordDurationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
