package com.tencent.mm.plugin.sns.ui;

@db5.a(2176)
@ul5.d(0)
/* loaded from: classes4.dex */
public class SnsUserUI extends com.tencent.mm.ui.MMActivity implements p94.m0 {
    public static final /* synthetic */ int V = 0;
    public android.view.View B;
    public com.tencent.mm.plugin.sns.ui.ho L;
    public android.view.View Q;
    public final com.tencent.mm.sdk.event.IListener S;
    public final com.tencent.mm.sdk.event.IListener T;
    public final com.tencent.mm.sdk.event.IListener U;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.so f167595d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsUIAction f167597f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.d6 f167598g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f167599h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f167600i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f167601m;
    private vj5.k mStatusBarHeightCallback;

    /* renamed from: n, reason: collision with root package name */
    public boolean f167602n;

    /* renamed from: o, reason: collision with root package name */
    public int f167603o;

    /* renamed from: p, reason: collision with root package name */
    public int f167604p;

    /* renamed from: q, reason: collision with root package name */
    public int f167605q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.tt f167607s;

    /* renamed from: e, reason: collision with root package name */
    public boolean f167596e = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f167606r = false;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f167608t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.FrameLayout f167609u = null;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.RelativeLayout f167610v = null;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f167611w = null;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f167612x = null;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.RelativeLayout f167613y = null;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.RelativeLayout f167614z = null;
    public android.widget.LinearLayout A = null;
    public int C = 0;
    public int D = 0;
    public java.lang.Long E = 0L;
    public int F = -1;
    public boolean G = false;
    public ca4.r0 H = new ca4.r0();
    public final com.tencent.mm.plugin.sns.statistics.b0 I = new com.tencent.mm.plugin.sns.statistics.b0();

