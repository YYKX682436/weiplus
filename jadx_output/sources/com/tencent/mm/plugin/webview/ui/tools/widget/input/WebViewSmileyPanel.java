package com.tencent.mm.plugin.webview.ui.tools.widget.input;

/* loaded from: classes8.dex */
public class WebViewSmileyPanel extends android.widget.LinearLayout implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, ey4.d0 {

    /* renamed from: d, reason: collision with root package name */
    public ey4.b0 f187320d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f187321e;

    /* renamed from: f, reason: collision with root package name */
    public ey4.c0 f187322f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f187323g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f187324h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyViewPager f187325i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMDotView f187326m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f187327n;

    public WebViewSmileyPanel(android.content.Context context) {
        super(context, null);
        this.f187321e = false;
        this.f187324h = null;
        this.f187325i = null;
        this.f187327n = true;
        this.f187323g = (com.tencent.mm.ui.MMActivity) getContext();
        ey4.c0 c0Var = new ey4.c0();
        this.f187322f = c0Var;
        c0Var.f257610b = getContext();
        this.f187322f.f257611c = this.f187320d;
    }

    public final void a() {
        boolean j17;
        if (this.f187326m == null || (j17 = com.tencent.mm.sdk.platformtools.d2.j(getContext())) == this.f187327n) {
            return;
        }
        if (j17) {
            this.f187326m.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx));
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f187326m.getLayoutParams();
            layoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480378w9);
            this.f187326m.setLayoutParams(layoutParams);
        } else {
            this.f187326m.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479877hq));
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f187326m.getLayoutParams();
            layoutParams2.bottomMargin = 0;
            this.f187326m.setLayoutParams(layoutParams2);
        }
        this.f187327n = j17;
    }

    public final ey4.c0 getManager() {
        return this.f187322f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f187321e) {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
        } else if (com.tencent.mm.sdk.platformtools.d2.j(getContext())) {
            super.onMeasure(i17, i18);
        } else {
            super.onMeasure(i17, i18);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        int ceil;
        ey4.v b17 = this.f187322f.b(i17);
        ey4.w wVar = (ey4.w) b17;
        if (wVar.a() * wVar.b() < 1) {
            ceil = 0;
        } else {
            ceil = (int) java.lang.Math.ceil((((com.tencent.mm.smiley.e1) wVar.f257631b.a()).f193243c == null ? 0 : r2.size()) / (wVar.a() * wVar.b()));
        }
        int i18 = i17 - b17.f257632c;
        if (ceil <= 1) {
            this.f187326m.setVisibility(4);
            return;
        }
        this.f187326m.setVisibility(0);
        this.f187326m.setDotCount(ceil);
        this.f187326m.setSelectedDot(i18);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        a();
    }

    public void setOnTextOperationListener(ey4.b0 b0Var) {
        this.f187320d = b0Var;
        this.f187322f.f257611c = b0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 == 0) {
            this.f187321e = false;
        } else {
            this.f187321e = true;
        }
        super.setVisibility(i17);
        if (this.f187321e) {
            return;
        }
        this.f187323g.hideVKB();
        if (this.f187324h != null && getChildCount() > 0) {
            android.view.View view = this.f187324h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "initShowState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "initShowState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f187324h;
        if (view2 == null) {
            this.f187324h = android.view.View.inflate(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.layout.d_2, null);
        } else if (view2.getParent() != null) {
            ((android.view.ViewGroup) this.f187324h.getParent()).removeView(this.f187324h);
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyViewPager webViewSmileyViewPager = (com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyViewPager) this.f187324h.findViewById(com.tencent.mm.R.id.f486961n10);
        this.f187325i = webViewSmileyViewPager;
        webViewSmileyViewPager.setOnPageChangeListener(this);
        this.f187325i.setPanelManager(this.f187322f);
        this.f187325i.setOnSizeChangedListener(this);
        com.tencent.mm.ui.base.MMDotView mMDotView = (com.tencent.mm.ui.base.MMDotView) this.f187324h.findViewById(com.tencent.mm.R.id.n0x);
        this.f187326m = mMDotView;
        mMDotView.setDotCount(1);
        a();
        addView(this.f187324h, new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    public WebViewSmileyPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f187321e = false;
        this.f187324h = null;
        this.f187325i = null;
        this.f187327n = true;
        this.f187323g = (com.tencent.mm.ui.MMActivity) getContext();
        ey4.c0 c0Var = new ey4.c0();
        this.f187322f = c0Var;
        c0Var.f257610b = getContext();
        this.f187322f.f257611c = this.f187320d;
    }
}
