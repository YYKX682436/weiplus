package rm2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f397429a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f397430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f397431c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f397432d;

    public a(java.lang.String title, java.lang.String desc, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f397429a = title;
        this.f397430b = desc;
        this.f397431c = i17;
        this.f397432d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm2.a)) {
            return false;
        }
        rm2.a aVar = (rm2.a) obj;
        return kotlin.jvm.internal.o.b(this.f397429a, aVar.f397429a) && kotlin.jvm.internal.o.b(this.f397430b, aVar.f397430b) && this.f397431c == aVar.f397431c && this.f397432d == aVar.f397432d;
    }

    public int hashCode() {
        return (((((this.f397429a.hashCode() * 31) + this.f397430b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f397431c)) * 31) + java.lang.Boolean.hashCode(this.f397432d);
    }

    public java.lang.String toString() {
        return "title:" + this.f397429a + "-:desc:" + this.f397430b + "-type:" + this.f397431c + "-choose:" + this.f397432d;
    }
}
