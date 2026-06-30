package dd5;

/* loaded from: classes8.dex */
public final class u implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229295a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229296b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229297c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229298d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229299e;

    public u(java.lang.CharSequence title, java.lang.CharSequence source, java.lang.String avatarUrl, java.lang.String talker, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229295a = title;
        this.f229296b = source;
        this.f229297c = avatarUrl;
        this.f229298d = talker;
        this.f229299e = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229295a, this.f229296b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.u)) {
            return false;
        }
        dd5.u uVar = (dd5.u) obj;
        return kotlin.jvm.internal.o.b(this.f229295a, uVar.f229295a) && kotlin.jvm.internal.o.b(this.f229296b, uVar.f229296b) && kotlin.jvm.internal.o.b(this.f229297c, uVar.f229297c) && kotlin.jvm.internal.o.b(this.f229298d, uVar.f229298d) && kotlin.jvm.internal.o.b(this.f229299e, uVar.f229299e);
    }

    public int hashCode() {
        return (((((((this.f229295a.hashCode() * 31) + this.f229296b.hashCode()) * 31) + this.f229297c.hashCode()) * 31) + this.f229298d.hashCode()) * 31) + this.f229299e.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(title=" + ((java.lang.Object) this.f229295a) + ", source=" + ((java.lang.Object) this.f229296b) + ", avatarUrl=" + this.f229297c + ", talker=" + this.f229298d + ", msgInfo=" + this.f229299e + ')';
    }
}
