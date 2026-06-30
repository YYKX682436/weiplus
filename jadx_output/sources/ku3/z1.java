package ku3;

/* loaded from: classes3.dex */
public final class z1 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f312493d;

    /* renamed from: e, reason: collision with root package name */
    public final zt3.a f312494e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f312495f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f312496g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f312497h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f312498i;

    /* renamed from: m, reason: collision with root package name */
    public st3.q f312499m;

    /* renamed from: n, reason: collision with root package name */
    public int f312500n;

    /* renamed from: o, reason: collision with root package name */
    public int f312501o;

    /* renamed from: p, reason: collision with root package name */
    public int f312502p;

    public z1(android.view.ViewGroup parent, ju3.d0 status, zt3.a kitContext) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        this.f312493d = parent;
        this.f312494e = kitContext;
        this.f312495f = jz5.h.b(new ku3.s1(this));
        this.f312496g = jz5.h.b(new ku3.v1(this));
        this.f312497h = jz5.h.b(new ku3.q1(this));
        this.f312498i = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public static final void a(ku3.z1 z1Var, bs0.f ratioType, float f17) {
        jz5.l lVar;
        jz5.l lVar2;
        z1Var.getClass();
        kotlin.jvm.internal.o.g(ratioType, "ratioType");
        st3.q qVar = z1Var.f312499m;
        int i17 = qVar == null ? -1 : ku3.p1.f312359a[qVar.ordinal()];
        if (i17 != 1) {
            if (i17 != 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInBottomCase >> " + ratioType);
                int ordinal = ratioType.ordinal();
                if (ordinal != 0) {
                    android.view.ViewGroup viewGroup = z1Var.f312493d;
                    if (ordinal != 1) {
                        int i18 = st3.p.f412567g;
                        int i19 = st3.p.f412562b;
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInBottomCase >> " + i18 + ", " + i19);
                        if (i19 <= i18) {
                            int a17 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 30);
                            z1Var.f312501o = 4;
                            z1Var.f312502p = a17;
                            lVar2 = new jz5.l(java.lang.Integer.valueOf(a17 - z1Var.f312500n), java.lang.Integer.valueOf(a17));
                        } else {
                            int i27 = (st3.p.f412566f - i18) - st3.p.f412563c;
                            com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 136);
                            i65.a.b(viewGroup.getContext(), 4);
                            z1Var.f312501o = 4;
                            z1Var.f312502p = i27;
                            lVar = new jz5.l(java.lang.Integer.valueOf(i27 - z1Var.f312500n), java.lang.Integer.valueOf(i27));
                        }
                    } else {
                        int i28 = (int) ((st3.p.f412567g * 4) / 3.0f);
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInBottomCase >> " + i28);
                        int i29 = (st3.p.f412566f - i28) - st3.p.f412563c;
                        com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 136);
                        i65.a.b(viewGroup.getContext(), 4);
                        z1Var.f312501o = 4;
                        z1Var.f312502p = i29;
                        lVar = new jz5.l(java.lang.Integer.valueOf(i29 - z1Var.f312500n), java.lang.Integer.valueOf(i29));
                    }
                } else {
                    z1Var.f312501o = 3;
                    z1Var.f312502p = z1Var.f312500n;
                    lVar2 = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f312500n));
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInCenterCase >> " + ratioType);
                int ordinal2 = ratioType.ordinal();
                if (ordinal2 == 0) {
                    z1Var.f312501o = 2;
                    z1Var.f312502p = z1Var.f312500n;
                    lVar = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f312500n));
                } else if (ordinal2 != 1) {
                    int i37 = st3.p.f412567g;
                    int i38 = st3.p.f412562b;
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInCenterCase >> " + i37 + ", " + i38);
                    if (i38 <= i37) {
                        z1Var.f312501o = 4;
                        z1Var.f312502p = z1Var.f312500n;
                        lVar = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f312500n));
                    } else {
                        int a18 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 88) + ((i38 - i37) / 2);
                        z1Var.f312501o = 4;
                        z1Var.f312502p = a18;
                        lVar = new jz5.l(java.lang.Integer.valueOf(a18 - z1Var.f312500n), java.lang.Integer.valueOf(a18));
                    }
                } else {
                    z1Var.f312501o = 4;
                    z1Var.f312502p = z1Var.f312500n;
                    lVar = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f312500n));
                }
            }
            lVar2 = lVar;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInTopCase >> " + ratioType);
            int ordinal3 = ratioType.ordinal();
            if (ordinal3 == 0) {
                z1Var.f312501o = 1;
                z1Var.f312502p = z1Var.f312500n;
                lVar = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f312500n));
            } else if (ordinal3 != 1) {
                int i39 = st3.p.f412567g;
                int i47 = st3.p.f412562b;
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInTopCase >> " + i39 + ", " + i47);
                if (i47 <= i39) {
                    int a19 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 30);
                    z1Var.f312501o = 4;
                    z1Var.f312502p = a19;
                    lVar2 = new jz5.l(java.lang.Integer.valueOf(a19), java.lang.Integer.valueOf(a19));
                } else {
                    int a27 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 88) + ((i47 - i39) / 2);
                    z1Var.f312501o = 4;
                    z1Var.f312502p = a27;
                    lVar = new jz5.l(java.lang.Integer.valueOf(a27), java.lang.Integer.valueOf(a27));
                }
            } else {
                float f18 = (st3.p.f412567g * 4) / 3.0f;
                int i48 = st3.p.f412562b;
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInTopCase >> " + f18 + ", " + i48);
                if (i48 <= f18) {
                    z1Var.f312501o = 1;
                    z1Var.f312502p = z1Var.f312500n;
                    lVar = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f312500n));
                } else {
                    int a28 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 30);
                    z1Var.f312501o = 4;
                    z1Var.f312502p = a28;
                    lVar2 = new jz5.l(java.lang.Integer.valueOf(a28), java.lang.Integer.valueOf(a28));
                }
            }
            lVar2 = lVar;
        }
        int intValue = ((java.lang.Number) lVar2.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar2.f302834e).intValue();
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(z1Var.c(), "scaleY", f17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(z1Var.c(), "translationY", intValue);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", "doFrameAni >> " + f17 + ' ' + intValue + ' ' + intValue2);
        z1Var.c().setPivotY(0.0f);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.addListener(new ku3.r1(z1Var, intValue2));
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public static final float b(ku3.z1 z1Var, int i17) {
        z1Var.getClass();
        return (i17 != 2 ? i17 != 3 ? 1.0f : 1.7777778f : 1.3333334f) / 1.7777778f;
    }

    public final android.widget.ImageView c() {
        java.lang.Object value = ((jz5.n) this.f312495f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    @Override // yt3.r2
    public void release() {
        kotlinx.coroutines.z0.e(this.f312498i, null, 1, null);
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f312494e.R6(new ku3.u1(this));
    }
}
