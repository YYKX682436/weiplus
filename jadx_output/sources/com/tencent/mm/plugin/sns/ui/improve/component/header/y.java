package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class y extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f168896d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f168897e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f168898f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f168899g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f168900h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168901i;

    /* renamed from: m, reason: collision with root package name */
    public int f168902m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f168901i = improveHeaderUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$1");
        this.f168900h = obj;
        this.f168902m |= Integer.MIN_VALUE;
        java.lang.Object access$loadNickName = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$loadNickName(this.f168901i, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$1");
        return access$loadNickName;
    }
}
