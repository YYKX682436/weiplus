package hk0;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final hk0.z0 f281846a;

    /* renamed from: b, reason: collision with root package name */
    public final hk0.z0 f281847b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f281848c;

    public y0(hk0.z0 mosaicType, hk0.z0 lastMosaicType, boolean z17) {
        kotlin.jvm.internal.o.g(mosaicType, "mosaicType");
        kotlin.jvm.internal.o.g(lastMosaicType, "lastMosaicType");
        this.f281846a = mosaicType;
        this.f281847b = lastMosaicType;
        this.f281848c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.y0)) {
            return false;
        }
        hk0.y0 y0Var = (hk0.y0) obj;
        return this.f281846a == y0Var.f281846a && this.f281847b == y0Var.f281847b && this.f281848c == y0Var.f281848c;
    }

    public int hashCode() {
        return (((this.f281846a.hashCode() * 31) + this.f281847b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f281848c);
    }

    public java.lang.String toString() {
        return "MosaicState(mosaicType=" + this.f281846a + ", lastMosaicType=" + this.f281847b + ", changeAni=" + this.f281848c + ')';
    }
}
