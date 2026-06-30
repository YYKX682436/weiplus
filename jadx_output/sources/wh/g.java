package wh;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Boolean f445777a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Boolean f445778b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Boolean f445779c;

    /* renamed from: d, reason: collision with root package name */
    public final int f445780d;

    /* renamed from: e, reason: collision with root package name */
    public final int f445781e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Boolean f445782f;

    public g(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i17, int i18, java.lang.Boolean bool4) {
        this.f445777a = bool;
        this.f445778b = bool2;
        this.f445779c = bool3;
        this.f445780d = i17;
        this.f445781e = i18;
        this.f445782f = bool4;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh.g)) {
            return false;
        }
        wh.g gVar = (wh.g) obj;
        return kotlin.jvm.internal.o.b(this.f445777a, gVar.f445777a) && kotlin.jvm.internal.o.b(this.f445778b, gVar.f445778b) && kotlin.jvm.internal.o.b(this.f445779c, gVar.f445779c) && this.f445780d == gVar.f445780d && this.f445781e == gVar.f445781e && kotlin.jvm.internal.o.b(this.f445782f, gVar.f445782f);
    }

    public int hashCode() {
        java.lang.Boolean bool = this.f445777a;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        java.lang.Boolean bool2 = this.f445778b;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        java.lang.Boolean bool3 = this.f445779c;
        int hashCode3 = (((((hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + this.f445780d) * 31) + this.f445781e) * 31;
        java.lang.Boolean bool4 = this.f445782f;
        return hashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DeviceChargeSates(deviceChargingV1=" + this.f445777a + ", deviceChargingV2=" + this.f445778b + ", deviceChargingV3=" + this.f445779c + ", status=" + this.f445780d + ", plugged=" + this.f445781e + ", onBattery=" + this.f445782f + ")";
    }
}
