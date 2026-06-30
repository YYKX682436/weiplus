package r0;

/* loaded from: classes14.dex */
public final class c extends r0.b implements zz5.e {

    /* renamed from: f, reason: collision with root package name */
    public final r0.i f367960f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f367961g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r0.i parentIterator, java.lang.Object obj, java.lang.Object obj2) {
        super(obj, obj2);
        kotlin.jvm.internal.o.g(parentIterator, "parentIterator");
        this.f367960f = parentIterator;
        this.f367961g = obj2;
    }

    @Override // r0.b, java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f367961g;
    }

    @Override // r0.b, java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object obj2 = this.f367961g;
        this.f367961g = obj;
        r0.g gVar = this.f367960f.f367979d;
        r0.f fVar = gVar.f367974g;
        java.lang.Object obj3 = this.f367958d;
        if (fVar.containsKey(obj3)) {
            boolean z17 = gVar.f367967f;
            if (!z17) {
                fVar.put(obj3, obj);
            } else {
                if (!z17) {
                    throw new java.util.NoSuchElementException();
                }
                r0.v vVar = gVar.f367965d[gVar.f367966e];
                java.lang.Object obj4 = vVar.f367992d[vVar.f367994f];
                fVar.put(obj3, obj);
                gVar.d(obj4 != null ? obj4.hashCode() : 0, fVar.f367970f, obj4, 0);
            }
            gVar.f367977m = fVar.f367972h;
        }
        return obj2;
    }
}
