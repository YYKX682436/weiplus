package ld;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f318044a;

    public a(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f318044a = appId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld.a) && kotlin.jvm.internal.o.b(this.f318044a, ((ld.a) obj).f318044a);
    }

    public int hashCode() {
        return this.f318044a.hashCode();
    }

    public java.lang.String toString() {
        return "LiteAppCrashReportData(appId=" + this.f318044a + ')';
    }
}
