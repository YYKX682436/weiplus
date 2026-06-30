package sf5;

/* loaded from: classes15.dex */
public final class b {
    public void a(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.ArrayList a17 = sf5.e.a(sf5.e.f407629a);
        if (a17 != null) {
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                ((pf5.a) it.next()).onActivityPostCreated(activity, bundle);
            }
        }
    }

    public void b(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.ArrayList a17 = sf5.e.a(sf5.e.f407629a);
        if (a17 != null) {
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                ((pf5.a) it.next()).onActivityPostDestroyed(activity);
            }
        }
    }

    public void c(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.ArrayList a17 = sf5.e.a(sf5.e.f407629a);
        if (a17 != null) {
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                ((pf5.a) it.next()).onActivityPreCreated(activity, bundle);
            }
        }
    }

    public void d(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.ArrayList a17 = sf5.e.a(sf5.e.f407629a);
        if (a17 != null) {
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                ((pf5.a) it.next()).onActivityPreDestroyed(activity);
            }
        }
    }
}
