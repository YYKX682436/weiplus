package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class g0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f112618d;

    public g0(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var) {
        this.f112618d = q0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("FinderLiveAdVideoPlugin", "liveToNormalMode : " + ((java.lang.Integer) obj));
        this.f112618d.t1();
    }
}
