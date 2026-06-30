package w33;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f442715a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f442716b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f442717c;

    public e(java.lang.String id6, java.lang.String nickName, java.lang.String avatar) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(avatar, "avatar");
        this.f442715a = id6;
        this.f442716b = nickName;
        this.f442717c = avatar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w33.e)) {
            return false;
        }
        w33.e eVar = (w33.e) obj;
        return kotlin.jvm.internal.o.b(this.f442715a, eVar.f442715a) && kotlin.jvm.internal.o.b(this.f442716b, eVar.f442716b) && kotlin.jvm.internal.o.b(this.f442717c, eVar.f442717c);
    }

    public int hashCode() {
        return (((this.f442715a.hashCode() * 31) + this.f442716b.hashCode()) * 31) + this.f442717c.hashCode();
    }

    public java.lang.String toString() {
        return "SimpleUserInfo(id=" + this.f442715a + ", nickName=" + this.f442716b + ", avatar=" + this.f442717c + ')';
    }
}
