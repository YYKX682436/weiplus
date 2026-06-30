package com.tencent.mm.plugin.finder.shopping;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/LivePanelHalfScreenListener;", "Lcom/tencent/mm/plugin/finder/shopping/MiniProgramHalfScreenStatusChangeListener;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LivePanelHalfScreenListener extends com.tencent.mm.plugin.finder.shopping.MiniProgramHalfScreenStatusChangeListener {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f126274h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f126275i;

    public LivePanelHalfScreenListener(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(k0Var, true);
        this.f126274h = "LivePanelHalfScreenList";
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f126274h, "onHalfScreenClose: " + z17);
        this.f126275i = z17;
        if (z17) {
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).mj(this);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void f(boolean z17) {
        this.f126275i = z17;
        com.tencent.mars.xlog.Log.i(this.f126274h, "onHalfScreenOpen: " + z17);
        if (z17) {
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).oj(this);
        }
    }

    @Override // com.tencent.mm.plugin.finder.shopping.MiniProgramHalfScreenStatusChangeListener, com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void i(com.tencent.mm.plugin.appbrand.config.HeightInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        super.i(info);
        com.tencent.mars.xlog.Log.i(this.f126274h, "onHeightChanged: " + info + " isAnim: " + this.f126275i);
        boolean z17 = this.f126275i;
        int i17 = info.f77393e;
        if (z17) {
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).nj(this, i17);
            return;
        }
        float f17 = info.f77392d / i17;
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null) {
            if2.z.f291153a.i(liveRoomControllerStore, new mf2.r(liveRoomControllerStore, this, f17));
        }
    }
}
