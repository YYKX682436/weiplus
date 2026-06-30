package yt3;

/* loaded from: classes10.dex */
public final class b2 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f465355d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465356e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f465357f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f465358g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f465359h;

    /* renamed from: i, reason: collision with root package name */
    public qk.o9 f465360i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f465361m;

    /* renamed from: n, reason: collision with root package name */
    public ct0.b f465362n;

    /* renamed from: o, reason: collision with root package name */
    public ym5.x2 f465363o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f465364p;

    /* renamed from: q, reason: collision with root package name */
    public l45.q f465365q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f465366r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f465367s;

    /* renamed from: t, reason: collision with root package name */
    public qk.g6 f465368t;

    /* renamed from: u, reason: collision with root package name */
    public final int f465369u;

    /* renamed from: v, reason: collision with root package name */
    public final float f465370v;

    public b2(android.widget.FrameLayout photoLayout, ju3.d0 status) {
        kotlin.jvm.internal.o.g(photoLayout, "photoLayout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465355d = photoLayout;
        this.f465356e = status;
        this.f465357f = jz5.h.b(yt3.v1.f465699d);
        this.f465358g = jz5.h.b(yt3.u1.f465688d);
        jz5.h.b(new yt3.w1(this));
        jz5.h.b(new yt3.y1(this));
        jz5.h.b(new yt3.x1(this));
        jz5.h.b(yt3.z1.f465736d);
        this.f465359h = jz5.h.b(new yt3.a2(this));
        this.f465364p = java.lang.String.valueOf(java.lang.System.currentTimeMillis() + hashCode());
        this.f465366r = photoLayout.getContext();
        this.f465368t = qk.g6.DEFAULT;
        this.f465369u = -1;
        this.f465370v = 1.0f;
    }

    public final void a(boolean z17, yz5.l lVar) {
        qk.o9 o9Var = this.f465360i;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        kotlin.jvm.internal.o.d(b17);
        boolean g17 = ((f65.r) b17).g();
        if (z17 && !g17) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f465361m;
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, "", recordConfigProvider != null ? recordConfigProvider.D : null, -1L, bool, nu3.i.f340218a.l());
            if (lVar != null) {
                lVar.invoke(captureDataManager$CaptureVideoNormalModel);
                return;
            }
            return;
        }
        if (g17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 118L, 1L, false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 127L, 1L, false);
        if (this.f465367s) {
            return;
        }
        android.content.Context context = this.f465366r;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        if (((android.app.Activity) context).isFinishing()) {
            return;
        }
        this.f465367s = true;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "dofinish time: " + elapsedRealtime + ' ' + g17);
        qk.o9 o9Var2 = this.f465360i;
        if (o9Var2 != null) {
            o9Var2.g(new yt3.s1(elapsedRealtime, this, z17, lVar), false);
        }
    }

    public final boolean b() {
        l45.q qVar = this.f465365q;
        if (qVar != null) {
            dl.t tVar = (dl.t) ((l45.n) qVar).d(qk.g6.CROP_PHOTO);
            if (tVar != null) {
                return tVar.Z;
            }
        }
        return false;
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        qk.g6 g6Var = this.f465368t;
        qk.g6 g6Var2 = qk.g6.CROP_PHOTO;
        if (g6Var != g6Var2) {
            return false;
        }
        this.f465368t = qk.g6.DEFAULT;
        l45.q qVar = this.f465365q;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(g6Var2, 1, null);
        }
        return true;
    }

    @Override // yt3.r2
    public void release() {
        java.lang.Object value = ((jz5.n) this.f465357f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((qk.o9) value).f();
        java.lang.Object value2 = ((jz5.n) this.f465358g).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((qk.o9) value2).f();
        android.widget.FrameLayout frameLayout = this.f465355d;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        l45.q qVar = this.f465365q;
        if (qVar != null) {
            ((l45.n) qVar).p();
        }
    }

    @Override // yt3.r2
    public void reset() {
        qk.g6 g6Var = qk.g6.DEFAULT;
        this.f465368t = g6Var;
        l45.q qVar = this.f465365q;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f465365q;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, -1, null);
        }
    }
}
