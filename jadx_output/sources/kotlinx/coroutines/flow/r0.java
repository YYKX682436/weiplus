package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class r0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f310381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f310382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f310383f;

    public r0(kotlin.jvm.internal.f0 f0Var, int i17, kotlinx.coroutines.flow.k kVar) {
        this.f310381d = f0Var;
        this.f310382e = i17;
        this.f310383f = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.q0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.q0 r0 = (kotlinx.coroutines.flow.q0) r0
            int r1 = r0.f310370f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310370f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.q0 r0 = new kotlinx.coroutines.flow.q0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f310368d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310370f
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.throwOnFailure(r8)
            goto L47
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.f0 r8 = r6.f310381d
            int r2 = r8.f310116d
            int r5 = r6.f310382e
            if (r2 < r5) goto L48
            r0.f310370f = r4
            kotlinx.coroutines.flow.k r8 = r6.f310383f
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            return r3
        L48:
            int r2 = r2 + r4
            r8.f310116d = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
