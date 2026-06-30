package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.lang.String str) {
        super(0);
        this.f164857d = str;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$setMediaSourceSight$1");
        java.lang.String e17 = kk.k.e(this.f164857d);
        kotlin.jvm.internal.o.f(e17, "getMD5(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$setMediaSourceSight$1");
        return e17;
    }
}
