package fc;

/* loaded from: classes16.dex */
public final class d implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f260906d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f260907e;

    /* renamed from: f, reason: collision with root package name */
    public final int f260908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fc.k f260909g;

    public d(fc.k kVar, java.lang.Object obj, java.lang.Object obj2, int i17) {
        this.f260909g = kVar;
        this.f260906d = obj;
        this.f260907e = obj2;
        this.f260908f = i17;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f260906d;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f260907e;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object[] objArr = this.f260909g.f260916p;
        int i17 = this.f260908f;
        java.lang.Object obj2 = objArr[i17];
        java.lang.Object obj3 = this.f260907e;
        if (obj2 != obj3) {
            throw new java.util.ConcurrentModificationException();
        }
        objArr[i17] = obj;
        this.f260907e = obj;
        return obj3;
    }
}
