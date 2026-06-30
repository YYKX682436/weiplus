package qj5;

/* loaded from: classes8.dex */
public final class n extends com.tencent.mm.ui.widget.dialog.k0 {
    public static qj5.b I2;
    public android.view.View A2;
    public android.view.View B2;
    public android.widget.FrameLayout C2;
    public com.tencent.mm.ui.widget.button.WeButton D2;
    public com.tencent.mm.zoomimage.ZoomImageView E2;
    public final jz5.g F2;
    public java.lang.String G2;
    public com.tencent.mm.ui.widget.dialog.u3 H2;

    /* renamed from: q2, reason: collision with root package name */
    public qj5.o f363983q2;

    /* renamed from: r2, reason: collision with root package name */
    public boolean f363984r2;

    /* renamed from: s2, reason: collision with root package name */
    public int f363985s2;

    /* renamed from: t2, reason: collision with root package name */
    public java.lang.String f363986t2;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f363987u2;

    /* renamed from: v2, reason: collision with root package name */
    public java.lang.Integer f363988v2;

    /* renamed from: w2, reason: collision with root package name */
    public android.content.Context f363989w2;

    /* renamed from: x2, reason: collision with root package name */
    public qj5.q f363990x2;

    /* renamed from: y2, reason: collision with root package name */
    public android.view.View f363991y2;

