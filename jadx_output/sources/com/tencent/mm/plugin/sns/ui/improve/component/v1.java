package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class v1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f169032d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f169033e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f169034f;

    /* renamed from: g, reason: collision with root package name */
    public int f169035g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f169036h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.w1 f169037i;

    /* renamed from: m, reason: collision with root package name */
    public int f169038m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.plugin.sns.ui.improve.component.w1 w1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f169037i = w1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onScrollStateChanged$1");
        this.f169036h = obj;
        this.f169038m |= Integer.MIN_VALUE;
        java.lang.Object onScrollStateChanged = this.f169037i.onScrollStateChanged(null, null, 0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onScrollStateChanged$1");
        return onScrollStateChanged;
    }
}
