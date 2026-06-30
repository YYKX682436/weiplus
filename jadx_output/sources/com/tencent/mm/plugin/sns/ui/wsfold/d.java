package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f171345d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f171346e;

    /* renamed from: f, reason: collision with root package name */
    public long f171347f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f171348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.w f171349h;

    /* renamed from: i, reason: collision with root package name */
    public int f171350i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.sns.ui.wsfold.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f171349h = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$initTotalList$1");
        this.f171348g = obj;
        this.f171350i |= Integer.MIN_VALUE;
        java.lang.Object R6 = com.tencent.mm.plugin.sns.ui.wsfold.w.R6(this.f171349h, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$initTotalList$1");
        return R6;
    }
}
