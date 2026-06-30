package g4;

/* loaded from: classes5.dex */
public final class t2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f268567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.u2 f268568e;

    public t2(kotlinx.coroutines.flow.k kVar, g4.u2 u2Var) {
        this.f268567d = kVar;
        this.f268568e = u2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof g4.s2
            if (r0 == 0) goto L13
            r0 = r8
            g4.s2 r0 = (g4.s2) r0
            int r1 = r0.f268551e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268551e = r1
            goto L18
        L13:
            g4.s2 r0 = new g4.s2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f268550d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f268551e
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.throwOnFailure(r8)
            goto L66
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            g4.b5 r8 = (g4.b5) r8
            int r2 = r8.f268215a
            int r2 = r2 * (-1)
            g4.u2 r5 = r6.f268568e
            g4.v2 r5 = r5.f268585e
            g4.y2 r5 = r5.f268590e
            g4.h3 r5 = r5.f268639j
            int r5 = r5.f268357f
            if (r2 > r5) goto L50
            int r8 = r8.f268216b
            int r8 = r8 * (-1)
            if (r8 <= r5) goto L4e
            goto L50
        L4e:
            r8 = 0
            goto L51
        L50:
            r8 = r4
        L51:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L66
            r0.f268551e = r4
            kotlinx.coroutines.flow.k r8 = r6.f268567d
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.t2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
