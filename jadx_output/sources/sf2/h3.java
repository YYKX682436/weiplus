package sf2;

/* loaded from: classes5.dex */
public final class h3 extends sf2.i3 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.rd2 f407159a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(r45.rd2 response) {
        super(null);
        kotlin.jvm.internal.o.g(response, "response");
        this.f407159a = response;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf2.h3) && kotlin.jvm.internal.o.b(this.f407159a, ((sf2.h3) obj).f407159a);
    }

    public int hashCode() {
        return this.f407159a.hashCode();
    }

    public java.lang.String toString() {
        return "Success(response=" + this.f407159a + ')';
    }
}
