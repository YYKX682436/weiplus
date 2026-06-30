package com.tencent.mm.plugin.finder.live.viewmodel.component;

/* loaded from: classes3.dex */
public final class FinderLiveExitAnimateOpUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f116981d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f116982e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f116983f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.x4 f116984g;

    /* renamed from: h, reason: collision with root package name */
    public long f116985h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f116986i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f116987m;

    /* renamed from: n, reason: collision with root package name */
    public int f116988n;

    /* renamed from: o, reason: collision with root package name */
    public int f116989o;

    /* renamed from: p, reason: collision with root package name */
    public wa2.n0 f116990p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f116991q;

    /* renamed from: r, reason: collision with root package name */
    public int f116992r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f116993s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f116994t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveExitAnimateOpUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f116981d = "FinderLiveExitAnimateOp@" + hashCode() + '}';
        this.f116992r = 1;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f116993s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC$voipCallEvent$1
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent event = voipEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (!gm0.j1.a() || event.f54945g.f8415b != 3) {
                    return false;
                }
                com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.this.f116983f = true;
                return true;
            }
        };
        this.f116994t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderFluentSwitchInterceptEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC$interceptEvent$1
            {
                this.__eventId = 1375150718;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderFluentSwitchInterceptEvent finderFluentSwitchInterceptEvent) {
                com.tencent.mm.autogen.events.FinderFluentSwitchInterceptEvent event = finderFluentSwitchInterceptEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.gb gbVar = event.f54276g;
                if (gbVar == null) {
                    return false;
                }
                boolean z17 = gbVar.f6752a;
                com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.this;
                finderLiveExitAnimateOpUIC.f116987m = z17;
                com.tencent.mars.xlog.Log.i(finderLiveExitAnimateOpUIC.f116981d, "receive FinderFluentSwitchInterceptEvent isEventIntercept: " + finderLiveExitAnimateOpUIC.f116987m);
                return true;
            }
        };
    }

    public final void O6(java.lang.String str) {
        ig2.m.f291393a.d();
        P6(str);
    }

    public final void P6(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f116981d, "notifyFinish source: " + str + " start finish");
        this.f116982e = true;
        getActivity().finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x057f, code lost:
    
        if (r6 == null) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a84, code lost:
    
        if (r2 == null) goto L499;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6() {
        /*
            Method dump skipped, instructions count: 2822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.Q6():void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        this.f116991q = true;
        dk2.ef efVar = dk2.ef.f233372a;
        java.lang.Integer num = dk2.ef.G;
        if (num != null) {
            if (!(num.intValue() > 0)) {
                num = null;
            }
            if (num != null) {
                num.intValue();
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c17;
                android.app.Activity context = getContext();
                ml2.e4 e4Var = ml2.e4.f327385q;
                km2.n nVar = dk2.ef.H;
                ml2.r0.Ck(r0Var, context, e4Var, nVar != null ? nVar.f309160l : null, false, null, 24, null);
                com.tencent.mars.xlog.Log.i(this.f116981d, "#onBackPressed exit reportQuitLive CloseTypeSystemBackButton");
            }
        }
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        super.onBeforeFinish(intent);
        com.tencent.mars.xlog.Log.i(this.f116981d, "onBeforeFinish feedId: " + this.f116985h);
        com.tencent.mm.autogen.events.FeedLiveFeedExposeEvent feedLiveFeedExposeEvent = new com.tencent.mm.autogen.events.FeedLiveFeedExposeEvent();
        feedLiveFeedExposeEvent.f54248g.f6546a = this.f116985h;
        feedLiveFeedExposeEvent.e();
        com.tencent.mm.autogen.events.FinderLiveExitEvent finderLiveExitEvent = new com.tencent.mm.autogen.events.FinderLiveExitEvent();
        finderLiveExitEvent.f54285g.f7611a = this.f116985h;
        finderLiveExitEvent.e();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        dk2.x4 x4Var;
        this.f116984g = dk2.x4.C.a(getIntent());
        this.f116985h = getIntent().getLongExtra("CURRENT_FEED_ID", 0L);
        wa2.n0 n0Var = (wa2.n0) getActivity().getWindow().getDecorView().findViewById(com.tencent.mm.R.id.tct);
        this.f116990p = n0Var;
        if (n0Var != null) {
            n0Var.setDragListener(new im2.f(this));
        }
        if (this.f116985h == 0 && (x4Var = this.f116984g) != null) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = x4Var.f234324r;
            long id6 = finderObject != null ? finderObject.getId() : 0L;
            this.f116985h = id6;
            if (id6 == 0 && x4Var.f234318l.size() > 0) {
                this.f116985h = ((com.tencent.mm.live.api.LiveConfig) x4Var.f234318l.get(0)).f68549s;
            }
        }
        ug5.v a17 = ug5.v.f427655g.a(java.lang.String.valueOf(this.f116985h));
        this.f116989o = a17 != null ? a17.hashCode() : 0;
        com.tencent.mars.xlog.Log.i(this.f116981d, "onCreate currentFeedId: " + this.f116985h + " performerDirectorHashCode: " + this.f116989o);
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.gd9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116986i = (android.view.ViewGroup) findViewById;
        this.f116993s.alive();
        this.f116994t.alive();
        ig2.m mVar = ig2.m.f291393a;
        ig2.m.f291395c = false;
        ig2.m.f291396d = false;
        ig2.m.f291398f = false;
        ig2.m.f291397e = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f116981d, "onDestroy");
        this.f116993s.dead();
        this.f116994t.dead();
        ig2.m.f291396d = true;
        ig2.m.f291398f = false;
        pm0.v.V(1000L, new im2.e(this));
    }
}
