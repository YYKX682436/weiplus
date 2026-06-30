package nv2;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f340511a;

    /* renamed from: b, reason: collision with root package name */
    public final int f340512b;

    /* renamed from: c, reason: collision with root package name */
    public final int f340513c;

    public j1(long j17, int i17, int i18) {
        this.f340511a = j17;
        this.f340512b = i17;
        this.f340513c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        nv2.j1 j1Var = obj instanceof nv2.j1 ? (nv2.j1) obj : null;
        return j1Var != null && j1Var.f340511a == this.f340511a && j1Var.f340512b == this.f340512b && j1Var.f340513c == this.f340513c;
    }

    public int hashCode() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f340511a);
        sb6.append('_');
        sb6.append(this.f340512b);
        sb6.append('_');
        sb6.append(this.f340513c);
        return sb6.toString().hashCode();
    }
}
