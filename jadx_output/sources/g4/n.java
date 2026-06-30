package g4;

/* loaded from: classes5.dex */
public final class n implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f268447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.o f268448e;

    public n(kotlinx.coroutines.flow.k kVar, g4.o oVar) {
        this.f268447d = kVar;
        this.f268448e = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof g4.m
            if (r0 == 0) goto L13
            r0 = r12
            g4.m r0 = (g4.m) r0
            int r1 = r0.f268424e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268424e = r1
            goto L18
        L13:
            g4.m r0 = new g4.m
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f268423d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f268424e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r12)
            goto L4d
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            kotlin.ResultKt.throwOnFailure(r12)
            r6 = r11
            g4.j3 r6 = (g4.j3) r6
            g4.d1 r11 = new g4.d1
            g4.o r12 = r10.f268448e
            kotlinx.coroutines.y0 r5 = r12.f268462e
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f268424e = r3
            kotlinx.coroutines.flow.k r12 = r10.f268447d
            java.lang.Object r11 = r12.emit(r11, r0)
            if (r11 != r1) goto L4d
            return r1
        L4d:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.n.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
