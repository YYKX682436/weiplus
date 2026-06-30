package gf5;

/* loaded from: classes11.dex */
public final class u implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f271454a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f271455b;

    /* renamed from: c, reason: collision with root package name */
    public final int f271456c;

    public u(java.util.Set operators, gf5.z tokenType, int i17, int i18, kotlin.jvm.internal.i iVar) {
        tokenType = (i18 & 2) != 0 ? gf5.z.f271476m : tokenType;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(operators, "operators");
        kotlin.jvm.internal.o.g(tokenType, "tokenType");
        this.f271454a = operators;
        this.f271455b = tokenType;
        this.f271456c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.u)) {
            return false;
        }
        gf5.u uVar = (gf5.u) obj;
        return kotlin.jvm.internal.o.b(this.f271454a, uVar.f271454a) && this.f271455b == uVar.f271455b && this.f271456c == uVar.f271456c;
    }

    public int hashCode() {
        return (((this.f271454a.hashCode() * 31) + this.f271455b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f271456c);
    }

    public java.lang.String toString() {
        return "OperatorSetSyntaxRule(operators=" + this.f271454a + ", tokenType=" + this.f271455b + ", priority=" + this.f271456c + ')';
    }
}
