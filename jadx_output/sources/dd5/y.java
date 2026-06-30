package dd5;

/* loaded from: classes8.dex */
public final class y implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229336a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229337b;

    /* renamed from: c, reason: collision with root package name */
    public final int f229338c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229339d;

    public y(java.lang.CharSequence title, java.lang.CharSequence desc, int i17, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229336a = title;
        this.f229337b = desc;
        this.f229338c = i17;
        this.f229339d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229336a, this.f229337b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.y)) {
            return false;
        }
        dd5.y yVar = (dd5.y) obj;
        return kotlin.jvm.internal.o.b(this.f229336a, yVar.f229336a) && kotlin.jvm.internal.o.b(this.f229337b, yVar.f229337b) && this.f229338c == yVar.f229338c && kotlin.jvm.internal.o.b(this.f229339d, yVar.f229339d);
    }

    public int hashCode() {
        return (((((this.f229336a.hashCode() * 31) + this.f229337b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f229338c)) * 31) + this.f229339d.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(title=" + ((java.lang.Object) this.f229336a) + ", desc=" + ((java.lang.Object) this.f229337b) + ", iconResId=" + this.f229338c + ", msgInfo=" + this.f229339d + ')';
    }
}
