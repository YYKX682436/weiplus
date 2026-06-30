package ob0;

/* loaded from: classes3.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f343933a = jz5.h.b(ob0.n3.f343927d);

    public final synchronized boolean a(ob0.o3 result) {
        java.util.List b17;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(result, "result");
        b17 = b();
        java.util.List b18 = result.b();
        arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : b18) {
            if (!b().contains((jz5.o) obj)) {
                arrayList.add(obj);
            }
        }
        return b17.addAll(arrayList);
    }

    public final java.util.List b() {
        return (java.util.List) ((jz5.n) this.f343933a).getValue();
    }
}
