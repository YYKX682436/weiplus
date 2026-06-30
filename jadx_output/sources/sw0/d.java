package sw0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.MJMaterialInfo f413422a;

    /* renamed from: b, reason: collision with root package name */
    public final zu0.i f413423b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f413424c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f413425d;

    public d(com.tencent.maas.material.MJMaterialInfo info, zu0.i materialLoadState, boolean z17, java.lang.String str) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        this.f413422a = info;
        this.f413423b = materialLoadState;
        this.f413424c = z17;
        this.f413425d = str;
    }

    public static sw0.d a(sw0.d dVar, com.tencent.maas.material.MJMaterialInfo info, zu0.i materialLoadState, boolean z17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            info = dVar.f413422a;
        }
        if ((i17 & 2) != 0) {
            materialLoadState = dVar.f413423b;
        }
        if ((i17 & 4) != 0) {
            z17 = dVar.f413424c;
        }
        if ((i17 & 8) != 0) {
            str = dVar.f413425d;
        }
        dVar.getClass();
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        return new sw0.d(info, materialLoadState, z17, str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.d)) {
            return false;
        }
        sw0.d dVar = (sw0.d) obj;
        return kotlin.jvm.internal.o.b(this.f413422a, dVar.f413422a) && this.f413423b == dVar.f413423b && this.f413424c == dVar.f413424c && kotlin.jvm.internal.o.b(this.f413425d, dVar.f413425d);
    }

    public int hashCode() {
        int hashCode = ((((this.f413422a.hashCode() * 31) + this.f413423b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f413424c)) * 31;
        java.lang.String str = this.f413425d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "TextMaterialInfo(info=" + this.f413422a + ", materialLoadState=" + this.f413423b + ", isSelected=" + this.f413424c + ", previewGifPath=" + this.f413425d + ')';
    }
}
