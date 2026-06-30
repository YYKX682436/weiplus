package wu5;

/* loaded from: classes12.dex */
public class l extends java.util.concurrent.FutureTask implements java.util.concurrent.RunnableScheduledFuture, wu5.h, java.util.concurrent.Delayed, wu5.c {

    /* renamed from: u, reason: collision with root package name */
    public static final su5.a f449842u = new wu5.k();

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f449843v = new java.util.concurrent.atomic.AtomicLong();

    /* renamed from: w, reason: collision with root package name */
    public static final uu5.b f449844w = tu5.j.f422176a;

    /* renamed from: x, reason: collision with root package name */
    public static final long f449845x = android.os.Looper.getMainLooper().getThread().getId();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f449846d;

    /* renamed from: e, reason: collision with root package name */
    public long f449847e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Thread f449848f;

    /* renamed from: g, reason: collision with root package name */
    public long f449849g;

    /* renamed from: h, reason: collision with root package name */
    public ku5.q f449850h;

    /* renamed from: i, reason: collision with root package name */
    public final long f449851i;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f449852m;

    /* renamed from: n, reason: collision with root package name */
    public final long f449853n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f449854o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f449855p;

    /* renamed from: q, reason: collision with root package name */
    public tu5.h f449856q;

    /* renamed from: r, reason: collision with root package name */
    public vu5.k f449857r;

    /* renamed from: s, reason: collision with root package name */
    public final int f449858s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Throwable f449859t;

    public l(java.lang.Runnable runnable, long j17, boolean z17) {
        super(runnable, null);
        this.f449846d = true;
        this.f449847e = 0L;
        this.f449849g = 0L;
        this.f449850h = ku5.q.CREATED;
        this.f449851i = f449843v.getAndIncrement();
        this.f449854o = runnable;
        this.f449852m = j17;
        this.f449853n = 0L;
        this.f449855p = getKey();
        int hashCode = runnable.hashCode();
        this.f449858s = hashCode;
        this.f449846d = z17;
        if (z17) {
            ((wu5.k) f449842u).e(this);
        }
        ku5.o.f312597a.d(getKey(), hashCode, this.f449850h, j17 - java.lang.System.nanoTime(), 0L, "", z17);
    }

