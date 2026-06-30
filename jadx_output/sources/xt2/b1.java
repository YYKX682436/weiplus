package xt2;

/* loaded from: classes3.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer f456628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f456629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f456630f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f456631g;

    public b1(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer finderLiveShopPromoteContainer, gk2.e eVar, so2.j5 j5Var, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        this.f456628d = finderLiveShopPromoteContainer;
        this.f456629e = eVar;
        this.f456630f = j5Var;
        this.f456631g = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setRecordPlayView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer.c(this.f456628d, this.f456629e, (cm2.m0) this.f456630f, this.f456631g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setRecordPlayView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
