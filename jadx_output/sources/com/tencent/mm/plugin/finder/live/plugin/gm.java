package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gm extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(2);
        this.f112714d = hmVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112714d;
        if (longValue2 != hmVar.I) {
            com.tencent.mars.xlog.Log.i(hmVar.f112831r, "updateWecoinBalance: requestId not match, requestId:" + longValue2 + ", wecoinBalanceRequestId:" + hmVar.I);
        } else {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.sl(hmVar, longValue));
        }
        return jz5.f0.f302826a;
    }
}
