package n74;

/* loaded from: classes4.dex */
public final class d0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f335342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f335343e;

    public d0(kotlinx.coroutines.flow.k kVar, r45.jj4 jj4Var) {
        this.f335342d = kVar;
        this.f335343e = jj4Var;
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
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1$2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r9 instanceof n74.c0
            if (r2 == 0) goto L1a
            r2 = r9
            n74.c0 r2 = (n74.c0) r2
            int r3 = r2.f335312e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f335312e = r3
            goto L1f
        L1a:
            n74.c0 r2 = new n74.c0
            r2.<init>(r7, r9)
        L1f:
            java.lang.Object r9 = r2.f335311d
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f335312e
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L2e
            kotlin.ResultKt.throwOnFailure(r9)
            goto L77
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r8
        L39:
            kotlin.ResultKt.throwOnFailure(r9)
            n74.a0 r8 = (n74.a0) r8
            java.lang.String r9 = r8.a()
            boolean r9 = com.tencent.mm.vfs.w6.j(r9)
            if (r9 == 0) goto L49
            goto L5a
        L49:
            n74.a0 r8 = new n74.a0
            r45.jj4 r9 = r7.f335343e
            java.lang.String r9 = r9.f377855d
            java.lang.String r4 = "Id"
            kotlin.jvm.internal.o.f(r9, r4)
            n74.y r4 = n74.y.f335446e
            r6 = 0
            r8.<init>(r9, r6, r4)
        L5a:
            n74.h0 r9 = n74.h0.f335363a
            java.lang.String r9 = "access$getTAG$p"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            r8.toString()
            r2.f335312e = r5
            kotlinx.coroutines.flow.k r9 = r7.f335342d
            java.lang.Object r8 = r9.emit(r8, r2)
            if (r8 != r3) goto L77
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L77:
            jz5.f0 r8 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n74.d0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
