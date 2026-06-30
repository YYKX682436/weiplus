package mn0;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f329785a;

    /* renamed from: b, reason: collision with root package name */
    public int f329786b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f329787c;

    /* renamed from: d, reason: collision with root package name */
    public int f329788d;

    public m0(int i17, int i18, java.lang.String errorUrl, int i19) {
        kotlin.jvm.internal.o.g(errorUrl, "errorUrl");
        this.f329785a = i17;
        this.f329786b = i18;
        this.f329787c = errorUrl;
        this.f329788d = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn0.m0)) {
            return false;
        }
        mn0.m0 m0Var = (mn0.m0) obj;
        return this.f329785a == m0Var.f329785a && this.f329786b == m0Var.f329786b && kotlin.jvm.internal.o.b(this.f329787c, m0Var.f329787c) && this.f329788d == m0Var.f329788d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f329785a) * 31) + java.lang.Integer.hashCode(this.f329786b)) * 31) + this.f329787c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f329788d);
    }

    public java.lang.String toString() {
        return "PlayerInfoEvent(eventCode=" + this.f329785a + ", httpCode=" + this.f329786b + ", errorUrl=" + this.f329787c + ", curQualityCfg=" + this.f329788d + ')';
    }
}
