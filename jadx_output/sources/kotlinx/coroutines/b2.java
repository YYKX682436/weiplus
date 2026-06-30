package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class b2 extends kotlinx.coroutines.c2 implements kotlinx.coroutines.i1 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310138i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.b2.class, java.lang.Object.class, "_queue");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310139m = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.b2.class, java.lang.Object.class, "_delayed");
    private volatile /* synthetic */ java.lang.Object _queue = null;
    private volatile /* synthetic */ java.lang.Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    public static final boolean T(kotlinx.coroutines.b2 b2Var) {
        return b2Var._isCompleted;
    }

    @Override // kotlinx.coroutines.p0
    public final void D(oz5.l lVar, java.lang.Runnable runnable) {
        V(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // kotlinx.coroutines.w1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long P() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b2.P():long");
    }

    public void V(java.lang.Runnable runnable) {
        if (!W(runnable)) {
            kotlinx.coroutines.d1.f310157n.V(runnable);
            return;
        }
        java.lang.Thread R = R();
        if (java.lang.Thread.currentThread() != R) {
            java.util.concurrent.locks.LockSupport.unpark(R);
        }
    }

    public final boolean W(java.lang.Runnable runnable) {
        while (true) {
            java.lang.Object obj = this._queue;
            boolean z17 = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310138i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z17 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z17) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.y) {
                kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) obj;
                int a17 = yVar.a(runnable);
                if (a17 == 0) {
                    return true;
                }
                if (a17 == 1) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f310138i;
                    kotlinx.coroutines.internal.y e17 = yVar.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e17) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (a17 == 2) {
                    return false;
                }
            } else {
                if (obj == kotlinx.coroutines.d2.f310160b) {
                    return false;
                }
                kotlinx.coroutines.internal.y yVar2 = new kotlinx.coroutines.internal.y(8, true);
                yVar2.a((java.lang.Runnable) obj);
                yVar2.a(runnable);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f310138i;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, yVar2)) {
                        z17 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                if (z17) {
                    return true;
                }
            }
        }
    }

    public boolean X() {
        kotlinx.coroutines.internal.a aVar = this.f310689g;
        if (!(aVar == null || aVar.f310481b == aVar.f310482c)) {
            return false;
        }
        kotlinx.coroutines.a2 a2Var = (kotlinx.coroutines.a2) this._delayed;
        if (a2Var != null && !a2Var.b()) {
            return false;
        }
        java.lang.Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.y) {
                return ((kotlinx.coroutines.internal.y) obj).d();
            }
            if (obj != kotlinx.coroutines.d2.f310160b) {
                return false;
            }
        }
        return true;
    }

    public final void Z() {
        this._queue = null;
        this._delayed = null;
    }

    public final void a0(long j17, kotlinx.coroutines.z1 z1Var) {
        int i17;
        java.lang.Thread R;
        if (this._isCompleted != 0) {
            i17 = 1;
        } else {
            kotlinx.coroutines.a2 a2Var = (kotlinx.coroutines.a2) this._delayed;
            if (a2Var == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310139m;
                kotlinx.coroutines.a2 a2Var2 = new kotlinx.coroutines.a2(j17);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, a2Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                java.lang.Object obj = this._delayed;
                kotlin.jvm.internal.o.d(obj);
                a2Var = (kotlinx.coroutines.a2) obj;
            }
            i17 = z1Var.i(j17, a2Var, this);
        }
        if (i17 != 0) {
            if (i17 == 1) {
                S(j17, z1Var);
                return;
            } else {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        kotlinx.coroutines.a2 a2Var3 = (kotlinx.coroutines.a2) this._delayed;
        if (a2Var3 != null) {
            synchronized (a2Var3) {
                kotlinx.coroutines.internal.t0[] t0VarArr = a2Var3.f310524a;
                r1 = t0VarArr != null ? t0VarArr[0] : null;
            }
            r1 = (kotlinx.coroutines.z1) r1;
        }
        if (!(r1 == z1Var) || java.lang.Thread.currentThread() == (R = R())) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(R);
    }

    @Override // kotlinx.coroutines.w1
    public void shutdown() {
        kotlinx.coroutines.z1 z1Var;
        kotlinx.coroutines.v3 v3Var = kotlinx.coroutines.v3.f310684a;
        kotlinx.coroutines.v3.f310685b.set(null);
        this._isCompleted = 1;
        while (true) {
            java.lang.Object obj = this._queue;
            kotlinx.coroutines.internal.l0 l0Var = kotlinx.coroutines.d2.f310160b;
            boolean z17 = false;
            if (obj == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310138i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, l0Var)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z17) {
                    break;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.internal.y) {
                    ((kotlinx.coroutines.internal.y) obj).b();
                    break;
                }
                if (obj == l0Var) {
                    break;
                }
                kotlinx.coroutines.internal.y yVar = new kotlinx.coroutines.internal.y(8, true);
                yVar.a((java.lang.Runnable) obj);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f310138i;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, yVar)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                if (z17) {
                    break;
                }
            }
        }
        do {
        } while (P() <= 0);
        long nanoTime = java.lang.System.nanoTime();
        while (true) {
            kotlinx.coroutines.a2 a2Var = (kotlinx.coroutines.a2) this._delayed;
            if (a2Var == null || (z1Var = (kotlinx.coroutines.z1) a2Var.d()) == null) {
                return;
            } else {
                S(nanoTime, z1Var);
            }
        }
    }

    @Override // kotlinx.coroutines.i1
    public kotlinx.coroutines.s1 v(long j17, java.lang.Runnable runnable, oz5.l lVar) {
        return kotlinx.coroutines.e1.f310173a.v(j17, runnable, lVar);
    }

    @Override // kotlinx.coroutines.i1
    public void w(long j17, kotlinx.coroutines.q qVar) {
        long j18 = j17 > 0 ? j17 >= 9223372036854L ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : 1000000 * j17 : 0L;
        if (j18 < 4611686018427387903L) {
            long nanoTime = java.lang.System.nanoTime();
            kotlinx.coroutines.x1 x1Var = new kotlinx.coroutines.x1(this, j18 + nanoTime, qVar);
            a0(nanoTime, x1Var);
            ((kotlinx.coroutines.r) qVar).m(new kotlinx.coroutines.t1(x1Var));
        }
    }
}
