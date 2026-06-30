package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public abstract class b implements kotlinx.coroutines.flow.j {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.k r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.a
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.a r0 = (kotlinx.coroutines.flow.a) r0
            int r1 = r0.f310188g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310188g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a r0 = new kotlinx.coroutines.flow.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f310186e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310188g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.f310185d
            v26.m0 r7 = (v26.m0) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L2d
            goto L58
        L2d:
            r8 = move-exception
            goto L60
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
            v26.m0 r8 = new v26.m0
            oz5.l r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.f310185d = r8     // Catch: java.lang.Throwable -> L5c
            r0.f310188g = r4     // Catch: java.lang.Throwable -> L5c
            r7 = r6
            kotlinx.coroutines.flow.m2 r7 = (kotlinx.coroutines.flow.m2) r7     // Catch: java.lang.Throwable -> L5c
            yz5.p r7 = r7.f310329d     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L5c
            if (r7 != r1) goto L53
            goto L54
        L53:
            r7 = r3
        L54:
            if (r7 != r1) goto L57
            return r1
        L57:
            r7 = r8
        L58:
            r7.releaseIntercepted()
            return r3
        L5c:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L60:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b.a(kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
