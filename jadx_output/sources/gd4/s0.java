package gd4;

/* loaded from: classes4.dex */
public final class s0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f270842d;

    public s0(kotlinx.coroutines.flow.k kVar) {
        this.f270842d = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            java.lang.String r0 = "emit"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2$2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r8 instanceof gd4.r0
            if (r2 == 0) goto L1a
            r2 = r8
            gd4.r0 r2 = (gd4.r0) r2
            int r3 = r2.f270836e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f270836e = r3
            goto L1f
        L1a:
            gd4.r0 r2 = new gd4.r0
            r2.<init>(r6, r8)
        L1f:
            java.lang.Object r8 = r2.f270835d
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f270836e
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L2e
            kotlin.ResultKt.throwOnFailure(r8)
            goto L54
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r7
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.booleanValue()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r5)
            r2.f270836e = r5
            kotlinx.coroutines.flow.k r8 = r6.f270842d
            java.lang.Object r7 = r8.emit(r7, r2)
            if (r7 != r3) goto L54
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L54:
            jz5.f0 r7 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gd4.s0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
