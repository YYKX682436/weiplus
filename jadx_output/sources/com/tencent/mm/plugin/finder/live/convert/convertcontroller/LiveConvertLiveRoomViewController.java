package com.tencent.mm.plugin.finder.live.convert.convertcontroller;

/* loaded from: classes3.dex */
public final class LiveConvertLiveRoomViewController extends tc2.c implements tc2.h, uc2.d {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f111623e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f111624f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f111625g;

    /* renamed from: h, reason: collision with root package name */
    public int f111626h;

    /* renamed from: i, reason: collision with root package name */
    public int f111627i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f111628m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.fragment.FinderLiveMixedFlowFragment f111629n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController$liveEndPageFinishListener$1 f111630o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController$liveEndPageFinishListener$1] */
    public LiveConvertLiveRoomViewController(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f111623e = "LiveConvertLiveRoomViewController";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f111630o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveEndPageFinishedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController$liveEndPageFinishListener$1
            {
                this.__eventId = 1944079072;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveEndPageFinishedEvent finderLiveEndPageFinishedEvent) {
                com.tencent.mm.autogen.events.FinderLiveEndPageFinishedEvent event = finderLiveEndPageFinishedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = k0Var instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) k0Var : null;
                if (finderLiveVisitorPluginLayout != null && finderLiveVisitorPluginLayout.getIsPresentedInTimeLineUI()) {
                    android.content.Context context = finderLiveVisitorPluginLayout.getContext();
                    android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                    if (activity != null) {
                        activity.finish();
                    }
                    com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController.this.f111625g = true;
                }
                return true;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07a1  */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [so2.h1] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Y6(in5.s0 r58, android.view.ViewGroup r59, so2.h1 r60, boolean r61, boolean r62) {
        /*
            Method dump skipped, instructions count: 2242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController.Y6(in5.s0, android.view.ViewGroup, so2.h1, boolean, boolean):void");
    }

    public void Z6(in5.s0 holder, boolean z17, boolean z18) {
        android.view.Window window;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = holder.itemView;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f484854fq1);
            if (findViewById != null) {
                com.tencent.mars.xlog.Log.i(this.f111623e, "pluginLayout:" + findViewById.hashCode() + " exitLiveRoomInFeed, stopped:" + z17);
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = findViewById instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) findViewById : null;
                if (finderLiveVisitorPluginLayout == null) {
                    return;
                }
                android.content.Context context = viewGroup.getContext();
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if ((activity != null ? activity.isFinishing() : false) && !this.f111625g) {
                    finderLiveVisitorPluginLayout.checkMiniWindow();
                }
                if (!z18 && !finderLiveVisitorPluginLayout.getHasQuitLiveActionReported()) {
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.r0.Ck((ml2.r0) c17, viewGroup.getContext(), ml2.e4.f327380i, null, false, null, 28, null);
                }
                finderLiveVisitorPluginLayout.unMount();
                android.view.ViewParent parent = ((com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) findViewById).getParent();
                android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(findViewById);
                }
                int i17 = qs5.r.f366463a;
                finderLiveVisitorPluginLayout.setUiState(3);
            }
            if (this.f111627i != 0) {
                androidx.recyclerview.widget.RecyclerView o17 = holder.o();
                if (o17 != null) {
                    o17.setDescendantFocusability(this.f111627i);
                }
                this.f111627i = 0;
            }
            com.tencent.mm.ui.tools.f5 f5Var = this.f111628m;
            if (f5Var != null) {
                f5Var.d();
            }
            com.tencent.mm.ui.tools.f5 f5Var2 = this.f111628m;
            if (f5Var2 != null) {
                f5Var2.f210400e = null;
            }
            this.f111628m = null;
            if (this.f111624f) {
                android.content.Context context2 = holder.f293121e;
                android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
                if (activity2 != null && (window = activity2.getWindow()) != null) {
                    window.setFlags(this.f111626h, 2147483646);
                }
            }
            this.f111624f = false;
            this.f111625g = false;
            dead();
        }
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233382f = null;
    }

    public final java.lang.String a7(in5.s0 s0Var) {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.Context context = s0Var.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean z17 = false;
        boolean z18 = (activity == null || (intent2 = activity.getIntent()) == null || intent2.getIntExtra("key_reuqest_scene", 0) != 55) ? false : true;
        if (activity != null && (intent = activity.getIntent()) != null) {
            z17 = intent.getBooleanExtra("key_enable_mixed_timeline_with_liveroom", false);
        }
        if (z17) {
            return z18 ? "mmbiz_oftenread_bar_list" : "mmbiz_sideways";
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context2);
        java.lang.Integer valueOf = Sj != null ? java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).f135380n) : null;
        return (valueOf != null && valueOf.intValue() == 120) ? "mmbiz_profile_mix" : "";
    }
}
