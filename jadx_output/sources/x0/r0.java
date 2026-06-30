package x0;

/* loaded from: classes14.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f450932a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f450933b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f450934c;

    /* renamed from: d, reason: collision with root package name */
    public final o0.i f450935d;

    /* renamed from: e, reason: collision with root package name */
    public x0.i f450936e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f450937f;

    /* renamed from: g, reason: collision with root package name */
    public x0.n0 f450938g;

    public r0(yz5.l onChangedExecutor) {
        kotlin.jvm.internal.o.g(onChangedExecutor, "onChangedExecutor");
        this.f450932a = onChangedExecutor;
        this.f450933b = new x0.p0(this);
        this.f450934c = new x0.q0(this);
        this.f450935d = new o0.i(new x0.n0[16], 0);
    }

    public final void a() {
        synchronized (this.f450935d) {
            o0.i iVar = this.f450935d;
            int i17 = iVar.f341852f;
            if (i17 > 0) {
                java.lang.Object[] objArr = iVar.f341850d;
                int i18 = 0;
                do {
                    o0.e eVar = ((x0.n0) objArr[i18]).f450914b;
                    int length = eVar.f341842c.length;
                    for (int i19 = 0; i19 < length; i19++) {
                        o0.d dVar = eVar.f341842c[i19];
                        if (dVar != null) {
                            dVar.clear();
                        }
                        eVar.f341840a[i19] = i19;
                        eVar.f341841b[i19] = null;
                    }
                    eVar.f341843d = 0;
                    i18++;
                } while (i18 < i17);
            }
        }
    }

    public final void b(java.lang.Object scope, yz5.l onValueChangedForScope, yz5.a block) {
        int i17;
        x0.n0 n0Var;
        boolean z17;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(onValueChangedForScope, "onValueChangedForScope");
        kotlin.jvm.internal.o.g(block, "block");
        x0.n0 n0Var2 = this.f450938g;
        boolean z18 = this.f450937f;
        synchronized (this.f450935d) {
            try {
                o0.i iVar = this.f450935d;
                int i18 = iVar.f341852f;
                if (i18 > 0) {
                    java.lang.Object[] objArr = iVar.f341850d;
                    i17 = 0;
                    do {
                        if (((x0.n0) objArr[i17]).f450913a == onValueChangedForScope) {
                            break;
                        } else {
                            i17++;
                        }
                    } while (i17 < i18);
                }
                i17 = -1;
                if (i17 == -1) {
                    n0Var = new x0.n0(onValueChangedForScope);
                    iVar.b(n0Var);
                } else {
                    n0Var = (x0.n0) iVar.f341850d[i17];
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        java.lang.Object obj = n0Var.f450916d;
        n0Var.f450916d = scope;
        this.f450938g = n0Var;
        this.f450937f = false;
        synchronized (this.f450935d) {
            try {
                o0.e eVar = n0Var.f450914b;
                int i19 = eVar.f341843d;
                int i27 = 0;
                int i28 = 0;
                while (i27 < i19) {
                    int i29 = eVar.f341840a[i27];
                    o0.d dVar = eVar.f341842c[i29];
                    kotlin.jvm.internal.o.d(dVar);
                    int i37 = dVar.f341838d;
                    int i38 = i19;
                    int i39 = 0;
                    int i47 = 0;
                    while (i47 < i37) {
                        int i48 = i37;
                        java.lang.Object[] objArr2 = dVar.f341839e;
                        boolean z19 = z18;
                        java.lang.Object obj2 = objArr2[i47];
                        if (obj2 == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                        if (!(obj2 == scope)) {
                            if (i39 != i47) {
                                objArr2[i39] = obj2;
                            }
                            i39++;
                        }
                        i47++;
                        i37 = i48;
                        z18 = z19;
                    }
                    boolean z27 = z18;
                    int i49 = dVar.f341838d;
                    for (int i57 = i39; i57 < i49; i57++) {
                        dVar.f341839e[i57] = null;
                    }
                    dVar.f341838d = i39;
                    if (i39 > 0) {
                        if (i28 != i27) {
                            int[] iArr = eVar.f341840a;
                            int i58 = iArr[i28];
                            iArr[i28] = i29;
                            iArr[i27] = i58;
                        }
                        i28++;
                    }
                    i27++;
                    i19 = i38;
                    z18 = z27;
                }
                z17 = z18;
                int i59 = eVar.f341843d;
                for (int i66 = i28; i66 < i59; i66++) {
                    eVar.f341841b[eVar.f341840a[i66]] = null;
                }
                eVar.f341843d = i28;
            } catch (java.lang.Throwable th7) {
                throw th7;
            }
        }
        x0.m.f450907e.a(this.f450934c, null, block);
        this.f450938g = n0Var2;
        n0Var.f450916d = obj;
        this.f450937f = z17;
    }

    public final void c() {
        yz5.p observer = this.f450933b;
        kotlin.jvm.internal.o.g(observer, "observer");
        n0.c5 c5Var = x0.z.f450962a;
        x0.z.f(x0.v.f450951d);
        synchronized (x0.z.f450963b) {
            ((java.util.ArrayList) x0.z.f450967f).add(observer);
        }
        this.f450936e = new x0.k(observer);
    }
}
