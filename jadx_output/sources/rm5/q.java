package rm5;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.Size f397536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f397537b;

    /* renamed from: c, reason: collision with root package name */
    public final int f397538c;

    /* renamed from: d, reason: collision with root package name */
    public final int f397539d;

    /* renamed from: e, reason: collision with root package name */
    public final int f397540e;

    /* renamed from: f, reason: collision with root package name */
    public final int f397541f;

    /* renamed from: g, reason: collision with root package name */
    public final int f397542g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f397543h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f397544i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f397545j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f397546k;

    /* renamed from: l, reason: collision with root package name */
    public int f397547l;

    /* renamed from: m, reason: collision with root package name */
    public final android.util.Size f397548m;

    /* renamed from: n, reason: collision with root package name */
    public int f397549n;

    /* renamed from: o, reason: collision with root package name */
    public int f397550o;

    /* renamed from: p, reason: collision with root package name */
    public int f397551p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f397552q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f397553r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f397554s;

    /* renamed from: t, reason: collision with root package name */
    public long f397555t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f397556u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f397557v;

    /* renamed from: w, reason: collision with root package name */
    public int f397558w;

    /* renamed from: x, reason: collision with root package name */
    public final int f397559x;

    /* renamed from: y, reason: collision with root package name */
    public int f397560y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f397561z;

    public q(android.util.Size targetSize, int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, boolean z18, boolean z19, boolean z27, int i37, android.util.Size size, int i38, kotlin.jvm.internal.i iVar) {
        int i39 = (i38 & 8) != 0 ? 1 : i19;
        int i47 = (i38 & 16) != 0 ? 48000 : i27;
        int i48 = (i38 & 32) != 0 ? 44100 : i28;
        int i49 = (i38 & 64) != 0 ? 1 : i29;
        boolean z28 = (i38 & 128) != 0 ? true : z17;
        boolean z29 = (i38 & 256) != 0 ? false : z18;
        boolean z37 = (i38 & 512) != 0 ? true : z19;
        boolean z38 = (i38 & 1024) == 0 ? z27 : false;
        int i57 = (i38 & 2048) != 0 ? -1 : i37;
        android.util.Size size2 = (i38 & 4096) != 0 ? null : size;
        kotlin.jvm.internal.o.g(targetSize, "targetSize");
        this.f397536a = targetSize;
        this.f397537b = i17;
        this.f397538c = i18;
        this.f397539d = i39;
        this.f397540e = i47;
        this.f397541f = i48;
        this.f397542g = i49;
        this.f397543h = z28;
        this.f397544i = z29;
        this.f397545j = z37;
        this.f397546k = z38;
        this.f397547l = i57;
        this.f397548m = size2;
        this.f397552q = true;
        this.f397553r = true;
        this.f397555t = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        this.f397558w = -1;
        this.f397559x = -1;
        this.f397560y = -1;
        this.f397561z = "";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm5.q)) {
            return false;
        }
        rm5.q qVar = (rm5.q) obj;
        return kotlin.jvm.internal.o.b(this.f397536a, qVar.f397536a) && this.f397537b == qVar.f397537b && this.f397538c == qVar.f397538c && this.f397539d == qVar.f397539d && this.f397540e == qVar.f397540e && this.f397541f == qVar.f397541f && this.f397542g == qVar.f397542g && this.f397543h == qVar.f397543h && this.f397544i == qVar.f397544i && this.f397545j == qVar.f397545j && this.f397546k == qVar.f397546k && this.f397547l == qVar.f397547l && kotlin.jvm.internal.o.b(this.f397548m, qVar.f397548m);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.f397536a.hashCode() * 31) + java.lang.Integer.hashCode(this.f397537b)) * 31) + java.lang.Integer.hashCode(this.f397538c)) * 31) + java.lang.Integer.hashCode(this.f397539d)) * 31) + java.lang.Integer.hashCode(this.f397540e)) * 31) + java.lang.Integer.hashCode(this.f397541f)) * 31) + java.lang.Integer.hashCode(this.f397542g)) * 31) + java.lang.Boolean.hashCode(this.f397543h)) * 31) + java.lang.Boolean.hashCode(this.f397544i)) * 31) + java.lang.Boolean.hashCode(this.f397545j)) * 31) + java.lang.Boolean.hashCode(this.f397546k)) * 31) + java.lang.Integer.hashCode(this.f397547l)) * 31;
        android.util.Size size = this.f397548m;
        return hashCode + (size == null ? 0 : size.hashCode());
    }

    public java.lang.String toString() {
        return "VideoOutputConfig(targetSize=" + this.f397536a + ", videoBitrate=" + this.f397537b + ", fps=" + this.f397538c + ", iFrameInterval=" + this.f397539d + ", audioBitrate=" + this.f397540e + ", audioSampleRate=" + this.f397541f + ", audioChannelCount=" + this.f397542g + ", highProfileEnable=" + this.f397543h + ", limitProfileLevelEnable=" + this.f397544i + ", aacEncodeNeedCodecSpecificData=" + this.f397545j + ", outputHevc=" + this.f397546k + ", suggestParallelCount=" + this.f397547l + ", renderSize=" + this.f397548m + ')';
    }
}
