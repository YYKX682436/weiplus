package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class jd extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f113083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f113084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(long j17, kotlin.coroutines.Continuation continuation) {
        super(2);
        this.f113083d = j17;
        this.f113084e = continuation;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        long j17 = this.f113083d;
        kotlin.coroutines.Continuation continuation = this.f113084e;
        if (longValue2 != j17 || longValue < 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveChargePayPluginEx", "updateWecoinBalance: requestId not match, requestId:" + longValue2 + ", wecoinBalanceRequestId:" + j17 + ",wecoinBalance:" + longValue);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, 0L)));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.TRUE, java.lang.Long.valueOf(longValue))));
        }
        return jz5.f0.f302826a;
    }
}
