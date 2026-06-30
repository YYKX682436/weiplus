package x1;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources.Theme f451345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f451346b;

    public d(android.content.res.Resources.Theme theme, int i17) {
        kotlin.jvm.internal.o.g(theme, "theme");
        this.f451345a = theme;
        this.f451346b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1.d)) {
            return false;
        }
        x1.d dVar = (x1.d) obj;
        return kotlin.jvm.internal.o.b(this.f451345a, dVar.f451345a) && this.f451346b == dVar.f451346b;
    }

    public int hashCode() {
        return (this.f451345a.hashCode() * 31) + java.lang.Integer.hashCode(this.f451346b);
    }

    public java.lang.String toString() {
        return "Key(theme=" + this.f451345a + ", id=" + this.f451346b + ')';
    }
}
