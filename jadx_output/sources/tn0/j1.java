package tn0;

/* loaded from: classes3.dex */
public final class j1 {

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f420696p;

    /* renamed from: q, reason: collision with root package name */
    public static final jz5.g f420697q;

    /* renamed from: a, reason: collision with root package name */
    public final tn0.w0 f420698a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f420699b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f420700c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.Surface f420701d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f420702e;

    /* renamed from: f, reason: collision with root package name */
    public go0.v0 f420703f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f420704g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f420705h;

    /* renamed from: i, reason: collision with root package name */
    public final android.util.Size f420706i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Point f420707j;

    /* renamed from: k, reason: collision with root package name */
    public android.util.Size f420708k;

    /* renamed from: l, reason: collision with root package name */
    public android.util.Size f420709l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Point f420710m;

    /* renamed from: n, reason: collision with root package name */
    public int f420711n;

    /* renamed from: o, reason: collision with root package name */
    public int f420712o;

    static {
        new tn0.a1(null);
        f420696p = jz5.h.b(tn0.z0.f420792d);
        f420697q = jz5.h.b(tn0.y0.f420789d);
    }

    public j1(tn0.w0 absLiveTRTCCore) {
        kotlin.jvm.internal.o.g(absLiveTRTCCore, "absLiveTRTCCore");
        this.f420698a = absLiveTRTCCore;
        this.f420700c = jz5.h.b(tn0.f1.f420667d);
        this.f420704g = new com.tencent.mm.sdk.platformtools.b4("liveScreenShareTimer", (com.tencent.mm.sdk.platformtools.a4) new tn0.h1(this), true);
        this.f420705h = jz5.h.b(tn0.d1.f420661d);
        this.f420706i = new android.util.Size(((java.lang.Number) ((jz5.n) jz5.h.b(tn0.i1.f420683d)).getValue()).intValue(), ((java.lang.Number) ((jz5.n) jz5.h.b(tn0.e1.f420664d)).getValue()).intValue());
        this.f420707j = new android.graphics.Point(0, 0);
        jz5.g gVar = f420696p;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        jz5.g gVar2 = f420697q;
        this.f420708k = new android.util.Size(intValue, ((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue());
        this.f420709l = new android.util.Size(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), ((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue());
        this.f420710m = new android.graphics.Point(com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 16), 0);
    }

    public final android.graphics.Point a() {
        return (android.graphics.Point) ((jz5.n) this.f420700c).getValue();
    }

    public final void b() {
        go0.v0 v0Var = this.f420703f;
        if (v0Var != null) {
            v0Var.f273878e.removeCallbacksAndMessages(null);
            android.os.HandlerThread handlerThread = v0Var.f273879f;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            go0.b1 b1Var = v0Var.f273880g;
            if (b1Var != null) {
                b1Var.n();
            }
            rs0.h hVar = v0Var.f273885l;
            if (hVar != null) {
                rs0.i.f399296a.u(hVar);
            }
            android.view.Surface surface = v0Var.f273884k;
            if (surface != null) {
                surface.release();
            }
            android.graphics.SurfaceTexture surfaceTexture = v0Var.f273881h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
        this.f420703f = null;
        this.f420701d = null;
        this.f420702e = null;
        a().set(0, 0);
        this.f420704g.d();
        this.f420711n = 0;
        this.f420712o = 0;
    }

    public final void c(int i17, int i18) {
        if (i17 == this.f420708k.getWidth() && i18 == this.f420708k.getHeight()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("LiveTrtcCoreScreenShare", "updatePreviewSize from:" + this.f420708k + " to:" + i17 + '*' + i18);
        this.f420708k = new android.util.Size(i17, i18);
    }
}
