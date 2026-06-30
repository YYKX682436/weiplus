package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
public final class a2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f310192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f310193e;

    public a2(kotlinx.coroutines.flow.k kVar, kotlin.jvm.internal.f0 f0Var) {
        this.f310192d = kVar;
        this.f310193e = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.z1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.z1 r0 = (kotlinx.coroutines.flow.z1) r0
            int r1 = r0.f310470f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310470f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z1 r0 = new kotlinx.coroutines.flow.z1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f310468d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310470f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4c
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            kotlin.ResultKt.throwOnFailure(r8)
            kz5.u0 r8 = new kz5.u0
            kotlin.jvm.internal.f0 r2 = r6.f310193e
            int r4 = r2.f310116d
            int r5 = r4 + 1
            r2.f310116d = r5
            if (r4 < 0) goto L4f
            r8.<init>(r4, r7)
            r0.f310470f = r3
            kotlinx.coroutines.flow.k r7 = r6.f310192d
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        L4f:
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            java.lang.String r8 = "Index overflow has happened"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
