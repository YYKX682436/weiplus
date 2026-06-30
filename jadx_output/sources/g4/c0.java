package g4;

/* loaded from: classes5.dex */
public final class c0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f268220d;

    public c0(kotlinx.coroutines.flow.k kVar, g4.d0 d0Var) {
        this.f268220d = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof g4.b0
            if (r0 == 0) goto L13
            r0 = r7
            g4.b0 r0 = (g4.b0) r0
            int r1 = r0.f268207e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268207e = r1
            goto L18
        L13:
            g4.b0 r0 = new g4.b0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f268206d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f268207e
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.throwOnFailure(r7)
            jz5.l r6 = (jz5.l) r6
            java.lang.Object r6 = r6.f302834e
            if (r6 == 0) goto L45
            r0.f268207e = r4
            kotlinx.coroutines.flow.k r7 = r5.f268220d
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.c0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
