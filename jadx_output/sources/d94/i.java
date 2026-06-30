package d94;

/* loaded from: classes4.dex */
public class i {
    public d94.f B;
    public android.graphics.Point C;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f227565a;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f227569e;

    /* renamed from: f, reason: collision with root package name */
    public int f227570f;

    /* renamed from: g, reason: collision with root package name */
    public int f227571g;

    /* renamed from: i, reason: collision with root package name */
    public float f227573i;

    /* renamed from: j, reason: collision with root package name */
    public float f227574j;

    /* renamed from: m, reason: collision with root package name */
    public int f227577m;

    /* renamed from: n, reason: collision with root package name */
    public int f227578n;

    /* renamed from: o, reason: collision with root package name */
    public long f227579o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.drawable.BitmapDrawable f227580p;

    /* renamed from: q, reason: collision with root package name */
    public float f227581q;

    /* renamed from: r, reason: collision with root package name */
    public float f227582r;

    /* renamed from: s, reason: collision with root package name */
    public float f227583s;

    /* renamed from: t, reason: collision with root package name */
    public long f227584t;

    /* renamed from: u, reason: collision with root package name */
    public long f227585u;

    /* renamed from: v, reason: collision with root package name */
    public long f227586v;

    /* renamed from: w, reason: collision with root package name */
    public float f227587w;

    /* renamed from: x, reason: collision with root package name */
    public float f227588x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.animation.Interpolator[] f227589y;

    /* renamed from: z, reason: collision with root package name */
    public long f227590z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Random f227568d = new java.util.Random();

    /* renamed from: h, reason: collision with root package name */
    public long f227572h = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f227575k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f227576l = com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
    public float A = 0.8f;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f227566b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f227567c = new java.util.LinkedList();

    public i(android.content.Context context, android.widget.FrameLayout frameLayout) {
        this.f227565a = context;
        this.f227569e = frameLayout;
    }

