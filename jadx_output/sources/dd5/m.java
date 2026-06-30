package dd5;

/* loaded from: classes9.dex */
public final class m implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f229207a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f229208b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229209c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229210d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f229211e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f229212f;

    /* renamed from: g, reason: collision with root package name */
    public final int f229213g;

    /* renamed from: h, reason: collision with root package name */
    public final int f229214h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f229215i;

    public m(java.lang.CharSequence title, java.lang.CharSequence desc, java.lang.String str, java.lang.String imgPath, java.lang.String weAppUsername, java.lang.String appId, int i17, int i18, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        kotlin.jvm.internal.o.g(weAppUsername, "weAppUsername");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f229207a = title;
        this.f229208b = desc;
        this.f229209c = str;
        this.f229210d = imgPath;
        this.f229211e = weAppUsername;
        this.f229212f = appId;
        this.f229213g = i17;
        this.f229214h = i18;
        this.f229215i = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f229207a, this.f229208b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.m)) {
            return false;
        }
        dd5.m mVar = (dd5.m) obj;
        return kotlin.jvm.internal.o.b(this.f229207a, mVar.f229207a) && kotlin.jvm.internal.o.b(this.f229208b, mVar.f229208b) && kotlin.jvm.internal.o.b(this.f229209c, mVar.f229209c) && kotlin.jvm.internal.o.b(this.f229210d, mVar.f229210d) && kotlin.jvm.internal.o.b(this.f229211e, mVar.f229211e) && kotlin.jvm.internal.o.b(this.f229212f, mVar.f229212f) && this.f229213g == mVar.f229213g && this.f229214h == mVar.f229214h && kotlin.jvm.internal.o.b(this.f229215i, mVar.f229215i);
    }

    public int hashCode() {
        int hashCode = ((this.f229207a.hashCode() * 31) + this.f229208b.hashCode()) * 31;
        java.lang.String str = this.f229209c;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f229210d.hashCode()) * 31) + this.f229211e.hashCode()) * 31) + this.f229212f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f229213g)) * 31) + java.lang.Integer.hashCode(this.f229214h)) * 31) + this.f229215i.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(title=" + ((java.lang.Object) this.f229207a) + ", desc=" + ((java.lang.Object) this.f229208b) + ", imgUrl=" + this.f229209c + ", imgPath=" + this.f229210d + ", weAppUsername=" + this.f229211e + ", appId=" + this.f229212f + ", version=" + this.f229213g + ", pkgDebugType=" + this.f229214h + ", msgInfo=" + this.f229215i + ')';
    }
}
