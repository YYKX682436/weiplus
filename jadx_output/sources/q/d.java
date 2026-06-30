package q;

/* loaded from: classes13.dex */
public class d implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f359202d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f359203e;

    /* renamed from: f, reason: collision with root package name */
    public q.d f359204f;

    /* renamed from: g, reason: collision with root package name */
    public q.d f359205g;

    public d(java.lang.Object obj, java.lang.Object obj2) {
        this.f359202d = obj;
        this.f359203e = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.d)) {
            return false;
        }
        q.d dVar = (q.d) obj;
        return this.f359202d.equals(dVar.f359202d) && this.f359203e.equals(dVar.f359203e);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f359202d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f359203e;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.f359202d.hashCode() ^ this.f359203e.hashCode();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("An entry modification is not supported");
    }

    public java.lang.String toString() {
        return this.f359202d + "=" + this.f359203e;
    }
}
