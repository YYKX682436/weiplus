package pi;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f354492a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f354493b;

    public a(int i17, java.lang.String str) {
        this.f354492a = i17;
        this.f354493b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pi.a.class != obj.getClass()) {
            return false;
        }
        pi.a aVar = (pi.a) obj;
        return this.f354492a == aVar.f354492a && java.util.Objects.equals(this.f354493b, aVar.f354493b);
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f354492a), this.f354493b);
    }

    public java.lang.String toString() {
        return this.f354492a + " : " + this.f354493b;
    }
}
