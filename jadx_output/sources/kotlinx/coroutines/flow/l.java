package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public abstract class l {
    public static final kotlinx.coroutines.flow.n2 a(kotlinx.coroutines.flow.i2 i2Var) {
        return new kotlinx.coroutines.flow.k2(i2Var, null);
    }

    public static final kotlinx.coroutines.flow.f3 b(kotlinx.coroutines.flow.j2 j2Var) {
        return new kotlinx.coroutines.flow.l2(j2Var, null);
    }

    public static kotlinx.coroutines.flow.j c(kotlinx.coroutines.flow.j jVar, int i17, u26.u uVar, int i18, java.lang.Object obj) {
        int i19;
        u26.u uVar2;
        if ((i18 & 1) != 0) {
            i17 = -2;
        }
        int i27 = i18 & 2;
        u26.u uVar3 = u26.u.SUSPEND;
        if (i27 != 0) {
            uVar = uVar3;
        }
        boolean z17 = true;
        if (!(i17 >= 0 || i17 == -2 || i17 == -1)) {
            throw new java.lang.IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i17).toString());
        }
        if (i17 == -1 && uVar != uVar3) {
            z17 = false;
        }
        if (!z17) {
            throw new java.lang.IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i17 == -1) {
            uVar2 = u26.u.DROP_OLDEST;
            i19 = 0;
        } else {
            i19 = i17;
            uVar2 = uVar;
        }
        return jVar instanceof v26.h0 ? v26.g0.a((v26.h0) jVar, null, i19, uVar2, 1, null) : new v26.o(jVar, null, i19, uVar2, 2, null);
    }

    public static final kotlinx.coroutines.flow.j d(yz5.p pVar) {
        return new kotlinx.coroutines.flow.d(pVar, oz5.m.f350329d, -2, u26.u.SUSPEND);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(kotlinx.coroutines.flow.j r4, kotlinx.coroutines.flow.k r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.m0
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.m0 r0 = (kotlinx.coroutines.flow.m0) r0
            int r1 = r0.f310324f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310324f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m0 r0 = new kotlinx.coroutines.flow.m0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f310323e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310324f
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f310322d
            kotlin.jvm.internal.h0 r4 = (kotlin.jvm.internal.h0) r4
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4e
        L2b:
            r5 = move-exception
            r1 = r5
            goto L53
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.h0 r6 = new kotlin.jvm.internal.h0
            r6.<init>()
            kotlinx.coroutines.flow.o0 r2 = new kotlinx.coroutines.flow.o0     // Catch: java.lang.Throwable -> L50
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L50
            r0.f310322d = r6     // Catch: java.lang.Throwable -> L50
            r0.f310324f = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L50
            if (r4 != r1) goto L4e
            goto L8d
        L4e:
            r1 = 0
            goto L8d
        L50:
            r4 = move-exception
            r1 = r4
            r4 = r6
        L53:
            java.lang.Object r4 = r4.f310123d
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r5 = 0
            if (r4 == 0) goto L62
            boolean r6 = kotlin.jvm.internal.o.b(r4, r1)
            if (r6 == 0) goto L62
            r6 = r3
            goto L63
        L62:
            r6 = r5
        L63:
            if (r6 != 0) goto L9a
            oz5.l r6 = r0.getContext()
            kotlinx.coroutines.q2 r0 = kotlinx.coroutines.q2.f310571d
            oz5.i r6 = r6.get(r0)
            kotlinx.coroutines.r2 r6 = (kotlinx.coroutines.r2) r6
            if (r6 == 0) goto L89
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L7a
            goto L89
        L7a:
            java.util.concurrent.CancellationException r6 = r6.x()
            if (r6 == 0) goto L87
            boolean r6 = kotlin.jvm.internal.o.b(r6, r1)
            if (r6 == 0) goto L87
            goto L88
        L87:
            r3 = r5
        L88:
            r5 = r3
        L89:
            if (r5 != 0) goto L9a
            if (r4 != 0) goto L8e
        L8d:
            return r1
        L8e:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L96
            jz5.a.a(r4, r1)
            throw r4
        L96:
            jz5.a.a(r1, r4)
            throw r1
        L9a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.e(kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object f(kotlinx.coroutines.flow.j jVar, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        int i17 = kotlinx.coroutines.flow.i1.f310295a;
        java.lang.Object a17 = c(new v26.t(new kotlinx.coroutines.flow.h1(pVar, null), jVar, oz5.m.f350329d, -2, u26.u.SUSPEND), 0, null, 2, null).a(v26.j0.f433015d, continuation);
        pz5.a aVar = pz5.a.f359186d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (a17 != aVar) {
            a17 = f0Var;
        }
        return a17 == aVar ? a17 : f0Var;
    }

    public static final kotlinx.coroutines.flow.j g(u26.t0 t0Var) {
        return new kotlinx.coroutines.flow.e(t0Var, true, null, 0, null, 28, null);
    }

    public static final kotlinx.coroutines.flow.j h(kotlinx.coroutines.flow.j jVar, long j17) {
        if (j17 >= 0) {
            return j17 == 0 ? jVar : new v26.e0(new kotlinx.coroutines.flow.b0(new kotlinx.coroutines.flow.v(j17), jVar, null));
        }
        throw new java.lang.IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    public static final kotlinx.coroutines.flow.j i(kotlinx.coroutines.flow.j jVar) {
        if (jVar instanceof kotlinx.coroutines.flow.f3) {
            return jVar;
        }
        kotlinx.coroutines.flow.d0 d0Var = kotlinx.coroutines.flow.d0.f310226d;
        kotlinx.coroutines.flow.c0 c0Var = kotlinx.coroutines.flow.c0.f310216d;
        if (jVar instanceof kotlinx.coroutines.flow.i) {
            kotlinx.coroutines.flow.i iVar = (kotlinx.coroutines.flow.i) jVar;
            if (iVar.f310291e == d0Var && iVar.f310292f == c0Var) {
                return jVar;
            }
        }
        return new kotlinx.coroutines.flow.i(jVar, d0Var, c0Var);
    }

    public static final kotlinx.coroutines.flow.j j(kotlinx.coroutines.flow.j jVar, int i17) {
        if (i17 >= 0) {
            return new kotlinx.coroutines.flow.p0(jVar, i17);
        }
        throw new java.lang.IllegalArgumentException(("Drop count should be non-negative, but had " + i17).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(kotlinx.coroutines.flow.j r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.m1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.m1 r0 = (kotlinx.coroutines.flow.m1) r0
            int r1 = r0.f310328g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310328g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m1 r0 = new kotlinx.coroutines.flow.m1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f310327f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310328g
            kotlinx.coroutines.internal.l0 r3 = v26.k0.f433020a
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r5 = r0.f310326e
            kotlinx.coroutines.flow.j1 r5 = (kotlinx.coroutines.flow.j1) r5
            java.lang.Object r0 = r0.f310325d
            kotlin.jvm.internal.h0 r0 = (kotlin.jvm.internal.h0) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: v26.a -> L31
            goto L61
        L31:
            r6 = move-exception
            goto L5d
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.h0 r6 = new kotlin.jvm.internal.h0
            r6.<init>()
            r6.f310123d = r3
            kotlinx.coroutines.flow.j1 r2 = new kotlinx.coroutines.flow.j1
            r2.<init>(r6)
            r0.f310325d = r6     // Catch: v26.a -> L59
            r0.f310326e = r2     // Catch: v26.a -> L59
            r0.f310328g = r4     // Catch: v26.a -> L59
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: v26.a -> L59
            if (r5 != r1) goto L57
            goto L65
        L57:
            r0 = r6
            goto L61
        L59:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L5d:
            kotlinx.coroutines.flow.k r1 = r6.f432972d
            if (r1 != r5) goto L6e
        L61:
            java.lang.Object r1 = r0.f310123d
            if (r1 == r3) goto L66
        L65:
            return r1
        L66:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.k(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (r6.a(r2, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(kotlinx.coroutines.flow.j r6, yz5.p r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.n1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.n1 r0 = (kotlinx.coroutines.flow.n1) r0
            int r1 = r0.f310339h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310339h = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.n1 r0 = new kotlinx.coroutines.flow.n1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f310338g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310339h
            kotlinx.coroutines.internal.l0 r3 = v26.k0.f433020a
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 != r4) goto L3b
            java.lang.Object r6 = r0.f310337f
            kotlinx.coroutines.flow.l1 r6 = (kotlinx.coroutines.flow.l1) r6
            java.lang.Object r7 = r0.f310336e
            kotlin.jvm.internal.h0 r7 = (kotlin.jvm.internal.h0) r7
            java.lang.Object r0 = r0.f310335d
            yz5.p r0 = (yz5.p) r0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: v26.a -> L35
            goto L6a
        L35:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r0
            r0 = r5
            goto L64
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.h0 r8 = new kotlin.jvm.internal.h0
            r8.<init>()
            r8.f310123d = r3
            kotlinx.coroutines.flow.l1 r2 = new kotlinx.coroutines.flow.l1
            r2.<init>(r7, r8)
            r0.f310335d = r7     // Catch: v26.a -> L61
            r0.f310336e = r8     // Catch: v26.a -> L61
            r0.f310337f = r2     // Catch: v26.a -> L61
            r0.f310339h = r4     // Catch: v26.a -> L61
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: v26.a -> L61
            if (r6 != r1) goto L68
            goto L6e
        L61:
            r6 = move-exception
            r0 = r6
            r6 = r2
        L64:
            kotlinx.coroutines.flow.k r1 = r0.f432972d
            if (r1 != r6) goto L83
        L68:
            r0 = r7
            r7 = r8
        L6a:
            java.lang.Object r1 = r7.f310123d
            if (r1 == r3) goto L6f
        L6e:
            return r1
        L6f:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected at least one element matching the predicate "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.l(kotlinx.coroutines.flow.j, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static kotlinx.coroutines.flow.j m(kotlinx.coroutines.flow.j jVar, int i17, yz5.p pVar, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = kotlinx.coroutines.flow.i1.f310295a;
        } else {
            int i19 = kotlinx.coroutines.flow.i1.f310295a;
        }
        int i27 = i17;
        kotlinx.coroutines.flow.d1 d1Var = new kotlinx.coroutines.flow.d1(jVar, pVar);
        if (i27 > 0) {
            return i27 == 1 ? new kotlinx.coroutines.flow.e1(d1Var) : new v26.l(d1Var, i27, oz5.m.f350329d, -2, u26.u.SUSPEND);
        }
        throw new java.lang.IllegalArgumentException(("Expected positive concurrency level, but had " + i27).toString());
    }

    public static final kotlinx.coroutines.flow.j n(kotlinx.coroutines.flow.j jVar, oz5.l lVar) {
        int i17 = kotlinx.coroutines.r2.O0;
        if (lVar.get(kotlinx.coroutines.q2.f310571d) == null) {
            return kotlin.jvm.internal.o.b(lVar, oz5.m.f350329d) ? jVar : jVar instanceof v26.h0 ? v26.g0.a((v26.h0) jVar, lVar, 0, null, 6, null) : new v26.o(jVar, lVar, 0, null, 12, null);
        }
        throw new java.lang.IllegalArgumentException(("Flow context cannot contain job in it. Had " + lVar).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(kotlinx.coroutines.flow.j r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.o1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.o1 r0 = (kotlinx.coroutines.flow.o1) r0
            int r1 = r0.f310351f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310351f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o1 r0 = new kotlinx.coroutines.flow.o1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f310350e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310351f
            kotlinx.coroutines.internal.l0 r3 = v26.k0.f433020a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r5 = r0.f310349d
            kotlin.jvm.internal.h0 r5 = (kotlin.jvm.internal.h0) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L50
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.h0 r6 = new kotlin.jvm.internal.h0
            r6.<init>()
            r6.f310123d = r3
            kotlinx.coroutines.flow.p1 r2 = new kotlinx.coroutines.flow.p1
            r2.<init>(r6)
            r0.f310349d = r6
            r0.f310351f = r4
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L4f
            goto L54
        L4f:
            r5 = r6
        L50:
            java.lang.Object r1 = r5.f310123d
            if (r1 == r3) goto L55
        L54:
            return r1
        L55:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.o(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final kotlinx.coroutines.r2 p(kotlinx.coroutines.flow.j jVar, kotlinx.coroutines.y0 y0Var) {
        return kotlinx.coroutines.l.d(y0Var, null, null, new kotlinx.coroutines.flow.u(jVar, null), 3, null);
    }

    public static final kotlinx.coroutines.flow.f3 q(kotlinx.coroutines.flow.j jVar, kotlinx.coroutines.y0 y0Var, kotlinx.coroutines.flow.w2 w2Var, java.lang.Object obj) {
        kotlinx.coroutines.flow.u2 u2Var;
        v26.g gVar;
        kotlinx.coroutines.flow.j h17;
        u26.w.f424200j1.getClass();
        int i17 = u26.v.f424199b;
        if (1 >= i17) {
            i17 = 1;
        }
        int i18 = i17 - 1;
        boolean z17 = jVar instanceof v26.g;
        u26.u uVar = u26.u.SUSPEND;
        if (!z17 || (h17 = (gVar = (v26.g) jVar).h()) == null) {
            u2Var = new kotlinx.coroutines.flow.u2(jVar, i18, uVar, oz5.m.f350329d);
        } else {
            u26.u uVar2 = gVar.f433004f;
            int i19 = gVar.f433003e;
            if (i19 != -3 && i19 != -2 && i19 != 0) {
                i18 = i19;
            } else if (uVar2 != uVar || i19 == 0) {
                i18 = 0;
            }
            u2Var = new kotlinx.coroutines.flow.u2(h17, i18, uVar2, gVar.f433002d);
        }
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(obj);
        kotlinx.coroutines.flow.j jVar2 = u2Var.f310422a;
        int i27 = kotlinx.coroutines.flow.w2.f310443a;
        return new kotlinx.coroutines.flow.l2(a17, kotlinx.coroutines.l.c(y0Var, u2Var.f310423b, kotlin.jvm.internal.o.b(w2Var, kotlinx.coroutines.flow.v2.f310429a) ? kotlinx.coroutines.a1.DEFAULT : kotlinx.coroutines.a1.UNDISPATCHED, new kotlinx.coroutines.flow.s1(w2Var, jVar2, a17, obj, null)));
    }

    public static final kotlinx.coroutines.flow.j r(kotlinx.coroutines.flow.j jVar, int i17) {
        if (i17 > 0) {
            return new kotlinx.coroutines.flow.x0(jVar, i17);
        }
        throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " should be positive").toString());
    }
}