    public final void a(android.os.Looper looper) {
        java.lang.Object a17;
        ku5.t tVar = ku5.c.f312553h;
        if (tVar.d()) {
            if (f449845x == java.lang.Thread.currentThread().getId() || android.os.Looper.myLooper() == null || looper != null) {
                return;
            }
            tVar.a(java.lang.Thread.currentThread(), getKey());
            if (!tVar.b()) {
                if (tVar.c()) {
                    this.f449859t = new java.lang.RuntimeException("this task has prepared looper, is not " + getKey());
                    return;
                }
                return;
            }
            try {
                zu5.a aVar = new zu5.a(android.os.Looper.class, "sThreadLocal");
                synchronized (aVar) {
                    a17 = aVar.a(false);
                }
                ((java.lang.ThreadLocal) a17).set(null);
            } catch (java.lang.Exception e17) {
                this.f449859t = e17;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        if (!super.cancel(z17)) {
            return false;
        }
        this.f449850h = ku5.q.CANCEL;
        if (this.f449846d) {
            ((wu5.k) f449842u).f(this);
        }
        ku5.o.f312597a.d(getKey(), this.f449858s, this.f449850h, 0L, 0L, "", this.f449846d);
        vu5.k kVar = this.f449857r;
        if (kVar == null) {
            return true;
        }
        kVar.a(this);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r10.f449851i < r11.f449851i) goto L17;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(java.util.concurrent.Delayed r11) {
        /*
            r10 = this;
            java.util.concurrent.Delayed r11 = (java.util.concurrent.Delayed) r11
            r0 = 0
            if (r11 != r10) goto L6
            goto L3a
        L6:
            boolean r1 = r11 instanceof wu5.l
            r2 = 0
            r4 = 1
            r5 = -1
            if (r1 == 0) goto L26
            wu5.l r11 = (wu5.l) r11
            long r0 = r10.f449852m
            long r6 = r11.f449852m
            long r0 = r0 - r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1a
            goto L35
        L1a:
            if (r0 <= 0) goto L1d
            goto L39
        L1d:
            long r0 = r10.f449851i
            long r2 = r11.f449851i
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 >= 0) goto L39
            goto L35
        L26:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r6 = r10.getDelay(r1)
            long r8 = r11.getDelay(r1)
            long r6 = r6 - r8
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 >= 0) goto L37
        L35:
            r0 = r5
            goto L3a
        L37:
            if (r11 <= 0) goto L3a
        L39:
            r0 = r4
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wu5.l.compareTo(java.lang.Object):int");
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        super.done();
        this.f449854o = null;
    }

    public void finalize() {
        super.finalize();
        ku5.q qVar = this.f449850h;
        if (qVar == ku5.q.CREATED || qVar == ku5.q.WAITING) {
            cancel(false);
        }
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.f449852m - java.lang.System.nanoTime(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        java.lang.String str = this.f449855p;
        if (str != null) {
            return str;
        }
        java.lang.Object obj = this.f449854o;
        return obj instanceof wu5.g ? ((wu5.g) obj).getKey() : obj.getClass().getName();
    }

    @Override // wu5.c
    public ku5.q getState() {
        return this.f449850h;
    }

    @Override // wu5.c
    public java.lang.Thread h() {
        return this.f449848f;
    }

    public tu5.h i() {
        tu5.g gVar;
        if (this.f449856q == null) {
            uu5.b bVar = f449844w;
            java.lang.String str = this.f449855p;
            ((uu5.a) bVar).getClass();
            java.util.HashMap hashMap = uu5.a.f431309a;
            synchronized (hashMap) {
                gVar = (tu5.g) hashMap.get(str);
                if (gVar == null) {
                    gVar = new tu5.g(str, new java.util.concurrent.atomic.AtomicInteger());
                    hashMap.put(str, gVar);
                }
            }
            this.f449856q = new tu5.h(gVar);
        }
        return this.f449856q;
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public boolean isPeriodic() {
        return this.f449853n != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0172  */
    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu5.l.run():void");
    }

    @Override // java.util.concurrent.FutureTask
    public void setException(java.lang.Throwable th6) {
        super.setException(th6);
        this.f449850h = ku5.q.ERROR;
        this.f449859t = th6;
    }

    public l(java.lang.Runnable runnable, long j17, long j18, boolean z17) {
        super(runnable, null);
        this.f449846d = true;
        this.f449847e = 0L;
        this.f449849g = 0L;
        this.f449850h = ku5.q.CREATED;
        this.f449851i = f449843v.getAndIncrement();
        this.f449854o = runnable;
        this.f449852m = j17;
        this.f449853n = j18;
        this.f449855p = getKey();
        int hashCode = runnable.hashCode();
        this.f449858s = hashCode;
        this.f449846d = z17;
        if (z17) {
            ((wu5.k) f449842u).e(this);
        }
        ku5.o.f312597a.d(getKey(), hashCode, this.f449850h, j17 - java.lang.System.nanoTime(), 0L, "", z17);
    }

    public l(java.util.concurrent.Callable callable, long j17, boolean z17) {
        super(callable);
        this.f449846d = true;
        this.f449847e = 0L;
        this.f449849g = 0L;
        this.f449850h = ku5.q.CREATED;
        this.f449851i = f449843v.getAndIncrement();
        this.f449854o = callable;
        this.f449852m = j17;
        this.f449853n = 0L;
        this.f449855p = getKey();
        int hashCode = callable.hashCode();
        this.f449858s = hashCode;
        this.f449846d = z17;
        if (z17) {
            ((wu5.k) f449842u).e(this);
        }
        ku5.o.f312597a.d(getKey(), hashCode, this.f449850h, j17 - java.lang.System.nanoTime(), 0L, "", z17);
    }
}
