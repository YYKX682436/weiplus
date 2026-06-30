package xh2;

/* loaded from: classes3.dex */
public final class i extends hn5.b {

    /* renamed from: e, reason: collision with root package name */
    public int f454553e;

    /* renamed from: f, reason: collision with root package name */
    public final int f454554f;

    /* renamed from: g, reason: collision with root package name */
    public final int f454555g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f454556h;

    /* renamed from: i, reason: collision with root package name */
    public int f454557i;

    /* renamed from: j, reason: collision with root package name */
    public final int f454558j;

    /* renamed from: k, reason: collision with root package name */
    public final long f454559k;

    public /* synthetic */ i(float f17, float f18, float f19, float f27, int i17, int i18, int i19, boolean z17, int i27, int i28, long j17, int i29, kotlin.jvm.internal.i iVar) {
        this(f17, f18, f19, f27, (i29 & 16) != 0 ? 0 : i17, (i29 & 32) != 0 ? 0 : i18, (i29 & 64) != 0 ? 0 : i19, (i29 & 128) != 0 ? false : z17, (i29 & 256) != 0 ? 0 : i27, (i29 & 512) != 0 ? 0 : i28, (i29 & 1024) != 0 ? 0L : j17);
    }

    public final xh2.i a() {
        return new xh2.i(this.f282609a, this.f282610b, this.f282611c, this.f282612d, this.f454553e, this.f454554f, this.f454555g, this.f454556h, this.f454557i, this.f454558j, this.f454559k);
    }

    @Override // hn5.b
    public java.lang.String toString() {
        return "x:" + this.f282609a + ", y:" + this.f282610b + ", w:" + this.f282611c + ", h:" + this.f282612d + " zOrder: " + this.f454554f + ", force: " + this.f454555g + " location: " + this.f454553e + " isGrabLayout: " + this.f454556h + " us: " + this.f454557i + " st: " + this.f454558j + " mt: " + this.f454559k;
    }

    public i(float f17, float f18, float f19, float f27, int i17, int i18, int i19, boolean z17, int i27, int i28, long j17) {
        super(f17, f18, f19, f27);
        this.f454553e = i17;
        this.f454554f = i18;
        this.f454555g = i19;
        this.f454556h = z17;
        this.f454557i = i27;
        this.f454558j = i28;
        this.f454559k = j17;
    }
}
