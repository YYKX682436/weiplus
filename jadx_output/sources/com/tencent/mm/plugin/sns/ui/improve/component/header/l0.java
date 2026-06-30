package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f168852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168853e = improveHeaderUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
        com.tencent.mm.plugin.sns.ui.improve.component.header.l0 l0Var = new com.tencent.mm.plugin.sns.ui.improve.component.header.l0(this.f168853e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
        return l0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.improve.component.header.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r8.f168852d
            r4 = 3
            r5 = 2
            r6 = 1
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC r7 = r8.f168853e
            if (r3 == 0) goto L30
            if (r3 == r6) goto L2c
            if (r3 == r5) goto L28
            if (r3 != r4) goto L1d
            kotlin.ResultKt.throwOnFailure(r9)
            goto L67
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L28:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4b
        L2c:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L3f
        L30:
            kotlin.ResultKt.throwOnFailure(r9)
            r8.f168852d = r6
            java.lang.Object r9 = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$loadAvatar(r7, r8)
            if (r9 != r2) goto L3f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L3f:
            r8.f168852d = r5
            java.lang.Object r9 = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$loadNickName(r7, r8)
            if (r9 != r2) goto L4b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L4b:
            com.tencent.mm.plugin.sns.storage.a2 r9 = com.tencent.mm.plugin.sns.model.l4.Bj()
            java.lang.String r3 = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getUserName(r7)
            com.tencent.mm.plugin.sns.storage.x1 r9 = r9.L0(r3)
            int r3 = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getMode$p(r7)
            r8.f168852d = r4
            java.lang.Object r9 = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$loadCover(r7, r9, r3, r8)
            if (r9 != r2) goto L67
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L67:
            jz5.f0 r9 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.header.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
