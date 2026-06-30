package ok4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f345966a;

    /* renamed from: b, reason: collision with root package name */
    public final int f345967b;

    /* renamed from: c, reason: collision with root package name */
    public final int f345968c;

    /* renamed from: d, reason: collision with root package name */
    public final int f345969d;

    /* renamed from: e, reason: collision with root package name */
    public final int f345970e;

    /* renamed from: f, reason: collision with root package name */
    public final int f345971f;

    /* renamed from: g, reason: collision with root package name */
    public final int f345972g;

    /* renamed from: h, reason: collision with root package name */
    public final long f345973h;

    /* renamed from: i, reason: collision with root package name */
    public final int f345974i;

    /* renamed from: j, reason: collision with root package name */
    public final int f345975j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f345976k;

    public b(int i17, int i18, int i19, int i27, int i28, int i29, int i37, long j17, int i38, int i39, boolean z17) {
        this.f345966a = i17;
        this.f345967b = i18;
        this.f345968c = i19;
        this.f345969d = i27;
        this.f345970e = i28;
        this.f345971f = i29;
        this.f345972g = i37;
        this.f345973h = j17;
        this.f345974i = i38;
        this.f345975j = i39;
        this.f345976k = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok4.b)) {
            return false;
        }
        ok4.b bVar = (ok4.b) obj;
        return this.f345966a == bVar.f345966a && this.f345967b == bVar.f345967b && this.f345968c == bVar.f345968c && this.f345969d == bVar.f345969d && this.f345970e == bVar.f345970e && this.f345971f == bVar.f345971f && this.f345972g == bVar.f345972g && this.f345973h == bVar.f345973h && this.f345974i == bVar.f345974i && this.f345975j == bVar.f345975j && this.f345976k == bVar.f345976k;
    }

    public int hashCode() {
        return (((((((((((((((((((java.lang.Integer.hashCode(this.f345966a) * 31) + java.lang.Integer.hashCode(this.f345967b)) * 31) + java.lang.Integer.hashCode(this.f345968c)) * 31) + java.lang.Integer.hashCode(this.f345969d)) * 31) + java.lang.Integer.hashCode(this.f345970e)) * 31) + java.lang.Integer.hashCode(this.f345971f)) * 31) + java.lang.Integer.hashCode(this.f345972g)) * 31) + java.lang.Long.hashCode(this.f345973h)) * 31) + java.lang.Integer.hashCode(this.f345974i)) * 31) + java.lang.Integer.hashCode(this.f345975j)) * 31) + java.lang.Boolean.hashCode(this.f345976k);
    }

    public java.lang.String toString() {
        return "Measurement(playDuration=" + this.f345966a + ", startWaitTime=" + this.f345967b + ", moovWaitTime=" + this.f345968c + ", bufferingCount=" + this.f345969d + ", avgBufferingDuration=" + this.f345970e + ", pageTime=" + this.f345971f + ", errorCode=" + this.f345972g + ", timeBeforeFirstFrame=" + this.f345973h + ", seekFlags=" + this.f345974i + ", maxProgressMilliseconds=" + this.f345975j + ", completed=" + this.f345976k + ')';
    }
}
