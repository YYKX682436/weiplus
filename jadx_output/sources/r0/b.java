package r0;

/* loaded from: classes.dex */
public class b implements java.util.Map.Entry, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f367958d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f367959e;

    public b(java.lang.Object obj, java.lang.Object obj2) {
        this.f367958d = obj;
        this.f367959e = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        java.util.Map.Entry entry = obj instanceof java.util.Map.Entry ? (java.util.Map.Entry) obj : null;
        return entry != null && kotlin.jvm.internal.o.b(entry.getKey(), this.f367958d) && kotlin.jvm.internal.o.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f367958d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f367959e;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Object obj = this.f367958d;
        int hashCode = obj != null ? obj.hashCode() : 0;
        java.lang.Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f367958d);
        sb6.append('=');
        sb6.append(getValue());
        return sb6.toString();
    }
}
