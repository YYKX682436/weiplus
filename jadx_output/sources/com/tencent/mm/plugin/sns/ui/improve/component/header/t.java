package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f168870d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f168871e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f168872f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f168873g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168874h;

    /* renamed from: i, reason: collision with root package name */
    public int f168875i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f168874h = improveHeaderUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$1");
        this.f168873g = obj;
        this.f168875i |= Integer.MIN_VALUE;
        java.lang.Object access$loadCover = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$loadCover(this.f168874h, null, 0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$1");
        return access$loadCover;
    }
}
