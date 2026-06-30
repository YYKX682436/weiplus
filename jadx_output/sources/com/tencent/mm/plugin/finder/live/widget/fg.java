package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fg extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f118352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gg f118353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(long j17, com.tencent.mm.plugin.finder.live.widget.gg ggVar) {
        super(2);
        this.f118352d = j17;
        this.f118353e = ggVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        long j17 = this.f118352d;
        if (longValue2 != j17) {
            com.tencent.mars.xlog.Log.i("FinderLiveFansJoinWidget", "updateWecoinBalance: requestId not match, requestId:" + longValue2 + ", wecoinBalanceRequestId:" + j17);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveFansJoinWidget", "updateWecoinBalance wecoinBalance:" + longValue);
            com.tencent.mm.plugin.finder.live.widget.gg ggVar = this.f118353e;
            ggVar.f118444y = longValue;
            ggVar.f118435p.setText(java.lang.String.valueOf(longValue));
            ggVar.f118440u = true;
        }
        return jz5.f0.f302826a;
    }
}
