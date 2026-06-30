package sp0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f410941a;

    public a(java.lang.String apiName) {
        kotlin.jvm.internal.o.g(apiName, "apiName");
        this.f410941a = apiName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sp0.a) && kotlin.jvm.internal.o.b(this.f410941a, ((sp0.a) obj).f410941a);
    }

    public int hashCode() {
        return this.f410941a.hashCode();
    }

    public java.lang.String toString() {
        return "FlutterCoverViewAttribute(apiName=" + this.f410941a + ')';
    }
}
