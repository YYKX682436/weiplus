package p05;

/* loaded from: classes14.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f350633a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f350634b;

    /* renamed from: c, reason: collision with root package name */
    public final int f350635c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f350636d;

    public o4(java.lang.String id6, java.lang.String driver, int i17, java.lang.String resourcePath) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(driver, "driver");
        kotlin.jvm.internal.o.g(resourcePath, "resourcePath");
        this.f350633a = id6;
        this.f350634b = driver;
        this.f350635c = i17;
        this.f350636d = resourcePath;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.o4)) {
            return false;
        }
        p05.o4 o4Var = (p05.o4) obj;
        return kotlin.jvm.internal.o.b(this.f350633a, o4Var.f350633a) && kotlin.jvm.internal.o.b(this.f350634b, o4Var.f350634b) && this.f350635c == o4Var.f350635c && kotlin.jvm.internal.o.b(this.f350636d, o4Var.f350636d);
    }

    public int hashCode() {
        return (((((this.f350633a.hashCode() * 31) + this.f350634b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f350635c)) * 31) + this.f350636d.hashCode();
    }

    public java.lang.String toString() {
        return "XEffectConfigV2(id=" + this.f350633a + ", driver=" + this.f350634b + ", value=" + this.f350635c + ", resourcePath=" + this.f350636d + ')';
    }
}
