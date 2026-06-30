package dd5;

/* loaded from: classes8.dex */
public final class g2 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229154a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229155b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.zs4 f229156c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229157d;

    public g2(java.lang.CharSequence title, java.lang.CharSequence desc, r45.zs4 musicViewData, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(musicViewData, "musicViewData");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229154a = title;
        this.f229155b = desc;
        this.f229156c = musicViewData;
        this.f229157d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229154a, this.f229155b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.g2)) {
            return false;
        }
        dd5.g2 g2Var = (dd5.g2) obj;
        return kotlin.jvm.internal.o.b(this.f229154a, g2Var.f229154a) && kotlin.jvm.internal.o.b(this.f229155b, g2Var.f229155b) && kotlin.jvm.internal.o.b(this.f229156c, g2Var.f229156c) && kotlin.jvm.internal.o.b(this.f229157d, g2Var.f229157d);
    }

    public int hashCode() {
        return (((((this.f229154a.hashCode() * 31) + this.f229155b.hashCode()) * 31) + this.f229156c.hashCode()) * 31) + this.f229157d.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(title=" + ((java.lang.Object) this.f229154a) + ", desc=" + ((java.lang.Object) this.f229155b) + ", musicViewData=" + this.f229156c + ", msgInfo=" + this.f229157d + ')';
    }
}
