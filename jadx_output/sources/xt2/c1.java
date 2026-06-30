package xt2;

/* loaded from: classes3.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f456655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer f456656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f456657f;

    public c1(com.tencent.mm.plugin.finder.live.plugin.l lVar, com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer finderLiveShopPromoteContainer, so2.j5 j5Var) {
        this.f456655d = lVar;
        this.f456656e = finderLiveShopPromoteContainer;
        this.f456657f = j5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setRecordPlayView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f456655d;
        if (lVar != null) {
            int i17 = com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer.f126302n;
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer finderLiveShopPromoteContainer = this.f456656e;
            finderLiveShopPromoteContainer.getClass();
            com.tencent.mm.plugin.finder.live.util.y.m(lVar, null, null, new xt2.t0(finderLiveShopPromoteContainer, lVar, this.f456657f, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setRecordPlayView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
