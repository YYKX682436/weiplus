package nx0;

/* loaded from: classes5.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.q1 f341187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx0.r1 f341189f;

    public o1(nx0.q1 q1Var, int i17, nx0.r1 r1Var) {
        this.f341187d = q1Var;
        this.f341188e = i17;
        this.f341189f = r1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/FaceEffectAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f341187d.f341204f.invoke(java.lang.Integer.valueOf(this.f341188e), this.f341189f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/FaceEffectAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
