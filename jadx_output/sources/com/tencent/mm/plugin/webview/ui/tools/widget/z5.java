package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class z5 extends com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout {

    /* renamed from: x1, reason: collision with root package name */
    public static final /* synthetic */ int f187623x1 = 0;
    public final android.widget.Button A;
    public final com.tencent.mm.ui.widget.MMEditText B;
    public final android.widget.ListView C;
    public final android.view.View D;
    public final android.view.View E;
    public final android.widget.TextView F;
    public final android.widget.TextView G;
    public final android.widget.TextView H;
    public com.tencent.mm.plugin.webview.ui.tools.widget.l5 I;

    /* renamed from: J, reason: collision with root package name */
    public int f187624J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public java.lang.String P;
    public java.lang.String Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public long V;
    public int W;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f187625l1;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.ref.WeakReference f187626p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f187627p1;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187628v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f187629w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout f187630x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f187631x0;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f187632y;

    /* renamed from: y0, reason: collision with root package name */
    public int f187633y0;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f187634z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webView, boolean z17, android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(context, "context");
        this.f187628v = webView;
        this.f187629w = z17;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c2o, this);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout");
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = (com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout) inflate;
        this.f187630x = webViewKeyboardLinearLayout;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.jsf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f187632y = findViewById;
        this.f187634z = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.widget.y5(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.jsg);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.jsi);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById3;
        this.A = button;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.jsh);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById4;
        this.B = mMEditText;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ash);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.C = (android.widget.ListView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.jst);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.D = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.jss);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.E = findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.asi);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.F = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.jsk);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.G = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.asj);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById10;
        this.H = textView;
        this.f187624J = -1;
        this.P = "";
        this.Q = "";
        this.f187626p0 = new java.lang.ref.WeakReference(this);
        getSayFooter().setMMEditText(mMEditText);
        getSayFooter().setVisibility(8);
        mMEditText.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.u4(this));
        mMEditText.setOnLongClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.v4(this));
        webViewKeyboardLinearLayout.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.widget.w4(this));
        findViewById6.setOnClickListener(com.tencent.mm.plugin.webview.ui.tools.widget.x4.f187599d);
        int rootHeight = getRootHeight();
        if (rootHeight > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById6.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = rootHeight;
            findViewById6.setLayoutParams(layoutParams);
        }
        if (!com.tencent.mm.sdk.platformtools.d2.j(context)) {
            q(2);
        }
        weImageView.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.y4(this));
        button.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.z4(this));
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.webview.ui.tools.widget.a5(this));
        android.text.Editable text = mMEditText.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        button.setEnabled(text.length() > 0);
        mMEditText.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.widget.b5(this));
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getNavHeightByDisplay() {
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(getContext());
        android.view.Window window = this.f187628v.getWindow();
        android.view.View decorView = window != null ? window.getDecorView() : null;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (decorView != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int keyBoardHeight = (b17.y - rect.bottom) - this.f187630x.getKeyBoardHeight();
        return keyBoardHeight < 0 ? com.tencent.mm.ui.bl.c(getContext()) : keyBoardHeight;
    }

    private final int getReplyHeight() {
        if (this.M != 0) {
            return i65.a.b(getContext(), 38);
        }
        return 0;
    }

    private final int getRootHeight() {
        return i65.a.b(getContext(), kd1.c.CTRL_INDEX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter getSayFooter() {
        java.lang.Object value = ((jz5.n) this.f187634z).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter) value;
    }

    public static final void j(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        z5Var.B.requestFocus();
        if (z5Var.getSayFooter().h()) {
            com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter = z5Var.getSayFooter();
            sayFooter.f187043h.h();
            sayFooter.f187043h.setVisibility(8);
            sayFooter.setVisibility(8);
        }
        if (!com.tencent.mm.sdk.platformtools.d2.j(z5Var.getContext())) {
            com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter2 = z5Var.getSayFooter();
            if (!sayFooter2.h()) {
                sayFooter2.setVisibility(8);
            }
        }
        z5Var.D.postInvalidate();
    }

    public static final void k(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var, int i17) {
        if (i17 <= 0) {
            z5Var.getClass();
        } else if (com.tencent.mm.sdk.platformtools.d2.e(z5Var.getContext()) != 2) {
            z5Var.n(i17);
        }
    }

    private final void setRootHeight(int i17) {
        android.view.View view = this.D;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = o(i17);
        view.setLayoutParams(layoutParams);
        int i18 = layoutParams.height;
        if (com.tencent.mm.sdk.platformtools.d2.j(getContext())) {
            this.L = i18;
        }
        com.tencent.mm.sdk.platformtools.o4.R("MPWriteCommentLayout").A("MPWriteCommentRootHeight", i18);
    }

    public final void getAppMsgCommentList() {
        r45.g9 g9Var = new r45.g9();
        g9Var.f374997d = this.P;
        if (this.f187631x0) {
            return;
        }
        int i17 = this.f187633y0;
        g9Var.f374998e = i17;
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MPWriteCommentLayout", "no more my comment");
            return;
        }
        this.f187631x0 = true;
        g9Var.f374999f = 2;
        g9Var.f375000g = this.R;
        g9Var.f375001h = this.S;
        g9Var.f375003m = this.T;
        g9Var.f375004n = "" + this.W;
        g9Var.f375002i = this.U;
        g9Var.f375005o = this.V;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = g9Var;
        lVar.f70665b = new r45.h9();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/appmsg/appmsg_comment_list";
        lVar.f70667d = 2866;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.webview.ui.tools.widget.s5(this));
        cx4.a.c(7);
    }

    public final com.tencent.mm.plugin.webview.ui.tools.widget.m5 getCallback() {
        return null;
    }

    public final long getCommentTopicId() {
        return this.V;
    }

    public final int getEnterId() {
        return this.U;
    }

    public final int getItemShowType() {
        return this.T;
    }

    public final int getMinHeaderHeight() {
        return this.N;
    }

    public final int getMyCommentOffset() {
        return this.f187633y0;
    }

    public final int getScene() {
        return this.R;
    }

    public final int getSubScene() {
        return this.S;
    }

    public final int getTimeLineSessionId() {
        return this.W;
    }

    public final java.lang.String getTitle() {
        return this.Q;
    }

    public final java.lang.String getUrl() {
        return this.P;
    }

    public final java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.widget.z5> getWeakThis$plugin_webview_release() {
        return this.f187626p0;
    }

    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI getWebView() {
        return this.f187628v;
    }

    public final void n(int i17) {
        android.view.View view = this.D;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        int height = i17 + this.B.getHeight() + this.f187632y.getHeight() + getNavHeightByDisplay() + i65.a.b(getContext(), i65.a.c(getContext(), 60) + 16) + getReplyHeight();
        layoutParams.height = height;
        layoutParams.height = o(height);
        view.setLayoutParams(layoutParams);
        int i18 = layoutParams.height;
        if (com.tencent.mm.sdk.platformtools.d2.j(getContext())) {
            this.L = i18;
        }
        com.tencent.mm.sdk.platformtools.o4.R("MPWriteCommentLayout").A("MPWriteCommentRootHeight", i18);
    }

    public final int o(int i17) {
        int h17 = com.tencent.mm.ui.bl.h(getContext());
        int i18 = com.tencent.mm.ui.bl.b(getContext()).y;
        int i19 = i18 - h17;
        if (i17 > i19) {
            return i19;
        }
        if (this.N <= 0) {
            return i17;
        }
        int b17 = i65.a.b(getContext(), 20);
        int i27 = this.N;
        return i17 < ((i18 - i27) - h17) + b17 ? (i19 - i27) + b17 : i17;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        q(newConfig.orientation);
        if (getSayFooter().h()) {
            com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter = getSayFooter();
            sayFooter.f187043h.h();
            sayFooter.f187043h.setVisibility(8);
            sayFooter.setVisibility(8);
        }
    }

    public final void p(boolean z17) {
        if (this.M != 0) {
            this.M = 0;
            if (z17) {
                q(com.tencent.mm.sdk.platformtools.d2.e(getContext()));
            }
        }
        android.widget.TextView textView = this.H;
        textView.setText("");
        textView.setVisibility(8);
        this.B.setHint(getContext().getString(com.tencent.mm.R.string.anu));
        this.G.setText(getContext().getString(com.tencent.mm.R.string.ans));
    }

    public final void q(int i17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.B;
        if (i17 == 2) {
            setRootHeight(com.tencent.mm.ui.bl.b(getContext()).y - com.tencent.mm.ui.bl.h(getContext()));
            mMEditText.setMinLines(3);
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = this.f187630x;
        if (webViewKeyboardLinearLayout.f183774n) {
            n(webViewKeyboardLinearLayout.getKeyBoardHeight());
        } else {
            int i18 = this.L;
            if (i18 != 0) {
                setRootHeight(i18);
            } else {
                n(0);
            }
        }
        mMEditText.setMinLines(5);
    }

    public final void r(r45.m9 req) {
        kotlin.jvm.internal.o.g(req, "req");
        req.f380265m = this.R;
        req.f380266n = this.S;
        req.f380259d = this.P;
        req.f380264i = this.Q;
        req.f380261f = java.lang.System.currentTimeMillis();
        req.f380268p = this.T;
        req.f380269q = "" + this.W;
        req.f380267o = this.U;
        req.f380270r = this.V;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = req;
        lVar.f70665b = new r45.n9();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/appmsg/appmsg_operate_comment";
        lVar.f70667d = 2617;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.webview.ui.tools.widget.q5(this));
        hy4.h hVar = hy4.h.f286106a;
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f490604zq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187628v;
        webViewUI.T2 = hVar.a(string, context, webViewUI.T2);
    }

    public final void s(int i17) {
        java.lang.String queryParameter = android.net.Uri.parse(this.P).getQueryParameter("clicktime");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.P);
        sb6.append(",");
        sb6.append(this.R);
        sb6.append(",");
        if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
            queryParameter = "";
        }
        sb6.append(queryParameter);
        sb6.append(",");
        sb6.append(i17);
        sb6.append(",");
        sb6.append(java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(19265, sb6.toString());
    }

    public final void setCallback(com.tencent.mm.plugin.webview.ui.tools.widget.m5 m5Var) {
    }

    public final void setCommentTopicId(long j17) {
        this.V = j17;
    }

    public final void setEnterId(int i17) {
        this.U = i17;
    }

    public final void setItemShowType(int i17) {
        this.T = i17;
    }

    public final void setMinHeaderHeight(int i17) {
        this.N = i17;
    }

    public final void setMyCommentOffset(int i17) {
        this.f187633y0 = i17;
    }

    public final void setScene(int i17) {
        this.R = i17;
    }

    public final void setSubScene(int i17) {
        this.S = i17;
    }

    public final void setTimeLineSessionId(int i17) {
        this.W = i17;
    }

    public final void setTitle(java.lang.String str) {
        this.Q = str;
    }

    public final void setUrl(java.lang.String str) {
        this.P = str;
    }

    public final void setWeakThis$plugin_webview_release(java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.widget.z5> weakReference) {
        kotlin.jvm.internal.o.g(weakReference, "<set-?>");
        this.f187626p0 = weakReference;
    }

    public final void t() {
        if (getVisibility() == 0) {
            if (getSayFooter().h()) {
                com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter = getSayFooter();
                sayFooter.f187043h.h();
                sayFooter.f187043h.setVisibility(8);
                sayFooter.setVisibility(8);
            }
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(150L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new com.tencent.mm.plugin.webview.ui.tools.widget.t5(this));
            android.view.View view = this.D;
            view.clearAnimation();
            view.startAnimation(translateAnimation);
            this.f187628v.hideVKB();
            this.f187633y0 = 0;
            com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var = this.I;
            if (l5Var != null) {
                l5Var.f187383e.clear();
                l5Var.notifyDataSetChanged();
            }
        }
    }

    public final void u() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478187d0, typedValue, true);
        this.E.setBackgroundColor(b3.l.getColor(context, typedValue.resourceId));
        this.F.setVisibility(8);
    }

    public final void v() {
        if (this.f187624J == -3) {
            this.f187628v.hideVKB();
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter = getSayFooter();
        if (sayFooter.h() || sayFooter.getVisibility() == 0) {
            if (getVisibility() == 0) {
                com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter2 = getSayFooter();
                sayFooter2.f187043h.h();
                sayFooter2.f187043h.setVisibility(8);
                sayFooter2.setVisibility(8);
                return;
            }
        }
        t();
    }

    public final void w(java.lang.String replyContent, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(replyContent, "replyContent");
        this.M = i17;
        this.G.setText(getContext().getString(com.tencent.mm.R.string.ajb));
        android.widget.TextView textView = this.H;
        textView.setVisibility(0);
        android.content.Context context = getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (com.tencent.mm.sdk.platformtools.t8.K0(replyContent)) {
            replyContent = "";
        }
        objArr[0] = replyContent;
        textView.setText(context.getString(com.tencent.mm.R.string.aja, objArr));
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.aj_);
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.B;
        mMEditText.setHint(string);
        if (z17) {
            this.E.scrollTo(0, 0);
            mMEditText.requestFocus();
            java.lang.Object systemService = getContext().getSystemService("input_method");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(mMEditText, 0);
        }
    }

    public final void x(boolean z17) {
        this.K = z17;
        android.view.View view = this.D;
        view.clearAnimation();
        setVisibility(0);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(250L);
        translateAnimation.setFillAfter(false);
        view.clearAnimation();
        view.startAnimation(translateAnimation);
        android.widget.Button button = this.A;
        if (z17) {
            this.F.setVisibility(8);
            this.G.setText(getContext().getString(com.tencent.mm.R.string.ano));
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.B;
            mMEditText.setHint(com.tencent.mm.R.string.anp);
            button.setText(com.tencent.mm.R.string.f490551ya);
            button.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481012io));
            mMEditText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(200)});
            return;
        }
        getAppMsgCommentList();
        button.setText(com.tencent.mm.R.string.ank);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478186cz, typedValue, true);
        button.setBackground(b3.l.getDrawable(context, typedValue.resourceId));
    }
}
