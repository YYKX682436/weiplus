package l36;

/* loaded from: classes16.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f315647a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String[] f315648b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String[] f315649c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f315650d;

    public u(boolean z17) {
        this.f315647a = z17;
    }

    public l36.u a(java.lang.String... strArr) {
        if (!this.f315647a) {
            throw new java.lang.IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new java.lang.IllegalArgumentException("At least one cipher suite is required");
        }
        this.f315648b = (java.lang.String[]) strArr.clone();
        return this;
    }

    public l36.u b(l36.r... rVarArr) {
        if (!this.f315647a) {
            throw new java.lang.IllegalStateException("no cipher suites for cleartext connections");
        }
        java.lang.String[] strArr = new java.lang.String[rVarArr.length];
        for (int i17 = 0; i17 < rVarArr.length; i17++) {
            strArr[i17] = rVarArr[i17].f315627a;
        }
        a(strArr);
        return this;
    }

    public l36.u c(java.lang.String... strArr) {
        if (!this.f315647a) {
            throw new java.lang.IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new java.lang.IllegalArgumentException("At least one TLS version is required");
        }
        this.f315649c = (java.lang.String[]) strArr.clone();
        return this;
    }

    public l36.u d(l36.e1... e1VarArr) {
        if (!this.f315647a) {
            throw new java.lang.IllegalStateException("no TLS versions for cleartext connections");
        }
        java.lang.String[] strArr = new java.lang.String[e1VarArr.length];
        for (int i17 = 0; i17 < e1VarArr.length; i17++) {
            strArr[i17] = e1VarArr[i17].f315486d;
        }
        c(strArr);
        return this;
    }

    public u(l36.v vVar) {
        this.f315647a = vVar.f315660a;
        this.f315648b = vVar.f315662c;
        this.f315649c = vVar.f315663d;
        this.f315650d = vVar.f315661b;
    }
}
