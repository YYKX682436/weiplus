package hc1;

/* loaded from: classes15.dex */
public final class b extends android.widget.FrameLayout implements ol1.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hc1.c f280283d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.ChatFooterPanel f280284e;

    /* renamed from: f, reason: collision with root package name */
    public int f280285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, boolean z17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f280283d = new hc1.c();
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        com.tencent.mm.view.SmileyPanelImpl smileyPanelImpl = new com.tencent.mm.view.SmileyPanelImpl(context, z17);
        this.f280284e = smileyPanelImpl;
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        smileyPanelImpl.setEntranceScene(112);
        smileyPanelImpl.setShowSmiley(true);
        smileyPanelImpl.setShowSend(true);
        smileyPanelImpl.p(false, false);
        smileyPanelImpl.o(false, false);
        smileyPanelImpl.setShowStore(false);
        smileyPanelImpl.setShowClose(false);
        smileyPanelImpl.setShowSearch(false);
        smileyPanelImpl.setShowGame(false);
        smileyPanelImpl.i();
        smileyPanelImpl.k();
        smileyPanelImpl.j();
        addView(smileyPanelImpl, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setClickable(true);
    }

    private final int getAppropriateHeightInPort() {
        int i17 = this.f280285f;
        return i17 > 0 ? i17 : getPanelDefaultHeightInPort();
    }

    public int getForcedPanelHeight() {
        return this.f280285f;
    }

    public final com.tencent.mm.pluginsdk.ui.ChatFooterPanel getMSmileyPanel() {
        return this.f280284e;
    }

    public int getPanelDefaultHeightInPort() {
        hc1.c cVar = this.f280283d;
        if (cVar.f280288c < 0) {
            cVar.f280288c = com.tencent.mm.sdk.platformtools.d2.g(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        int i17 = cVar.f280288c;
        if (i17 > 0) {
            return i17;
        }
        int[] a17 = cVar.a();
        int max = (java.lang.Math.max(a17[0], a17[1]) / 2) - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479602ac);
        cVar.f280288c = max;
        return max;
    }

    public int getPanelHeightInLandscape() {
        hc1.c cVar = this.f280283d;
        int[] a17 = cVar.a();
        int i17 = cVar.f280287b;
        return (i17 <= 0 || i17 >= a17[1]) ? (java.lang.Math.min(a17[0], a17[1]) / 2) - com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479602ac) : i17;
    }

    @Override // ol1.o
    public android.view.View getPanelView() {
        return this;
    }

    @Override // ol1.o
    public boolean l() {
        return true;
    }

    @Override // ol1.o
    public boolean n(int i17) {
        if (i17 <= 0 || this.f280285f == i17) {
            return false;
        }
        this.f280285f = i17;
        return true;
    }

    @Override // ol1.o
    public void o() {
        this.f280284e.setVisibility(0);
        setBackground(null);
    }

    @Override // ol1.o
    public void onDestroy() {
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (isShown()) {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(!com.tencent.mm.sdk.platformtools.d2.j(getContext()) ? getPanelHeightInLandscape() : getAppropriateHeightInPort(), 1073741824));
        } else {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
        }
    }

    @Override // ol1.o
    public void onPause() {
        this.f280284e.h();
    }

    @Override // ol1.o
    public void onResume() {
        this.f280284e.i();
    }

    @Override // ol1.o
    public void p(boolean z17) {
        this.f280284e.setShowStore(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        getHeight();
        getMeasuredHeight();
        int i17 = this.f280285f;
        return i17 > 0 && i17 == getMeasuredHeight();
    }

    @Override // ol1.o
    public void r(boolean z17) {
        this.f280284e.setShowSearch(z17);
    }

    @Override // ol1.o
    public void s(boolean z17) {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f280284e;
        chatFooterPanel.setVisibility(4);
        if (z17) {
            setBackground(null);
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = chatFooterPanel.getContext().obtainStyledAttributes(new int[]{com.tencent.mm.R.attr.f478243ek});
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            setBackground(drawable);
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }

    public final void setFinishButtonText(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f280284e.setFinishButtonTitle(text);
    }

    public void setForceHeight(int i17) {
        this.f280283d.f280287b = i17;
    }

    @Override // ol1.o
    public void setOnEmoticonOperationListener(ol1.t tVar) {
    }

    @Override // ol1.o
    public void setOnTextOperationListener(ol1.u uVar) {
    }

    @Override // ol1.o
    public boolean t() {
        return isInLayout();
    }

    public final void setOnTextOperationListener(com.tencent.mm.pluginsdk.ui.k0 k0Var) {
        this.f280284e.setOnTextOperationListener(k0Var == null ? null : new hc1.a(k0Var));
    }
}
