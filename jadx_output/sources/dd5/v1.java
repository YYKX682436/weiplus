package dd5;

/* loaded from: classes9.dex */
public final class v1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229310a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229311b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229312c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229313d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f229314e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229315f;

    public v1(java.lang.CharSequence title, java.lang.CharSequence source, java.lang.String imgPath, java.lang.String appId, boolean z17, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229310a = title;
        this.f229311b = source;
        this.f229312c = imgPath;
        this.f229313d = appId;
        this.f229314e = z17;
        this.f229315f = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229310a, this.f229311b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.v1)) {
            return false;
        }
        dd5.v1 v1Var = (dd5.v1) obj;
        return kotlin.jvm.internal.o.b(this.f229310a, v1Var.f229310a) && kotlin.jvm.internal.o.b(this.f229311b, v1Var.f229311b) && kotlin.jvm.internal.o.b(this.f229312c, v1Var.f229312c) && kotlin.jvm.internal.o.b(this.f229313d, v1Var.f229313d) && this.f229314e == v1Var.f229314e && kotlin.jvm.internal.o.b(this.f229315f, v1Var.f229315f);
    }

    public int hashCode() {
        return (((((((((this.f229310a.hashCode() * 31) + this.f229311b.hashCode()) * 31) + this.f229312c.hashCode()) * 31) + this.f229313d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f229314e)) * 31) + this.f229315f.hashCode();
    }

    public java.lang.String toString() {
        return "MsgHistoryGalleryTypeLinkViewModel(title=" + ((java.lang.Object) this.f229310a) + ", source=" + ((java.lang.Object) this.f229311b) + ", imgPath=" + this.f229312c + ", appId=" + this.f229313d + ", isBizNativeVideo=" + this.f229314e + ", msgInfo=" + this.f229315f + ')';
    }
}
