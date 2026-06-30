package uc5;

/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f426540a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f426541b;

    public p0(java.lang.String key, java.lang.String text) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(text, "text");
        this.f426540a = key;
        this.f426541b = text;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc5.p0)) {
            return false;
        }
        uc5.p0 p0Var = (uc5.p0) obj;
        return kotlin.jvm.internal.o.b(this.f426540a, p0Var.f426540a) && kotlin.jvm.internal.o.b(this.f426541b, p0Var.f426541b);
    }

    public int hashCode() {
        return (this.f426540a.hashCode() * 31) + this.f426541b.hashCode();
    }

    public java.lang.String toString() {
        return "Section(key=" + this.f426540a + ", text=" + this.f426541b + ')';
    }
}
