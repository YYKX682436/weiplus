package va;

/* loaded from: classes16.dex */
public final class y extends va.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f434207d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f434208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ va.z f434209f;

    public y(va.z zVar, java.lang.Object obj, java.lang.Object obj2) {
        this.f434209f = zVar;
        this.f434207d = obj;
        this.f434208e = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return this.f434207d.equals(entry.getKey()) && this.f434208e.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f434207d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f434208e;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.f434207d.hashCode() ^ this.f434208e.hashCode();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object put = this.f434209f.put(this.f434207d, obj);
        this.f434208e = obj;
        return put;
    }
}
