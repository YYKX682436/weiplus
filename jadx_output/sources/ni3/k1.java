package ni3;

/* loaded from: classes10.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final ni3.l1 f337621a;

    /* renamed from: b, reason: collision with root package name */
    public final ni3.p0 f337622b;

    /* renamed from: c, reason: collision with root package name */
    public int f337623c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f337624d;

    public k1(ni3.l1 stage, ni3.p0 feedLife, int i17, java.lang.String reason) {
        kotlin.jvm.internal.o.g(stage, "stage");
        kotlin.jvm.internal.o.g(feedLife, "feedLife");
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f337621a = stage;
        this.f337622b = feedLife;
        this.f337623c = i17;
        this.f337624d = reason;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.k1)) {
            return false;
        }
        ni3.k1 k1Var = (ni3.k1) obj;
        return this.f337621a == k1Var.f337621a && kotlin.jvm.internal.o.b(this.f337622b, k1Var.f337622b) && this.f337623c == k1Var.f337623c && kotlin.jvm.internal.o.b(this.f337624d, k1Var.f337624d);
    }

    public int hashCode() {
        return (((((this.f337621a.hashCode() * 31) + this.f337622b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f337623c)) * 31) + this.f337624d.hashCode();
    }

    public java.lang.String toString() {
        return this.f337622b.f337671b + " - stage:" + this.f337621a + " - " + this.f337623c + " - " + this.f337624d;
    }
}
