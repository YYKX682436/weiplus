package g4;

/* loaded from: classes5.dex */
public final class a2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f268202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.b2 f268203e;

    public a2(kotlinx.coroutines.flow.k kVar, g4.b2 b2Var) {
        this.f268202d = kVar;
        this.f268203e = b2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g4.z1
            if (r0 == 0) goto L13
            r0 = r6
            g4.z1 r0 = (g4.z1) r0
            int r1 = r0.f268649e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268649e = r1
            goto L18
        L13:
            g4.z1 r0 = new g4.z1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f268648d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f268649e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            g4.b5 r5 = (g4.b5) r5
            g4.t0 r6 = new g4.t0
            g4.b2 r2 = r4.f268203e
            int r2 = r2.f268211e
            r6.<init>(r2, r5)
            r0.f268649e = r3
            kotlinx.coroutines.flow.k r5 = r4.f268202d
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.a2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
