package pr0;

/* loaded from: classes14.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f357914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f357915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(pr0.g0 g0Var, kotlin.coroutines.Continuation continuation, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f357914d = g0Var;
        this.f357915e = continuation;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.t(this.f357914d, this.f357915e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((sr0.f) r0).f411437n.f456164f == true) goto L8;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r7)
            pr0.g0 r7 = r6.f357914d
            sr0.i r0 = r7.f357834e
            r1 = 0
            if (r0 == 0) goto L16
            sr0.f r0 = (sr0.f) r0
            xr0.d r0 = r0.f411437n
            boolean r0 = r0.f456164f
            r2 = 1
            if (r0 != r2) goto L16
            goto L17
        L16:
            r2 = r1
        L17:
            jz5.f0 r0 = jz5.f0.f302826a
            r3 = 0
            kotlin.coroutines.Continuation r4 = r6.f357915e
            java.lang.String r5 = "MicroMsg.Camera.CameraKit"
            if (r2 != 0) goto L39
            java.lang.String r7 = "camera is not previewing, ignore getExpoData"
            com.tencent.mars.xlog.Log.e(r5, r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE
            jz5.l r7 = new jz5.l
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r7.<init>(r3, r2)
            java.lang.Object r7 = kotlin.Result.m521constructorimpl(r7)
            r4.resumeWith(r7)
            return r0
        L39:
            java.lang.String r2 = "getExpoData"
            com.tencent.mars.xlog.Log.i(r5, r2)
            sr0.i r7 = r7.f357834e
            if (r7 == 0) goto L48
            jz5.l r7 = r7.k()
            if (r7 != 0) goto L52
        L48:
            jz5.l r7 = new jz5.l
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r7.<init>(r3, r2)
        L52:
            java.lang.Object r7 = kotlin.Result.m521constructorimpl(r7)
            r4.resumeWith(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
