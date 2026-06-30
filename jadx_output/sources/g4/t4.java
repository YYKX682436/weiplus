package g4;

/* loaded from: classes14.dex */
public final class t4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268571d;

    /* renamed from: e, reason: collision with root package name */
    public int f268572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.u4 f268573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f268574g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f268575h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(g4.u4 u4Var, int i17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268573f = u4Var;
        this.f268574g = i17;
        this.f268575h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.t4 t4Var = new g4.t4(this.f268573f, this.f268574g, this.f268575h, completion);
        t4Var.f268571d = obj;
        return t4Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.t4) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.r2] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.r2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [g4.r4] */
    /* JADX WARN: Type inference failed for: r9v14, types: [g4.r4] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f268572e
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            g4.u4 r6 = r8.f268573f
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L34
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L25
            if (r1 == r2) goto L1c
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            java.lang.Object r0 = r8.f268571d
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L96
        L25:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L97
        L2a:
            java.lang.Object r1 = r8.f268571d
            kotlinx.coroutines.r2 r1 = (kotlinx.coroutines.r2) r1
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L32:
            r9 = move-exception
            goto L88
        L34:
            java.lang.Object r1 = r8.f268571d
            kotlinx.coroutines.r2 r1 = (kotlinx.coroutines.r2) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L65
        L3c:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f268571d
            kotlinx.coroutines.y0 r9 = (kotlinx.coroutines.y0) r9
            oz5.l r9 = r9.getF11582e()
            int r1 = kotlinx.coroutines.r2.O0
            kotlinx.coroutines.q2 r1 = kotlinx.coroutines.q2.f310571d
            oz5.i r9 = r9.get(r1)
            if (r9 == 0) goto L9a
            kotlinx.coroutines.r2 r9 = (kotlinx.coroutines.r2) r9
            g4.r4 r1 = r6.f268587a
            r8.f268571d = r9
            r8.f268572e = r5
            int r5 = r8.f268574g
            java.lang.Object r1 = r1.b(r5, r9, r8)
            if (r1 != r0) goto L62
            return r0
        L62:
            r7 = r1
            r1 = r9
            r9 = r7
        L65:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L97
            yz5.l r9 = r8.f268575h     // Catch: java.lang.Throwable -> L32
            r8.f268571d = r1     // Catch: java.lang.Throwable -> L32
            r8.f268572e = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Throwable -> L32
            if (r9 != r0) goto L7a
            return r0
        L7a:
            g4.r4 r9 = r6.f268587a
            r2 = 0
            r8.f268571d = r2
            r8.f268572e = r3
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L97
            return r0
        L88:
            g4.r4 r3 = r6.f268587a
            r8.f268571d = r9
            r8.f268572e = r2
            java.lang.Object r1 = r3.a(r1, r8)
            if (r1 != r0) goto L95
            return r0
        L95:
            r0 = r9
        L96:
            throw r0
        L97:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        L9a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error. coroutineScope should've created a job."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.t4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
