package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class s extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f116664d;

    public s(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        this.f116664d = k0Var;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.view.k0.TAG;
        com.tencent.mars.xlog.Log.i(str, "onNetworkChange status:" + i17 + '!');
        com.tencent.mm.plugin.finder.live.view.k0.access$networkChange(this.f116664d, i17);
    }
}
