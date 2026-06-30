package sx5;

/* loaded from: classes13.dex */
public class a1 implements sx5.a, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, android.view.ScaleGestureDetector.OnScaleGestureListener {
    public android.widget.ImageView A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public android.view.OrientationEventListener C1;
    public android.widget.TextView D;
    public boolean D1;
    public android.widget.TextView E;
    public java.util.Timer E1;
    public android.widget.TextView F;
    public android.widget.TextView G;
    public boolean G1;
    public android.widget.TextView H;
    public sx5.d I;

    /* renamed from: J, reason: collision with root package name */
    public android.webkit.WebChromeClient.CustomViewCallback f413669J;
    public android.graphics.drawable.Drawable J1;
    public android.view.GestureDetector K;
    public android.view.ScaleGestureDetector L;
    public boolean L1;
    public boolean M;
    public boolean M1;
    public double N;
    public boolean N1;
    public boolean O1;
    public double P;
    public int P1;
    public double Q;
    public boolean R;
    public int T;
    public int W;
    public int X;
    public boolean Y;
    public com.tencent.xweb.VideoJsCallback Z;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Application f413670d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f413671e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.xweb.WebView f413672f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f413673g;

    /* renamed from: h, reason: collision with root package name */
    public sx5.z0 f413674h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f413675i;

    /* renamed from: l1, reason: collision with root package name */
    public float f413676l1;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f413677m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f413678n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.xweb.extension.video.VideoStatusLayout f413679o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f413680p;

    /* renamed from: p0, reason: collision with root package name */
    public android.media.AudioManager f413681p0;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ProgressBar f413683q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f413684r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f413685s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.xweb.extension.video.ClickableFrameLayout f413686t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f413687u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f413688v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f413689w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f413690x;

    /* renamed from: x0, reason: collision with root package name */
    public int f413691x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.Window f413692x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f413693y;

    /* renamed from: y0, reason: collision with root package name */
    public double f413694y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f413695y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f413696z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f413697z1;
    public double S = 1.0d;
    public int U = -3;
    public int V = -3;

    /* renamed from: p1, reason: collision with root package name */
    public float f413682p1 = 1.0f;
    public boolean A1 = false;
    public boolean B1 = false;
    public int F1 = 0;
    public final android.app.Application.ActivityLifecycleCallbacks H1 = new sx5.k0(this);
    public final sx5.y0 I1 = new sx5.m0(this);
    public sx5.x0 K1 = sx5.x0.None;

    public void A(double d17) {
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoPlaybackRate rate:" + d17);
        w(new sx5.b0(this));
        this.f413672f.evaluateJavascript(java.lang.String.format("xwebVideoBridge.xwebToJS_Video_RateChange(%f);", java.lang.Double.valueOf(d17)), new sx5.q(this));
    }

    @Override // com.tencent.xweb.o0
    public void a(double d17) {
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoSeek time:" + d17);
        this.f413672f.evaluateJavascript(java.lang.String.format("xwebVideoBridge.xwebToJS_Video_Seek(%f);", java.lang.Double.valueOf(d17)), new sx5.p(this));
    }

