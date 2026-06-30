package wc5;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final uc5.k0 f444645a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f444646b;

    public v0(uc5.k0 k0Var, java.util.List contents) {
        kotlin.jvm.internal.o.g(contents, "contents");
        this.f444645a = k0Var;
        this.f444646b = contents;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc5.v0)) {
            return false;
        }
        wc5.v0 v0Var = (wc5.v0) obj;
        return kotlin.jvm.internal.o.b(this.f444645a, v0Var.f444645a) && kotlin.jvm.internal.o.b(this.f444646b, v0Var.f444646b);
    }

    public int hashCode() {
        uc5.k0 k0Var = this.f444645a;
        return ((k0Var == null ? 0 : k0Var.hashCode()) * 31) + this.f444646b.hashCode();
    }

    public java.lang.String toString() {
        return "Section(timeline=" + this.f444645a + ", contents=" + this.f444646b + ')';
    }
}
