package zv0;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final zv0.r f476220d = new zv0.r(new com.tencent.maas.material.MJMaterialInfo(11, "Blank", -1, "无", "", "", new java.util.HashMap()), zu0.i.f475676f, true);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.MJMaterialInfo f476221a;

    /* renamed from: b, reason: collision with root package name */
    public final zu0.i f476222b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f476223c;

    public r(com.tencent.maas.material.MJMaterialInfo info, zu0.i materialLoadState, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        this.f476221a = info;
        this.f476222b = materialLoadState;
        this.f476223c = z17;
    }

    public static zv0.r a(zv0.r rVar, com.tencent.maas.material.MJMaterialInfo info, zu0.i materialLoadState, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            info = rVar.f476221a;
        }
        if ((i17 & 2) != 0) {
            materialLoadState = rVar.f476222b;
        }
        if ((i17 & 4) != 0) {
            z17 = rVar.f476223c;
        }
        rVar.getClass();
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        return new zv0.r(info, materialLoadState, z17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv0.r)) {
            return false;
        }
        zv0.r rVar = (zv0.r) obj;
        return kotlin.jvm.internal.o.b(this.f476221a, rVar.f476221a) && this.f476222b == rVar.f476222b && this.f476223c == rVar.f476223c;
    }

    public int hashCode() {
        return (((this.f476221a.hashCode() * 31) + this.f476222b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f476223c);
    }

    public java.lang.String toString() {
        return "TransitionMaterialInfo(info=" + this.f476221a + ", materialLoadState=" + this.f476222b + ", isSelected=" + this.f476223c + ')';
    }
}
