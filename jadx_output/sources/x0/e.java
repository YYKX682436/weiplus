package x0;

/* loaded from: classes14.dex */
public class e extends x0.m {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f450875f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f450876g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f450877h;

    /* renamed from: i, reason: collision with root package name */
    public x0.s f450878i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f450879j;

    /* renamed from: k, reason: collision with root package name */
    public int f450880k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f450881l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i17, x0.s invalid, yz5.l lVar, yz5.l lVar2) {
        super(i17, invalid, null);
        kotlin.jvm.internal.o.g(invalid, "invalid");
        this.f450875f = lVar;
        this.f450876g = lVar2;
        this.f450878i = x0.s.f450939h;
        this.f450879j = new int[0];
        this.f450880k = 1;
    }

    @Override // x0.m
    public void b() {
        x0.z.f450964c = x0.z.f450964c.e(d()).d(this.f450878i);
    }

    @Override // x0.m
    public void c() {
        if (this.f450910c) {
            return;
        }
        this.f450910c = true;
        synchronized (x0.z.f450963b) {
            int i17 = this.f450911d;
            if (i17 >= 0) {
                x0.z.s(i17);
                this.f450911d = -1;
            }
        }
        k(this);
    }

    @Override // x0.m
    public yz5.l f() {
        return this.f450875f;
    }

    @Override // x0.m
    public boolean g() {
        return false;
    }

    @Override // x0.m
    public yz5.l h() {
        return this.f450876g;
    }

    @Override // x0.m
    public void j(x0.m snapshot) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        this.f450880k++;
    }

    @Override // x0.m
    public void k(x0.m snapshot) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        int i17 = this.f450880k;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i18 = i17 - 1;
        this.f450880k = i18;
        if (i18 != 0 || this.f450881l) {
            return;
        }
        java.util.Set u17 = u();
        if (u17 != null) {
            if (!(true ^ this.f450881l)) {
                throw new java.lang.IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
            }
            x(null);
            int d17 = d();
            java.util.Iterator it = u17.iterator();
            while (it.hasNext()) {
                for (x0.a1 g17 = ((x0.z0) it.next()).g(); g17 != null; g17 = g17.f450862b) {
                    int i19 = g17.f450861a;
                    if (i19 == d17 || kz5.n0.O(this.f450878i, java.lang.Integer.valueOf(i19))) {
                        g17.f450861a = 0;
                    }
                }
            }
        }
        a();
    }

    @Override // x0.m
    public void l() {
        if (this.f450881l || this.f450910c) {
            return;
        }
        s();
    }

    @Override // x0.m
    public void m(x0.z0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        java.util.Set u17 = u();
        if (u17 == null) {
            u17 = new java.util.HashSet();
            x(u17);
        }
        u17.add(state);
    }

    @Override // x0.m
    public void n() {
        int length = this.f450879j.length;
        for (int i17 = 0; i17 < length; i17++) {
            x0.z.s(this.f450879j[i17]);
        }
        int i18 = this.f450911d;
        if (i18 >= 0) {
            x0.z.s(i18);
            this.f450911d = -1;
        }
    }

    @Override // x0.m
    public x0.m r(yz5.l lVar) {
        x0.h hVar;
        if (!(!this.f450910c)) {
            throw new java.lang.IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        z();
        int d17 = d();
        w(d());
        java.lang.Object obj = x0.z.f450963b;
        synchronized (obj) {
            int i17 = x0.z.f450965d;
            x0.z.f450965d = i17 + 1;
            x0.z.f450964c = x0.z.f450964c.j(i17);
            hVar = new x0.h(i17, x0.z.e(e(), d17 + 1, i17), lVar, this);
        }
        if (!this.f450881l && !this.f450910c) {
            int d18 = d();
            synchronized (obj) {
                int i18 = x0.z.f450965d;
                x0.z.f450965d = i18 + 1;
                p(i18);
                x0.z.f450964c = x0.z.f450964c.j(d());
            }
            q(x0.z.e(e(), d18 + 1, d()));
        }
        return hVar;
    }

    public final void s() {
        w(d());
        if (this.f450881l || this.f450910c) {
            return;
        }
        int d17 = d();
        synchronized (x0.z.f450963b) {
            int i17 = x0.z.f450965d;
            x0.z.f450965d = i17 + 1;
            p(i17);
            x0.z.f450964c = x0.z.f450964c.j(d());
        }
        q(x0.z.e(e(), d17 + 1, d()));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2 A[LOOP:0: B:24:0x00c0->B:25:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd A[LOOP:1: B:31:0x00db->B:32:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x0.p t() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e.t():x0.p");
    }

    public java.util.Set u() {
        return this.f450877h;
    }

    public final x0.p v(int i17, java.util.Map map, x0.s invalidSnapshots) {
        x0.a1 p17;
        x0.a1 d17;
        kotlin.jvm.internal.o.g(invalidSnapshots, "invalidSnapshots");
        x0.s h17 = e().j(d()).h(this.f450878i);
        java.util.Set<x0.z0> u17 = u();
        kotlin.jvm.internal.o.d(u17);
        java.util.ArrayList arrayList = null;
        java.util.ArrayList arrayList2 = null;
        for (x0.z0 z0Var : u17) {
            x0.a1 g17 = z0Var.g();
            x0.a1 p18 = x0.z.p(g17, i17, invalidSnapshots);
            if (p18 != null && (p17 = x0.z.p(g17, d(), h17)) != null && !kotlin.jvm.internal.o.b(p18, p17)) {
                x0.a1 p19 = x0.z.p(g17, d(), e());
                if (p19 == null) {
                    x0.z.o();
                    throw null;
                }
                if (map == null || (d17 = (x0.a1) map.get(p18)) == null) {
                    d17 = z0Var.d(p17, p18, p19);
                }
                if (d17 == null) {
                    return new x0.n(this);
                }
                if (!kotlin.jvm.internal.o.b(d17, p19)) {
                    if (kotlin.jvm.internal.o.b(d17, p18)) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(new jz5.l(z0Var, p18.b()));
                        if (arrayList2 == null) {
                            arrayList2 = new java.util.ArrayList();
                        }
                        arrayList2.add(z0Var);
                    } else {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(!kotlin.jvm.internal.o.b(d17, p17) ? new jz5.l(z0Var, d17) : new jz5.l(z0Var, p17.b()));
                    }
                }
            }
        }
        if (arrayList != null) {
            s();
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                jz5.l lVar = (jz5.l) arrayList.get(i18);
                x0.z0 z0Var2 = (x0.z0) lVar.f302833d;
                x0.a1 a1Var = (x0.a1) lVar.f302834e;
                a1Var.f450861a = d();
                synchronized (x0.z.f450963b) {
                    a1Var.f450862b = z0Var2.g();
                    z0Var2.e(a1Var);
                }
            }
        }
        if (arrayList2 != null) {
            u17.removeAll(arrayList2);
        }
        return x0.o.f450917a;
    }

    public final void w(int i17) {
        synchronized (x0.z.f450963b) {
            this.f450878i = this.f450878i.j(i17);
        }
    }

    public void x(java.util.Set set) {
        this.f450877h = set;
    }

    public x0.e y(yz5.l lVar, yz5.l lVar2) {
        x0.f fVar;
        if (!(!this.f450910c)) {
            throw new java.lang.IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        z();
        w(d());
        java.lang.Object obj = x0.z.f450963b;
        synchronized (obj) {
            int i17 = x0.z.f450965d;
            x0.z.f450965d = i17 + 1;
            x0.z.f450964c = x0.z.f450964c.j(i17);
            x0.s e17 = e();
            q(e17.j(i17));
            fVar = new x0.f(i17, x0.z.e(e17, d() + 1, i17), x0.z.j(lVar, this.f450875f, true), x0.z.b(lVar2, this.f450876g), this);
        }
        if (!this.f450881l && !this.f450910c) {
            int d17 = d();
            synchronized (obj) {
                int i18 = x0.z.f450965d;
                x0.z.f450965d = i18 + 1;
                p(i18);
                x0.z.f450964c = x0.z.f450964c.j(d());
            }
            q(x0.z.e(e(), d17 + 1, d()));
        }
        return fVar;
    }

    public final void z() {
        boolean z17 = true;
        if (this.f450881l) {
            if (!(this.f450911d >= 0)) {
                z17 = false;
            }
        }
        if (!z17) {
            throw new java.lang.IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }
}
