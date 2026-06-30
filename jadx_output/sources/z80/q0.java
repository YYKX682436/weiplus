package z80;

/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f470660a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f470661b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f470662c;

    /* renamed from: d, reason: collision with root package name */
    public final float f470663d;

    /* renamed from: e, reason: collision with root package name */
    public final float f470664e;

    public q0(java.lang.String poiId, java.lang.String poiName, java.lang.String poiAddress, float f17, float f18) {
        kotlin.jvm.internal.o.g(poiId, "poiId");
        kotlin.jvm.internal.o.g(poiName, "poiName");
        kotlin.jvm.internal.o.g(poiAddress, "poiAddress");
        this.f470660a = poiId;
        this.f470661b = poiName;
        this.f470662c = poiAddress;
        this.f470663d = f17;
        this.f470664e = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80.q0)) {
            return false;
        }
        z80.q0 q0Var = (z80.q0) obj;
        return kotlin.jvm.internal.o.b(this.f470660a, q0Var.f470660a) && kotlin.jvm.internal.o.b(this.f470661b, q0Var.f470661b) && kotlin.jvm.internal.o.b(this.f470662c, q0Var.f470662c) && java.lang.Float.compare(this.f470663d, q0Var.f470663d) == 0 && java.lang.Float.compare(this.f470664e, q0Var.f470664e) == 0;
    }

    public int hashCode() {
        return (((((((this.f470660a.hashCode() * 31) + this.f470661b.hashCode()) * 31) + this.f470662c.hashCode()) * 31) + java.lang.Float.hashCode(this.f470663d)) * 31) + java.lang.Float.hashCode(this.f470664e);
    }

    public java.lang.String toString() {
        return "POICorrectActionInfo(poiId=" + this.f470660a + ", poiName=" + this.f470661b + ", poiAddress=" + this.f470662c + ", longitude=" + this.f470663d + ", latitude=" + this.f470664e + ')';
    }
}
