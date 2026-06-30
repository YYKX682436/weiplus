package com.tencent.mm.plugin.sight.decode.ui;

/* loaded from: classes15.dex */
public class SnsAdNativeLandingPagesVideoPlayerLoadingBar extends android.widget.RelativeLayout implements m34.d {

    /* renamed from: d, reason: collision with root package name */
    public m34.e f162490d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f162491e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f162492f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f162493g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f162494h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f162495i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f162496m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f162497n;

    /* renamed from: o, reason: collision with root package name */
    public int f162498o;

    /* renamed from: p, reason: collision with root package name */
    public int f162499p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f162500q;

    /* renamed from: r, reason: collision with root package name */
    public float f162501r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f162502s;

    /* renamed from: t, reason: collision with root package name */
    public int f162503t;

    /* renamed from: u, reason: collision with root package name */
    public int f162504u;

    /* renamed from: v, reason: collision with root package name */
    public int f162505v;

    /* renamed from: w, reason: collision with root package name */
    public int f162506w;

    public SnsAdNativeLandingPagesVideoPlayerLoadingBar(android.content.Context context) {
        super(context);
        this.f162490d = null;
        this.f162491e = null;
        this.f162493g = null;
        this.f162494h = null;
        this.f162495i = null;
        this.f162498o = 0;
        this.f162499p = 0;
        this.f162500q = false;
        this.f162501r = 0.0f;
        this.f162502s = false;
        this.f162503t = -1;
        this.f162504u = -1;
        this.f162505v = -1;
        this.f162506w = -1;
        e();
    }

    public static int b(com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar, int i17) {
        int width = ((snsAdNativeLandingPagesVideoPlayerLoadingBar.f162494h.getWidth() - snsAdNativeLandingPagesVideoPlayerLoadingBar.f162494h.getPaddingLeft()) - snsAdNativeLandingPagesVideoPlayerLoadingBar.f162494h.getPaddingRight()) / 2;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) snsAdNativeLandingPagesVideoPlayerLoadingBar.f162493g.getLayoutParams();
        if (i17 < (layoutParams.leftMargin - snsAdNativeLandingPagesVideoPlayerLoadingBar.f162494h.getPaddingLeft()) - width) {
            i17 = layoutParams.leftMargin - snsAdNativeLandingPagesVideoPlayerLoadingBar.f162494h.getPaddingLeft();
        } else if (i17 > snsAdNativeLandingPagesVideoPlayerLoadingBar.getBarLen()) {
            i17 = snsAdNativeLandingPagesVideoPlayerLoadingBar.getBarLen();
        }
        return i17 - width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBarLen() {
        return this.f162493g.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTimeByBarPoint() {
        int paddingLeft = (int) ((((((android.widget.FrameLayout.LayoutParams) this.f162494h.getLayoutParams()).leftMargin - (((android.widget.FrameLayout.LayoutParams) this.f162493g.getLayoutParams()).leftMargin - this.f162494h.getPaddingLeft())) * 1.0d) / getBarLen()) * this.f162498o);
        if (paddingLeft < 0) {
            return 0;
        }
        return paddingLeft;
    }

    @Override // m34.d
    public void a(int i17) {
        this.f162499p = i17;
        h();
    }

    public final void e() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cq6, this);
        this.f162491e = inflate;
        this.f162492f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.kxj);
        this.f162493g = (android.widget.ImageView) this.f162491e.findViewById(com.tencent.mm.R.id.kxi);
        this.f162494h = (android.widget.ImageView) this.f162491e.findViewById(com.tencent.mm.R.id.kxm);
        this.f162495i = (android.widget.ImageView) this.f162491e.findViewById(com.tencent.mm.R.id.kwj);
        this.f162496m = (android.widget.TextView) this.f162491e.findViewById(com.tencent.mm.R.id.kwl);
        this.f162497n = (android.widget.TextView) this.f162491e.findViewById(com.tencent.mm.R.id.kxa);
        this.f162494h.setOnTouchListener(new m34.o(this));
    }

    public java.lang.String f(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    @Override // m34.d
    public void g() {
    }

    public boolean getIsPlay() {
        return this.f162502s;
    }

    @Override // m34.d
    public int getVideoTotalTime() {
        return this.f162498o;
    }

    public void h() {
        if (this.f162498o == 0 || this.f162500q || this.f162494h == null || getBarLen() == 0) {
            return;
        }
        int width = ((this.f162494h.getWidth() - this.f162494h.getPaddingLeft()) - this.f162494h.getPaddingRight()) / 2;
        this.f162496m.setText(f(this.f162499p / 60) + ":" + f(this.f162499p % 60));
        int paddingLeft = ((android.widget.FrameLayout.LayoutParams) this.f162493g.getLayoutParams()).leftMargin - this.f162494h.getPaddingLeft();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f162494h.getLayoutParams();
        layoutParams.leftMargin = (((int) (((((double) this.f162499p) * 1.0d) / ((double) this.f162498o)) * ((double) getBarLen()))) + paddingLeft) - width;
        this.f162494h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f162492f.getLayoutParams();
        layoutParams2.width = (int) (((this.f162499p * 1.0d) / this.f162498o) * getBarLen());
        this.f162492f.setLayoutParams(layoutParams2);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (i17 != this.f162503t || i18 != this.f162504u || i19 != this.f162505v || i27 != this.f162506w) {
            h();
        }
        this.f162503t = i17;
        this.f162504u = i18;
        this.f162505v = i19;
        this.f162506w = i27;
    }

    @Override // m34.d
    public void setIplaySeekCallback(m34.e eVar) {
        this.f162490d = eVar;
    }

    @Override // m34.d
    public void setIsPlay(boolean z17) {
        this.f162502s = z17;
        if (z17) {
            this.f162495i.setImageResource(com.tencent.mm.R.raw.media_player_pause_btn);
        } else {
            this.f162495i.setImageResource(com.tencent.mm.R.raw.media_player_play_btn);
        }
    }

    @Override // m34.d
    public void setOnPlayButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.f162495i.setOnClickListener(onClickListener);
    }

    @Override // m34.d, com.tencent.mm.pluginsdk.ui.z0
    public void setVideoTotalTime(int i17) {
        if (this.f162494h.isShown() && this.f162494h.getWidth() == 0) {
            post(new m34.p(this, i17));
            return;
        }
        this.f162498o = i17;
        this.f162499p = 0;
        this.f162497n.setText(f(this.f162498o / 60) + ":" + f(this.f162498o % 60));
        h();
    }

    public SnsAdNativeLandingPagesVideoPlayerLoadingBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f162490d = null;
        this.f162491e = null;
        this.f162493g = null;
        this.f162494h = null;
        this.f162495i = null;
        this.f162498o = 0;
        this.f162499p = 0;
        this.f162500q = false;
        this.f162501r = 0.0f;
        this.f162502s = false;
        this.f162503t = -1;
        this.f162504u = -1;
        this.f162505v = -1;
        this.f162506w = -1;
        e();
    }

    public SnsAdNativeLandingPagesVideoPlayerLoadingBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f162490d = null;
        this.f162491e = null;
        this.f162493g = null;
        this.f162494h = null;
        this.f162495i = null;
        this.f162498o = 0;
        this.f162499p = 0;
        this.f162500q = false;
        this.f162501r = 0.0f;
        this.f162502s = false;
        this.f162503t = -1;
        this.f162504u = -1;
        this.f162505v = -1;
        this.f162506w = -1;
        e();
    }
}
