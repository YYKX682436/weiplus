package so5;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte f410785a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f410786b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f410787c;

    /* renamed from: d, reason: collision with root package name */
    public final byte f410788d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f410789e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f410790f;

    /* renamed from: g, reason: collision with root package name */
    public final int f410791g;

    public a(byte b17, byte b18, byte b19, byte b27, byte b28, byte b29, int i17) {
        this.f410785a = b17;
        this.f410786b = b18;
        this.f410787c = b19;
        this.f410788d = b27;
        this.f410789e = b28;
        this.f410790f = b29;
        this.f410791g = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so5.a)) {
            return false;
        }
        so5.a aVar = (so5.a) obj;
        return this.f410785a == aVar.f410785a && this.f410786b == aVar.f410786b && this.f410787c == aVar.f410787c && this.f410788d == aVar.f410788d && this.f410789e == aVar.f410789e && this.f410790f == aVar.f410790f && this.f410791g == aVar.f410791g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Byte.hashCode(this.f410785a) * 31) + java.lang.Byte.hashCode(this.f410786b)) * 31) + java.lang.Byte.hashCode(this.f410787c)) * 31) + java.lang.Byte.hashCode(this.f410788d)) * 31) + java.lang.Byte.hashCode(this.f410789e)) * 31) + java.lang.Byte.hashCode(this.f410790f)) * 31) + java.lang.Integer.hashCode(this.f410791g);
    }

    public java.lang.String toString() {
        return "CodecConfig(codecIdx=" + ((int) this.f410785a) + ", sizeIdx=" + ((int) this.f410786b) + ", fps=" + ((int) this.f410787c) + ", iPeriod=" + ((int) this.f410788d) + ", interval=" + ((int) this.f410789e) + ", rsLevel=" + ((int) this.f410790f) + ", bitrate=" + this.f410791g + ')';
    }
}
