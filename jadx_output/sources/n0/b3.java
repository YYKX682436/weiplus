package n0;

/* loaded from: classes14.dex */
public final class b3 implements n0.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final n0.r2 f333440d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.n2 f333441e;

    public b3(n0.r2 frameClock) {
        kotlin.jvm.internal.o.g(frameClock, "frameClock");
        this.f333440d = frameClock;
        this.f333441e = new n0.n2();
    }

    @Override // oz5.l
    public java.lang.Object fold(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // oz5.l
    public oz5.i get(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return oz5.h.a(this, key);
    }

    @Override // oz5.i
    public oz5.j getKey() {
        return n0.q2.f333685d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008e A[PHI: r8
  0x008e: PHI (r8v9 java.lang.Object) = (r8v8 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x008b, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // n0.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(yz5.l r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof n0.a3
            if (r0 == 0) goto L13
            r0 = r8
            n0.a3 r0 = (n0.a3) r0
            int r1 = r0.f333432h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f333432h = r1
            goto L18
        L13:
            n0.a3 r0 = new n0.a3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f333430f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f333432h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L8e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f333429e
            yz5.l r7 = (yz5.l) r7
            java.lang.Object r2 = r0.f333428d
            n0.b3 r2 = (n0.b3) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7e
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            n0.n2 r8 = r6.f333441e
            r0.f333428d = r6
            r0.f333429e = r7
            r0.f333432h = r4
            java.lang.Object r2 = r8.f333622a
            monitor-enter(r2)
            boolean r5 = r8.f333625d     // Catch: java.lang.Throwable -> L92
            monitor-exit(r2)
            if (r5 == 0) goto L54
            jz5.f0 r8 = jz5.f0.f302826a
            goto L7a
        L54:
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r5 = pz5.f.b(r0)
            r2.<init>(r5, r4)
            r2.k()
            java.lang.Object r4 = r8.f333622a
            monitor-enter(r4)
            java.util.List r5 = r8.f333623b     // Catch: java.lang.Throwable -> L8f
            r5.add(r2)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r4)
            n0.m2 r4 = new n0.m2
            r4.<init>(r8, r2)
            r2.m(r4)
            java.lang.Object r8 = r2.j()
            if (r8 != r1) goto L78
            goto L7a
        L78:
            jz5.f0 r8 = jz5.f0.f302826a
        L7a:
            if (r8 != r1) goto L7d
            return r1
        L7d:
            r2 = r6
        L7e:
            n0.r2 r8 = r2.f333440d
            r2 = 0
            r0.f333428d = r2
            r0.f333429e = r2
            r0.f333432h = r3
            java.lang.Object r8 = r8.l(r7, r0)
            if (r8 != r1) goto L8e
            return r1
        L8e:
            return r8
        L8f:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L92:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.b3.l(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // oz5.l
    public oz5.l minusKey(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return oz5.h.b(this, key);
    }

    @Override // oz5.l
    public oz5.l plus(oz5.l context) {
        kotlin.jvm.internal.o.g(context, "context");
        return oz5.g.a(this, context);
    }
}
