package k01;

/* loaded from: classes7.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f303010a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f303011b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f303012c;

    /* renamed from: d, reason: collision with root package name */
    public final int f303013d;

    /* renamed from: e, reason: collision with root package name */
    public final int f303014e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f303015f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f303016g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f303017h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f303018i;

    /* renamed from: j, reason: collision with root package name */
    public final int f303019j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f303020k;

    /* renamed from: l, reason: collision with root package name */
    public final int f303021l;

    /* renamed from: m, reason: collision with root package name */
    public final double f303022m;

    /* renamed from: n, reason: collision with root package name */
    public final double f303023n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f303024o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f303025p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Long f303026q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f303027r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f303028s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f303029t;

    public c1(java.lang.String mimeType, java.lang.String imagePath, java.lang.String originImagePath, int i17, int i18, boolean z17, java.lang.String livePhotoVideoPath, java.lang.String originLivePhotoVideoPath, java.lang.String materialName, int i19, java.lang.String livePhotoFileName, int i27, double d17, double d18, java.lang.String str, java.lang.String str2, java.lang.Long l17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.o.g(mimeType, "mimeType");
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        kotlin.jvm.internal.o.g(originImagePath, "originImagePath");
        kotlin.jvm.internal.o.g(livePhotoVideoPath, "livePhotoVideoPath");
        kotlin.jvm.internal.o.g(originLivePhotoVideoPath, "originLivePhotoVideoPath");
        kotlin.jvm.internal.o.g(materialName, "materialName");
        kotlin.jvm.internal.o.g(livePhotoFileName, "livePhotoFileName");
        this.f303010a = mimeType;
        this.f303011b = imagePath;
        this.f303012c = originImagePath;
        this.f303013d = i17;
        this.f303014e = i18;
        this.f303015f = z17;
        this.f303016g = livePhotoVideoPath;
        this.f303017h = originLivePhotoVideoPath;
        this.f303018i = materialName;
        this.f303019j = i19;
        this.f303020k = livePhotoFileName;
        this.f303021l = i27;
        this.f303022m = d17;
        this.f303023n = d18;
        this.f303024o = str;
        this.f303025p = str2;
        this.f303026q = l17;
        this.f303027r = str3;
        this.f303028s = str4;
        this.f303029t = str5;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k01.c1)) {
            return false;
        }
        k01.c1 c1Var = (k01.c1) obj;
        return kotlin.jvm.internal.o.b(this.f303010a, c1Var.f303010a) && kotlin.jvm.internal.o.b(this.f303011b, c1Var.f303011b) && kotlin.jvm.internal.o.b(this.f303012c, c1Var.f303012c) && this.f303013d == c1Var.f303013d && this.f303014e == c1Var.f303014e && this.f303015f == c1Var.f303015f && kotlin.jvm.internal.o.b(this.f303016g, c1Var.f303016g) && kotlin.jvm.internal.o.b(this.f303017h, c1Var.f303017h) && kotlin.jvm.internal.o.b(this.f303018i, c1Var.f303018i) && this.f303019j == c1Var.f303019j && kotlin.jvm.internal.o.b(this.f303020k, c1Var.f303020k) && this.f303021l == c1Var.f303021l && java.lang.Double.compare(this.f303022m, c1Var.f303022m) == 0 && java.lang.Double.compare(this.f303023n, c1Var.f303023n) == 0 && kotlin.jvm.internal.o.b(this.f303024o, c1Var.f303024o) && kotlin.jvm.internal.o.b(this.f303025p, c1Var.f303025p) && kotlin.jvm.internal.o.b(this.f303026q, c1Var.f303026q) && kotlin.jvm.internal.o.b(this.f303027r, c1Var.f303027r) && kotlin.jvm.internal.o.b(this.f303028s, c1Var.f303028s) && kotlin.jvm.internal.o.b(this.f303029t, c1Var.f303029t);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((this.f303010a.hashCode() * 31) + this.f303011b.hashCode()) * 31) + this.f303012c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f303013d)) * 31) + java.lang.Integer.hashCode(this.f303014e)) * 31) + java.lang.Boolean.hashCode(this.f303015f)) * 31) + this.f303016g.hashCode()) * 31) + this.f303017h.hashCode()) * 31) + this.f303018i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f303019j)) * 31) + this.f303020k.hashCode()) * 31) + java.lang.Integer.hashCode(this.f303021l)) * 31) + java.lang.Double.hashCode(this.f303022m)) * 31) + java.lang.Double.hashCode(this.f303023n)) * 31;
        java.lang.String str = this.f303024o;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f303025p;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l17 = this.f303026q;
        int hashCode4 = (hashCode3 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str3 = this.f303027r;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f303028s;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f303029t;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PersonalCreatorExtraData(mimeType=" + this.f303010a + ", imagePath=" + this.f303011b + ", originImagePath=" + this.f303012c + ", width=" + this.f303013d + ", height=" + this.f303014e + ", isLivePhoto=" + this.f303015f + ", livePhotoVideoPath=" + this.f303016g + ", originLivePhotoVideoPath=" + this.f303017h + ", materialName=" + this.f303018i + ", materialSize=" + this.f303019j + ", livePhotoFileName=" + this.f303020k + ", livePhotoFileSize=" + this.f303021l + ", latitude=" + this.f303022m + ", longitude=" + this.f303023n + ", aiPicId=" + this.f303024o + ", aiPicPrompt=" + this.f303025p + ", aiPicSource=" + this.f303026q + ", aiPicTemplateId=" + this.f303027r + ", aiPicDataBuf=" + this.f303028s + ", aiPicStyle=" + this.f303029t + ')';
    }
}
