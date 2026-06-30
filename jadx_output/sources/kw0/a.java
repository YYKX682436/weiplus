package kw0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.MJMaterialInfo f312788a;

    /* renamed from: b, reason: collision with root package name */
    public final zu0.i f312789b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f312790c;

    public a(com.tencent.maas.material.MJMaterialInfo info, zu0.i materialLoadState, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        this.f312788a = info;
        this.f312789b = materialLoadState;
        this.f312790c = z17;
    }

    public static kw0.a a(kw0.a aVar, com.tencent.maas.material.MJMaterialInfo info, zu0.i materialLoadState, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            info = aVar.f312788a;
        }
        if ((i17 & 2) != 0) {
            materialLoadState = aVar.f312789b;
        }
        if ((i17 & 4) != 0) {
            z17 = aVar.f312790c;
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        return new kw0.a(info, materialLoadState, z17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw0.a)) {
            return false;
        }
        kw0.a aVar = (kw0.a) obj;
        return kotlin.jvm.internal.o.b(this.f312788a, aVar.f312788a) && this.f312789b == aVar.f312789b && this.f312790c == aVar.f312790c;
    }

    public int hashCode() {
        return (((this.f312788a.hashCode() * 31) + this.f312789b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f312790c);
    }

    public java.lang.String toString() {
        return "StickerData(info=" + this.f312788a + ", materialLoadState=" + this.f312789b + ", isSelected=" + this.f312790c + ')';
    }
}
