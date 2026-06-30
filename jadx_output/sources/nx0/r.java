package nx0;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.u f341206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx0.x f341208f;

    public r(nx0.u uVar, int i17, nx0.x xVar) {
        this.f341206d = uVar;
        this.f341207e = i17;
        this.f341208f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f341206d.f341235g.invoke(java.lang.Integer.valueOf(this.f341207e), this.f341208f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
