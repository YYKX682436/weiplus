package h4;

/* loaded from: classes14.dex */
public final class d0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.e0 f278639d;

    public d0(h4.e0 e0Var) {
        this.f278639d = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof h4.c0
            if (r0 == 0) goto L13
            r0 = r9
            h4.c0 r0 = (h4.c0) r0
            int r1 = r0.f278632e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278632e = r1
            goto L18
        L13:
            h4.c0 r0 = new h4.c0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f278631d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f278632e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r9)
            goto L66
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.f278634g
            kotlinx.coroutines.z r8 = (kotlinx.coroutines.z) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L59
        L3b:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.z r9 = kotlinx.coroutines.b0.a(r4, r5, r4)
            h4.e0 r2 = r7.f278639d
            h4.g0 r2 = r2.f278646e
            yz5.p r2 = r2.f278659d
            h4.n r6 = new h4.n
            r6.<init>(r8, r9)
            r0.f278634g = r9
            r0.f278632e = r5
            java.lang.Object r8 = r2.invoke(r6, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r8 = r9
        L59:
            r0.f278634g = r4
            r0.f278632e = r3
            kotlinx.coroutines.a0 r8 = (kotlinx.coroutines.a0) r8
            java.lang.Object r8 = r8.k(r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.d0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
