package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class n1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f168953d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f168954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168955f;

    /* renamed from: g, reason: collision with root package name */
    public int f168956g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f168955f = improveMainUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
        this.f168954e = obj;
        this.f168956g |= Integer.MIN_VALUE;
        java.lang.Object onScrollStateChanged = this.f168955f.onScrollStateChanged(null, null, 0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
        return onScrollStateChanged;
    }
}
