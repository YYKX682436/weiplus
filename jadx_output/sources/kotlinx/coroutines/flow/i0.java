package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class i0 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310294e;

    public i0(yz5.p pVar, kotlinx.coroutines.flow.j jVar) {
        this.f310293d = pVar;
        this.f310294e = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // kotlinx.coroutines.flow.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlinx.coroutines.flow.k r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.h0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.h0 r0 = (kotlinx.coroutines.flow.h0) r0
            int r1 = r0.f310279e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310279e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.h0 r0 = new kotlinx.coroutines.flow.h0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f310278d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310279e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L79
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f310283i
            v26.m0 r7 = (v26.m0) r7
            java.lang.Object r2 = r0.f310282h
            kotlinx.coroutines.flow.k r2 = (kotlinx.coroutines.flow.k) r2
            java.lang.Object r4 = r0.f310281g
            kotlinx.coroutines.flow.i0 r4 = (kotlinx.coroutines.flow.i0) r4
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L42
            goto L64
        L42:
            r8 = move-exception
            goto L80
        L44:
            kotlin.ResultKt.throwOnFailure(r8)
            v26.m0 r8 = new v26.m0
            oz5.l r2 = r0.getContext()
            r8.<init>(r7, r2)
            yz5.p r2 = r6.f310293d     // Catch: java.lang.Throwable -> L7c
            r0.f310281g = r6     // Catch: java.lang.Throwable -> L7c
            r0.f310282h = r7     // Catch: java.lang.Throwable -> L7c
            r0.f310283i = r8     // Catch: java.lang.Throwable -> L7c
            r0.f310279e = r4     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L7c
            if (r2 != r1) goto L61
            return r1
        L61:
            r4 = r6
            r2 = r7
            r7 = r8
        L64:
            r7.releaseIntercepted()
            kotlinx.coroutines.flow.j r7 = r4.f310294e
            r8 = 0
            r0.f310281g = r8
            r0.f310282h = r8
            r0.f310283i = r8
            r0.f310279e = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        L7c:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L80:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.i0.a(kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
