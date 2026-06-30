package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class en0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f112440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(2);
        this.f112440d = wn0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "getRewardWishList wecoinBalance: " + longValue);
        ((mm2.c1) this.f112440d.P0(mm2.c1.class)).w8(longValue);
        return jz5.f0.f302826a;
    }
}
