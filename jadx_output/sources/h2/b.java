package h2;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final h2.e f278257a;

    public b(h2.e platformLocale) {
        kotlin.jvm.internal.o.g(platformLocale, "platformLocale");
        this.f278257a = platformLocale;
    }

    public final java.lang.String a() {
        java.lang.String languageTag = ((h2.a) this.f278257a).f278256a.toLanguageTag();
        kotlin.jvm.internal.o.f(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof h2.b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return kotlin.jvm.internal.o.b(a(), ((h2.b) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public java.lang.String toString() {
        return a();
    }
}
