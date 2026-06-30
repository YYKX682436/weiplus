package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class on0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f113772d;

    public on0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        this.f113772d = wn0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.b7 b7Var = (mm2.b7) obj;
        com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "wishService onChange: " + b7Var);
        if (b7Var instanceof mm2.z6) {
            com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f113772d;
            wn0Var.getClass();
            com.tencent.mm.plugin.finder.live.util.y.m(wn0Var, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.plugin.zm0(wn0Var, false, null), 2, null);
        }
    }
}
