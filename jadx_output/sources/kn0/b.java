package kn0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f309497a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f309498b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f309499c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f309500d;

    public b(int i17, boolean z17, java.lang.String decryptString, boolean z18) {
        kotlin.jvm.internal.o.g(decryptString, "decryptString");
        this.f309497a = i17;
        this.f309498b = z17;
        this.f309499c = decryptString;
        this.f309500d = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.b)) {
            return false;
        }
        kn0.b bVar = (kn0.b) obj;
        return this.f309497a == bVar.f309497a && this.f309498b == bVar.f309498b && kotlin.jvm.internal.o.b(this.f309499c, bVar.f309499c) && this.f309500d == bVar.f309500d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f309497a) * 31) + java.lang.Boolean.hashCode(this.f309498b)) * 31) + this.f309499c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f309500d);
    }

    public java.lang.String toString() {
        return "key:" + this.f309497a + ",haveDecrypt:" + this.f309498b + ",decryptString:" + this.f309499c + ",havePlay:" + this.f309500d;
    }
}
