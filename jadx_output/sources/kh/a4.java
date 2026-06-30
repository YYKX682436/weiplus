package kh;

/* loaded from: classes10.dex */
public final class a4 implements android.view.ViewTreeObserverCopyOnWriteArrayVisitor {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f307749a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f307750b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f307751c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f307752d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f307753e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f307754f;

    public a4(java.lang.String name, java.lang.Class proxyClass, java.util.List listenerList) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(proxyClass, "proxyClass");
        kotlin.jvm.internal.o.g(listenerList, "listenerList");
        this.f307749a = name;
        this.f307750b = proxyClass;
        this.f307751c = listenerList;
        this.f307752d = kh.k4.f307844a.d(name);
        this.f307754f = jz5.h.a(jz5.i.f302829d, kh.z3.f307966d);
    }

    @Override // android.view.ViewTreeObserverCopyOnWriteArrayVisitor
    public java.lang.Object add(java.lang.Object obj) {
        boolean z17 = this.f307752d;
        kh.w3 w3Var = kh.y3.f307954d;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Matrix.battery.TraversalTracker", "addListener: " + w3Var.a(obj));
        }
        return w3Var.b(this.f307749a, obj, this.f307750b, obj != null ? obj.getClass().getName() : null);
    }

    @Override // android.view.ViewTreeObserverCopyOnWriteArrayVisitor
    public void clear() {
        this.f307753e = true;
        if (this.f307752d) {
            com.tencent.mars.xlog.Log.i("Matrix.battery.TraversalTracker", "clear");
        }
    }

    @Override // android.view.ViewTreeObserverCopyOnWriteArrayVisitor
    public void end() {
        boolean z17 = this.f307752d;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Matrix.battery.TraversalTracker", "end");
        }
        boolean z18 = this.f307753e;
        jz5.g gVar = this.f307754f;
        java.util.List list = this.f307751c;
        if (z18) {
            list.clear();
            if (z17) {
                com.tencent.mars.xlog.Log.i("Matrix.battery.TraversalTracker", "end, clear");
            }
        } else {
            java.util.Iterator it = ((java.util.ArrayList) gVar.getValue()).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                list.remove(next);
                if (z17) {
                    com.tencent.mars.xlog.Log.i("Matrix.battery.TraversalTracker", "end, remove: " + kh.y3.f307954d.a(next));
                }
            }
        }
        this.f307753e = false;
        ((java.util.ArrayList) gVar.getValue()).clear();
    }

    @Override // android.view.ViewTreeObserverCopyOnWriteArrayVisitor
    public void remove(java.lang.Object obj) {
        ((java.util.ArrayList) this.f307754f.getValue()).add(obj);
        if (this.f307752d) {
            com.tencent.mars.xlog.Log.i("Matrix.battery.TraversalTracker", "removeListener: " + kh.y3.f307954d.a(obj));
        }
    }

    @Override // android.view.ViewTreeObserverCopyOnWriteArrayVisitor
    public int size() {
        return -1;
    }
}
