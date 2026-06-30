package km2;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f309074a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309075b;

    public b0(int i17, java.lang.String content) {
        kotlin.jvm.internal.o.g(content, "content");
        this.f309074a = i17;
        this.f309075b = content;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.b0)) {
            return false;
        }
        km2.b0 b0Var = (km2.b0) obj;
        return this.f309074a == b0Var.f309074a && kotlin.jvm.internal.o.b(this.f309075b, b0Var.f309075b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f309074a) * 31) + this.f309075b.hashCode();
    }

    public java.lang.String toString() {
        return "PayMicData(totalWecoin=" + this.f309074a + ", content=" + this.f309075b + ')';
    }
}
