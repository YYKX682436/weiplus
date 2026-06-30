package oy2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f350001a;

    public s(java.lang.String webUrl) {
        kotlin.jvm.internal.o.g(webUrl, "webUrl");
        this.f350001a = webUrl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy2.s) && kotlin.jvm.internal.o.b(this.f350001a, ((oy2.s) obj).f350001a);
    }

    public int hashCode() {
        return this.f350001a.hashCode();
    }

    public java.lang.String toString() {
        return "DebugInfo(webUrl=" + this.f350001a + ')';
    }
}
