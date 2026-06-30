package com.tencent.mm.plugin.finder.video;

/* loaded from: classes10.dex */
public final class FinderAudioVolumeController extends pf5.o0 {

    /* renamed from: x, reason: collision with root package name */
    public static float f130491x;

    /* renamed from: y, reason: collision with root package name */
    public static float f130492y;

    /* renamed from: z, reason: collision with root package name */
    public static float f130493z;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f130494e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.BroadcastReceiver f130495f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f130496g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f130497h;

    /* renamed from: i, reason: collision with root package name */
    public float f130498i;

    /* renamed from: m, reason: collision with root package name */
    public float f130499m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f130500n = "";

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.video.FinderAudioVolumeController$volumeKeyEvent$1 f130501o;

    /* renamed from: p, reason: collision with root package name */
    public float f130502p;

    /* renamed from: q, reason: collision with root package name */
    public float f130503q;

    /* renamed from: r, reason: collision with root package name */
    public float f130504r;

    /* renamed from: s, reason: collision with root package name */
    public float f130505s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f130506t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f130507u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.WindowManager f130508v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f130509w;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.video.FinderAudioVolumeController$volumeKeyEvent$1] */
    public FinderAudioVolumeController() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f130501o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderVolumeKeyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.video.FinderAudioVolumeController$volumeKeyEvent$1
            {
                this.__eventId = -635004757;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderVolumeKeyEvent finderVolumeKeyEvent) {
                com.tencent.mm.autogen.events.FinderVolumeKeyEvent event = finderVolumeKeyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f54339g.f7893a;
                return true;
            }
        };
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f130502p = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Xd).getValue()).r()).floatValue();
        this.f130503q = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Zd).getValue()).r()).floatValue();
    }

    public static final java.util.Map T6(float f17, float f18, com.tencent.mm.plugin.finder.video.FinderAudioVolumeController finderAudioVolumeController, r45.qt2 qt2Var) {
        cw2.wa f124897p;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        jz5.l[] lVarArr = new jz5.l[7];
        int i17 = 0;
        lVarArr[0] = new jz5.l("finder_tab_context_id", qt2Var.getString(2));
        lVarArr[1] = new jz5.l("finder_context_id", qt2Var.getString(1));
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var.getInteger(5)));
        lVarArr[3] = new jz5.l("before_adjust_volume", java.lang.Float.valueOf(f17));
        lVarArr[4] = new jz5.l("after_adjust_volume", java.lang.Float.valueOf(f18));
        android.animation.ValueAnimator valueAnimator = finderAudioVolumeController.f130496g;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            i17 = 1;
        }
        lVarArr[5] = new jz5.l("if_volume_regular_increase", java.lang.Integer.valueOf(i17));
        cw2.da S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class))).S6(finderAudioVolumeController.f130494e);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = S6 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) S6 : null;
        lVarArr[6] = new jz5.l("feed_id", pm0.v.u((finderThumbPlayerProxy == null || (f124897p = finderThumbPlayerProxy.getF124897p()) == null || (feedData = f124897p.f224099f) == null) ? 0L : feedData.getExpectId()));
        return kz5.c1.k(lVarArr);
    }

    public final float N6(float f17, float f18) {
        if (f17 < f18) {
            return 1.0f;
        }
        return (float) java.lang.Math.pow(10.0f, (-((f17 - f18) * 60.0f)) / 20);
    }

    public final boolean O6() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z65.c.a() && (f130491x > 0.0f || f130492y > 0.0f || f130493z > 0.0f);
    }

    public final boolean P6() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Wd).getValue()).r()).intValue() == 1;
    }

    public final boolean Q6() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a() && P6()) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127605ae).getValue()).r()).intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void R6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!P6() || O6() || this.f130497h) {
            return;
        }
        float f17 = this.f130504r;
        if (f17 > 0.0f) {
            float f18 = this.f130502p;
            if (f18 <= 0.0f || f17 <= f18 || this.f130503q <= 0.0f) {
                return;
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Yd).getValue()).r()).intValue() == 1) {
                float N6 = N6(this.f130504r, this.f130502p);
                com.tencent.mars.xlog.Log.i("FinderAudioVolumeController", "onFirstEnterFeedFirstFrame percent:" + this.f130504r + " threshold:" + this.f130502p + " speed:" + this.f130503q + " audioGain:" + N6);
                float f19 = (((float) 1000) * (this.f130504r - this.f130502p)) / this.f130503q;
                if (f19 <= 0.0f) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("FinderAudioVolumeController", "animateChangeVolume " + N6 + "  1.0  durationMs:" + f19);
                android.animation.ValueAnimator valueAnimator = this.f130496g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(N6, 1.0f);
                this.f130496g = ofFloat;
                if (ofFloat != null) {
                    ofFloat.setDuration(f19);
                }
                android.animation.ValueAnimator valueAnimator2 = this.f130496g;
                if (valueAnimator2 != null) {
                    valueAnimator2.setInterpolator(new android.view.animation.LinearInterpolator());
                }
                android.animation.ValueAnimator valueAnimator3 = this.f130496g;
                if (valueAnimator3 != null) {
                    valueAnimator3.addUpdateListener(new cw2.r(this, N6, context));
                }
                android.animation.ValueAnimator valueAnimator4 = this.f130496g;
                if (valueAnimator4 != null) {
                    valueAnimator4.addListener(new cw2.p(this));
                }
                android.animation.ValueAnimator valueAnimator5 = this.f130496g;
                if (valueAnimator5 != null) {
                    valueAnimator5.addListener(new cw2.q(this, context));
                }
                android.animation.ValueAnimator valueAnimator6 = this.f130496g;
                if (valueAnimator6 != null) {
                    valueAnimator6.start();
                }
            }
        }
    }

    public final void S6(int i17, float f17, float f18) {
        android.content.Context context = this.f130494e;
        if (context != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            if (i17 == 24) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("turn_up_volume", null, T6(f17, f18, this, V6), 1, true);
            } else {
                if (i17 != 25) {
                    return;
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("turn_down_volume", null, T6(f17, f18, this, V6), 1, true);
            }
        }
    }

    public final float U6(float f17) {
        return new java.math.BigDecimal(f17).setScale(2, java.math.RoundingMode.HALF_UP).floatValue();
    }

    public final void V6(java.lang.String str, float f17) {
        android.widget.TextView textView = this.f130509w;
        if (textView == null) {
            return;
        }
        textView.setText(str + '/' + U6(f17));
    }
}
