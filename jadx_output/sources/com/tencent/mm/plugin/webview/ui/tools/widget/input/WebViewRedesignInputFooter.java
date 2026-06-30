package com.tencent.mm.plugin.webview.ui.tools.widget.input;

/* loaded from: classes8.dex */
public class WebViewRedesignInputFooter extends android.widget.LinearLayout {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public ey4.u f187292d;

    /* renamed from: e, reason: collision with root package name */
    public ey4.t f187293e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f187294f;

    /* renamed from: g, reason: collision with root package name */
    public int f187295g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f187296h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f187297i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f187298m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f187299n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f187300o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageButton f187301p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f187302q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f187303r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f187304s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout f187305t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.FrameLayout f187306u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f187307v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f187308w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f187309x;

    /* renamed from: y, reason: collision with root package name */
    public int f187310y;

    /* renamed from: z, reason: collision with root package name */
    public int f187311z;

    public WebViewRedesignInputFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f187295g = 0;
        this.f187310y = Integer.MAX_VALUE;
        this.f187311z = Integer.MAX_VALUE;
        this.f187307v = (com.tencent.mm.ui.MMActivity) context;
        g();
    }

    public void a(java.lang.String str) {
        if (str == null) {
            return;
        }
        if (com.tencent.mm.ui.tools.v4.g(((java.lang.Object) this.f187300o.getText()) + str) <= this.f187310y) {
            this.f187300o.n(str);
        }
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewInputFooter", "hide all");
        android.view.View view = this.f187294f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setVisibility(8);
        com.tencent.mm.ui.MMActivity mMActivity = this.f187307v;
        java.lang.String str = "";
        if (mMActivity != null) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f187300o;
            if (mMEditText != null) {
                mMActivity.hideVKB(mMEditText);
                str = this.f187300o.getText().toString();
            }
            this.f187307v.hideVKB();
        }
        this.f187295g = 0;
        c(true);
        e();
        ey4.u uVar = this.f187292d;
        if (uVar != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.ua) uVar).a(str);
        }
    }

    public final void c(boolean z17) {
        this.f187301p.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
        this.f187295g = 0;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f187296h;
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibility(8);
        }
        if (z17) {
            android.view.View view = this.f187309x;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideSmileyPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideSmileyPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void d(java.util.Map map) {
        boolean equals = java.util.Objects.equals(map.get("switchToSmile"), "true");
        this.f187308w = false;
        if (equals) {
            this.f187295g = 1;
            this.f187307v.hideVKB();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewInputFooter", "hideVKB and show smiley");
            if (!this.f187308w) {
                this.f187300o.requestFocus();
            }
            j();
            return;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f187300o;
        if (mMEditText != null) {
            mMEditText.setFocusable(true);
            this.f187300o.setFocusableInTouchMode(true);
            this.f187300o.requestFocus();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewInputFooter", "showVKB");
        i();
        this.f187295g = 0;
    }

    public void e() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f187300o;
        if (mMEditText != null) {
            mMEditText.clearFocus();
            this.f187300o.setFocusable(false);
            this.f187300o.setFocusableInTouchMode(false);
        }
    }

    public int f(int i17, boolean z17) {
        android.view.View view;
        android.view.ViewGroup.LayoutParams layoutParams = this.f187306u.getLayoutParams();
        if (layoutParams != null) {
            if (i17 != 0) {
                layoutParams.height = i17;
            } else {
                com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = this.f187305t;
                if (webViewKeyboardLinearLayout == null || webViewKeyboardLinearLayout.getKeyBoardHeight() <= 0) {
                    layoutParams.height = com.tencent.mm.sdk.platformtools.d2.g(getContext());
                } else {
                    layoutParams.height = this.f187305t.getKeyBoardHeight();
                }
            }
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f187296h;
            if (chatFooterPanel != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = chatFooterPanel.getLayoutParams();
                layoutParams2.height = layoutParams.height;
                this.f187296h.setLayoutParams(layoutParams2);
            }
            this.f187306u.setLayoutParams(layoutParams);
        }
        if (z17 && this.f187302q.getTag() != null && this.f187302q.getTag().equals("writeMessage") && this.f187306u.getHeight() == 0 && (view = this.f187302q) != null) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new ey4.s());
            alphaAnimation.setDuration(600L);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "doAlphaAnimation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "doAlphaAnimation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.startAnimation(alphaAnimation);
        }
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    public void g() {
        removeAllViews();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(this.f187307v, com.tencent.mm.R.layout.d9y, this);
        this.f187303r = viewGroup;
        this.f187302q = viewGroup.findViewById(com.tencent.mm.R.id.pi_);
        this.f187298m = (android.widget.Button) this.f187303r.findViewById(com.tencent.mm.R.id.pih);
        this.f187299n = (android.widget.Button) this.f187303r.findViewById(com.tencent.mm.R.id.pid);
        this.f187297i = this.f187303r.findViewById(com.tencent.mm.R.id.pii);
        this.f187300o = (com.tencent.mm.ui.widget.MMEditText) this.f187303r.findViewById(com.tencent.mm.R.id.pia);
        this.f187304s = (android.widget.TextView) this.f187303r.findViewById(com.tencent.mm.R.id.piz);
        this.f187301p = (android.widget.ImageButton) this.f187303r.findViewById(com.tencent.mm.R.id.pik);
        this.f187306u = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.pic);
        h();
    }

    public java.lang.String getEditText() {
        return this.f187300o.getText().toString();
    }

    public int getInputContainerHeight() {
        android.view.View view = this.f187302q;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    public com.tencent.mm.ui.widget.MMEditText getMMEditText() {
        return this.f187300o;
    }

    public int getSmilePanelHeight() {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f187296h;
        if (chatFooterPanel == null) {
            return 0;
        }
        return chatFooterPanel.getLayoutParams().height;
    }

    public final void h() {
        android.widget.ImageButton imageButton = this.f187301p;
        if (imageButton != null) {
            imageButton.setOnClickListener(new ey4.n(this));
            com.tencent.mm.ui.tools.d8.b(this.f187301p, 0.5f);
        }
        if (!com.tencent.mm.sdk.platformtools.x2.n() || gm0.j1.a()) {
            com.tencent.mm.api.SmileyPanel c17 = qk.w9.c(this.f187307v, false);
            this.f187296h = c17;
            c17.setEntranceScene(0);
            this.f187296h.setShowSmiley(true);
            this.f187296h.p(false, false);
            this.f187296h.o(false, false);
            this.f187296h.setShowStore(false);
            this.f187296h.setBackgroundColor(this.f187307v.getResources().getColor(com.tencent.mm.R.color.f478869jf));
            this.f187296h.setVisibility(8);
            this.f187296h.setOnTextOperationListener(new ey4.q(this));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewInputFooter", "can not show smileyPanel in main pro when not login");
        }
        android.view.View view = new android.view.View(this.f187307v);
        this.f187309x = view;
        view.setBackgroundColor(this.f187307v.getResources().getColor(com.tencent.mm.R.color.f478869jf));
        this.f187306u.addView(this.f187309x, -1, -1);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f187296h;
        if (chatFooterPanel != null) {
            this.f187306u.addView(chatFooterPanel, -1, -1);
        }
        android.widget.Button button = this.f187299n;
        if (button != null) {
            button.setOnClickListener(new ey4.o(this));
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f187300o;
        if (mMEditText != null) {
            mMEditText.addTextChangedListener(new ey4.p(this));
        }
    }

    public boolean i() {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f187307v.getSystemService("input_method");
        if (inputMethodManager == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewInputFooter", "imm == null");
            return false;
        }
        if (this.f187300o == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewInputFooter", "contentEditText == null");
        }
        inputMethodManager.showSoftInput(this.f187300o, 0);
        return true;
    }

    @Override // android.view.View
    public boolean isShown() {
        return getVisibility() == 0;
    }

    public final int j() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f187300o;
        if (mMEditText != null) {
            this.f187307v.hideVKB(mMEditText);
        }
        android.view.View view = this.f187309x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", hc1.i.NAME, "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", hc1.i.NAME, "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f187296h;
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibility(0);
        }
        this.f187301p.setImageResource(com.tencent.mm.R.raw.icons_outlined_keyboard);
        return f(0, false);
    }

    public void setInputShadowView(android.view.View view) {
        this.f187294f = view;
        if (view != null) {
            view.setOnClickListener(new ey4.k(this, view));
        }
    }

    public void setMaxCount(int i17) {
        this.f187310y = 0;
        if (i17 <= 0) {
            this.f187300o.setFilters(new android.text.InputFilter[0]);
        } else {
            this.f187310y = i17;
            this.f187300o.setFilters(new android.text.InputFilter[]{new ey4.r(this, i17, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_3)});
        }
    }

    public void setOnSmileyChosenListener(ey4.t tVar) {
        this.f187293e = tVar;
    }

    public void setOnTextSendListener(ey4.u uVar) {
        this.f187292d = uVar;
    }

    public void setPlaceholder(java.lang.String str) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f187300o;
        if (mMEditText == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewInputFooter", "contentEditText is null!");
            return;
        }
        mMEditText.setHint("");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            this.f187300o.setHint(str);
        } catch (java.lang.Exception unused) {
        }
    }

    public void setShowRemindWordCount(int i17) {
        this.f187311z = i17;
    }

    public void setText(java.lang.String str) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f187300o;
        if (mMEditText == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewInputFooter", "contentEditText is null!");
            return;
        }
        mMEditText.setText("");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            a(str);
            this.f187300o.setSelection(str.length());
        } catch (java.lang.Exception unused) {
        }
    }
}
