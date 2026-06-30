package mt3;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final st3.f f331289a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f331290b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f331291c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f331292d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f331293e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f331294f;

    /* renamed from: g, reason: collision with root package name */
    public final int f331295g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f331296h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f331297i;

    /* renamed from: j, reason: collision with root package name */
    public final int f331298j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f331299k;

    public a(st3.f captureInfo, java.util.List editorItems, float[] drawingRect, float[] fArr, java.lang.String mixVideoPath, java.lang.String mixThumbPath, int i17, boolean z17, boolean z18, int i18, java.lang.String blurBgPath, int i19, kotlin.jvm.internal.i iVar) {
        fArr = (i19 & 8) != 0 ? null : fArr;
        i17 = (i19 & 64) != 0 ? 1 : i17;
        z17 = (i19 & 128) != 0 ? false : z17;
        z18 = (i19 & 256) != 0 ? false : z18;
        i18 = (i19 & 512) != 0 ? 0 : i18;
        blurBgPath = (i19 & 1024) != 0 ? "" : blurBgPath;
        kotlin.jvm.internal.o.g(captureInfo, "captureInfo");
        kotlin.jvm.internal.o.g(editorItems, "editorItems");
        kotlin.jvm.internal.o.g(drawingRect, "drawingRect");
        kotlin.jvm.internal.o.g(mixVideoPath, "mixVideoPath");
        kotlin.jvm.internal.o.g(mixThumbPath, "mixThumbPath");
        kotlin.jvm.internal.o.g(blurBgPath, "blurBgPath");
        this.f331289a = captureInfo;
        this.f331290b = editorItems;
        this.f331291c = drawingRect;
        this.f331292d = fArr;
        this.f331293e = mixVideoPath;
        this.f331294f = mixThumbPath;
        this.f331295g = i17;
        this.f331296h = z17;
        this.f331297i = z18;
        this.f331298j = i18;
        this.f331299k = blurBgPath;
    }

    public final java.lang.String a() {
        return this.f331299k;
    }

    public final float[] b() {
        return this.f331291c;
    }

    public final java.util.List c() {
        return this.f331290b;
    }

    public final float[] d() {
        return this.f331292d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt3.a)) {
            return false;
        }
        mt3.a aVar = (mt3.a) obj;
        return kotlin.jvm.internal.o.b(this.f331289a, aVar.f331289a) && kotlin.jvm.internal.o.b(this.f331290b, aVar.f331290b) && kotlin.jvm.internal.o.b(this.f331291c, aVar.f331291c) && kotlin.jvm.internal.o.b(this.f331292d, aVar.f331292d) && kotlin.jvm.internal.o.b(this.f331293e, aVar.f331293e) && kotlin.jvm.internal.o.b(this.f331294f, aVar.f331294f) && this.f331295g == aVar.f331295g && this.f331296h == aVar.f331296h && this.f331297i == aVar.f331297i && this.f331298j == aVar.f331298j && kotlin.jvm.internal.o.b(this.f331299k, aVar.f331299k);
    }

    public int hashCode() {
        int hashCode = ((((this.f331289a.hashCode() * 31) + this.f331290b.hashCode()) * 31) + java.util.Arrays.hashCode(this.f331291c)) * 31;
        float[] fArr = this.f331292d;
        return ((((((((((((((hashCode + (fArr == null ? 0 : java.util.Arrays.hashCode(fArr))) * 31) + this.f331293e.hashCode()) * 31) + this.f331294f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f331295g)) * 31) + java.lang.Boolean.hashCode(this.f331296h)) * 31) + java.lang.Boolean.hashCode(this.f331297i)) * 31) + java.lang.Integer.hashCode(this.f331298j)) * 31) + this.f331299k.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VideoMixData(captureInfo=");
        sb6.append(this.f331289a);
        sb6.append(", editorItems=");
        sb6.append(this.f331290b);
        sb6.append(", drawingRect=");
        java.lang.String arrays = java.util.Arrays.toString(this.f331291c);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", mixVideoPath='");
        sb6.append(this.f331293e);
        sb6.append("', mixThumbPath='");
        sb6.append(this.f331294f);
        sb6.append("', retryTime=");
        sb6.append(this.f331295g);
        sb6.append(", useSoftEncode=");
        sb6.append(this.f331296h);
        sb6.append(", enableHevc=");
        sb6.append(this.f331297i);
        sb6.append(", thumbShortSide=");
        sb6.append(this.f331298j);
        sb6.append(", blurBgPath='");
        sb6.append(this.f331299k);
        sb6.append("')");
        return sb6.toString();
    }
}
