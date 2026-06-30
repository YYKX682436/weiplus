package kotlinx.coroutines.flow;

/* loaded from: classes10.dex */
public final class u0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f310418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f310419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310420f;

    public u0(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.flow.k kVar, yz5.p pVar) {
        this.f310418d = c0Var;
        this.f310419e = kVar;
        this.f310420f = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.t0
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.t0 r0 = (kotlinx.coroutines.flow.t0) r0
            int r1 = r0.f310408h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310408h = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.t0 r0 = new kotlinx.coroutines.flow.t0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f310406f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310408h
            r3 = 3
            r4 = 2
            jz5.f0 r5 = jz5.f0.f302826a
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.throwOnFailure(r9)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.f310405e
            java.lang.Object r2 = r0.f310404d
            kotlinx.coroutines.flow.u0 r2 = (kotlinx.coroutines.flow.u0) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6a
        L41:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L59
        L45:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.jvm.internal.c0 r9 = r7.f310418d
            boolean r9 = r9.f310112d
            if (r9 == 0) goto L5a
            r0.f310408h = r6
            kotlinx.coroutines.flow.k r9 = r7.f310419e
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            return r5
        L5a:
            r0.f310404d = r7
            r0.f310405e = r8
            r0.f310408h = r4
            yz5.p r9 = r7.f310420f
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            r2 = r7
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L86
            kotlin.jvm.internal.c0 r9 = r2.f310418d
            r9.f310112d = r6
            r9 = 0
            r0.f310404d = r9
            r0.f310405e = r9
            r0.f310408h = r3
            kotlinx.coroutines.flow.k r9 = r2.f310419e
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L86
            return r1
        L86:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
