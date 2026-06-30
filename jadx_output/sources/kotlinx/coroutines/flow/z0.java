package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class z0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f310465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f310466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f310467f;

    public z0(kotlin.jvm.internal.f0 f0Var, int i17, kotlinx.coroutines.flow.k kVar) {
        this.f310465d = f0Var;
        this.f310466e = i17;
        this.f310467f = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.y0
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.y0 r0 = (kotlinx.coroutines.flow.y0) r0
            int r1 = r0.f310458f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310458f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y0 r0 = new kotlinx.coroutines.flow.y0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f310456d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310458f
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r9)
            return r3
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L51
        L38:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.jvm.internal.f0 r9 = r7.f310465d
            int r2 = r9.f310116d
            int r2 = r2 + r5
            r9.f310116d = r2
            int r9 = r7.f310466e
            kotlinx.coroutines.flow.k r6 = r7.f310467f
            if (r2 >= r9) goto L52
            r0.f310458f = r5
            java.lang.Object r8 = r6.emit(r8, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            return r3
        L52:
            r0.f310458f = r4
            kotlinx.coroutines.flow.a1.a(r6, r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
