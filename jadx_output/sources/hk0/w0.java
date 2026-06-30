package hk0;

/* loaded from: classes3.dex */
public final class w0 extends hk0.a {

    /* renamed from: b, reason: collision with root package name */
    public final hk0.l f281835b;

    /* renamed from: c, reason: collision with root package name */
    public final hk0.z0 f281836c;

    /* renamed from: d, reason: collision with root package name */
    public final xk0.k f281837d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f281838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(hk0.l type, hk0.z0 mosaicType, xk0.k kVar, java.util.ArrayList arrayList, int i17, kotlin.jvm.internal.i iVar) {
        super(type);
        kVar = (i17 & 4) != 0 ? null : kVar;
        arrayList = (i17 & 8) != 0 ? null : arrayList;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(mosaicType, "mosaicType");
        this.f281835b = type;
        this.f281836c = mosaicType;
        this.f281837d = kVar;
        this.f281838e = arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.w0)) {
            return false;
        }
        hk0.w0 w0Var = (hk0.w0) obj;
        return this.f281835b == w0Var.f281835b && this.f281836c == w0Var.f281836c && kotlin.jvm.internal.o.b(this.f281837d, w0Var.f281837d) && kotlin.jvm.internal.o.b(this.f281838e, w0Var.f281838e);
    }

    public int hashCode() {
        int hashCode = ((this.f281835b.hashCode() * 31) + this.f281836c.hashCode()) * 31;
        xk0.k kVar = this.f281837d;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        java.util.ArrayList arrayList = this.f281838e;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MosaicEditData(type=" + this.f281835b + ", mosaicType=" + this.f281836c + ", item=" + this.f281837d + ", itemList=" + this.f281838e + ')';
    }
}
