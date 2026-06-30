package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public abstract class AbsSnsUploadSayFooter extends com.tencent.mm.ui.widget.SnsUploadInputPanelLinearLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f170755t = 0;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f170756f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f170757g;

    /* renamed from: h, reason: collision with root package name */
    public fl5.i f170758h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageButton f170759i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget f170760m;

    /* renamed from: n, reason: collision with root package name */
    public int f170761n;

    /* renamed from: o, reason: collision with root package name */
    public int f170762o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f170763p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.e f170764q;

    /* renamed from: r, reason: collision with root package name */
    public final int f170765r;

    /* renamed from: s, reason: collision with root package name */
    public final int f170766s;

    public AbsSnsUploadSayFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170758h = null;
        this.f170761n = -1;
        this.f170762o = 0;
        this.f170763p = false;
        this.f170765r = com.tencent.mm.R.raw.icons_outlined_emoji;
        this.f170766s = com.tencent.mm.R.drawable.f481236o2;
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        this.f170756f = mMActivity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f211421d = new al5.f0(this, this, true);
        int softInputMode = getSoftInputMode();
        if ((softInputMode & 32) > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUpload.InputPanelLinearLayout", "init setEnableUseWindowInsetListener=true");
            this.f211421d.f5901u = true;
        } else if ((softInputMode & 16) > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUpload.InputPanelLinearLayout", "init setEnableUseWindowInsetListener=false");
            this.f211421d.f5901u = false;
        }
        mMActivity.getWindow().setSoftInputMode(getSoftInputMode());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.cup, this);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.tencent.mm.R.id.f482835p9);
        this.f170759i = imageButton;
        com.tencent.mm.plugin.sns.ui.widget.b bVar = new com.tencent.mm.plugin.sns.ui.widget.b(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        kotlin.jvm.internal.o.g(imageButton, "<this>");
        imageButton.setOnClickListener(new ca4.d1(imageButton, 500L, bVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        this.f170760m = (com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget) viewGroup.findViewById(com.tencent.mm.R.id.f482839pd);
        if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null) {
            this.f170757g = new com.tencent.mm.pluginsdk.ui.chat.t5(mMActivity);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            return;
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        this.f170757g = wi6;
        wi6.setEntranceScene(2);
        this.f170757g.setSearchSource(6);
        this.f170757g.setVisibility(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7g);
        linearLayout.setOnClickListener(null);
        findViewById(com.tencent.mm.R.id.gbm).setOnClickListener(new com.tencent.mm.plugin.sns.ui.widget.c(this));
        int g17 = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        this.f170762o = g17;
        linearLayout.addView(this.f170757g, -1, g17);
        this.f170757g.c();
        c();
        this.f170757g.i();
        this.f170757g.setOnTextOperationListener(new com.tencent.mm.plugin.sns.ui.widget.d(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    @Override // com.tencent.mm.ui.widget.SnsUploadInputPanelLinearLayout, al5.e0
    public void J2(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "onInputPanelChange: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        super.J2(z17, i17);
        d(z17, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callPanelChangeAfterUIRefresh", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.widget.e eVar = this.f170764q;
        if (eVar != null) {
            com.tencent.mm.plugin.sns.ui.gu guVar = (com.tencent.mm.plugin.sns.ui.gu) eVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInputChange", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$3");
            fl5.i iVar = guVar.f168465b;
            int selectionStart = iVar.getSelectionStart();
            int i18 = pm0.v.r(guVar.f168466c).top;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            com.tencent.mm.plugin.sns.ui.hu huVar = guVar.f168467d;
            boolean z18 = huVar.f168539f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            boolean z19 = z18 || (guVar.f168464a == selectionStart && selectionStart != 0);
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.hu.c(huVar), "onInputChange: lastCursorStart:" + guVar.f168464a + ", newCursorStart:" + selectionStart + ", needUpdateCursor:" + z19);
            if (z19) {
                com.tencent.mm.plugin.sns.ui.hu.b(huVar, com.tencent.mm.plugin.sns.ui.hu.a(huVar, selectionStart, iVar.getLayout(), i18));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            huVar.f168539f = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            guVar.f168464a = selectionStart;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInputChange", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$3");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callPanelChangeAfterUIRefresh", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public java.lang.Boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFooterBarLayOnPageBottom", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        if (b()) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFooterBarLayOnPageBottom", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            return bool;
        }
        android.graphics.Rect r17 = pm0.v.r(this);
        int abs = java.lang.Math.abs(com.tencent.mm.ui.bl.b(this.f170756f).y - r17.bottom);
        boolean z17 = true;
        boolean z18 = abs <= getFooterBarHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "isFooterBarLayOnPageBottom = [%b] ,bottomRawY:%d, Height:%d, footerPaddingScreenBottom:%d", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(r17.bottom), java.lang.Integer.valueOf(getHeight()), java.lang.Integer.valueOf(abs));
        if (!z18 && !com.tencent.mm.ui.b4.c(getContext())) {
            z17 = false;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFooterBarLayOnPageBottom", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return valueOf;
    }

    public boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSmilePanelVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        boolean z17 = this.f170757g.getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSmilePanelVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return z17;
    }

    public abstract void c();

    public abstract void d(boolean z17, int i17);

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFooterGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "setFooterGone: mIsShowSmiley:%b", java.lang.Boolean.valueOf(this.f170763p));
        if (this.f170763p) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFooterGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        } else {
            setVisibility(4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFooterGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        }
    }

    public void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFooterVisible", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "setFooterVisible: ");
        setVisibility(0);
        android.widget.ImageButton imageButton = this.f170759i;
        if (imageButton != null) {
            imageButton.setImageResource(this.f170765r);
        }
        com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget snsEditTipsWidget = this.f170760m;
        if (snsEditTipsWidget != null) {
            snsEditTipsWidget.b(this.f170758h.getText().toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFooterVisible", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSmileGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "setSmileGone: ");
        this.f170763p = false;
        this.f170757g.h();
        this.f170757g.setVisibility(8);
        setVisibility(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSmileGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public int getFooterBarHeight() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFooterBarHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        int height = getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFooterBarHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return height;
    }

    public int getKeyboardHeight() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        int i17 = this.f170762o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return i17;
    }

    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(hc1.i.NAME, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f170763p = true;
        this.f170757g.i();
        getInputPanelHelper().f5900t = new al5.d0() { // from class: com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$$b
            @Override // al5.d0
            public final void a(boolean z17) {
                int i17 = com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter.f170755t;
                com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter = com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter.this;
                absSnsUploadSayFooter.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$showSmileyPanel$1", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
                if (!z17) {
                    absSnsUploadSayFooter.f170757g.setVisibility(0);
                }
                absSnsUploadSayFooter.getInputPanelHelper().f5900t = null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$showSmileyPanel$1", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            }
        };
        c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(hc1.i.NAME, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        super.onConfigurationChanged(configuration);
        if (this.f170757g != null) {
            c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.f170761n;
        if (i28 >= i27) {
            i27 = i28;
        }
        this.f170761n = i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public void setMMEditText(fl5.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMMEditText", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f170758h = iVar;
        iVar.c(new com.tencent.mm.plugin.sns.ui.widget.a(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMMEditText", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public void setUploadFooterPanelChangeListener(com.tencent.mm.plugin.sns.ui.widget.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUploadFooterPanelChangeListener", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f170764q = eVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUploadFooterPanelChangeListener", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }
}
