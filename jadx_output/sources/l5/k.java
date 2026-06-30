package l5;

/* loaded from: classes14.dex */
public abstract class k implements wa.a {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f316530g = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.logging.Logger f316531h = java.util.logging.Logger.getLogger(l5.k.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final l5.b f316532i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.Object f316533m;

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f316534d;

    /* renamed from: e, reason: collision with root package name */
    public volatile l5.f f316535e;

    /* renamed from: f, reason: collision with root package name */
    public volatile l5.j f316536f;

    static {
        l5.b iVar;
        try {
            iVar = new l5.g(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(l5.j.class, java.lang.Thread.class, "a"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(l5.j.class, l5.j.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(l5.k.class, l5.j.class, "f"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(l5.k.class, l5.f.class, "e"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(l5.k.class, java.lang.Object.class, "d"));
            th = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
            iVar = new l5.i();
        }
        f316532i = iVar;
        if (th != null) {
            f316531h.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f316533m = new java.lang.Object();
    }

    public static void b(l5.k kVar) {
        l5.f fVar;
        l5.f fVar2;
        l5.f fVar3 = null;
        while (true) {
            l5.j jVar = kVar.f316536f;
            if (f316532i.c(kVar, jVar, l5.j.f316527c)) {
                while (jVar != null) {
                    java.lang.Thread thread = jVar.f316528a;
                    if (thread != null) {
                        jVar.f316528a = null;
                        java.util.concurrent.locks.LockSupport.unpark(thread);
                    }
                    jVar = jVar.f316529b;
                }
                do {
                    fVar = kVar.f316535e;
                } while (!f316532i.a(kVar, fVar, l5.f.f316516d));
                while (true) {
                    fVar2 = fVar3;
                    fVar3 = fVar;
                    if (fVar3 == null) {
                        break;
                    }
                    fVar = fVar3.f316519c;
                    fVar3.f316519c = fVar2;
                }
                while (fVar2 != null) {
                    fVar3 = fVar2.f316519c;
                    java.lang.Runnable runnable = fVar2.f316517a;
                    if (runnable instanceof l5.h) {
                        l5.h hVar = (l5.h) runnable;
                        kVar = hVar.f316525d;
                        if (kVar.f316534d == hVar) {
                            if (f316532i.b(kVar, hVar, e(hVar.f316526e))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, fVar2.f316518b);
                    }
                    fVar2 = fVar3;
                }
                return;
            }
        }
    }

    public static void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e17) {
            f316531h.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (java.lang.Throwable) e17);
        }
    }

    public static java.lang.Object e(wa.a aVar) {
        java.lang.Object obj;
        if (aVar instanceof l5.k) {
            java.lang.Object obj2 = ((l5.k) aVar).f316534d;
            if (!(obj2 instanceof l5.c)) {
                return obj2;
            }
            l5.c cVar = (l5.c) obj2;
            return cVar.f316512a ? cVar.f316513b != null ? new l5.c(false, cVar.f316513b) : l5.c.f316511d : obj2;
        }
        boolean isCancelled = aVar.isCancelled();
        boolean z17 = true;
        if ((!f316530g) && isCancelled) {
            return l5.c.f316511d;
        }
        boolean z18 = false;
        while (true) {
            try {
                try {
                    obj = aVar.get();
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z18 = z17;
                } catch (java.lang.Throwable th6) {
                    if (z18) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th6;
                }
            } catch (java.util.concurrent.CancellationException e17) {
                if (isCancelled) {
                    return new l5.c(false, e17);
                }
                return new l5.e(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e17));
            } catch (java.util.concurrent.ExecutionException e18) {
                return new l5.e(e18.getCause());
            } catch (java.lang.Throwable th7) {
                return new l5.e(th7);
            }
        }
        if (z18) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj == null ? f316533m : obj;
    }

    public final void a(java.lang.StringBuilder sb6) {
        java.lang.Object obj;
        boolean z17 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    if (z17) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th6;
                }
            } catch (java.util.concurrent.CancellationException unused2) {
                sb6.append("CANCELLED");
                return;
            } catch (java.lang.RuntimeException e17) {
                sb6.append("UNKNOWN, cause=[");
                sb6.append(e17.getClass());
                sb6.append(" thrown from get()]");
                return;
            } catch (java.util.concurrent.ExecutionException e18) {
                sb6.append("FAILURE, cause=[");
                sb6.append(e18.getCause());
                sb6.append("]");
                return;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
        sb6.append("SUCCESS, result=[");
        sb6.append(obj == this ? "this future" : java.lang.String.valueOf(obj));
        sb6.append("]");
    }

    @Override // wa.a
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        runnable.getClass();
        executor.getClass();
        l5.f fVar = this.f316535e;
        l5.f fVar2 = l5.f.f316516d;
        if (fVar != fVar2) {
            l5.f fVar3 = new l5.f(runnable, executor);
            do {
                fVar3.f316519c = fVar;
                if (f316532i.a(this, fVar, fVar3)) {
                    return;
                } else {
                    fVar = this.f316535e;
                }
            } while (fVar != fVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z17) {
        java.lang.Object obj = this.f316534d;
        if (!(obj == null) && !(obj instanceof l5.h)) {
            return false;
        }
        l5.c cVar = f316530g ? new l5.c(z17, new java.util.concurrent.CancellationException("Future.cancel() was called.")) : z17 ? l5.c.f316510c : l5.c.f316511d;
        l5.k kVar = this;
        boolean z18 = false;
        while (true) {
            if (f316532i.b(kVar, obj, cVar)) {
                b(kVar);
                if (!(obj instanceof l5.h)) {
                    return true;
                }
                wa.a aVar = ((l5.h) obj).f316526e;
                if (!(aVar instanceof l5.k)) {
                    aVar.cancel(z17);
                    return true;
                }
                kVar = (l5.k) aVar;
                obj = kVar.f316534d;
                if (!(obj == null) && !(obj instanceof l5.h)) {
                    return true;
                }
                z18 = true;
            } else {
                obj = kVar.f316534d;
                if (!(obj instanceof l5.h)) {
                    return z18;
                }
            }
        }
    }

    public final java.lang.Object d(java.lang.Object obj) {
        if (obj instanceof l5.c) {
            java.lang.Throwable th6 = ((l5.c) obj).f316513b;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th6);
            throw cancellationException;
        }
        if (obj instanceof l5.e) {
            throw new java.util.concurrent.ExecutionException(((l5.e) obj).f316515a);
        }
        if (obj == f316533m) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String f() {
        java.lang.Object obj = this.f316534d;
        if (obj instanceof l5.h) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFuture=[");
            wa.a aVar = ((l5.h) obj).f316526e;
            sb6.append(aVar == this ? "this future" : java.lang.String.valueOf(aVar));
            sb6.append("]");
            return sb6.toString();
        }
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(l5.j jVar) {
        jVar.f316528a = null;
        while (true) {
            l5.j jVar2 = this.f316536f;
            if (jVar2 == l5.j.f316527c) {
                return;
            }
            l5.j jVar3 = null;
            while (jVar2 != null) {
                l5.j jVar4 = jVar2.f316529b;
                if (jVar2.f316528a != null) {
                    jVar3 = jVar2;
                } else if (jVar3 != null) {
                    jVar3.f316529b = jVar4;
                    if (jVar3.f316528a == null) {
                        break;
                    }
                } else if (!f316532i.c(this, jVar2, jVar4)) {
                    break;
                }
                jVar2 = jVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b3 -> B:33:0x00b9). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.k.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f316534d instanceof l5.c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof l5.h)) & (this.f316534d != null);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.toString());
        sb6.append("[status=");
        if (this.f316534d instanceof l5.c) {
            sb6.append("CANCELLED");
        } else if (isDone()) {
            a(sb6);
        } else {
            try {
                str = f();
            } catch (java.lang.RuntimeException e17) {
                str = "Exception thrown from implementation: " + e17.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb6.append("PENDING, info=[");
                sb6.append(str);
                sb6.append("]");
            } else if (isDone()) {
                a(sb6);
            } else {
                sb6.append("PENDING");
            }
        }
        sb6.append("]");
        return sb6.toString();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        java.lang.Object obj;
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj2 = this.f316534d;
            if ((obj2 != null) & (!(obj2 instanceof l5.h))) {
                return d(obj2);
            }
            l5.j jVar = this.f316536f;
            l5.j jVar2 = l5.j.f316527c;
            if (jVar != jVar2) {
                l5.j jVar3 = new l5.j();
                do {
                    l5.b bVar = f316532i;
                    bVar.d(jVar3, jVar);
                    if (bVar.c(this, jVar, jVar3)) {
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (!java.lang.Thread.interrupted()) {
                                obj = this.f316534d;
                            } else {
                                g(jVar3);
                                throw new java.lang.InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof l5.h))));
                        return d(obj);
                    }
                    jVar = this.f316536f;
                } while (jVar != jVar2);
            }
            return d(this.f316534d);
        }
        throw new java.lang.InterruptedException();
    }
}
