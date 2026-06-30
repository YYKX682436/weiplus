package st3;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f412573a;

    /* renamed from: b, reason: collision with root package name */
    public int f412574b;

    /* renamed from: c, reason: collision with root package name */
    public int f412575c;

    /* renamed from: d, reason: collision with root package name */
    public int f412576d;

    /* renamed from: e, reason: collision with root package name */
    public int f412577e;

    /* renamed from: f, reason: collision with root package name */
    public int f412578f;

    /* renamed from: g, reason: collision with root package name */
    public int f412579g;

    /* renamed from: h, reason: collision with root package name */
    public int f412580h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f412581i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f412582j;

    /* renamed from: k, reason: collision with root package name */
    public int f412583k;

    /* renamed from: l, reason: collision with root package name */
    public int f412584l;

    /* renamed from: m, reason: collision with root package name */
    public int f412585m;

    /* renamed from: n, reason: collision with root package name */
    public int f412586n;

    public r(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, boolean z18, int i39, int i47, int i48, int i49, int i57, kotlin.jvm.internal.i iVar) {
        int i58 = (i57 & 1) != 0 ? 0 : i17;
        int i59 = (i57 & 2) != 0 ? 0 : i18;
        int i66 = (i57 & 4) != 0 ? 0 : i19;
        int i67 = (i57 & 8) != 0 ? 0 : i27;
        int i68 = (i57 & 16) != 0 ? 0 : i28;
        int i69 = (i57 & 32) != 0 ? 0 : i29;
        int i76 = (i57 & 64) != 0 ? 0 : i37;
        int i77 = (i57 & 128) != 0 ? 1 : i38;
        boolean z19 = (i57 & 256) != 0 ? false : z17;
        boolean z27 = (i57 & 512) != 0 ? false : z18;
        int i78 = (i57 & 1024) != 0 ? 0 : i39;
        int i79 = (i57 & 2048) != 0 ? 0 : i47;
        int i86 = (i57 & 4096) != 0 ? 0 : i48;
        int i87 = (i57 & 8192) == 0 ? i49 : 0;
        this.f412573a = i58;
        this.f412574b = i59;
        this.f412575c = i66;
        this.f412576d = i67;
        this.f412577e = i68;
        this.f412578f = i69;
        this.f412579g = i76;
        this.f412580h = i77;
        this.f412581i = z19;
        this.f412582j = z27;
        this.f412583k = i78;
        this.f412584l = i79;
        this.f412585m = i86;
        this.f412586n = i87;
    }

    public final int a() {
        return this.f412574b;
    }

    public final int b() {
        return this.f412573a;
    }

    public final int c() {
        return this.f412578f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st3.r)) {
            return false;
        }
        st3.r rVar = (st3.r) obj;
        return this.f412573a == rVar.f412573a && this.f412574b == rVar.f412574b && this.f412575c == rVar.f412575c && this.f412576d == rVar.f412576d && this.f412577e == rVar.f412577e && this.f412578f == rVar.f412578f && this.f412579g == rVar.f412579g && this.f412580h == rVar.f412580h && this.f412581i == rVar.f412581i && this.f412582j == rVar.f412582j && this.f412583k == rVar.f412583k && this.f412584l == rVar.f412584l && this.f412585m == rVar.f412585m && this.f412586n == rVar.f412586n;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((java.lang.Integer.hashCode(this.f412573a) * 31) + java.lang.Integer.hashCode(this.f412574b)) * 31) + java.lang.Integer.hashCode(this.f412575c)) * 31) + java.lang.Integer.hashCode(this.f412576d)) * 31) + java.lang.Integer.hashCode(this.f412577e)) * 31) + java.lang.Integer.hashCode(this.f412578f)) * 31) + java.lang.Integer.hashCode(this.f412579g)) * 31) + java.lang.Integer.hashCode(this.f412580h)) * 31) + java.lang.Boolean.hashCode(this.f412581i)) * 31) + java.lang.Boolean.hashCode(this.f412582j)) * 31) + java.lang.Integer.hashCode(this.f412583k)) * 31) + java.lang.Integer.hashCode(this.f412584l)) * 31) + java.lang.Integer.hashCode(this.f412585m)) * 31) + java.lang.Integer.hashCode(this.f412586n);
    }

    public java.lang.String toString() {
        return "EncodeConfig(targetWidth=" + this.f412573a + ", targetHeight=" + this.f412574b + ", videoBitrate=" + this.f412575c + ", audioBitrate=" + this.f412576d + ", frameRate=" + this.f412577e + ", videoRotate=" + this.f412578f + ", audioSampleRate=" + this.f412579g + ", audioChannelCount=" + this.f412580h + ", needRemux=" + this.f412581i + ", change=" + this.f412582j + ", qpmin=" + this.f412583k + ", qpmax=" + this.f412584l + ", isEnable1080P=" + this.f412586n + ')';
    }
}
