package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class l0 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f310313e;

    public l0(kotlinx.coroutines.flow.j jVar, yz5.q qVar) {
        this.f310312d = jVar;
        this.f310313e = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // kotlinx.coroutines.flow.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlinx.coroutines.flow.k r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.k0
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.k0 r0 = (kotlinx.coroutines.flow.k0) r0
            int r1 = r0.f310301e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310301e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.k0 r0 = new kotlinx.coroutines.flow.k0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f310300d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310301e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f310304h
            kotlinx.coroutines.flow.k r6 = (kotlinx.coroutines.flow.k) r6
            java.lang.Object r2 = r0.f310303g
            kotlinx.coroutines.flow.l0 r2 = (kotlinx.coroutines.flow.l0) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L51
        L3e:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f310303g = r5
            r0.f310304h = r6
            r0.f310301e = r4
            kotlinx.coroutines.flow.j r7 = r5.f310312d
            java.lang.Object r7 = kotlinx.coroutines.flow.l.e(r7, r6, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L65
            yz5.q r2 = r2.f310313e
            r4 = 0
            r0.f310303g = r4
            r0.f310304h = r4
            r0.f310301e = r3
            java.lang.Object r6 = r2.invoke(r6, r7, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l0.a(kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
