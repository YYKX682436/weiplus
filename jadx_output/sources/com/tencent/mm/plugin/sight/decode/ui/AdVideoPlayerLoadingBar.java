package com.tencent.mm.plugin.sight.decode.ui;

/* loaded from: classes3.dex */
public class AdVideoPlayerLoadingBar extends android.widget.RelativeLayout implements m34.d {

    /* renamed from: d, reason: collision with root package name */
    public m34.e f162471d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f162472e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f162473f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f162474g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f162475h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f162476i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f162477m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f162478n;

    /* renamed from: o, reason: collision with root package name */
    public int f162479o;

    /* renamed from: p, reason: collision with root package name */
    public int f162480p;

    /* renamed from: q, reason: collision with root package name */
    public int f162481q;

    /* renamed from: r, reason: collision with root package name */
    public int f162482r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f162483s;

    /* renamed from: t, reason: collision with root package name */
    public float f162484t;

    /* renamed from: u, reason: collision with root package name */
    public int f162485u;

    /* renamed from: v, reason: collision with root package name */
    public int f162486v;

    /* renamed from: w, reason: collision with root package name */
    public int f162487w;

    /* renamed from: x, reason: collision with root package name */
    public int f162488x;

    public AdVideoPlayerLoadingBar(android.content.Context context) {
        super(context);
        this.f162471d = null;
        this.f162472e = null;
        this.f162474g = null;
        this.f162475h = null;
        this.f162476i = null;
        this.f162479o = 0;
        this.f162480p = 0;
        this.f162481q = 0;
        this.f162482r = 0;
        this.f162483s = false;
        this.f162484t = 0.0f;
        this.f162485u = -1;
        this.f162486v = -1;
        this.f162487w = -1;
        this.f162488x = -1;
        j();
    }

    public void a(int i17) {
        this.f162480p = i17;
        m();
    }

    public void c(int i17) {
        a(i17);
    }

    public void e(boolean z17) {
        setIsPlay(z17);
    }

    @Override // m34.d
    public void g() {
        this.f162481q = 0;
    }

    public int getBarLen() {
        if (this.f162481q <= 0) {
            this.f162481q = this.f162474g.getWidth();
        }
        return this.f162481q;
    }

    public int getBarPointWidth() {
        if (this.f162482r <= 0) {
            this.f162482r = this.f162475h.getWidth();
        }
        return this.f162482r;
    }

    public int getCurrentTimeByBarPoint() {
        return java.lang.Math.max(0, (int) (((((((android.widget.FrameLayout.LayoutParams) this.f162475h.getLayoutParams()).leftMargin - (((android.widget.FrameLayout.LayoutParams) this.f162474g.getLayoutParams()).leftMargin - this.f162475h.getPaddingLeft())) + (((getBarPointWidth() - this.f162475h.getPaddingLeft()) - this.f162475h.getPaddingRight()) / 2)) * 1.0d) / getBarLen()) * this.f162479o));
    }

    public int getLayoutId() {
        return com.tencent.mm.R.layout.d3m;
    }

    @Override // m34.d
    public int getVideoTotalTime() {
        return this.f162479o;
    }

    public int getmPosition() {
        return this.f162480p;
    }

    public void j() {
        android.view.View inflate = android.view.View.inflate(getContext(), getLayoutId(), this);
        this.f162472e = inflate;
        this.f162473f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.kxj);
        this.f162474g = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.kxi);
        this.f162475h = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.kxm);
        this.f162476i = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.kwj);
        this.f162477m = (android.widget.TextView) this.f162472e.findViewById(com.tencent.mm.R.id.kwl);
        this.f162478n = (android.widget.TextView) this.f162472e.findViewById(com.tencent.mm.R.id.kxa);
        this.f162475h.setOnTouchListener(new m34.a(this));
        this.f162475h.post(new m34.b(this));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f162473f.getLayoutParams();
        layoutParams.width = 0;
        this.f162473f.setLayoutParams(layoutParams);
    }

    public java.lang.String k(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    public void m() {
        if (this.f162479o == 0 || this.f162483s || this.f162475h == null || getBarLen() == 0) {
            return;
        }
        int barPointWidth = ((getBarPointWidth() - this.f162475h.getPaddingLeft()) - this.f162475h.getPaddingRight()) / 2;
        this.f162477m.setText(k(this.f162480p / 60) + ":" + k(this.f162480p % 60));
        int paddingLeft = ((android.widget.FrameLayout.LayoutParams) this.f162474g.getLayoutParams()).leftMargin - this.f162475h.getPaddingLeft();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f162475h.getLayoutParams();
        layoutParams.leftMargin = (((int) (((((double) this.f162480p) * 1.0d) / ((double) this.f162479o)) * ((double) getBarLen()))) + paddingLeft) - barPointWidth;
        this.f162475h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f162473f.getLayoutParams();
        layoutParams2.width = (int) (((this.f162480p * 1.0d) / this.f162479o) * getBarLen());
        this.f162473f.setLayoutParams(layoutParams2);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f162481q = 0;
        if (i17 != this.f162485u || i18 != this.f162486v || i19 != this.f162487w || i27 != this.f162488x) {
            m();
        }
        this.f162485u = i17;
        this.f162486v = i18;
        this.f162487w = i19;
        this.f162488x = i27;
    }

    public void q() {
        this.f162478n.setText(k(this.f162479o / 60) + ":" + k(this.f162479o % 60));
        m();
    }

    @Override // m34.d
    public void setIplaySeekCallback(m34.e eVar) {
        this.f162471d = eVar;
    }

    public void setIsPlay(boolean z17) {
        if (z17) {
            this.f162476i.setImageResource(com.tencent.mm.R.raw.media_player_pause_btn);
        } else {
            this.f162476i.setImageResource(com.tencent.mm.R.raw.media_player_play_btn);
        }
    }

    @Override // m34.d
    public void setOnPlayButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.f162476i.setOnClickListener(onClickListener);
    }

    public void setVideoTotalTime(int i17) {
        this.f162479o = i17;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            post(new m34.c(this));
        } else {
            q();
        }
    }

    public AdVideoPlayerLoadingBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f162471d = null;
        this.f162472e = null;
        this.f162474g = null;
        this.f162475h = null;
        this.f162476i = null;
        this.f162479o = 0;
        this.f162480p = 0;
        this.f162481q = 0;
        this.f162482r = 0;
        this.f162483s = false;
        this.f162484t = 0.0f;
        this.f162485u = -1;
        this.f162486v = -1;
        this.f162487w = -1;
        this.f162488x = -1;
        j();
    }

    public AdVideoPlayerLoadingBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f162471d = null;
        this.f162472e = null;
        this.f162474g = null;
        this.f162475h = null;
        this.f162476i = null;
        this.f162479o = 0;
        this.f162480p = 0;
        this.f162481q = 0;
        this.f162482r = 0;
        this.f162483s = false;
        this.f162484t = 0.0f;
        this.f162485u = -1;
        this.f162486v = -1;
        this.f162487w = -1;
        this.f162488x = -1;
        j();
    }
}
