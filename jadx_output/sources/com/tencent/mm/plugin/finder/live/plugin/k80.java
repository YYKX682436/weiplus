package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k80 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.Set f113203r = new java.util.LinkedHashSet();

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113204p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f113205q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k80(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113204p = statusMonitor;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.bzp);
        this.f113205q = findViewById;
        K0(8);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.j80(this));
        zl2.r4.b(zl2.r4.f473950a, root, this, false, false, 12, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        if (i17 == 0) {
            qo0.c.a(this.f113204p, qo0.b.f365357g5, null, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return zl2.r4.f473950a.f2(S0());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }
}
