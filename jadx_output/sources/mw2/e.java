package mw2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f331709a;

    /* renamed from: b, reason: collision with root package name */
    public final int f331710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f331711c;

    /* renamed from: d, reason: collision with root package name */
    public final int f331712d;

    public e(int i17, int i18, int i19, int i27) {
        this.f331709a = i17;
        this.f331710b = i18;
        this.f331711c = i19;
        this.f331712d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw2.e)) {
            return false;
        }
        mw2.e eVar = (mw2.e) obj;
        return this.f331709a == eVar.f331709a && this.f331710b == eVar.f331710b && this.f331711c == eVar.f331711c && this.f331712d == eVar.f331712d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f331709a) * 31) + java.lang.Integer.hashCode(this.f331710b)) * 31) + java.lang.Integer.hashCode(this.f331711c)) * 31) + java.lang.Integer.hashCode(this.f331712d);
    }

    public java.lang.String toString() {
        return "SpriteCropInfo(left=" + this.f331709a + ", top=" + this.f331710b + ", cropWidth=" + this.f331711c + ", cropHeight=" + this.f331712d + ')';
    }
}
