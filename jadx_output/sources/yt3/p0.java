package yt3;

/* loaded from: classes10.dex */
public final class p0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f465579d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465580e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f465581f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f465582g;

    /* renamed from: h, reason: collision with root package name */
    public qk.o9 f465583h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f465584i;

    /* renamed from: m, reason: collision with root package name */
    public ct0.b f465585m;

    /* renamed from: n, reason: collision with root package name */
    public ym5.x2 f465586n;

    /* renamed from: o, reason: collision with root package name */
    public l45.q f465587o;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.Context f465588p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f465589q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f465590r;

    /* renamed from: s, reason: collision with root package name */
    public qk.g6 f465591s;

    /* renamed from: t, reason: collision with root package name */
    public int f465592t;

    /* renamed from: u, reason: collision with root package name */
    public int f465593u;

    /* renamed from: v, reason: collision with root package name */
    public float f465594v;

    public p0(android.widget.FrameLayout photoLayout, ju3.d0 status) {
        kotlin.jvm.internal.o.g(photoLayout, "photoLayout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465579d = photoLayout;
        this.f465580e = status;
        this.f465581f = jz5.h.b(yt3.o0.f465558d);
        this.f465582g = jz5.h.b(yt3.n0.f465545d);
        this.f465588p = photoLayout.getContext();
        this.f465591s = qk.g6.DEFAULT;
        this.f465592t = -1;
        this.f465593u = -1;
        this.f465594v = 1.0f;
    }

    public static final void a(yt3.p0 p0Var, android.view.MotionEvent motionEvent) {
        p0Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            p0Var.f465590r = false;
            return;
        }
        ju3.d0 d0Var = p0Var.f465580e;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                p0Var.f465590r = true;
                ju3.d0.k(d0Var, ju3.c0.K1, null, 2, null);
                return;
            } else if (actionMasked != 5 && actionMasked != 6) {
                return;
            }
        }
        if (p0Var.f465590r) {
            ju3.d0.k(d0Var, ju3.c0.L1, null, 2, null);
        } else {
            ju3.d0.k(d0Var, ju3.c0.J1, null, 2, null);
        }
    }

    public final void b() {
        this.f465591s = qk.g6.DEFAULT;
        l45.q qVar = this.f465587o;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(qk.g6.CROP_PHOTO, 2, null);
        }
    }

    public final void c(yz5.l lVar) {
        nu3.i iVar = nu3.i.f340218a;
        qk.o9 o9Var = this.f465583h;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        kotlin.jvm.internal.o.d(b17);
        iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b17).b()));
        qk.o9 o9Var2 = this.f465583h;
        qk.v7 b18 = o9Var2 != null ? o9Var2.b() : null;
        kotlin.jvm.internal.o.d(b18);
        iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b18).e()));
        qk.o9 o9Var3 = this.f465583h;
        qk.v7 b19 = o9Var3 != null ? o9Var3.b() : null;
        kotlin.jvm.internal.o.d(b19);
        iVar.n("KEY_ADD_DOODLE_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b19).a()));
        qk.o9 o9Var4 = this.f465583h;
        qk.v7 b27 = o9Var4 != null ? o9Var4.b() : null;
        kotlin.jvm.internal.o.d(b27);
        iVar.n("KEY_ADD_DOODLE_COLOR_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b27).d()));
        qk.o9 o9Var5 = this.f465583h;
        qk.v7 b28 = o9Var5 != null ? o9Var5.b() : null;
        kotlin.jvm.internal.o.d(b28);
        iVar.n("KEY_ADD_MOSAIC_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b28).c()));
        qk.o9 o9Var6 = this.f465583h;
        qk.v7 b29 = o9Var6 != null ? o9Var6.b() : null;
        kotlin.jvm.internal.o.d(b29);
        iVar.n("KEY_ROTATE_INT", java.lang.Integer.valueOf(((f65.r) b29).h() ? 1 : 0));
        l45.q qVar = this.f465587o;
        iVar.n("KEY_ZOOM_IN_OUT_COUNT", java.lang.Integer.valueOf(qVar != null ? ((l45.n) qVar).f316476q : 0));
        iVar.n("KEY_AFTER_EDIT_INT", 1);
        nu3.m mVar = nu3.m.f340229a;
        int[] iArr = new int[3];
        qk.o9 o9Var7 = this.f465583h;
        qk.v7 b37 = o9Var7 != null ? o9Var7.b() : null;
        kotlin.jvm.internal.o.d(b37);
        iArr[0] = ((f65.r) b37).b();
        qk.o9 o9Var8 = this.f465583h;
        qk.v7 b38 = o9Var8 != null ? o9Var8.b() : null;
        kotlin.jvm.internal.o.d(b38);
        iArr[1] = ((f65.r) b38).e();
        iArr[2] = -1;
        mVar.g(iArr);
        mVar.i(1, 2L);
        qk.o9 o9Var9 = this.f465583h;
        qk.v7 b39 = o9Var9 != null ? o9Var9.b() : null;
        kotlin.jvm.internal.o.d(b39);
        boolean g17 = ((f65.r) b39).g();
        iVar.n("KEY_PHOTO_IS_EDITED_BOOLEAN", java.lang.Boolean.valueOf(g17));
        if (g17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 118L, 1L, false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 127L, 1L, false);
        if (this.f465589q) {
            return;
        }
        android.content.Context context = this.f465588p;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        if (((android.app.Activity) context).isFinishing()) {
            return;
        }
        this.f465589q = true;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "dofinish time: " + elapsedRealtime + ' ' + g17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l45.q qVar2 = this.f465587o;
        if (qVar2 != null) {
            arrayList.addAll(((l45.n) qVar2).j());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doFinish: currentSelectedEmojiList size=");
        l45.q qVar3 = this.f465587o;
        sb6.append(qVar3 != null ? java.lang.Integer.valueOf(((java.util.ArrayList) ((l45.n) qVar3).j()).size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", sb6.toString());
        qk.o9 o9Var10 = this.f465583h;
        if (o9Var10 != null) {
            o9Var10.g(new yt3.i0(elapsedRealtime, this, arrayList, g17, lVar), true);
        }
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        qk.g6 g6Var = this.f465591s;
        qk.g6 g6Var2 = qk.g6.CROP_PHOTO;
        if (g6Var != g6Var2) {
            return false;
        }
        this.f465591s = qk.g6.DEFAULT;
        l45.q qVar = this.f465587o;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(g6Var2, 1, null);
        }
        return true;
    }

    @Override // yt3.r2
    public void release() {
        java.lang.Object value = ((jz5.n) this.f465581f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((qk.o9) value).f();
        java.lang.Object value2 = ((jz5.n) this.f465582g).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((qk.o9) value2).f();
        android.widget.FrameLayout frameLayout = this.f465579d;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        l45.q qVar = this.f465587o;
        if (qVar != null) {
            ((l45.n) qVar).p();
        }
    }

    @Override // yt3.r2
    public void reset() {
        qk.g6 g6Var = qk.g6.DEFAULT;
        this.f465591s = g6Var;
        l45.q qVar = this.f465587o;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f465587o;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, -1, null);
        }
    }
}
