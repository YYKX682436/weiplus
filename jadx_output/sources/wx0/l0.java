package wx0;

/* loaded from: classes5.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.s0 f450508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450510f;

    public l0(wx0.s0 s0Var, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        this.f450508d = s0Var;
        this.f450509e = viewGroup;
        this.f450510f = viewGroup2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/FlashControlPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.g7(m7Var, null), 3, null);
        wx0.s0 s0Var = this.f450508d;
        android.view.View view2 = s0Var.f331814d;
        kotlin.jvm.internal.o.g(view2, "<this>");
        view2.performHapticFeedback(6);
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView selectorView = s0Var.f450541n;
        if (selectorView == null) {
            s0Var.getClass();
            android.content.Context context = s0Var.f331814d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            selectorView = new com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView(context, null, 0, 6, null);
            selectorView.setId(android.view.View.generateViewId());
            selectorView.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
            selectorView.b(com.tencent.mm.R.string.oif, com.tencent.mm.R.string.mco, com.tencent.mm.R.string.mch);
            selectorView.setElevation(j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 16.0f);
            selectorView.setOnCheckedChangeListener(new wx0.r0(s0Var));
            s0Var.f450541n = selectorView;
            this.f450510f.addView(selectorView);
        }
        selectorView.c(s0Var.f331814d, this.f450509e.getWidth());
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/FlashControlPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
