package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ik0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jk0 f112983d;

    public ik0(com.tencent.mm.plugin.finder.live.plugin.jk0 jk0Var) {
        this.f112983d = jk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ALIAS_GUIDE_SHOW_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.finder.live.plugin.jk0 jk0Var = this.f112983d;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = jk0Var.f113129r;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.f();
        }
        com.tencent.mars.xlog.Log.i(jk0Var.f113127p, "show");
    }
}
