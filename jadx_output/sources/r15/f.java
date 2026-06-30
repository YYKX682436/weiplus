package r15;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f368644a;

    /* renamed from: b, reason: collision with root package name */
    public final int f368645b;

    public f(int i17, int i18) {
        this.f368644a = i17;
        this.f368645b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r15.f)) {
            return false;
        }
        r15.f fVar = (r15.f) obj;
        return this.f368644a == fVar.f368644a && this.f368645b == fVar.f368645b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f368644a) * 31) + java.lang.Integer.hashCode(this.f368645b);
    }

    public java.lang.String toString() {
        return "LocateResult(startIndex=" + this.f368644a + ", endIndex=" + this.f368645b + ')';
    }
}
