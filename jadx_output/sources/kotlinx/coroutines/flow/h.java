package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class h implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i f310275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f310276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f310277f;

    public h(kotlinx.coroutines.flow.i iVar, kotlin.jvm.internal.h0 h0Var, kotlinx.coroutines.flow.k kVar) {
        this.f310275d = iVar;
        this.f310276e = h0Var;
        this.f310277f = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.g
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.g r0 = (kotlinx.coroutines.flow.g) r0
            int r1 = r0.f310259f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310259f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.g r0 = new kotlinx.coroutines.flow.g
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f310257d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310259f
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.throwOnFailure(r10)
            goto L61
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.flow.i r10 = r8.f310275d
            yz5.l r2 = r10.f310291e
            java.lang.Object r2 = r2.invoke(r9)
            kotlin.jvm.internal.h0 r5 = r8.f310276e
            java.lang.Object r6 = r5.f310123d
            kotlinx.coroutines.internal.l0 r7 = v26.k0.f433020a
            if (r6 == r7) goto L54
            yz5.p r10 = r10.f310292f
            java.lang.Object r10 = r10.invoke(r6, r2)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L53
            goto L54
        L53:
            return r3
        L54:
            r5.f310123d = r2
            r0.f310259f = r4
            kotlinx.coroutines.flow.k r10 = r8.f310277f
            java.lang.Object r9 = r10.emit(r9, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
