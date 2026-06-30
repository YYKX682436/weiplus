package dv4;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f243997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f243998b;

    public a(java.lang.String str, int i17) {
        this.f243997a = str;
        this.f243998b = i17;
    }

    public abstract void a(java.util.List list);

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dv4.a)) {
            return false;
        }
        dv4.a aVar = (dv4.a) obj;
        java.lang.String str = aVar.f243997a;
        java.lang.String str2 = this.f243997a;
        return aVar.f243998b == this.f243998b && (str2 == str || (str2 != null && str2.equalsIgnoreCase(str)));
    }

    public int hashCode() {
        return super.hashCode();
    }
}
