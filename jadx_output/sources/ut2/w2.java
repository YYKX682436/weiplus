package ut2;

/* loaded from: classes3.dex */
public final class w2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f431139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f431140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f431141f;

    public w2(ut2.s3 s3Var, cm2.m0 m0Var, gk2.e eVar) {
        this.f431139d = s3Var;
        this.f431140e = m0Var;
        this.f431141f = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setUpCartBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.s3 s3Var = this.f431139d;
        cm2.m0 m0Var = this.f431140e;
        s3Var.T(m0Var);
        kotlinx.coroutines.y0 y0Var = s3Var.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new ut2.z0(s3Var, this.f431141f, m0Var, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setUpCartBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