    public static float d(android.content.Context context, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dp2px", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        try {
            float f18 = (context.getResources().getDisplayMetrics().xdpi / 160.0f) * f17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dp2px", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return f18;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ParticleGenerator", "dp2px, exp=" + th6.toString());
            float f19 = f17 * 2.5f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dp2px", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return f19;
        }
    }

    public void a(android.graphics.Point point) {
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addParticle", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        int i19 = point.x;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f227580p == null && this.B != null && currentTimeMillis - this.f227579o > 1000) {
            com.tencent.mars.xlog.Log.i("ParticleGenerator", "try getBitmap");
            android.graphics.Bitmap a17 = this.B.a();
            if (a17 != null) {
                this.f227580p = new android.graphics.drawable.BitmapDrawable(this.f227565a.getResources(), a17);
            }
            this.f227579o = currentTimeMillis;
        }
        if (this.f227580p == null) {
            com.tencent.mars.xlog.Log.w("ParticleGenerator", "addParticle, bmp==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addParticle", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcTimeDiff", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        int i27 = this.f227571g;
        if (e() <= 6) {
            i27 = 0;
        }
        if (e() >= ((int) (this.f227570f * 0.8f))) {
            i27 = (int) (this.f227571g * 1.5f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcTimeDiff", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        if (currentTimeMillis - this.f227572h > i27) {
            this.f227572h = currentTimeMillis;
            if (this.C == null) {
                this.C = new android.graphics.Point(point.x, point.y);
            }
            android.graphics.Point point2 = this.C;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            if (this.f227577m <= 0 || this.f227578n <= 0) {
                com.tencent.mars.xlog.Log.e("ParticleGenerator", "illegal size, w=" + this.f227577m + ", h=" + this.f227578n);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcPointDistance", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                int sqrt = (int) java.lang.Math.sqrt(java.lang.Math.pow(point.x - point2.x, 2.0d) + java.lang.Math.pow(point.y - point2.y, 2.0d));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPointDistance", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                int i28 = point.x;
                int i29 = i28 - point2.x > 0 ? 1 : 0;
                c(i28, point.y, i29);
                if (e() >= ((int) (this.f227570f * 0.8f))) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                } else {
                    int i37 = (int) (this.f227577m * this.f227583s);
                    if (sqrt >= i37) {
                        float f17 = i37 * this.A;
                        int i38 = f17 > 0.0f ? ((int) (sqrt / f17)) - 1 : 0;
                        com.tencent.mars.xlog.Log.i("ParticleGenerator", "insert=" + i38);
                        if (i38 > 0) {
                            int i39 = i38 + 1;
                            int abs = java.lang.Math.abs(point.x - point2.x) / i39;
                            int abs2 = java.lang.Math.abs(point.y - point2.y) / i39;
                            for (int i47 = 0; i47 < i38; i47++) {
                                int i48 = point.x;
                                int i49 = point2.x;
                                if (i48 < i49) {
                                    int i57 = i47 + 1;
                                    i18 = i48 + (abs * i57);
                                    int i58 = point.y;
                                    int i59 = i57 * abs2;
                                    i17 = i58 < point2.y ? i58 + i59 : i58 - i59;
                                } else {
                                    int i66 = i47 + 1;
                                    int i67 = i49 + (abs * i66);
                                    int i68 = point2.y;
                                    int i69 = i66 * abs2;
                                    i17 = i68 < point.y ? i68 + i69 : i68 - i69;
                                    i18 = i67;
                                }
                                c(i18, i17, i29);
                            }
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                }
            }
            this.C.set(point.x, point.y);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addParticle", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }

    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        android.view.View view = new android.view.View(this.f227565a);
        view.setBackground(this.f227580p);
        this.f227569e.addView(view, new android.widget.FrameLayout.LayoutParams(this.f227577m, this.f227578n));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d94.i.c(int, int, int):void");
    }

    public final int e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        int size = this.f227566b.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return size;
    }

    public final int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCacheCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        int size = this.f227567c.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return size;
    }

    public final android.view.animation.Interpolator g(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInterpolator", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        android.view.animation.Interpolator[] interpolatorArr = this.f227589y;
        if (interpolatorArr == null || i17 < 0 || i17 >= interpolatorArr.length) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInterpolator", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return null;
        }
        android.view.animation.Interpolator interpolator = interpolatorArr[i17];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInterpolator", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return interpolator;
    }

    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        com.tencent.mars.xlog.Log.i("ParticleGenerator", "reset");
        this.C = null;
        this.f227572h = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }

    public final void i(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/touchparticle/ParticleGenerator", "resetParticleView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/touchparticle/ParticleGenerator", "resetParticleView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }

    public void j(d94.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        this.B = fVar;
        this.f227580p = null;
        android.graphics.Bitmap a17 = fVar.a();
        android.content.Context context = this.f227565a;
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("ParticleGenerator", "setAnimConfig, bmp!=null");
            this.f227580p = new android.graphics.drawable.BitmapDrawable(context.getResources(), a17);
        } else {
            com.tencent.mars.xlog.Log.i("ParticleGenerator", "setAnimConfig, bmp==null");
        }
        this.f227579o = java.lang.System.currentTimeMillis();
        android.view.animation.Interpolator[] interpolatorArr = new android.view.animation.Interpolator[4];
        this.f227589y = interpolatorArr;
        interpolatorArr[0] = new android.view.animation.LinearInterpolator();
        this.f227589y[1] = new android.view.animation.AccelerateInterpolator();
        this.f227589y[2] = new android.view.animation.DecelerateInterpolator();
        this.f227589y[3] = new android.view.animation.AccelerateDecelerateInterpolator();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initParam", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        this.f227573i = d(context, fVar.f227550m);
        this.f227574j = d(context, fVar.f227551n);
        this.f227577m = i65.a.b(context, fVar.f227539b);
        this.f227578n = i65.a.b(context, fVar.f227538a);
        this.f227570f = fVar.f227540c;
        int i17 = fVar.f227541d;
        if (i17 <= 0) {
            i17 = 30;
        }
        this.f227571g = 1000 / i17;
        this.f227587w = fVar.f227546i;
        this.f227588x = fVar.f227547j;
        long j17 = fVar.f227549l;
        this.f227585u = j17;
        if (j17 < 0) {
            com.tencent.mars.xlog.Log.e("ParticleGenerator", "illegal fadeOutDelay:" + this.f227585u);
            this.f227585u = 300L;
        }
        long j18 = fVar.f227548k;
        this.f227586v = j18;
        if (j18 < 0) {
            com.tencent.mars.xlog.Log.e("ParticleGenerator", "illegal fadeOutDuration:" + this.f227586v);
            this.f227586v = 300L;
        }
        this.f227581q = fVar.f227542e;
        this.f227582r = fVar.f227543f;
        this.f227583s = fVar.f227544g;
        long j19 = fVar.f227545h;
        this.f227584t = j19;
        if (j19 < 0) {
            com.tencent.mars.xlog.Log.e("ParticleGenerator", "illegal scaleDuration:" + this.f227584t);
            this.f227584t = 300L;
        }
        float f17 = fVar.f227552o;
        this.A = f17;
        if (f17 <= 0.0f) {
            this.A = 0.8f;
        }
        this.f227590z = this.f227585u + this.f227586v + 50;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initParam", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }
}
