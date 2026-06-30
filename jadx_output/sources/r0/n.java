package r0;

/* loaded from: classes14.dex */
public final class n extends kz5.o implements p0.c {

    /* renamed from: d, reason: collision with root package name */
    public final r0.d f367982d;

    public n(r0.d map) {
        kotlin.jvm.internal.o.g(map, "map");
        this.f367982d = map;
    }

    @Override // kz5.b, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(element, "element");
        java.lang.Object key = element.getKey();
        r0.d dVar = this.f367982d;
        java.lang.Object obj2 = dVar.get(key);
        return obj2 != null ? kotlin.jvm.internal.o.b(obj2, element.getValue()) : element.getValue() == null && dVar.containsKey(element.getKey());
    }

    @Override // kz5.b
    public int d() {
        r0.d dVar = this.f367982d;
        dVar.getClass();
        return dVar.f367964e;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new r0.o(this.f367982d.f367963d);
    }
}
