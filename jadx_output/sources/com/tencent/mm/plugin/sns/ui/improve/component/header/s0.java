package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168868d = improveHeaderUIC;
        this.f168869e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onNotifyChange$1$1");
        com.tencent.mm.plugin.sns.ui.improve.component.header.s0 s0Var = new com.tencent.mm.plugin.sns.ui.improve.component.header.s0(this.f168868d, this.f168869e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onNotifyChange$1$1");
        return s0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onNotifyChange$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onNotifyChange$1$1");
        com.tencent.mm.plugin.sns.ui.improve.component.header.s0 s0Var = (com.tencent.mm.plugin.sns.ui.improve.component.header.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s0Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onNotifyChange$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onNotifyChange$1$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onNotifyChange$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC = this.f168868d;
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getMsgNotifyLayout(improveHeaderUIC).setVisibility(0);
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getMsgNotifyContent(improveHeaderUIC).setText(this.f168869e);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onNotifyChange$1$1");
        return f0Var;
    }
}
