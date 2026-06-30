package vd2;

/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f435744a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f435745b;

    public h1(java.lang.String username, java.lang.String noticeId) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        this.f435744a = username;
        this.f435745b = noticeId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd2.h1)) {
            return false;
        }
        vd2.h1 h1Var = (vd2.h1) obj;
        return kotlin.jvm.internal.o.b(this.f435744a, h1Var.f435744a) && kotlin.jvm.internal.o.b(this.f435745b, h1Var.f435745b);
    }

    public int hashCode() {
        return (this.f435744a.hashCode() * 31) + this.f435745b.hashCode();
    }

    public java.lang.String toString() {
        return "CacheKey(username=" + this.f435744a + ", noticeId=" + this.f435745b + ')';
    }
}
