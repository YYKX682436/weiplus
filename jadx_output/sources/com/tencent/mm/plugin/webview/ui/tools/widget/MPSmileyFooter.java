package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes5.dex */
public class MPSmileyFooter extends com.tencent.mm.ui.widget.InputPanelLinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f187042g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f187043h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f187044i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f187045m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f187046n;

    /* renamed from: o, reason: collision with root package name */
    public int f187047o;

    /* renamed from: p, reason: collision with root package name */
    public int f187048p;

    /* renamed from: q, reason: collision with root package name */
    public int f187049q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f187050r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f187051s;

    public MPSmileyFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f187044i = null;
        this.f187047o = -1;
        this.f187048p = 0;
        this.f187049q = 0;
        this.f187050r = false;
        this.f187042g = context;
    }

    public static void f(com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter mPSmileyFooter) {
        if (mPSmileyFooter.f187043h.getVisibility() != 8) {
            mPSmileyFooter.f187044i.requestFocus();
            mPSmileyFooter.f187043h.h();
            mPSmileyFooter.f187043h.setVisibility(8);
            mPSmileyFooter.getActivity().showVKB();
            mPSmileyFooter.f187045m.setImageResource(mPSmileyFooter.g(com.tencent.mm.R.attr.f478194d7));
            return;
        }
        mPSmileyFooter.getActivity().hideVKB();
        mPSmileyFooter.f187043h.i();
        if (com.tencent.mm.sdk.platformtools.d2.e(mPSmileyFooter.f187042g) != 2 || !mPSmileyFooter.f187050r) {
            mPSmileyFooter.i();
        }
        mPSmileyFooter.f187043h.setVisibility(0);
        mPSmileyFooter.f187044i.requestFocus();
        mPSmileyFooter.f187045m.setImageResource(mPSmileyFooter.g(com.tencent.mm.R.attr.f478193d6));
    }

    private com.tencent.mm.ui.MMActivity getActivity() {
        if (this.f187051s == null) {
            android.content.Context context = this.f187042g;
            if (context instanceof com.tencent.mm.ui.MMActivity) {
                this.f187051s = (com.tencent.mm.ui.MMActivity) context;
            } else {
                while (!(context instanceof com.tencent.mm.ui.MMActivity) && (context instanceof android.content.ContextWrapper)) {
                    context = ((android.content.ContextWrapper) context).getBaseContext();
                }
                this.f187051s = (com.tencent.mm.ui.MMActivity) context;
            }
        }
        return this.f187051s;
    }

    @Override // com.tencent.mm.ui.widget.InputPanelLinearLayout, al5.e0
    public void J2(boolean z17, int i17) {
        super.J2(z17, i17);
        if (this.f187048p == i17 || i17 == 0) {
            return;
        }
        this.f187048p = i17;
        fp.w.m(getContext(), i17);
        i();
    }

    public final int g(int i17) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.f187042g.getTheme().resolveAttribute(i17, typedValue, true);
        return typedValue.resourceId;
    }

    public boolean h() {
        return this.f187043h.getVisibility() == 0;
    }

    public final void i() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f187046n.getLayoutParams();
        layoutParams.height = this.f187048p + this.f187049q;
        this.f187046n.setLayoutParams(layoutParams);
        int g17 = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        this.f187043h.setPortHeightPx(g17);
        this.f187043h.b();
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f187043h.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = g17;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f187043h != null) {
            i();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.f187047o;
        if (i28 >= i27) {
            i27 = i28;
        }
        this.f187047o = i27;
    }

    public void setExtraAddHeight(int i17) {
        this.f187049q = i17;
    }

    public void setFobbidenWhenLandscape(boolean z17) {
        this.f187050r = z17;
    }

    public void setMMEditText(com.tencent.mm.ui.widget.MMEditText mMEditText) {
        this.f187044i = mMEditText;
        mMEditText.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.q4(this));
        mMEditText.setOnEditorActionListener(new com.tencent.mm.plugin.webview.ui.tools.widget.r4(this));
    }

    public void setSmileHeight(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = this.f187046n.getLayoutParams();
        layoutParams.height = i17;
        this.f187046n.setLayoutParams(layoutParams);
        int g17 = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        this.f187043h.setPortHeightPx(g17);
        this.f187043h.getClass();
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f187043h.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = g17;
        }
    }
}
