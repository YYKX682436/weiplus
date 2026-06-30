package com.tencent.mm.plugin.websearch.widget;

/* loaded from: classes8.dex */
public class WebSearchWebVideoViewControlBar extends com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar {
    public static int P = -1;
    public android.widget.ImageView E;
    public android.widget.ImageView F;
    public android.widget.RelativeLayout G;
    public android.widget.ImageView H;
    public android.widget.FrameLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f181711J;
    public bw4.i K;
    public com.tencent.mm.sdk.platformtools.b4 L;
    public com.tencent.mm.sdk.platformtools.b4 M;
    public boolean N;

    public WebSearchWebVideoViewControlBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean A() {
        bw4.i iVar = this.K;
        if (iVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoViewControlBar", "updateMiddleBar mStatePorter null");
            return false;
        }
        int cacheTimeSec = ((kw4.j) iVar).f313179a.f182068e.getCacheTimeSec();
        int videoDurationSec = ((kw4.j) this.K).f313179a.f182068e.getVideoDurationSec();
        if (cacheTimeSec < 0 || videoDurationSec < 0) {
            return false;
        }
        int width = this.I.getWidth();
        if (width <= 0) {
            return true;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.H.getLayoutParams();
        if (videoDurationSec != 0) {
            width = (int) (width * (1.0f - (cacheTimeSec / videoDurationSec)));
        }
        if (width <= 0) {
            width = 0;
        }
        layoutParams.rightMargin = width + P;
        this.H.setLayoutParams(layoutParams);
        return cacheTimeSec < videoDurationSec || videoDurationSec == 0;
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, com.tencent.mm.pluginsdk.ui.z0
    public void c(int i17) {
        a((int) java.lang.Math.ceil((((kw4.j) this.K).f313179a.f182068e.getCurrPosMs() * 1.0d) / 1000.0d));
    }

    @Override // com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getBarPointWidth() {
        return this.f162475h.getWidth();
    }

    public android.widget.ImageView getExitFullscreenIv() {
        return this.f181711J;
    }

    @Override // com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bdb;
    }

    @Override // com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void j() {
        super.j();
        this.E = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.ggy);
        this.F = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.p5c);
        this.H = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.kxk);
        this.I = (android.widget.FrameLayout) this.f162472e.findViewById(com.tencent.mm.R.id.kxn);
        this.G = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.m7g);
        this.f181711J = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.djo);
        if (P < 0) {
            P = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a1v);
        }
    }

    public void setEnterFullScreenBtnClickListener(android.view.View.OnClickListener onClickListener) {
        this.E.setOnClickListener(onClickListener);
    }

    public void setExitFullScreenBtnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f181711J.setOnClickListener(onClickListener);
    }

    @Override // com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d
    public void setIsPlay(boolean z17) {
        this.f181710z = z17;
        y();
    }

    public void setMuteBtnOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.F.setOnClickListener(onClickListener);
    }

    public void setStatePorter(bw4.i iVar) {
        this.K = iVar;
    }

    public final void w() {
        android.view.ViewGroup.LayoutParams layoutParams = this.G.getLayoutParams();
        if (this.N) {
            layoutParams.height = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a1t);
        } else {
            layoutParams.height = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a1r);
        }
        this.G.setLayoutParams(layoutParams);
        if (this.N) {
            this.E.setImageResource(com.tencent.mm.R.raw.icons_fts_web_video_fullscreen_op_fullscreen_btn);
            this.E.setVisibility(8);
            this.f181711J.setVisibility(0);
        } else {
            this.f181711J.setVisibility(8);
            this.E.setVisibility(0);
            this.E.setImageResource(com.tencent.mm.R.drawable.c6b);
        }
        y();
        float dimensionPixelSize = this.N ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a1u) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a1s);
        this.f162477m.setTextSize(0, dimensionPixelSize);
        this.f162478n.setTextSize(0, dimensionPixelSize);
    }

    public void x() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.L;
        if (b4Var != null) {
            b4Var.d();
            this.L.c(2000L, 2000L);
        }
    }

    public final void y() {
        if (this.N) {
            if (this.f181710z) {
                this.f162476i.setImageResource(com.tencent.mm.R.drawable.c6_);
                return;
            } else {
                this.f162476i.setImageResource(com.tencent.mm.R.drawable.c6d);
                return;
            }
        }
        if (this.f181710z) {
            this.f162476i.setImageResource(com.tencent.mm.R.drawable.c6_);
        } else {
            this.f162476i.setImageResource(com.tencent.mm.R.drawable.c6d);
        }
    }

    public void z(boolean z17) {
        if (getVisibility() == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (z17) {
            this.f162476i.setVisibility(8);
        } else {
            this.f162476i.setVisibility(0);
        }
        if (this.L == null) {
            this.L = new com.tencent.mm.sdk.platformtools.b4(new bw4.g(this), false);
        }
        this.L.d();
        this.L.c(2000L, 2000L);
    }

    public WebSearchWebVideoViewControlBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
