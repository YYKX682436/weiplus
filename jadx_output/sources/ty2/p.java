package ty2;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.q5 f423098a;

    /* renamed from: b, reason: collision with root package name */
    public final float f423099b;

    /* renamed from: c, reason: collision with root package name */
    public final float f423100c;

    /* renamed from: d, reason: collision with root package name */
    public final int f423101d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f423102e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f423103f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f423104g;

    public p(bw5.q5 item, float f17, float f18, int i17, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f423098a = item;
        this.f423099b = f17;
        this.f423100c = f18;
        this.f423101d = i17;
        this.f423102e = z17;
        this.f423103f = z18;
        this.f423104g = z19;
    }

    public static ty2.p a(ty2.p pVar, bw5.q5 item, float f17, float f18, int i17, boolean z17, boolean z18, boolean z19, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            item = pVar.f423098a;
        }
        if ((i18 & 2) != 0) {
            f17 = pVar.f423099b;
        }
        float f19 = f17;
        if ((i18 & 4) != 0) {
            f18 = pVar.f423100c;
        }
        float f27 = f18;
        if ((i18 & 8) != 0) {
            i17 = pVar.f423101d;
        }
        int i19 = i17;
        if ((i18 & 16) != 0) {
            z17 = pVar.f423102e;
        }
        boolean z27 = z17;
        if ((i18 & 32) != 0) {
            z18 = pVar.f423103f;
        }
        boolean z28 = z18;
        if ((i18 & 64) != 0) {
            z19 = pVar.f423104g;
        }
        pVar.getClass();
        kotlin.jvm.internal.o.g(item, "item");
        return new ty2.p(item, f19, f27, i19, z27, z28, z19);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.p)) {
            return false;
        }
        ty2.p pVar = (ty2.p) obj;
        return kotlin.jvm.internal.o.b(this.f423098a, pVar.f423098a) && java.lang.Float.compare(this.f423099b, pVar.f423099b) == 0 && java.lang.Float.compare(this.f423100c, pVar.f423100c) == 0 && this.f423101d == pVar.f423101d && this.f423102e == pVar.f423102e && this.f423103f == pVar.f423103f && this.f423104g == pVar.f423104g;
    }

    public int hashCode() {
        return (((((((((((this.f423098a.hashCode() * 31) + java.lang.Float.hashCode(this.f423099b)) * 31) + java.lang.Float.hashCode(this.f423100c)) * 31) + java.lang.Integer.hashCode(this.f423101d)) * 31) + java.lang.Boolean.hashCode(this.f423102e)) * 31) + java.lang.Boolean.hashCode(this.f423103f)) * 31) + java.lang.Boolean.hashCode(this.f423104g);
    }

    public java.lang.String toString() {
        return "Config(item=" + this.f423098a + ", priceSizePx=" + this.f423099b + ", sellWordingSizePx=" + this.f423100c + ", maxWidthPx=" + this.f423101d + ", showSellWording=" + this.f423102e + ", showSaleNum=" + this.f423103f + ", showBegin=" + this.f423104g + ')';
    }
}
