package pk2;

/* loaded from: classes3.dex */
public final class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f355946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f355947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f355949g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f355950h;

    public l3(r45.t62 t62Var, pk2.q3 q3Var, android.view.View view, r45.t62 t62Var2, r45.t62 t62Var3) {
        this.f355946d = t62Var;
        this.f355947e = q3Var;
        this.f355948f = view;
        this.f355949g = t62Var2;
        this.f355950h = t62Var3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.t62 t62Var = this.f355946d;
        if (!t62Var.getBoolean(1)) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        t62Var.set(1, java.lang.Boolean.FALSE);
        android.view.View rootView = this.f355948f;
        kotlin.jvm.internal.o.f(rootView, "$rootView");
        pk2.q3 q3Var = this.f355947e;
        q3Var.w(rootView, t62Var);
        kotlin.jvm.internal.o.f(rootView, "$rootView");
        q3Var.x(rootView, this.f355949g, this.f355950h);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
