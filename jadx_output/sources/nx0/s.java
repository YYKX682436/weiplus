package nx0;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.u f341218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx0.x f341220f;

    public s(nx0.u uVar, int i17, nx0.x xVar) {
        this.f341218d = uVar;
        this.f341219e = i17;
        this.f341220f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f341218d.f341235g.invoke(java.lang.Integer.valueOf(this.f341219e), this.f341220f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
