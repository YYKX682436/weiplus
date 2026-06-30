package ko0;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final qs5.q f309897a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309898b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f309899c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f309900d;

    public q(qs5.q protocol, java.lang.String str, java.lang.String str2, java.lang.String transcodeTemplate) {
        kotlin.jvm.internal.o.g(protocol, "protocol");
        kotlin.jvm.internal.o.g(transcodeTemplate, "transcodeTemplate");
        this.f309897a = protocol;
        this.f309898b = str;
        this.f309899c = str2;
        this.f309900d = transcodeTemplate;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko0.q)) {
            return false;
        }
        ko0.q qVar = (ko0.q) obj;
        return this.f309897a == qVar.f309897a && kotlin.jvm.internal.o.b(this.f309898b, qVar.f309898b) && kotlin.jvm.internal.o.b(this.f309899c, qVar.f309899c) && kotlin.jvm.internal.o.b(this.f309900d, qVar.f309900d);
    }

    public int hashCode() {
        int hashCode = this.f309897a.hashCode() * 31;
        java.lang.String str = this.f309898b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f309899c;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f309900d.hashCode();
    }

    public java.lang.String toString() {
        return "StreamUrlInfo(protocol=" + this.f309897a + ", originalStreamId=" + this.f309898b + ", watchStreamId=" + this.f309899c + ", transcodeTemplate=" + this.f309900d + ')';
    }
}
