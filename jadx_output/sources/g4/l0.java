package g4;

/* loaded from: classes5.dex */
public final class l0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.m0 f268414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f268415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f268416f;

    public l0(g4.m0 m0Var, kotlinx.coroutines.flow.k kVar, kotlin.jvm.internal.h0 h0Var) {
        this.f268414d = m0Var;
        this.f268415e = kVar;
        this.f268416f = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof g4.k0
            if (r0 == 0) goto L13
            r0 = r9
            g4.k0 r0 = (g4.k0) r0
            int r1 = r0.f268397e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268397e = r1
            goto L18
        L13:
            g4.k0 r0 = new g4.k0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f268396d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f268397e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L75
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.f268400h
            kotlin.jvm.internal.h0 r8 = (kotlin.jvm.internal.h0) r8
            java.lang.Object r2 = r0.f268399g
            g4.l0 r2 = (g4.l0) r2
            kotlin.ResultKt.throwOnFailure(r9)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L5f
        L41:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.jvm.internal.h0 r9 = r7.f268416f
            java.lang.Object r2 = r9.f310123d
            java.lang.Object r5 = g4.s0.f268545a
            if (r2 != r5) goto L4e
        L4c:
            r2 = r7
            goto L5f
        L4e:
            g4.m0 r5 = r7.f268414d
            yz5.q r5 = r5.f268429g
            r0.f268399g = r7
            r0.f268400h = r9
            r0.f268397e = r4
            java.lang.Object r8 = r5.invoke(r2, r8, r0)
            if (r8 != r1) goto L4c
            return r1
        L5f:
            r9.f310123d = r8
            kotlinx.coroutines.flow.k r8 = r2.f268415e
            kotlin.jvm.internal.h0 r9 = r2.f268416f
            java.lang.Object r9 = r9.f310123d
            r2 = 0
            r0.f268399g = r2
            r0.f268400h = r2
            r0.f268397e = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L75
            return r1
        L75:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.l0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
