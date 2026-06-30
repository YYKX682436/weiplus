package va;

/* loaded from: classes16.dex */
public abstract class m extends java.util.concurrent.locks.ReentrantLock {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f434193m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final va.z f434194d;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f434195e;

    /* renamed from: f, reason: collision with root package name */
    public int f434196f;

    /* renamed from: g, reason: collision with root package name */
    public int f434197g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.util.concurrent.atomic.AtomicReferenceArray f434198h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f434199i = new java.util.concurrent.atomic.AtomicInteger();

    public m(va.z zVar, int i17, int i18) {
        this.f434194d = zVar;
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = new java.util.concurrent.atomic.AtomicReferenceArray(i17);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.f434197g = length;
        if (length == i18) {
            this.f434197g = length + 1;
        }
        this.f434198h = atomicReferenceArray;
    }

    public void a(java.lang.ref.ReferenceQueue referenceQueue) {
        int i17 = 0;
        do {
            java.lang.Object poll = referenceQueue.poll();
            if (poll == null) {
                return;
            }
            va.w wVar = (va.w) poll;
            va.z zVar = this.f434194d;
            zVar.getClass();
            va.h b17 = wVar.b();
            int c17 = b17.c();
            va.m c18 = zVar.c(c17);
            java.lang.Object key = b17.getKey();
            c18.lock();
            try {
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = c18.f434198h;
                int length = (atomicReferenceArray.length() - 1) & c17;
                va.h hVar = (va.h) atomicReferenceArray.get(length);
                va.h hVar2 = hVar;
                while (true) {
                    if (hVar2 == null) {
                        break;
                    }
                    java.lang.Object key2 = hVar2.getKey();
                    if (hVar2.c() != c17 || key2 == null || !c18.f434194d.f434215h.c(key, key2)) {
                        hVar2 = hVar2.b();
                    } else if (((va.v) hVar2).a() == wVar) {
                        c18.f434196f++;
                        va.h h17 = c18.h(hVar, hVar2);
                        int i18 = c18.f434195e - 1;
                        atomicReferenceArray.set(length, h17);
                        c18.f434195e = i18;
                    }
                }
                c18.unlock();
                i17++;
            } catch (java.lang.Throwable th6) {
                c18.unlock();
                throw th6;
            }
        } while (i17 != 16);
    }

    public void b() {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f434198h;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i17 = this.f434195e;
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray(length << 1);
        this.f434197g = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i18 = 0; i18 < length; i18++) {
            va.h hVar = (va.h) atomicReferenceArray.get(i18);
            if (hVar != null) {
                va.h b17 = hVar.b();
                int c17 = hVar.c() & length2;
                if (b17 == null) {
                    atomicReferenceArray2.set(c17, hVar);
                } else {
                    va.h hVar2 = hVar;
                    while (b17 != null) {
                        int c18 = b17.c() & length2;
                        if (c18 != c17) {
                            hVar2 = b17;
                            c17 = c18;
                        }
                        b17 = b17.b();
                    }
                    atomicReferenceArray2.set(c17, hVar2);
                    while (hVar != hVar2) {
                        int c19 = hVar.c() & length2;
                        va.h d17 = this.f434194d.f434216i.d(j(), hVar, (va.h) atomicReferenceArray2.get(c19));
                        if (d17 != null) {
                            atomicReferenceArray2.set(c19, d17);
                        } else {
                            i17--;
                        }
                        hVar = hVar.b();
                    }
                }
            }
        }
        this.f434198h = atomicReferenceArray2;
        this.f434195e = i17;
    }

    public va.h c(java.lang.Object obj, int i17) {
        if (this.f434195e != 0) {
            for (va.h hVar = (va.h) this.f434198h.get((r0.length() - 1) & i17); hVar != null; hVar = hVar.b()) {
                if (hVar.c() == i17) {
                    java.lang.Object key = hVar.getKey();
                    if (key == null) {
                        l();
                    } else if (this.f434194d.f434215h.c(obj, key)) {
                        return hVar;
                    }
                }
            }
        }
        return null;
    }

    public abstract void d();

    public abstract void e();

    public void f() {
        if ((this.f434199i.incrementAndGet() & 63) == 0) {
            i();
        }
    }

    public java.lang.Object g(java.lang.Object obj, int i17, java.lang.Object obj2, boolean z17) {
        lock();
        try {
            i();
            int i18 = this.f434195e + 1;
            if (i18 > this.f434197g) {
                b();
                i18 = this.f434195e + 1;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f434198h;
            int length = (atomicReferenceArray.length() - 1) & i17;
            va.h hVar = (va.h) atomicReferenceArray.get(length);
            for (va.h hVar2 = hVar; hVar2 != null; hVar2 = hVar2.b()) {
                java.lang.Object key = hVar2.getKey();
                if (hVar2.c() == i17 && key != null && this.f434194d.f434215h.c(obj, key)) {
                    java.lang.Object value = hVar2.getValue();
                    if (value == null) {
                        this.f434196f++;
                        k(hVar2, obj2);
                        this.f434195e = this.f434195e;
                        return null;
                    }
                    if (z17) {
                        return value;
                    }
                    this.f434196f++;
                    k(hVar2, obj2);
                    return value;
                }
            }
            this.f434196f++;
            va.h a17 = this.f434194d.f434216i.a(j(), obj, i17, hVar);
            k(a17, obj2);
            atomicReferenceArray.set(length, a17);
            this.f434195e = i18;
            return null;
        } finally {
            unlock();
        }
    }

    public va.h h(va.h hVar, va.h hVar2) {
        int i17 = this.f434195e;
        va.h b17 = hVar2.b();
        while (hVar != hVar2) {
            va.h d17 = this.f434194d.f434216i.d(j(), hVar, b17);
            if (d17 != null) {
                b17 = d17;
            } else {
                i17--;
            }
            hVar = hVar.b();
        }
        this.f434195e = i17;
        return b17;
    }

    public void i() {
        if (tryLock()) {
            try {
                e();
                this.f434199i.set(0);
            } finally {
                unlock();
            }
        }
    }

    public abstract va.m j();

    public void k(va.h hVar, java.lang.Object obj) {
        this.f434194d.f434216i.b(j(), hVar, obj);
    }

    public void l() {
        if (tryLock()) {
            try {
                e();
            } finally {
                unlock();
            }
        }
    }
}
