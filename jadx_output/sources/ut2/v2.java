package ut2;

/* loaded from: classes3.dex */
public final class v2 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f431126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f431127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f431128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f431129g;

    public v2(ut2.s3 s3Var, cm2.m0 m0Var, gk2.e eVar, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        this.f431126d = s3Var;
        this.f431127e = m0Var;
        this.f431128f = eVar;
        this.f431129g = lVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setUpCartBtn$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.ohu);
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.FloatArray");
        float[] fArr = (float[]) tag;
        ut2.s3 s3Var = this.f431126d;
        rl5.r rVar = new rl5.r(s3Var.itemView.getContext());
        int i17 = (int) fArr[0];
        int i18 = (int) fArr[1];
        android.view.View view2 = s3Var.itemView;
        ut2.t2 t2Var = new ut2.t2(s3Var);
        gk2.e eVar = this.f431128f;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f431129g;
        cm2.m0 m0Var = this.f431127e;
        rVar.h(view2, t2Var, new ut2.u2(m0Var, s3Var, eVar, lVar), i17, i18);
        ut2.s3.o(s3Var, m0Var);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setUpCartBtn$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
