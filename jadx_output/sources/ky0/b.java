package ky0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ky0.b f313452a = new ky0.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f313453b = kz5.c1.l(new jz5.l(ky0.a.f313449d, new java.util.ArrayList()), new jz5.l(ky0.a.f313450e, new java.util.ArrayList()));

    public final void a(ky0.a scene, yz5.a listener) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(listener, "listener");
        synchronized (this) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) f313453b).get(scene);
            if (list != null) {
                list.add(listener);
            }
        }
    }

    public final void b(yz5.a listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        synchronized (this) {
            for (ky0.a aVar : ky0.a.values()) {
                java.util.List list = (java.util.List) ((java.util.LinkedHashMap) f313453b).get(aVar);
                if (list != null) {
                    list.remove(listener);
                }
            }
        }
    }
}
