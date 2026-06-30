package w82;

/* loaded from: classes11.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f443930a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f443931b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f443932c;

    public t0(java.util.ArrayList types, java.util.ArrayList tags, java.util.ArrayList keys) {
        kotlin.jvm.internal.o.g(types, "types");
        kotlin.jvm.internal.o.g(tags, "tags");
        kotlin.jvm.internal.o.g(keys, "keys");
        this.f443930a = types;
        this.f443931b = tags;
        this.f443932c = keys;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w82.t0)) {
            return false;
        }
        w82.t0 t0Var = (w82.t0) obj;
        return kotlin.jvm.internal.o.b(this.f443930a, t0Var.f443930a) && kotlin.jvm.internal.o.b(this.f443931b, t0Var.f443931b) && kotlin.jvm.internal.o.b(this.f443932c, t0Var.f443932c);
    }

    public int hashCode() {
        return (((this.f443930a.hashCode() * 31) + this.f443931b.hashCode()) * 31) + this.f443932c.hashCode();
    }

    public java.lang.String toString() {
        return "SearchInfo(types=" + this.f443930a + ", tags=" + this.f443931b + ", keys=" + this.f443932c + ')';
    }
}
