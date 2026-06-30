package uj3;

/* loaded from: classes14.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f428394a;

    /* renamed from: b, reason: collision with root package name */
    public final uj3.b f428395b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView f428396c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f428397d;

    /* renamed from: e, reason: collision with root package name */
    public int f428398e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f428399f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f428400g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f428401h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Long f428402i;

    /* renamed from: j, reason: collision with root package name */
    public final android.content.Context f428403j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.ImageView f428404k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f428405l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.RelativeLayout f428406m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f428407n;

    public z(android.widget.RelativeLayout rootView, uj3.b statusManager) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(statusManager, "statusManager");
        this.f428394a = rootView;
        this.f428395b = statusManager;
        android.content.Context context = rootView.getContext();
        this.f428403j = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c3k, rootView);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        this.f428406m = relativeLayout;
        this.f428396c = (com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView) relativeLayout.findViewById(com.tencent.mm.R.id.jx7);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f428399f = paint;
        paint.setColor(-16777216);
        paint.setFilterBitmap(true);
        paint.setTextSize(40.0f);
        this.f428397d = (android.widget.ImageView) relativeLayout.findViewById(com.tencent.mm.R.id.a9z);
        this.f428404k = (android.widget.ImageView) relativeLayout.findViewById(com.tencent.mm.R.id.p5h);
        this.f428405l = relativeLayout.findViewById(com.tencent.mm.R.id.p5i);
    }

    public final void a(int i17) {
        android.widget.RelativeLayout relativeLayout;
        java.lang.String str;
        uj3.b bVar = this.f428395b;
        if (bVar.b() != 0 || (relativeLayout = this.f428406m) == null) {
            return;
        }
        if (i17 != 180) {
            android.widget.RelativeLayout relativeLayout2 = this.f428394a;
            android.view.View view = this.f428405l;
            if (i17 == 0) {
                android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(21);
                layoutParams2.removeRule(20);
                layoutParams2.removeRule(10);
                layoutParams2.removeRule(12);
                layoutParams2.addRule(10, -1);
                layoutParams2.addRule(21, -1);
                relativeLayout.setLayoutParams(layoutParams2);
                relativeLayout.requestLayout();
                if (view != null) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.removeRule(21);
                    layoutParams4.removeRule(20);
                    layoutParams4.removeRule(10);
                    layoutParams4.removeRule(12);
                    layoutParams4.addRule(12, -1);
                    layoutParams4.addRule(21, -1);
                    layoutParams4.setMarginEnd(sj3.i1.f408558c / 2);
                    view.setLayoutParams(layoutParams4);
                    view.requestLayout();
                }
                if (bVar.b() == 0) {
                    android.view.ViewGroup.LayoutParams layoutParams5 = relativeLayout2.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
                    layoutParams6.removeRule(21);
                    layoutParams6.removeRule(20);
                    layoutParams6.removeRule(10);
                    layoutParams6.removeRule(12);
                    layoutParams6.addRule(21, -1);
                    layoutParams6.addRule(10, -1);
                    layoutParams6.bottomMargin = 0;
                    layoutParams6.setMarginEnd(sj3.i1.f408561f);
                    relativeLayout2.setLayoutParams(layoutParams6);
                    relativeLayout2.requestLayout();
                }
            } else if (i17 == 90) {
                android.view.ViewGroup.LayoutParams layoutParams7 = relativeLayout.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) layoutParams7;
                layoutParams8.removeRule(21);
                layoutParams8.removeRule(20);
                layoutParams8.removeRule(10);
                layoutParams8.removeRule(12);
                layoutParams8.addRule(20, -1);
                layoutParams8.addRule(10, -1);
                relativeLayout.setLayoutParams(layoutParams8);
                relativeLayout.requestLayout();
                if (view != null) {
                    android.view.ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) layoutParams9;
                    layoutParams10.removeRule(21);
                    layoutParams10.removeRule(20);
                    layoutParams10.removeRule(10);
                    layoutParams10.removeRule(12);
                    layoutParams10.addRule(10, -1);
                    layoutParams10.addRule(21, -1);
                    layoutParams10.setMarginEnd(sj3.i1.f408558c / 2);
                    view.setLayoutParams(layoutParams10);
                    view.requestLayout();
                }
                if (bVar.b() == 0) {
                    android.view.ViewGroup.LayoutParams layoutParams11 = relativeLayout2.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams11, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams12 = (android.widget.RelativeLayout.LayoutParams) layoutParams11;
                    layoutParams12.removeRule(21);
                    layoutParams12.removeRule(20);
                    layoutParams12.removeRule(10);
                    layoutParams12.removeRule(12);
                    layoutParams12.setMarginStart(sj3.i1.f408561f);
                    layoutParams12.bottomMargin = 0;
                    layoutParams12.addRule(20, -1);
                    layoutParams12.addRule(10, -1);
                    relativeLayout2.setLayoutParams(layoutParams12);
                    relativeLayout2.requestLayout();
                }
            } else if (i17 == 270) {
                android.view.ViewGroup.LayoutParams layoutParams13 = relativeLayout.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams13, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams14 = (android.widget.RelativeLayout.LayoutParams) layoutParams13;
                layoutParams14.removeRule(21);
                layoutParams14.removeRule(20);
                layoutParams14.removeRule(10);
                layoutParams14.removeRule(12);
                layoutParams14.addRule(21, -1);
                layoutParams14.addRule(12, -1);
                relativeLayout.setLayoutParams(layoutParams14);
                relativeLayout.requestLayout();
                if (bVar.b() == 0) {
                    android.view.ViewGroup.LayoutParams layoutParams15 = relativeLayout2.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams15, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams16 = (android.widget.RelativeLayout.LayoutParams) layoutParams15;
                    layoutParams16.removeRule(21);
                    layoutParams16.removeRule(20);
                    layoutParams16.removeRule(10);
                    layoutParams16.removeRule(12);
                    layoutParams16.bottomMargin = sj3.i1.f408569n;
                    layoutParams16.addRule(21, -1);
                    layoutParams16.addRule(12, -1);
                    relativeLayout2.setLayoutParams(layoutParams16);
                    relativeLayout2.requestLayout();
                }
                if (view != null) {
                    android.view.ViewGroup.LayoutParams layoutParams17 = view.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams17, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams18 = (android.widget.RelativeLayout.LayoutParams) layoutParams17;
                    layoutParams18.removeRule(21);
                    layoutParams18.removeRule(20);
                    layoutParams18.removeRule(10);
                    layoutParams18.removeRule(12);
                    layoutParams18.addRule(12, -1);
                    layoutParams18.addRule(20, -1);
                    layoutParams18.setMarginStart(sj3.i1.f408558c / 2);
                    view.setLayoutParams(layoutParams18);
                    view.requestLayout();
                }
            }
        }
        if (this.f428398e != 1 && (str = this.f428400g) != null) {
            d(str);
        }
        if (i17 != 180) {
            android.widget.ImageView imageView = this.f428397d;
            if (imageView != null) {
                imageView.setRotation(com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 - i17);
            }
            android.widget.ImageView imageView2 = this.f428404k;
            if (imageView2 == null) {
                return;
            }
            imageView2.setRotation(com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 - i17);
        }
    }

    public final boolean b(java.lang.String str) {
        java.lang.Long valueOf;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectAvatarCellLayout", "changeRenderAnimation %s ", str);
        if (kotlin.jvm.internal.o.b(this.f428401h, str) || this.f428396c == null || this.f428398e == 0) {
            return false;
        }
        if (str == null) {
            valueOf = null;
        } else {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            valueOf = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        }
        this.f428402i = valueOf;
        this.f428400g = str;
        this.f428401h = str;
        this.f428407n = true;
        ((ku5.t0) ku5.t0.f312615d).B(new uj3.s(this, str));
        this.f428398e = 0;
        return true;
    }

    public final boolean c(java.lang.String str, android.graphics.Bitmap bitmap, int i17, int i18, int i19) {
        java.lang.Long valueOf;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectAvatarCellLayout", "changeRenderAnimation %s and target is %s", str, java.lang.Integer.valueOf(i19));
        if (kotlin.jvm.internal.o.b(this.f428401h, str) || this.f428396c == null || this.f428398e == 1) {
            return false;
        }
        if (str == null) {
            valueOf = null;
        } else {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            valueOf = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        }
        this.f428402i = valueOf;
        this.f428400g = str;
        this.f428401h = str;
        this.f428407n = true;
        ((ku5.t0) ku5.t0.f312615d).B(new uj3.v(this, bitmap, i17, i18, str));
        return true;
    }

    public final synchronized boolean d(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        if (this.f428396c == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "drawAvatar view is null");
            return false;
        }
        if (this.f428407n) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "renderVideoBitmap img false cause isDoingAnimationChange");
            return false;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Di(this.f428397d, userName);
        if (!b(userName)) {
            android.widget.ImageView imageView = this.f428397d;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = this.f428396c;
            if (voIPRenderTextureView != null) {
                voIPRenderTextureView.setVisibility(8);
            }
            ((ku5.t0) ku5.t0.f312615d).B(new uj3.w(this, userName));
        }
        return true;
    }

    public final synchronized void e(android.graphics.Bitmap bitmap, int i17, int i18, int i19) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = this.f428396c;
                if (voIPRenderTextureView == null) {
                    return;
                }
                android.graphics.Canvas lockCanvas = voIPRenderTextureView.lockCanvas(null);
                if (lockCanvas == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "getCanvasError");
                    return;
                }
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                int e17 = this.f428395b.e();
                if (i19 == 1) {
                    if (e17 == 90 || e17 == 270) {
                        int i27 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
                        if (i17 == 12) {
                            matrix.setRotate(-90.0f, width / 2.0f, height / 2.0f);
                        } else if (i17 == 4) {
                            matrix.setRotate(-270.0f, width / 2.0f, height / 2.0f);
                        }
                    } else {
                        int i28 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
                        if (i17 == 12) {
                            matrix.setRotate(270.0f, width / 2.0f, height / 2.0f);
                        } else if (i17 == 4) {
                            matrix.setRotate(90.0f, width / 2.0f, height / 2.0f);
                        }
                    }
                } else if (this.f428395b.b() == 0) {
                    matrix.setRotate(com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 - e17, width / 2.0f, height / 2.0f);
                }
                int i29 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
                if (i18 == 16) {
                    matrix.postScale(-1.0f, 1.0f);
                    matrix.postTranslate(width, 0.0f);
                }
                matrix.postScale(lockCanvas.getWidth() / height, lockCanvas.getHeight() / width);
                lockCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                if (!bitmap.isRecycled()) {
                    try {
                        lockCanvas.drawBitmap(bitmap, matrix, this.f428399f);
                        this.f428398e = i19;
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "draw bitmap error");
                    }
                }
                try {
                    com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView2 = this.f428396c;
                    if (voIPRenderTextureView2 != null) {
                        voIPRenderTextureView2.unlockCanvasAndPost(lockCanvas);
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScreenProjectAvatarCellLayout", e18, "drawBitmap unlockCanvasAndPost crash", new java.lang.Object[0]);
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "DrawBitmap, bitmap is null or recycled");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(220L, 27L, 1L, false);
    }

    public final void f() {
        uj3.b bVar = this.f428395b;
        if (bVar.e() == 90 || bVar.e() == 270) {
            int i17 = sj3.i1.f408571p;
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i17, i17);
            if (bVar.c()) {
                layoutParams.setMarginEnd(sj3.i1.f408569n);
            } else {
                layoutParams.setMarginEnd(sj3.i1.f408561f);
            }
            layoutParams.addRule(21);
            this.f428394a.setLayoutParams(layoutParams);
        }
    }
}