    /* renamed from: z2, reason: collision with root package name */
    public android.view.ViewTreeObserver f363992z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, int i17, boolean z17, com.tencent.mm.ui.widget.dialog.m1 initConfig, qj5.q qVar) {
        super(context, i17, z17, initConfig);
        float f17;
        int i18;
        jz5.f0 f0Var;
        qj5.b bVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        this.f363987u2 = true;
        jz5.g b17 = jz5.h.b(new qj5.h(this));
        this.F2 = b17;
        this.f363989w2 = context;
        if (context instanceof android.app.Activity) {
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            this.f363991y2 = decorView.findViewById(android.R.id.content);
        }
        this.f363983q2 = new qj5.o(context);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489275ek0, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.A2 = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f483443sl0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.C2 = (android.widget.FrameLayout) findViewById;
        android.view.View view = this.A2;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.ntc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.D2 = (com.tencent.mm.ui.widget.button.WeButton) findViewById2;
        android.view.View view2 = this.A2;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.h_z);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.E2 = (com.tencent.mm.zoomimage.ZoomImageView) findViewById3;
        qj5.o oVar = this.f363983q2;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("containerDialog");
            throw null;
        }
        oVar.setOnDismissListener(new qj5.e(this));
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView = this.E2;
        if (zoomImageView == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        qj5.f fVar = new qj5.f(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(zoomImageView, fVar);
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView2 = this.E2;
        if (zoomImageView2 == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        n3.y0.c(zoomImageView2);
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView3 = this.E2;
        if (zoomImageView3 == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        zoomImageView3.setScrollBar(null);
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView4 = this.E2;
        if (zoomImageView4 == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        zoomImageView4.setRoundCornerRadius(i65.a.h(context, com.tencent.mm.R.dimen.f479646bl));
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView5 = this.E2;
        if (zoomImageView5 == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        zoomImageView5.setStrokeColor(context.getColor(com.tencent.mm.R.color.FG_3));
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView6 = this.E2;
        if (zoomImageView6 == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        zoomImageView6.setStrokeWidth(i65.a.a(context, 0.5f));
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.content.Context context2 = this.f363989w2;
        if (context2 == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        java.lang.Object systemService = context2.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        if (h()) {
            f17 = displayMetrics.heightPixels;
            i18 = displayMetrics.widthPixels;
        } else {
            f17 = displayMetrics.widthPixels;
            i18 = displayMetrics.heightPixels;
        }
        float f18 = f17 / i18;
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView7 = this.E2;
        if (zoomImageView7 == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        zoomImageView7.getZoomable().f(new qj5.a(f18 / 1.5f));
        this.f363984r2 = h();
        if (qVar != null) {
            this.f363990x2 = qVar;
            if (((java.lang.String) ((jz5.n) b17).getValue()) != null) {
                z();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                x();
            }
            com.tencent.mm.ui.widget.button.WeButton weButton = this.D2;
            if (weButton == null) {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
            weButton.setVisibility(qVar.i());
            java.lang.String a17 = qVar.a();
            if (a17 != null) {
                com.tencent.mm.ui.widget.button.WeButton weButton2 = this.D2;
                if (weButton2 == null) {
                    kotlin.jvm.internal.o.o("switchBtn");
                    throw null;
                }
                weButton2.setText(a17);
            }
            if (qVar.i() == 0 && (bVar = I2) != null) {
                ((com.tencent.mm.ui.feature.api.screenshot.h0) bVar).b("generate_image_entry_btn", "view_exp");
            }
            com.tencent.mm.ui.widget.button.WeButton weButton3 = this.D2;
            if (weButton3 == null) {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
            weButton3.setOnClickListener(new qj5.g(this));
        }
        android.view.View c17 = c();
        kotlin.jvm.internal.o.f(c17, "getView(...)");
        android.view.View view3 = this.B2;
        if (view3 != null) {
            android.widget.FrameLayout frameLayout = this.C2;
            if (frameLayout == null) {
                kotlin.jvm.internal.o.o("bottomSheetContainer");
                throw null;
            }
            frameLayout.removeView(view3);
        }
        this.B2 = c17;
        android.view.ViewGroup.LayoutParams layoutParams = c17.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMImageBottomSheet", "setBottomView, layout params error");
            return;
        }
        layoutParams2.gravity = 80;
        android.view.View view4 = this.B2;
        if (view4 != null) {
            view4.setLayoutParams(layoutParams2);
        }
        android.widget.FrameLayout frameLayout2 = this.C2;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.o.o("bottomSheetContainer");
            throw null;
        }
        frameLayout2.addView(this.B2);
        qj5.o oVar2 = this.f363983q2;
        if (oVar2 == null) {
            kotlin.jvm.internal.o.o("containerDialog");
            throw null;
        }
        android.view.View view5 = this.A2;
        if (view5 != null) {
            oVar2.setContentView(view5);
        } else {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
    }

    public final boolean h() {
        qj5.o oVar = this.f363983q2;
        if (oVar != null) {
            return oVar.I();
        }
        kotlin.jvm.internal.o.o("containerDialog");
        throw null;
    }

    @Override // com.tencent.mm.ui.widget.dialog.k0
    public boolean i() {
        qj5.o oVar = this.f363983q2;
        if (oVar != null) {
            return oVar.isShowing();
        }
        kotlin.jvm.internal.o.o("containerDialog");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if ((r0 != null && r0.getVisibility() == 0) == false) goto L30;
     */
    @Override // com.tencent.mm.ui.widget.dialog.k0, android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGlobalLayout() {
        /*
            r3 = this;
            boolean r0 = r3.i()
            if (r0 != 0) goto L7
            return
        L7:
            android.view.View r0 = r3.f363991y2
            if (r0 == 0) goto L47
            boolean r0 = r0.isShown()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 == 0) goto L27
            android.view.View r0 = r3.f363991y2
            if (r0 == 0) goto L23
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 != 0) goto L27
            goto L47
        L27:
            boolean r0 = r3.f363984r2
            boolean r1 = r3.h()
            if (r0 != r1) goto L43
            int r0 = r3.f363985s2
            qj5.o r1 = r3.f363983q2
            if (r1 == 0) goto L3c
            int r1 = r1.F()
            if (r0 == r1) goto L4a
            goto L43
        L3c:
            java.lang.String r0 = "containerDialog"
            kotlin.jvm.internal.o.o(r0)
            r0 = 0
            throw r0
        L43:
            r3.u()
            goto L4a
        L47:
            r3.u()
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj5.n.onGlobalLayout():void");
    }

    @Override // com.tencent.mm.ui.widget.dialog.k0
    public void u() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMImageBottomSheet", "tryHide");
        android.content.Context context = this.f363989w2;
        jz5.f0 f0Var = null;
        if (context == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMImageBottomSheet", "tryShow, unlock orientation");
            java.lang.Integer num = this.f363988v2;
            activity.setRequestedOrientation(num != null ? num.intValue() : -1);
            this.f363988v2 = null;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                w(new qj5.l(this));
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            w(new qj5.m(this));
        }
        qj5.q qVar = this.f363990x2;
        if (qVar != null) {
            qVar.c();
        }
    }

    @Override // com.tencent.mm.ui.widget.dialog.k0
    public void v() {
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMImageBottomSheet", "tryShow");
        android.content.Context context = this.f363989w2;
        if (context == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMImageBottomSheet", "tryShow, lock orientation");
            this.f363988v2 = java.lang.Integer.valueOf(activity.getRequestedOrientation());
            activity.setRequestedOrientation(14);
        }
        super.v();
        this.f363984r2 = h();
        qj5.o oVar = this.f363983q2;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("containerDialog");
            throw null;
        }
        this.f363985s2 = oVar.F();
        android.view.View view = this.f363991y2;
        if (view != null) {
            boolean z17 = this.f363992z2 == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f363992z2 = viewTreeObserver;
            if (z17) {
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
                java.lang.Object obj = this.f363989w2;
                if (obj == null) {
                    kotlin.jvm.internal.o.o("mContext");
                    throw null;
                }
                androidx.lifecycle.y yVar = obj instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) obj : null;
                if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
                    mo133getLifecycle.a(new androidx.lifecycle.v() { // from class: com.tencent.mm.ui.screenshot.MMImageBottomSheet$tryShow$2$1
                        @Override // androidx.lifecycle.v
                        public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                            kotlin.jvm.internal.o.g(source, "source");
                            kotlin.jvm.internal.o.g(event, "event");
                            if (event != androidx.lifecycle.m.ON_DESTROY) {
                                return;
                            }
                            qj5.n nVar = qj5.n.this;
                            android.view.ViewTreeObserver viewTreeObserver2 = nVar.f363992z2;
                            if (viewTreeObserver2 != null) {
                                if (!viewTreeObserver2.isAlive()) {
                                    android.view.View view2 = nVar.f363991y2;
                                    viewTreeObserver2 = view2 != null ? view2.getViewTreeObserver() : null;
                                }
                                if (viewTreeObserver2 != null) {
                                    viewTreeObserver2.removeGlobalOnLayoutListener(nVar);
                                }
                                nVar.f363992z2 = null;
                            }
                            source.mo133getLifecycle().c(this);
                        }
                    });
                }
            }
        }
        android.content.Context context2 = this.f363989w2;
        if (context2 == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if ((activity2 == null || activity2.isFinishing()) ? false : true) {
            qj5.o oVar2 = this.f363983q2;
            if (oVar2 == null) {
                kotlin.jvm.internal.o.o("containerDialog");
                throw null;
            }
            oVar2.show();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMImageBottomSheet", "animIn");
            android.widget.FrameLayout frameLayout = this.C2;
            if (frameLayout == null) {
                kotlin.jvm.internal.o.o("bottomSheetContainer");
                throw null;
            }
            sa5.d.a(frameLayout, new sa5.h0(), 300L, null);
            com.tencent.mm.zoomimage.ZoomImageView zoomImageView = this.E2;
            if (zoomImageView != null) {
                zoomImageView.post(new qj5.c(this));
            } else {
                kotlin.jvm.internal.o.o("imageView");
                throw null;
            }
        }
    }

    public final void w(yz5.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMImageBottomSheet", "animOut");
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView = this.E2;
        if (zoomImageView == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        zoomImageView.setVisibility(4);
        android.widget.FrameLayout frameLayout = this.C2;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("bottomSheetContainer");
            throw null;
        }
        sa5.d.b(frameLayout, new sa5.q0(), 300L, new qj5.d(aVar));
    }

    public final void x() {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMImageBottomSheet", "setGenImg");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = this.G2;
        if (str != null) {
            y(str);
            com.tencent.mm.ui.widget.button.WeButton weButton = this.D2;
            if (weButton == null) {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
            android.content.Context context = this.f363989w2;
            if (context == null) {
                kotlin.jvm.internal.o.o("mContext");
                throw null;
            }
            weButton.setText(context.getString(com.tencent.mm.R.string.oej));
            this.f363987u2 = false;
            qj5.b bVar = I2;
            if (bVar != null) {
                ((com.tencent.mm.ui.feature.api.screenshot.h0) bVar).a(java.lang.System.currentTimeMillis() - currentTimeMillis);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMImageBottomSheet", "setGenImg, genImg not exist, try fetch");
        android.content.Context context2 = this.f363989w2;
        if (context2 == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context2, null, false, 3, qj5.i.f363973d);
        android.widget.TextView textView = f17.f212004d;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.H2 = f17;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new qj5.k(this, currentTimeMillis, null), 3, null);
    }

    public final void y(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f363986t2 = path;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMImageBottomSheet", "setImage, originScreenshotPath: ".concat(path));
        android.graphics.Bitmap K = com.tencent.mm.sdk.platformtools.x.K(path);
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView = this.E2;
        if (zoomImageView == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        zoomImageView.setImageBitmap(K);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        boolean z17 = true;
        options.inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(path, options);
        if (d17 != null) {
            d17.recycle();
        }
        yq5.b bVar = new yq5.b(path);
        yq5.c cVar = new yq5.c(zq5.h.a(options.outWidth, options.outHeight), "image/jpeg", null);
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView2 = this.E2;
        if (zoomImageView2 == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = zoomImageView2.getSubsampling().f23754c;
        m0Var.getClass();
        yq5.k kVar = new yq5.k(new yq5.e(bVar), cVar);
        zq5.b.d();
        if (kotlin.jvm.internal.o.b(m0Var.f215006o, kVar)) {
            z17 = false;
        } else {
            m0Var.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.f0(m0Var, kVar));
            m0Var.b("setImage");
            m0Var.c("setImage");
            m0Var.f215006o = kVar;
            if (m0Var.f214997f != null) {
                m0Var.f("setImage");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMImageBottomSheet", "setSubsamplingImage: " + z17);
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView3 = this.E2;
        if (zoomImageView3 == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        er5.g zoomable = zoomImageView3.getZoomable();
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView4 = this.E2;
        if (zoomImageView4 != null) {
            zoomable.d(zoomImageView4.canScrollVertically(-1) ? gr5.a.f274900b : gr5.a.f274903e);
        } else {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
    }

    public final void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMImageBottomSheet", "setOriImg");
        com.tencent.mm.ui.widget.button.WeButton weButton = this.D2;
        if (weButton == null) {
            kotlin.jvm.internal.o.o("switchBtn");
            throw null;
        }
        qj5.q qVar = this.f363990x2;
        weButton.setText(qVar != null ? qVar.a() : null);
        java.lang.String str = (java.lang.String) ((jz5.n) this.F2).getValue();
        if (str != null) {
            y(str);
        }
        this.f363987u2 = true;
    }
}
