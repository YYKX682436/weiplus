package vf3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f436372a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436373b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f436374c;

    /* renamed from: d, reason: collision with root package name */
    public final int f436375d;

    /* renamed from: e, reason: collision with root package name */
    public final int f436376e;

    public d(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18) {
        this.f436372a = str;
        this.f436373b = str2;
        this.f436374c = z17;
        this.f436375d = i17;
        this.f436376e = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf3.d)) {
            return false;
        }
        vf3.d dVar = (vf3.d) obj;
        return kotlin.jvm.internal.o.b(this.f436372a, dVar.f436372a) && kotlin.jvm.internal.o.b(this.f436373b, dVar.f436373b) && this.f436374c == dVar.f436374c && this.f436375d == dVar.f436375d && this.f436376e == dVar.f436376e;
    }

    public int hashCode() {
        java.lang.String str = this.f436372a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f436373b;
        return ((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f436374c)) * 31) + java.lang.Integer.hashCode(this.f436375d)) * 31) + java.lang.Integer.hashCode(this.f436376e);
    }

    public java.lang.String toString() {
        return "LiveParsedInfo(videoCodeCTAG=" + this.f436372a + ", audioCodeCTAG=" + this.f436373b + ", isAudioSupported=" + this.f436374c + ", imageWidth=" + this.f436375d + ", imageHeight=" + this.f436376e + ')';
    }
}
