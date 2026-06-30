package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public class jj0 extends com.tencent.mm.plugin.finder.storage.vj0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f127016a;

    /* renamed from: b, reason: collision with root package name */
    public final tu2.b f127017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f127018c;

    static {
        new com.tencent.mm.plugin.finder.storage.hj0(null);
    }

    public jj0(int i17, tu2.b itemViewConfig) {
        kotlin.jvm.internal.o.g(itemViewConfig, "itemViewConfig");
        this.f127016a = i17;
        this.f127017b = itemViewConfig;
        this.f127018c = 2;
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(yz5.l lVar) {
        return new com.tencent.mm.plugin.finder.storage.FinderStaggeredConfig$getItemConvertFactory$1(this, lVar);
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.p2 c() {
        return new com.tencent.mm.plugin.finder.storage.ij0();
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.RecyclerView.LayoutManager d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(f(), 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        return finderStaggeredGridLayoutManager;
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.y2 e(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        return ((ey2.o1) pf5.z.f353948a.a(context).a(ey2.o1.class)).f257457f;
    }

    public int f() {
        return this.f127018c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jj0(int r1, tu2.b r2, int r3, kotlin.jvm.internal.i r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = -1
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto L11
            tu2.b r2 = new tu2.b
            r2.<init>()
            r3 = 0
            r2.f422131a = r3
        L11:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.storage.jj0.<init>(int, tu2.b, int, kotlin.jvm.internal.i):void");
    }
}
