package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ui extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.dk f114568p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(android.view.ViewGroup gameWidgetRoot, qo0.c statusMonitor) {
        super(gameWidgetRoot, statusMonitor, null);
        kotlin.jvm.internal.o.g(gameWidgetRoot, "gameWidgetRoot");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        android.content.Context context = gameWidgetRoot.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f114568p = new com.tencent.mm.plugin.finder.live.widget.dk(context, gameWidgetRoot, statusMonitor, this);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (((mm2.c1) P0(mm2.c1.class)).a8() || i17 != 0) {
            super.K0(i17);
            return;
        }
        dk2.xf W0 = W0();
        if (W0 != null) {
            ((dk2.r4) W0).n(this.f114568p, i17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        super.z0();
        com.tencent.mm.plugin.finder.live.widget.dk dkVar = this.f114568p;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = dkVar.f118109e;
        jf2.k0 k0Var = (jf2.k0) lVar.U0(jf2.k0.class);
        if (k0Var == null || (liveMutableData = k0Var.f299387v) == null) {
            return;
        }
        liveMutableData.f111660d = true;
        liveMutableData.observe(lVar, new com.tencent.mm.plugin.finder.live.widget.ck(dkVar));
    }
}
