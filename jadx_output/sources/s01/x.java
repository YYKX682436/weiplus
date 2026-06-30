package s01;

/* loaded from: classes10.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f401936a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401937b;

    public x(java.lang.String str, java.lang.String str2) {
        this.f401936a = str;
        this.f401937b = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj.getClass() != s01.x.class) {
            return false;
        }
        s01.x xVar = (s01.x) obj;
        java.lang.String str = xVar.f401936a;
        java.lang.String str2 = this.f401936a;
        if (!(str2 == null && str == null) && (str2 == null || !str2.equals(str))) {
            return false;
        }
        java.lang.String str3 = xVar.f401937b;
        java.lang.String str4 = this.f401937b;
        return (str4 == null && str3 == null) || (str4 != null && str4.equals(str3));
    }

    public int hashCode() {
        return this.f401936a.hashCode() + this.f401937b.hashCode();
    }
}
