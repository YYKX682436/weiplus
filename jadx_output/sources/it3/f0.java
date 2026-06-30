package it3;

/* loaded from: classes10.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f294559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.TestActivity f294560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.recordvideo.activity.TestActivity testActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294560e = testActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new it3.f0(this.f294560e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((it3.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007f A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f294559d
            jz5.f0 r2 = jz5.f0.f302826a
            com.tencent.mm.plugin.recordvideo.activity.TestActivity r3 = r9.f294560e
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L2f
            if (r1 == r8) goto L2b
            if (r1 == r7) goto L27
            if (r1 == r6) goto L23
            if (r1 != r5) goto L1b
            kotlin.ResultKt.throwOnFailure(r10)
            goto L7f
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L70
        L27:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L60
        L2b:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L42
        L2f:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.p0 r10 = kotlinx.coroutines.q1.f310570c
            it3.d0 r1 = new it3.d0
            r1.<init>(r4)
            r9.f294559d = r8
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r1, r9)
            if (r10 != r0) goto L42
            return r0
        L42:
            int r10 = com.tencent.mm.plugin.recordvideo.activity.TestActivity.f155639e
            com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout r10 = r3.U6()
            r9.f294559d = r7
            java.lang.String r1 = "MicroMsg.CameraKitRecordViewLayout"
            java.lang.String r7 = "startRecord"
            com.tencent.mars.xlog.Log.i(r1, r7)
            lu3.m r10 = r10.f155806e
            r1 = 0
            java.lang.Object r10 = r10.i(r1, r1, r9)
            if (r10 != r0) goto L5c
            goto L5d
        L5c:
            r10 = r2
        L5d:
            if (r10 != r0) goto L60
            return r0
        L60:
            kotlinx.coroutines.p0 r10 = kotlinx.coroutines.q1.f310570c
            it3.e0 r1 = new it3.e0
            r1.<init>(r4)
            r9.f294559d = r6
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r1, r9)
            if (r10 != r0) goto L70
            return r0
        L70:
            int r10 = com.tencent.mm.plugin.recordvideo.activity.TestActivity.f155639e
            com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout r10 = r3.U6()
            r9.f294559d = r5
            java.lang.Object r10 = r10.j(r9)
            if (r10 != r0) goto L7f
            return r0
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: it3.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
