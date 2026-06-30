package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pn0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f113922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f113923e;

    public pn0(int i17, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        this.f113922d = i17;
        this.f113923e = wn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f113923e;
        int i17 = this.f113922d;
        if (i17 == 1) {
            if (((mm2.c1) wn0Var.P0(mm2.c1.class)).F) {
                qo0.c.a(wn0Var.f114973p, qo0.b.f365424v3, null, 2, null);
                return;
            } else {
                com.tencent.mars.xlog.Log.w("FinderLiveWishPanelPlug", "remindInteractionWishAction ignore as like is disable");
                return;
            }
        }
        if (i17 != 2) {
            if (i17 == 3) {
                qo0.c.a(wn0Var.f114973p, qo0.b.f365428w3, null, 2, null);
                return;
            }
            return;
        }
        wn0Var.getClass();
        if (!(!zl2.r4.f473950a.J1(wn0Var.S0()) && ((mm2.c1) wn0Var.P0(mm2.c1.class)).f328884t && ((mm2.c1) wn0Var.P0(mm2.c1.class)).f328902w && ((mm2.c1) wn0Var.P0(mm2.c1.class)).f328896v)) {
            com.tencent.mars.xlog.Log.w("FinderLiveWishPanelPlug", "remindInteractionWishAction ignore as comment is disable");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
        wn0Var.f114973p.statusChange(qo0.b.W, bundle);
    }
}
