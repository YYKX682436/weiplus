package zr0;

/* loaded from: classes10.dex */
public abstract class c implements nr0.c {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f475110d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f475111e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.HandlerThread f475112f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f475113g;

    /* renamed from: h, reason: collision with root package name */
    public rs0.h f475114h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f475115i;

    public c(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        this.f475110d = z17;
        this.f475111e = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f475115i = new java.lang.Object();
        if (z17) {
            int i18 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("Heavy-GLThread", -2);
            a17.start();
            this.f475113g = kotlinx.coroutines.z0.a(t26.e.b(new android.os.Handler(a17.getLooper()), null, 1, null));
            this.f475112f = a17;
        }
    }

    public final void b() {
        synchronized (this.f475115i) {
            java.util.List todoList = this.f475111e;
            kotlin.jvm.internal.o.f(todoList, "todoList");
            if (!todoList.isEmpty()) {
                java.util.List todoList2 = this.f475111e;
                kotlin.jvm.internal.o.f(todoList2, "todoList");
                java.util.Iterator it = todoList2.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                this.f475111e.clear();
            }
        }
    }

    public final kotlinx.coroutines.r2 c(boolean z17, java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(runnable, "runnable");
        if (this.f475113g != null) {
            android.os.HandlerThread handlerThread = this.f475112f;
            boolean z18 = false;
            if (handlerThread != null && handlerThread.isAlive()) {
                z18 = true;
            }
            if (z18) {
                kotlinx.coroutines.y0 y0Var = this.f475113g;
                if (y0Var != null) {
                    return kotlinx.coroutines.l.d(y0Var, null, null, new zr0.b(this, z17, runnable, null), 3, null);
                }
                return null;
            }
        }
        synchronized (this.f475115i) {
            this.f475111e.add(runnable);
        }
        return null;
    }
}
