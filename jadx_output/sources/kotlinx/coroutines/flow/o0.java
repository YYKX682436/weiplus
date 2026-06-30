package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class o0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f310347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f310348e;

    public o0(kotlinx.coroutines.flow.k kVar, kotlin.jvm.internal.h0 h0Var) {
        this.f310347d = kVar;
        this.f310348e = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.n0
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.n0 r0 = (kotlinx.coroutines.flow.n0) r0
            int r1 = r0.f310334g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310334g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.n0 r0 = new kotlinx.coroutines.flow.n0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f310332e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310334g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f310331d
            kotlinx.coroutines.flow.o0 r5 = (kotlinx.coroutines.flow.o0) r5
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2b
            goto L45
        L2b:
            r6 = move-exception
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.k r6 = r4.f310347d     // Catch: java.lang.Throwable -> L48
            r0.f310331d = r4     // Catch: java.lang.Throwable -> L48
            r0.f310334g = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        L48:
            r6 = move-exception
            r5 = r4
        L4a:
            kotlin.jvm.internal.h0 r5 = r5.f310348e
            r5.f310123d = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
