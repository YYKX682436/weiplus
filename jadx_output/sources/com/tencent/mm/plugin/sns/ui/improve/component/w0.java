package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f169042d;

    /* renamed from: e, reason: collision with root package name */
    public int f169043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f169044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tc4.s0 f169045g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f169046h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zc4.b f169047i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f169048m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f169049n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC, tc4.s0 s0Var, in5.s0 s0Var2, zc4.b bVar, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f169044f = improveMainUIC;
        this.f169045g = s0Var;
        this.f169046h = s0Var2;
        this.f169047i = bVar;
        this.f169048m = i17;
        this.f169049n = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        com.tencent.mm.plugin.sns.ui.improve.component.w0 w0Var = new com.tencent.mm.plugin.sns.ui.improve.component.w0(this.f169044f, this.f169045g, this.f169046h, this.f169047i, this.f169048m, this.f169049n, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        return w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.improve.component.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f169043e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            boolean b76 = this.f169044f.b7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            if (b76) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
                return f0Var;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            tc4.s0 s0Var = this.f169045g;
            in5.s0 s0Var2 = this.f169046h;
            zc4.b bVar = this.f169047i;
            int i18 = this.f169048m;
            boolean z17 = this.f169049n;
            this.f169042d = currentTimeMillis;
            this.f169043e = 1;
            if (s0Var.h(s0Var2, bVar, i18, z17, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
                throw illegalStateException;
            }
            j17 = this.f169042d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int hashCode = this.f169046h.itemView.hashCode();
        yc4.s sVar = yc4.s.f460864a;
        sVar.e(hashCode, this.f169045g.name());
        sVar.d(hashCode, this.f169047i.n().isAd());
        sVar.b(hashCode, java.lang.System.currentTimeMillis() - j17);
        sVar.c(hashCode);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        return f0Var;
    }
}
