package v14;

/* loaded from: classes5.dex */
public final class s implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f432583d;

    public s(kotlinx.coroutines.flow.k kVar) {
        this.f432583d = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof v14.r
            if (r0 == 0) goto L13
            r0 = r6
            v14.r r0 = (v14.r) r0
            int r1 = r0.f432581e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432581e = r1
            goto L18
        L13:
            v14.r r0 = new v14.r
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f432580d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f432581e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r5
            e21.f0 r6 = (e21.f0) r6
            xg3.q0 r6 = r6.f246516a
            int r6 = r6.b()
            r2 = 64
            if (r6 != r2) goto L41
            r6 = r3
            goto L42
        L41:
            r6 = 0
        L42:
            if (r6 == 0) goto L4f
            r0.f432581e = r3
            kotlinx.coroutines.flow.k r6 = r4.f432583d
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v14.s.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
