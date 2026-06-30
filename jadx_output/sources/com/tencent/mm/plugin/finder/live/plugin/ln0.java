package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ln0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f113418d;

    public ln0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        this.f113418d = wn0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.a7 a7Var = (mm2.a7) obj;
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f113418d;
        if (zl2.r4.F1(wn0Var.S0())) {
            com.tencent.mars.xlog.Log.w("FinderLiveWishPanelPlug", "wishPanelClick blocked in CoLive room, fromScene=" + a7Var.f328751b);
        } else {
            wn0Var.f114978u = a7Var.f328751b;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.util.y.m(wn0Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.plugin.kn0(wn0Var, null), 2, null);
        }
    }
}
