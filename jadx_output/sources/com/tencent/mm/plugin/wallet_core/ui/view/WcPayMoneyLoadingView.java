package com.tencent.mm.plugin.wallet_core.ui.view;

/* loaded from: classes9.dex */
public class WcPayMoneyLoadingView extends android.widget.FrameLayout implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public com.robinhood.ticker.TickerView f180752d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f180753e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f180754f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f180755g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f180756h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f180757i;

    public WcPayMoneyLoadingView(android.content.Context context) {
        super(context);
        this.f180754f = "";
        this.f180756h = false;
        this.f180757i = new gt4.l2(this);
        c();
    }

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayMoneyLoadingView", "hide loading pb");
        android.widget.ProgressBar progressBar = this.f180753e;
        if (progressBar != null) {
            if (z17) {
                progressBar.setVisibility(8);
            } else {
                progressBar.setVisibility(4);
            }
        }
        removeCallbacks(this.f180757i);
    }

    public void b() {
        setVisibility(8);
        android.widget.ProgressBar progressBar = this.f180753e;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        removeCallbacks(this.f180757i);
    }

    public final void c() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.c2f, this);
        com.robinhood.ticker.TickerView tickerView = (com.robinhood.ticker.TickerView) findViewById(com.tencent.mm.R.id.f485936jl3);
        this.f180752d = tickerView;
        tickerView.setCharacterLists("0123456789");
    }

    public final void d(android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188589l, i17, 0);
        float dimension = obtainStyledAttributes.getDimension(0, 15.0f);
        int color = obtainStyledAttributes.getColor(1, -16777216);
        int integer = obtainStyledAttributes.getInteger(3, 4);
        obtainStyledAttributes.getInteger(2, 0);
        obtainStyledAttributes.recycle();
        setTextSize(dimension);
        setTextColor(color);
        setTypeface(com.tencent.mm.wallet_core.ui.r1.F(getContext(), integer));
    }

    public void e(java.lang.String str, boolean z17) {
        f(str, z17, false, true);
    }

    public void f(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        if (str == null) {
            return;
        }
        if (z18) {
            this.f180756h = true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f180755g)) {
            setFirstMoney(str);
            if (z17) {
                removeCallbacks(this.f180757i);
                return;
            }
            return;
        }
        if (z19) {
            setNewMoney(str);
        } else {
            g(str, false);
        }
    }

    public void g(java.lang.String str, boolean z17) {
        removeCallbacks(this.f180757i);
        if (z17) {
            this.f180753e.setVisibility(8);
        } else {
            this.f180753e.setVisibility(4);
        }
        if (this.f180755g.length() != str.length()) {
            this.f180752d.setAnimationDuration(800L);
        } else {
            this.f180752d.setAnimationDuration(500L);
        }
        if (com.tencent.mm.sdk.platformtools.t8.F(str, 0.0d) > com.tencent.mm.sdk.platformtools.t8.F(this.f180755g, 0.0d)) {
            this.f180752d.setPreferredScrollingDirection(xb.i.DOWN);
        } else {
            this.f180752d.setPreferredScrollingDirection(xb.i.UP);
        }
        boolean z18 = this.f180756h;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f180755g)) {
            z18 = false;
        }
        this.f180752d.d(this.f180754f + str, z18);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onActivityDestroy() {
        removeCallbacks(this.f180757i);
    }

    public void setAnimationDuration(long j17) {
        this.f180752d.setAnimationDuration(j17);
    }

    public void setFirstMoney(java.lang.String str) {
        this.f180755g = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f180752d.d(this.f180754f + str, false);
        }
        postDelayed(this.f180757i, 500L);
    }

    public void setLoadingPb(android.widget.ProgressBar progressBar) {
        this.f180753e = progressBar;
    }

    public void setMoney(java.lang.String str) {
        e(str, false);
    }

    public void setNewMoney(java.lang.String str) {
        g(str, true);
    }

    public void setPrefixSymbol(java.lang.String str) {
        this.f180754f = str;
    }

    public void setProgressBarStyle(int i17) {
        if (i17 == 0) {
            this.f180753e.setIndeterminateDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.avk));
        } else {
            this.f180753e.setIndeterminateDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.avh));
        }
    }

    public void setTextColor(int i17) {
        this.f180752d.setTextColor(i17);
    }

    public void setTextSize(float f17) {
        float q17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (com.tencent.mm.ui.bk.M(q17, i65.a.u(com.tencent.mm.sdk.platformtools.x2.f193071a)) || com.tencent.mm.ui.bk.M(q17, i65.a.v(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            q17 = i65.a.t(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        this.f180752d.setTextSize(f17 * q17);
    }

    public void setTextSizeNotScaled(float f17) {
        this.f180752d.setTextSize(f17);
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        this.f180752d.setTypeface(typeface);
    }

    public WcPayMoneyLoadingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f180754f = "";
        this.f180756h = false;
        this.f180757i = new gt4.l2(this);
        c();
        d(attributeSet, -1);
    }

    public WcPayMoneyLoadingView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f180754f = "";
        this.f180756h = false;
        this.f180757i = new gt4.l2(this);
        c();
        d(attributeSet, i17);
    }
}
