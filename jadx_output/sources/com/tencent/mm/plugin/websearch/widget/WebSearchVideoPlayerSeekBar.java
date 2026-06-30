package com.tencent.mm.plugin.websearch.widget;

/* loaded from: classes3.dex */
public class WebSearchVideoPlayerSeekBar extends com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar implements com.tencent.mm.pluginsdk.ui.z0 {
    public static final /* synthetic */ int D = 0;
    public int A;
    public int B;
    public int C;

    /* renamed from: y, reason: collision with root package name */
    public float f181709y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f181710z;

    public WebSearchVideoPlayerSeekBar(android.content.Context context) {
        super(context);
        this.f181710z = false;
        this.A = -1;
        this.B = -1;
        this.C = -1;
    }

    private int getBarPointPaddingLeft() {
        if (this.B == -1) {
            this.B = this.f162475h.getPaddingLeft();
        }
        return this.B;
    }

    private int getBarPointPaddingRight() {
        if (this.C == -1) {
            this.C = this.f162475h.getPaddingRight();
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurProgressBarLen() {
        return this.f162473f.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurTimeByProgressBar() {
        return (int) (((getCurProgressBarLen() * 1.0d) / getBarLen()) * this.f162479o);
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d
    public void a(int i17) {
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = this.f162479o;
        if (i17 >= i18) {
            i17 = i18;
        }
        if (this.f162480p != i17) {
            this.f162480p = i17;
            m();
        }
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getBarLen() {
        return this.f162474g.getWidth();
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getBarPointWidth() {
        if (this.A == -1) {
            this.A = this.f162475h.getWidth();
        }
        return this.A;
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d3n;
    }

    public android.widget.ImageView getPlayBtn() {
        return this.f162476i;
    }

    public android.widget.TextView getPlaytimeTv() {
        return this.f162477m;
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void j() {
        android.view.View inflate = android.view.View.inflate(getContext(), getLayoutId(), this);
        this.f162472e = inflate;
        this.f162473f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.kxj);
        this.f162474g = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.kxi);
        this.f162475h = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.kxm);
        this.f162476i = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.kwj);
        this.f162477m = (android.widget.TextView) this.f162472e.findViewById(com.tencent.mm.R.id.kwl);
        this.f162478n = (android.widget.TextView) this.f162472e.findViewById(com.tencent.mm.R.id.kxa);
        this.f162475h.setOnTouchListener(new bw4.d(this));
        this.f162475h.addOnLayoutChangeListener(new bw4.e(this));
        this.f162474g.addOnLayoutChangeListener(new bw4.f(this));
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void m() {
        int barLen;
        if (this.f162479o == 0 || this.f162483s || this.f162475h == null || getBarLen() == 0) {
            return;
        }
        if (this.f162480p == this.f162479o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "test");
        }
        this.f162477m.setText(k(this.f162480p / 60) + ":" + k(this.f162480p % 60));
        int i17 = this.f162480p;
        if (i17 <= 0) {
            barLen = 0;
        } else {
            int i18 = this.f162479o;
            barLen = i17 >= i18 ? getBarLen() : (int) (((i17 * 1.0d) / i18) * getBarLen());
        }
        v(barLen);
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d
    public void setIsPlay(boolean z17) {
        this.f181710z = z17;
        super.setIsPlay(z17);
    }

    public void setPlayBtnOnClickListener(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.f162476i;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d, com.tencent.mm.pluginsdk.ui.z0
    public void setVideoTotalTime(int i17) {
        this.f162479o = i17;
        this.f162480p = 0;
        this.f162478n.setText(k(this.f162479o / 60) + ":" + k(this.f162479o % 60));
        m();
    }

    public void v(int i17) {
        if (i17 > getBarLen()) {
            i17 = getBarLen();
        } else if (i17 < 0) {
            i17 = 0;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f162475h.getLayoutParams();
        layoutParams.leftMargin = (((android.widget.FrameLayout.LayoutParams) this.f162474g.getLayoutParams()).leftMargin + (i17 > getBarLen() ? getBarLen() : i17)) - (getBarPointWidth() >>> 1);
        this.f162475h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f162473f.getLayoutParams();
        layoutParams2.width = i17;
        this.f162473f.setLayoutParams(layoutParams2);
        this.f162475h.requestLayout();
        this.f162473f.requestLayout();
    }

    public WebSearchVideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f181710z = false;
        this.A = -1;
        this.B = -1;
        this.C = -1;
    }

    public WebSearchVideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f181710z = false;
        this.A = -1;
        this.B = -1;
        this.C = -1;
    }
}
