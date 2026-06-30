package gf5;

/* loaded from: classes11.dex */
public final class a0 implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.z f271373a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f271374b;

    /* renamed from: c, reason: collision with root package name */
    public final int f271375c;

    public a0(gf5.z tokenType, java.util.Set words, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 4) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(tokenType, "tokenType");
        kotlin.jvm.internal.o.g(words, "words");
        this.f271373a = tokenType;
        this.f271374b = words;
        this.f271375c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.a0)) {
            return false;
        }
        gf5.a0 a0Var = (gf5.a0) obj;
        return this.f271373a == a0Var.f271373a && kotlin.jvm.internal.o.b(this.f271374b, a0Var.f271374b) && this.f271375c == a0Var.f271375c;
    }

    public int hashCode() {
        return (((this.f271373a.hashCode() * 31) + this.f271374b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f271375c);
    }

    public java.lang.String toString() {
        return "WordSetSyntaxRule(tokenType=" + this.f271373a + ", words=" + this.f271374b + ", priority=" + this.f271375c + ')';
    }
}
