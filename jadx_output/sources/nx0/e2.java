package nx0;

/* loaded from: classes5.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.g2 f341099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx0.i2 f341101f;

    public e2(nx0.g2 g2Var, int i17, nx0.i2 i2Var) {
        this.f341099d = g2Var;
        this.f341100e = i17;
        this.f341101f = i2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/FilterAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f341099d.f341120f.invoke(java.lang.Integer.valueOf(this.f341100e), this.f341101f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/FilterAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
