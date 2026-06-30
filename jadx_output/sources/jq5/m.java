package jq5;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f301279a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f301280b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f301281c;

    public m(java.lang.String name, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f301279a = name;
        this.f301280b = str;
        this.f301281c = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq5.m)) {
            return false;
        }
        jq5.m mVar = (jq5.m) obj;
        return kotlin.jvm.internal.o.b(this.f301279a, mVar.f301279a) && kotlin.jvm.internal.o.b(this.f301280b, mVar.f301280b) && kotlin.jvm.internal.o.b(this.f301281c, mVar.f301281c);
    }

    public int hashCode() {
        int hashCode = this.f301279a.hashCode() * 31;
        java.lang.String str = this.f301280b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f301281c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "RequiredPermission(name=" + this.f301279a + ", reason=" + this.f301280b + ", requestGuide=" + this.f301281c + ')';
    }
}
