package xt2;

/* loaded from: classes3.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer f456694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f456695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f456696f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f456697g;

    public e1(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer finderLiveShopPromoteContainer, gk2.e eVar, so2.j5 j5Var, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        this.f456694d = finderLiveShopPromoteContainer;
        this.f456695e = eVar;
        this.f456696f = j5Var;
        this.f456697g = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setRecordPlayView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer.c(this.f456694d, this.f456695e, (cm2.m0) this.f456696f, this.f456697g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setRecordPlayView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
