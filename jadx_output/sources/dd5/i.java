package dd5;

/* loaded from: classes8.dex */
public final class i implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229166a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229167b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229168c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229169d;

    public i(java.lang.CharSequence title, java.lang.CharSequence desc, java.lang.String imgPath, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229166a = title;
        this.f229167b = desc;
        this.f229168c = imgPath;
        this.f229169d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229166a, this.f229167b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.i)) {
            return false;
        }
        dd5.i iVar = (dd5.i) obj;
        return kotlin.jvm.internal.o.b(this.f229166a, iVar.f229166a) && kotlin.jvm.internal.o.b(this.f229167b, iVar.f229167b) && kotlin.jvm.internal.o.b(this.f229168c, iVar.f229168c) && kotlin.jvm.internal.o.b(this.f229169d, iVar.f229169d);
    }

    public int hashCode() {
        return (((((this.f229166a.hashCode() * 31) + this.f229167b.hashCode()) * 31) + this.f229168c.hashCode()) * 31) + this.f229169d.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(title=" + ((java.lang.Object) this.f229166a) + ", desc=" + ((java.lang.Object) this.f229167b) + ", imgPath=" + this.f229168c + ", msgInfo=" + this.f229169d + ')';
    }
}
