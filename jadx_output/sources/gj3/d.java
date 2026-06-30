package gj3;

/* loaded from: classes7.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f272386d;

    /* renamed from: e, reason: collision with root package name */
    public int f272387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gj3.h f272388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gj3.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272388f = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gj3.d(this.f272388f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gj3.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:12:0x0037->B:23:?, LOOP_END, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f272387e
            jz5.f0 r2 = jz5.f0.f302826a
            gj3.h r3 = r9.f272388f
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            kotlin.ResultKt.throwOnFailure(r10)
            goto L88
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r1 = r9.f272386d
            java.util.Iterator r1 = (java.util.Iterator) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L37
        L25:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.Set r10 = r3.f272392d
            gj3.c r1 = new gj3.c
            r1.<init>()
            java.util.List r10 = kz5.n0.F0(r10, r1)
            java.util.Iterator r1 = r10.iterator()
        L37:
            boolean r10 = r1.hasNext()
            r6 = 0
            if (r10 == 0) goto L73
            java.lang.Object r10 = r1.next()
            gj3.b r10 = (gj3.b) r10
            r9.f272386d = r1
            r9.f272387e = r5
            oz5.l r7 = r10.f272384b
            if (r7 == 0) goto L5a
            gj3.a r8 = new gj3.a
            r8.<init>(r10, r6)
            java.lang.Object r10 = kotlinx.coroutines.l.g(r7, r8, r9)
            pz5.a r6 = pz5.a.f359186d
            if (r10 != r6) goto L6f
            goto L70
        L5a:
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L65
            java.io.Closeable r10 = r10.f272383a     // Catch: java.lang.Throwable -> L65
            r10.close()     // Catch: java.lang.Throwable -> L65
            kotlin.Result.m521constructorimpl(r2)     // Catch: java.lang.Throwable -> L65
            goto L6f
        L65:
            r10 = move-exception
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            kotlin.Result.m521constructorimpl(r10)
        L6f:
            r10 = r2
        L70:
            if (r10 != r0) goto L37
            return r0
        L73:
            jz5.g r10 = r3.f272398m
            jz5.n r10 = (jz5.n) r10
            java.lang.Object r10 = r10.getValue()
            hj3.m r10 = (hj3.m) r10
            r9.f272386d = r6
            r9.f272387e = r4
            java.lang.Object r10 = r10.b(r9)
            if (r10 != r0) goto L88
            return r0
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gj3.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
