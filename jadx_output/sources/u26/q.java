package u26;

/* loaded from: classes14.dex */
public final class q extends u26.o implements u26.t {
    private volatile /* synthetic */ long _head;
    private volatile /* synthetic */ int _size;
    private volatile /* synthetic */ long _tail;

    /* renamed from: g, reason: collision with root package name */
    public final int f424186g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f424187h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object[] f424188i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f424189m;

    public q(int i17) {
        super(null);
        this.f424186g = i17;
        if (!(i17 >= 1)) {
            throw new java.lang.IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i17 + " was specified").toString());
        }
        this.f424187h = new java.util.concurrent.locks.ReentrantLock();
        this.f424188i = new java.lang.Object[i17];
        this._head = 0L;
        this._tail = 0L;
        this._size = 0;
        java.lang.reflect.Method method = kotlinx.coroutines.internal.e.f310491a;
        this.f424189m = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public static final long x(u26.q qVar) {
        return qVar._tail;
    }

    public static void z(u26.q qVar, u26.p pVar, u26.p pVar2, int i17, java.lang.Object obj) {
        u26.w0 w17;
        if ((i17 & 1) != 0) {
            pVar = null;
        }
        if ((i17 & 2) != 0) {
            pVar2 = null;
        }
        while (true) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = qVar.f424187h;
            reentrantLock.lock();
            if (pVar != null) {
                try {
                    pVar.J(qVar._tail);
                    boolean isEmpty = ((java.util.concurrent.CopyOnWriteArrayList) qVar.f424189m).isEmpty();
                    ((java.util.concurrent.CopyOnWriteArrayList) qVar.f424189m).add(pVar);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (pVar2 != null) {
                ((java.util.concurrent.CopyOnWriteArrayList) qVar.f424189m).remove(pVar2);
                if (qVar._head != pVar2.H()) {
                    return;
                }
            }
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) qVar.f424189m).iterator();
            long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            while (it.hasNext()) {
                long H = ((u26.p) it.next()).H();
                if (j17 > H) {
                    j17 = H;
                }
            }
            long j18 = qVar._tail;
            long j19 = qVar._head;
            if (j17 > j18) {
                j17 = j18;
            }
            if (j17 <= j19) {
                return;
            }
            int i18 = qVar._size;
            while (j19 < j17) {
                java.lang.Object[] objArr = qVar.f424188i;
                int i19 = qVar.f424186g;
                objArr[(int) (j19 % i19)] = null;
                boolean z17 = i18 >= i19;
                j19++;
                qVar._head = j19;
                i18--;
                qVar._size = i18;
                if (z17) {
                    do {
                        w17 = qVar.w();
                        if (w17 != null && !(w17 instanceof u26.e0)) {
                        }
                    } while (w17.y(null) == null);
                    qVar.f424188i[(int) (j18 % qVar.f424186g)] = w17.w();
                    qVar._size = i18 + 1;
                    qVar._tail = j18 + 1;
                    reentrantLock.unlock();
                    w17.u();
                    qVar.y();
                    pVar = null;
                    pVar2 = null;
                }
            }
            return;
        }
    }

    @Override // u26.t
    public void b(java.util.concurrent.CancellationException cancellationException) {
        s(cancellationException);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f424189m).iterator();
        while (it.hasNext()) {
            u26.p pVar = (u26.p) it.next();
            pVar.B(pVar.s(cancellationException));
        }
    }

    @Override // u26.t
    public u26.t0 d() {
        u26.p pVar = new u26.p(this);
        z(this, pVar, null, 2, null);
        return pVar;
    }

    @Override // u26.o
    public java.lang.String f() {
        return "(buffer:capacity=" + this.f424188i.length + ",size=" + this._size + ')';
    }

    @Override // u26.o
    public boolean p() {
        return false;
    }

    @Override // u26.o
    public boolean q() {
        return this._size >= this.f424186g;
    }

    @Override // u26.o, u26.y0
    public boolean s(java.lang.Throwable th6) {
        if (!super.s(th6)) {
            return false;
        }
        y();
        return true;
    }

    @Override // u26.o
    public java.lang.Object u(java.lang.Object obj) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f424187h;
        reentrantLock.lock();
        try {
            u26.e0 l17 = l();
            if (l17 != null) {
                return l17;
            }
            int i17 = this._size;
            if (i17 >= this.f424186g) {
                return u26.l.f424168c;
            }
            long j17 = this._tail;
            this.f424188i[(int) (j17 % this.f424186g)] = obj;
            this._size = i17 + 1;
            this._tail = j17 + 1;
            reentrantLock.unlock();
            y();
            return u26.l.f424167b;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void y() {
        boolean z17;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f424189m).iterator();
        boolean z18 = false;
        loop0: while (true) {
            z17 = z18;
            while (it.hasNext()) {
                if (((u26.p) it.next()).G()) {
                    break;
                } else {
                    z17 = true;
                }
            }
            z18 = true;
        }
        if (z18 || !z17) {
            z(this, null, null, 3, null);
        }
    }
}
