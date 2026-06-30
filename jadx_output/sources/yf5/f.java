package yf5;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final yf5.x f461866a;

    /* renamed from: b, reason: collision with root package name */
    public final xm3.i f461867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f461868c;

    public f(yf5.x convItem, xm3.i submitType, int i17) {
        kotlin.jvm.internal.o.g(convItem, "convItem");
        kotlin.jvm.internal.o.g(submitType, "submitType");
        this.f461866a = convItem;
        this.f461867b = submitType;
        this.f461868c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf5.f)) {
            return false;
        }
        yf5.f fVar = (yf5.f) obj;
        return kotlin.jvm.internal.o.b(this.f461866a, fVar.f461866a) && this.f461867b == fVar.f461867b && this.f461868c == fVar.f461868c;
    }

    public int hashCode() {
        return (((this.f461866a.hashCode() * 31) + this.f461867b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f461868c);
    }

    public java.lang.String toString() {
        return "UpdateEvent(convItem=" + this.f461866a + ", submitType=" + this.f461867b + ", version=" + this.f461868c + ')';
    }
}
