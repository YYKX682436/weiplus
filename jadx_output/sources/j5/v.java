package j5;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f297761a;

    /* renamed from: b, reason: collision with root package name */
    public a5.q0 f297762b;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5.v)) {
            return false;
        }
        j5.v vVar = (j5.v) obj;
        if (this.f297762b != vVar.f297762b) {
            return false;
        }
        return this.f297761a.equals(vVar.f297761a);
    }

    public int hashCode() {
        return (this.f297761a.hashCode() * 31) + this.f297762b.hashCode();
    }
}
