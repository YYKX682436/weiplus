package dd5;

/* loaded from: classes8.dex */
public final class v2 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229316a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229317b;

    /* renamed from: c, reason: collision with root package name */
    public final int f229318c;

    /* renamed from: d, reason: collision with root package name */
    public final int f229319d;

    /* renamed from: e, reason: collision with root package name */
    public final long f229320e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f229321f;

    public v2(java.lang.CharSequence title, java.lang.CharSequence desc, int i17, int i18, long j17, java.lang.String talker) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f229316a = title;
        this.f229317b = desc;
        this.f229318c = i17;
        this.f229319d = i18;
        this.f229320e = j17;
        this.f229321f = talker;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229316a, this.f229317b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.v2)) {
            return false;
        }
        dd5.v2 v2Var = (dd5.v2) obj;
        return kotlin.jvm.internal.o.b(this.f229316a, v2Var.f229316a) && kotlin.jvm.internal.o.b(this.f229317b, v2Var.f229317b) && this.f229318c == v2Var.f229318c && this.f229319d == v2Var.f229319d && this.f229320e == v2Var.f229320e && kotlin.jvm.internal.o.b(this.f229321f, v2Var.f229321f);
    }

    public int hashCode() {
        return (((((((((this.f229316a.hashCode() * 31) + this.f229317b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f229318c)) * 31) + java.lang.Integer.hashCode(this.f229319d)) * 31) + java.lang.Long.hashCode(this.f229320e)) * 31) + this.f229321f.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(title=" + ((java.lang.Object) this.f229316a) + ", desc=" + ((java.lang.Object) this.f229317b) + ", iconResId=" + this.f229318c + ", iconBgResId=" + this.f229319d + ", msgId=" + this.f229320e + ", talker=" + this.f229321f + ')';
    }
}
