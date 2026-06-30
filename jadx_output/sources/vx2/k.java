package vx2;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f441249a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f441250b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f441251c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f441252d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f441253e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f441254f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f441255g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f441256h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f441257i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f441258j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.a f441259k;

    /* renamed from: l, reason: collision with root package name */
    public wu5.c f441260l;

    public k(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f441249a = context;
        this.f441250b = jz5.h.b(vx2.i.f441247d);
        this.f441251c = jz5.h.b(vx2.j.f441248d);
        this.f441252d = jz5.h.b(vx2.a.f441235d);
    }

    public static final float a(vx2.k kVar, boolean z17) {
        long j17;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = kVar.f441253e;
        long videoDurationMs = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getVideoDurationMs() : 0L;
        if (videoDurationMs == 0) {
            return 0.0f;
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = kVar.f441253e;
        long currentPlayMs = finderThumbPlayerProxy2 != null ? finderThumbPlayerProxy2.getCurrentPlayMs() : 0L;
        if (z17) {
            j17 = videoDurationMs - currentPlayMs < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT ? videoDurationMs - 1000 : 10000 + currentPlayMs;
        } else {
            j17 = currentPlayMs >= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT ? currentPlayMs - 10000 : 0L;
        }
        return ((float) j17) / ((float) videoDurationMs);
    }

    public static final void b(vx2.k kVar, long j17, long j18, long j19) {
        kVar.getClass();
        long max = java.lang.Math.max(0L, j18);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = kVar.f441253e;
        if (finderThumbPlayerProxy != null) {
            float f17 = (float) max;
            finderThumbPlayerProxy.r(f17 / 1000.0f, false, 3);
            hc2.f1.x(finderThumbPlayerProxy);
            yz5.l lVar = kVar.f441258j;
            if (lVar != null) {
                lVar.invoke(java.lang.Float.valueOf(f17 / ((float) j19)));
            }
            g(kVar, 5000L, false, 2, null);
            com.tencent.mars.xlog.Log.i("FinderSeekHelper", "fast seekTo " + max + " currentMs " + j17);
        }
    }

    public static final float c(vx2.k kVar) {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = kVar.f441253e;
        if (finderThumbPlayerProxy == null) {
            return 0.0f;
        }
        long videoDurationMs = finderThumbPlayerProxy.getVideoDurationMs();
        if (videoDurationMs == 0) {
            return 0.0f;
        }
        return ((float) finderThumbPlayerProxy.getCurrentPlayMs()) / ((float) videoDurationMs);
    }

    public static /* synthetic */ void e(vx2.k kVar, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = 0;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        kVar.d(j17, z17);
    }

    public static final void f(vx2.k kVar) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = kVar.f441256h;
        if (weImageView != null) {
            weImageView.setVisibility(4);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = kVar.f441257i;
        if (weImageView2 != null) {
            weImageView2.setVisibility(4);
        }
        android.view.ViewGroup viewGroup = kVar.f441255g;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        yz5.a aVar = kVar.f441259k;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static void g(vx2.k kVar, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = ((java.lang.Number) ((jz5.n) kVar.f441252d).getValue()).longValue();
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        kVar.d(j17, z17);
    }

    public final void d(long j17, boolean z17) {
        if (h()) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f441256h;
            if (weImageView != null && weImageView.getVisibility() == 0) {
                if (j17 <= 0) {
                    wu5.c cVar = this.f441260l;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    this.f441260l = null;
                    f(this);
                    return;
                }
                wu5.c cVar2 = this.f441260l;
                if (cVar2 != null) {
                    cVar2.cancel(false);
                }
                ku5.u0 u0Var = ku5.t0.f312615d;
                vx2.h hVar = new vx2.h(z17, this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                this.f441260l = t0Var.z(hVar, j17, false);
            }
        }
    }

    public final boolean h() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        if (((java.lang.Number) ((jz5.n) this.f441250b).getValue()).intValue() == 0) {
            return false;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f441254f;
        return ((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? 0 : feedObject.getVideoDuration()) >= ((java.lang.Number) ((jz5.n) this.f441251c).getValue()).intValue();
    }

    public final boolean i() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        if (((java.lang.Number) ((jz5.n) this.f441250b).getValue()).intValue() != 2) {
            return false;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f441254f;
        return ((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? 0 : feedObject.getVideoDuration()) >= ((java.lang.Number) ((jz5.n) this.f441251c).getValue()).intValue();
    }

    public final void j() {
        android.view.ViewPropertyAnimator animate;
        if (h()) {
            wu5.c cVar = this.f441260l;
            if (cVar != null) {
                cVar.cancel(false);
            }
            android.view.ViewGroup viewGroup = this.f441255g;
            if (viewGroup != null && (animate = viewGroup.animate()) != null) {
                animate.cancel();
            }
            this.f441260l = null;
            android.view.ViewGroup viewGroup2 = this.f441255g;
            if (viewGroup2 != null) {
                viewGroup2.setAlpha(1.0f);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f441256h;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f441257i;
            if (weImageView2 == null) {
                return;
            }
            weImageView2.setVisibility(0);
        }
    }
}
