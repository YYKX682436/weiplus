package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class g1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f310262d;

    public g1(kotlinx.coroutines.flow.k kVar) {
        this.f310262d = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(kotlinx.coroutines.flow.j r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.f1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.f1 r0 = (kotlinx.coroutines.flow.f1) r0
            int r1 = r0.f310253f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310253f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.f1 r0 = new kotlinx.coroutines.flow.f1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f310251d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310253f
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f310253f = r4
            kotlinx.coroutines.flow.k r7 = r5.f310262d
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.k3
            if (r2 != 0) goto L48
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L43
            goto L44
        L43:
            r6 = r3
        L44:
            if (r6 != r1) goto L47
            return r1
        L47:
            return r3
        L48:
            kotlinx.coroutines.flow.k3 r7 = (kotlinx.coroutines.flow.k3) r7
            java.lang.Throwable r6 = r7.f310311d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g1.emit(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
