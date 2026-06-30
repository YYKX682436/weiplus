package tt3;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f422028a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f422029b;

    /* renamed from: c, reason: collision with root package name */
    public int f422030c;

    /* renamed from: d, reason: collision with root package name */
    public int f422031d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f422032e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f422033f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f422034g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f422035h;

    /* renamed from: i, reason: collision with root package name */
    public int f422036i;

    public a(int i17, boolean z17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 1) != 0 ? 2 : i17;
        z17 = (i27 & 2) != 0 ? true : z17;
        i18 = (i27 & 4) != 0 ? 0 : i18;
        i19 = (i27 & 8) != 0 ? 0 : i19;
        this.f422028a = i17;
        this.f422029b = z17;
        this.f422030c = i18;
        this.f422031d = i19;
        this.f422035h = true;
        this.f422036i = 10;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt3.a)) {
            return false;
        }
        tt3.a aVar = (tt3.a) obj;
        return this.f422028a == aVar.f422028a && this.f422029b == aVar.f422029b && this.f422030c == aVar.f422030c && this.f422031d == aVar.f422031d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f422028a) * 31) + java.lang.Boolean.hashCode(this.f422029b)) * 31) + java.lang.Integer.hashCode(this.f422030c)) * 31) + java.lang.Integer.hashCode(this.f422031d);
    }

    public java.lang.String toString() {
        return "StoryBasicConfig(repeatMD5=" + this.f422028a + ", showMusicIcon=" + this.f422029b + ", albumThumbHeight=" + this.f422030c + ", albumThumbWidth=" + this.f422031d + ')';
    }
}
