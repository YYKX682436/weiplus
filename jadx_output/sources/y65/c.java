package y65;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f459665a = jz5.h.b(y65.a.f459663d);

    public final java.util.concurrent.PriorityBlockingQueue a() {
        return (java.util.concurrent.PriorityBlockingQueue) ((jz5.n) this.f459665a).getValue();
    }

    public w65.m b(java.lang.String id6) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(id6, "id");
        java.util.Iterator it = a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((w65.m) obj).id(), id6)) {
                break;
            }
        }
        return (w65.m) obj;
    }

    public boolean c(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        return a().removeIf(new y65.b(id6));
    }
}
