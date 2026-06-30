package fc;

/* loaded from: classes16.dex */
public final class f extends fc.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc.k f260911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(fc.k kVar) {
        super(kVar);
        this.f260911e = kVar;
    }

    @Override // fc.h
    public final /* bridge */ /* synthetic */ boolean d(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.f260911e.get(entry.getKey());
        java.lang.Object value = entry.getValue();
        if (value != obj2) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // fc.h
    public final /* bridge */ /* synthetic */ boolean e(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        fc.k kVar = this.f260911e;
        int r17 = kVar.r(key);
        if (r17 < 0) {
            return false;
        }
        java.lang.Object value = entry.getValue();
        java.lang.Object obj2 = kVar.f260916p[r17];
        if (value != obj2 && (value == null || !value.equals(obj2))) {
            return false;
        }
        kVar.l(r17);
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new fc.e(this, this.f260911e);
    }
}
