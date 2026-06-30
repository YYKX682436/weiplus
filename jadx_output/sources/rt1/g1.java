package rt1;

/* loaded from: classes7.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f399412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f399414f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(java.lang.String str, rt1.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399413e = str;
        this.f399414f = p1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rt1.g1(this.f399413e, this.f399414f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt1.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0074 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f399412d
            java.lang.String r2 = r9.f399413e
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            rt1.p1 r8 = r9.f399414f
            if (r1 == 0) goto L32
            if (r1 == r7) goto L2e
            if (r1 == r6) goto L28
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            kotlin.ResultKt.throwOnFailure(r10)
            goto L74
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L65
        L28:
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: qt1.f -> L2c
            goto L66
        L2c:
            r10 = move-exception
            goto L51
        L2e:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L43
        L32:
            kotlin.ResultKt.throwOnFailure(r10)
            rt1.d1 r10 = new rt1.d1
            r10.<init>(r8)
            r9.f399412d = r7
            java.lang.Object r10 = st1.g.d(r10, r9)
            if (r10 != r0) goto L43
            return r0
        L43:
            qt1.e r10 = new qt1.e     // Catch: qt1.f -> L2c
            r10.<init>(r2)     // Catch: qt1.f -> L2c
            r9.f399412d = r6     // Catch: qt1.f -> L2c
            java.lang.Object r10 = r10.e(r9)     // Catch: qt1.f -> L2c
            if (r10 != r0) goto L66
            return r0
        L51:
            r1 = -17501(0xffffffffffffbba3, float:NaN)
            int r6 = r10.f366521e
            if (r6 == r1) goto L66
            rt1.e1 r1 = new rt1.e1
            r1.<init>(r8, r10)
            r9.f399412d = r5
            java.lang.Object r10 = st1.g.d(r1, r9)
            if (r10 != r0) goto L65
            return r0
        L65:
            return r3
        L66:
            rt1.f1 r10 = new rt1.f1
            r10.<init>(r8, r2)
            r9.f399412d = r4
            java.lang.Object r10 = st1.g.d(r10, r9)
            if (r10 != r0) goto L74
            return r0
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rt1.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
