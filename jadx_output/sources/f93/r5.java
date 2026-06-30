package f93;

/* loaded from: classes3.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f260450a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f260451b;

    /* renamed from: c, reason: collision with root package name */
    public final int f260452c;

    public r5(java.lang.String id6, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(name, "name");
        this.f260450a = id6;
        this.f260451b = name;
        this.f260452c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f93.r5)) {
            return false;
        }
        f93.r5 r5Var = (f93.r5) obj;
        return kotlin.jvm.internal.o.b(this.f260450a, r5Var.f260450a) && kotlin.jvm.internal.o.b(this.f260451b, r5Var.f260451b) && this.f260452c == r5Var.f260452c;
    }

    public int hashCode() {
        return (((this.f260450a.hashCode() * 31) + this.f260451b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f260452c);
    }

    public java.lang.String toString() {
        return "LabelInfo(id=" + this.f260450a + ", name=" + this.f260451b + ", count=" + this.f260452c + ')';
    }
}
