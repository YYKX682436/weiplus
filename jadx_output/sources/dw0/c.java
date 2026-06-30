package dw0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.maas.material.MJMaterialInfo f244083e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.maas.material.MJMaterialInfo f244084f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.maas.material.MJMaterialInfo f244085g;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.MJMaterialInfo f244086a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.Segment f244087b;

    /* renamed from: c, reason: collision with root package name */
    public final zu0.i f244088c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f244089d;

    static {
        new dw0.b(null);
        dw0.a aVar = dw0.a.f244078e;
        f244083e = new com.tencent.maas.material.MJMaterialInfo(9, "OriginTimbre", -1L, "无", "", "", new java.util.HashMap());
        f244084f = new com.tencent.maas.material.MJMaterialInfo(12, "OriginTimbre", -1L, "原声", "", "", new java.util.HashMap());
        f244085g = new com.tencent.maas.material.MJMaterialInfo(-1, "", -1L, "无", "", "", new java.util.HashMap());
    }

    public c(com.tencent.maas.material.MJMaterialInfo info, com.tencent.maas.moviecomposing.segments.Segment segment, zu0.i materialLoadState, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        this.f244086a = info;
        this.f244087b = segment;
        this.f244088c = materialLoadState;
        this.f244089d = z17;
    }

    public static dw0.c a(dw0.c cVar, com.tencent.maas.material.MJMaterialInfo info, com.tencent.maas.moviecomposing.segments.Segment segment, zu0.i materialLoadState, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            info = cVar.f244086a;
        }
        if ((i17 & 2) != 0) {
            segment = cVar.f244087b;
        }
        if ((i17 & 4) != 0) {
            materialLoadState = cVar.f244088c;
        }
        if ((i17 & 8) != 0) {
            z17 = cVar.f244089d;
        }
        cVar.getClass();
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        return new dw0.c(info, segment, materialLoadState, z17);
    }

    public final boolean b() {
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = this.f244086a;
        kotlin.jvm.internal.o.g(mJMaterialInfo, "<this>");
        java.lang.String str = mJMaterialInfo.f48224b;
        kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
        dw0.a aVar = dw0.a.f244078e;
        return r26.i0.y(str, "OriginTimbre", false);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0.c)) {
            return false;
        }
        dw0.c cVar = (dw0.c) obj;
        return kotlin.jvm.internal.o.b(this.f244086a, cVar.f244086a) && kotlin.jvm.internal.o.b(this.f244087b, cVar.f244087b) && this.f244088c == cVar.f244088c && this.f244089d == cVar.f244089d;
    }

    public int hashCode() {
        int hashCode = this.f244086a.hashCode() * 31;
        com.tencent.maas.moviecomposing.segments.Segment segment = this.f244087b;
        return ((((hashCode + (segment == null ? 0 : segment.hashCode())) * 31) + this.f244088c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f244089d);
    }

    public java.lang.String toString() {
        return "TimbreMaterialInfo(info=" + this.f244086a + ", segment=" + this.f244087b + ", materialLoadState=" + this.f244088c + ", isSelected=" + this.f244089d + ')';
    }
}
