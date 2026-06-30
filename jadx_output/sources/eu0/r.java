package eu0;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f256736a;

    /* renamed from: b, reason: collision with root package name */
    public final int f256737b;

    /* renamed from: c, reason: collision with root package name */
    public final int f256738c;

    /* renamed from: d, reason: collision with root package name */
    public final int f256739d;

    /* renamed from: e, reason: collision with root package name */
    public final int f256740e;

    /* renamed from: f, reason: collision with root package name */
    public final int f256741f;

    public r(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f256736a = i17;
        this.f256737b = i18;
        this.f256738c = i19;
        this.f256739d = i27;
        this.f256740e = i28;
        this.f256741f = i29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu0.r)) {
            return false;
        }
        eu0.r rVar = (eu0.r) obj;
        return this.f256736a == rVar.f256736a && this.f256737b == rVar.f256737b && this.f256738c == rVar.f256738c && this.f256739d == rVar.f256739d && this.f256740e == rVar.f256740e && this.f256741f == rVar.f256741f;
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f256736a) * 31) + java.lang.Integer.hashCode(this.f256737b)) * 31) + java.lang.Integer.hashCode(this.f256738c)) * 31) + java.lang.Integer.hashCode(this.f256739d)) * 31) + java.lang.Integer.hashCode(this.f256740e)) * 31) + java.lang.Integer.hashCode(this.f256741f);
    }

    public java.lang.String toString() {
        return "TplVersionInfo(iOSSDKVersionMin=" + this.f256736a + ", iOSSDKVersionMax=" + this.f256737b + ", androidSDKVersionMin=" + this.f256738c + ", androidSDKVersionMax=" + this.f256739d + ", harmonySDKVersionMin=" + this.f256740e + ", harmonySDKVersionMax=" + this.f256741f + ')';
    }
}
