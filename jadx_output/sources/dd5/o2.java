package dd5;

/* loaded from: classes8.dex */
public final class o2 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229237a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229238b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229239c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229240d;

    public o2(java.lang.CharSequence title, java.lang.CharSequence desc, java.lang.String coverUrl, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229237a = title;
        this.f229238b = desc;
        this.f229239c = coverUrl;
        this.f229240d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229237a, this.f229238b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.o2)) {
            return false;
        }
        dd5.o2 o2Var = (dd5.o2) obj;
        return kotlin.jvm.internal.o.b(this.f229237a, o2Var.f229237a) && kotlin.jvm.internal.o.b(this.f229238b, o2Var.f229238b) && kotlin.jvm.internal.o.b(this.f229239c, o2Var.f229239c) && kotlin.jvm.internal.o.b(this.f229240d, o2Var.f229240d);
    }

    public int hashCode() {
        return (((((this.f229237a.hashCode() * 31) + this.f229238b.hashCode()) * 31) + this.f229239c.hashCode()) * 31) + this.f229240d.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(title=" + ((java.lang.Object) this.f229237a) + ", desc=" + ((java.lang.Object) this.f229238b) + ", coverUrl=" + this.f229239c + ", msgInfo=" + this.f229240d + ')';
    }
}
