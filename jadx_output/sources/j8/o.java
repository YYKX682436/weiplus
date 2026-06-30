package j8;

/* loaded from: classes15.dex */
public class o implements j8.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f298129a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f298130b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public j8.b f298131c;

    public o(android.content.Context context) {
        this.f298129a = context;
    }

    @Override // j8.a
    public void a(j8.h hVar) {
        this.f298131c.b();
        this.f298131c = null;
        java.util.List list = this.f298130b;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((j8.a) it.next()).a(hVar);
        }
        ((java.util.LinkedList) list).clear();
    }
}
