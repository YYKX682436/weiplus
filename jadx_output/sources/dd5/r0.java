package dd5;

/* loaded from: classes9.dex */
public final class r0 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229271a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229272b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229273c;

    /* renamed from: d, reason: collision with root package name */
    public final te5.i f229274d;

    public r0(com.tencent.mm.storage.f9 msgInfo, java.lang.CharSequence title, java.lang.String fileSize, te5.i favFileBubbleModel) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(fileSize, "fileSize");
        kotlin.jvm.internal.o.g(favFileBubbleModel, "favFileBubbleModel");
        this.f229271a = msgInfo;
        this.f229272b = title;
        this.f229273c = fileSize;
        this.f229274d = favFileBubbleModel;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229272b, this.f229273c);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.r0)) {
            return false;
        }
        dd5.r0 r0Var = (dd5.r0) obj;
        return kotlin.jvm.internal.o.b(this.f229271a, r0Var.f229271a) && kotlin.jvm.internal.o.b(this.f229272b, r0Var.f229272b) && kotlin.jvm.internal.o.b(this.f229273c, r0Var.f229273c) && kotlin.jvm.internal.o.b(this.f229274d, r0Var.f229274d);
    }

    public int hashCode() {
        return (((((this.f229271a.hashCode() * 31) + this.f229272b.hashCode()) * 31) + this.f229273c.hashCode()) * 31) + this.f229274d.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(msgInfo=" + this.f229271a + ", title=" + ((java.lang.Object) this.f229272b) + ", fileSize=" + this.f229273c + ", favFileBubbleModel=" + this.f229274d + ')';
    }
}
