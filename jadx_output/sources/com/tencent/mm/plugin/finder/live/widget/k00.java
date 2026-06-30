package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k00 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, java.lang.String str, int i17) {
        super(2);
        this.f118794d = m10Var;
        this.f118795e = str;
        this.f118796f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "getRewardWishList wecoinBalance: " + longValue);
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f118794d;
        ((mm2.c1) m10Var.f119001c.P0(mm2.c1.class)).w8(longValue);
        com.tencent.mm.plugin.finder.live.widget.m10.m(this.f118795e, m10Var, this.f118796f);
        return jz5.f0.f302826a;
    }
}
