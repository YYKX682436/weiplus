package ir1;

/* loaded from: classes3.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f294008a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f294009b;

    public j2(int i17, java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f294008a = i17;
        this.f294009b = name;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir1.j2)) {
            return false;
        }
        ir1.j2 j2Var = (ir1.j2) obj;
        return this.f294008a == j2Var.f294008a && kotlin.jvm.internal.o.b(this.f294009b, j2Var.f294009b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f294008a) * 31) + this.f294009b.hashCode();
    }

    public java.lang.String toString() {
        return "PrivateMsgScope(type=" + this.f294008a + ", name=" + this.f294009b + ')';
    }
}
