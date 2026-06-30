package g55;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f268995a;

    /* renamed from: b, reason: collision with root package name */
    public final int f268996b;

    /* renamed from: c, reason: collision with root package name */
    public int f268997c;

    public h(java.lang.String pageName, int i17) {
        kotlin.jvm.internal.o.g(pageName, "pageName");
        this.f268995a = pageName;
        this.f268996b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g55.h)) {
            return false;
        }
        g55.h hVar = (g55.h) obj;
        return kotlin.jvm.internal.o.b(this.f268995a, hVar.f268995a) && this.f268996b == hVar.f268996b;
    }

    public int hashCode() {
        return (this.f268995a.hashCode() * 31) + java.lang.Integer.hashCode(this.f268996b);
    }

    public java.lang.String toString() {
        return "PageDelayInfo(pageName=" + this.f268995a + ", pageHashCode=" + this.f268996b + ')';
    }
}
