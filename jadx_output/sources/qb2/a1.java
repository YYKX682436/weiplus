package qb2;

/* loaded from: classes5.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f361160a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f361161b = true;

    public a1(int i17) {
        this.f361160a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb2.a1) && this.f361160a == ((qb2.a1) obj).f361160a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f361160a);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f361160a);
        sb6.append('@');
        sb6.append(this.f361161b);
        return sb6.toString();
    }
}
