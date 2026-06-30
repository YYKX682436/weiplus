package ty2;

/* loaded from: classes9.dex */
public final class i implements ty2.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Float f423068a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f423069b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f423070c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f423071d;

    public i(java.lang.Float f17, boolean z17, boolean z18, boolean z19) {
        this.f423068a = f17;
        this.f423069b = z17;
        this.f423070c = z18;
        this.f423071d = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.i)) {
            return false;
        }
        ty2.i iVar = (ty2.i) obj;
        return kotlin.jvm.internal.o.b(this.f423068a, iVar.f423068a) && this.f423069b == iVar.f423069b && this.f423070c == iVar.f423070c && this.f423071d == iVar.f423071d;
    }

    public int hashCode() {
        java.lang.Float f17 = this.f423068a;
        return ((((((f17 == null ? 0 : f17.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f423069b)) * 31) + java.lang.Boolean.hashCode(this.f423070c)) * 31) + java.lang.Boolean.hashCode(this.f423071d);
    }

    public java.lang.String toString() {
        return "Config(priceSizePx=" + this.f423068a + ", showSellWording=" + this.f423069b + ", showSaleNum=" + this.f423070c + ", showBegin=" + this.f423071d + ')';
    }
}
