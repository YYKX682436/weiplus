package dd5;

/* loaded from: classes8.dex */
public final class y0 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229340a;

    /* renamed from: b, reason: collision with root package name */
    public final mn2.h3 f229341b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229342c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f229343d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229344e;

    public y0(java.lang.CharSequence nickname, mn2.h3 avatarUrl, java.lang.String username, java.lang.CharSequence desc, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229340a = nickname;
        this.f229341b = avatarUrl;
        this.f229342c = username;
        this.f229343d = desc;
        this.f229344e = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229340a, this.f229343d);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.y0)) {
            return false;
        }
        dd5.y0 y0Var = (dd5.y0) obj;
        return kotlin.jvm.internal.o.b(this.f229340a, y0Var.f229340a) && kotlin.jvm.internal.o.b(this.f229341b, y0Var.f229341b) && kotlin.jvm.internal.o.b(this.f229342c, y0Var.f229342c) && kotlin.jvm.internal.o.b(this.f229343d, y0Var.f229343d) && kotlin.jvm.internal.o.b(this.f229344e, y0Var.f229344e);
    }

    public int hashCode() {
        return (((((((this.f229340a.hashCode() * 31) + this.f229341b.hashCode()) * 31) + this.f229342c.hashCode()) * 31) + this.f229343d.hashCode()) * 31) + this.f229344e.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(nickname=" + ((java.lang.Object) this.f229340a) + ", avatarUrl=" + this.f229341b + ", username=" + this.f229342c + ", desc=" + ((java.lang.Object) this.f229343d) + ", msgInfo=" + this.f229344e + ')';
    }
}
