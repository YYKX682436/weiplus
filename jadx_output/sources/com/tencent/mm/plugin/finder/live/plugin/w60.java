package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w60 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f114877p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f114878q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f114879r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f114880s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114877p = rootView;
        this.f114878q = "FinderLivePromoteBubbleStatusPlugin";
        this.f114879r = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.u60(this));
        this.f114880s = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.t60(this));
        rootView.setOnTouchListener(new com.tencent.mm.plugin.finder.live.plugin.s60(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        ((mm2.f6) P0(mm2.f6.class)).H.observe(this, new com.tencent.mm.plugin.finder.live.plugin.v60(this));
    }
}
