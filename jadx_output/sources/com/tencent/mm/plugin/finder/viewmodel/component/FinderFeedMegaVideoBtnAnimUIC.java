package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class FinderFeedMegaVideoBtnAnimUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f133556d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f133557e;

    /* renamed from: f, reason: collision with root package name */
    public int f133558f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f133559g;

    /* renamed from: h, reason: collision with root package name */
    public final android.animation.ValueAnimator f133560h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f133561i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1 f133562m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1 f133563n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1] */
    public FinderFeedMegaVideoBtnAnimUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f133560h = ofFloat;
        this.f133561i = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f133562m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1
            {
                this.__eventId = -1291074182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent) {
                int w17;
                int y17;
                in5.s0 s0Var;
                so2.u1 u1Var;
                am.fa faVar;
                com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent event = feedMegaVideoAnimPlayEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.this;
                androidx.recyclerview.widget.RecyclerView recyclerView = finderFeedMegaVideoBtnAnimUIC.f133556d;
                if (recyclerView != null) {
                    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null && (w17 = linearLayoutManager.w()) <= (y17 = linearLayoutManager.y())) {
                        while (true) {
                            androidx.recyclerview.widget.k3 q07 = recyclerView.q0(w17, false);
                            s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                            if (s0Var != null) {
                                android.view.View p17 = s0Var.p(com.tencent.mm.R.id.ipz);
                                if (!(p17 != null && p17.getVisibility() == 0)) {
                                    s0Var = null;
                                }
                                if (s0Var != null) {
                                    java.lang.Object obj = s0Var.f293125i;
                                    u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                                    if (u1Var != null && u1Var.getFeedObject().isPostFinish()) {
                                        long expectId = u1Var.getFeedObject().getExpectId();
                                        faVar = event.f54249g;
                                        if (expectId == faVar.f6658a || (faVar.f6659b && u1Var.getFeedObject().getLocalId() == faVar.f6658a)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            if (w17 == y17) {
                                break;
                            }
                            w17++;
                        }
                        if (faVar.f6660c) {
                            com.tencent.mars.xlog.Log.i("FinderFeedMegaVideoBtnAnimUIC", "reset mega video anim status, feedId = " + faVar.f6658a);
                            if (finderFeedMegaVideoBtnAnimUIC.f133561i) {
                                u1Var.f410630d = false;
                            }
                        } else if (faVar.f6661d) {
                            com.tencent.mars.xlog.Log.i("FinderFeedMegaVideoBtnAnimUIC", "video is completed, feedId = " + faVar.f6658a);
                        } else {
                            com.tencent.mars.xlog.Log.i("FinderFeedMegaVideoBtnAnimUIC", "start finder feed mega video button anim, feedId = " + faVar.f6658a);
                            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.cd(s0Var, finderFeedMegaVideoBtnAnimUIC));
                            if (!u1Var.f410630d) {
                                androidx.appcompat.app.AppCompatActivity activity2 = finderFeedMegaVideoBtnAnimUIC.getActivity();
                                kotlin.jvm.internal.o.g(activity2, "activity");
                                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                                com.tencent.mm.plugin.finder.report.s5 s5Var = com.tencent.mm.plugin.finder.report.s5.f125349a;
                                java.lang.String u17 = pm0.v.u(u1Var.getItemId());
                                java.lang.String string = V6.getString(0);
                                if (string == null) {
                                    string = "";
                                }
                                java.lang.String string2 = V6.getString(1);
                                if (string2 == null) {
                                    string2 = "";
                                }
                                java.lang.String string3 = V6.getString(2);
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21412, u17, string, string2, string3 != null ? string3 : "");
                                u1Var.f410630d = true;
                            }
                        }
                    }
                }
                return true;
            }
        };
        this.f133563n = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroy() {
                com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.this;
                finderFeedMegaVideoBtnAnimUIC.f133562m.dead();
                finderFeedMegaVideoBtnAnimUIC.getActivity().mo133getLifecycle().c(this);
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
            public final void onPause() {
                com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.this;
                finderFeedMegaVideoBtnAnimUIC.f133562m.dead();
                finderFeedMegaVideoBtnAnimUIC.f133561i = false;
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onResume() {
                com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.this;
                finderFeedMegaVideoBtnAnimUIC.f133562m.alive();
                finderFeedMegaVideoBtnAnimUIC.f133561i = true;
            }
        };
    }

    public static final int O6(com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC, float f17, int i17, int i18) {
        finderFeedMegaVideoBtnAnimUIC.getClass();
        int red = android.graphics.Color.red(i17);
        int blue = android.graphics.Color.blue(i17);
        int green = android.graphics.Color.green(i17);
        int red2 = android.graphics.Color.red(i18);
        return android.graphics.Color.rgb(red + ((int) ((red2 - red) * f17)), green + ((int) (f17 * (android.graphics.Color.green(i18) - green))), blue + ((int) ((android.graphics.Color.blue(i18) - blue) * f17)));
    }

    public final void P6(androidx.recyclerview.widget.RecyclerView rv6) {
        kotlin.jvm.internal.o.g(rv6, "rv");
        this.f133556d = rv6;
        if (!this.f133559g) {
            alive();
        }
        this.f133559g = true;
        getActivity().mo133getLifecycle().a(this.f133563n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1] */
    public FinderFeedMegaVideoBtnAnimUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f133560h = ofFloat;
        this.f133561i = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f133562m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1
            {
                this.__eventId = -1291074182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent) {
                int w17;
                int y17;
                in5.s0 s0Var;
                so2.u1 u1Var;
                am.fa faVar;
                com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent event = feedMegaVideoAnimPlayEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.this;
                androidx.recyclerview.widget.RecyclerView recyclerView = finderFeedMegaVideoBtnAnimUIC.f133556d;
                if (recyclerView != null) {
                    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null && (w17 = linearLayoutManager.w()) <= (y17 = linearLayoutManager.y())) {
                        while (true) {
                            androidx.recyclerview.widget.k3 q07 = recyclerView.q0(w17, false);
                            s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                            if (s0Var != null) {
                                android.view.View p17 = s0Var.p(com.tencent.mm.R.id.ipz);
                                if (!(p17 != null && p17.getVisibility() == 0)) {
                                    s0Var = null;
                                }
                                if (s0Var != null) {
                                    java.lang.Object obj = s0Var.f293125i;
                                    u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                                    if (u1Var != null && u1Var.getFeedObject().isPostFinish()) {
                                        long expectId = u1Var.getFeedObject().getExpectId();
                                        faVar = event.f54249g;
                                        if (expectId == faVar.f6658a || (faVar.f6659b && u1Var.getFeedObject().getLocalId() == faVar.f6658a)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            if (w17 == y17) {
                                break;
                            }
                            w17++;
                        }
                        if (faVar.f6660c) {
                            com.tencent.mars.xlog.Log.i("FinderFeedMegaVideoBtnAnimUIC", "reset mega video anim status, feedId = " + faVar.f6658a);
                            if (finderFeedMegaVideoBtnAnimUIC.f133561i) {
                                u1Var.f410630d = false;
                            }
                        } else if (faVar.f6661d) {
                            com.tencent.mars.xlog.Log.i("FinderFeedMegaVideoBtnAnimUIC", "video is completed, feedId = " + faVar.f6658a);
                        } else {
                            com.tencent.mars.xlog.Log.i("FinderFeedMegaVideoBtnAnimUIC", "start finder feed mega video button anim, feedId = " + faVar.f6658a);
                            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.cd(s0Var, finderFeedMegaVideoBtnAnimUIC));
                            if (!u1Var.f410630d) {
                                androidx.appcompat.app.AppCompatActivity activity2 = finderFeedMegaVideoBtnAnimUIC.getActivity();
                                kotlin.jvm.internal.o.g(activity2, "activity");
                                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                                com.tencent.mm.plugin.finder.report.s5 s5Var = com.tencent.mm.plugin.finder.report.s5.f125349a;
                                java.lang.String u17 = pm0.v.u(u1Var.getItemId());
                                java.lang.String string = V6.getString(0);
                                if (string == null) {
                                    string = "";
                                }
                                java.lang.String string2 = V6.getString(1);
                                if (string2 == null) {
                                    string2 = "";
                                }
                                java.lang.String string3 = V6.getString(2);
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21412, u17, string, string2, string3 != null ? string3 : "");
                                u1Var.f410630d = true;
                            }
                        }
                    }
                }
                return true;
            }
        };
        this.f133563n = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroy() {
                com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.this;
                finderFeedMegaVideoBtnAnimUIC.f133562m.dead();
                finderFeedMegaVideoBtnAnimUIC.getActivity().mo133getLifecycle().c(this);
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
            public final void onPause() {
                com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.this;
                finderFeedMegaVideoBtnAnimUIC.f133562m.dead();
                finderFeedMegaVideoBtnAnimUIC.f133561i = false;
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onResume() {
                com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.this;
                finderFeedMegaVideoBtnAnimUIC.f133562m.alive();
                finderFeedMegaVideoBtnAnimUIC.f133561i = true;
            }
        };
    }
}
