package j0;

/* loaded from: classes14.dex */
public final class j4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f296388d;

    /* renamed from: e, reason: collision with root package name */
    public int f296389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f296390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f296391g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f296392h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(n0.v2 v2Var, long j17, c0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296390f = v2Var;
        this.f296391g = j17;
        this.f296392h = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j0.j4(this.f296390f, this.f296391g, this.f296392h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.j4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f296389e
            r2 = 0
            c0.o r3 = r9.f296392h
            r4 = 2
            r5 = 1
            n0.v2 r6 = r9.f296390f
            if (r1 == 0) goto L29
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            java.lang.Object r0 = r9.f296388d
            c0.r r0 = (c0.r) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L64
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f296388d
            n0.v2 r1 = (n0.v2) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L4a
        L29:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r6.getValue()
            c0.r r10 = (c0.r) r10
            if (r10 == 0) goto L4d
            c0.q r1 = new c0.q
            r1.<init>(r10)
            if (r3 == 0) goto L49
            r9.f296388d = r6
            r9.f296389e = r5
            r10 = r3
            c0.p r10 = (c0.p) r10
            java.lang.Object r10 = r10.a(r1, r9)
            if (r10 != r0) goto L49
            return r0
        L49:
            r1 = r6
        L4a:
            r1.setValue(r2)
        L4d:
            c0.r r10 = new c0.r
            long r7 = r9.f296391g
            r10.<init>(r7, r2)
            if (r3 == 0) goto L65
            r9.f296388d = r10
            r9.f296389e = r4
            c0.p r3 = (c0.p) r3
            java.lang.Object r1 = r3.a(r10, r9)
            if (r1 != r0) goto L63
            return r0
        L63:
            r0 = r10
        L64:
            r10 = r0
        L65:
            r6.setValue(r10)
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.j4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
