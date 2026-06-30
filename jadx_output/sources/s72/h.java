package s72;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f404046a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f404047b;

    /* renamed from: c, reason: collision with root package name */
    public int f404048c;

    /* renamed from: d, reason: collision with root package name */
    public int f404049d;

    public h(int i17, java.lang.String xmlContent, int i18, int i19) {
        kotlin.jvm.internal.o.g(xmlContent, "xmlContent");
        this.f404046a = i17;
        this.f404047b = xmlContent;
        this.f404048c = i18;
        this.f404049d = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s72.h)) {
            return false;
        }
        s72.h hVar = (s72.h) obj;
        return this.f404046a == hVar.f404046a && kotlin.jvm.internal.o.b(this.f404047b, hVar.f404047b) && this.f404048c == hVar.f404048c && this.f404049d == hVar.f404049d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f404046a) * 31) + this.f404047b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f404048c)) * 31) + java.lang.Integer.hashCode(this.f404049d);
    }

    public java.lang.String toString() {
        return "ErrorInfo(count=" + this.f404046a + ", xmlContent=" + this.f404047b + ", errorType=" + this.f404048c + ", errorCode=" + this.f404049d + ')';
    }
}
