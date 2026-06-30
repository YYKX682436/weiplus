package h12;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f278095a;

    /* renamed from: b, reason: collision with root package name */
    public final int f278096b;

    /* renamed from: c, reason: collision with root package name */
    public final h12.l f278097c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f278098d;

    public k(int i17, int i18, h12.l type, java.lang.String content) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(content, "content");
        this.f278095a = i17;
        this.f278096b = i18;
        this.f278097c = type;
        this.f278098d = content;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h12.k)) {
            return false;
        }
        h12.k kVar = (h12.k) obj;
        return this.f278095a == kVar.f278095a && this.f278096b == kVar.f278096b && this.f278097c == kVar.f278097c && kotlin.jvm.internal.o.b(this.f278098d, kVar.f278098d);
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f278095a) * 31) + java.lang.Integer.hashCode(this.f278096b)) * 31) + this.f278097c.hashCode()) * 31) + this.f278098d.hashCode();
    }

    public java.lang.String toString() {
        return "Clip(start=" + this.f278095a + ", end=" + this.f278096b + ", type=" + this.f278097c + ", content=" + this.f278098d + ')';
    }
}