    @Override // sx5.a
    public void b(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.tencent.xweb.n1 n1Var;
        by5.c4.f("XWebNativeInterface", "onShowCustomView");
        if (!this.D1) {
            sx5.z0 z0Var = new sx5.z0(p());
            this.f413674h = z0Var;
            z0Var.setId(com.tencent.xwebsdk.R.id.xweb_video_fullscreen_root);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(p());
            this.f413675i = frameLayout;
            frameLayout.setId(com.tencent.xwebsdk.R.id.xweb_video_fullscreen_background);
            android.view.GestureDetector gestureDetector = new android.view.GestureDetector(p(), this);
            this.K = gestureDetector;
            gestureDetector.setOnDoubleTapListener(this);
            this.L = new android.view.ScaleGestureDetector(p(), this);
            this.K.setIsLongpressEnabled(false);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(p()).inflate(com.tencent.xwebsdk.R.layout.xweb_video_control, (android.view.ViewGroup) null);
            this.f413678n = viewGroup;
            viewGroup.setVisibility(8);
            this.f413688v = (android.widget.LinearLayout) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.layoutTitleBar);
            android.widget.ImageView imageView = (android.widget.ImageView) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.imageBack);
            this.f413690x = imageView;
            imageView.setOnClickListener(new sx5.r(this));
            this.f413683q = (android.widget.ProgressBar) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.progressLoading);
            this.f413679o = (com.tencent.xweb.extension.video.VideoStatusLayout) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.layoutStatus);
            com.tencent.xweb.extension.video.ClickableFrameLayout clickableFrameLayout = (com.tencent.xweb.extension.video.ClickableFrameLayout) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.layoutBlank);
            this.f413686t = clickableFrameLayout;
            clickableFrameLayout.setGestureDetector(this.K);
            this.f413686t.setOnTouchListener(new sx5.c0(this));
            this.f413687u = (android.widget.LinearLayout) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.layoutVideoControl);
            this.f413680p = this.f413678n.findViewById(com.tencent.xwebsdk.R.id.layoutProgress);
            this.f413684r = (android.widget.TextView) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.tv_current_time);
            this.f413685s = (android.widget.TextView) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.tv_total_time);
            sx5.d dVar = new sx5.d(this.f413678n.findViewById(com.tencent.xwebsdk.R.id.player_progress_root));
            this.I = dVar;
            dVar.f413714a = new sx5.o0(this);
            android.widget.ImageView imageView2 = (android.widget.ImageView) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.imageMute);
            this.f413693y = imageView2;
            if (this.A1) {
                imageView2.setVisibility(0);
                this.f413693y.setOnClickListener(new sx5.r0(this));
            } else {
                imageView2.setVisibility(8);
            }
            android.widget.TextView textView = (android.widget.TextView) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.textViewRate);
            this.B = textView;
            if (this.B1) {
                textView.setVisibility(0);
                this.B.setOnClickListener(new sx5.s0(this));
            } else {
                textView.setVisibility(8);
            }
            android.widget.ImageView imageView3 = (android.widget.ImageView) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.imageExit);
            this.f413696z = imageView3;
            imageView3.setOnClickListener(new sx5.t0(this));
            android.widget.ImageView imageView4 = (android.widget.ImageView) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.imagePlay);
            this.A = imageView4;
            imageView4.setOnClickListener(new sx5.u0(this));
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) this.f413678n.findViewById(com.tencent.xwebsdk.R.id.layoutRate);
            this.f413689w = frameLayout2;
            android.widget.TextView textView2 = (android.widget.TextView) frameLayout2.findViewById(com.tencent.xwebsdk.R.id.textViewRate05);
            this.C = textView2;
            textView2.setOnClickListener(new sx5.v0(this));
            android.widget.TextView textView3 = (android.widget.TextView) this.f413689w.findViewById(com.tencent.xwebsdk.R.id.textViewRate075);
            this.D = textView3;
            textView3.setOnClickListener(new sx5.w0(this));
            android.widget.TextView textView4 = (android.widget.TextView) this.f413689w.findViewById(com.tencent.xwebsdk.R.id.textViewRate10);
            this.E = textView4;
            textView4.setOnClickListener(new sx5.h(this));
            android.widget.TextView textView5 = (android.widget.TextView) this.f413689w.findViewById(com.tencent.xwebsdk.R.id.textViewRate15);
            this.F = textView5;
            textView5.setOnClickListener(new sx5.i(this));
            android.widget.TextView textView6 = (android.widget.TextView) this.f413689w.findViewById(com.tencent.xwebsdk.R.id.textViewRate20);
            this.G = textView6;
            textView6.setOnClickListener(new sx5.j(this));
            android.widget.TextView textView7 = (android.widget.TextView) this.f413689w.findViewById(com.tencent.xwebsdk.R.id.textViewRate30);
            this.H = textView7;
            textView7.setOnClickListener(new sx5.k(this));
            this.D1 = true;
        }
        this.f413677m = view;
        this.f413669J = customViewCallback;
        if (view != null || this.f413672f.isXWalkKernel()) {
            if (this.f413672f.isXWalkKernel()) {
                com.tencent.xweb.n1 n1Var2 = by5.s0.f36595c;
                if (n1Var2 != null) {
                    n1Var2.b(577L, 53L, 1L);
                }
            } else if (this.f413672f.isSysKernel() && (n1Var = by5.s0.f36595c) != null) {
                n1Var.b(577L, 57L, 1L);
            }
            l();
        }
        o();
    }

    @Override // com.tencent.xweb.o0
    public void c() {
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoPause");
        this.f413672f.evaluateJavascript("xwebVideoBridge.xwebToJS_Video_NewPause();", new sx5.n(this));
    }

    @Override // com.tencent.xweb.o0
    public boolean d() {
        return true;
    }

    @Override // sx5.a
    public void e() {
        by5.c4.f("XWebNativeInterface", "onHideCustomView");
        by5.c4.f("XWebNativeInterface", "resumeFocus");
        if ((this.f413672f.getView() instanceof android.view.ViewGroup) && this.W != 0) {
            ((android.view.ViewGroup) this.f413672f.getView()).setDescendantFocusability(this.W);
            this.W = 0;
        }
        if ((this.f413672f.getWebViewUI() instanceof android.view.ViewGroup) && this.X != 0) {
            ((android.view.ViewGroup) this.f413672f.getView()).setDescendantFocusability(this.X);
            this.X = 0;
        }
        n();
        if (this.D1) {
            this.D1 = false;
            this.f413673g = null;
            this.f413674h = null;
            this.f413675i = null;
            android.view.GestureDetector gestureDetector = this.K;
            if (gestureDetector != null) {
                gestureDetector.setOnDoubleTapListener(null);
                this.K = null;
            }
            this.L = null;
            this.f413678n = null;
            this.I = null;
            this.f413680p = null;
            this.f413683q = null;
            this.f413684r = null;
            this.f413685s = null;
            this.f413679o = null;
            this.f413686t.setGestureDetector(null);
            this.f413686t.setOnTouchListener(null);
            this.f413686t = null;
            this.f413688v = null;
            this.f413687u = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.f413689w = null;
            this.f413696z.setOnClickListener(null);
            this.f413696z = null;
            this.A.setOnClickListener(null);
            this.A = null;
            this.f413690x.setOnClickListener(null);
            this.f413690x = null;
            this.f413693y.setOnClickListener(null);
            this.f413693y = null;
            by5.c4.f("XWebNativeInterface", "uninitView");
        }
        this.f413677m = null;
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.f413669J;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f413669J = null;
        }
    }

    @Override // sx5.a
    public boolean f(java.lang.Object obj) {
        by5.c4.f("XWebNativeInterface", "setVideoJsCallback:" + obj);
        this.Z = (com.tencent.xweb.VideoJsCallback) obj;
        return true;
    }

    @Override // sx5.a
    public void g(boolean z17, boolean z18) {
        if (this.f413672f == null || !z18 || this.f413697z1 == null) {
            return;
        }
        by5.c4.f("XWebNativeInterface", "evaluteJavascript, isPageStart:" + z17);
        java.lang.String str = this.f413697z1;
        if (z17) {
            str = "window.addEventListener('DOMContentLoaded', function() {" + str + "});this.xwebReturn = function (){return \"1\";};this.xwebReturn()";
        }
        this.f413672f.evaluateJavascript(str, new sx5.l(this));
    }

    @Override // com.tencent.xweb.o0
    public void h() {
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoPlay");
        this.f413672f.evaluateJavascript("xwebVideoBridge.xwebToJS_Video_NewPlay();", new sx5.m(this));
    }

    @Override // sx5.a
    public void i(boolean z17) {
        by5.c4.f("XWebNativeInterface", "disableJsCallback:" + z17);
        this.Y = z17;
    }

    @Override // sx5.a
    public void j(java.lang.Object obj) {
        try {
            new by5.i0(obj, "addJavascriptInterface", java.lang.Object.class, java.lang.String.class).b(this, "xwebToNative");
        } catch (java.lang.Exception e17) {
            by5.c4.d("XWebNativeInterface", "registerJavascriptInterface, error", e17);
        }
    }

    public final android.app.Activity k(android.content.Context context) {
        android.content.Context baseContext;
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (!(context instanceof android.content.ContextWrapper) || (baseContext = ((android.content.ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return k(baseContext);
    }

    public void l() {
        android.view.SurfaceView r17;
        by5.c4.f("XWebNativeInterface", "attach start");
        if (this.N1) {
            by5.c4.f("XWebNativeInterface", "attach, has entered fullscreen");
            return;
        }
        android.app.Activity z17 = z();
        if (z17 == null) {
            by5.c4.f("XWebNativeInterface", "attach, activity is null");
            return;
        }
        this.f413671e = new java.lang.ref.WeakReference(z17);
        android.view.OrientationEventListener orientationEventListener = this.C1;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.C1 = null;
        }
        sx5.n0 n0Var = new sx5.n0(this, p().getApplicationContext(), 3);
        this.C1 = n0Var;
        n0Var.enable();
        this.f413674h.setWindowFocusChangedListener(this.I1);
        android.app.Application application = z17.getApplication();
        this.f413670d = application;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.H1);
        }
        by5.c4.f("XWebNativeInterface", "registerActivityLifecycleCallback activity:" + z17 + ", mApplication:" + this.f413670d);
        v();
        sx5.x0 x0Var = this.K1;
        if (x0Var == sx5.x0.None) {
            this.K1 = sx5.x0.Attaching;
        } else if (x0Var == sx5.x0.Detaching) {
            this.K1 = sx5.x0.DetachingAttached;
            return;
        }
        this.N1 = true;
        ((android.widget.FrameLayout) z17.getWindow().getDecorView()).addView(this.f413674h, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        this.f413674h.setBackgroundColor(0);
        if (this.f413672f.isXWalkKernel()) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f413672f.getView().getParent();
            this.f413673g = viewGroup;
            viewGroup.removeView(this.f413672f.getView());
            this.f413674h.addView(this.f413672f.getView(), this.f413674h.getChildCount());
            this.f413675i.setBackgroundColor(0);
            w(new sx5.p0(this));
        } else {
            t(true);
            this.K1 = sx5.x0.Attached;
        }
        android.view.View view = this.f413677m;
        if (view != null) {
            this.f413675i.addView(view);
            this.f413675i.setBackgroundColor(0);
            sx5.z0 z0Var = this.f413674h;
            z0Var.addView(this.f413675i, z0Var.getChildCount(), new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
            if (this.f413672f.isSysKernel()) {
                android.view.View view2 = this.f413677m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/xweb/extension/video/XWebNativeInterface", "attach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/xweb/extension/video/XWebNativeInterface", "attach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.f413674h.addView(this.f413678n, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        if (this.f413672f.isSysKernel() && (r17 = r(this.f413677m)) != null) {
            r17.setZOrderMediaOverlay(true);
        }
        android.graphics.drawable.Drawable background = this.f413672f.getView().getBackground();
        this.J1 = background;
        if (background != null) {
            this.J1 = background.getConstantState().newDrawable().mutate();
        }
        this.f413672f.getView().setBackground(new android.graphics.drawable.ColorDrawable(-16777216));
        if (this.f413672f.isSysKernel()) {
            this.f413674h.postDelayed(new sx5.q0(this), 200L);
        }
        by5.c4.f("XWebNativeInterface", "attach end");
    }

    public final boolean m(double d17) {
        return java.lang.Double.isInfinite(d17) || d17 <= 0.0d;
    }

    public void n() {
        by5.c4.f("XWebNativeInterface", "detach start");
        if (!this.N1) {
            by5.c4.f("XWebNativeInterface", "detach, has exited fullscreen");
            return;
        }
        this.f413671e = null;
        this.f413681p0 = null;
        this.f413692x1 = null;
        this.f413695y1 = null;
        android.view.OrientationEventListener orientationEventListener = this.C1;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.C1 = null;
        }
        this.f413674h.setWindowFocusChangedListener(null);
        by5.c4.f("XWebNativeInterface", "unRegisterActivityLifecycleCallback application:" + this.f413670d);
        android.app.Application application = this.f413670d;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.H1);
            this.f413670d = null;
        }
        sx5.x0 x0Var = this.K1;
        if (x0Var == sx5.x0.Attached) {
            this.K1 = sx5.x0.Detaching;
        } else if (x0Var == sx5.x0.Attaching) {
            this.K1 = sx5.x0.AttachingDetached;
            return;
        }
        if (this.J1 != null) {
            this.f413672f.getView().setBackground(this.J1);
            this.J1 = null;
        } else {
            this.f413672f.getView().setBackground(new android.graphics.drawable.ColorDrawable(0));
        }
        if (this.f413672f.isXWalkKernel()) {
            this.f413674h.removeView(this.f413672f.getView());
            this.f413673g.addView(this.f413672f.getView(), 0);
        }
        android.view.View view = this.f413677m;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            android.widget.FrameLayout frameLayout = this.f413675i;
            if (parent == frameLayout) {
                frameLayout.removeView(this.f413677m);
            }
        }
        android.view.ViewParent parent2 = this.f413675i.getParent();
        sx5.z0 z0Var = this.f413674h;
        if (parent2 == z0Var) {
            z0Var.removeView(this.f413675i);
        }
        android.view.ViewParent parent3 = this.f413678n.getParent();
        sx5.z0 z0Var2 = this.f413674h;
        if (parent3 == z0Var2) {
            z0Var2.removeView(this.f413678n);
        }
        this.f413678n.setVisibility(8);
        int i17 = this.U;
        if (i17 != -3) {
            x(i17);
            this.U = -3;
        }
        t(false);
        if (this.f413674h.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) this.f413674h.getParent()).removeView(this.f413674h);
        }
        sx5.x0 x0Var2 = this.K1;
        sx5.x0 x0Var3 = sx5.x0.DetachingAttached;
        sx5.x0 x0Var4 = sx5.x0.None;
        if (x0Var2 == x0Var3) {
            this.K1 = x0Var4;
            l();
        } else {
            this.K1 = x0Var4;
        }
        this.N1 = false;
        this.M = false;
        by5.c4.f("XWebNativeInterface", "detach end");
    }

    public final void o() {
        int descendantFocusability;
        int descendantFocusability2;
        if ((this.f413672f.getView() instanceof android.view.ViewGroup) && (descendantFocusability2 = ((android.view.ViewGroup) this.f413672f.getView()).getDescendantFocusability()) != 131072) {
            this.W = descendantFocusability2;
            ((android.view.ViewGroup) this.f413672f.getView()).setDescendantFocusability(131072);
        }
        if ((this.f413672f.getWebViewUI() instanceof android.view.ViewGroup) && (descendantFocusability = ((android.view.ViewGroup) this.f413672f.getWebViewUI()).getDescendantFocusability()) != 131072) {
            this.X = descendantFocusability;
            ((android.view.ViewGroup) this.f413672f.getWebViewUI()).setDescendantFocusability(131072);
        }
        by5.c4.f("XWebNativeInterface", "fixFocus, requestFocus return:" + this.f413672f.getView().requestFocus());
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoChangeStatus");
        this.f413672f.evaluateJavascript("xwebVideoBridge.xwebToJS_Video_Play();", new sx5.o(this));
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        this.F1 = 0;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0124, code lost:
    
        if (r3 < 0.0d) goto L50;
     */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScroll(android.view.MotionEvent r16, android.view.MotionEvent r17, float r18, float r19) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sx5.a1.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        android.widget.FrameLayout frameLayout = this.f413689w;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            w(new sx5.b0(this));
            return true;
        }
        java.util.Timer timer = this.E1;
        if (timer != null) {
            timer.cancel();
            this.E1.purge();
            this.E1 = null;
        }
        if (by5.b.a(p()).b()) {
            w(new sx5.w(this));
        } else {
            if (this.f413688v.getVisibility() == 0) {
                w(new sx5.x(this));
            } else {
                w(new sx5.w(this));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return true;
    }

    @android.webkit.JavascriptInterface
    public void onSpecialVideoEnterFullscreen(int i17) {
        by5.c4.f("XWebNativeInterface", "onSpecialVideoEnterFullscreen:" + i17);
        boolean isXWalkKernel = this.f413672f.isXWalkKernel();
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null) {
            int i18 = i17 == 0 ? isXWalkKernel ? 163 : com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX : i17 == 1 ? isXWalkKernel ? 164 : 160 : i17 == 2 ? isXWalkKernel ? 165 : 161 : i17 == 3 ? isXWalkKernel ? 166 : 162 : 0;
            if (i18 > 0) {
                n1Var.b(577L, i18, 1L);
            }
        }
    }

    @android.webkit.JavascriptInterface
    public void onSpecialVideoHook(int i17) {
        by5.c4.f("XWebNativeInterface", "onSpecialVideoHook:" + i17);
        boolean isXWalkKernel = this.f413672f.isXWalkKernel();
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null) {
            int i18 = i17 == 0 ? isXWalkKernel ? 155 : 151 : i17 == 1 ? isXWalkKernel ? 156 : 152 : i17 == 2 ? isXWalkKernel ? 157 : com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS : i17 == 3 ? isXWalkKernel ? 158 : 154 : 0;
            if (i18 > 0) {
                n1Var.b(577L, i18, 1L);
            }
        }
    }

    @android.webkit.JavascriptInterface
    public boolean onVideoEmptied() {
        by5.c4.f("XWebNativeInterface", "onVideoEmptied");
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback == null) {
            return false;
        }
        videoJsCallback.onVideoEmptied();
        return true;
    }

    @android.webkit.JavascriptInterface
    public void onVideoEnded() {
        by5.c4.f("XWebNativeInterface", "onVideoEnded");
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoEnded();
        }
    }

    @android.webkit.JavascriptInterface
    public void onVideoEnterFullscreen(boolean z17, long j17, double d17, double d18, boolean z18, boolean z19, double d19, double d27, double[] dArr) {
        double d28;
        com.tencent.xweb.n1 n1Var;
        com.tencent.xweb.n1 n1Var2;
        by5.c4.f("XWebNativeInterface", "onVideoEnterFullscreen, isVideoTag:" + z17 + ",width:" + d17 + ",height:" + d18 + ",pause:" + z18 + ",seeking:" + z19 + ",currentTime:" + d19 + ",duration:" + d27 + ", accessibility:" + by5.b.a(p()).b());
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            d28 = d27;
            videoJsCallback.onVideoEnterFullscreen(z17, j17, d17, d18, z18, z19, d19, d27, dArr);
        } else {
            d28 = d27;
        }
        if (this.f413672f.isXWalkKernel()) {
            com.tencent.xweb.n1 n1Var3 = by5.s0.f36595c;
            if (n1Var3 != null) {
                n1Var3.b(577L, 54L, 1L);
            }
        } else if (this.f413672f.isSysKernel() && (n1Var = by5.s0.f36595c) != null) {
            n1Var.b(577L, 58L, 1L);
        }
        if (z17) {
            if (this.f413672f.isXWalkKernel()) {
                com.tencent.xweb.n1 n1Var4 = by5.s0.f36595c;
                if (n1Var4 != null) {
                    n1Var4.b(577L, 55L, 1L);
                }
            } else if (this.f413672f.isSysKernel() && (n1Var2 = by5.s0.f36595c) != null) {
                n1Var2.b(577L, 59L, 1L);
            }
            this.M = true;
        } else {
            this.M = false;
        }
        this.N = d28;
        this.P = d17;
        this.Q = d18;
        if (z19) {
            onVideoSeeking();
        } else {
            onVideoSeeked();
        }
        w(new sx5.h0(this, d17, d18, z17));
        onVideoTimeUpdate(d19, d27, dArr);
        w(new sx5.d0(this, z18));
    }

    @android.webkit.JavascriptInterface
    public void onVideoError(int i17, java.lang.String str) {
        by5.c4.f("XWebNativeInterface", "onVideoError");
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoError(i17, str);
        }
    }

    @android.webkit.JavascriptInterface
    public void onVideoExitFullscreen() {
        by5.c4.f("XWebNativeInterface", "onVideoExitFullscreen");
        this.M = false;
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoExitFullscreen();
        }
        w(new sx5.i0(this));
    }

    @android.webkit.JavascriptInterface
    public void onVideoPause() {
        by5.c4.f("XWebNativeInterface", "onVideoPause");
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoPause();
        }
        w(new sx5.d0(this, true));
    }

    @android.webkit.JavascriptInterface
    public void onVideoPlay() {
        by5.c4.f("XWebNativeInterface", "onVideoPlay");
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoPlay();
        }
        w(new sx5.d0(this, false));
    }

    @android.webkit.JavascriptInterface
    public void onVideoPlaying() {
        by5.c4.f("XWebNativeInterface", "onVideoPlaying");
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoPlaying();
        }
        w(new sx5.z(this));
    }

    @android.webkit.JavascriptInterface
    public void onVideoRateChange(double d17) {
        by5.c4.f("XWebNativeInterface", "onVideoRateChange, rate:" + d17);
        this.S = d17;
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoRateChange(d17);
        }
    }

    @android.webkit.JavascriptInterface
    public void onVideoSeeked() {
        by5.c4.f("XWebNativeInterface", "onVideoSeeked");
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoSeeked();
        }
        w(new sx5.z(this));
    }

    @android.webkit.JavascriptInterface
    public void onVideoSeeking() {
        by5.c4.f("XWebNativeInterface", "onVideoSeeking");
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoSeeking();
        }
        w(new sx5.y(this));
    }

    @android.webkit.JavascriptInterface
    public void onVideoSizeUpdate(double d17, double d18) {
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoSizeUpdate(d17, d18);
        }
        if (this.Q == d18 && this.P == d17) {
            return;
        }
        by5.c4.f("XWebNativeInterface", "onVideoSizeUpdate width:" + d17 + ", height:" + d18);
        this.P = d17;
        this.Q = d18;
        w(new sx5.j0(this, d17, d18));
    }

    @android.webkit.JavascriptInterface
    public void onVideoTimeUpdate(double d17, double d18, double[] dArr) {
        this.N = d18;
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoTimeUpdate(d17, d18, dArr);
        }
        w(new sx5.f0(this, true, d17));
        w(new sx5.g0(this, d18, dArr));
    }

    @android.webkit.JavascriptInterface
    public void onVideoVolumeChange(boolean z17) {
        by5.c4.f("XWebNativeInterface", "onVideoVolumeChange, muted:" + z17);
        this.R = z17;
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoVolumeChange(z17);
        }
        w(new sx5.e0(this, this.R));
    }

    @android.webkit.JavascriptInterface
    public void onVideoWaiting() {
        by5.c4.f("XWebNativeInterface", "onVideoWaiting");
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoWaiting();
        }
        w(new sx5.y(this));
    }

    public final android.content.Context p() {
        return this.f413672f.getContext();
    }

    public final java.lang.String q(double d17, double d18) {
        java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), "%02d", java.lang.Integer.valueOf((int) (d17 / 3600.0d)));
        int i17 = (int) (d17 % 3600.0d);
        java.lang.String format2 = java.lang.String.format(java.util.Locale.getDefault(), "%02d", java.lang.Integer.valueOf(i17 / 60));
        java.lang.String format3 = java.lang.String.format(java.util.Locale.getDefault(), "%02d", java.lang.Integer.valueOf(i17 % 60));
        return d18 > 3600.0d ? java.lang.String.format(java.util.Locale.getDefault(), "%s:%s:%s", format, format2, format3) : java.lang.String.format(java.util.Locale.getDefault(), "%s:%s", format2, format3);
    }

    public final android.view.SurfaceView r(android.view.View view) {
        if (view instanceof android.view.SurfaceView) {
            return (android.view.SurfaceView) view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
            android.view.SurfaceView r17 = r(viewGroup.getChildAt(i17));
            if (r17 != null) {
                return r17;
            }
        }
        return null;
    }

    public final android.view.TextureView s(android.view.View view) {
        if (view instanceof android.view.TextureView) {
            return (android.view.TextureView) view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
            android.view.TextureView s17 = s(viewGroup.getChildAt(i17));
            if (s17 != null) {
                return s17;
            }
        }
        return null;
    }

    public void t(boolean z17) {
        android.app.Activity z18 = z();
        if (z18 == null) {
            by5.c4.f("XWebNativeInterface", "onActivityFullscreen, activity is null");
            return;
        }
        if (!z17) {
            if (this.M1) {
                z18.getWindow().addFlags(2048);
            }
            if (!this.L1) {
                z18.getWindow().clearFlags(1024);
            }
            if (this.O1) {
                return;
            }
            this.f413674h.setSystemUiVisibility(this.P1);
            return;
        }
        if ((z18.getWindow().getAttributes().flags & 2048) != 0) {
            this.M1 = true;
            z18.getWindow().clearFlags(2048);
        } else {
            this.M1 = false;
        }
        if ((z18.getWindow().getAttributes().flags & 1024) != 0) {
            this.L1 = true;
        } else {
            this.L1 = false;
            z18.getWindow().addFlags(1024);
        }
        if ((this.f413674h.getSystemUiVisibility() & 4096) != 0 && (this.f413674h.getSystemUiVisibility() & 4) != 0 && (this.f413674h.getSystemUiVisibility() & 2) != 0) {
            this.O1 = true;
            return;
        }
        this.O1 = false;
        this.P1 = this.f413674h.getSystemUiVisibility();
        sx5.z0 z0Var = this.f413674h;
        z0Var.setSystemUiVisibility(z0Var.getSystemUiVisibility() | 4096 | 4 | 2);
    }

    public void u(int i17, int i18) {
        int i19;
        int max;
        int min;
        android.app.Activity z17 = z();
        if (z17 == null) {
            by5.c4.f("XWebNativeInterface", "onVideoSizeChanged, activity is null");
            return;
        }
        if (i17 == 0 || i18 == 0) {
            by5.c4.f("XWebNativeInterface", "onVideoSizeChanged width == 0 || height == 0 return");
            return;
        }
        if (this.U == -3) {
            this.U = z17.getRequestedOrientation();
        }
        if (i17 <= i18) {
            i19 = 1;
            x(1);
        } else {
            x(0);
            i19 = 0;
        }
        this.V = i19;
        by5.c4.f("XWebNativeInterface", "onVideoSizeChanged, currentOrientation:" + i19);
        android.view.View view = this.f413677m;
        if (view != null) {
            android.view.Display defaultDisplay = ((android.view.WindowManager) p().getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point(0, 0);
            defaultDisplay.getSize(point);
            if (i19 == 0) {
                min = java.lang.Math.max(point.x, point.y);
                max = java.lang.Math.min(point.x, point.y);
            } else {
                max = java.lang.Math.max(point.x, point.y);
                min = java.lang.Math.min(point.x, point.y);
            }
            double d17 = (i17 * 1.0d) / i18;
            double d18 = min;
            double d19 = max;
            if (d17 >= (d18 * 1.0d) / d19) {
                max = (int) (d18 * (1.0d / d17));
            } else {
                min = (int) (d19 * d17);
            }
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(min, max, 17));
        }
    }

    public void v() {
        android.app.Activity z17;
        if (this.f413681p0 == null) {
            this.f413681p0 = (android.media.AudioManager) p().getSystemService("audio");
        }
        this.f413691x0 = this.f413681p0.getStreamMaxVolume(3);
        this.f413694y0 = this.f413681p0.getStreamVolume(3);
        if (this.f413692x1 == null && (z17 = z()) != null) {
            this.f413692x1 = z17.getWindow();
        }
        android.view.Window window = this.f413692x1;
        if (window != null && this.f413695y1 == null) {
            this.f413695y1 = window.getAttributes();
        }
        android.view.WindowManager.LayoutParams layoutParams = this.f413695y1;
        if (layoutParams != null) {
            float f17 = layoutParams.screenBrightness;
            this.f413682p1 = f17;
            if (f17 == -1.0f) {
                try {
                    this.f413682p1 = (float) (android.provider.Settings.System.getInt(p().getContentResolver(), "screen_brightness") / 256.0d);
                } catch (android.provider.Settings.SettingNotFoundException e17) {
                    by5.c4.d("XWebNativeInterface", "get brightness error", e17);
                }
            }
        }
    }

    public void w(java.lang.Runnable runnable) {
        if (this.Y) {
            return;
        }
        sx5.u uVar = new sx5.u(this, runnable);
        android.app.Activity z17 = z();
        if (z17 != null) {
            z17.runOnUiThread(uVar);
        } else {
            this.f413672f.getView().post(uVar);
        }
    }

    public final void x(int i17) {
        android.app.Activity z17 = z();
        if (z17 == null) {
            by5.c4.f("XWebNativeInterface", "setRequestedOrientation activity = null");
            return;
        }
        com.tencent.xweb.VideoJsCallback videoJsCallback = this.Z;
        if (videoJsCallback == null || !videoJsCallback.onSetRequestedOrientation(i17)) {
            z17.setRequestedOrientation(i17);
        } else {
            by5.c4.f("XWebNativeInterface", "setRequestedOrientation by wechat client");
        }
    }

    public void y() {
        java.util.Timer timer = this.E1;
        if (timer != null) {
            timer.cancel();
            this.E1.purge();
            this.E1 = null;
        }
        if (by5.b.a(p()).b()) {
            return;
        }
        java.util.Timer timer2 = new java.util.Timer();
        this.E1 = timer2;
        timer2.schedule(new sx5.v(this), 7000L);
    }

    public final android.app.Activity z() {
        android.app.Activity k17 = k(this.f413672f.getContext());
        if (k17 == null) {
            by5.c4.c("XWebNativeInterface", "tryGetActivity but no Activity");
        }
        return k17;
    }
}
