package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class d extends kotlinx.coroutines.flow.f {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f310225h;

    public d(yz5.p pVar, oz5.l lVar, int i17, u26.u uVar) {
        super(pVar, lVar, i17, uVar);
        this.f310225h = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [u26.r0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7, types: [u26.r0] */
    @Override // v26.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(u26.r0 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.c
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.c r0 = (kotlinx.coroutines.flow.c) r0
            int r1 = r0.f310215g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310215g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.c r0 = new kotlinx.coroutines.flow.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f310213e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310215g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.f310212d
            u26.r0 r6 = (u26.r0) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f310212d = r6
            r0.f310215g = r4
            yz5.p r7 = r5.f310245g
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            u26.x r6 = (u26.x) r6
            boolean r6 = r6.j()
            if (r6 == 0) goto L52
            return r3
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.f(u26.r0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // v26.g
    public v26.g g(oz5.l lVar, int i17, u26.u uVar) {
        return new kotlinx.coroutines.flow.d(this.f310225h, lVar, i17, uVar);
    }
}
