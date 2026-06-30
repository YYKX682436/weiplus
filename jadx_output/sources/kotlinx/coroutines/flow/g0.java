package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class g0 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f310261e;

    public g0(kotlinx.coroutines.flow.j jVar, yz5.q qVar) {
        this.f310260d = jVar;
        this.f310261e = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlinx.coroutines.flow.k r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.f0
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.f0 r0 = (kotlinx.coroutines.flow.f0) r0
            int r1 = r0.f310247e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310247e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.f0 r0 = new kotlinx.coroutines.flow.f0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f310246d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310247e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L52
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f310249g
            v26.m0 r9 = (v26.m0) r9
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L32
            goto L7e
        L32:
            r10 = move-exception
            goto L88
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f310249g
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto La2
        L44:
            java.lang.Object r9 = r0.f310250h
            kotlinx.coroutines.flow.k r9 = (kotlinx.coroutines.flow.k) r9
            java.lang.Object r2 = r0.f310249g
            kotlinx.coroutines.flow.g0 r2 = (kotlinx.coroutines.flow.g0) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L50
            goto L65
        L50:
            r9 = move-exception
            goto L8e
        L52:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.flow.j r10 = r8.f310260d     // Catch: java.lang.Throwable -> L8c
            r0.f310249g = r8     // Catch: java.lang.Throwable -> L8c
            r0.f310250h = r9     // Catch: java.lang.Throwable -> L8c
            r0.f310247e = r5     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L8c
            if (r10 != r1) goto L64
            return r1
        L64:
            r2 = r8
        L65:
            v26.m0 r10 = new v26.m0
            oz5.l r4 = r0.getContext()
            r10.<init>(r9, r4)
            yz5.q r9 = r2.f310261e     // Catch: java.lang.Throwable -> L84
            r0.f310249g = r10     // Catch: java.lang.Throwable -> L84
            r0.f310250h = r6     // Catch: java.lang.Throwable -> L84
            r0.f310247e = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L84
            if (r9 != r1) goto L7d
            return r1
        L7d:
            r9 = r10
        L7e:
            r9.releaseIntercepted()
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        L84:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L88:
            r9.releaseIntercepted()
            throw r10
        L8c:
            r9 = move-exception
            r2 = r8
        L8e:
            kotlinx.coroutines.flow.k3 r10 = new kotlinx.coroutines.flow.k3
            r10.<init>(r9)
            yz5.q r2 = r2.f310261e
            r0.f310249g = r9
            r0.f310250h = r6
            r0.f310247e = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.j0.a(r10, r2, r9, r0)
            if (r10 != r1) goto La2
            return r1
        La2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.a(kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
