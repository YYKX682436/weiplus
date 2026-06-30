package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ti extends com.tencent.mm.plugin.finder.live.plugin.ri {
    public final android.view.ViewGroup C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(android.view.ViewGroup entranceRoot, qo0.c statusMonitor) {
        super(entranceRoot, statusMonitor);
        kotlin.jvm.internal.o.g(entranceRoot, "entranceRoot");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.C = entranceRoot;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ri, com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        ((kotlinx.coroutines.flow.q2) ((je2.n) P0(je2.n.class)).f299247h).e(java.lang.Boolean.valueOf(i17 == 0));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ri
    public java.lang.String u1() {
        return "game_player_frame_set_container";
    }
}
