package gd4;

/* loaded from: classes4.dex */
public final class s1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f270843d;

    public s1(kotlinx.coroutines.flow.k kVar) {
        this.f270843d = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            java.lang.String r0 = "emit"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2$2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r9 instanceof gd4.r1
            if (r2 == 0) goto L1a
            r2 = r9
            gd4.r1 r2 = (gd4.r1) r2
            int r3 = r2.f270839e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f270839e = r3
            goto L1f
        L1a:
            gd4.r1 r2 = new gd4.r1
            r2.<init>(r7, r9)
        L1f:
            java.lang.Object r9 = r2.f270838d
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f270839e
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L2e
            kotlin.ResultKt.throwOnFailure(r9)
            goto L66
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r8
        L39:
            kotlin.ResultKt.throwOnFailure(r9)
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = (com.tencent.mm.plugin.sns.storage.SnsInfo) r8
            java.lang.String r8 = "getPLAY_EVENT_CANCEL_LIKE"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            java.lang.String r4 = "access$getPLAY_EVENT_CANCEL_LIKE$cp"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            java.lang.Integer r8 = new java.lang.Integer
            r9 = 3
            r8.<init>(r9)
            r2.f270839e = r5
            kotlinx.coroutines.flow.k r9 = r7.f270843d
            java.lang.Object r8 = r9.emit(r8, r2)
            if (r8 != r3) goto L66
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L66:
            jz5.f0 r8 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gd4.s1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
