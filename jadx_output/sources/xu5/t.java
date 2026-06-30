package xu5;

/* loaded from: classes12.dex */
public final class t implements android.os.Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    public final xu5.s f457336f;

    /* renamed from: n, reason: collision with root package name */
    public xu5.r[] f457341n;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f457334d = ru5.d.a("SerialQueueLeader", this);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f457335e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public boolean f457337g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f457338h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f457339i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f457340m = new java.util.LinkedList();

    public t(xu5.s sVar) {
        this.f457336f = sVar;
    }

    public void a() {
        synchronized (this) {
            this.f457334d.removeMessages(1);
            java.util.Iterator it = this.f457339i.iterator();
            while (it.hasNext()) {
                xu5.v vVar = (xu5.v) it.next();
                if (!vVar.isCancelled()) {
                    vVar.cancel(false);
                }
            }
            this.f457339i.clear();
            java.util.Iterator it6 = this.f457338h.iterator();
            while (it6.hasNext()) {
                xu5.v vVar2 = (xu5.v) it6.next();
                if (!vVar2.isCancelled()) {
                    vVar2.cancel(false);
                }
            }
            this.f457338h.clear();
        }
    }

    public boolean b(xu5.p pVar) {
        synchronized (this) {
            java.util.Iterator it = this.f457338h.iterator();
            while (it.hasNext()) {
                if (pVar.a((xu5.v) it.next())) {
                    return true;
                }
            }
            java.util.Iterator it6 = this.f457339i.iterator();
            while (it6.hasNext()) {
                if (pVar.a((xu5.v) it6.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    public java.util.List c() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        synchronized (this) {
            linkedList = new java.util.LinkedList(this.f457339i);
            linkedList.addAll(this.f457338h);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(((xu5.v) it.next()).getKey());
        }
        return linkedList2;
    }

    public void d(long j17, xu5.v vVar) {
        synchronized (this) {
            if (this.f457335e.get()) {
                return;
            }
            if (vVar == null) {
                return;
            }
            if (vVar.isCancelled()) {
                return;
            }
            if (j17 > 0) {
                android.os.Message obtainMessage = this.f457334d.obtainMessage();
                obtainMessage.obj = vVar;
                obtainMessage.what = 1;
                synchronized (this) {
                    this.f457338h.add(vVar);
                    this.f457334d.sendMessageAtTime(obtainMessage, android.os.SystemClock.uptimeMillis() + j17);
                }
                return;
            }
            boolean isEmpty = this.f457339i.isEmpty();
            if (!isEmpty || this.f457337g) {
                if (!isEmpty && j17 != Long.MIN_VALUE) {
                    this.f457339i.addLast(vVar);
                    return;
                }
                this.f457339i.addFirst(vVar);
                return;
            }
            this.f457337g = true;
            xu5.s sVar = this.f457336f;
            java.util.Objects.requireNonNull(sVar);
            vVar.f457343z = (xu5.d) sVar;
            ((vu5.b) vVar.f449857r).c(vVar);
        }
    }

    public final void e() {
        int size;
        synchronized (this) {
            size = this.f457340m.size();
            if (size > 0) {
                if (this.f457341n == null) {
                    this.f457341n = new xu5.r[size];
                }
                this.f457341n = (xu5.r[]) this.f457340m.toArray(this.f457341n);
            }
        }
        if (size <= 0) {
            return;
        }
        xu5.r[] rVarArr = this.f457341n;
        xu5.r rVar = rVarArr[0];
        rVarArr[0] = null;
        try {
            throw null;
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                this.f457340m.remove((java.lang.Object) null);
                throw th6;
            }
        }
    }

    public boolean g() {
        if (!this.f457335e.compareAndSet(false, true)) {
            return false;
        }
        synchronized (this) {
            a();
            this.f457337g = false;
        }
        return true;
    }

    public void h(xu5.q qVar) {
        java.util.Objects.requireNonNull(qVar);
        synchronized (this) {
            java.util.Iterator it = this.f457338h.iterator();
            while (it.hasNext()) {
                xu5.v vVar = (xu5.v) it.next();
                if (qVar.a(vVar)) {
                    this.f457334d.removeMessages(1, vVar);
                    if (!vVar.isCancelled()) {
                        vVar.cancel(false);
                    }
                    it.remove();
                }
            }
            java.util.Iterator it6 = this.f457339i.iterator();
            while (it6.hasNext()) {
                xu5.v vVar2 = (xu5.v) it6.next();
                if (qVar.a(vVar2)) {
                    if (!vVar2.isCancelled()) {
                        vVar2.cancel(false);
                    }
                    it6.remove();
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return false;
        }
        synchronized (this) {
            if (!this.f457338h.remove(message.obj)) {
                return false;
            }
            d(0L, (xu5.v) message.obj);
            return true;
        }
    }
}
