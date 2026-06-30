package kh;

/* loaded from: classes10.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.k4 f307844a = new kh.k4();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Class f307845b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Field f307846c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Method f307847d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Field f307848e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f307849f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f307850g;

    static {
        jz5.i iVar = jz5.i.f302829d;
        f307849f = jz5.h.a(iVar, kh.i4.f307833d);
        f307850g = jz5.h.a(iVar, kh.j4.f307836d);
    }

    public static /* synthetic */ void b(kh.k4 k4Var, android.view.ViewTreeObserver viewTreeObserver, java.lang.String str, java.lang.Class cls, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            aVar = kh.h4.f307825d;
        }
        k4Var.a(viewTreeObserver, str, cls, aVar);
    }

    public final void a(android.view.ViewTreeObserver viewTreeObserver, java.lang.String str, java.lang.Class cls, yz5.a aVar) {
        java.util.List list;
        try {
            java.util.HashMap hashMap = (java.util.HashMap) f307849f.getValue();
            java.lang.Object obj = hashMap.get(str);
            java.lang.Object obj2 = obj;
            if (obj == null) {
                java.lang.reflect.Field declaredField = viewTreeObserver.getClass().getDeclaredField(str);
                declaredField.setAccessible(true);
                hashMap.put(str, declaredField);
                obj2 = declaredField;
            }
            java.lang.reflect.Field field = (java.lang.reflect.Field) obj2;
            java.util.List b17 = kotlin.jvm.internal.m0.b(field.get(viewTreeObserver));
            if (b17 != null && (b17.isEmpty() ^ true)) {
                kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                kotlin.jvm.internal.m0.b(b17);
                java.util.List S0 = kz5.n0.S0(b17);
                if (b17 instanceof kh.u3) {
                    b17.clear();
                    list = b17;
                } else {
                    list = (java.util.List) aVar.invoke();
                }
                java.util.Iterator it = S0.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    java.lang.Object b18 = kh.y3.f307954d.b(str, next, cls, next != null ? next.getClass().getName() : null);
                    if (b18 != null) {
                        next = b18;
                    }
                    list.add(next);
                }
                if (b17 != list) {
                    field.set(viewTreeObserver, list);
                    if (d(str)) {
                        com.tencent.mars.xlog.Log.i("Matrix.battery.TraversalTracker", "hacking array: " + viewTreeObserver);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.TraversalTracker", th6, "hackCopyOnWriteArrayListListenersErr: " + th6.getMessage(), new java.lang.Object[0]);
            if (kh.k1.f307838n) {
                ap.a.a(1, "errTrackTraversal", th6, null, "hackCopyOnWriteArrayListListeners", str, cls.getName());
            }
        }
    }

    public final void c(android.view.ViewTreeObserver viewTreeObserver, java.lang.String str, java.lang.Class cls) {
        java.util.List u3Var;
        try {
            java.util.HashMap hashMap = (java.util.HashMap) f307849f.getValue();
            java.lang.Object obj = hashMap.get(str);
            java.lang.Object obj2 = obj;
            if (obj == null) {
                java.lang.reflect.Field declaredField = viewTreeObserver.getClass().getDeclaredField(str);
                declaredField.setAccessible(true);
                hashMap.put(str, declaredField);
                obj2 = declaredField;
            }
            java.lang.reflect.Field field = (java.lang.reflect.Field) obj2;
            java.lang.Object obj3 = field.get(viewTreeObserver);
            if (obj3 != null) {
                java.lang.reflect.Field field2 = f307848e;
                if (field2 == null) {
                    java.lang.Class cls2 = f307845b;
                    kotlin.jvm.internal.o.d(cls2);
                    field2 = cls2.getDeclaredField("mData");
                    field2.setAccessible(true);
                    f307848e = field2;
                }
                java.util.List b17 = kotlin.jvm.internal.m0.b(field2.get(obj3));
                if (b17 != null && (b17.isEmpty() ^ true)) {
                    kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                    kotlin.jvm.internal.m0.b(b17);
                    java.util.List S0 = kz5.n0.S0(b17);
                    if (b17 instanceof kh.u3) {
                        b17.clear();
                        u3Var = b17;
                    } else {
                        u3Var = new kh.u3();
                    }
                    java.util.Iterator it = S0.iterator();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        java.lang.Object b18 = kh.y3.f307954d.b(str, next, cls, next != null ? next.getClass().getName() : null);
                        if (b18 != null) {
                            next = b18;
                        }
                        u3Var.add(next);
                    }
                    java.lang.Object viewTreeObserverCopyOnWriteArrayWrap = obj3.getClass() == f307845b ? new android.view.ViewTreeObserverCopyOnWriteArrayWrap(new kh.a4(str, cls, u3Var)) : obj3;
                    if (b17 != u3Var) {
                        field2.set(viewTreeObserverCopyOnWriteArrayWrap, u3Var);
                        if (d(str)) {
                            com.tencent.mars.xlog.Log.i("Matrix.battery.TraversalTracker", "hacking array dataList: " + viewTreeObserver);
                        }
                    }
                    if (obj3 != viewTreeObserverCopyOnWriteArrayWrap) {
                        field.set(viewTreeObserver, viewTreeObserverCopyOnWriteArrayWrap);
                        if (d(str)) {
                            com.tencent.mars.xlog.Log.i("Matrix.battery.TraversalTracker", "hacking array: " + viewTreeObserver);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.TraversalTracker", th6, "hackCopyOnWriteArrayListenersErr: " + th6.getMessage(), new java.lang.Object[0]);
            if (kh.k1.f307838n) {
                ap.a.a(1, "errTrackTraversal", th6, null, "hackCopyOnWriteArrayListeners", str, cls.getName());
            }
        }
    }

    public final boolean d(java.lang.String str) {
        return kotlin.jvm.internal.o.b(str, "mOnPreDrawListeners");
    }
}
