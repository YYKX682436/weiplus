package zu2;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2.a0 f475745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.i33 f475746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zu2.q f475747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475748g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475749h;

    public t(zu2.a0 a0Var, r45.i33 i33Var, zu2.q qVar, android.view.View view, android.view.View view2) {
        this.f475745d = a0Var;
        this.f475746e = i33Var;
        this.f475747f = qVar;
        this.f475748g = view;
        this.f475749h = view2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdUIC$onCreate$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zu2.a0 a0Var = this.f475745d;
        jx2.j jVar = a0Var.f475696h;
        boolean z17 = false;
        if (jVar != null && jVar.isShowing()) {
            z17 = true;
        }
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdUIC$onCreate$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        jx2.j jVar2 = new jx2.j(a0Var.getContext(), new jx2.l(a0Var.getContext(), this.f475746e, this.f475747f));
        jVar2.setOnDismissListener(new zu2.r(a0Var));
        android.view.View view2 = this.f475748g;
        if (view2 != null) {
            view2.post(new zu2.s(this.f475749h, view2, jVar2, a0Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdUIC$onCreate$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
