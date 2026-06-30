package ut2;

/* loaded from: classes3.dex */
public final class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f431148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f431149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f431150f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f431151g;

    public x2(ut2.s3 s3Var, cm2.m0 m0Var, gk2.e eVar, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        this.f431148d = s3Var;
        this.f431149e = m0Var;
        this.f431150f = eVar;
        this.f431151g = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setUpCartBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.s3.l(this.f431148d, this.f431149e, this.f431150f, this.f431151g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setUpCartBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
