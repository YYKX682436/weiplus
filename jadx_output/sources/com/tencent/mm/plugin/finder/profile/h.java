package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class h extends com.tencent.mm.plugin.finder.storage.vj0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f123382a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f123383b;

    /* renamed from: c, reason: collision with root package name */
    public final int f123384c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f123385d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f123386e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f123387f;

    /* renamed from: g, reason: collision with root package name */
    public final int f123388g;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.F9).getValue()).r()).intValue() == 1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(android.app.Activity r2, boolean r3, int r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r2, r0)
            r1.<init>()
            r1.f123382a = r2
            r1.f123383b = r3
            r1.f123384c = r4
            r1.f123385d = r5
            r1.f123386e = r6
            r2 = 2
            if (r4 == 0) goto L17
            if (r4 != r2) goto L33
        L17:
            r3 = 1
            if (r5 != 0) goto L34
            com.tencent.mm.plugin.finder.storage.t70 r4 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r4 = com.tencent.mm.plugin.finder.storage.t70.F9
            jz5.n r4 = (jz5.n) r4
            java.lang.Object r4 = r4.getValue()
            lb2.j r4 = (lb2.j) r4
            java.lang.Object r4 = r4.r()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 != r3) goto L33
            goto L34
        L33:
            r3 = 0
        L34:
            r1.f123387f = r3
            if (r3 == 0) goto L39
            r2 = 3
        L39:
            r1.f123388g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.h.<init>(android.app.Activity, boolean, int, boolean, boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(yz5.l lVar) {
        return new com.tencent.mm.plugin.finder.profile.FinderProfileLayoutConfig$getItemConvertFactory$1(this, lVar);
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.p2 c() {
        return this.f123388g == 3 ? new com.tencent.mm.plugin.finder.profile.f(this) : new com.tencent.mm.plugin.finder.profile.g();
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.RecyclerView.LayoutManager d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(context, this.f123388g);
        gridLayoutManager.setItemPrefetchEnabled(true);
        return gridLayoutManager;
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.y2 e(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f123387f ? ((ey2.o1) pf5.z.f353948a.a(context).a(ey2.o1.class)).f257458g : ((ey2.o1) pf5.z.f353948a.a(context).a(ey2.o1.class)).f257457f;
    }
}
