package ni3;

/* loaded from: classes10.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final ni3.p0 f337617a;

    /* renamed from: b, reason: collision with root package name */
    public int f337618b;

    public j1(ni3.p0 feedLife, int i17) {
        kotlin.jvm.internal.o.g(feedLife, "feedLife");
        this.f337617a = feedLife;
        this.f337618b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.j1)) {
            return false;
        }
        ni3.j1 j1Var = (ni3.j1) obj;
        return kotlin.jvm.internal.o.b(this.f337617a, j1Var.f337617a) && this.f337618b == j1Var.f337618b;
    }

    public int hashCode() {
        return (this.f337617a.hashCode() * 31) + java.lang.Integer.hashCode(this.f337618b);
    }

    public java.lang.String toString() {
        return this.f337617a.f337671b + " - stage:play - " + this.f337618b;
    }
}
