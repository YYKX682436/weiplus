package u26;

/* loaded from: classes14.dex */
public final class k0 implements u26.t {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f424160d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f424161e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f424162f;

    /* renamed from: g, reason: collision with root package name */
    public static final u26.h0 f424163g = new u26.h0(null);

    /* renamed from: h, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f424164h;

    /* renamed from: i, reason: collision with root package name */
    public static final u26.i0 f424165i;
    private volatile /* synthetic */ java.lang.Object _state = f424165i;
    private volatile /* synthetic */ int _updating = 0;
    private volatile /* synthetic */ java.lang.Object onCloseHandler = null;

    static {
        kotlinx.coroutines.internal.l0 l0Var = new kotlinx.coroutines.internal.l0("UNDEFINED");
        f424164h = l0Var;
        f424165i = new u26.i0(l0Var, null);
        f424160d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(u26.k0.class, java.lang.Object.class, "_state");
        f424161e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(u26.k0.class, "_updating");
        f424162f = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(u26.k0.class, java.lang.Object.class, "onCloseHandler");
    }

    public static final void a(u26.k0 k0Var, u26.j0 j0Var) {
        boolean z17;
        u26.j0[] j0VarArr;
        do {
            java.lang.Object obj = k0Var._state;
            if (obj instanceof u26.h0) {
                return;
            }
            if (!(obj instanceof u26.i0)) {
                throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
            }
            u26.i0 i0Var = (u26.i0) obj;
            java.lang.Object obj2 = i0Var.f424154a;
            u26.j0[] j0VarArr2 = i0Var.f424155b;
            kotlin.jvm.internal.o.d(j0VarArr2);
            int length = j0VarArr2.length;
            int X = kz5.z.X(j0VarArr2, j0Var);
            z17 = true;
            if (length == 1) {
                j0VarArr = null;
            } else {
                u26.j0[] j0VarArr3 = new u26.j0[length - 1];
                kz5.v.p(j0VarArr2, j0VarArr3, 0, 0, X, 6, null);
                kz5.v.p(j0VarArr2, j0VarArr3, X, X + 1, 0, 8, null);
                j0VarArr = j0VarArr3;
            }
            u26.i0 i0Var2 = new u26.i0(obj2, j0VarArr);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f424160d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(k0Var, obj, i0Var2)) {
                    break;
                } else if (atomicReferenceFieldUpdater.get(k0Var) != obj) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
    }

    @Override // u26.t
    public void b(java.util.concurrent.CancellationException cancellationException) {
        s(cancellationException);
    }

    public final u26.h0 c(java.lang.Object obj) {
        java.lang.Object obj2;
        boolean z17;
        if (!f424161e.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj2 = this._state;
                if (obj2 instanceof u26.h0) {
                    return (u26.h0) obj2;
                }
                if (!(obj2 instanceof u26.i0)) {
                    throw new java.lang.IllegalStateException(("Invalid state " + obj2).toString());
                }
                u26.i0 i0Var = new u26.i0(obj, ((u26.i0) obj2).f424155b);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f424160d;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, i0Var)) {
                        z17 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z17 = false;
                        break;
                    }
                }
            } finally {
                this._updating = 0;
            }
        } while (!z17);
        u26.j0[] j0VarArr = ((u26.i0) obj2).f424155b;
        if (j0VarArr != null) {
            for (u26.j0 j0Var : j0VarArr) {
                j0Var.u(obj);
            }
        }
        return null;
    }

    @Override // u26.t
    public u26.t0 d() {
        u26.j0[] j0VarArr;
        boolean z17;
        u26.j0 j0Var = new u26.j0(this);
        do {
            java.lang.Object obj = this._state;
            if (obj instanceof u26.h0) {
                j0Var.s(((u26.h0) obj).f424152a);
                return j0Var;
            }
            if (!(obj instanceof u26.i0)) {
                throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
            }
            u26.i0 i0Var = (u26.i0) obj;
            java.lang.Object obj2 = i0Var.f424154a;
            if (obj2 != f424164h) {
                j0Var.u(obj2);
            }
            java.lang.Object obj3 = i0Var.f424154a;
            u26.j0[] j0VarArr2 = i0Var.f424155b;
            if (j0VarArr2 == null) {
                j0VarArr = new u26.j0[]{j0Var};
            } else {
                int length = j0VarArr2.length;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(j0VarArr2, length + 1);
                copyOf[length] = j0Var;
                j0VarArr = (u26.j0[]) copyOf;
            }
            u26.i0 i0Var2 = new u26.i0(obj3, j0VarArr);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f424160d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, i0Var2)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
        return j0Var;
    }

    @Override // u26.y0
    public java.lang.Object e(java.lang.Object obj) {
        u26.h0 c17 = c(obj);
        if (c17 == null) {
            return jz5.f0.f302826a;
        }
        java.lang.Throwable th6 = c17.f424152a;
        if (th6 == null) {
            th6 = new u26.g0("Channel was closed");
        }
        return new u26.a0(th6);
    }

    @Override // u26.y0
    public boolean j() {
        return this._state instanceof u26.h0;
    }

    @Override // u26.y0
    public boolean s(java.lang.Throwable th6) {
        java.lang.Object obj;
        boolean z17;
        boolean z18;
        kotlinx.coroutines.internal.l0 l0Var;
        do {
            obj = this._state;
            z17 = false;
            if (obj instanceof u26.h0) {
                return false;
            }
            if (!(obj instanceof u26.i0)) {
                throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
            }
            u26.h0 h0Var = th6 == null ? f424163g : new u26.h0(th6);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f424160d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, h0Var)) {
                    z18 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z18 = false;
                    break;
                }
            }
        } while (!z18);
        u26.j0[] j0VarArr = ((u26.i0) obj).f424155b;
        if (j0VarArr != null) {
            for (u26.j0 j0Var : j0VarArr) {
                j0Var.s(th6);
            }
        }
        java.lang.Object obj2 = this.onCloseHandler;
        if (obj2 != null && obj2 != (l0Var = u26.l.f424171f)) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f424162f;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, l0Var)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                    break;
                }
            }
            if (z17) {
                kotlin.jvm.internal.m0.e(obj2, 1);
                ((yz5.l) obj2).invoke(th6);
            }
        }
        return true;
    }

    @Override // u26.y0
    public java.lang.Object t(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        u26.h0 c17 = c(obj);
        if (c17 == null) {
            pz5.a aVar = pz5.a.f359186d;
            return jz5.f0.f302826a;
        }
        java.lang.Throwable th6 = c17.f424152a;
        if (th6 == null) {
            throw new u26.g0("Channel was closed");
        }
        throw th6;
    }
}
