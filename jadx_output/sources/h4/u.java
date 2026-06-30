package h4;

/* loaded from: classes14.dex */
public final class u implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f278699d;

    public u(h4.v vVar, kotlinx.coroutines.flow.k kVar) {
        this.f278699d = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof h4.t
            if (r0 == 0) goto L13
            r0 = r6
            h4.t r0 = (h4.t) r0
            int r1 = r0.f278696e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278696e = r1
            goto L18
        L13:
            h4.t r0 = new h4.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f278695d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f278696e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f278698g
            h4.n r5 = (h4.n) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L47
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            h4.n r5 = (h4.n) r5
            java.lang.Object r6 = r5.f278683a
            r0.f278698g = r5
            r0.f278696e = r3
            kotlinx.coroutines.flow.k r2 = r4.f278699d
            java.lang.Object r6 = r2.emit(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            kotlinx.coroutines.z r5 = r5.f278684b
            jz5.f0 r6 = jz5.f0.f302826a
            kotlinx.coroutines.a0 r5 = (kotlinx.coroutines.a0) r5
            r5.U(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.u.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
