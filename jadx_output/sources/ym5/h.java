package ym5;

/* loaded from: classes10.dex */
public abstract class h extends qk.s implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e, reason: collision with root package name */
    public qk.l9 f463345e;

    /* renamed from: f, reason: collision with root package name */
    public bn5.f f463346f;

    /* renamed from: g, reason: collision with root package name */
    public qk.g6[] f463347g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f463348h;

    /* renamed from: i, reason: collision with root package name */
    public dn5.c f463349i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f463350m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f463351n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f463352o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f463353p;

    /* renamed from: q, reason: collision with root package name */
    public l45.q f463354q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f463355r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f463356s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.view.PhotoEditText f463357t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.view.TextModeSelectView f463358u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f463359v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f463360w;

    public h(android.content.Context context) {
        super(context);
        this.f463359v = true;
        this.f463360w = true;
    }

    public abstract bn5.f a();

    public abstract dn5.c b();

    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseDrawingView", "[hideSimleyPanel] isHide:%s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f463353p;
        if (chatFooterPanel == null) {
            return;
        }
        if (chatFooterPanel.getVisibility() == 0 && z17) {
            this.f463353p.setVisibility(8);
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477855dd);
            loadAnimation.setAnimationListener(new ym5.i(this));
            this.f463353p.startAnimation(loadAnimation);
            return;
        }
        if (this.f463353p.getVisibility() != 8 || z17) {
            return;
        }
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477857df);
        loadAnimation2.setAnimationListener(new ym5.j(this));
        this.f463353p.startAnimation(loadAnimation2);
    }

    public void d() {
        ((l45.n) getPresenter()).m(getConfig());
        removeAllViews();
        addView(getBaseBoardView(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) getResources().getDimension(com.tencent.mm.R.dimen.f480411x6));
        layoutParams.gravity = 80;
        addView(getFooterBg(), layoutParams);
        addView(getBaseFooterView(), layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.view.View textEditView = getTextEditView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textEditView, arrayList.toArray(), "com/tencent/mm/view/BaseDrawingView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textEditView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textEditView, "com/tencent/mm/view/BaseDrawingView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(getTextEditView(), layoutParams2);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) getRubbishView().getLayoutParams();
        layoutParams3.gravity = 81;
        int c17 = layoutParams3.bottomMargin + com.tencent.mm.ui.bl.c(getContext());
        layoutParams3.bottomMargin = c17;
        layoutParams3.bottomMargin = c17 + i65.a.b(getContext(), 32);
        android.view.View rubbishView = getRubbishView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(rubbishView, arrayList2.toArray(), "com/tencent/mm/view/BaseDrawingView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rubbishView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(rubbishView, "com/tencent/mm/view/BaseDrawingView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(getRubbishView(), layoutParams3);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, qk.w9.a(getContext()));
        layoutParams4.gravity = 80;
        layoutParams4.bottomMargin += com.tencent.mm.ui.bl.c(getContext());
        addView(getChatFooterPanel(), layoutParams4);
        new android.widget.FrameLayout.LayoutParams(-1, (int) getResources().getDimension(com.tencent.mm.R.dimen.f479622ax)).gravity = 48;
        if (this.f463345e.f364233c) {
            addView(getActionBar());
        } else {
            getBaseFooterView().setVisibility(8);
        }
    }

    public android.view.View getActionBar() {
        if (this.f463350m == null) {
            this.f463350m = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c9q, (android.view.ViewGroup) null);
            this.f463350m.setPadding(0, com.tencent.mm.ui.bk.u(getContext(), false) ? com.tencent.mm.ui.bk.p(getContext()) + 0 : 0, 0, 0);
            android.widget.Button button = (android.widget.Button) this.f463350m.findViewById(com.tencent.mm.R.id.d6w);
            this.f463355r = button;
            button.setOnClickListener(new ym5.l(this));
            android.widget.Button button2 = (android.widget.Button) this.f463350m.findViewById(com.tencent.mm.R.id.d6s);
            this.f463356s = button2;
            button2.setOnClickListener(new ym5.m(this));
        }
        return this.f463350m;
    }

    public <T extends bn5.f> T getBaseBoardView() {
        if (this.f463346f == null) {
            this.f463346f = a();
        }
        return (T) this.f463346f;
    }

    public <T extends dn5.c> T getBaseFooterView() {
        if (this.f463349i == null) {
            this.f463349i = b();
        }
        return (T) this.f463349i;
    }

    public com.tencent.mm.view.TextModeSelectView getBgSwitch() {
        return this.f463358u;
    }

    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel getChatFooterPanel() {
        if (this.f463353p == null) {
            try {
                com.tencent.mm.api.SmileyPanel b17 = qk.w9.b(getContext());
                this.f463353p = b17;
                int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
                b17.setEntranceScene(3);
                this.f463353p.setSearchSource(6);
                this.f463353p.setShowSmiley(false);
                this.f463353p.setShowClose(true);
                this.f463353p.setVisibility(8);
                this.f463353p.i();
                qk.v9 d17 = qk.w9.d();
                d17.f364351a = new ym5.o(this);
                this.f463353p.setCallback(d17);
            } catch (java.lang.Exception e17) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = e17.getMessage();
                objArr[1] = java.lang.Boolean.valueOf(getContext() == null);
                com.tencent.mars.xlog.Log.e("MicroMsg.BaseDrawingView", "exception:%s,getContext() is null?", objArr);
                throw e17;
            }
        }
        return this.f463353p;
    }

    public qk.l9 getConfig() {
        return this.f463345e;
    }

    public abstract qk.g6[] getFeatures();

    public android.view.View getFooterBg() {
        if (this.f463348h == null) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bb7, (android.view.ViewGroup) null);
            this.f463348h = inflate;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/view/BaseDrawingView", "getFooterBg", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/view/BaseDrawingView", "getFooterBg", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return this.f463348h;
    }

    public l45.q getPresenter() {
        if (this.f463354q == null) {
            l45.n nVar = new l45.n();
            this.f463354q = nVar;
            nVar.f316460a = this;
        }
        return this.f463354q;
    }

    public android.view.View getRubbishView() {
        if (this.f463351n == null) {
            this.f463352o = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.chf, (android.view.ViewGroup) this, false);
        }
        return this.f463352o;
    }

    public android.view.View getTextEditView() {
        if (this.f463351n == null) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a57, (android.view.ViewGroup) null);
            this.f463351n = inflate;
            com.tencent.mm.view.PhotoEditText photoEditText = (com.tencent.mm.view.PhotoEditText) inflate.findViewById(com.tencent.mm.R.id.o4a);
            this.f463357t = photoEditText;
            int dimension = (int) photoEditText.getResources().getDimension(com.tencent.mm.R.dimen.f480313ua);
            int dimension2 = (int) this.f463357t.getResources().getDimension(com.tencent.mm.R.dimen.f480251sk);
            if (com.tencent.mm.ui.bk.u(getContext(), false)) {
                dimension2 += com.tencent.mm.ui.bk.p(getContext());
            }
            this.f463357t.setPadding(dimension, dimension2, dimension, 0);
            final com.tencent.mm.view.footer.SelectColorBar selectColorBar = (com.tencent.mm.view.footer.SelectColorBar) this.f463351n.findViewById(com.tencent.mm.R.id.mii);
            com.tencent.mm.view.TextModeSelectView textModeSelectView = (com.tencent.mm.view.TextModeSelectView) this.f463351n.findViewById(com.tencent.mm.R.id.agw);
            this.f463358u = textModeSelectView;
            textModeSelectView.setTag(-707825);
            this.f463358u.setModeChangeListener(new ym5.g6() { // from class: ym5.h$$a
                @Override // ym5.g6
                public final void a(int i17) {
                    ym5.h hVar = ym5.h.this;
                    com.tencent.mm.view.footer.SelectColorBar selectColorBar2 = selectColorBar;
                    if (i17 == 3) {
                        selectColorBar2.setSelectColor(((java.lang.Integer) hVar.f463358u.getTag()).intValue());
                        hVar.f463357t.setTextBackground(((java.lang.Integer) hVar.f463358u.getTag()).intValue());
                    } else {
                        hVar.f463358u.setTag(java.lang.Integer.valueOf(selectColorBar2.getCurColor()));
                        hVar.f463357t.setTextBackground(0);
                    }
                    hVar.f463357t.setEnableStoke(i17 == 2);
                }
            });
            this.f463357t.setTextColor(-1);
            selectColorBar.setSelectColor(-1);
            selectColorBar.setSelectColorListener(new ym5.n(this));
        }
        return this.f463351n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new ym5.p(this));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (getTextEditView().getVisibility() == 0) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f463357t.postDelayed(new ym5.k(this), 160L);
        }
    }

    @Override // qk.s
    public void setActionBarCallback(qk.i6 i6Var) {
        ((l45.n) getPresenter()).f316464e = i6Var;
    }

    @Override // qk.s
    public void setActionBarVisible(boolean z17) {
        if (this.f463360w == z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseDrawingView", "[setActionBarVisible] isShowActionBar == isShow");
            return;
        }
        this.f463360w = z17;
        if (z17) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477723k);
            loadAnimation.setAnimationListener(new ym5.q(this));
            getActionBar().startAnimation(loadAnimation);
        } else {
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477724l);
            loadAnimation2.setAnimationListener(new ym5.r(this));
            getActionBar().startAnimation(loadAnimation2);
        }
    }

    @Override // qk.s
    public void setAutoShowFooterAndBar(boolean z17) {
        ((l45.n) getPresenter()).f316466g = z17;
    }

    public void setFooterBgVisible(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseDrawingView", "setFooterBgVisible: isShow=%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477723k);
            loadAnimation.setAnimationListener(new ym5.s(this));
            getActionBar().startAnimation(loadAnimation);
        } else {
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477724l);
            loadAnimation2.setAnimationListener(new ym5.t(this));
            getActionBar().startAnimation(loadAnimation2);
        }
    }

    @Override // qk.s
    public void setFooterVisible(boolean z17) {
        boolean z18 = getConfig().f364233c;
        if (this.f463359v == z17 || !getConfig().f364233c) {
            return;
        }
        getBaseFooterView().setFooterVisible(z17);
        setFooterBgVisible(z17);
        this.f463359v = z17;
    }

    public void setup(qk.l9 l9Var) {
        this.f463345e = l9Var;
        d();
        this.f463346f.j();
    }
}
