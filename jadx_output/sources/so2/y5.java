package so2;

/* loaded from: classes5.dex */
public final class y5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f410726a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410727b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410728c;

    public y5(int i17, int i18, int i19) {
        this.f410726a = i17;
        this.f410727b = i18;
        this.f410728c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.y5)) {
            return false;
        }
        so2.y5 y5Var = (so2.y5) obj;
        return this.f410726a == y5Var.f410726a && this.f410727b == y5Var.f410727b && this.f410728c == y5Var.f410728c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f410726a) * 31) + java.lang.Integer.hashCode(this.f410727b)) * 31) + java.lang.Integer.hashCode(this.f410728c);
    }

    public java.lang.String toString() {
        return "DynamicIconInfo(iconName=" + this.f410726a + ", iconNodeStartPos=" + this.f410727b + ", iconNodeEndPos=" + this.f410728c + ')';
    }
}
