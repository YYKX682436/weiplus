package lo0;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f319985a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f319986b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f319987c;

    /* renamed from: d, reason: collision with root package name */
    public final lo0.d f319988d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f319989e;

    public f(java.lang.String collectionId, java.util.List badges) {
        kotlin.jvm.internal.o.g(collectionId, "collectionId");
        kotlin.jvm.internal.o.g(badges, "badges");
        this.f319985a = collectionId;
        this.f319987c = new java.util.ArrayList();
        this.f319988d = new lo0.d(this);
        this.f319989e = new java.util.ArrayList();
        if (!(collectionId.length() > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        this.f319986b = d75.b.d(badges, lo0.c.f319976d);
    }

    public final boolean a() {
        return !this.f319987c.isEmpty();
    }

    public final void b() {
        java.util.List list = this.f319987c;
        ((java.util.ArrayList) list).clear();
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f319986b).entrySet().iterator();
        while (it.hasNext()) {
            lo0.b bVar = (lo0.b) ((java.util.Map.Entry) it.next()).getValue();
            boolean b17 = bVar.b();
            lo0.d dVar = this.f319988d;
            if (b17) {
                ((java.util.ArrayList) list).add(bVar);
                bVar.a(dVar);
            } else {
                bVar.c(dVar);
            }
        }
    }
}
