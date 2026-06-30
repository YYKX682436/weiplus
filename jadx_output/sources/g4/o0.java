package g4;

/* loaded from: classes5.dex */
public final class o0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.p0 f268463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f268464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f268465f;

    public o0(g4.p0 p0Var, kotlinx.coroutines.flow.k kVar, kotlin.jvm.internal.h0 h0Var) {
        this.f268463d = p0Var;
        this.f268464e = kVar;
        this.f268465f = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof g4.n0
            if (r0 == 0) goto L13
            r0 = r8
            g4.n0 r0 = (g4.n0) r0
            int r1 = r0.f268450e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268450e = r1
            goto L18
        L13:
            g4.n0 r0 = new g4.n0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f268449d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f268450e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f268453h
            kotlin.jvm.internal.h0 r7 = (kotlin.jvm.internal.h0) r7
            java.lang.Object r2 = r0.f268452g
            g4.o0 r2 = (g4.o0) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L58
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            g4.p0 r8 = r6.f268463d
            yz5.q r8 = r8.f268484i
            kotlin.jvm.internal.h0 r2 = r6.f268465f
            java.lang.Object r5 = r2.f310123d
            r0.f268452g = r6
            r0.f268453h = r2
            r0.f268450e = r4
            java.lang.Object r8 = r8.invoke(r5, r7, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            r7 = r2
            r2 = r6
        L58:
            r7.f310123d = r8
            kotlinx.coroutines.flow.k r7 = r2.f268464e
            kotlin.jvm.internal.h0 r8 = r2.f268465f
            java.lang.Object r8 = r8.f310123d
            r2 = 0
            r0.f268452g = r2
            r0.f268453h = r2
            r0.f268450e = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.o0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
