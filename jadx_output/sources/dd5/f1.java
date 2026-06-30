package dd5;

/* loaded from: classes8.dex */
public final class f1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229135a;

    /* renamed from: b, reason: collision with root package name */
    public final mn2.h3 f229136b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229137c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f229138d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229139e;

    public f1(java.lang.CharSequence nickname, mn2.h3 avatarUrl, java.lang.String username, java.lang.CharSequence desc, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229135a = nickname;
        this.f229136b = avatarUrl;
        this.f229137c = username;
        this.f229138d = desc;
        this.f229139e = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229135a, this.f229138d);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.f1)) {
            return false;
        }
        dd5.f1 f1Var = (dd5.f1) obj;
        return kotlin.jvm.internal.o.b(this.f229135a, f1Var.f229135a) && kotlin.jvm.internal.o.b(this.f229136b, f1Var.f229136b) && kotlin.jvm.internal.o.b(this.f229137c, f1Var.f229137c) && kotlin.jvm.internal.o.b(this.f229138d, f1Var.f229138d) && kotlin.jvm.internal.o.b(this.f229139e, f1Var.f229139e);
    }

    public int hashCode() {
        return (((((((this.f229135a.hashCode() * 31) + this.f229136b.hashCode()) * 31) + this.f229137c.hashCode()) * 31) + this.f229138d.hashCode()) * 31) + this.f229139e.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(nickname=" + ((java.lang.Object) this.f229135a) + ", avatarUrl=" + this.f229136b + ", username=" + this.f229137c + ", desc=" + ((java.lang.Object) this.f229138d) + ", msgInfo=" + this.f229139e + ')';
    }
}
