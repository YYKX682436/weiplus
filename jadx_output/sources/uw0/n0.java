package uw0;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f431582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.MovieTitleSegment f431583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(uw0.t0 t0Var, com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431582e = t0Var;
        this.f431583f = movieTitleSegment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uw0.n0(this.f431582e, this.f431583f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uw0.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f431581d
            r2 = 3
            r3 = 2
            uw0.t0 r4 = r6.f431582e
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L40
        L21:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L31
        L25:
            kotlin.ResultKt.throwOnFailure(r7)
            r6.f431581d = r5
            java.lang.Object r7 = r4.A7(r6)
            if (r7 != r0) goto L31
            return r0
        L31:
            gx0.hf r7 = r4.G7()
            r6.f431581d = r3
            r1 = 0
            r3 = 0
            java.lang.Object r7 = gx0.hf.d7(r7, r1, r6, r5, r3)
            if (r7 != r0) goto L40
            return r0
        L40:
            r6.f431581d = r2
            com.tencent.maas.moviecomposing.segments.MovieTitleSegment r7 = r6.f431583f
            java.lang.Object r7 = r4.T7(r7, r6)
            if (r7 != r0) goto L4b
            return r0
        L4b:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uw0.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
