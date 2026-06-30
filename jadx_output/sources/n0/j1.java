package n0;

/* loaded from: classes14.dex */
public final class j1 implements n0.p1 {

    /* renamed from: d, reason: collision with root package name */
    public final n0.g1 f333546d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.e f333547e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f333548f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f333549g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f333550h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.k4 f333551i;

    /* renamed from: m, reason: collision with root package name */
    public final o0.e f333552m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f333553n;

    /* renamed from: o, reason: collision with root package name */
    public final o0.e f333554o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f333555p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f333556q;

    /* renamed from: r, reason: collision with root package name */
    public final o0.e f333557r;

    /* renamed from: s, reason: collision with root package name */
    public o0.b f333558s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f333559t;

    /* renamed from: u, reason: collision with root package name */
    public n0.j1 f333560u;

    /* renamed from: v, reason: collision with root package name */
    public int f333561v;

    /* renamed from: w, reason: collision with root package name */
    public final n0.y0 f333562w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f333563x;

    public j1(n0.g1 parent, n0.e applier, oz5.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(applier, "applier");
        this.f333546d = parent;
        this.f333547e = applier;
        this.f333548f = new java.util.concurrent.atomic.AtomicReference(null);
        this.f333549g = new java.lang.Object();
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f333550h = hashSet;
        n0.k4 k4Var = new n0.k4();
        this.f333551i = k4Var;
        this.f333552m = new o0.e();
        this.f333553n = new java.util.HashSet();
        this.f333554o = new o0.e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f333555p = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f333556q = arrayList2;
        this.f333557r = new o0.e();
        this.f333558s = new o0.b(0, 1, null);
        n0.y0 y0Var = new n0.y0(applier, parent, k4Var, hashSet, arrayList, arrayList2, this);
        parent.j(y0Var);
        this.f333562w = y0Var;
        boolean z17 = parent instanceof n0.b4;
        int i18 = n0.k.f333582a;
    }

