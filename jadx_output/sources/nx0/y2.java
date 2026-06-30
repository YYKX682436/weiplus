package nx0;

/* loaded from: classes5.dex */
public final class y2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.a3 f341268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx0.b3 f341270f;

    public y2(nx0.a3 a3Var, int i17, nx0.b3 b3Var) {
        this.f341268d = a3Var;
        this.f341269e = i17;
        this.f341270f = b3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/MakeupAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f341268d.f341068f.invoke(java.lang.Integer.valueOf(this.f341269e), this.f341270f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/MakeupAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
