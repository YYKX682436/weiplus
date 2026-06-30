package x0;

/* loaded from: classes14.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final n0.c5 f450962a = new n0.c5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f450963b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static x0.s f450964c;

    /* renamed from: d, reason: collision with root package name */
    public static int f450965d;

    /* renamed from: e, reason: collision with root package name */
    public static final x0.q f450966e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f450967f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f450968g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f450969h;

    static {
        x0.s sVar = x0.s.f450939h;
        f450964c = sVar;
        f450965d = 1;
        f450966e = new x0.q();
        f450967f = new java.util.ArrayList();
        f450968g = new java.util.ArrayList();
        int i17 = f450965d;
        f450965d = i17 + 1;
        x0.d dVar = new x0.d(i17, sVar);
        f450964c = f450964c.j(dVar.f450909b);
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(dVar);
        f450969h = atomicReference;
        java.lang.Object obj = atomicReference.get();
        kotlin.jvm.internal.o.f(obj, "currentGlobalSnapshot.get()");
    }

    public static final void a() {
        f(x0.u.f450950d);
    }

    public static final yz5.l b(yz5.l lVar, yz5.l lVar2) {
        return (lVar == null || lVar2 == null || kotlin.jvm.internal.o.b(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new x0.x(lVar, lVar2);
    }

    public static final java.util.Map c(x0.e eVar, x0.e eVar2, x0.s sVar) {
        x0.a1 p17;
        java.util.Set<x0.z0> u17 = eVar2.u();
        int d17 = eVar.d();
        if (u17 == null) {
            return null;
        }
        x0.s h17 = eVar2.e().j(eVar2.d()).h(eVar2.f450878i);
        java.util.HashMap hashMap = null;
        for (x0.z0 z0Var : u17) {
            x0.a1 g17 = z0Var.g();
            x0.a1 p18 = p(g17, d17, sVar);
            if (p18 != null && (p17 = p(g17, d17, h17)) != null && !kotlin.jvm.internal.o.b(p18, p17)) {
                x0.a1 p19 = p(g17, eVar2.d(), eVar2.e());
                if (p19 == null) {
                    o();
                    throw null;
                }
                x0.a1 d18 = z0Var.d(p17, p18, p19);
                if (d18 == null) {
                    return null;
                }
                if (hashMap == null) {
                    hashMap = new java.util.HashMap();
                }
                hashMap.put(p18, d18);
            }
        }
        return hashMap;
    }

    public static final void d(x0.m mVar) {
        if (!f450964c.g(mVar.d())) {
            throw new java.lang.IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final x0.s e(x0.s sVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sVar, "<this>");
        while (i17 < i18) {
            sVar = sVar.j(i17);
            i17++;
        }
        return sVar;
    }

    public static final java.lang.Object f(yz5.l lVar) {
        java.lang.Object t17;
        java.util.List V0;
        x0.d previousGlobalSnapshot = (x0.d) f450969h.get();
        java.lang.Object obj = f450963b;
        synchronized (obj) {
            kotlin.jvm.internal.o.f(previousGlobalSnapshot, "previousGlobalSnapshot");
            t17 = t(previousGlobalSnapshot, lVar);
        }
        java.util.Set set = previousGlobalSnapshot.f450877h;
        if (set != null) {
            synchronized (obj) {
                V0 = kz5.n0.V0(f450967f);
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) V0;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((yz5.p) arrayList.get(i17)).invoke(set, previousGlobalSnapshot);
            }
        }
        return t17;
    }

    public static final x0.m g(x0.m mVar, yz5.l lVar) {
        boolean z17 = mVar instanceof x0.e;
        if (z17 || mVar == null) {
            return new x0.d1(z17 ? (x0.e) mVar : null, lVar, null, false);
        }
        return new x0.e1(mVar, lVar, false);
    }

    public static final x0.a1 h(x0.a1 r17, x0.m snapshot) {
        kotlin.jvm.internal.o.g(r17, "r");
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        x0.a1 p17 = p(r17, snapshot.d(), snapshot.e());
        if (p17 != null) {
            return p17;
        }
        o();
        throw null;
    }

    public static final x0.m i() {
        x0.m mVar = (x0.m) f450962a.a();
        if (mVar != null) {
            return mVar;
        }
        java.lang.Object obj = f450969h.get();
        kotlin.jvm.internal.o.f(obj, "currentGlobalSnapshot.get()");
        return (x0.m) obj;
    }

    public static final yz5.l j(yz5.l lVar, yz5.l lVar2, boolean z17) {
        if (!z17) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || kotlin.jvm.internal.o.b(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new x0.w(lVar, lVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if ((r5 < 0 || r5 >= 64 ? !(r5 < 64 || r5 >= 128 || ((1 << (r5 + (-64))) & 0) == 0) : ((1 << r5) & 0) != 0) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final x0.a1 k(x0.a1 r12, x0.z0 r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.g(r13, r0)
            x0.a1 r0 = r13.g()
            int r1 = x0.z.f450965d
            x0.q r2 = x0.z.f450966e
            int r3 = r2.f450920a
            r4 = 0
            if (r3 <= 0) goto L1b
            int[] r1 = r2.f450921b
            r1 = r1[r4]
        L1b:
            int r1 = r1 + (-1)
            r2 = 0
            r3 = r2
        L1f:
            if (r0 == 0) goto L67
            int r5 = r0.f450861a
            if (r5 != 0) goto L26
            goto L60
        L26:
            if (r5 == 0) goto L53
            if (r5 > r1) goto L53
            int r5 = r5 + 0
            r6 = 1
            r7 = 0
            r9 = 1
            r11 = 64
            if (r5 < 0) goto L41
            if (r5 >= r11) goto L41
            long r9 = r9 << r5
            long r9 = r9 & r7
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L3f
        L3d:
            r5 = r6
            goto L50
        L3f:
            r5 = r4
            goto L50
        L41:
            if (r5 < r11) goto L3f
            r11 = 128(0x80, float:1.8E-43)
            if (r5 >= r11) goto L3f
            int r5 = r5 + (-64)
            long r9 = r9 << r5
            long r9 = r9 & r7
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L3f
            goto L3d
        L50:
            if (r5 != 0) goto L53
            goto L54
        L53:
            r6 = r4
        L54:
            if (r6 == 0) goto L64
            if (r3 != 0) goto L5a
            r3 = r0
            goto L64
        L5a:
            int r1 = r0.f450861a
            int r2 = r3.f450861a
            if (r1 >= r2) goto L62
        L60:
            r2 = r0
            goto L67
        L62:
            r2 = r3
            goto L67
        L64:
            x0.a1 r0 = r0.f450862b
            goto L1f
        L67:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == 0) goto L6f
            r2.f450861a = r0
            goto L7e
        L6f:
            x0.a1 r2 = r12.b()
            r2.f450861a = r0
            x0.a1 r12 = r13.g()
            r2.f450862b = r12
            r13.e(r2)
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.z.k(x0.a1, x0.z0):x0.a1");
    }

    public static final x0.a1 l(x0.a1 a1Var, x0.z0 state, x0.m snapshot) {
        kotlin.jvm.internal.o.g(a1Var, "<this>");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        x0.a1 k17 = k(a1Var, state);
        k17.a(a1Var);
        k17.f450861a = snapshot.d();
        return k17;
    }

    public static final void m(x0.m snapshot, x0.z0 state) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        kotlin.jvm.internal.o.g(state, "state");
        yz5.l h17 = snapshot.h();
        if (h17 != null) {
            h17.invoke(state);
        }
    }

    public static final x0.a1 n(x0.a1 a1Var, x0.z0 state, x0.m snapshot, x0.a1 candidate) {
        kotlin.jvm.internal.o.g(a1Var, "<this>");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        kotlin.jvm.internal.o.g(candidate, "candidate");
        if (snapshot.g()) {
            snapshot.m(state);
        }
        int d17 = snapshot.d();
        if (candidate.f450861a == d17) {
            return candidate;
        }
        x0.a1 k17 = k(a1Var, state);
        k17.f450861a = d17;
        snapshot.m(state);
        return k17;
    }

    public static final java.lang.Void o() {
        throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final x0.a1 p(x0.a1 a1Var, int i17, x0.s sVar) {
        x0.a1 a1Var2 = null;
        while (a1Var != null) {
            int i18 = a1Var.f450861a;
            if (((i18 == 0 || i18 > i17 || sVar.g(i18)) ? false : true) && (a1Var2 == null || a1Var2.f450861a < a1Var.f450861a)) {
                a1Var2 = a1Var;
            }
            a1Var = a1Var.f450862b;
        }
        if (a1Var2 != null) {
            return a1Var2;
        }
        return null;
    }

    public static final x0.a1 q(x0.a1 a1Var, x0.z0 state) {
        kotlin.jvm.internal.o.g(a1Var, "<this>");
        kotlin.jvm.internal.o.g(state, "state");
        return r(a1Var, state, i());
    }

    public static final x0.a1 r(x0.a1 a1Var, x0.z0 state, x0.m snapshot) {
        kotlin.jvm.internal.o.g(a1Var, "<this>");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        yz5.l f17 = snapshot.f();
        if (f17 != null) {
            f17.invoke(state);
        }
        x0.a1 p17 = p(a1Var, snapshot.d(), snapshot.e());
        if (p17 != null) {
            return p17;
        }
        o();
        throw null;
    }

    public static final void s(int i17) {
        int i18;
        x0.q qVar = f450966e;
        int i19 = qVar.f450923d[i17];
        qVar.b(i19, qVar.f450920a - 1);
        qVar.f450920a--;
        int[] iArr = qVar.f450921b;
        int i27 = iArr[i19];
        int i28 = i19;
        while (i28 > 0) {
            int i29 = ((i28 + 1) >> 1) - 1;
            if (iArr[i29] <= i27) {
                break;
            }
            qVar.b(i29, i28);
            i28 = i29;
        }
        int[] iArr2 = qVar.f450921b;
        int i37 = qVar.f450920a >> 1;
        while (i19 < i37) {
            int i38 = (i19 + 1) << 1;
            int i39 = i38 - 1;
            if (i38 < qVar.f450920a && (i18 = iArr2[i38]) < iArr2[i39]) {
                if (i18 >= iArr2[i19]) {
                    break;
                }
                qVar.b(i38, i19);
                i19 = i38;
            } else {
                if (iArr2[i39] >= iArr2[i19]) {
                    break;
                }
                qVar.b(i39, i19);
                i19 = i39;
            }
        }
        qVar.f450923d[i17] = qVar.f450924e;
        qVar.f450924e = i17;
    }

    public static final java.lang.Object t(x0.m mVar, yz5.l lVar) {
        java.lang.Object invoke = lVar.invoke(f450964c.e(mVar.d()));
        synchronized (f450963b) {
            int i17 = f450965d;
            f450965d = i17 + 1;
            x0.s e17 = f450964c.e(mVar.d());
            f450964c = e17;
            f450969h.set(new x0.d(i17, e17));
            mVar.c();
            f450964c = f450964c.j(i17);
        }
        return invoke;
    }

    public static final x0.a1 u(x0.a1 a1Var, x0.z0 state, x0.m snapshot) {
        kotlin.jvm.internal.o.g(a1Var, "<this>");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        if (snapshot.g()) {
            snapshot.m(state);
        }
        x0.a1 p17 = p(a1Var, snapshot.d(), snapshot.e());
        if (p17 == null) {
            o();
            throw null;
        }
        if (p17.f450861a == snapshot.d()) {
            return p17;
        }
        x0.a1 l17 = l(p17, state, snapshot);
        snapshot.m(state);
        return l17;
    }
}