    public static final void e(n0.j1 j1Var, boolean z17, kotlin.jvm.internal.h0 h0Var, java.lang.Object obj) {
        n0.j2 j2Var;
        o0.e eVar = j1Var.f333552m;
        int b17 = eVar.b(obj);
        if (b17 < 0) {
            return;
        }
        o0.d d17 = eVar.d(b17);
        int i17 = 0;
        while (true) {
            if (!(i17 < d17.f341838d)) {
                return;
            }
            int i18 = i17 + 1;
            java.lang.Object obj2 = d17.f341839e[i17];
            if (obj2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
            n0.l3 l3Var = (n0.l3) obj2;
            if (!j1Var.f333557r.c(obj, l3Var)) {
                n0.j1 j1Var2 = l3Var.f333605a;
                n0.j2 j2Var2 = n0.j2.IGNORED;
                if (j1Var2 == null || (j2Var = j1Var2.l(l3Var, obj)) == null) {
                    j2Var = j2Var2;
                }
                if (j2Var != j2Var2) {
                    if (!(l3Var.f333611g != null) || z17) {
                        java.util.HashSet hashSet = (java.util.HashSet) h0Var.f310123d;
                        if (hashSet == null) {
                            hashSet = new java.util.HashSet();
                            h0Var.f310123d = hashSet;
                        }
                        hashSet.add(l3Var);
                    } else {
                        j1Var.f333553n.add(l3Var);
                    }
                }
            }
            i17 = i18;
        }
    }

    @Override // n0.f1
    public boolean a() {
        return this.f333563x;
    }

    @Override // n0.f1
    public void b(yz5.p content) {
        kotlin.jvm.internal.o.g(content, "content");
        if (!(!this.f333563x)) {
            throw new java.lang.IllegalStateException("The composition is disposed".toString());
        }
        this.f333546d.a(this, content);
    }

    @Override // n0.f1
    public boolean c() {
        boolean z17;
        synchronized (this.f333549g) {
            z17 = this.f333558s.f341835c > 0;
        }
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x000d, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.Set r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j1.d(java.util.Set, boolean):void");
    }

    @Override // n0.f1
    public void dispose() {
        synchronized (this.f333549g) {
            if (!this.f333563x) {
                this.f333563x = true;
                int i17 = n0.k.f333582a;
                boolean z17 = this.f333551i.f333591e > 0;
                if (z17 || (true ^ this.f333550h.isEmpty())) {
                    n0.i1 i1Var = new n0.i1(this.f333550h);
                    if (z17) {
                        n0.o4 j17 = this.f333551i.j();
                        try {
                            n0.e1.e(j17, i1Var);
                            j17.e();
                            this.f333547e.clear();
                            i1Var.b();
                        } catch (java.lang.Throwable th6) {
                            j17.e();
                            throw th6;
                        }
                    }
                    i1Var.a();
                }
                n0.y0 y0Var = this.f333562w;
                y0Var.f333762c.l(y0Var);
                y0Var.C.f333489a.clear();
                ((java.util.ArrayList) y0Var.f333778s).clear();
                y0Var.f333765f.clear();
                y0Var.f333781v.clear();
                y0Var.f333761b.clear();
            }
        }
        this.f333546d.m(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j1.f(java.util.List):void");
    }

    public void g() {
        synchronized (this.f333549g) {
            this.f333562w.f333781v.clear();
            if (!this.f333550h.isEmpty()) {
                java.util.HashSet abandoning = this.f333550h;
                kotlin.jvm.internal.o.g(abandoning, "abandoning");
                new java.util.ArrayList();
                new java.util.ArrayList();
                new java.util.ArrayList();
                if (!abandoning.isEmpty()) {
                    java.util.Iterator it = abandoning.iterator();
                    while (it.hasNext()) {
                        n0.e4 e4Var = (n0.e4) it.next();
                        it.remove();
                        e4Var.c();
                    }
                }
            }
        }
    }

    public void h(yz5.p content) {
        kotlin.jvm.internal.o.g(content, "content");
        try {
            synchronized (this.f333549g) {
                i();
                n0.y0 y0Var = this.f333562w;
                o0.b invalidationsRequested = this.f333558s;
                this.f333558s = new o0.b(0, 1, null);
                y0Var.getClass();
                kotlin.jvm.internal.o.g(invalidationsRequested, "invalidationsRequested");
                if (!y0Var.f333765f.isEmpty()) {
                    n0.e1.c("Expected applyChanges() to have been called".toString());
                    throw null;
                }
                y0Var.l(invalidationsRequested, content);
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f333550h.isEmpty()) {
                java.util.HashSet abandoning = this.f333550h;
                kotlin.jvm.internal.o.g(abandoning, "abandoning");
                new java.util.ArrayList();
                new java.util.ArrayList();
                new java.util.ArrayList();
                if (true ^ abandoning.isEmpty()) {
                    java.util.Iterator it = abandoning.iterator();
                    while (it.hasNext()) {
                        n0.e4 e4Var = (n0.e4) it.next();
                        it.remove();
                        e4Var.c();
                    }
                }
            }
            throw th6;
        }
    }

    public final void i() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f333548f;
        java.lang.Object obj = n0.k1.f333584a;
        java.lang.Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (kotlin.jvm.internal.o.b(andSet, obj)) {
                throw new java.lang.IllegalStateException("pending composition has not been applied".toString());
            }
            if (andSet instanceof java.util.Set) {
                d((java.util.Set) andSet, true);
                return;
            }
            if (!(andSet instanceof java.lang.Object[])) {
                throw new java.lang.IllegalStateException(("corrupt pendingModifications drain: " + atomicReference).toString());
            }
            for (java.util.Set set : (java.util.Set[]) andSet) {
                d(set, true);
            }
        }
    }

