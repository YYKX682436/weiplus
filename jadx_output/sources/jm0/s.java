package jm0;

/* loaded from: classes10.dex */
public class s extends androidx.lifecycle.o {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.y f300286b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.n f300287c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f300288d;

    public s(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f300286b = owner;
        this.f300287c = androidx.lifecycle.n.INITIALIZED;
        this.f300288d = new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // androidx.lifecycle.o
    public void a(androidx.lifecycle.x observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f300288d;
        if (concurrentHashMap != null) {
        }
    }

    @Override // androidx.lifecycle.o
    public androidx.lifecycle.n b() {
        return this.f300287c;
    }

    @Override // androidx.lifecycle.o
    public void c(androidx.lifecycle.x observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f300288d;
        if (concurrentHashMap != null) {
        }
    }

    public final void d() {
        java.util.List<androidx.lifecycle.x> list;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.PluginLifecycleRegistry", "moveToCreateState start");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f300288d;
        if (concurrentHashMap != null) {
            list = new java.util.ArrayList(concurrentHashMap.size());
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                list.add((androidx.lifecycle.x) ((java.util.Map.Entry) it.next()).getValue());
            }
        } else {
            list = kz5.p0.f313996d;
        }
        for (androidx.lifecycle.x xVar : list) {
            if (xVar instanceof androidx.lifecycle.v) {
                ((androidx.lifecycle.v) xVar).onStateChanged(this.f300286b, androidx.lifecycle.m.ON_CREATE);
            } else {
                java.lang.reflect.Method[] methods = xVar.getClass().getMethods();
                kotlin.jvm.internal.o.f(methods, "getMethods(...)");
                for (java.lang.reflect.Method method : methods) {
                    androidx.lifecycle.l0 l0Var = (androidx.lifecycle.l0) method.getAnnotation(androidx.lifecycle.l0.class);
                    if (l0Var != null && l0Var.value() == androidx.lifecycle.m.ON_CREATE) {
                        method.invoke(xVar, new java.lang.Object[0]);
                    }
                }
            }
        }
        this.f300287c = androidx.lifecycle.n.CREATED;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.PluginLifecycleRegistry", "moveToCreateState end");
    }

    public final void e() {
        java.util.List<androidx.lifecycle.x> list;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.PluginLifecycleRegistry", "moveToDestroyState start");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f300288d;
        if (concurrentHashMap != null) {
            list = new java.util.ArrayList(concurrentHashMap.size());
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                list.add((androidx.lifecycle.x) ((java.util.Map.Entry) it.next()).getValue());
            }
        } else {
            list = kz5.p0.f313996d;
        }
        for (androidx.lifecycle.x xVar : list) {
            if (xVar instanceof androidx.lifecycle.v) {
                ((androidx.lifecycle.v) xVar).onStateChanged(this.f300286b, androidx.lifecycle.m.ON_DESTROY);
            } else {
                java.lang.reflect.Method[] methods = xVar.getClass().getMethods();
                kotlin.jvm.internal.o.f(methods, "getMethods(...)");
                for (java.lang.reflect.Method method : methods) {
                    androidx.lifecycle.l0 l0Var = (androidx.lifecycle.l0) method.getAnnotation(androidx.lifecycle.l0.class);
                    if (l0Var != null && l0Var.value() == androidx.lifecycle.m.ON_DESTROY) {
                        method.invoke(xVar, new java.lang.Object[0]);
                    }
                }
            }
        }
        this.f300288d = null;
        this.f300287c = androidx.lifecycle.n.DESTROYED;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.PluginLifecycleRegistry", "moveToDestroyState end");
    }
}
