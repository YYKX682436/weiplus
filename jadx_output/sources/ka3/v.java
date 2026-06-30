package ka3;

/* loaded from: classes15.dex */
public final class v {
    public v(kotlin.jvm.internal.i iVar) {
    }

    public final ka3.w a(java.lang.String value) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(value, "value");
        java.util.Iterator<E> it = ka3.w.f306111m.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((ka3.w) obj).f306112d, value)) {
                break;
            }
        }
        return (ka3.w) obj;
    }
}
