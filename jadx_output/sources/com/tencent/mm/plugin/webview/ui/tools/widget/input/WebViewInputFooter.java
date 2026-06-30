package com.tencent.mm.plugin.webview.ui.tools.widget.input;

/* loaded from: classes8.dex */
public final class WebViewInputFooter extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public ey4.i f187277d;

    /* renamed from: e, reason: collision with root package name */
    public ey4.g f187278e;

    /* renamed from: f, reason: collision with root package name */
    public ey4.h f187279f;

    /* renamed from: g, reason: collision with root package name */
    public int f187280g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel f187281h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f187282i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f187283m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f187284n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f187285o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageButton f187286p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f187287q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f187288r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f187289s;

    /* renamed from: t, reason: collision with root package name */
    public int f187290t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f187291u;

    public WebViewInputFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f187280g = 0;
        this.f187290t = Integer.MAX_VALUE;
        this.f187291u = true;
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        this.f187288r = mMActivity;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.d9v, this);
        this.f187287q = (android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.pi_);
        this.f187283m = viewGroup.findViewById(com.tencent.mm.R.id.pih);
        this.f187284n = viewGroup.findViewById(com.tencent.mm.R.id.pid);
        this.f187282i = viewGroup.findViewById(com.tencent.mm.R.id.pii);
        this.f187285o = (com.tencent.mm.ui.widget.MMEditText) viewGroup.findViewById(com.tencent.mm.R.id.pia);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.tencent.mm.R.id.pik);
        this.f187286p = imageButton;
        imageButton.setOnClickListener(new ey4.a(this));
        this.f187285o.setOnTouchListener(new ey4.b(this));
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel webViewSmileyPanel = new com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel(getContext());
        this.f187281h = webViewSmileyPanel;
        webViewSmileyPanel.setVisibility(8);
        this.f187281h.setBackgroundResource(com.tencent.mm.R.drawable.bcd);
        this.f187281h.setOnTextOperationListener(new ey4.c(this));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7g)).addView(this.f187281h, -1, 0);
        this.f187284n.setOnClickListener(new ey4.e(this));
        this.f187285o.addTextChangedListener(new ey4.f(this));
    }

    public void a() {
        setVisibility(8);
        com.tencent.mm.ui.MMActivity mMActivity = this.f187288r;
        if (mMActivity != null) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f187285o;
            if (mMEditText != null) {
                mMActivity.hideVKB(mMEditText);
            }
            this.f187288r.hideVKB();
        }
        this.f187280g = 0;
        b();
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f187285o;
        if (mMEditText2 != null) {
            mMEditText2.clearFocus();
            this.f187285o.setFocusable(false);
            this.f187285o.setFocusableInTouchMode(false);
        }
    }

    public final void b() {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var;
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout;
        ey4.h hVar = this.f187279f;
        if (hVar != null && (webViewKeyboardLinearLayout = (e0Var = ((com.tencent.mm.plugin.webview.luggage.i0) hVar).f182220a).f182187u) != null && webViewKeyboardLinearLayout.getKeyBoardHeight() > 0) {
            int keyBoardHeight = e0Var.f182187u.getKeyBoardHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) e0Var.f182188v.getLayoutParams();
            if (marginLayoutParams.bottomMargin != keyBoardHeight) {
                marginLayoutParams.bottomMargin = keyBoardHeight;
                e0Var.f182188v.setLayoutParams(marginLayoutParams);
            }
        }
        this.f187281h.getClass();
        this.f187281h.setVisibility(8);
        this.f187286p.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
        this.f187280g = 0;
    }

    public final int c() {
        ey4.h hVar = this.f187279f;
        if (hVar != null) {
            com.tencent.mm.plugin.webview.luggage.e0 e0Var = ((com.tencent.mm.plugin.webview.luggage.i0) hVar).f182220a;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) e0Var.f182188v.getLayoutParams();
            if (marginLayoutParams.bottomMargin != 0) {
                marginLayoutParams.bottomMargin = 0;
                e0Var.f182188v.setLayoutParams(marginLayoutParams);
            }
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f187285o;
        if (mMEditText != null) {
            this.f187288r.hideVKB(mMEditText);
        }
        this.f187281h.getClass();
        this.f187281h.setVisibility(0);
        android.view.View view = this.f187281h.f187324h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f187281h.getLayoutParams();
        if (layoutParams != null && this.f187291u) {
            layoutParams.height = com.tencent.mm.sdk.platformtools.d2.g(getContext());
            this.f187281h.setLayoutParams(layoutParams);
        }
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    @Override // android.view.View
    public boolean isShown() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.ui.MMActivity mMActivity;
        super.onDetachedFromWindow();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f187285o;
        if (mMEditText != null) {
            mMEditText.clearFocus();
            this.f187285o.setFocusable(false);
            this.f187285o.setFocusableInTouchMode(false);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f187285o;
        if (mMEditText2 != null && (mMActivity = this.f187288r) != null) {
            mMActivity.hideVKB(mMEditText2);
        }
        this.f187285o = null;
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel webViewSmileyPanel = this.f187281h;
        ey4.c0 c0Var = webViewSmileyPanel.f187322f;
        c0Var.f257609a = null;
        c0Var.f257610b = null;
        android.view.View view = webViewSmileyPanel.f187324h;
        if (view != null) {
            ((android.view.ViewGroup) view.getParent()).removeView(webViewSmileyPanel.f187324h);
            ((android.view.ViewGroup) webViewSmileyPanel.f187324h).removeAllViews();
            webViewSmileyPanel.f187324h = null;
        }
        webViewSmileyPanel.f187323g = null;
        removeAllViews();
        this.f187288r = null;
        this.f187277d = null;
    }

    public void setMaxCount(int i17) {
        if (i17 > 0) {
            this.f187290t = i17;
        }
    }

    public void setOnSmileyChosenListener(ey4.g gVar) {
        this.f187278e = gVar;
    }

    public void setOnSmileyPanelVisibilityChangedListener(ey4.h hVar) {
        this.f187279f = hVar;
    }

    public void setOnTextSendListener(ey4.i iVar) {
        this.f187277d = iVar;
    }

    public void setText(java.lang.String str) {
        this.f187285o.setText("");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            this.f187285o.append(str);
        } catch (java.lang.Exception unused) {
        }
        this.f187285o.getText();
    }
}
