package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class s4 {
    public android.view.VelocityTracker F;
    public com.tencent.mm.ui.tools.p4 G;
    public com.tencent.mm.ui.tools.r4 H;
    public com.tencent.mm.ui.tools.q4 I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.ui.tools.m4 f210693J;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f210694a;

    /* renamed from: b, reason: collision with root package name */
    public int f210695b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f210696c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f210697d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f210698e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f210699f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f210700g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f210701h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f210702i = 0;

    /* renamed from: j, reason: collision with root package name */
    public float f210703j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f210704k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f210705l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f210706m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f210707n = 1.0f;

    /* renamed from: o, reason: collision with root package name */
    public int f210708o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f210709p = 0;

    /* renamed from: q, reason: collision with root package name */
    public float f210710q = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f210711r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f210712s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f210713t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f210714u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f210715v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f210716w = 200;

    /* renamed from: x, reason: collision with root package name */
    public int f210717x = 200;

    /* renamed from: y, reason: collision with root package name */
    public int f210718y = 0;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f210719z = new com.tencent.mm.sdk.platformtools.n3();
    public float A = 0.0f;
    public float B = 0.0f;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;

    public s4(android.content.Context context) {
        this.f210694a = context;
    }

    public static void a(com.tencent.mm.ui.tools.s4 s4Var, float f17, float f18, android.view.View view, android.view.View view2, android.view.View view3) {
        com.tencent.mm.ui.tools.q4 q4Var = s4Var.I;
        if (q4Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.media.x xVar = (com.tencent.mm.plugin.webview.ui.tools.media.x) q4Var;
            boolean z17 = f17 == 0.0f;
            com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = xVar.f185832a;
            if (z17) {
                if (f18 == 0.0f) {
                    com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.c(mPVideoPlayFullScreenView);
                }
            }
            if (java.lang.Math.abs(f17) > 10.0f || java.lang.Math.abs(f18) > 10.0f) {
                int i17 = com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.f185705y0;
                mPVideoPlayFullScreenView.p();
            }
        }
        float height = 1.0f - (f18 / view.getHeight());
        if (height > 1.0f) {
            height = 1.0f;
        }
        if (java.lang.Float.isNaN(height)) {
            return;
        }
        if (height != 1.0d) {
            s4Var.f210707n = 1.0f / height;
            if (f17 != 0.0f || f18 != 0.0f) {
                s4Var.f210708o = (int) (((int) ((view.getWidth() / 2) * (1.0f - height))) + f17);
                s4Var.f210709p = (int) (((view.getHeight() / 2) + f18) - ((s4Var.f210700g / 2) * height));
            }
        }
        if (view3 != null) {
            view3.setPivotX(view.getWidth() / 2);
            view3.setPivotY(view.getHeight() / 2);
            view3.setScaleX(height);
            view3.setScaleY(height);
            view3.setTranslationX(f17);
            view3.setTranslationY(f18);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(height));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/tools/ImagePreviewAnimation", "onGalleryScale", "(FFLandroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/ui/tools/ImagePreviewAnimation", "onGalleryScale", "(FFLandroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public final void b(android.view.View view, boolean z17) {
        int i17;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (this.f210695b == 0 && this.f210696c == 0) {
            this.f210695b = view.getWidth() / 2;
            this.f210696c = view.getHeight() / 2;
        }
        this.f210701h = this.f210695b - iArr[0];
        this.f210702i = this.f210696c - iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0) {
            width = this.f210699f;
            height = this.f210700g;
        }
        if (width != 0 && height != 0) {
            this.f210703j = this.f210697d / width;
            this.f210704k = this.f210698e / height;
        }
        float f17 = (this.f210712s == 0 && this.f210713t == 0 && this.f210714u == 0 && this.f210715v == 0) ? 1.0f : 1.1f;
        if (z17) {
            int i18 = this.f210699f;
            if (i18 != 0 && (i17 = this.f210700g) != 0) {
                this.f210703j = this.f210697d / i18;
                this.f210704k = this.f210698e / i17;
            }
            f17 = 1.0f;
        }
        float f18 = this.f210707n;
        if (f18 != 1.0d) {
            int i19 = this.f210701h + iArr[0];
            int i27 = this.f210702i + iArr[1];
            float f19 = this.f210703j * f18;
            this.f210705l = f19;
            this.f210706m = f19;
            this.f210702i = (int) (i27 - (this.f210709p * f19));
            this.f210701h = (int) (i19 - (this.f210708o * f19));
            return;
        }
        float f27 = this.f210703j;
        float f28 = this.f210704k;
        if (f27 > f28) {
            float f29 = f27 * f17;
            this.f210705l = f29;
            this.f210702i = (int) (this.f210702i - (((height * f29) - (this.f210698e * f17)) / 2.0f));
        } else {
            float f37 = f28 * f17;
            this.f210705l = f37;
            this.f210701h = (int) (this.f210701h - (((width * f37) - (this.f210697d * f17)) / 2.0f));
            int i28 = this.f210700g;
            if (i28 != 0 && i28 < height) {
                this.f210702i = (int) (this.f210702i - (((height * f37) - (this.f210698e * f17)) / 2.0f));
            }
        }
        float f38 = this.f210702i;
        int i29 = this.f210698e;
        float f39 = f17 - 1.0f;
        int i37 = this.f210711r;
        int i38 = (int) ((f38 - ((i29 * f39) / 2.0f)) - ((i37 * this.f210705l) / 2.0f));
        this.f210702i = i38;
        float f47 = this.f210701h;
        int i39 = this.f210697d;
        int i47 = (int) (f47 - ((i39 * f39) / 2.0f));
        this.f210701h = i47;
        int i48 = this.f210700g;
        if (i48 != 0 && this.f210696c < (height - i48) / 2) {
            this.f210702i = (int) (i38 + ((i29 * f39) / 2.0f));
        } else if (i48 != 0 && this.f210696c + i29 > (i48 + height) / 2) {
            this.f210702i = (int) (i38 - ((i29 * f39) / 2.0f));
        }
        if (i39 == 0 && i29 == 0) {
            this.f210705l = 0.5f;
            this.f210710q = 0.0f;
            this.f210701h = (int) (i47 - ((width * 0.5f) / 2.0f));
            this.f210702i = (int) ((this.f210702i - ((height * 0.5f) / 2.0f)) - ((i37 * 0.5f) / 2.0f));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewAnimation", "left: %s; top: %s; width: %s; height: %s; zoomScale: %s; LeftDelta: %s; TopDelta: %s", java.lang.Integer.valueOf(this.f210695b), java.lang.Integer.valueOf(this.f210696c), java.lang.Integer.valueOf(this.f210697d), java.lang.Integer.valueOf(this.f210698e), java.lang.Float.valueOf(this.f210705l), java.lang.Integer.valueOf(this.f210701h), java.lang.Integer.valueOf(this.f210702i));
    }

    public void c(android.view.View view, android.view.View view2, com.tencent.mm.ui.tools.n4 n4Var) {
        int i17;
        float f17;
        android.animation.TimeInterpolator decelerateInterpolator;
        if (view == null || (i17 = this.f210718y) == 2 || i17 == 4 || i17 == 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImagePreviewAnimation", "[runEnterAnimation] %s %s ", java.lang.Integer.valueOf(this.f210718y), view);
            return;
        }
        if (java.lang.Float.isNaN(this.f210705l)) {
            return;
        }
        b(view, false);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setScaleX(this.f210705l);
        view.setScaleY(this.f210705l);
        view.setTranslationX(this.f210701h);
        view.setTranslationY(this.f210702i);
        com.tencent.mm.ui.tools.b3 b3Var = com.tencent.mm.ui.tools.b3.EASE_IN_OUT;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/tools/ImagePreviewAnimation", "runEnterAnimation", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/ui/tools/ImagePreviewAnimation$ICallback;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/ui/tools/ImagePreviewAnimation", "runEnterAnimation", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/ui/tools/ImagePreviewAnimation$ICallback;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (n4Var instanceof com.tencent.mm.ui.tools.o4) {
                this.f210716w = 250;
                decelerateInterpolator = com.tencent.mm.ui.tools.c3.a(b3Var);
            } else {
                decelerateInterpolator = new android.view.animation.DecelerateInterpolator(1.2f);
            }
            f17 = 1.0f;
            view2.animate().setDuration(this.f210716w).setInterpolator(decelerateInterpolator).alpha(1.0f).setListener(new com.tencent.mm.ui.tools.c4(this, view2));
        } else {
            f17 = 1.0f;
        }
        view.animate().setDuration(this.f210716w).setInterpolator(n4Var instanceof com.tencent.mm.ui.tools.o4 ? com.tencent.mm.ui.tools.c3.a(b3Var) : new android.view.animation.DecelerateInterpolator(1.2f)).scaleX(f17).scaleY(f17).translationX(0.0f).translationY(0.0f).setUpdateListener(new com.tencent.mm.ui.tools.e4(this, n4Var)).setListener(new com.tencent.mm.ui.tools.d4(this, n4Var, view));
        this.f210719z.postDelayed(new com.tencent.mm.ui.tools.f4(this, view), 10);
    }

    public void d(android.view.View view, android.view.View view2, boolean z17, com.tencent.mm.ui.tools.n4 n4Var, com.tencent.mm.ui.tools.l4 l4Var) {
        int i17;
        if (view == null || (i17 = this.f210718y) == 2 || i17 == 4 || i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation not run! animationState: %s , gallery:%s", java.lang.Integer.valueOf(this.f210718y), view);
            return;
        }
        if (z17) {
            this.f210717x = this.f210716w;
        } else {
            this.f210717x = 200;
            b(view, true);
        }
        if (view2 != null) {
            view2.animate().setDuration(this.f210717x).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).alpha(0.0f).setListener(new com.tencent.mm.ui.tools.g4(this, view2));
        }
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        if (!z17) {
            float f17 = this.f210705l;
            com.tencent.mm.ui.tools.h4 h4Var = new com.tencent.mm.ui.tools.h4(this, 1.0f, f17, 1.0f, f17, view, l4Var);
            h4Var.setDuration(this.f210717x);
            h4Var.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
            animationSet.addAnimation(h4Var);
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, this.f210701h, 0.0f, this.f210702i);
            translateAnimation.setDuration(this.f210717x);
            translateAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
            animationSet.addAnimation(translateAnimation);
        }
        com.tencent.mm.ui.tools.i4 i4Var = new com.tencent.mm.ui.tools.i4(this, 1.0f, this.f210710q, n4Var);
        i4Var.setDuration(this.f210717x);
        if (z17) {
            i4Var.setInterpolator(com.tencent.mm.ui.tools.c3.a(com.tencent.mm.ui.tools.b3.EASE_IN_OUT));
        } else {
            i4Var.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
        }
        animationSet.addAnimation(i4Var);
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new com.tencent.mm.ui.tools.j4(this, n4Var));
        view.startAnimation(animationSet);
    }

    public void e(int i17, int i18, int i19, int i27) {
        this.f210695b = i17;
        this.f210696c = i18;
        this.f210697d = i19;
        this.f210698e = i27;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewAnimation", "setAnimationParam: left=%d, top=%d, width=%d, height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
    }
}
