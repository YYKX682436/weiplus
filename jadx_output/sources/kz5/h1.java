package kz5;

/* loaded from: classes12.dex */
public final class h1 implements kz5.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f313974d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f313975e;

    public h1(java.util.Map map, yz5.l lVar) {
        kotlin.jvm.internal.o.g(map, "map");
        kotlin.jvm.internal.o.g(lVar, "default");
        this.f313974d = map;
        this.f313975e = lVar;
    }

    @Override // java.util.Map
    public void clear() {
        this.f313974d.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.f313974d.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return this.f313974d.containsValue(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        return this.f313974d.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return this.f313974d.equals(obj);
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.f313974d.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f313974d.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f313974d.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        return this.f313974d.keySet();
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return this.f313974d.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map from) {
        kotlin.jvm.internal.o.g(from, "from");
        this.f313974d.putAll(from);
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        return this.f313974d.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f313974d.size();
    }

    public java.lang.String toString() {
        return this.f313974d.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return this.f313974d.values();
    }
}
