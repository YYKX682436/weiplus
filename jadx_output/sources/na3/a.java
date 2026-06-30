package na3;

/* loaded from: classes7.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final na3.b a(java.lang.String webApiName) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(webApiName, "webApiName");
        java.util.Iterator<E> it = na3.b.f335982h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((na3.b) obj).f335984e, webApiName)) {
                break;
            }
        }
        return (na3.b) obj;
    }
}
