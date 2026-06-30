package m3;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f323092a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f323093b;

    public d(java.lang.Object obj, java.lang.Object obj2) {
        this.f323092a = obj;
        this.f323093b = obj2;
    }

    public static m3.d a(java.lang.Object obj, java.lang.Object obj2) {
        return new m3.d(obj, obj2);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof m3.d)) {
            return false;
        }
        m3.d dVar = (m3.d) obj;
        return m3.c.a(dVar.f323092a, this.f323092a) && m3.c.a(dVar.f323093b, this.f323093b);
    }

    public int hashCode() {
        java.lang.Object obj = this.f323092a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.f323093b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public java.lang.String toString() {
        return "Pair{" + this.f323092a + " " + this.f323093b + "}";
    }
}
