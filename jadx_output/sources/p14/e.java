package p14;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f351217a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f351218b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f351219c;

    public e(int i17, java.lang.String str, java.lang.String str2) {
        this.f351217a = i17;
        this.f351218b = str;
        this.f351219c = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p14.e)) {
            return false;
        }
        p14.e eVar = (p14.e) obj;
        return this.f351217a == eVar.f351217a && kotlin.jvm.internal.o.b(this.f351218b, eVar.f351218b) && kotlin.jvm.internal.o.b(this.f351219c, eVar.f351219c);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f351217a) * 31;
        java.lang.String str = this.f351218b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f351219c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "QRCodeExposeData(patternId=" + this.f351217a + ", qrUrl=" + this.f351218b + ", qrUrlWidthStyle=" + this.f351219c + ')';
    }
}
