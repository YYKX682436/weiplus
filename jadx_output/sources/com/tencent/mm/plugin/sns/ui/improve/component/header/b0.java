package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f168816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168815d = improveHeaderUIC;
        this.f168816e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
        com.tencent.mm.plugin.sns.ui.improve.component.header.b0 b0Var = new com.tencent.mm.plugin.sns.ui.improve.component.header.b0(this.f168815d, this.f168816e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
        return b0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
        com.tencent.mm.plugin.sns.ui.improve.component.header.b0 b0Var = (com.tencent.mm.plugin.sns.ui.improve.component.header.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b0Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC = this.f168815d;
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getNickNameTxt(improveHeaderUIC).setOnClickListener(new com.tencent.mm.plugin.sns.ui.improve.component.header.z(improveHeaderUIC));
        if (com.tencent.mm.sdk.platformtools.s9.f192975c || z65.c.a()) {
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getNickNameTxt(improveHeaderUIC).setOnLongClickListener(new com.tencent.mm.plugin.sns.ui.improve.component.header.a0(improveHeaderUIC));
        }
        if (this.f168816e) {
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getNickNameTxt(improveHeaderUIC).setPadding(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getNickNameTxt(improveHeaderUIC).getPaddingLeft(), com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getNickNameTxt(improveHeaderUIC).getPaddingTop(), com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getNickNameTxt(improveHeaderUIC).getPaddingRight(), ym5.x.a(improveHeaderUIC.getContext(), 4.0f));
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
        return f0Var;
    }
}
