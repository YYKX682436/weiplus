package x52;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f452116a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f452117b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f452118c;

    public h(java.lang.String str, java.lang.String str2, java.util.List entryPageNames) {
        kotlin.jvm.internal.o.g(entryPageNames, "entryPageNames");
        this.f452116a = str;
        this.f452117b = str2;
        this.f452118c = entryPageNames;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x52.h)) {
            return false;
        }
        x52.h hVar = (x52.h) obj;
        return kotlin.jvm.internal.o.b(this.f452116a, hVar.f452116a) && kotlin.jvm.internal.o.b(this.f452117b, hVar.f452117b) && kotlin.jvm.internal.o.b(this.f452118c, hVar.f452118c);
    }

    public int hashCode() {
        java.lang.String str = this.f452116a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f452117b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f452118c.hashCode();
    }

    public java.lang.String toString() {
        return "SessionKEntry(sessionId=" + this.f452116a + ", fromPageName=" + this.f452117b + ", entryPageNames=" + this.f452118c + ')';
    }
}
