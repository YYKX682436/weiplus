package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gl0 extends com.tencent.mm.plugin.finder.live.plugin.h {

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f112712p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f112713q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112713q = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.cl0(this));
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
}
