package u26;

/* loaded from: classes5.dex */
public abstract class p0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(u26.r0 r4, yz5.a r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof u26.n0
            if (r0 == 0) goto L13
            r0 = r6
            u26.n0 r0 = (u26.n0) r0
            int r1 = r0.f424179g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f424179g = r1
            goto L18
        L13:
            u26.n0 r0 = new u26.n0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f424178f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f424179g
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f424177e
            r5 = r4
            yz5.a r5 = (yz5.a) r5
            java.lang.Object r4 = r0.f424176d
            u26.r0 r4 = (u26.r0) r4
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L30
            goto L73
        L30:
            r4 = move-exception
            goto L79
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.ResultKt.throwOnFailure(r6)
            oz5.l r6 = r0.getContext()
            int r2 = kotlinx.coroutines.r2.O0
            kotlinx.coroutines.q2 r2 = kotlinx.coroutines.q2.f310571d
            oz5.i r6 = r6.get(r2)
            if (r6 != r4) goto L4d
            r6 = r3
            goto L4e
        L4d:
            r6 = 0
        L4e:
            if (r6 == 0) goto L7d
            r0.f424176d = r4     // Catch: java.lang.Throwable -> L30
            r0.f424177e = r5     // Catch: java.lang.Throwable -> L30
            r0.f424179g = r3     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r     // Catch: java.lang.Throwable -> L30
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)     // Catch: java.lang.Throwable -> L30
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L30
            r6.k()     // Catch: java.lang.Throwable -> L30
            u26.o0 r0 = new u26.o0     // Catch: java.lang.Throwable -> L30
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L30
            u26.x r4 = (u26.x) r4     // Catch: java.lang.Throwable -> L30
            r4.n(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r6.j()     // Catch: java.lang.Throwable -> L30
            if (r4 != r1) goto L73
            return r1
        L73:
            r5.invoke()
            jz5.f0 r4 = jz5.f0.f302826a
            return r4
        L79:
            r5.invoke()
            throw r4
        L7d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u26.p0.a(u26.r0, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
