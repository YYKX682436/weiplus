package f00;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f258296a;

    /* renamed from: b, reason: collision with root package name */
    public final float f258297b;

    /* renamed from: c, reason: collision with root package name */
    public final float f258298c;

    /* renamed from: d, reason: collision with root package name */
    public final float f258299d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f258300e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f258301f;

    /* renamed from: g, reason: collision with root package name */
    public final float f258302g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f258303h;

    /* renamed from: i, reason: collision with root package name */
    public final float f258304i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f258305j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f258306k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f258307l;

    public f(float f17, float f18, float f19, float f27, boolean z17, boolean z18, float f28, boolean z19, float f29, boolean z27, boolean z28, boolean z29, int i17, kotlin.jvm.internal.i iVar) {
        z27 = (i17 & 512) != 0 ? false : z27;
        z28 = (i17 & 1024) != 0 ? false : z28;
        z29 = (i17 & 2048) != 0 ? true : z29;
        this.f258296a = f17;
        this.f258297b = f18;
        this.f258298c = f19;
        this.f258299d = f27;
        this.f258300e = z17;
        this.f258301f = z18;
        this.f258302g = f28;
        this.f258303h = z19;
        this.f258304i = f29;
        this.f258305j = z27;
        this.f258306k = z28;
        this.f258307l = z29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f00.f)) {
            return false;
        }
        f00.f fVar = (f00.f) obj;
        return java.lang.Float.compare(this.f258296a, fVar.f258296a) == 0 && java.lang.Float.compare(this.f258297b, fVar.f258297b) == 0 && java.lang.Float.compare(this.f258298c, fVar.f258298c) == 0 && java.lang.Float.compare(this.f258299d, fVar.f258299d) == 0 && this.f258300e == fVar.f258300e && this.f258301f == fVar.f258301f && java.lang.Float.compare(this.f258302g, fVar.f258302g) == 0 && this.f258303h == fVar.f258303h && java.lang.Float.compare(this.f258304i, fVar.f258304i) == 0 && this.f258305j == fVar.f258305j && this.f258306k == fVar.f258306k && this.f258307l == fVar.f258307l;
    }

    public int hashCode() {
        return (((((((((((((((((((((java.lang.Float.hashCode(this.f258296a) * 31) + java.lang.Float.hashCode(this.f258297b)) * 31) + java.lang.Float.hashCode(this.f258298c)) * 31) + java.lang.Float.hashCode(this.f258299d)) * 31) + java.lang.Boolean.hashCode(this.f258300e)) * 31) + java.lang.Boolean.hashCode(this.f258301f)) * 31) + java.lang.Float.hashCode(this.f258302g)) * 31) + java.lang.Boolean.hashCode(this.f258303h)) * 31) + java.lang.Float.hashCode(this.f258304i)) * 31) + java.lang.Boolean.hashCode(this.f258305j)) * 31) + java.lang.Boolean.hashCode(this.f258306k)) * 31) + java.lang.Boolean.hashCode(this.f258307l);
    }

    public java.lang.String toString() {
        return "Config(sellPriceSizePx=" + this.f258296a + ", sellWordingSizePx=" + this.f258297b + ", priceBeginSize=" + this.f258298c + ", priceSuffixSizePx=" + this.f258299d + ", showSellWording=" + this.f258300e + ", showSellWordingBg=" + this.f258301f + ", marketPriceSizePx=" + this.f258302g + ", showMarketPrice=" + this.f258303h + ", maxWidth=" + this.f258304i + ", showBeginPrice=" + this.f258305j + ", showPriceSuffix=" + this.f258306k + ", forceLight=" + this.f258307l + ')';
    }
}
