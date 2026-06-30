package zy;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f477284a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f477285b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f477286c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f477287d;

    /* renamed from: e, reason: collision with root package name */
    public final dn.h f477288e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f477289f;

    public a(boolean z17, java.lang.String second, java.lang.String unZipPath, java.lang.String errorMsg, dn.h hVar, java.lang.String url) {
        kotlin.jvm.internal.o.g(second, "second");
        kotlin.jvm.internal.o.g(unZipPath, "unZipPath");
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        kotlin.jvm.internal.o.g(url, "url");
        this.f477284a = z17;
        this.f477285b = second;
        this.f477286c = unZipPath;
        this.f477287d = errorMsg;
        this.f477288e = hVar;
        this.f477289f = url;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy.a)) {
            return false;
        }
        zy.a aVar = (zy.a) obj;
        return this.f477284a == aVar.f477284a && kotlin.jvm.internal.o.b(this.f477285b, aVar.f477285b) && kotlin.jvm.internal.o.b(this.f477286c, aVar.f477286c) && kotlin.jvm.internal.o.b(this.f477287d, aVar.f477287d) && kotlin.jvm.internal.o.b(this.f477288e, aVar.f477288e) && kotlin.jvm.internal.o.b(this.f477289f, aVar.f477289f);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Boolean.hashCode(this.f477284a) * 31) + this.f477285b.hashCode()) * 31) + this.f477286c.hashCode()) * 31) + this.f477287d.hashCode()) * 31;
        dn.h hVar = this.f477288e;
        return ((hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f477289f.hashCode();
    }

    public java.lang.String toString() {
        return "DownloadResultParams(success=" + this.f477284a + ", second=" + this.f477285b + ", unZipPath=" + this.f477286c + ", errorMsg=" + this.f477287d + ", result=" + this.f477288e + ", url=" + this.f477289f + ')';
    }
}
