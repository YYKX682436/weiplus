package so2;

/* loaded from: classes9.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f410423a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f410424b;

    public i5(java.lang.String lightUrl, java.lang.String darkUrl) {
        kotlin.jvm.internal.o.g(lightUrl, "lightUrl");
        kotlin.jvm.internal.o.g(darkUrl, "darkUrl");
        this.f410423a = lightUrl;
        this.f410424b = darkUrl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.i5)) {
            return false;
        }
        so2.i5 i5Var = (so2.i5) obj;
        return kotlin.jvm.internal.o.b(this.f410423a, i5Var.f410423a) && kotlin.jvm.internal.o.b(this.f410424b, i5Var.f410424b);
    }

    public int hashCode() {
        return (this.f410423a.hashCode() * 31) + this.f410424b.hashCode();
    }

    public java.lang.String toString() {
        return "PreviewIcon(lightUrl=" + this.f410423a + ", darkUrl=" + this.f410424b + ')';
    }
}
