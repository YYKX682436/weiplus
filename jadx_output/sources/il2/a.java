package il2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f292033a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f292034b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f292035c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f292036d;

    public a(int i17, java.lang.String verifyId, java.lang.String verifyUrl, yz5.l callback) {
        kotlin.jvm.internal.o.g(verifyId, "verifyId");
        kotlin.jvm.internal.o.g(verifyUrl, "verifyUrl");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f292033a = i17;
        this.f292034b = verifyId;
        this.f292035c = verifyUrl;
        this.f292036d = callback;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il2.a)) {
            return false;
        }
        il2.a aVar = (il2.a) obj;
        return this.f292033a == aVar.f292033a && kotlin.jvm.internal.o.b(this.f292034b, aVar.f292034b) && kotlin.jvm.internal.o.b(this.f292035c, aVar.f292035c) && kotlin.jvm.internal.o.b(this.f292036d, aVar.f292036d);
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f292033a) * 31) + this.f292034b.hashCode()) * 31) + this.f292035c.hashCode()) * 31) + this.f292036d.hashCode();
    }

    public java.lang.String toString() {
        return "VerifyData(verifyType=" + this.f292033a + ", verifyId=" + this.f292034b + ", verifyUrl=" + this.f292035c + ", callback=" + this.f292036d + ')';
    }
}
