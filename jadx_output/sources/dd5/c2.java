package dd5;

/* loaded from: classes8.dex */
public final class c2 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229104a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229105b;

    /* renamed from: c, reason: collision with root package name */
    public final o15.a f229106c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229107d;

    public c2(java.lang.CharSequence title, java.lang.CharSequence desc, o15.a location, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(location, "location");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229104a = title;
        this.f229105b = desc;
        this.f229106c = location;
        this.f229107d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229104a, this.f229105b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.c2)) {
            return false;
        }
        dd5.c2 c2Var = (dd5.c2) obj;
        return kotlin.jvm.internal.o.b(this.f229104a, c2Var.f229104a) && kotlin.jvm.internal.o.b(this.f229105b, c2Var.f229105b) && kotlin.jvm.internal.o.b(this.f229106c, c2Var.f229106c) && kotlin.jvm.internal.o.b(this.f229107d, c2Var.f229107d);
    }

    public int hashCode() {
        return (((((this.f229104a.hashCode() * 31) + this.f229105b.hashCode()) * 31) + this.f229106c.hashCode()) * 31) + this.f229107d.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(title=" + ((java.lang.Object) this.f229104a) + ", desc=" + ((java.lang.Object) this.f229105b) + ", location=" + this.f229106c + ", msgInfo=" + this.f229107d + ')';
    }
}
