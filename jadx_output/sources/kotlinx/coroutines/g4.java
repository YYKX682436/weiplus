package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class g4 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            oz5.l r0 = r7.getContext()
            kotlinx.coroutines.v2.f(r0)
            kotlin.coroutines.Continuation r7 = pz5.f.b(r7)
            boolean r1 = r7 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            r2 = 0
            if (r1 == 0) goto L13
            kotlinx.coroutines.internal.DispatchedContinuation r7 = (kotlinx.coroutines.internal.DispatchedContinuation) r7
            goto L14
        L13:
            r7 = r2
        L14:
            jz5.f0 r1 = jz5.f0.f302826a
            if (r7 != 0) goto L19
            goto L76
        L19:
            kotlinx.coroutines.p0 r3 = r7.dispatcher
            boolean r3 = r3.I(r0)
            if (r3 == 0) goto L25
            r7.dispatchYield$kotlinx_coroutines_core(r0, r1)
            goto L7d
        L25:
            kotlinx.coroutines.f4 r3 = new kotlinx.coroutines.f4
            r3.<init>()
            oz5.l r0 = r0.plus(r3)
            r7.dispatchYield$kotlinx_coroutines_core(r0, r1)
            boolean r0 = r3.f310184d
            if (r0 == 0) goto L7d
            kotlinx.coroutines.v3 r0 = kotlinx.coroutines.v3.f310684a
            kotlinx.coroutines.w1 r0 = r0.a()
            kotlinx.coroutines.internal.a r3 = r0.f310689g
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L4a
            int r6 = r3.f310481b
            int r3 = r3.f310482c
            if (r6 != r3) goto L48
            goto L4a
        L48:
            r3 = r4
            goto L4b
        L4a:
            r3 = r5
        L4b:
            if (r3 == 0) goto L4e
            goto L71
        L4e:
            boolean r3 = r0.O()
            if (r3 == 0) goto L5d
            r7._state = r1
            r7.resumeMode = r5
            r0.M(r7)
            r4 = r5
            goto L71
        L5d:
            r0.N(r5)
            r7.run()     // Catch: java.lang.Throwable -> L6a
        L63:
            boolean r3 = r0.Q()     // Catch: java.lang.Throwable -> L6a
            if (r3 != 0) goto L63
            goto L6e
        L6a:
            r3 = move-exception
            r7.handleFatalException(r3, r2)     // Catch: java.lang.Throwable -> L78
        L6e:
            r0.K(r5)
        L71:
            if (r4 == 0) goto L76
            pz5.a r7 = pz5.a.f359186d
            goto L7f
        L76:
            r7 = r1
            goto L7f
        L78:
            r7 = move-exception
            r0.K(r5)
            throw r7
        L7d:
            pz5.a r7 = pz5.a.f359186d
        L7f:
            pz5.a r0 = pz5.a.f359186d
            if (r7 != r0) goto L84
            return r7
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.g4.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
