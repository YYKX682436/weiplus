package p1;

/* loaded from: classes14.dex */
public final class q0 extends p1.y implements p1.z, p1.a0, p2.f {

    /* renamed from: f, reason: collision with root package name */
    public final androidx.compose.ui.platform.k4 f350866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p2.f f350867g;

    /* renamed from: h, reason: collision with root package name */
    public p1.l f350868h;

    /* renamed from: i, reason: collision with root package name */
    public final o0.i f350869i;

    /* renamed from: m, reason: collision with root package name */
    public final o0.i f350870m;

    /* renamed from: n, reason: collision with root package name */
    public p1.l f350871n;

    /* renamed from: o, reason: collision with root package name */
    public long f350872o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.y0 f350873p;

    public q0(androidx.compose.ui.platform.k4 viewConfiguration, p2.f density) {
        kotlin.jvm.internal.o.g(viewConfiguration, "viewConfiguration");
        kotlin.jvm.internal.o.g(density, "density");
        this.f350866f = viewConfiguration;
        this.f350867g = density;
        this.f350868h = p1.x0.f350924a;
        this.f350869i = new o0.i(new p1.o0[16], 0);
        this.f350870m = new o0.i(new p1.o0[16], 0);
        this.f350872o = 0L;
        this.f350873p = kotlinx.coroutines.i2.f310477d;
    }

    public final void C(p1.l lVar, p1.n nVar) {
        synchronized (this.f350869i) {
            o0.i iVar = this.f350870m;
            iVar.d(iVar.f341852f, this.f350869i);
        }
        try {
            int ordinal = nVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    o0.i iVar2 = this.f350870m;
                    int i17 = iVar2.f341852f;
                    if (i17 > 0) {
                        int i18 = i17 - 1;
                        java.lang.Object[] objArr = iVar2.f341850d;
                        do {
                            ((p1.o0) objArr[i18]).g(lVar, nVar);
                            i18--;
                        } while (i18 >= 0);
                    }
                } else if (ordinal != 2) {
                }
            }
            o0.i iVar3 = this.f350870m;
            int i19 = iVar3.f341852f;
            if (i19 > 0) {
                java.lang.Object[] objArr2 = iVar3.f341850d;
                int i27 = 0;
                do {
                    ((p1.o0) objArr2[i27]).g(lVar, nVar);
                    i27++;
                } while (i27 < i19);
            }
        } finally {
            this.f350870m.e();
        }
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // p2.f
    public int G(float f17) {
        return this.f350867g.G(f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return this.f350867g.H(j17);
    }

    @Override // p1.z
    public p1.y N() {
        return this;
    }

    @Override // p2.f
    public float R(float f17) {
        return this.f350867g.R(f17);
    }

    @Override // p1.y
    public void b() {
        boolean z17;
        p1.l lVar = this.f350871n;
        if (lVar == null) {
            return;
        }
        java.util.List list = lVar.f350842a;
        int size = list.size();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            z17 = true;
            if (i18 >= size) {
                break;
            }
            if (!(true ^ ((p1.s) list.get(i18)).f350882d)) {
                z17 = false;
                break;
            }
            i18++;
        }
        if (z17) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list.size();
        while (i17 < size2) {
            p1.s sVar = (p1.s) list.get(i17);
            long j17 = sVar.f350879a;
            long j18 = sVar.f350881c;
            long j19 = sVar.f350880b;
            boolean z18 = sVar.f350882d;
            arrayList.add(new p1.s(j17, j19, j18, false, j19, j18, z18, z18, 1, d1.e.f225623b, null));
            i17++;
            list = list;
        }
        p1.l lVar2 = new p1.l(arrayList);
        this.f350868h = lVar2;
        C(lVar2, p1.n.Initial);
        C(lVar2, p1.n.Main);
        C(lVar2, p1.n.Final);
        this.f350871n = null;
    }

    @Override // p1.y
    public void c(p1.l pointerEvent, p1.n pass, long j17) {
        kotlin.jvm.internal.o.g(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.o.g(pass, "pass");
        this.f350872o = j17;
        if (pass == p1.n.Initial) {
            this.f350868h = pointerEvent;
        }
        C(pointerEvent, pass);
        java.util.List list = pointerEvent.f350842a;
        int size = list.size();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                z17 = true;
                break;
            } else if (!p1.m.c((p1.s) list.get(i17))) {
                break;
            } else {
                i17++;
            }
        }
        if (!(!z17)) {
            pointerEvent = null;
        }
        this.f350871n = pointerEvent;
    }

    @Override // p2.f
    public long e(long j17) {
        return this.f350867g.e(j17);
    }

    @Override // p2.f
    public float getDensity() {
        return this.f350867g.getDensity();
    }

    @Override // p2.f
    public float getFontScale() {
        return this.f350867g.getFontScale();
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // p2.f
    public float n(int i17) {
        return this.f350867g.n(i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return this.f350867g.o(f17);
    }

    @Override // p2.f
    public long t(long j17) {
        return this.f350867g.t(j17);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    public java.lang.Object v(yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        p1.o0 o0Var = new p1.o0(this, rVar);
        synchronized (this.f350869i) {
            this.f350869i.b(o0Var);
            kotlin.jvm.internal.o.g(pVar, "<this>");
            oz5.n nVar = new oz5.n(pz5.f.b(pz5.f.a(pVar, o0Var, o0Var)), pz5.a.f359186d);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
        rVar.m(new p1.p0(o0Var));
        return rVar.j();
    }

    @Override // p2.f
    public long z(float f17) {
        return this.f350867g.z(f17);
    }
}
