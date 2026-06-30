package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class bb0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f111997p;

    /* renamed from: q, reason: collision with root package name */
    public final int f111998q;

    /* renamed from: r, reason: collision with root package name */
    public int f111999r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f112000s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f112001t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f111997p = statusMonitor;
        this.f111998q = 3;
        this.f111999r = 3;
        this.f112000s = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.fmo);
        this.f112001t = new com.tencent.mm.sdk.platformtools.b4("FinderLiveSwitchModeTimer", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.live.plugin.za0(this), true);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        K0(0);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f112001t;
        b4Var.d();
        b4Var.c(1000L, 1000L);
    }
}