    /* renamed from: J, reason: collision with root package name */
    public final android.view.animation.Animation f167594J = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
    public java.lang.String K = "";
    public final java.lang.Runnable M = new com.tencent.mm.plugin.sns.ui.bv(this);
    public long N = 0;
    public long P = 0;
    public final android.view.MenuItem.OnMenuItemClickListener R = new com.tencent.mm.plugin.sns.ui.cv(this);

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$25, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass25 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUserUINotifyEvent> {
        public AnonymousClass25(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1025439562;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.SnsUserUINotifyEvent snsUserUINotifyEvent) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$25");
            final com.tencent.mm.autogen.events.SnsUserUINotifyEvent snsUserUINotifyEvent2 = snsUserUINotifyEvent;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$25");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "uiFeedNotifyListener >> type: %d id: %s", java.lang.Integer.valueOf(snsUserUINotifyEvent2.f54851g.f6876a), ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(snsUserUINotifyEvent2.f54851g.f6877b)));
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUserUI$25$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.sns.ui.SnsUserUI.AnonymousClass25 anonymousClass25 = com.tencent.mm.plugin.sns.ui.SnsUserUI.AnonymousClass25.this;
                    anonymousClass25.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$callback$0", "com.tencent.mm.plugin.sns.ui.SnsUserUI$25");
                    am.hx hxVar = snsUserUINotifyEvent2.f54851g;
                    int i17 = hxVar.f6876a;
                    boolean z17 = true;
                    com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = com.tencent.mm.plugin.sns.ui.SnsUserUI.this;
                    if (i17 == 2) {
                        com.tencent.mm.plugin.sns.ui.so T6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI);
                        java.lang.String str = hxVar.f6877b;
                        T6.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                        com.tencent.mm.plugin.sns.ui.vo voVar = T6.G;
                        if (voVar != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                            com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
                            if (b17 == null || b17.getTimeLine().ContentObj == null || voVar.f170699d.size() <= 0) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                            } else {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= voVar.f170699d.size()) {
                                        z17 = false;
                                        break;
                                    } else {
                                        if (((com.tencent.mm.plugin.sns.storage.SnsInfo) voVar.f170699d.get(i18)).getSnsId().equals(b17.getSnsId())) {
                                            voVar.f170699d.remove(i18);
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                                if (z17) {
                                    voVar.f170699d.add(b17);
                                    voVar.f();
                                    voVar.e();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                                } else {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                                }
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    } else if (i17 == 3) {
                        com.tencent.mm.plugin.sns.ui.so T62 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI);
                        java.lang.String str2 = hxVar.f6877b;
                        T62.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeItemBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                        com.tencent.mm.plugin.sns.ui.vo voVar2 = T62.G;
                        if (voVar2 != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeItemBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                            int size = voVar2.f170699d.size();
                            int i19 = 1;
                            while (true) {
                                if (i19 >= size) {
                                    z17 = false;
                                    break;
                                }
                                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) voVar2.f170699d.get(i19);
                                if (snsInfo != null && snsInfo.getSnsId().equals(str2)) {
                                    voVar2.f170699d.remove(i19);
                                    break;
                                }
                                i19++;
                            }
                            if (z17) {
                                voVar2.f();
                                voVar2.e();
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItemBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItemBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$callback$0", "com.tencent.mm.plugin.sns.ui.SnsUserUI$25");
                }
            });
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$25");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$25");
            return false;
        }
    }

    public SnsUserUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.S = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsUserUI.23
            {
                this.__eventId = -1155728636;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
            
                if (r6 != 7) goto L19;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = "callback"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsUserUI$23"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    com.tencent.mm.autogen.events.MusicPlayerEvent r6 = (com.tencent.mm.autogen.events.MusicPlayerEvent) r6
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    boolean r2 = r6 instanceof com.tencent.mm.autogen.events.MusicPlayerEvent
                    if (r2 == 0) goto L54
                    am.jk r6 = r6.f54512g
                    int r6 = r6.f7036b
                    com.tencent.mm.plugin.sns.ui.SnsUserUI r2 = com.tencent.mm.plugin.sns.ui.SnsUserUI.this
                    if (r6 == 0) goto L4d
                    r3 = 1
                    if (r6 == r3) goto L4d
                    r3 = 2
                    if (r6 == r3) goto L4d
                    r3 = 3
                    if (r6 == r3) goto L4d
                    r3 = 4
                    if (r6 == r3) goto L28
                    r3 = 7
                    if (r6 == r3) goto L4d
                    goto L54
                L28:
                    java.lang.String r6 = "MicroMsg.SnsUserUI"
                    java.lang.String r3 = "musicPlayerListener error"
                    com.tencent.mars.xlog.Log.i(r6, r3)
                    com.tencent.mm.plugin.sns.ui.so r6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(r2)
                    r6.notifyDataSetChanged()
                    java.lang.String r6 = "access$2900"
                    java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsUserUI"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r2)
                    java.lang.String r3 = "processPlayError"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
                    il4.l r4 = il4.l.f292142a
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
                    goto L54
                L4d:
                    com.tencent.mm.plugin.sns.ui.so r6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(r2)
                    r6.notifyDataSetChanged()
                L54:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    r6 = 0
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUserUI.AnonymousClass23.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.T = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicCheckErrorEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsUserUI.24
            {
                this.__eventId = -1443570203;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicCheckErrorEvent musicCheckErrorEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$24");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$24");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "musicCheckErrorListener check error");
                if (musicCheckErrorEvent.f54511g.f6956a == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsUserUI", "musicCheckErrorListener, must has error.");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$24");
                } else {
                    int i17 = com.tencent.mm.plugin.sns.ui.SnsUserUI.V;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    com.tencent.mm.plugin.sns.ui.SnsUserUI.this.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    il4.l lVar = il4.l.f292142a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$24");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$24");
                return false;
            }
        };
        this.U = new com.tencent.mm.plugin.sns.ui.SnsUserUI.AnonymousClass25(a0Var);
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.so T6(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.so soVar = snsUserUI.f167595d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return soVar;
    }

    public static /* synthetic */ java.lang.String U6(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        java.lang.String str = snsUserUI.f167599h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return str;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.tt V6(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.tt ttVar = snsUserUI.f167607s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return ttVar;
    }

    public static void W6(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        snsUserUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoadingState", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "showLoadingState: ");
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = snsUserUI.f167597f;
        snsUIAction.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        if (snsUIAction.getSnsListView() != null) {
            snsUIAction.getSnsListView().setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUserUI.f167613y.setVisibility(0);
        snsUserUI.f167614z.setVisibility(8);
        snsUserUI.A.setVisibility(0);
        android.view.animation.Animation animation = snsUserUI.f167594J;
        animation.reset();
        snsUserUI.f167608t.startAnimation(animation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoadingState", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public static void X6(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        snsUserUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateYearTipTopMargin", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (snsUserUI.f167609u == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateYearTipTopMargin", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        } else {
            int dimensionPixelSize = com.tencent.mm.sdk.platformtools.d2.j(snsUserUI) ? snsUserUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay) : snsUserUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479622ax);
            android.view.ViewGroup.LayoutParams layoutParams = snsUserUI.f167609u.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : new android.widget.RelativeLayout.LayoutParams(-1, -2);
            int i18 = i17 + dimensionPixelSize;
            if (layoutParams2.topMargin == i18 && layoutParams == layoutParams2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateYearTipTopMargin", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            } else {
                layoutParams2.topMargin = i18;
                snsUserUI.f167609u.setLayoutParams(layoutParams2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateYearTipTopMargin", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public static /* synthetic */ boolean Y6(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        boolean z17 = snsUserUI.f167602n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return z17;
    }

    public static /* synthetic */ java.lang.String Z6(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        java.lang.String str = snsUserUI.K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return str;
    }

    public static void a7(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        snsUserUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFeedClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsInfo != null) {
            java.lang.String s07 = ca4.z0.s0(snsInfo.field_snsId);
            java.util.ArrayList arrayList = (java.util.ArrayList) s0Var.f164967t;
            if (!arrayList.contains(s07)) {
                arrayList.add(s07);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        snsUserUI.I.b(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFeedClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public static /* synthetic */ int b7(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        int i17 = snsUserUI.f167603o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return i17;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.model.d6 c7(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.model.d6 d6Var = snsUserUI.f167598g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return d6Var;
    }

    public static /* synthetic */ int d7(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        snsUserUI.F = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return i17;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUIAction e7(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = snsUserUI.f167597f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return snsUIAction;
    }

    public static /* synthetic */ boolean f7(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        boolean z17 = snsUserUI.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return z17;
    }

    @Override // p94.m0
    public void B4(java.lang.String str, java.lang.String str2, boolean z17, int i17, p94.d0 d0Var, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.model.l4.Tj().removeCallbacks(this.M);
        com.tencent.mm.plugin.sns.ui.so soVar = this.f167595d;
        if (soVar != null && soVar.M()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onOtherAddSize: isOnRecentErr=%b, recentErrType=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = this.f167597f;
            snsUIAction.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadingEnd", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            snsUIAction.f167496t = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadingEnd", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            if (z17 || i17 == 0 || d0Var.y() != 0) {
                h7();
                if (((d0Var instanceof com.tencent.mm.plugin.sns.model.n3) && d0Var.y() == 1) || d0Var.y() == 0) {
                    com.tencent.mm.plugin.sns.ui.so soVar2 = this.f167595d;
                    com.tencent.mm.plugin.sns.model.n3 n3Var = (com.tencent.mm.plugin.sns.model.n3) d0Var;
                    n3Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPrePageDayEndFlagFeedId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
                    long j17 = n3Var.f164503r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPrePageDayEndFlagFeedId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
                    soVar2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePrePageDayEndFlagFeedId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    soVar2.E = j17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePrePageDayEndFlagFeedId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                }
                com.tencent.mm.plugin.sns.ui.so soVar3 = this.f167595d;
                boolean q17 = d0Var.q();
                soVar3.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                soVar3.D = q17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                this.f167595d.O("");
                d0Var.h();
                d0Var.E();
                if (d0Var.h()) {
                    this.f167597f.n(d0Var.m());
                } else if (d0Var.E()) {
                    com.tencent.mm.plugin.sns.ui.so soVar4 = this.f167595d;
                    soVar4.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUpAll", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    soVar4.K = true;
                    if (soVar4.f170478J) {
                        com.tencent.mm.plugin.sns.ui.xo xoVar = soVar4.H;
                        xoVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAddSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        xoVar.f171578h = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAddSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUpAll", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    this.f167597f.p(false);
                }
            } else {
                i7();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01bc, code lost:
    
        if (r9 != false) goto L45;
     */
    @Override // p94.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O0(java.lang.String r23, boolean r24, int r25, p94.d0 r26) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUserUI.O0(java.lang.String, boolean, int, p94.d0):void");
    }

    @Override // p94.m0
    public void S0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onNpAddSize: ");
        com.tencent.mm.plugin.sns.model.l4.Tj().removeCallbacks(this.M);
        if (this.f167595d.M()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "skip data callback, because this is search mode now.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            return;
        }
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = this.f167597f;
        snsUIAction.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadingEnd", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction.f167496t = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadingEnd", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.so soVar = this.f167595d;
        if (soVar != null) {
            boolean q17 = d0Var.q();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            soVar.D = q17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            com.tencent.mm.plugin.sns.ui.so soVar2 = this.f167595d;
            soVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            soVar2.C = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            java.lang.String L = this.f167595d.L();
            if (str.compareTo(L) < 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onNpAddSize addsize %s %s", str, L);
                this.f167595d.K();
            } else if (str.compareTo(L) > 0) {
                com.tencent.mm.plugin.sns.model.d6 d6Var = this.f167598g;
                ((com.tencent.mm.plugin.sns.ui.iv) this.f167607s).a();
                d6Var.f(2, this.f167599h, this.f167601m, this.f167602n, this.f167603o);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onNpAddSize addsize passed %s %s", str, L);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onNpAddSize else passed %s %s", str, L);
            }
            this.f167595d.O("");
        }
        if (!z17 || this.f167600i.equals(this.f167599h)) {
            if (this.f167600i.equals(this.f167599h) && d0Var.f() != 0) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, java.lang.Long.valueOf(d0Var.f()));
                com.tencent.mm.plugin.sns.ui.so soVar3 = this.f167595d;
                long f17 = d0Var.f();
                soVar3.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                if (0 != soVar3.I) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                } else {
                    soVar3.I = f17;
                    soVar3.f405465q = 0L;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                }
            }
            this.f167597f.f167495s = d0Var.h();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onNpAddSize: isDownAll=[%b]", java.lang.Boolean.valueOf(d0Var.h()));
            if (d0Var.h()) {
                this.f167597f.n(d0Var.m());
            } else {
                com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction2 = this.f167597f;
                snsUIAction2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onIsLoading", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mm.plugin.sns.ui.LoadingMoreView loadingMoreView = snsUIAction2.f167491o;
                loadingMoreView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoading", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
                loadingMoreView.f166326f.setVisibility(0);
                loadingMoreView.f166327g.setVisibility(8);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoading", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onIsLoading", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            }
        } else {
            com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction3 = this.f167597f;
            snsUIAction3.f167495s = true;
            java.lang.String m17 = d0Var.m();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onIsRecent", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            snsUIAction3.f167491o.b(i17, m17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onIsRecent", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    @Override // p94.m0
    public void e6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public boolean g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowTogether", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (com.tencent.mm.sdk.platformtools.o4.L().getBoolean("ShowWithTaEntrance_" + this.f167599h, false)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTogetherHistoryEntrance", "com.tencent.mm.plugin.sns.model.SnsConfig");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTogetherHistoryEntrance", "com.tencent.mm.plugin.sns.model.SnsConfig");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowTogether", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        int i17 = pc4.d.f353410a.y() ? com.tencent.mm.R.layout.epe : com.tencent.mm.R.layout.ctg;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return i17;
    }

    public final void h7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showListView", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "showListView: ");
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = this.f167597f;
        snsUIAction.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        if (snsUIAction.getSnsListView() != null) {
            snsUIAction.getSnsListView().setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f167613y.setVisibility(8);
        this.f167614z.setVisibility(8);
        this.A.setVisibility(8);
        this.f167594J.cancel();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showListView", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public final void i7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showNetworkState", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "showNetworkState: ");
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = this.f167597f;
        snsUIAction.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        if (snsUIAction.getSnsListView() != null) {
            snsUIAction.getSnsListView().setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f167613y.setVisibility(0);
        this.f167614z.setVisibility(0);
        this.A.setVisibility(8);
        this.f167594J.cancel();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showNetworkState", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        this.f167609u = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.nct);
        this.f167610v = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.ncs);
        this.f167611w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ncr);
        this.f167612x = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ncj);
        this.B = findViewById(com.tencent.mm.R.id.nci);
        this.f167613y = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.nco);
        this.f167614z = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.ncl);
        this.A = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.nck);
        this.f167608t = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ncm);
        this.f167612x.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_arrow, getContext().getResources().getColor(com.tencent.mm.R.color.t_)));
        this.f167614z.setOnClickListener(new com.tencent.mm.plugin.sns.ui.lv(this));
        this.f167609u.post(new com.tencent.mm.plugin.sns.ui.mv(this));
        com.tencent.mm.plugin.sns.ui.so soVar = new com.tencent.mm.plugin.sns.ui.so(this.f167596e, this, new com.tencent.mm.plugin.sns.ui.ru(this), this.f167599h, new com.tencent.mm.plugin.sns.ui.su(this));
        this.f167595d = soVar;
        this.f167597f.f167483d.setAdapter((android.widget.ListAdapter) soVar);
        this.f167597f.f167483d.setOnItemClickListener(new com.tencent.mm.plugin.sns.ui.tu(this));
        this.f167597f.f167483d.postDelayed(new com.tencent.mm.plugin.sns.ui.uu(this), 500L);
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.R;
        setBackBtn(onMenuItemClickListener, com.tencent.mm.R.raw.actionbar_icon_dark_back);
        android.view.animation.Animation animation = this.f167594J;
        animation.setDuration(1000L);
        animation.setRepeatCount(-1);
        animation.setInterpolator(new android.view.animation.LinearInterpolator());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeActionBar", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        g7();
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.f164951g = cm.e.HIDE_ENTRANCE;
        if (this.f167602n) {
            addIconOptionMenu(0, getString(com.tencent.mm.R.string.jcp), com.tencent.mm.R.raw.icons_filled_comment, new com.tencent.mm.plugin.sns.ui.xu(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        setBackBtn(onMenuItemClickListener, com.tencent.mm.R.raw.actionbar_icon_dark_back);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initMMTitle", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (this.f167602n) {
            setMMTitle(com.tencent.mm.R.string.jh_);
        } else {
            java.lang.String str = this.f167597f.f167487h;
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) com.tencent.mm.plugin.sns.model.l4.pj()).n(this.f167599h, true);
            setMMTitle(ca4.z0.v0(n17 != null ? n17.g2() : this.f167597f.f167487h));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initMMTitle", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeActionBar", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "on activity result, %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (5985 == i17 && i18 == -1) {
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        } else {
            super.onActivityResult(i17, i18, intent);
            this.f167597f.k(i17, i18, intent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = this.f167597f;
        snsUIAction.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = snsUIAction.f167492p;
        boolean z17 = false;
        if (snsHeader != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout = snsHeader.f167165d.f168192i;
            if (snsCoverContainerLayout == null || snsCoverContainerLayout.getStatus().f434167a) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            } else {
                snsHeader.f167180v.h();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                z17 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        }
        if (!z17) {
            finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0249, code lost:
    
        if ((((u41.j) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).wi()).z0(r27.f167599h) & 2) > 0) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0456  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUserUI.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a5  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUserUI.onDestroy():void");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onDrag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        super.onDrag();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        kj.m mVar;
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout;
        com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSUserScrollEnable(), this.f167605q);
        this.f167605q = 0;
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = this.f167597f;
        snsUIAction.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent();
        pauseAutoGetBigImgEvent.f54607g.f6172a = false;
        pauseAutoGetBigImgEvent.b(android.os.Looper.getMainLooper());
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = snsUIAction.f167492p;
        if (snsHeader != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.ui.dj djVar = snsHeader.f167165d;
            if (djVar != null && (snsStoryHeaderView = djVar.f168188e) != null && !snsHeader.f167179u) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                snsStoryHeaderView.f170662i = false;
                snsStoryHeaderView.f170661h = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            }
            com.tencent.mm.plugin.sns.ui.dj djVar2 = snsHeader.f167165d;
            if (djVar2 != null && (snsCoverContainerLayout = djVar2.f168192i) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverContainerLayout", "[" + snsCoverContainerLayout.hashCode() + "] onPause");
                com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = snsCoverContainerLayout.f163999e;
                if (absSnsBackPreview != null) {
                    absSnsBackPreview.onPause();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOnPause", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            snsUIAction.g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOnPause", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        super.onPause();
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f232817n) != null) {
            this.N = java.lang.Math.max(0L, ((int) mVar.f308243e) - this.N);
        }
        this.P = com.tencent.mm.sdk.platformtools.t8.i1() > this.P ? com.tencent.mm.sdk.platformtools.t8.i1() - this.P : 1L;
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().reportFPS(704, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSUserScrollAction(), 1, this.N, this.P);
        this.N = 0L;
        this.P = 0L;
        this.S.dead();
        this.T.dead();
        this.I.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 18) {
            if (iArr[0] == 0) {
                this.L.b();
            } else {
                int i18 = "android.permission.CAMERA".equals(strArr[0]) ? com.tencent.mm.R.string.hh8 : com.tencent.mm.R.string.hhn;
                if (iArr[0] != 0) {
                    db5.e1.C(this, getString(i18), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.sns.ui.dv(this), new com.tencent.mm.plugin.sns.ui.ev(this));
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout;
        com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView;
        kj.m mVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        this.P = com.tencent.mm.sdk.platformtools.t8.i1();
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f232817n) != null) {
            this.N = (int) mVar.f308243e;
        }
        com.tencent.mm.plugin.sns.ui.so soVar = this.f167595d;
        if (soVar != null) {
            soVar.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = this.f167597f;
        snsUIAction.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.model.l4.Cj().z(2, false);
        h45.g0.f278945a = 7;
        com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent();
        pauseAutoGetBigImgEvent.f54607g.f6172a = true;
        pauseAutoGetBigImgEvent.b(android.os.Looper.getMainLooper());
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = snsUIAction.f167492p;
        if (snsHeader != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.ui.dj djVar = snsHeader.f167165d;
            if (djVar != null && (snsStoryHeaderView = djVar.f168188e) != null && !snsHeader.f167179u) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsStoryHeaderView", "resume: ");
                snsStoryHeaderView.f170661h = false;
                ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
                kf4.o oVar = kf4.o.f307484d;
                pm0.v.L("ContactSyncFetcher_checkContactState", true, kf4.b.f307471d);
                snsStoryHeaderView.post(new yd4.b(snsStoryHeaderView));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            }
            com.tencent.mm.plugin.sns.ui.dj djVar2 = snsHeader.f167165d;
            if (djVar2 != null && (snsCoverContainerLayout = djVar2.f168192i) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverContainerLayout", "[" + snsCoverContainerLayout.hashCode() + "] onResume");
                com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = snsCoverContainerLayout.f163999e;
                if (absSnsBackPreview != null) {
                    absSnsBackPreview.onResume();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOnResume", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            snsUIAction.g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOnResume", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f167597f.j();
        this.S.alive();
        this.T.alive();
        this.I.d();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        super.onResume();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        super.onStart();
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("albumPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        s0Var.f164972y = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("albumPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        super.onStop();
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("albumPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (s0Var.f164972y != 0) {
            s0Var.f164973z += java.lang.System.currentTimeMillis() - s0Var.f164972y;
            s0Var.f164972y = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("albumPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setActionbarColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActionbarColor", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        super.setActionbarColor(i17);
        android.view.View view = this.Q;
        if (view != null) {
            view.setBackgroundColor(getStatusBarColor());
            vj5.o.e(getWindow());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionbarColor", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("superImportUIComponents", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        super.superImportUIComponents(hashSet);
        hashSet.add(o34.i.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("superImportUIComponents", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean supportNavigationSwipeBack() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        boolean supportNavigationSwipeBack = super.supportNavigationSwipeBack();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return supportNavigationSwipeBack;
    }
}
