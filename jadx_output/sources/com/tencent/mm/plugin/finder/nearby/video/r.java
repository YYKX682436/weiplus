package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class r extends com.tencent.mm.plugin.finder.storage.vj0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f122215a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122216b;

    public r(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f122215a = context;
        this.f122216b = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(com.tencent.mm.plugin.finder.nearby.video.r r18, in5.s0 r19, com.tencent.mm.plugin.finder.model.BaseFinderFeed r20) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.video.r.f(com.tencent.mm.plugin.finder.nearby.video.r, in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public in5.s a() {
        return new com.tencent.mm.plugin.finder.nearby.video.NearbyVideoStaggeredConfig$getItemConvertFactory$1(this, null);
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(yz5.l lVar) {
        return new com.tencent.mm.plugin.finder.nearby.video.NearbyVideoStaggeredConfig$getItemConvertFactory$1(this, lVar);
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.p2 c() {
        return new com.tencent.mm.plugin.finder.nearby.video.q();
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.RecyclerView.LayoutManager d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(this.f122216b, 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        return finderStaggeredGridLayoutManager;
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.y2 e(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        return ((ey2.o1) pf5.z.f353948a.a(context).a(ey2.o1.class)).f257457f;
    }
}
