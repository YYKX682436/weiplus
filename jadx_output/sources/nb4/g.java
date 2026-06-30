package nb4;

/* loaded from: classes4.dex */
public final class g implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f336072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nb4.m f336073e;

    public g(kotlinx.coroutines.flow.k kVar, nb4.m mVar) {
        this.f336072d = kVar;
        this.f336073e = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            java.lang.String r0 = "emit"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1$2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r10 instanceof nb4.f
            if (r2 == 0) goto L1a
            r2 = r10
            nb4.f r2 = (nb4.f) r2
            int r3 = r2.f336070e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f336070e = r3
            goto L1f
        L1a:
            nb4.f r2 = new nb4.f
            r2.<init>(r8, r10)
        L1f:
            java.lang.Object r10 = r2.f336069d
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f336070e
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L2e
            kotlin.ResultKt.throwOnFailure(r10)
            goto L70
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L39:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            com.tencent.mm.protocal.protobuf.SnsObject r10 = (com.tencent.mm.protocal.protobuf.SnsObject) r10
            nb4.m r4 = r8.f336073e
            java.lang.String r4 = nb4.m.N6(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "updateUserCoverFromDetail userName:"
            r6.<init>(r7)
            java.lang.String r7 = r10.Username
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.i(r4, r6)
            java.lang.String r10 = r10.Username
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r10 = r10 ^ r5
            if (r10 == 0) goto L70
            r2.f336070e = r5
            kotlinx.coroutines.flow.k r10 = r8.f336072d
            java.lang.Object r9 = r10.emit(r9, r2)
            if (r9 != r3) goto L70
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L70:
            jz5.f0 r9 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nb4.g.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
