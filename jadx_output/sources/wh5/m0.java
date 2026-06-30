package wh5;

/* loaded from: classes3.dex */
public final class m0 implements vh5.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f446078a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f446079b;

    public m0(boolean z17, java.lang.String str, java.lang.String str2) {
        this.f446078a = z17;
        this.f446079b = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh5.m0)) {
            return false;
        }
        wh5.m0 m0Var = (wh5.m0) obj;
        return this.f446078a == m0Var.f446078a && kotlin.jvm.internal.o.b("", "") && kotlin.jvm.internal.o.b(this.f446079b, m0Var.f446079b);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f446078a) * 31) + 0) * 31;
        java.lang.String str = this.f446079b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TranslateData(isTranslated=" + this.f446078a + ", translatedRawPath=, translatedRetPath=" + this.f446079b + ')';
    }
}
