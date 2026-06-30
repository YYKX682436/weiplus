package zl2;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f473904a;

    /* renamed from: b, reason: collision with root package name */
    public final int f473905b;

    /* renamed from: c, reason: collision with root package name */
    public final int f473906c;

    public o(int i17, int i18, int i19) {
        this.f473904a = i17;
        this.f473905b = i18;
        this.f473906c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2.o)) {
            return false;
        }
        zl2.o oVar = (zl2.o) obj;
        return this.f473904a == oVar.f473904a && this.f473905b == oVar.f473905b && this.f473906c == oVar.f473906c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f473904a) * 31) + java.lang.Integer.hashCode(this.f473905b)) * 31) + java.lang.Integer.hashCode(this.f473906c);
    }

    public java.lang.String toString() {
        return "LpHeight(source=" + this.f473904a + ", sourceH=" + this.f473905b + ", destH=" + this.f473906c + ')';
    }
}
