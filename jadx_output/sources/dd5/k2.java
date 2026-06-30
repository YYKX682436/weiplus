package dd5;

/* loaded from: classes8.dex */
public final class k2 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229193a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229194b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229195c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229196d;

    public k2(java.lang.CharSequence title, java.lang.CharSequence desc, java.lang.String str, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229193a = title;
        this.f229194b = desc;
        this.f229195c = str;
        this.f229196d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229193a, this.f229194b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.k2)) {
            return false;
        }
        dd5.k2 k2Var = (dd5.k2) obj;
        return kotlin.jvm.internal.o.b(this.f229193a, k2Var.f229193a) && kotlin.jvm.internal.o.b(this.f229194b, k2Var.f229194b) && kotlin.jvm.internal.o.b(this.f229195c, k2Var.f229195c) && kotlin.jvm.internal.o.b(this.f229196d, k2Var.f229196d);
    }

    public int hashCode() {
        int hashCode = ((this.f229193a.hashCode() * 31) + this.f229194b.hashCode()) * 31;
        java.lang.String str = this.f229195c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f229196d.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(title=" + ((java.lang.Object) this.f229193a) + ", desc=" + ((java.lang.Object) this.f229194b) + ", recordItem=" + this.f229195c + ", msgInfo=" + this.f229196d + ')';
    }
}
