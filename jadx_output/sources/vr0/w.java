package vr0;

/* loaded from: classes14.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439523e = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vr0.w(this.f439523e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr0.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f439522d
            r2 = 2
            r3 = 1
            vr0.z r4 = r5.f439523e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r6)
            goto L47
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L34
        L1e:
            kotlin.ResultKt.throwOnFailure(r6)
            xr0.d r6 = r4.f411437n
            boolean r6 = r6.f456164f
            if (r6 == 0) goto L3e
            nr0.x r6 = r4.f411434h
            if (r6 == 0) goto L36
            r5.f439522d = r3
            java.lang.Object r6 = r6.k(r5)
            if (r6 != r0) goto L34
            return r0
        L34:
            jz5.f0 r6 = (jz5.f0) r6
        L36:
            vr0.v r6 = new vr0.v
            r1 = 0
            r6.<init>(r4, r1)
            r4.E = r6
        L3e:
            r5.f439522d = r2
            java.lang.Object r6 = r4.K(r5)
            if (r6 != r0) goto L47
            return r0
        L47:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
