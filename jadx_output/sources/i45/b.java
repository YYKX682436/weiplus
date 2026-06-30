package i45;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f288391a;

    /* renamed from: b, reason: collision with root package name */
    public final int f288392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f288393c;

    /* renamed from: d, reason: collision with root package name */
    public final int f288394d;

    /* renamed from: e, reason: collision with root package name */
    public final int f288395e;

    public b(java.lang.String content, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(content, "content");
        this.f288391a = content;
        this.f288392b = i17;
        this.f288393c = i18;
        this.f288394d = i19;
        this.f288395e = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i45.b)) {
            return false;
        }
        i45.b bVar = (i45.b) obj;
        return kotlin.jvm.internal.o.b(this.f288391a, bVar.f288391a) && this.f288392b == bVar.f288392b && this.f288393c == bVar.f288393c && this.f288394d == bVar.f288394d && this.f288395e == bVar.f288395e;
    }

    public int hashCode() {
        return (((((((this.f288391a.hashCode() * 31) + java.lang.Integer.hashCode(this.f288392b)) * 31) + java.lang.Integer.hashCode(this.f288393c)) * 31) + java.lang.Integer.hashCode(this.f288394d)) * 31) + java.lang.Integer.hashCode(this.f288395e);
    }

    public java.lang.String toString() {
        return "WeTypeFullTextGuide(content=" + this.f288391a + ", interval=" + this.f288392b + ", maxTime=" + this.f288393c + ", aliveTime=" + this.f288394d + ", exitCondition=" + this.f288395e + ')';
    }
}
