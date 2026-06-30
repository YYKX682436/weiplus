package wp1;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f448379a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f448380b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f448381c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f448382d;

    public final r45.f83 a(java.lang.String eventId) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        wp1.a aVar = (wp1.a) ((java.util.LinkedHashMap) this.f448379a).get(java.lang.Integer.valueOf(this.f448380b));
        if (aVar == null) {
            return null;
        }
        int b17 = vp1.j.f438900a.b(eventId);
        java.util.Iterator it = aVar.f448378b.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            r45.f83 f83Var = (r45.f83) it.next();
            if (f83Var.f374091m == b17) {
                return f83Var;
            }
        }
        return null;
    }

    public final r45.f83 b() {
        wp1.a aVar = (wp1.a) ((java.util.LinkedHashMap) this.f448379a).get(java.lang.Integer.valueOf(this.f448380b));
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }
}
