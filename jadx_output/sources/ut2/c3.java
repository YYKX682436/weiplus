package ut2;

/* loaded from: classes3.dex */
public final class c3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f430847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f430848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f430849f;

    public c3(ut2.s3 s3Var, gk2.e eVar, cm2.m0 m0Var) {
        this.f430847d = s3Var;
        this.f430848e = eVar;
        this.f430849f = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupPrehotBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.s3 s3Var = this.f430847d;
        kotlinx.coroutines.y0 y0Var = s3Var.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new ut2.b3(s3Var, this.f430848e, this.f430849f, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupPrehotBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
