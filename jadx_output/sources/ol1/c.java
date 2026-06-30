package ol1;

/* loaded from: classes15.dex */
public final class c extends android.widget.FrameLayout implements ol1.o, ol1.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol1.q f346124d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.ChatFooterPanel f346125e;

    /* renamed from: f, reason: collision with root package name */
    public int f346126f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, boolean z17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f346124d = new ol1.q();
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        com.tencent.mm.view.SmileyPanelImpl smileyPanelImpl = new com.tencent.mm.view.SmileyPanelImpl(context, z17);
        this.f346125e = smileyPanelImpl;
        smileyPanelImpl.setShowSmiley(true);
        smileyPanelImpl.p(false, false);
        smileyPanelImpl.o(false, false);
        smileyPanelImpl.setShowStore(false);
        smileyPanelImpl.setShowSend(false);
        smileyPanelImpl.setShowClose(false);
        smileyPanelImpl.setShowSearch(true);
        smileyPanelImpl.i();
        addView(smileyPanelImpl, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setClickable(true);
    }

    private final int getAppropriateHeightInPort() {
        int i17 = this.f346126f;
        return i17 > 0 ? i17 : getPanelDefaultHeightInPort();
    }

    public int getForcedPanelHeight() {
        return this.f346126f;
    }

    public int getPanelDefaultHeightInPort() {
        ol1.q qVar = this.f346124d;
        if (qVar.f346138f < 0) {
            qVar.f346138f = com.tencent.mm.sdk.platformtools.d2.g(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        int i17 = qVar.f346138f;
        if (i17 > 0) {
            return i17;
        }
        int[] a17 = qVar.a();
        int max = (java.lang.Math.max(a17[0], a17[1]) / 2) - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479602ac);
        qVar.f346138f = max;
        return max;
    }

    public int getPanelHeightInLandscape() {
        ol1.q qVar = this.f346124d;
        int[] a17 = qVar.a();
        int i17 = qVar.f346137e;
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
        if (i17 <= 0 || this.f346126f == i17) {
            return false;
        }
        this.f346126f = i17;
        setForceHeight(i17);
        return true;
    }

    @Override // ol1.o
    public void o() {
        this.f346125e.setVisibility(0);
        setBackground(null);
    }

    @Override // ol1.o
    public void onDestroy() {
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
        this.f346125e.h();
    }

    @Override // ol1.o
    public void onResume() {
        this.f346125e.i();
    }

    @Override // ol1.o
    public void p(boolean z17) {
        this.f346125e.setShowStore(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        getHeight();
        getMeasuredHeight();
        int i17 = this.f346126f;
        return i17 > 0 && i17 == getMeasuredHeight();
    }

    @Override // ol1.o
    public void r(boolean z17) {
        this.f346125e.setShowSearch(z17);
    }

    @Override // ol1.o
    public void s(boolean z17) {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f346125e;
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

    @Override // ol1.p
    public void setForceHeight(int i17) {
        this.f346124d.f346137e = i17;
    }

    @Override // ol1.o
    public void setOnEmoticonOperationListener(ol1.t tVar) {
        this.f346125e.setCallback(new ol1.a(tVar));
    }

    @Override // ol1.o
    public void setOnTextOperationListener(ol1.u uVar) {
        this.f346125e.setOnTextOperationListener(uVar == null ? null : new ol1.b(uVar));
    }

    @Override // ol1.o
    public boolean t() {
        return isInLayout();
    }
}