    public final void j() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f333548f;
        java.lang.Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.o.b(andSet, n0.k1.f333584a)) {
            return;
        }
        if (andSet instanceof java.util.Set) {
            d((java.util.Set) andSet, false);
            return;
        }
        if (!(andSet instanceof java.lang.Object[])) {
            if (andSet == null) {
                throw new java.lang.IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
            }
            throw new java.lang.IllegalStateException(("corrupt pendingModifications drain: " + atomicReference).toString());
        }
        for (java.util.Set set : (java.util.Set[]) andSet) {
            d(set, false);
        }
    }

    public void k(java.util.List references) {
        kotlin.jvm.internal.o.g(references, "references");
        if (references.size() > 0) {
            android.support.v4.media.f.a(((jz5.l) references.get(0)).f302833d);
            throw null;
        }
        java.lang.Object obj = n0.e1.f333492a;
        try {
            this.f333562w.w(references);
        } catch (java.lang.Throwable th6) {
            java.util.HashSet abandoning = this.f333550h;
            if (!abandoning.isEmpty()) {
                kotlin.jvm.internal.o.g(abandoning, "abandoning");
                new java.util.ArrayList();
                new java.util.ArrayList();
                new java.util.ArrayList();
                if (!abandoning.isEmpty()) {
                    java.util.Iterator it = abandoning.iterator();
                    while (it.hasNext()) {
                        n0.e4 e4Var = (n0.e4) it.next();
                        it.remove();
                        e4Var.c();
                    }
                }
            }
            throw th6;
        }
    }

    public final n0.j2 l(n0.l3 scope, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(scope, "scope");
        int i17 = scope.f333606b;
        if ((i17 & 2) != 0) {
            scope.f333606b = i17 | 4;
        }
        n0.d dVar = scope.f333607c;
        n0.j2 j2Var = n0.j2.IGNORED;
        if (dVar != null && this.f333551i.k(dVar) && dVar.a() && dVar.a()) {
            return !(scope.f333608d != null) ? j2Var : n(scope, dVar, obj);
        }
        return j2Var;
    }

    public void m() {
        n0.j1 j1Var;
        synchronized (this.f333549g) {
            for (java.lang.Object obj : this.f333551i.f333592f) {
                n0.l3 l3Var = obj instanceof n0.l3 ? (n0.l3) obj : null;
                if (l3Var != null && (j1Var = l3Var.f333605a) != null) {
                    j1Var.l(l3Var, null);
                }
            }
        }
    }

    public final n0.j2 n(n0.l3 key, n0.d dVar, java.lang.Object obj) {
        synchronized (this.f333549g) {
            n0.j1 j1Var = this.f333560u;
            if (j1Var == null || !this.f333551i.g(this.f333561v, dVar)) {
                j1Var = null;
            }
            if (j1Var == null) {
                n0.y0 y0Var = this.f333562w;
                if (y0Var.D && y0Var.Z(key, obj)) {
                    return n0.j2.IMMINENT;
                }
                if (obj == null) {
                    this.f333558s.b(key, null);
                } else {
                    o0.b bVar = this.f333558s;
                    bVar.getClass();
                    kotlin.jvm.internal.o.g(key, "key");
                    if (bVar.a(key) >= 0) {
                        int a17 = bVar.a(key);
                        o0.d dVar2 = (o0.d) (a17 >= 0 ? bVar.f341834b[a17] : null);
                        if (dVar2 != null) {
                            dVar2.add(obj);
                        }
                    } else {
                        o0.d dVar3 = new o0.d();
                        dVar3.add(obj);
                        bVar.b(key, dVar3);
                    }
                }
            }
            if (j1Var != null) {
                return j1Var.n(key, dVar, obj);
            }
            this.f333546d.g(this);
            return this.f333562w.D ? n0.j2.DEFERRED : n0.j2.SCHEDULED;
        }
    }

    public final void o(java.lang.Object obj) {
        n0.j2 j2Var;
        o0.e eVar = this.f333552m;
        int b17 = eVar.b(obj);
        if (b17 < 0) {
            return;
        }
        o0.d d17 = eVar.d(b17);
        int i17 = 0;
        while (true) {
            if (!(i17 < d17.f341838d)) {
                return;
            }
            int i18 = i17 + 1;
            java.lang.Object obj2 = d17.f341839e[i17];
            if (obj2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
            n0.l3 l3Var = (n0.l3) obj2;
            n0.j1 j1Var = l3Var.f333605a;
            if (j1Var == null || (j2Var = j1Var.l(l3Var, obj)) == null) {
                j2Var = n0.j2.IGNORED;
            }
            if (j2Var == n0.j2.IMMINENT) {
                this.f333557r.a(obj, l3Var);
            }
            i17 = i18;
        }
    }

    public boolean p() {
        boolean D;
        synchronized (this.f333549g) {
            i();
            try {
                n0.y0 y0Var = this.f333562w;
                o0.b bVar = this.f333558s;
                this.f333558s = new o0.b(0, 1, null);
                D = y0Var.D(bVar);
                if (!D) {
                    j();
                }
            } catch (java.lang.Throwable th6) {
                if (!this.f333550h.isEmpty()) {
                    java.util.HashSet abandoning = this.f333550h;
                    kotlin.jvm.internal.o.g(abandoning, "abandoning");
                    new java.util.ArrayList();
                    new java.util.ArrayList();
                    new java.util.ArrayList();
                    if (true ^ abandoning.isEmpty()) {
                        java.util.Iterator it = abandoning.iterator();
                        while (it.hasNext()) {
                            n0.e4 e4Var = (n0.e4) it.next();
                            it.remove();
                            e4Var.c();
                        }
                    }
                }
                throw th6;
            }
        }
        return D;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j1.q(java.lang.Object):void");
    }

    public void r(java.lang.Object value) {
        kotlin.jvm.internal.o.g(value, "value");
        synchronized (this.f333549g) {
            o(value);
            o0.e eVar = this.f333554o;
            int b17 = eVar.b(value);
            if (b17 >= 0) {
                java.util.Iterator<E> it = eVar.d(b17).iterator();
                while (it.hasNext()) {
                    o((n0.y1) it.next());
                }
            }
        }
    }
}
