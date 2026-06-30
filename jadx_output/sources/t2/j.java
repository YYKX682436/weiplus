package t2;

/* loaded from: classes14.dex */
public abstract class j implements wa.a {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f414645g = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.logging.Logger f414646h = java.util.logging.Logger.getLogger(t2.j.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final t2.b f414647i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.Object f414648m;

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f414649d;

    /* renamed from: e, reason: collision with root package name */
    public volatile t2.f f414650e;

    /* renamed from: f, reason: collision with root package name */
    public volatile t2.i f414651f;

    static {
        t2.b hVar;
        try {
            hVar = new t2.g(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(t2.i.class, java.lang.Thread.class, "a"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(t2.i.class, t2.i.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(t2.j.class, t2.i.class, "f"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(t2.j.class, t2.f.class, "e"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(t2.j.class, java.lang.Object.class, "d"));
            th = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
            hVar = new t2.h();
        }
        f414647i = hVar;
        if (th != null) {
            f414646h.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f414648m = new java.lang.Object();
    }

    public static void b(t2.j jVar) {
        t2.i iVar;
        t2.f fVar;
        t2.f fVar2;
        t2.f fVar3;
        do {
            iVar = jVar.f414651f;
        } while (!f414647i.c(jVar, iVar, t2.i.f414642c));
        while (true) {
            fVar = null;
            if (iVar == null) {
                break;
            }
            java.lang.Thread thread = iVar.f414643a;
            if (thread != null) {
                iVar.f414643a = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
            iVar = iVar.f414644b;
        }
        do {
            fVar2 = jVar.f414650e;
        } while (!f414647i.a(jVar, fVar2, t2.f.f414633d));
        while (true) {
            fVar3 = fVar;
            fVar = fVar2;
            if (fVar == null) {
                break;
            }
            fVar2 = fVar.f414636c;
            fVar.f414636c = fVar3;
        }
        while (fVar3 != null) {
            t2.f fVar4 = fVar3.f414636c;
            c(fVar3.f414634a, fVar3.f414635b);
            fVar3 = fVar4;
        }
    }

    public static void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e17) {
            f414646h.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (java.lang.Throwable) e17);
        }
    }

    public static java.lang.Object e(java.util.concurrent.Future future) {
        java.lang.Object obj;
        boolean z17 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z17 = true;
            } catch (java.lang.Throwable th6) {
                if (z17) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th6;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(java.lang.StringBuilder sb6) {
        try {
            java.lang.Object e17 = e(this);
            sb6.append("SUCCESS, result=[");
            sb6.append(e17 == this ? "this future" : java.lang.String.valueOf(e17));
            sb6.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb6.append("CANCELLED");
        } catch (java.lang.RuntimeException e18) {
            sb6.append("UNKNOWN, cause=[");
            sb6.append(e18.getClass());
            sb6.append(" thrown from get()]");
        } catch (java.util.concurrent.ExecutionException e19) {
            sb6.append("FAILURE, cause=[");
            sb6.append(e19.getCause());
            sb6.append("]");
        }
    }

    @Override // wa.a
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        runnable.getClass();
        executor.getClass();
        t2.f fVar = this.f414650e;
        t2.f fVar2 = t2.f.f414633d;
        if (fVar != fVar2) {
            t2.f fVar3 = new t2.f(runnable, executor);
            do {
                fVar3.f414636c = fVar;
                if (f414647i.a(this, fVar, fVar3)) {
                    return;
                } else {
                    fVar = this.f414650e;
                }
            } while (fVar != fVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z17) {
        java.lang.Object obj = this.f414649d;
        if ((obj == null) | false) {
            if (f414647i.b(this, obj, f414645g ? new t2.c(z17, new java.util.concurrent.CancellationException("Future.cancel() was called.")) : z17 ? t2.c.f414629b : t2.c.f414630c)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    public final java.lang.Object d(java.lang.Object obj) {
        if (obj instanceof t2.c) {
            java.lang.Throwable th6 = ((t2.c) obj).f414631a;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th6);
            throw cancellationException;
        }
        if (obj instanceof t2.e) {
            throw new java.util.concurrent.ExecutionException(((t2.e) obj).f414632a);
        }
        if (obj == f414648m) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String f() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(t2.i iVar) {
        iVar.f414643a = null;
        while (true) {
            t2.i iVar2 = this.f414651f;
            if (iVar2 == t2.i.f414642c) {
                return;
            }
            t2.i iVar3 = null;
            while (iVar2 != null) {
                t2.i iVar4 = iVar2.f414644b;
                if (iVar2.f414643a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f414644b = iVar4;
                    if (iVar3.f414643a == null) {
                        break;
                    }
                } else if (!f414647i.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00aa -> B:33:0x00b0). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.j.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f414649d instanceof t2.c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f414649d != null) & true;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.toString());
        sb6.append("[status=");
        if (this.f414649d instanceof t2.c) {
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
            java.lang.Object obj2 = this.f414649d;
            if ((obj2 != null) & true) {
                return d(obj2);
            }
            t2.i iVar = this.f414651f;
            t2.i iVar2 = t2.i.f414642c;
            if (iVar != iVar2) {
                t2.i iVar3 = new t2.i();
                do {
                    t2.b bVar = f414647i;
                    bVar.d(iVar3, iVar);
                    if (bVar.c(this, iVar, iVar3)) {
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (!java.lang.Thread.interrupted()) {
                                obj = this.f414649d;
                            } else {
                                g(iVar3);
                                throw new java.lang.InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return d(obj);
                    }
                    iVar = this.f414651f;
                } while (iVar != iVar2);
            }
            return d(this.f414649d);
        }
        throw new java.lang.InterruptedException();
    }
}
