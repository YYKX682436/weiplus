package vo4;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f438630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f438631b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f438632c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f438633d;

    /* renamed from: e, reason: collision with root package name */
    public final vo4.r f438634e;

    /* renamed from: f, reason: collision with root package name */
    public os0.b f438635f;

    /* renamed from: g, reason: collision with root package name */
    public vo4.t f438636g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f438637h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f438638i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f438639j;

    /* renamed from: k, reason: collision with root package name */
    public final float f438640k;

    /* renamed from: l, reason: collision with root package name */
    public final float f438641l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f438642m;

    /* renamed from: n, reason: collision with root package name */
    public long f438643n;

    /* renamed from: o, reason: collision with root package name */
    public int f438644o;

    /* renamed from: p, reason: collision with root package name */
    public final int f438645p;

    /* renamed from: q, reason: collision with root package name */
    public final int f438646q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Rect f438647r;

    public i(int i17, int i18, boolean z17, boolean z18) {
        this.f438630a = i17;
        this.f438631b = i18;
        this.f438632c = z17;
        this.f438633d = z18;
        this.f438634e = new vo4.r(z18);
        this.f438640k = 1.0f;
        this.f438641l = 1.0f;
        this.f438643n = -1L;
    }

    public static void a(vo4.i iVar, android.graphics.Bitmap bitmap, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        vo4.t tVar;
        android.graphics.Bitmap bitmap2 = (i17 & 1) != 0 ? null : bitmap;
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        yz5.a aVar2 = (i17 & 4) != 0 ? null : aVar;
        if (iVar.f438642m && (tVar = iVar.f438636g) != null) {
            tVar.b(new vo4.c(iVar, tVar, bitmap2, z18, aVar2));
        }
    }

    public final void b(android.graphics.Rect rect) {
        if (rect != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogDirector", "setCropRect:" + rect + ", width:" + this.f438630a + ", height:" + this.f438631b + ", textureWidth:" + this.f438645p + ", textureHeight:" + this.f438646q);
            android.graphics.Rect rect2 = new android.graphics.Rect(rect);
            this.f438647r = rect2;
            os0.b bVar = this.f438635f;
            if (bVar != null) {
                bVar.f348008q = rect2;
            }
        }
    }

    public final void c(int i17, int i18) {
        vo4.r rVar = this.f438634e;
        rVar.getClass();
        rVar.f438678g = 1000 / i17;
        rVar.f438679h = 1000 / i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptReader", "videoPtsStep :" + rVar.f438678g + " imagePtsStep:" + rVar.f438679h);
    }

    public final void d(vo4.t vLogSurface) {
        kotlin.jvm.internal.o.g(vLogSurface, "vLogSurface");
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogDirector", hashCode() + " setSurface");
        this.f438636g = vLogSurface;
        vLogSurface.b(new vo4.h(this, vLogSurface));
    }

    public i(int i17, int i18, int i19, int i27, float f17, float f18, boolean z17, boolean z18) {
        this(i17, i18, z17, z18);
        this.f438640k = f17;
        this.f438641l = f18;
        this.f438645p = i19;
        this.f438646q = i27;
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogDirector", "create VLogDirector, scale:[" + f17 + ", " + f18 + "], texture:[" + i19 + ", " + i27 + ']');
    }
}
