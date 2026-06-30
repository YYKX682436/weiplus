package mi1;

/* loaded from: classes7.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public int f326567a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f326568b;

    public h2(int i17, java.lang.Object obj, int i18, kotlin.jvm.internal.i iVar) {
        obj = (i18 & 2) != 0 ? null : obj;
        this.f326567a = i17;
        this.f326568b = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi1.h2)) {
            return false;
        }
        mi1.h2 h2Var = (mi1.h2) obj;
        return this.f326567a == h2Var.f326567a && kotlin.jvm.internal.o.b(this.f326568b, h2Var.f326568b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f326567a) * 31;
        java.lang.Object obj = this.f326568b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "State(state=" + this.f326567a + ", data=" + this.f326568b + ')';
    }
}
