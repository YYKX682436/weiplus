package in2;

/* loaded from: classes10.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.q0 f292873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.o0 f292874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f292875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f292876g;

    public p0(in2.q0 q0Var, in2.o0 o0Var, int i17, dk2.yg ygVar) {
        this.f292873d = q0Var;
        this.f292874e = o0Var;
        this.f292875f = i17;
        this.f292876g = ygVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in2.q0 q0Var = this.f292873d;
        q0Var.getClass();
        dk2.yg ygVar = this.f292876g;
        boolean z17 = !ygVar.f234396d;
        ygVar.f234396d = z17;
        in2.o0 o0Var = this.f292874e;
        o0Var.f292866d.setChecked(z17);
        yz5.q qVar = q0Var.f292882h;
        if (qVar != null) {
            android.view.View itemView = o0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            qVar.invoke(itemView, java.lang.Integer.valueOf(this.f292875f), ygVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
