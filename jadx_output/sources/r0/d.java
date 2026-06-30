package r0;

/* loaded from: classes14.dex */
public final class d extends kz5.j implements p0.f {

    /* renamed from: f, reason: collision with root package name */
    public static final r0.d f367962f = new r0.d(r0.u.f367987e, 0);

    /* renamed from: d, reason: collision with root package name */
    public final r0.u f367963d;

    /* renamed from: e, reason: collision with root package name */
    public final int f367964e;

    public d(r0.u node, int i17) {
        kotlin.jvm.internal.o.g(node, "node");
        this.f367963d = node;
        this.f367964e = i17;
    }

    public r0.d b(java.lang.Object obj, java.lang.Object obj2) {
        r0.t u17 = this.f367963d.u(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return u17 == null ? this : new r0.d(u17.f367985a, this.f367964e + u17.f367986b);
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.f367963d.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.f367963d.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
