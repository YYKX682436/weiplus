package ls0;

/* loaded from: classes10.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f320941a;

    /* renamed from: b, reason: collision with root package name */
    public int f320942b;

    /* renamed from: c, reason: collision with root package name */
    public final ls0.b1 f320943c;

    /* renamed from: d, reason: collision with root package name */
    public final hs0.a f320944d;

    /* renamed from: e, reason: collision with root package name */
    public int f320945e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f320946f;

    /* renamed from: g, reason: collision with root package name */
    public final int f320947g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f320948h;

    /* renamed from: i, reason: collision with root package name */
    public final int f320949i;

    /* renamed from: j, reason: collision with root package name */
    public final int f320950j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.l f320951k;

    /* renamed from: l, reason: collision with root package name */
    public final yz5.p f320952l;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.q f320953m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f320954n;

    /* renamed from: o, reason: collision with root package name */
    public final yz5.a f320955o;

    public w0(ls0.b1 mixMuxerController, hs0.a aVar, java.lang.String outputFilePath, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(mixMuxerController, "mixMuxerController");
        kotlin.jvm.internal.o.g(outputFilePath, "outputFilePath");
        this.f320941a = "MicroMsg.RemuxerCallback";
        this.f320946f = "";
        this.f320948h = "";
        this.f320952l = new ls0.v0(this);
        this.f320953m = new ls0.s0(this);
        this.f320954n = new ls0.u0(this);
        this.f320955o = new ls0.t0(this);
        this.f320948h = outputFilePath + '_' + java.lang.System.currentTimeMillis() + ".mp4";
        this.f320943c = mixMuxerController;
        this.f320944d = aVar;
        this.f320946f = outputFilePath;
        this.f320949i = i18;
        this.f320950j = i19;
        this.f320947g = i17;
    }
}
