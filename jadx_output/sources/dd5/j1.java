package dd5;

/* loaded from: classes8.dex */
public final class j1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229181a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229182b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229183c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229184d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229185e;

    public j1(java.lang.CharSequence title, java.lang.CharSequence source, java.lang.String coverUrl, java.lang.String talker, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229181a = title;
        this.f229182b = source;
        this.f229183c = coverUrl;
        this.f229184d = talker;
        this.f229185e = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229181a, this.f229182b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.j1)) {
            return false;
        }
        dd5.j1 j1Var = (dd5.j1) obj;
        return kotlin.jvm.internal.o.b(this.f229181a, j1Var.f229181a) && kotlin.jvm.internal.o.b(this.f229182b, j1Var.f229182b) && kotlin.jvm.internal.o.b(this.f229183c, j1Var.f229183c) && kotlin.jvm.internal.o.b(this.f229184d, j1Var.f229184d) && kotlin.jvm.internal.o.b(this.f229185e, j1Var.f229185e);
    }

    public int hashCode() {
        return (((((((this.f229181a.hashCode() * 31) + this.f229182b.hashCode()) * 31) + this.f229183c.hashCode()) * 31) + this.f229184d.hashCode()) * 31) + this.f229185e.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(title=" + ((java.lang.Object) this.f229181a) + ", source=" + ((java.lang.Object) this.f229182b) + ", coverUrl=" + this.f229183c + ", talker=" + this.f229184d + ", msgInfo=" + this.f229185e + ')';
    }
}
