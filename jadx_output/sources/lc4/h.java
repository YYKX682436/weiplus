package lc4;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f317963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f317964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f317964e = improveDataUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        lc4.h hVar = new lc4.h(this.f317964e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        java.lang.Object invokeSuspend = ((lc4.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r7.f317963d
            r4 = 2
            r5 = 1
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC r6 = r7.f317964e
            if (r3 == 0) goto L29
            if (r3 == r5) goto L25
            if (r3 != r4) goto L1a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L54
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r8
        L25:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L38
        L29:
            kotlin.ResultKt.throwOnFailure(r8)
            r7.f317963d = r5
            java.lang.Object r8 = r6.X6(r7)
            if (r8 != r2) goto L38
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L38:
            lc4.d r8 = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.f168761r
            java.lang.String r8 = "access$getLoadMoreJob$p"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            kotlinx.coroutines.r2 r5 = r6.f168774o
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            if (r5 == 0) goto L54
            r7.f317963d = r4
            java.lang.Object r8 = r5.C(r7)
            if (r8 != r2) goto L54
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L54:
            boolean r8 = r6.V6()
            if (r8 != 0) goto L61
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC r8 = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.P6(r6)
            r8.c7()
        L61:
            jz5.f0 r8 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lc4.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
