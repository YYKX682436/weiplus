package hf2;

/* loaded from: classes10.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f281116a;

    /* renamed from: b, reason: collision with root package name */
    public final hf2.r2 f281117b;

    public m2(int i17, hf2.r2 locationInfo) {
        kotlin.jvm.internal.o.g(locationInfo, "locationInfo");
        this.f281116a = i17;
        this.f281117b = locationInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf2.m2)) {
            return false;
        }
        hf2.m2 m2Var = (hf2.m2) obj;
        return this.f281116a == m2Var.f281116a && kotlin.jvm.internal.o.b(this.f281117b, m2Var.f281117b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f281116a) * 31) + this.f281117b.hashCode();
    }

    public java.lang.String toString() {
        return "LocationInfoWrapper(stickerType=" + this.f281116a + ", locationInfo=" + this.f281117b + ')';
    }
}
