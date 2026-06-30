package tk;

/* loaded from: classes7.dex */
public final class v {
    public v(kotlin.jvm.internal.i iVar) {
    }

    public final tk.w a(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(str, "str");
        java.util.Iterator<E> it = tk.w.f419881h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((tk.w) obj).f419882d, str)) {
                break;
            }
        }
        tk.w wVar = (tk.w) obj;
        return wVar == null ? tk.w.f419879f : wVar;
    }
}
