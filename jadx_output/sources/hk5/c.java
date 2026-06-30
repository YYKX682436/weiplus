package hk5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f281999a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f282000b;

    public c(java.lang.String appId, java.lang.String str) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f281999a = appId;
        this.f282000b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk5.c)) {
            return false;
        }
        hk5.c cVar = (hk5.c) obj;
        return kotlin.jvm.internal.o.b(this.f281999a, cVar.f281999a) && kotlin.jvm.internal.o.b(this.f282000b, cVar.f282000b);
    }

    public int hashCode() {
        int hashCode = this.f281999a.hashCode() * 31;
        java.lang.String str = this.f282000b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "YuanbaoShareInfo(appId=" + this.f281999a + ", pagePath=" + this.f282000b + ')';
    }
}
