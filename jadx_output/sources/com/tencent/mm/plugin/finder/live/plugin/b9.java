package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b9 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f111986p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f111987q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f111988r;

    /* renamed from: s, reason: collision with root package name */
    public int f111989s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f111990t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f111991u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f111992v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f111986p = statusMonitor;
        this.f111987q = "Finder.FinderLiveAnchorPauseRecoveryPlugin";
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.cjv);
        this.f111988r = textView;
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f486579lq3);
        this.f111989s = 3;
        root.setOnClickListener(com.tencent.mm.plugin.finder.live.plugin.u8.f114534d);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        this.f111992v = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.a9(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 201) {
            this.f111990t = false;
            t1();
        } else {
            if (ordinal != 216) {
                return;
            }
            this.f111990t = true;
            t1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f111992v).getValue()).d();
        this.f111991u = false;
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
        java.lang.String str = this.f111987q;
        com.tencent.mm.sdk.platformtools.Log.c(str, "show onlyShowView:" + this.f111990t, new java.lang.Object[0]);
        if (this.f111990t && this.f111991u) {
            com.tencent.mars.xlog.Log.i(str, "onlyShowView and showing resume, ignore");
            com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(R0(), false, 1, null);
            return;
        }
        this.f111989s = 3;
        this.f111988r.setText(java.lang.String.valueOf(3));
        this.f111991u = true;
        jz5.g gVar = this.f111992v;
        ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) gVar).getValue()).d();
        ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) gVar).getValue()).c(1000L, 1000L);
        com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(R0(), false, 1, null);
        K0(0);
    }
}
