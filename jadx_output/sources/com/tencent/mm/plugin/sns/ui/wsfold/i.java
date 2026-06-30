package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f171384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.w f171385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f171386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f171387g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.sns.ui.wsfold.w wVar, kotlin.jvm.internal.h0 h0Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171385e = wVar;
        this.f171386f = h0Var;
        this.f171387g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$launchAfterJobFinish$1");
        com.tencent.mm.plugin.sns.ui.wsfold.i iVar = new com.tencent.mm.plugin.sns.ui.wsfold.i(this.f171385e, this.f171386f, this.f171387g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$launchAfterJobFinish$1");
        return iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$launchAfterJobFinish$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$launchAfterJobFinish$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.wsfold.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$launchAfterJobFinish$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$launchAfterJobFinish$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$launchAfterJobFinish$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r10.f171384d
            jz5.f0 r4 = jz5.f0.f302826a
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC"
            r6 = 3
            r7 = 2
            r8 = 1
            com.tencent.mm.plugin.sns.ui.wsfold.w r9 = r10.f171385e
            if (r3 == 0) goto L34
            if (r3 == r8) goto L30
            if (r3 == r7) goto L2c
            if (r3 != r6) goto L21
            kotlin.ResultKt.throwOnFailure(r11)
            goto L8f
        L21:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r11
        L2c:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L6b
        L30:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L4f
        L34:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = "access$getCurrentJob$p"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r5)
            kotlinx.coroutines.r2 r3 = r9.f171449g
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r5)
            if (r3 == 0) goto L4f
            r10.f171384d = r8
            java.lang.Object r11 = r3.C(r10)
            if (r11 != r2) goto L4f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L4f:
            kotlin.jvm.internal.h0 r11 = r10.f171386f
            java.lang.Object r11 = r11.f310123d
            kotlinx.coroutines.r2 r11 = (kotlinx.coroutines.r2) r11
            java.lang.String r3 = "access$setCurrentJob$p"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            r9.f171449g = r11
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            r10.f171384d = r7
            java.lang.Object r11 = com.tencent.mm.plugin.sns.ui.wsfold.w.R6(r9, r10)
            if (r11 != r2) goto L6b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L6b:
            java.util.ArrayList r11 = com.tencent.mm.plugin.sns.ui.wsfold.w.Q6(r9)
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L81
            java.lang.String r11 = "MicroMsg.SnsWsFoldDataUIC"
            java.lang.String r2 = "totalFeedList is empty"
            com.tencent.mars.xlog.Log.i(r11, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L81:
            r10.f171384d = r6
            yz5.l r11 = r10.f171387g
            java.lang.Object r11 = r11.invoke(r10)
            if (r11 != r2) goto L8f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L8f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.wsfold.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
