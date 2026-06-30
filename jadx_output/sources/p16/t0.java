package p16;

/* loaded from: classes15.dex */
public class t0 implements java.lang.Comparable, java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Comparable f351350d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f351351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p16.w0 f351352f;

    public t0(p16.w0 w0Var, java.lang.Comparable comparable, java.lang.Object obj) {
        this.f351352f = w0Var;
        this.f351350d = comparable;
        this.f351351e = obj;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f351350d.compareTo(((p16.t0) obj).f351350d);
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Comparable comparable = this.f351350d;
        if (comparable == null ? key == null : comparable.equals(key)) {
            java.lang.Object obj2 = this.f351351e;
            java.lang.Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f351350d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f351351e;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Comparable comparable = this.f351350d;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.f351351e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        this.f351352f.b();
        java.lang.Object obj2 = this.f351351e;
        this.f351351e = obj;
        return obj2;
    }

    public java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.f351350d);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.f351351e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb6.append(valueOf);
        sb6.append("=");
        sb6.append(valueOf2);
        return sb6.toString();
    }
}
