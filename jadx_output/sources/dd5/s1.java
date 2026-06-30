package dd5;

/* loaded from: classes8.dex */
public final class s1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229283a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f229284b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f229285c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229286d;

    public s1(java.lang.CharSequence nickname, java.lang.String username, java.lang.CharSequence desc, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229283a = nickname;
        this.f229284b = username;
        this.f229285c = desc;
        this.f229286d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229283a, this.f229285c);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.s1)) {
            return false;
        }
        dd5.s1 s1Var = (dd5.s1) obj;
        return kotlin.jvm.internal.o.b(this.f229283a, s1Var.f229283a) && kotlin.jvm.internal.o.b(this.f229284b, s1Var.f229284b) && kotlin.jvm.internal.o.b(this.f229285c, s1Var.f229285c) && kotlin.jvm.internal.o.b(this.f229286d, s1Var.f229286d);
    }

    public int hashCode() {
        return (((((this.f229283a.hashCode() * 31) + this.f229284b.hashCode()) * 31) + this.f229285c.hashCode()) * 31) + this.f229286d.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(nickname=" + ((java.lang.Object) this.f229283a) + ", username=" + this.f229284b + ", desc=" + ((java.lang.Object) this.f229285c) + ", msgInfo=" + this.f229286d + ')';
    }
}
