package jw3;

/* loaded from: classes8.dex */
public final class i extends androidx.appcompat.app.i0 implements wq1.d {

    /* renamed from: f, reason: collision with root package name */
    public r45.sn f302324f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f302325g;

    /* renamed from: h, reason: collision with root package name */
    public zg0.q2 f302326h;

    /* renamed from: i, reason: collision with root package name */
    public final jw3.g f302327i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f302328m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f302329n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f302330o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f302331p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f302332q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f302333r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f302334s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.box.webview.BoxWebView f302335t;

    /* renamed from: u, reason: collision with root package name */
    public uc0.s f302336u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(android.content.Context context, r45.sn homeContext, uc0.s sVar) {
        super(context, com.tencent.mm.R.style.f494076dr);
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(homeContext, "homeContext");
        jw3.h hVar = new jw3.h(this);
        this.f302327i = new jw3.g(this);
        zg0.i3 i3Var = (zg0.i3) i95.n0.c(zg0.i3.class);
        iw3.f fVar = iw3.f.f295237b;
        ((yg0.i4) i3Var).getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) nw4.d3.f340822b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
            arrayList.size();
        }
        this.f302325g = context;
        this.f302324f = homeContext;
        this.f302336u = sVar;
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.friend.RepairerConfigSelectTextPreloadWebView()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectTextDialog", "createWebView() called enablePreloadWebView:" + z17);
        if (z17) {
            kd0.e2 e2Var = (kd0.e2) i95.n0.c(kd0.e2.class);
            android.content.Context context2 = this.f302325g;
            if (context2 == 0) {
                kotlin.jvm.internal.o.o("mContext");
                throw null;
            }
            boxWebView = (com.tencent.mm.plugin.box.webview.BoxWebView) ((jd0.c) e2Var).wi(context2, context2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context2 : null, jw3.a.f302316d);
        } else {
            android.content.Context context3 = this.f302325g;
            if (context3 == null) {
                kotlin.jvm.internal.o.o("mContext");
                throw null;
            }
            boxWebView = new com.tencent.mm.plugin.box.webview.BoxWebView(context3);
        }
        this.f302335t = boxWebView;
        boxWebView.J0(null, null);
        if (com.tencent.mm.ui.bk.C()) {
            com.tencent.mm.plugin.box.webview.BoxWebView boxWebView2 = this.f302335t;
            com.tencent.xweb.z0 settings = boxWebView2 != null ? boxWebView2.getSettings() : null;
            if (settings != null) {
                settings.B(2);
            }
            com.tencent.mm.plugin.box.webview.BoxWebView boxWebView3 = this.f302335t;
            if (boxWebView3 != null) {
                boxWebView3.setBackgroundColor(0);
            }
            com.tencent.mm.plugin.box.webview.BoxWebView boxWebView4 = this.f302335t;
            android.graphics.drawable.Drawable background = boxWebView4 != null ? boxWebView4.getBackground() : null;
            if (background != null) {
                background.setAlpha(0);
            }
        }
        android.widget.FrameLayout frameLayout = this.f302334s;
        if (frameLayout != null) {
            frameLayout.addView(this.f302335t);
        }
        setCancelable(true);
        zg0.g3 g3Var = (zg0.g3) i95.n0.c(zg0.g3.class);
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView5 = this.f302335t;
        kotlin.jvm.internal.o.d(boxWebView5);
        zg0.q2 Ai = ((yg0.e4) g3Var).Ai(boxWebView5, new zg0.k2(null, true, false, false, true, 0, false, 105, null), fVar);
        this.f302326h = Ai;
        ((com.tencent.mm.plugin.webview.core.r0) Ai).D(hVar);
        zg0.q2 q2Var = this.f302326h;
        if (q2Var != null) {
            ((com.tencent.mm.plugin.webview.core.r0) q2Var).q0();
        }
        ((ku5.t0) ku5.t0.f312615d).B(new jw3.f(this));
    }

    @Override // androidx.appcompat.app.i0, wq1.d
    public android.content.Context H() {
        android.content.Context context = this.f302325g;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("mContext");
        throw null;
    }

    @Override // wq1.d
    public com.tencent.mm.plugin.box.webview.BoxWebView c() {
        return this.f302335t;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, wq1.d
    public void dismiss() {
        android.content.Context context = getContext();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity != null && appCompatActivity.isDestroyed()) {
            return;
        }
        if (appCompatActivity != null && appCompatActivity.isFinishing()) {
            return;
        }
        super.dismiss();
    }

    @Override // wq1.d
    public void h() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // wq1.d
    public xq1.g o() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.text.TextPaint paint;
        android.widget.FrameLayout frameLayout;
        android.widget.Button button;
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        uc0.r[] rVarArr = uc0.r.f426275d;
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        C(1);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489442ck3, (android.view.ViewGroup) null, false);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f302328m = inflate;
        if (inflate != null) {
        }
        android.view.View view = this.f302328m;
        this.f302334s = view != null ? (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.f487699pi0) : null;
        android.view.View view2 = this.f302328m;
        this.f302333r = view2 != null ? (android.widget.FrameLayout) view2.findViewById(com.tencent.mm.R.id.gxo) : null;
        android.view.View view3 = this.f302328m;
        this.f302329n = view3 != null ? (android.widget.Button) view3.findViewById(com.tencent.mm.R.id.e2o) : null;
        android.view.View view4 = this.f302328m;
        this.f302330o = view4 != null ? (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.cz6) : null;
        android.view.View view5 = this.f302328m;
        this.f302331p = view5 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view5.findViewById(com.tencent.mm.R.id.llx) : null;
        android.view.View view6 = this.f302328m;
        this.f302332q = view6 != null ? (android.widget.TextView) view6.findViewById(com.tencent.mm.R.id.czu) : null;
        android.widget.TextView textView = this.f302330o;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f302330o;
        if (textView2 != null) {
            textView2.setOnClickListener(new jw3.b(this));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f302331p;
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f302331p;
        if (weImageView2 != null) {
            weImageView2.setOnClickListener(new jw3.c(this));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f302331p;
        if (weImageView3 != null) {
            weImageView3.post(new jw3.d(weImageView3));
        }
        android.widget.FrameLayout frameLayout2 = this.f302334s;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.f302335t);
        }
        setOnDismissListener(new jw3.e(this));
        setCancelable(true);
        uc0.s sVar = this.f302336u;
        if (sVar != null) {
            zv2.m mVar = ((zv2.e) sVar).f476401a;
            java.lang.String string = mVar.f476395d.getResources().getString(com.tencent.mm.R.string.evr);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            if (string.length() == 0) {
                android.widget.TextView textView3 = this.f302332q;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                android.widget.TextView textView4 = this.f302332q;
                if (textView4 != null && (paint = textView4.getPaint()) != null) {
                    com.tencent.mm.ui.bk.r0(paint, 0.8f);
                }
                android.widget.TextView textView5 = this.f302332q;
                if (textView5 != null) {
                    textView5.setText(string);
                }
                android.widget.TextView textView6 = this.f302332q;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = mVar.f476395d;
            java.lang.String string2 = appCompatActivity.getResources().getString(com.tencent.mm.R.string.f490441v5);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            if (!(string2.length() == 0) && (button = this.f302329n) != null) {
                button.setText(string2);
            }
            mVar.f476416o = com.tencent.mm.ui.id.b(appCompatActivity).inflate(com.tencent.mm.R.layout.b2_, (android.view.ViewGroup) null, false);
            zv2.m.m(mVar);
            android.view.View view7 = mVar.f476416o;
            if (view7 == null || (frameLayout = this.f302333r) == null) {
                return;
            }
            frameLayout.addView(view7);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        try {
            if (getContext() instanceof android.app.Activity) {
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SelectTextDialog", "realShowDialog ui is finishing and ignore");
                }
            }
            super.show();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SelectTextDialog", e17, "realShowDialog exception", new java.lang.Object[0]);
        }
    }

    @Override // wq1.d
    public xq1.f u() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }
}
