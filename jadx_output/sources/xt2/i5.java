package xt2;

/* loaded from: classes3.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    public final float f456791a;

    /* renamed from: b, reason: collision with root package name */
    public final float f456792b;

    /* renamed from: c, reason: collision with root package name */
    public final float f456793c;

    /* renamed from: d, reason: collision with root package name */
    public final float f456794d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f456795e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f456796f;

    /* renamed from: g, reason: collision with root package name */
    public final float f456797g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f456798h;

    /* renamed from: i, reason: collision with root package name */
    public final float f456799i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f456800j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f456801k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f456802l;

    public i5(float f17, float f18, float f19, float f27, boolean z17, boolean z18, float f28, boolean z19, float f29, boolean z27, boolean z28, boolean z29, int i17, kotlin.jvm.internal.i iVar) {
        z27 = (i17 & 512) != 0 ? false : z27;
        z28 = (i17 & 1024) != 0 ? false : z28;
        z29 = (i17 & 2048) != 0 ? true : z29;
        this.f456791a = f17;
        this.f456792b = f18;
        this.f456793c = f19;
        this.f456794d = f27;
        this.f456795e = z17;
        this.f456796f = z18;
        this.f456797g = f28;
        this.f456798h = z19;
        this.f456799i = f29;
        this.f456800j = z27;
        this.f456801k = z28;
        this.f456802l = z29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt2.i5)) {
            return false;
        }
        xt2.i5 i5Var = (xt2.i5) obj;
        return java.lang.Float.compare(this.f456791a, i5Var.f456791a) == 0 && java.lang.Float.compare(this.f456792b, i5Var.f456792b) == 0 && java.lang.Float.compare(this.f456793c, i5Var.f456793c) == 0 && java.lang.Float.compare(this.f456794d, i5Var.f456794d) == 0 && this.f456795e == i5Var.f456795e && this.f456796f == i5Var.f456796f && java.lang.Float.compare(this.f456797g, i5Var.f456797g) == 0 && this.f456798h == i5Var.f456798h && java.lang.Float.compare(this.f456799i, i5Var.f456799i) == 0 && this.f456800j == i5Var.f456800j && this.f456801k == i5Var.f456801k && this.f456802l == i5Var.f456802l;
    }

    public int hashCode() {
        return (((((((((((((((((((((java.lang.Float.hashCode(this.f456791a) * 31) + java.lang.Float.hashCode(this.f456792b)) * 31) + java.lang.Float.hashCode(this.f456793c)) * 31) + java.lang.Float.hashCode(this.f456794d)) * 31) + java.lang.Boolean.hashCode(this.f456795e)) * 31) + java.lang.Boolean.hashCode(this.f456796f)) * 31) + java.lang.Float.hashCode(this.f456797g)) * 31) + java.lang.Boolean.hashCode(this.f456798h)) * 31) + java.lang.Float.hashCode(this.f456799i)) * 31) + java.lang.Boolean.hashCode(this.f456800j)) * 31) + java.lang.Boolean.hashCode(this.f456801k)) * 31) + java.lang.Boolean.hashCode(this.f456802l);
    }

    public java.lang.String toString() {
        return "Config(sellPriceSizePx=" + this.f456791a + ", sellWordingSizePx=" + this.f456792b + ", priceBeginSize=" + this.f456793c + ", priceSuffixSizePx=" + this.f456794d + ", showSellWording=" + this.f456795e + ", showSellWordingBg=" + this.f456796f + ", marketPriceSizePx=" + this.f456797g + ", showMarketPrice=" + this.f456798h + ", maxWidth=" + this.f456799i + ", showBeginPrice=" + this.f456800j + ", showPriceSuffix=" + this.f456801k + ", forceLight=" + this.f456802l + ')';
    }
}
