package fo3;

/* loaded from: classes14.dex */
public final class q {
    public q(kotlin.jvm.internal.i iVar) {
    }

    public final fo3.r a(fo3.p view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.util.Map map = fo3.r.f264942e;
        java.lang.String h17 = view.h();
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(h17);
        if (obj == null) {
            obj = new fo3.r(view, 1, 0, 4, null);
            linkedHashMap.put(h17, obj);
        }
        return (fo3.r) obj;
    }
}
