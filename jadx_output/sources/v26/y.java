package v26;

/* loaded from: classes14.dex */
public final class y implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u26.w f433073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f433074e;

    public y(u26.w wVar, int i17) {
        this.f433073d = wVar;
        this.f433074e = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof v26.x
            if (r0 == 0) goto L13
            r0 = r7
            v26.x r0 = (v26.x) r0
            int r1 = r0.f433072f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433072f = r1
            goto L18
        L13:
            v26.x r0 = new v26.x
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f433070d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f433072f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4b
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            kz5.u0 r7 = new kz5.u0
            int r2 = r5.f433074e
            r7.<init>(r2, r6)
            r0.f433072f = r4
            u26.w r6 = r5.f433073d
            java.lang.Object r6 = r6.t(r7, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0.f433072f = r3
            java.lang.Object r6 = kotlinx.coroutines.g4.a(r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v26.y.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
