package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f171427d;

    /* renamed from: e, reason: collision with root package name */
    public int f171428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.f1 f171429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tc4.s0 f171430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f171431h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zc4.b f171432i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f171433m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f171434n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.sns.ui.wsfold.f1 f1Var, tc4.s0 s0Var, in5.s0 s0Var2, zc4.b bVar, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171429f = f1Var;
        this.f171430g = s0Var;
        this.f171431h = s0Var2;
        this.f171432i = bVar;
        this.f171433m = i17;
        this.f171434n = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        com.tencent.mm.plugin.sns.ui.wsfold.s0 s0Var = new com.tencent.mm.plugin.sns.ui.wsfold.s0(this.f171429f, this.f171430g, this.f171431h, this.f171432i, this.f171433m, this.f171434n, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        return s0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.wsfold.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f171428e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.tencent.mm.plugin.sns.ui.wsfold.f1.Q6(this.f171429f)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
                return f0Var;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            tc4.s0 s0Var = this.f171430g;
            in5.s0 s0Var2 = this.f171431h;
            zc4.b bVar = this.f171432i;
            int i18 = this.f171433m;
            boolean z17 = this.f171434n;
            this.f171427d = currentTimeMillis;
            this.f171428e = 1;
            if (s0Var.h(s0Var2, bVar, i18, z17, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
                throw illegalStateException;
            }
            j17 = this.f171427d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int hashCode = this.f171431h.itemView.hashCode();
        yc4.s sVar = yc4.s.f460864a;
        sVar.e(hashCode, this.f171430g.name());
        sVar.d(hashCode, this.f171432i.n().isAd());
        sVar.b(hashCode, java.lang.System.currentTimeMillis() - j17);
        sVar.c(hashCode);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        return f0Var;
    }
}
