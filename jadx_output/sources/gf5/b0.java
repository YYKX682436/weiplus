package gf5;

/* loaded from: classes11.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.z f271380a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f271381b;

    public b0(gf5.z tokenType, java.util.Set words) {
        kotlin.jvm.internal.o.g(tokenType, "tokenType");
        kotlin.jvm.internal.o.g(words, "words");
        this.f271380a = tokenType;
        this.f271381b = words;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.b0)) {
            return false;
        }
        gf5.b0 b0Var = (gf5.b0) obj;
        return this.f271380a == b0Var.f271380a && kotlin.jvm.internal.o.b(this.f271381b, b0Var.f271381b);
    }

    public int hashCode() {
        return (this.f271380a.hashCode() * 31) + this.f271381b.hashCode();
    }

    public java.lang.String toString() {
        return "WordTokenRule(tokenType=" + this.f271380a + ", words=" + this.f271381b + ')';
    }
}
