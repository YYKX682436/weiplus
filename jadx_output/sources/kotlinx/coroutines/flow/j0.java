package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class j0 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlinx.coroutines.flow.k r4, yz5.q r5, java.lang.Throwable r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.e0
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.e0 r0 = (kotlinx.coroutines.flow.e0) r0
            int r1 = r0.f310239f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310239f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.e0 r0 = new kotlinx.coroutines.flow.e0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f310238e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310239f
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.f310237d
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L45
            goto L42
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f310237d = r6     // Catch: java.lang.Throwable -> L45
            r0.f310239f = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L45
            if (r4 != r1) goto L42
            goto L44
        L42:
            jz5.f0 r1 = jz5.f0.f302826a
        L44:
            return r1
        L45:
            r4 = move-exception
            if (r6 == 0) goto L4d
            if (r6 == r4) goto L4d
            jz5.a.a(r4, r6)
        L4d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j0.a(kotlinx.coroutines.flow.k, yz5.q, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
