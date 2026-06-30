package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class y6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        super(0);
        this.f117548d = b8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "onAuthSuccess: userFlag refreshed, re-collecting");
        com.tencent.mm.plugin.finder.live.viewmodel.b8.P6(this.f117548d);
        return jz5.f0.f302826a;
    }
}
