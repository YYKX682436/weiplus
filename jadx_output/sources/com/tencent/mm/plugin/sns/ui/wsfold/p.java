package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f171412d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f171413e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f171414f;

    /* renamed from: g, reason: collision with root package name */
    public int f171415g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f171416h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.q f171417i;

    /* renamed from: m, reason: collision with root package name */
    public int f171418m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.sns.ui.wsfold.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f171417i = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$emit$1");
        this.f171416h = obj;
        this.f171418m |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f171417i.a(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$emit$1");
        return a17;
    }
}
