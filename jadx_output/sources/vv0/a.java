package vv0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.MJMaterialInfo f440369a;

    /* renamed from: b, reason: collision with root package name */
    public final zu0.i f440370b;

    public a(com.tencent.maas.material.MJMaterialInfo info, zu0.i materialLoadState) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        this.f440369a = info;
        this.f440370b = materialLoadState;
    }

    public static vv0.a a(vv0.a aVar, com.tencent.maas.material.MJMaterialInfo info, zu0.i materialLoadState, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            info = aVar.f440369a;
        }
        if ((i17 & 2) != 0) {
            materialLoadState = aVar.f440370b;
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        return new vv0.a(info, materialLoadState);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.a)) {
            return false;
        }
        vv0.a aVar = (vv0.a) obj;
        return kotlin.jvm.internal.o.b(this.f440369a, aVar.f440369a) && this.f440370b == aVar.f440370b;
    }

    public int hashCode() {
        return (this.f440369a.hashCode() * 31) + this.f440370b.hashCode();
    }

    public java.lang.String toString() {
        return "ClipData(info=" + this.f440369a + ", materialLoadState=" + this.f440370b + ')';
    }
}
