package te5;

/* loaded from: classes9.dex */
public final class a1 extends te5.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f418609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String url) {
        super(null);
        kotlin.jvm.internal.o.g(url, "url");
        this.f418609a = url;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te5.a1) && kotlin.jvm.internal.o.b(this.f418609a, ((te5.a1) obj).f418609a);
    }

    public int hashCode() {
        return this.f418609a.hashCode();
    }

    public java.lang.String toString() {
        return "Success(url=" + this.f418609a + ')';
    }
}
