package jh2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final jh2.e f299807a;

    /* renamed from: b, reason: collision with root package name */
    public final int f299808b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f299809c;

    /* renamed from: d, reason: collision with root package name */
    public final int f299810d;

    /* renamed from: e, reason: collision with root package name */
    public final int f299811e;

    public d(jh2.e errorType, int i17, java.lang.String errorMsg, int i18, int i19) {
        kotlin.jvm.internal.o.g(errorType, "errorType");
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        this.f299807a = errorType;
        this.f299808b = i17;
        this.f299809c = errorMsg;
        this.f299810d = i18;
        this.f299811e = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh2.d)) {
            return false;
        }
        jh2.d dVar = (jh2.d) obj;
        return this.f299807a == dVar.f299807a && this.f299808b == dVar.f299808b && kotlin.jvm.internal.o.b(this.f299809c, dVar.f299809c) && this.f299810d == dVar.f299810d && this.f299811e == dVar.f299811e;
    }

    public int hashCode() {
        return (((((((this.f299807a.hashCode() * 31) + java.lang.Integer.hashCode(this.f299808b)) * 31) + this.f299809c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f299810d)) * 31) + java.lang.Integer.hashCode(this.f299811e);
    }

    public java.lang.String toString() {
        return "SingErrorParams(errorType=" + this.f299807a + ", errorCode=" + this.f299808b + ", errorMsg=" + this.f299809c + ", sampleRate=" + this.f299810d + ", channel=" + this.f299811e + ')';
    }
}
