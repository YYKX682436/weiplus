package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f163736d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f163737e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f163738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.p f163739g;

    /* renamed from: h, reason: collision with root package name */
    public int f163740h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.sns.ad.widget.living.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f163739g = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$emit$1");
        this.f163738f = obj;
        this.f163740h |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f163739g.a(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$emit$1");
        return a17;
    }
}
