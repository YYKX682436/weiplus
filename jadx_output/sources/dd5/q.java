package dd5;

/* loaded from: classes8.dex */
public final class q implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229251a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f229252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f229253c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f229254d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229255e;

    public q(java.lang.CharSequence nickname, java.lang.String fromUsername, int i17, java.lang.CharSequence desc, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229251a = nickname;
        this.f229252b = fromUsername;
        this.f229253c = i17;
        this.f229254d = desc;
        this.f229255e = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229251a, this.f229254d);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.q)) {
            return false;
        }
        dd5.q qVar = (dd5.q) obj;
        return kotlin.jvm.internal.o.b(this.f229251a, qVar.f229251a) && kotlin.jvm.internal.o.b(this.f229252b, qVar.f229252b) && this.f229253c == qVar.f229253c && kotlin.jvm.internal.o.b(this.f229254d, qVar.f229254d) && kotlin.jvm.internal.o.b(this.f229255e, qVar.f229255e);
    }

    public int hashCode() {
        return (((((((this.f229251a.hashCode() * 31) + this.f229252b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f229253c)) * 31) + this.f229254d.hashCode()) * 31) + this.f229255e.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(nickname=" + ((java.lang.Object) this.f229251a) + ", fromUsername=" + this.f229252b + ", verifyFlag=" + this.f229253c + ", desc=" + ((java.lang.Object) this.f229254d) + ", msgInfo=" + this.f229255e + ')';
    }
}
