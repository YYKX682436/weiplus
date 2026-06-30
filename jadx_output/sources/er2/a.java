package er2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f256008a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f256009b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f256010c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f256011d;

    /* renamed from: e, reason: collision with root package name */
    public final int f256012e;

    /* renamed from: f, reason: collision with root package name */
    public final int f256013f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.u80 f256014g;

    /* renamed from: h, reason: collision with root package name */
    public final cr2.z f256015h;

    /* renamed from: i, reason: collision with root package name */
    public final int f256016i;

    /* renamed from: j, reason: collision with root package name */
    public final int f256017j;

    public a(int i17, java.lang.String themeId, java.lang.String themeTag, java.lang.String themeTagText, int i18, int i19, r45.u80 containerContext, cr2.z outSideHook, int i27, int i28) {
        kotlin.jvm.internal.o.g(themeId, "themeId");
        kotlin.jvm.internal.o.g(themeTag, "themeTag");
        kotlin.jvm.internal.o.g(themeTagText, "themeTagText");
        kotlin.jvm.internal.o.g(containerContext, "containerContext");
        kotlin.jvm.internal.o.g(outSideHook, "outSideHook");
        this.f256008a = i17;
        this.f256009b = themeId;
        this.f256010c = themeTag;
        this.f256011d = themeTagText;
        this.f256012e = i18;
        this.f256013f = i19;
        this.f256014g = containerContext;
        this.f256015h = outSideHook;
        this.f256016i = i27;
        this.f256017j = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er2.a)) {
            return false;
        }
        er2.a aVar = (er2.a) obj;
        return this.f256008a == aVar.f256008a && kotlin.jvm.internal.o.b(this.f256009b, aVar.f256009b) && kotlin.jvm.internal.o.b(this.f256010c, aVar.f256010c) && kotlin.jvm.internal.o.b(this.f256011d, aVar.f256011d) && this.f256012e == aVar.f256012e && this.f256013f == aVar.f256013f && kotlin.jvm.internal.o.b(this.f256014g, aVar.f256014g) && kotlin.jvm.internal.o.b(this.f256015h, aVar.f256015h) && this.f256016i == aVar.f256016i && this.f256017j == aVar.f256017j;
    }

    public int hashCode() {
        return (((((((((((((((((java.lang.Integer.hashCode(this.f256008a) * 31) + this.f256009b.hashCode()) * 31) + this.f256010c.hashCode()) * 31) + this.f256011d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f256012e)) * 31) + java.lang.Integer.hashCode(this.f256013f)) * 31) + this.f256014g.hashCode()) * 31) + this.f256015h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f256016i)) * 31) + java.lang.Integer.hashCode(this.f256017j);
    }

    public java.lang.String toString() {
        return "LiveThemeTagParams(pos=" + this.f256008a + ", themeId=" + this.f256009b + ", themeTag=" + this.f256010c + ", themeTagText=" + this.f256011d + ", containerType=" + this.f256012e + ", containerId=" + this.f256013f + ", containerContext=" + this.f256014g + ", outSideHook=" + this.f256015h + ", cardType=" + this.f256016i + ", playTogetherLiveType=" + this.f256017j + ')';
    }
}
