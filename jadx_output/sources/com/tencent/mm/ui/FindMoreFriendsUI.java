package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class FindMoreFriendsUI extends com.tencent.mm.ui.AbstractTabChildPreference implements l75.q0, l75.z0, c01.x8, c01.y8 {
    public static final java.util.List R1 = java.util.Arrays.asList("jd_market_entrance", "find_friends_by_finder", "find_friends_by_finder_live", "find_friends_by_ting", "find_friends_by_ting_play_state", "find_friends_by_finder_live_above_look", "find_friends_by_look", "find_friends_by_near_v3", "find_live_friends_by_near", "find_friends_by_shake", "more_tab_game_recommend");
    public final com.tencent.mm.sdk.event.IListener A1;
    public final com.tencent.mm.sdk.event.IListener B1;
    public final k70.f0 C1;
    public long D1;
    public boolean E1;
    public boolean F1;
    public rg5.x G1;
    public rg5.r H1;
    public androidx.lifecycle.k0 I1;
    public androidx.lifecycle.k0 J1;
    public androidx.lifecycle.k0 K1;
    public boolean L1;
    public rg5.o M1;
    public int N;
    public final java.lang.String N1;
    public final java.util.Random O1;
    public long P;
    public boolean P1;
    public int Q;
    public boolean Q1;
    public long R;
    public int S;
    public android.view.View T;
    public final com.tencent.mm.sdk.event.IListener V;
    public final l75.q0 W;
    public final com.tencent.mm.sdk.event.IListener X;
    public final com.tencent.mm.sdk.event.IListener Y;
    public final com.tencent.mm.sdk.event.IListener Z;

    /* renamed from: l1, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f196649l1;

    /* renamed from: p0, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.event.IListenerMStorage f196650p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f196651p1;

    /* renamed from: s, reason: collision with root package name */
    public long f196652s;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.h0 f196656w;

    /* renamed from: x0, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.event.IListenerMStorage f196658x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.ui.e6 f196659x1;

    /* renamed from: y0, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.event.IListenerMStorage f196661y0;

    /* renamed from: y1, reason: collision with root package name */
    public final vg3.d4 f196662y1;

    /* renamed from: z1, reason: collision with root package name */
    public final bm5.p1 f196664z1;

    /* renamed from: t, reason: collision with root package name */
    public final tm0.e f196653t = new tm0.e();

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.ui.k6 f196654u = new com.tencent.mm.ui.k6(this);

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.ui.g6 f196655v = new com.tencent.mm.ui.g6(this);

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f196657x = "";

    /* renamed from: y, reason: collision with root package name */
    public int f196660y = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f196663z = null;
    public java.lang.String A = null;
    public java.lang.String B = null;
    public java.lang.String C = null;
    public boolean D = false;
    public boolean E = true;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public int f196648J = 0;
    public long K = 0;
    public boolean L = false;
    public android.widget.AbsListView.OnScrollListener M = null;
    public final com.tencent.mm.sdk.platformtools.n3 U = new com.tencent.mm.ui.y4(this, android.os.Looper.getMainLooper());

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$17, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass17 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebSearchConfigEvent> {
        public AnonymousClass17(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1764466964;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WebSearchConfigEvent webSearchConfigEvent) {
            com.tencent.mm.ui.FindMoreFriendsUI.this.getContentView().post(new com.tencent.mm.ui.w4(this));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$4, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass4 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusNotifyFunctionEvent> {
        public AnonymousClass4(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1510396759;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.StatusNotifyFunctionEvent statusNotifyFunctionEvent) {
            com.tencent.mm.autogen.events.StatusNotifyFunctionEvent statusNotifyFunctionEvent2 = statusNotifyFunctionEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "mark sns read %d", java.lang.Integer.valueOf(statusNotifyFunctionEvent2.f54869g.f8612a));
            if (statusNotifyFunctionEvent2.f54869g.f8612a != 9) {
                return true;
            }
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.ui.v5(this));
            return true;
        }
    }

    public FindMoreFriendsUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.V = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent>(a0Var) { // from class: com.tencent.mm.ui.FindMoreFriendsUI.2
            {
                this.__eventId = 1507664325;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent searchSysMsgNotifyEvent) {
                java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
                com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = com.tencent.mm.ui.FindMoreFriendsUI.this;
                findMoreFriendsUI.z1();
                findMoreFriendsUI.A0();
                return false;
            }
        };
        this.W = new com.tencent.mm.ui.u5(this);
        this.X = new com.tencent.mm.ui.FindMoreFriendsUI.AnonymousClass4(a0Var);
        this.Y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.JDSysMsgNotifyEvent>(a0Var) { // from class: com.tencent.mm.ui.FindMoreFriendsUI.5
            {
                this.__eventId = 1450669203;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.JDSysMsgNotifyEvent jDSysMsgNotifyEvent) {
                k35.q a17 = k35.r.a();
                com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = com.tencent.mm.ui.FindMoreFriendsUI.this;
                if (a17 != null) {
                    java.lang.String str = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Vi().f172129a;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        str = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ui();
                    }
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.String str2 = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi().f172133b;
                    java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
                    g0Var.d(11178, str, str2, java.lang.Integer.valueOf(findMoreFriendsUI.H0()));
                }
                java.util.List list2 = com.tencent.mm.ui.FindMoreFriendsUI.R1;
                findMoreFriendsUI.B1(true);
                findMoreFriendsUI.f196656w.notifyDataSetChanged();
                return true;
            }
        };
        this.Z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent>(a0Var, 1) { // from class: com.tencent.mm.ui.FindMoreFriendsUI.6
            {
                this.__eventId = -443124368;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "dynamic config file change");
                com.tencent.mm.ui.FindMoreFriendsUI.this.U.sendEmptyMessage(1);
                return true;
            }
        };
        this.f196650p0 = new com.tencent.mm.pluginsdk.event.IListenerMStorage() { // from class: com.tencent.mm.ui.FindMoreFriendsUI.7
            @Override // com.tencent.mm.pluginsdk.event.IListenerMStorage
            public void c(com.tencent.mm.sdk.event.IEvent iEvent) {
                if (iEvent instanceof com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent) {
                    com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = com.tencent.mm.ui.FindMoreFriendsUI.this;
                    if (findMoreFriendsUI.f196655v.a()) {
                        return;
                    }
                    com.tencent.mm.ui.FindMoreFriendsUI.w0(findMoreFriendsUI, true, false);
                    findMoreFriendsUI.f196656w.notifyDataSetChanged();
                }
            }
        };
        this.f196658x0 = new com.tencent.mm.pluginsdk.event.IListenerMStorage() { // from class: com.tencent.mm.ui.FindMoreFriendsUI.8
            @Override // com.tencent.mm.pluginsdk.event.IListenerMStorage
            public void c(com.tencent.mm.sdk.event.IEvent iEvent) {
                if (iEvent instanceof com.tencent.mm.autogen.events.GameLifeStorageNotifyEvent) {
                    com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = com.tencent.mm.ui.FindMoreFriendsUI.this;
                    if (findMoreFriendsUI.f196655v.b()) {
                        return;
                    }
                    com.tencent.mm.ui.FindMoreFriendsUI.w0(findMoreFriendsUI, true, true);
                    findMoreFriendsUI.f196656w.notifyDataSetChanged();
                }
            }
        };
        this.f196661y0 = new com.tencent.mm.pluginsdk.event.IListenerMStorage() { // from class: com.tencent.mm.ui.FindMoreFriendsUI.9
            @Override // com.tencent.mm.pluginsdk.event.IListenerMStorage
            public void c(com.tencent.mm.sdk.event.IEvent iEvent) {
                if (iEvent instanceof com.tencent.mm.autogen.events.ShakeMessageStorageNotifyEvent) {
                    java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
                    com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = com.tencent.mm.ui.FindMoreFriendsUI.this;
                    findMoreFriendsUI.A1();
                    findMoreFriendsUI.f196656w.notifyDataSetChanged();
                }
            }
        };
        this.f196649l1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShakeCardMsgNotifyEvent>(a0Var) { // from class: com.tencent.mm.ui.FindMoreFriendsUI.10
            {
                this.__eventId = -994942154;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ShakeCardMsgNotifyEvent shakeCardMsgNotifyEvent) {
                if (!(shakeCardMsgNotifyEvent instanceof com.tencent.mm.autogen.events.ShakeCardMsgNotifyEvent)) {
                    return false;
                }
                java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
                com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = com.tencent.mm.ui.FindMoreFriendsUI.this;
                findMoreFriendsUI.A1();
                findMoreFriendsUI.f196656w.notifyDataSetChanged();
                return false;
            }
        };
        this.f196659x1 = com.tencent.mm.ui.e6.TYPE_NONE;
        this.f196662y1 = new com.tencent.mm.ui.r4(this);
        this.f196664z1 = new com.tencent.mm.ui.t4(this);
        this.A1 = new com.tencent.mm.ui.FindMoreFriendsUI.AnonymousClass17(a0Var);
        this.B1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetEntranceStateEvent>(a0Var) { // from class: com.tencent.mm.ui.FindMoreFriendsUI.18
            {
                this.__eventId = -1188553307;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetEntranceStateEvent getEntranceStateEvent) {
                getEntranceStateEvent.f54392g.f8003a = com.tencent.mm.ui.FindMoreFriendsUI.this.F;
                return false;
            }
        };
        this.C1 = new com.tencent.mm.ui.d5(this);
        this.D1 = 0L;
        this.E1 = false;
        this.F1 = false;
        this.G1 = null;
        this.H1 = null;
        this.I1 = null;
        this.J1 = null;
        this.K1 = null;
        this.L1 = false;
        this.M1 = null;
        this.N1 = "find_friends_by_finder";
        this.O1 = new java.util.Random();
        this.P1 = false;
        this.Q1 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w0(com.tencent.mm.ui.FindMoreFriendsUI r4, boolean r5, boolean r6) {
        /*
            r4.getClass()
            if (r6 == 0) goto L1b
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.K
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L19
            long r0 = java.lang.System.currentTimeMillis()
            r4.K = r0
            goto L1b
        L19:
            r6 = 0
            goto L1c
        L1b:
            r6 = 1
        L1c:
            if (r6 == 0) goto L28
            r4.w1()
            if (r5 == 0) goto L28
            com.tencent.mm.ui.base.preference.h0 r4 = r4.f196656w
            r4.notifyDataSetChanged()
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.FindMoreFriendsUI.w0(com.tencent.mm.ui.FindMoreFriendsUI, boolean, boolean):void");
    }

    public final void A0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility");
        if (!this.f197768h || !isAdded()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility preference not add");
            return;
        }
        try {
            if (com.tencent.mm.sdk.platformtools.f9.DiscoveryChannels.h()) {
                this.f196656w.m("find_friends_by_finder", true);
            }
            if (com.tencent.mm.sdk.platformtools.f9.DiscoveryChannelsLive.h() && com.tencent.mm.sdk.platformtools.a0.c()) {
                this.f196656w.m("find_friends_by_finder_live", true);
            }
            if (!U0()) {
                this.f196656w.m("find_friends_by_look", true);
                if (Q0()) {
                    return;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(953L, 3L, 1L);
                return;
            }
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            java.lang.String optString = su4.o2.d("discoverRecommendEntry").optString("wording");
            com.tencent.mm.ui.TopStoryIconViewTipPreference topStoryIconViewTipPreference = (com.tencent.mm.ui.TopStoryIconViewTipPreference) this.f196656w.h("find_friends_by_look");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                topStoryIconViewTipPreference.L(getString(com.tencent.mm.R.string.cfz));
            } else {
                topStoryIconViewTipPreference.L(optString);
            }
            topStoryIconViewTipPreference.n0(this.f196656w);
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(topStoryIconViewTipPreference);
            k70.f0 f0Var = this.C1;
            com.tencent.mm.ui.q4 q4Var = new com.tencent.mm.ui.q4(this);
            topStoryIconViewTipPreference.f152360d2 = f0Var;
            topStoryIconViewTipPreference.f152361e2 = q4Var;
            topStoryIconViewTipPreference.h0();
            this.S++;
            this.f196656w.m("find_friends_by_look", false);
            this.f196654u.c(topStoryIconViewTipPreference);
            wm4.p pVar = (wm4.p) ((wm4.o) i95.n0.c(wm4.o.class));
            pVar.getClass();
            com.tencent.mm.sdk.platformtools.u3.i(new wm4.r(pVar), 5000L);
            ((wm4.p) ((wm4.o) i95.n0.c(wm4.o.class))).Ai();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.FindMoreFriendsUI", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public final void A1() {
        boolean z17;
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) this.f196656w.h("find_friends_by_shake");
        if (iconPreference == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FindMoreFriendsUI", "updateShakeEntry prefShake null and return");
            return;
        }
        boolean z18 = true;
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FindMoreFriendsUI", "updateShakeEntry enable ting and hide shake");
            this.f196656w.m("find_friends_by_shake", true);
            return;
        }
        if (!((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Bi()) {
            this.f196656w.m("find_friends_by_shake", true);
            return;
        }
        boolean z19 = (this.Q & 256) == 0;
        j45.l.g("shake");
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "openShake %s, plugin installed %s, isTeenMode:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(isTeenMode));
        if (!z19 || isTeenMode) {
            this.f196656w.m("find_friends_by_shake", true);
            if (Q0()) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(953L, 2L, 1L);
            return;
        }
        this.S++;
        this.f196656w.m("find_friends_by_shake", false);
        int f17 = r21.w.Di().f() + o25.u1.a().getShakeMessageUnreadCnt();
        if (f17 > 0) {
            iconPreference.a0(0);
            int b17 = com.tencent.mm.ui.tools.pd.b(getContext(), f17);
            iconPreference.V = "" + f17;
            iconPreference.W = b17;
        } else {
            iconPreference.a0(8);
            iconPreference.V = "";
            iconPreference.W = -1;
        }
        iconPreference.T(8);
        o25.u1.a().checkShakeCardEntrance();
        if (o25.u1.a().isShakeCardEntranceOpen()) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            z17 = bk0.a.g().b(262154, 266258);
        } else {
            z17 = false;
        }
        if (z17) {
            java.lang.String str = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, "");
            if (!android.text.TextUtils.isEmpty(str)) {
                iconPreference.c0(8);
                iconPreference.a0(0);
                iconPreference.V = "" + str;
                iconPreference.W = com.tencent.mm.R.drawable.b8d;
            } else if (f17 > 0) {
                iconPreference.c0(0);
            } else {
                iconPreference.c0(0);
                iconPreference.a0(8);
                iconPreference.V = "";
                iconPreference.W = -1;
            }
        } else {
            iconPreference.c0(8);
        }
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, null);
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.m1((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN, null), false));
        int intValue = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IBEACON_SHAKE_TAB_DISPLAY_INT, 0)).intValue();
        if (!valueOf.booleanValue() || str2.equals("") || f17 > 0 || z17) {
            iconPreference.b0(8);
        } else if (intValue == 0) {
            iconPreference.c0(8);
            iconPreference.b0(0);
            java.lang.String[] split = str2.split(",");
            if (split.length > 0) {
                iconPreference.d0(split[0], -1, android.graphics.Color.parseColor("#8c8c8c"));
            }
            iconPreference.e0(true);
            iconPreference.Y(8);
        } else if (intValue == 1) {
            iconPreference.b0(8);
            iconPreference.a0(0);
            iconPreference.S1 = true;
        }
        if (f17 <= 0 && !z17) {
            z18 = false;
        }
        b1("find_friends_by_shake", z18);
    }

    @Override // com.tencent.mm.ui.y7
    public void B() {
        tm0.e eVar = this.f196653t;
        eVar.b();
        eVar.f420460f = false;
        eVar.a().notify(kz5.b0.c(new tm0.a(tm0.b.f420451g, eVar)));
        eVar.c(false);
        this.F = false;
        this.P1 = false;
        this.Q1 = false;
        this.H = false;
        this.L = false;
        su4.g3.f412902d.f412905c = null;
        wg0.a aVar = (wg0.a) ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).aj();
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchRedDotReporter", "resetAllExpose");
        ((java.util.concurrent.ConcurrentHashMap) aVar.f445708a).clear();
        ((java.util.concurrent.ConcurrentHashMap) aVar.f445709b).clear();
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        ((java.util.concurrent.ConcurrentHashMap) em4.c.f255214b).clear();
        ((pg3.v) ((n40.n) i95.n0.c(n40.n.class))).wi(true);
        p1();
        g1();
    }

    public final void B0(final com.tencent.mm.ui.websearch.WebSearchTipPreference webSearchTipPreference, java.lang.String str, final boolean z17, final com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, final r45.f03 f03Var, final boolean z18, final com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2, final r45.f03 f03Var2) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.ui.FindMoreFriendsUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                boolean z19;
                java.lang.String str2;
                r45.f03 f03Var3;
                r45.f03 f03Var4 = f03Var2;
                java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
                com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = com.tencent.mm.ui.FindMoreFriendsUI.this;
                findMoreFriendsUI.getClass();
                com.tencent.mm.ui.websearch.WebSearchTipPreference webSearchTipPreference2 = webSearchTipPreference;
                if (webSearchTipPreference2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FindMoreFriendsUI", "controlWebSearchRedDot, preference is null.");
                    return;
                }
                boolean z27 = true;
                if (!((webSearchTipPreference2.W2 == null || webSearchTipPreference2.X2 == null || webSearchTipPreference2.Y2 == null) ? false : true)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FindMoreFriendsUI", "controlWebSearchRedDot, preference hasn't bound view.");
                    return;
                }
                findMoreFriendsUI.b1("find_friends_by_search", false);
                ((wd0.s1) i95.n0.c(wd0.s1.class)).getClass();
                if (!z18 || f03Var4 == null) {
                    z19 = false;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "controlWebSearchRedDot, showing mentionEntrance, counter: " + f03Var4.f373888e);
                    r45.pm6 pm6Var = new r45.pm6();
                    pm6Var.f383186d = f03Var4.f373888e;
                    webSearchTipPreference2.Z3(true, pm6Var);
                    ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).hj("Search.MentionEntrance", true);
                    if (com.tencent.mm.ui.LauncherUI.getCurrentTabIndex() == 2 && findMoreFriendsUI.F) {
                        ((wg0.a) ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).aj()).b(jbVar2, f03Var4);
                    }
                    z19 = true;
                }
                if (!z17 || (f03Var3 = f03Var) == null) {
                    str2 = "Search.Entrance";
                    z27 = z19;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "controlWebSearchRedDot, showing entrance.");
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 = jbVar;
                    str2 = "Search.Entrance";
                    findMoreFriendsUI.z0(f03Var3, webSearchTipPreference2, false, true, jbVar3 != null && jbVar3.N.getInteger(19) == 1, f03Var4);
                    ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).hj(str2, true);
                    if (com.tencent.mm.ui.LauncherUI.getCurrentTabIndex() == 2 && findMoreFriendsUI.F) {
                        ((wg0.a) ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).aj()).b(jbVar3, f03Var3);
                    }
                }
                findMoreFriendsUI.b1("find_friends_by_search", z27);
                if (z27) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "controlWebSearchRedDot, no valid red-dot, hide it.");
                webSearchTipPreference2.Z3(false, new r45.pm6());
                webSearchTipPreference2.y(false);
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).hj(str2, false);
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).hj("Search.MentionEntrance", false);
            }
        };
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            runnable.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        }
    }

    public final void B1(boolean z17) {
        boolean P0 = P0(4194304L);
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        boolean z18 = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "openShoppingEntry %s, isTeenMode:%s", java.lang.Boolean.valueOf(!P0), java.lang.Boolean.valueOf(isTeenMode));
        if (P0 || isTeenMode) {
            this.f196656w.m("jd_market_entrance", true);
            if (Q0()) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(953L, 7L, 1L);
            return;
        }
        if (k35.r.a() != null) {
            if (com.tencent.mm.plugin.subapp.jdbiz.q.Di().aj()) {
                this.S++;
                com.tencent.mm.plugin.subapp.jdbiz.o Zi = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi();
                com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) this.f196656w.h("jd_market_entrance");
                normalIconNewTipPreference.L(com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ri());
                normalIconNewTipPreference.n0(this.f196656w);
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().k(normalIconNewTipPreference);
                k70.f0 f0Var = this.C1;
                com.tencent.mm.ui.e5 e5Var = new com.tencent.mm.ui.e5(this);
                normalIconNewTipPreference.f152360d2 = f0Var;
                normalIconNewTipPreference.f152361e2 = e5Var;
                normalIconNewTipPreference.h0();
                boolean z19 = com.tencent.mm.plugin.subapp.jdbiz.q.Di().bj() && Zi.e() && !Zi.d();
                ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).getClass();
                if (!((c01.z1.h() & 512) != 512)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "JudgeRedDot dont show reddot! ReddotService interrupt");
                    z19 = false;
                }
                if (!normalIconNewTipPreference.o0(z19 && !(com.tencent.mm.sdk.platformtools.t8.K0(Zi.f172138g) && com.tencent.mm.sdk.platformtools.t8.K0(Zi.f172139h) && !Zi.f172137f))) {
                    normalIconNewTipPreference.a0(8);
                    normalIconNewTipPreference.c0(8);
                    normalIconNewTipPreference.b0(8);
                    normalIconNewTipPreference.e0(false);
                    normalIconNewTipPreference.Y(8);
                    if (z19) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi.f172138g)) {
                            normalIconNewTipPreference.a0(8);
                            normalIconNewTipPreference.c0(8);
                            normalIconNewTipPreference.d0(Zi.f172138g, -1, -7566196);
                            normalIconNewTipPreference.b0(0);
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi.f172139h)) {
                            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(Zi.f172139h);
                            normalIconNewTipPreference.Y(0);
                            normalIconNewTipPreference.T(0);
                            normalIconNewTipPreference.V(0);
                            normalIconNewTipPreference.e0(false);
                            if (Bi != null) {
                                this.C = null;
                                normalIconNewTipPreference.R(Bi);
                            } else {
                                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(Zi.f172139h, f0Var);
                                this.C = Zi.f172139h;
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.K0(Zi.f172138g)) {
                                normalIconNewTipPreference.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON, true);
                            } else {
                                normalIconNewTipPreference.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON, true);
                            }
                        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi.f172138g)) {
                            normalIconNewTipPreference.e0(true);
                            normalIconNewTipPreference.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE, true);
                        } else if (Zi.f172137f) {
                            normalIconNewTipPreference.c0(0);
                            normalIconNewTipPreference.V = "";
                            normalIconNewTipPreference.W = -1;
                            normalIconNewTipPreference.a0(8);
                            normalIconNewTipPreference.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
                        } else {
                            normalIconNewTipPreference.h0();
                        }
                    } else {
                        normalIconNewTipPreference.h0();
                    }
                    b1("jd_market_entrance", z19);
                }
                if (z17) {
                    this.f196656w.notifyDataSetChanged();
                }
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_JD_ENTRANCE_RESET_EXPOSURE_FLAG_BOOLEAN_SYNC;
                boolean o17 = c17.o(u3Var, false);
                if (!Q0() || o17) {
                    java.lang.String str = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Vi().f172129a;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        str = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ui();
                    }
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.A(931, 12);
                    g0Var.d(11178, str, com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi().f172133b, java.lang.Integer.valueOf(H0()), 2);
                }
                this.f196656w.m("jd_market_entrance", z18);
            }
            java.lang.String Ri = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ri();
            java.lang.String Ni = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ni();
            if (!Q0() && com.tencent.mm.sdk.platformtools.m2.m()) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(Ri)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(931, 2);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(Ni)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(931, 4);
                }
            }
        }
        z18 = true;
        this.f196656w.m("jd_market_entrance", z18);
    }

    public void C0() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10958, "4");
        com.tencent.mm.ui.LauncherUI launcherUI = (com.tencent.mm.ui.LauncherUI) getContext();
        if (launcherUI != null) {
            launcherUI.f7().o("tab_find_friend");
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String Cj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(com.tencent.mm.ui.report.e0.b(), intent);
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.c(Cj, 0);
        m25.a.a(getContext(), intent);
    }

    public final void C1() {
        boolean z17;
        boolean z18 = (this.Q & 32768) == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "openSns %s, plugin installed %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.TRUE);
        if (!z18) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SNS_ENTRY_SWITCH_INT;
            if (c17.r(u3Var, 0) == 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FindMoreFriendsUI", "opened sns entry recently");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(150, 71);
            } else if (gm0.j1.u().c().r(u3Var, 0) == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "closed sns entry recently");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(150, 70);
            }
        }
        if (!z18) {
            this.f196656w.m("album_dyna_photo_ui_title", true);
            if (Q0()) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(953L, 0L, 1L);
            return;
        }
        this.S++;
        this.f196656w.m("album_dyna_photo_ui_title", false);
        com.tencent.mm.ui.FriendSnsPreference friendSnsPreference = (com.tencent.mm.ui.FriendSnsPreference) this.f196656w.h("album_dyna_photo_ui_title");
        friendSnsPreference.U = com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478184cx);
        boolean n17 = com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) c01.d9.b().p().l(48, null));
        friendSnsPreference.a0(8);
        friendSnsPreference.V(8);
        if (n17) {
            friendSnsPreference.a0(0);
            friendSnsPreference.V = getString(com.tencent.mm.R.string.f490501wv);
            friendSnsPreference.W = com.tencent.mm.R.drawable.asx;
        }
        java.lang.String str = (java.lang.String) c01.d9.b().p().l(68377, null);
        this.f196657x = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.ui.LauncherUI.getCurrentTabIndex() == 2 && c01.d9.b().p().q(68419, 0) == 0) {
            gm0.j1.i();
            com.tencent.mm.plugin.sns.statistics.t0.a(2, (java.lang.String) gm0.j1.u().c().l(68418, ""), this.f196660y);
            c01.d9.b().p().w(68419, 1);
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SNS_MEDIA_COLLAPSE_SNS_ID_LONG, null);
        long longValue = m17 == null ? 0L : ((java.lang.Long) m17).longValue();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str2 = this.f196657x;
        if (str2 == null) {
            str2 = "";
        }
        objArr[0] = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "newer snsobj %s", objArr);
        friendSnsPreference.Y(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f196657x)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableShowErrorIcon", "com.tencent.mm.plugin.sns.snstimeline.SnsPostActionFailedHandler");
            if (gm0.j1.b().m()) {
                java.lang.Object l17 = gm0.j1.u().c().l(589825, java.lang.Boolean.FALSE);
                kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
                z17 = ((java.lang.Boolean) l17).booleanValue() || wa4.p.f444274b;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsPostActionFailedHandler", "account hasInitialized, enableShowErrorIcon: show = [" + z17 + ']');
            } else {
                z17 = wa4.p.f444274b;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsPostActionFailedHandler", "enableShowErrorIcon: show = [" + z17 + ']');
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableShowErrorIcon", "com.tencent.mm.plugin.sns.snstimeline.SnsPostActionFailedHandler");
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: show right icon warning");
                friendSnsPreference.h0(null);
                friendSnsPreference.S(com.tencent.mm.R.raw.tipsbar_icon_warning);
                friendSnsPreference.T(0);
                friendSnsPreference.V(8);
            } else if (longValue == 0 || !((n34.v4) ((p94.s0) i95.n0.c(p94.s0.class))).wi(longValue)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: no right Image");
                friendSnsPreference.T(8);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: show RightProspect Collapsed");
                friendSnsPreference.T(0);
                friendSnsPreference.V(0);
                friendSnsPreference.Y1 = null;
                friendSnsPreference.Q = -1;
                friendSnsPreference.Z1 = longValue;
                if (longValue != 0 && friendSnsPreference.S != null) {
                    ((n34.v4) ((p94.s0) i95.n0.c(p94.s0.class))).Bi(friendSnsPreference.Z1, friendSnsPreference.S, friendSnsPreference.f197770d.hashCode());
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: show RightAvatar");
            friendSnsPreference.T(0);
            friendSnsPreference.V(((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).Di() ? 0 : 8);
            friendSnsPreference.h0(this.f196657x);
        }
        if (p94.w0.a() != null) {
            com.tencent.mm.plugin.sns.storage.w1 w1Var = (com.tencent.mm.plugin.sns.storage.w1) p94.w0.a();
            w1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            boolean z19 = w1Var.f166157e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            if (z19) {
                this.f196660y = 0;
            } else {
                this.f196660y = ((com.tencent.mm.plugin.sns.storage.w1) p94.w0.a()).L0();
            }
        }
        if (this.f196660y != 0) {
            friendSnsPreference.a0(0);
            java.lang.String str3 = this.f196660y + "";
            int b17 = com.tencent.mm.ui.tools.pd.b(getContext(), this.f196660y);
            friendSnsPreference.V = str3;
            friendSnsPreference.W = b17;
        }
        friendSnsPreference.c0(8);
        friendSnsPreference.b0(8);
        new com.tencent.mm.autogen.events.UnreadChangeEvent().e();
        b1("album_dyna_photo_ui_title", (com.tencent.mm.sdk.platformtools.t8.K0(this.f196657x) && this.f196660y == 0) ? false : true);
        boolean z27 = (com.tencent.mm.sdk.platformtools.t8.K0(this.f196657x) && this.f196660y == 0) ? false : true;
        gz2.c.f277729b = z27;
        zs.c.f475224b = z27;
        zs.c.f475229g = this.f196660y;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0d00  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0c79  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0b89  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1() {
        /*
            Method dump skipped, instructions count: 3387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.FindMoreFriendsUI.D1():void");
    }

    public final synchronized void F0(com.tencent.mm.autogen.events.QueryGameMessageEvent queryGameMessageEvent, com.tencent.mm.ui.GameIconViewTipPreference gameIconViewTipPreference, com.tencent.mm.autogen.events.QueryGameMessageEvent queryGameMessageEvent2, java.lang.String str, java.lang.String str2, boolean z17) {
        am.ep epVar = queryGameMessageEvent.f54637g;
        java.lang.String str3 = epVar.f6570d;
        int i17 = epVar.f6571e;
        int i18 = epVar.f6572f;
        boolean z18 = epVar.f6573g;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && gameIconViewTipPreference != null && gameIconViewTipPreference.S != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, download entrance image : %s, width: %d, height: %d", str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 <= 0 || i18 <= 0) {
                gameIconViewTipPreference.Z(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 32), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 32));
            } else {
                gameIconViewTipPreference.Z(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i17), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i18));
            }
            if (this.f196655v.b()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, skip download entrance image ");
                this.D = true;
                this.f196655v.c(queryGameMessageEvent);
                am.ep epVar2 = queryGameMessageEvent.f54637g;
                n1(epVar2.f6574h, epVar2.f6567a, str2, z17);
                return;
            }
            am.ep epVar3 = queryGameMessageEvent2.f54637g;
            long j17 = epVar3.f6574h;
            int i19 = epVar3.f6567a;
            com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent = new com.tencent.mm.autogen.events.GameMsgDownloadImgEvent();
            am.ue ueVar = gameMsgDownloadImgEvent.f54367g;
            ueVar.f8078a = 1;
            ueVar.f8079b = str3;
            gameMsgDownloadImgEvent.e();
            if (gameMsgDownloadImgEvent.f54368h.f8194b) {
                java.lang.String str4 = gameMsgDownloadImgEvent.f54368h.f8193a + kk.k.g(str3.getBytes());
                o11.f fVar = new o11.f();
                fVar.f342078b = true;
                fVar.f342082f = str4;
                n11.a.b().k(str3, null, fVar.a(), new com.tencent.mm.ui.o5(this, gameMsgDownloadImgEvent), new com.tencent.mm.ui.s5(this, queryGameMessageEvent, z18, gameMsgDownloadImgEvent, gameIconViewTipPreference, i19, j17, str2, z17, str));
            }
        }
    }

    public final zy2.na G0(com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference) {
        java.lang.String str;
        zy2.na naVar = new zy2.na();
        if (finderIconViewTipPreference == null) {
            return naVar;
        }
        if (finderIconViewTipPreference.J2 == 999) {
            return finderIconViewTipPreference.C0();
        }
        int B0 = finderIconViewTipPreference.B0();
        r45.za0 za0Var = r45.za0.NO_DSL_THUMBNAIL_CONTENT;
        if (B0 == 0) {
            r45.pm6 pm6Var = finderIconViewTipPreference.M2;
            if (!((pm6Var == null || (str = pm6Var.f383187e) == null || !str.equals(finderIconViewTipPreference.f196697j2.getResources().getString(com.tencent.mm.R.string.esk))) ? false : true)) {
                za0Var = r45.za0.NO_DSL_ORIGINAL_CONTENT;
            }
        } else if (finderIconViewTipPreference.B0() != 1) {
            za0Var = r45.za0.NO_DSL_AUTO_ELLIPSE_CONTENT;
        }
        return new zy2.na(za0Var, 0, false, "", finderIconViewTipPreference.H0(), null, null);
    }

    public final int H0() {
        if (k35.r.a() != null) {
            com.tencent.mm.plugin.subapp.jdbiz.o Zi = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi();
            if (com.tencent.mm.plugin.subapp.jdbiz.q.Di().bj() && Zi.e() && !Zi.d()) {
                if ("3".equals(Zi.f172132a) && !com.tencent.mm.sdk.platformtools.t8.K0(Zi.f172146o)) {
                    return 6;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi.f172138g)) {
                    return 3;
                }
                if (Zi.f172137f) {
                    return 2;
                }
            }
        }
        return 1;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo J0() {
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderEntrance");
        if (L0 == null) {
            return null;
        }
        r45.f03 I0 = L0.I0("FinderEntrance");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) L0.N.getCustom(20);
        if (I0 == null || finderJumpInfo == null || finderJumpInfo.getJumpinfo_type() != 3 || !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().f0()) {
            return null;
        }
        return finderJumpInfo;
    }

    public final int K0() {
        int i17;
        int a17 = com.tencent.mm.ui.bl.a(getContext());
        int i18 = com.tencent.mm.ui.bl.i(getContext(), -1);
        android.view.View findViewById = getView().getRootView().findViewById(com.tencent.mm.R.id.f482435ei);
        if (com.tencent.mm.ui.bk.Y()) {
            return findViewById != null ? a17 + findViewById.getTop() : a17 + i18;
        }
        int i19 = android.os.Build.VERSION.SDK_INT;
        boolean isInMultiWindowMode = com.tencent.mm.ui.LauncherUI.getInstance() != null ? com.tencent.mm.ui.LauncherUI.getInstance().isInMultiWindowMode() : false;
        if (!isInMultiWindowMode) {
            android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
            if (((d17 != null ? d17.getBoolean("Main_need_read_top_margin", false) : false) || i19 >= 31) && (i17 = d17.getInt("Main_top_marign", -1)) >= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "getTopHeight statusHeight:%s, topMargin:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                return a17 + i17;
            }
        }
        if (isInMultiWindowMode) {
            i18 = findViewById != null ? findViewById.getTop() : 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "getTopHeight statusHeight:%s, isInMultiWindowMode:%s", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(isInMultiWindowMode));
        return a17 + i18;
    }

    public final void L0() {
        ((com.tencent.mm.plugin.finder.extension.reddot.w1) ((zy2.e9) i95.n0.c(zy2.e9.class))).f105948i = 7;
        zs.a aVar = zs.b.f475222a;
        zs.b.f475222a = zs.a.f475216m;
        if (!com.tencent.mm.plugin.websearch.l2.h(1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FindMoreFriendsUI", "fts h5 template not avail");
            return;
        }
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        java.lang.String optString = su4.o2.d("discoverRecommendEntry").optString("wording");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FindMoreFriendsUI", "empty query");
            return;
        }
        this.F1 = true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isNewLifeRedDotEntranceShow", ra0.b0.f393463f);
        bundle.putBoolean("isNewLifeRedDotMentionEntranceShow", ra0.b0.f393464g);
        bundle.putBoolean("isRecentNewLifeRedDotMentionEntranceShow", ra0.b0.f393465h);
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "look one look clikced, isNewLifeRedDotEntranceShow: %b, isNewLifeRedDotMentionEntranceShow: %b isRecentNewLifeRedDotMentionEntranceShow: %b", java.lang.Boolean.valueOf(ra0.b0.f393463f), java.lang.Boolean.valueOf(ra0.b0.f393464g), java.lang.Boolean.valueOf(ra0.b0.f393465h));
        android.app.Activity context = getContext();
        o11.g gVar = wm4.u.f447309a;
        wm4.u.u(context, 21, bundle, "", new java.util.HashMap());
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).Di("labs_browse");
        com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent onSearchSearchBoxCtrlInfoChangedEvent = new com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent();
        onSearchSearchBoxCtrlInfoChangedEvent.f54583g.f6362a = 0;
        onSearchSearchBoxCtrlInfoChangedEvent.e();
        su4.k3.a(21, optString);
        su4.k3.f(21, 0);
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().I();
        ra0.x xVar = (ra0.x) i95.n0.c(ra0.x.class);
        boolean z17 = ra0.b0.f393463f;
        boolean z18 = ra0.b0.f393464g;
        nn3.f fVar = (nn3.f) xVar;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeReporter", "reportNewLifeRedDotClick [%b] [%b]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17) {
            fVar.Vi("NewLife.Entrance", 1);
        }
        if (z18) {
            fVar.Vi("NewLife.MentionEntrance", 1);
            fVar.Vi("NewLife.OfficialMsgEntrance", 1);
            fVar.Vi("K1k.MentionEntrance", 1);
        }
        int s17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().s();
        if (s17 > 0) {
            ra0.x xVar2 = (ra0.x) i95.n0.c(ra0.x.class);
            java.lang.String str = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r().f384113d;
            nn3.f fVar2 = (nn3.f) xVar2;
            fVar2.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "ws_reddot");
            hashMap.put("tipsid", str);
            hashMap.put("show_path", "wesee");
            hashMap.put("message_num", java.lang.Integer.valueOf(s17));
            fVar2.Ni("view_clk", null, hashMap, false);
        }
    }

    public final void M0(boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17065, 1, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), java.lang.Integer.valueOf(this.f196659x1.ordinal()), gm0.j1.u().c().m(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_RED_DOT_IMG_URL_STRING, ""), gm0.j1.u().c().m(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_RED_DOT_TEXT_STRING, ""), gm0.j1.u().c().m(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_RED_DOT_TYPE_STRING, "0"));
        if (this.f196659x1.equals(com.tencent.mm.ui.e6.TYPE_NEW_HINT)) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_NEW_RED_DOT_TAG_BOOLEAN, java.lang.Boolean.FALSE);
            this.f196659x1 = com.tencent.mm.ui.e6.TYPE_NONE;
            com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) this.f196656w.h("my_life_around");
            iconPreference.a0(8);
            iconPreference.V = "";
            iconPreference.W = -1;
        }
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_RED_DOT_TAG_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).Di("labs_nearbylife");
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).getClass();
        sy4.m mVar = sy4.m.f413884c;
        java.lang.String str = mVar.b("labs_nearbylife").field_WeAppUser;
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).getClass();
        int i17 = mVar.b("labs_nearbylife").field_WeAppDebugMode;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1112;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(getContext(), str, null, i17, 0, (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("LifeAppEntranceBringRedDot", 0) == 0 || !booleanValue) ? null : "?hasRedDot=true", appBrandStatObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0() {
        /*
            Method dump skipped, instructions count: 1535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.FindMoreFriendsUI.N0():void");
    }

    public boolean P0(long j17) {
        return (j17 & this.P) != 0;
    }

    public boolean Q0() {
        return com.tencent.mm.sdk.platformtools.t8.T0(gm0.j1.u().c().t(com.tencent.mm.storage.u3.FIND_MORE_UI_ENTRY_LAST_REPORT_TIME_LONG_SYNC, 0L), this.f196652s);
    }

    public final boolean R0() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_jd_entrance_declare, 0);
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_JD_ENTRANCE_DECLARE_CLICK_BOOLEAN_SYNC, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "show declare needShow %d, hasShow %s", java.lang.Integer.valueOf(Ni), java.lang.Boolean.valueOf(o17));
        return (Ni == 0 || o17) ? false : true;
    }

    @Override // com.tencent.mm.ui.y7
    public void T() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "on tab recreate ui");
    }

    public final boolean T0() {
        boolean el6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        boolean z17 = !P0(34359738368L);
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        int G8 = ((uh4.c0) i95.n0.c(uh4.c0.class)).G8();
        boolean z18 = isTeenMode && G8 == 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[isShowFinderEntrance] show:%s open:%s, isTeenMode:%s teenModeFinderOption:%s isTeenModeAndNothing:%s", java.lang.Boolean.valueOf(el6), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(isTeenMode), java.lang.Integer.valueOf(G8), java.lang.Boolean.valueOf(z18));
        return el6 && z17 && !z18;
    }

    public final boolean U0() {
        boolean D = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().D();
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[isShowTopStoryEntrance] show:%s ", java.lang.Boolean.valueOf(D));
        return D;
    }

    @Override // com.tencent.mm.ui.y7
    public void V() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "turn to fg");
    }

    public final void V0(boolean z17, boolean z18) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference;
        int rk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).rk();
        jx3.f.INSTANCE.idkeyStat(1279L, 0L, 1L, false);
        com.tencent.mm.ui.base.preference.h0 h0Var = this.f196656w;
        zy2.na dslRenderInfo = (h0Var == null || (finderIconViewTipPreference = (com.tencent.mm.ui.FinderIconViewTipPreference) h0Var.h("find_friends_by_finder")) == null) ? null : finderIconViewTipPreference.C0();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(1, 1, rk6, intent);
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        kotlin.jvm.internal.o.g(dslRenderInfo, "dslRenderInfo");
        java.lang.String d17 = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.d(Bj, 0, 0, dslRenderInfo);
        intent.putExtra("key_red_dot_id", d17);
        if (z17) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String g17 = kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.finder.ui.FinderSelfUI.class).g();
            if (g17 == null) {
                g17 = "";
            }
            intent.putExtra("KEY_ROUTE_TO_PAGE", g17);
        } else if (z18) {
            intent.putExtra("KEY_ROUTE_TO_TOPIC", true);
        }
        intent.putExtra("KEY_FROM_PATH", "FinderEntrance");
        intent.removeExtra("key_yreportsdk_reddot_info");
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().f0()) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "bindRedDotInfoInFinder cost[%d] size[%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - android.os.SystemClock.elapsedRealtime()), java.lang.Integer.valueOf(l1(intent, "FinderEntrance", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().i0("FinderMentionEntrance", "reddot_", "_left", "push_type;scene;live_sub_recall_type;order_uid;enter_action;put_strategy;"))));
        }
        intent.putExtra("isEnableShowUnreadFeed", true);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.D(getContext(), intent, true);
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zj(Bj, "Enter");
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        o3Var.getClass();
        com.tencent.mm.autogen.mmdata.rpt.DiscoverFinderClickStruct discoverFinderClickStruct = new com.tencent.mm.autogen.mmdata.rpt.DiscoverFinderClickStruct();
        discoverFinderClickStruct.f55829n = discoverFinderClickStruct.b("ContextId", Bj, true);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        discoverFinderClickStruct.f55828m = discoverFinderClickStruct.b("SessionId", Ri, true);
        pf5.u uVar = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ey2.t0 t0Var = (ey2.t0) a17;
        discoverFinderClickStruct.f55826k = t0Var.Q6();
        androidx.lifecycle.c1 a18 = uVar.e(c61.l7.class).a(ey2.k0.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        ey2.k0 k0Var = (ey2.k0) a18;
        discoverFinderClickStruct.f55821f = k0Var.N6() ? 1L : 0L;
        r45.ae3 ae3Var = k0Var.f257411e;
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        if (ae3Var != null) {
            discoverFinderClickStruct.f55820e = 1L;
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            discoverFinderClickStruct.f55820e = 0L;
        }
        if (d17 != null) {
            discoverFinderClickStruct.f55819d = 1L;
            discoverFinderClickStruct.f55827l = discoverFinderClickStruct.b("EnterRedDotId", d17, true);
            discoverFinderClickStruct.f55825j = 0L;
            discoverFinderClickStruct.f55824i = 0L;
            discoverFinderClickStruct.f55822g = 0L;
            discoverFinderClickStruct.f55823h = 0L;
            discoverFinderClickStruct.f55830o = 1L;
            f0Var2 = f0Var3;
        } else {
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            discoverFinderClickStruct.f55819d = 0L;
            discoverFinderClickStruct.f55827l = discoverFinderClickStruct.b("EnterRedDotId", "", true);
            discoverFinderClickStruct.f55830o = t0Var.R6(t0Var.Q6()) ? 2L : 1L;
            long j17 = t0Var.N6(3).f257445e;
            if (j17 < 0) {
                j17 = 0;
            }
            discoverFinderClickStruct.f55822g = j17;
            long j18 = t0Var.N6(2).f257445e;
            if (j18 < 0) {
                j18 = 0;
            }
            discoverFinderClickStruct.f55824i = j18;
            long j19 = t0Var.N6(1).f257445e;
            if (j19 < 0) {
                j19 = 0;
            }
            discoverFinderClickStruct.f55823h = j19;
            long j27 = t0Var.N6(4).f257445e;
            discoverFinderClickStruct.f55825j = j27 >= 0 ? j27 : 0L;
        }
        discoverFinderClickStruct.k();
        o3Var.Zk(discoverFinderClickStruct);
        gz2.c.a("finder");
        zs.a aVar = zs.b.f475222a;
        zs.b.f475222a = zs.a.f475212f;
    }

    public void W0() {
        zy2.na naVar = new zy2.na();
        com.tencent.mm.ui.base.preference.h0 h0Var = this.f196656w;
        if (h0Var != null) {
            naVar = G0((com.tencent.mm.ui.FinderIconViewTipPreference) h0Var.h(this.M1.b()));
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String Cj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(com.tencent.mm.ui.report.e0.a(), intent);
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.b(Cj, 1, naVar);
        y0(intent, "FinderLiveEntrance");
        ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).Ai(getContext(), intent);
        zs.a aVar = zs.b.f475222a;
        zs.b.f475222a = zs.a.f475213g;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X0() {
        /*
            Method dump skipped, instructions count: 1343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.FindMoreFriendsUI.X0():void");
    }

    public final void Z0(com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference, int i17, boolean z17, long j17) {
        this.U.postDelayed(new com.tencent.mm.ui.b6(this, i17, finderIconViewTipPreference, z17, false), j17);
    }

    @Override // c01.y8
    public void a0() {
        if (this.f196656w == null) {
            return;
        }
        this.N = c01.z1.p();
        D1();
    }

    public final void a1(r45.pm6 pm6Var) {
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.G2).getValue()).r()).intValue();
        java.util.Random random = new java.util.Random();
        if (intValue <= 0 || pm6Var == null) {
            return;
        }
        pm6Var.f383190h = "8.6万人";
        pm6Var.f383191i = "#FA9D3B";
        pm6Var.f383193n = "#56FA9D3B";
        if (intValue == 2 || intValue == 4) {
            if (random.nextInt(10) % 2 == 0) {
                pm6Var.f383192m = "http://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_fire_v1_3e6119848137473b86dd83e917afe31b.png";
            } else {
                pm6Var.f383192m = "http://dldir1v6.qq.com/weixin/checkresupdate/heart_d0713c51c1cb4a18b62d562fafefac53.png";
            }
        }
        if (intValue == 3 || intValue == 4) {
            pm6Var.f383194o = true;
        }
    }

    public void b1(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "note entry red dot [%s] entry [%b]", str, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent findMoreFriendEntryRedDotEvent = new com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent();
        am.la laVar = findMoreFriendEntryRedDotEvent.f54255g;
        laVar.f7232a = str;
        laVar.f7233b = z17;
        findMoreFriendEntryRedDotEvent.e();
        com.tencent.mm.ui.base.preference.h0 h0Var = this.f196656w;
        if (h0Var != null) {
            com.tencent.mm.ui.base.preference.Preference h17 = h0Var.h(str);
            if (h17 instanceof com.tencent.mm.ui.base.preference.IconPreference) {
                c1((com.tencent.mm.ui.base.preference.IconPreference) h17);
            }
        }
    }

    public final void c1(com.tencent.mm.ui.base.preference.IconPreference iconPreference) {
        java.lang.String str;
        if (iconPreference == null || (str = iconPreference.f197780q) == null || str.equals("")) {
            return;
        }
        android.view.View view = iconPreference.W1;
        if (view == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FindMoreFriendsUI", "entryKey = [%s] get root view is null", str);
            return;
        }
        com.tencent.mm.autogen.events.NotifyPreferenceBindViewEvent notifyPreferenceBindViewEvent = new com.tencent.mm.autogen.events.NotifyPreferenceBindViewEvent();
        am.wl wlVar = notifyPreferenceBindViewEvent.f54551g;
        wlVar.f8296a = view;
        wlVar.f8297b = str;
        wlVar.f8298c = iconPreference.V1;
        f55.e eVar = f55.e.f259771e;
        wlVar.f8299d = 2;
        wlVar.f8300e = this.f196656w.q(str);
        notifyPreferenceBindViewEvent.e();
    }

    public final boolean d1(com.tencent.mm.ui.base.preference.Preference preference) {
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(11);
        h45.g0.f278945a = 9;
        if (k35.r.a() != null) {
            java.lang.String Ui = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ui();
            com.tencent.mm.plugin.subapp.jdbiz.n Vi = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Vi();
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "jumpUrl %s, jumpWeapp %s", Ui, Vi);
            int H0 = H0();
            com.tencent.mm.plugin.subapp.jdbiz.q.Di().wi();
            com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ai();
            com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) preference;
            iconPreference.V = "";
            iconPreference.W = -1;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Vi.f172129a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "jump to jd weapp %s", Vi.f172129a);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11179, Vi.f172129a, com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi().f172133b, java.lang.Integer.valueOf(H0));
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_dialog_optimize_switch, 1) == 1) {
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f317012a = Vi.f172129a;
                    b1Var.f317018d = Vi.f172131c;
                    b1Var.f317022f = Vi.f172130b;
                    b1Var.f317032k = 1112;
                    if (R0()) {
                        com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = new com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle();
                        weAppOpenDeclarePromptBundle.f74986d = 1;
                        weAppOpenDeclarePromptBundle.f74988f = getString(com.tencent.mm.R.string.bq7);
                        weAppOpenDeclarePromptBundle.f74989g = getString(com.tencent.mm.R.string.g6n);
                        weAppOpenDeclarePromptBundle.f74990h = getString(com.tencent.mm.R.string.f490454vi);
                        weAppOpenDeclarePromptBundle.f74991i = false;
                        b1Var.B = weAppOpenDeclarePromptBundle;
                    }
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(getContext(), b1Var);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "onClickOfJDEntrance clicfg_appbrand_dialog_optimize_switch close");
                    com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                    appBrandStatObject.f87790f = 1112;
                    if (R0()) {
                        db5.e1.G(getContext(), getString(com.tencent.mm.R.string.g6n), getString(com.tencent.mm.R.string.bq7), false, new com.tencent.mm.ui.h5(this, Vi, appBrandStatObject));
                    } else {
                        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(getContext(), Vi.f172129a, "", 0, Vi.f172131c, Vi.f172130b, appBrandStatObject);
                    }
                }
                return true;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Ui)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "jump to jd webview %s", Ui);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11179, Ui, com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi().f172133b, java.lang.Integer.valueOf(H0));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", Ui);
                intent.putExtra("useJs", true);
                intent.putExtra("vertical_scroll", true);
                intent.putExtra("minimize_secene", 1);
                intent.putExtra("KPublisherId", "jd_store");
                com.tencent.mm.ui.i5 i5Var = new com.tencent.mm.ui.i5(this, intent);
                if (R0()) {
                    db5.e1.G(getContext(), getString(com.tencent.mm.R.string.g6n), getString(com.tencent.mm.R.string.bq7), false, new com.tencent.mm.ui.j5(this, i5Var));
                } else {
                    i5Var.run();
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.y7
    public void e0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "turn to bg");
    }

    public final void e1() {
        if (this.f196656w != null) {
            android.widget.AbsListView.OnScrollListener wi6 = ((e55.f) ((f55.g) i95.n0.c(f55.g.class))).wi();
            if (wi6 != null) {
                this.f196656w.c(wi6);
            }
            android.widget.ListView listView = this.f196656w.f197819u;
            if (listView != null) {
                f55.g gVar = (f55.g) i95.n0.c(f55.g.class);
                f55.e eVar = f55.e.f259771e;
                ((e55.f) gVar).getClass();
                if (e55.e.f249667a.n()) {
                    e55.m mVar = e55.m.f249681a;
                    com.tencent.mm.sdk.platformtools.n3 g17 = mVar.g();
                    android.os.Message obtainMessage = mVar.g().obtainMessage();
                    obtainMessage.what = 1015;
                    obtainMessage.obj = nm5.j.c(2, new java.lang.ref.WeakReference(listView));
                    g17.sendMessage(obtainMessage);
                }
            }
        }
    }

    public final void f1() {
        this.E1 = false;
        if (!t1()) {
            ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).getClass();
            java.lang.Boolean bool = true;
            if (bool.booleanValue() && getContext() != null) {
                ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).Ai(20, getContext());
            }
            if (com.tencent.mm.pluginsdk.model.g4.c()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "try preload search webView in discover page");
                su4.r2.o();
                if (su4.r2.h(false) != 0) {
                    su4.r2.p(0L, false, true, 1);
                }
                ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).cj(20, 0);
            }
        }
        if (U0() && wm4.u.r() && getContext() != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[TopStoryLiteApp]try preload top story liteApp");
            lf0.d0 d0Var = (lf0.d0) i95.n0.c(lf0.d0.class);
            android.app.Activity context = getContext();
            d0Var.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            if (((q80.g0) i95.n0.c(q80.g0.class)) == null) {
                return;
            }
            d0Var.Di(context, "wxalite71e155e932f19de48da8333a8f225708", "pages/videotab/main", false);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = lf0.d0.f318201e;
            wu5.c cVar = (wu5.c) concurrentHashMap.get("wxalite71e155e932f19de48da8333a8f225708pages/videotab/main");
            if (cVar != null) {
                cVar.cancel(false);
            }
            concurrentHashMap.remove("wxalite71e155e932f19de48da8333a8f225708pages/videotab/main");
            ((ku5.t0) ku5.t0.f312615d).B(new lf0.b0("wxalite71e155e932f19de48da8333a8f225708", "pages/videotab/main", context));
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "onNotifyChange(MStorageEx)");
        if (com.tencent.mm.ui.LauncherUI.getCurrentTabIndex() == 2) {
            boolean z18 = true;
            if (this.N != c01.z1.p()) {
                this.N = c01.z1.p();
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.P != c01.z1.j()) {
                this.P = c01.z1.j();
                z17 = true;
            }
            if (this.Q != c01.z1.n()) {
                this.Q = c01.z1.n();
                z17 = true;
            }
            if (this.R != c01.z1.h()) {
                this.R = c01.z1.h();
            } else {
                z18 = z17;
            }
            if (z18) {
                D1();
            }
            if ((obj instanceof java.lang.Integer) && ((java.lang.Integer) obj).intValue() == 68377) {
                C1();
            }
            if (a1Var instanceof com.tencent.mm.storage.m4) {
                this.f196656w.notifyDataSetChanged();
            }
        }
    }

    public final void g1() {
        su4.h2 Ni;
        if (!t1()) {
            ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).getClass();
            java.lang.Boolean bool = true;
            if (bool.booleanValue() && !this.E1 && (Ni = ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).Ni(20)) != null && Ni.f412910e) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = sg0.h3.f407722d;
                wu5.c cVar = (wu5.c) concurrentHashMap.get(Ni.a());
                if (cVar != null) {
                    cVar.cancel(false);
                }
                java.lang.String a17 = Ni.a();
                ku5.u0 u0Var = ku5.t0.f312615d;
                sg0.f3 f3Var = new sg0.f3(20, Ni);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                wu5.c z17 = t0Var.z(f3Var, 180000L, false);
                kotlin.jvm.internal.o.f(z17, "uiDelay(...)");
                concurrentHashMap.put(a17, z17);
            }
        }
        if (!U0() || this.F1 || !wm4.u.r() || getContext() == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[TopStoryLiteApp]try release top story preload res");
        ((lf0.d0) i95.n0.c(lf0.d0.class)).getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = lf0.d0.f318201e;
        wu5.c cVar2 = (wu5.c) concurrentHashMap2.get("wxalite71e155e932f19de48da8333a8f225708pages/videotab/main");
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        ku5.u0 u0Var2 = ku5.t0.f312615d;
        lf0.c0 c0Var = new lf0.c0("wxalite71e155e932f19de48da8333a8f225708", "pages/videotab/main");
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        wu5.c z18 = t0Var2.z(c0Var, 180000L, false);
        kotlin.jvm.internal.o.f(z18, "uiDelay(...)");
        concurrentHashMap2.put("wxalite71e155e932f19de48da8333a8f225708pages/videotab/main", z18);
    }

    public final void h1() {
        this.Y.dead();
        this.V.dead();
        this.Z.dead();
        this.X.dead();
        this.f196649l1.dead();
        this.A1.dead();
        this.B1.dead();
        if (gm0.j1.a()) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi().remove(this.W);
            com.tencent.mm.pluginsdk.event.IListenerMStorage.e(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), this.f196650p0);
            com.tencent.mm.pluginsdk.event.IListenerMStorage.e(com.tencent.mm.autogen.events.ShakeMessageStorageNotifyEvent.class.getName(), this.f196661y0);
            com.tencent.mm.pluginsdk.event.IListenerMStorage.e(com.tencent.mm.autogen.events.GameLifeStorageNotifyEvent.class.getName(), this.f196658x0);
            r21.w.Di().remove(this);
            ((l75.a1) c01.d9.b().r()).e(this);
            c01.d9.b().G(this);
            c01.d9.b().p().e(this);
            if (this.C != null) {
                ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(this.C);
            }
        }
        if (o25.w1.b() != null) {
            ((com.tencent.mm.plugin.sns.model.l4) o25.w1.b()).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
            java.util.List list = com.tencent.mm.plugin.sns.model.c3.f164113h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            ((java.util.LinkedList) com.tencent.mm.plugin.sns.model.c3.f164113h).remove(this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
        }
    }

    public final void i1(boolean z17) {
        com.tencent.mm.plugin.game.h0 h0Var = (com.tencent.mm.plugin.game.h0) m33.a1.a();
        if (!h0Var.f139454e) {
            boolean z18 = false;
            if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.game_luggage, true)) {
                if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.preload_game_webcore, false)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameDelegateImpl", "hit expt preload");
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.C(939L, 4L, 1L);
                    if (y7.c.b(com.tencent.mm.sdk.platformtools.x2.f193071a) < 2014) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameDelegateImpl", "device score smaller than 2014");
                        g0Var.C(939L, 5L, 1L);
                    } else {
                        if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("game_center_pref", 0).getLong("game_index_last_visit_time", 0L) > 21600000) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.GameDelegateImpl", "larger than 6 hours");
                            if (z17) {
                                com.tencent.mm.plugin.game.model.e1 m17 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().m();
                                if (m17 == null || java.lang.System.currentTimeMillis() - (m17.field_receiveTime * 1000) > 21600000) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.GameDelegateImpl", "red dot larger than 6 hours");
                                    g0Var.C(939L, 7L, 1L);
                                }
                            } else {
                                g0Var.C(939L, 6L, 1L);
                            }
                        }
                        if (com.tencent.mm.sdk.platformtools.a0.c()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.GameDelegateImpl", "isGPVersion");
                            g0Var.C(939L, 8L, 1L);
                        } else if (com.tencent.mm.sdk.platformtools.t8.K0(r53.f.g())) {
                            g0Var.C(939L, 9L, 1L);
                        } else {
                            z18 = true;
                        }
                    }
                }
            }
            h0Var.f139453d = z18;
            h0Var.f139454e = true;
        }
        if (h0Var.f139453d) {
            java.lang.String g17 = r53.f.g();
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameDelegateImpl", "preload");
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent = new com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent();
            am.nl nlVar = notifyGameWebviewOperationEvent.f54542g;
            nlVar.f7433a = 3;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", g17);
            nlVar.f7435c = intent;
            notifyGameWebviewOperationEvent.e();
        }
    }

    public final int l1(android.content.Intent intent, java.lang.String str, java.util.HashMap hashMap) {
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap i07 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().i0(str, "reddot_", "", "push_type;scene;live_sub_recall_type;order_uid;enter_action;put_strategy;");
        if (!i07.isEmpty()) {
            hashMap2.putAll(i07);
        }
        if (hashMap != null && !hashMap.isEmpty()) {
            hashMap2.putAll(hashMap);
        }
        if (intent == null || hashMap2.isEmpty()) {
            return 0;
        }
        intent.putExtra("key_yreportsdk_reddot_info", hashMap2);
        return hashMap2.size();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment
    public int m0() {
        return com.tencent.mm.R.xml.f494875ag;
    }

    public final void m1(boolean z17, com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference, r45.f03 f03Var) {
        com.tencent.mm.ui.base.preference.h0 h0Var;
        com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference2 = finderIconViewTipPreference;
        java.lang.String str = this.N1;
        if (finderIconViewTipPreference2 != null && !str.equals(finderIconViewTipPreference2.f197780q) && ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ui()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FindMoreFriendsUI", "reportFindPageRedDotExpose %s invalid!", finderIconViewTipPreference2.f197780q);
            return;
        }
        if (finderIconViewTipPreference2 == null && (h0Var = this.f196656w) != null) {
            finderIconViewTipPreference2 = (com.tencent.mm.ui.FinderIconViewTipPreference) h0Var.h(str);
        }
        com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference3 = finderIconViewTipPreference2;
        if (finderIconViewTipPreference3 != null) {
            int H0 = finderIconViewTipPreference3.H0();
            int B0 = finderIconViewTipPreference3.B0();
            zy2.na C0 = finderIconViewTipPreference3.C0();
            int i17 = f03Var != null ? f03Var.f373887d : 0;
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
            boolean z18 = com.tencent.mm.plugin.finder.extension.reddot.ca.f105447b;
            java.lang.String str2 = finderIconViewTipPreference3.f197780q;
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
            boolean t17 = com.tencent.mm.plugin.finder.storage.aj0.f126440a.t();
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            r45.za0 za0Var = C0.f477485a;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(C0.f477486b);
            java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(z18);
            boolean z19 = C0.f477487c;
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "reportFindPageRedDotExpose %s, ignoreDuplicatedId=%s, renderStatus:%s,remarkFlag:%s,enableDslRenderStateNewReportLogic:%s,init:%s,title:%s,showStyle:%s, ignoreReportBeforeRenderFinished:%s", str2, valueOf, za0Var, valueOf2, valueOf3, java.lang.Boolean.valueOf(z19), C0.f477488d, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(t17));
            if (z18 && str.equals(str2) && i17 == 999 && !z19) {
                if (this.I1 == null) {
                    this.I1 = new com.tencent.mm.ui.a6(this, finderIconViewTipPreference3, t17, this, z17);
                }
                ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ni(this, this.I1, false);
                return;
            }
            if (str.equals(finderIconViewTipPreference3.f197780q) && t17) {
                if (!this.F) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "return because not in find page!");
                    return;
                } else if (i17 == 999 && (!z19 || !finderIconViewTipPreference3.N0())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "return because DSL view has not shown! hasInit:%s", java.lang.Boolean.valueOf(z19));
                    return;
                }
            }
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).cj(z17, H0, B0, C0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x0c59, code lost:
    
        if (r0 == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0ba8, code lost:
    
        if (com.tencent.mm.sdk.platformtools.f9.DiscoveryNearby.k(getContext(), null) == false) goto L301;
     */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.content.DialogInterface$OnClickListener, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r10v8 */
    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n0(com.tencent.mm.ui.base.preference.r r29, com.tencent.mm.ui.base.preference.Preference r30, com.tencent.mm.ui.base.preference.n0 r31) {
        /*
            Method dump skipped, instructions count: 3171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.FindMoreFriendsUI.n0(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference, com.tencent.mm.ui.base.preference.n0):boolean");
    }

    public final void n1(long j17, int i17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.game.model.e1 L0;
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.GAME_ENTRANCE_MSG_ID_LONG_SYNC;
        if (j17 == c17.t(u3Var, 0L) || !this.I || this.f196655v.a()) {
            return;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j17));
        if (m33.a1.a() == null || (L0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(j17)) == null) {
            return;
        }
        L0.t0();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reddot_strategy", com.tencent.mm.plugin.game.commlib.util.d.a() ? "1" : "0");
        hashMap.put("channel", java.lang.Integer.toString(L0.field_channel));
        hashMap.put("other_score", str == null ? "" : str);
        hashMap.put("expo_times", "1");
        if (z17) {
            hashMap.put("cexpo_times", "1");
        }
        java.lang.String a17 = com.tencent.mm.game.report.l.a("resource", java.lang.String.valueOf(i17), L0.U2, hashMap);
        if (L0.field_needReport) {
            com.tencent.mm.game.report.l.d(com.tencent.mm.sdk.platformtools.x2.f193071a, 9, 901, 1, 1, 0, L0.field_appId, 0, L0.S2, L0.field_gameMsgId, L0.T2, a17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 2L, 1L, false);
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment
    public boolean o0(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference, android.view.View view) {
        boolean z17;
        boolean z18 = false;
        if ("find_friends_by_finder".equals(preference.f197780q) && i95.n0.c(zy2.b6.class) != null) {
            if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                android.app.Activity activity = getContext();
                ((c61.l7) b6Var).getClass();
                kotlin.jvm.internal.o.g(activity, "activity");
                try {
                    int i17 = com.tencent.mm.plugin.finder.ui.FinderKitUI.d;
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.finder.ui.FinderKitUI.class);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/FinderCommonFeatureService", "showFinderEntranceDebugSheet", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity, "com/tencent/mm/plugin/FinderCommonFeatureService", "showFinderEntranceDebugSheet", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Throwable th6) {
                    if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                        z18 = true;
                    } else {
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                    if (z18) {
                        throw th6;
                    }
                    com.tencent.mars.xlog.Log.w("Finder.FinderCommonFeatureService", "activity FinderKitUI not found");
                }
                return true;
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if ("find_friends_by_look".equals(preference.f197780q) && i95.n0.c(zy2.b6.class) != null) {
            if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClassName(getContext(), "com.tencent.mm.plugin.repairer.ui.demo.RepairerNewLifeDebugUI");
                startActivityForResult(intent2, 0);
                return true;
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        try {
            if ("album_dyna_photo_ui_title".equals(preference.f197780q)) {
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (z65.c.a()) {
                    android.app.Activity context = getContext();
                    int i18 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
                    android.content.Intent intent3 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsSettingUI.class);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent3);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/FindMoreFriendsUI", "onPreferenceTreeLongClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(this, "com/tencent/mm/ui/FindMoreFriendsUI", "onPreferenceTreeLongClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return true;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        if ("app_brand_entrance".equals(preference.f197780q)) {
            com.tencent.mm.plugin.appbrand.service.k6 k6Var = (com.tencent.mm.plugin.appbrand.service.k6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k6.class);
            android.app.Activity context2 = getContext();
            if (!((com.tencent.mm.plugin.appbrand.app.t2) k6Var).Bi() || ((com.tencent.mm.plugin.appbrand.debugger.j0) i95.n0.c(com.tencent.mm.plugin.appbrand.debugger.j0.class)) == null) {
                z17 = false;
            } else {
                kotlin.jvm.internal.o.g(context2, "context");
                try {
                    java.lang.Class.forName(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.class.getName());
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context2, 1, false);
                    k0Var.f211872n = q91.a.f360886d;
                    k0Var.f211881s = new q91.c(k0Var, context2);
                    k0Var.v();
                } catch (java.lang.Throwable unused2) {
                }
                z17 = true;
            }
            if (z17) {
                return true;
            }
        }
        if ("more_tab_game_recommend".equals(preference.f197780q) && i95.n0.c(m33.r1.class) != null) {
            if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                m33.r1 r1Var = (m33.r1) i95.n0.c(m33.r1.class);
                android.app.Activity context3 = getContext();
                ((com.tencent.mm.plugin.game.n1) r1Var).getClass();
                if (context3 != null) {
                    android.content.Intent intent4 = new android.content.Intent(context3, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.GameDebugView.class);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(context3, arrayList3.toArray(), "com/tencent/mm/plugin/game/GameService", "showGameDebugView", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context3.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(context3, "com/tencent/mm/plugin/game/GameService", "showGameDebugView", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                return true;
            }
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        return false;
    }

    public void o1(java.lang.String str, java.lang.Boolean bool) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "safeReportFinderLiveRedDotExpose source=" + str);
        rg5.o oVar = this.M1;
        if (oVar == null || this.f196656w == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needCheckShowingRedDotOnExposeReport: ");
        jz5.g gVar = oVar.f395269i;
        sb6.append(((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue());
        com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", sb6.toString());
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue();
        com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference = (com.tencent.mm.ui.FinderIconViewTipPreference) this.f196656w.h(this.M1.b());
        if (finderIconViewTipPreference != null) {
            zy2.na G0 = G0(finderIconViewTipPreference);
            if (!G0.f477487c && finderIconViewTipPreference.J2 == 999) {
                if (this.J1 == null) {
                    this.J1 = new com.tencent.mm.ui.c6(this, finderIconViewTipPreference, booleanValue, str);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "finderEntranceDslRender Action listener");
                ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ni(this, this.J1, false);
                return;
            }
            if (booleanValue) {
                int i17 = finderIconViewTipPreference.J2;
                if (i17 == 0 || i17 == 8) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "safeReportFinderLiveRedDotExpose return for no red dot");
                    return;
                } else if (i17 == 999 && !finderIconViewTipPreference.N0()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "safeReportFinderLiveRedDotExpose return for red dot invisible");
                    return;
                } else if (!this.F) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "safeReportFinderLiveRedDotExpose return for not in findEntrance");
                    return;
                }
            }
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).fj(str + "_otherRender", bool.booleanValue(), this.M1.e(), G0);
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference, com.tencent.mm.ui.base.preference.MMPreferenceFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "onActivityCreated");
        if (this.M1 == null) {
            rg5.o oVar = new rg5.o(getContext(), this);
            this.M1 = oVar;
            oVar.f();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u1();
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.K1 != null) {
            zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
            androidx.lifecycle.k0 observer = this.K1;
            ((c61.t8) caVar).getClass();
            kotlin.jvm.internal.o.g(observer, "observer");
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105359d.removeObserver(observer);
        }
        com.tencent.mm.ui.base.preference.h0 h0Var = this.f196656w;
        if (h0Var != null) {
            h0Var.u(this.M);
        }
        if (this.J1 != null) {
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ni(this, this.J1, true);
        }
        rg5.o oVar = this.M1;
        if (oVar != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "onDestroy");
            oVar.f395268h.dead();
            oVar.g();
            this.M1 = null;
        }
        zs.a aVar = zs.b.f475222a;
        zs.b.f475222a = zs.a.f475210d;
        zs.c.f475224b = false;
        zs.c.f475225c = false;
        zs.c.f475226d = false;
        zs.c.f475228f = 0;
        zs.c.f475229g = 0;
        rg5.x xVar = this.G1;
        if (xVar != null) {
            ef0.k2 k2Var = (ef0.k2) ((qk.n8) i95.n0.c(qk.n8.class));
            k2Var.getClass();
            rg5.u listener = xVar.f395289d;
            kotlin.jvm.internal.o.g(listener, "listener");
            k2Var.f252255g.remove(listener);
        }
        com.tencent.mm.ui.g6 g6Var = this.f196655v;
        if (g6Var != null) {
            synchronized (g6Var.f208620b) {
                g6Var.f208621c.dead();
                g6Var.f208619a = null;
            }
        }
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "onNotifyChange(MStorage)");
        if (com.tencent.mm.ui.LauncherUI.getCurrentTabIndex() == 2) {
            boolean z18 = true;
            if (this.N != c01.z1.p()) {
                this.N = c01.z1.p();
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.P != c01.z1.j()) {
                this.P = c01.z1.j();
                z17 = true;
            }
            if (this.Q != c01.z1.n()) {
                this.Q = c01.z1.n();
                z17 = true;
            }
            if (this.R != c01.z1.h()) {
                this.R = c01.z1.h();
            } else {
                z18 = z17;
            }
            if (z18) {
                D1();
            }
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    public void p0(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "on tab create");
        tm0.e stateOwner = this.f196653t;
        stateOwner.f420462h.d();
        stateOwner.f420460f = stateOwner.b();
        stateOwner.a().notify(kz5.b0.c(new tm0.a(tm0.b.f420448d, stateOwner)));
        this.f196656w = this.f197764d;
        this.N = c01.z1.p();
        this.Q = c01.z1.n();
        this.P = c01.z1.j();
        this.R = c01.z1.h();
        new rl5.r(getContext());
        if (com.tencent.mm.ui.a4.f197117a.h(thisActivity())) {
            this.f196656w.m("bottom_empty_place_holder", false);
        } else {
            this.f196656w.m("bottom_empty_place_holder", true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "on tab create end");
        this.f196656w.m("find_friends_by_shake", true);
        this.f196656w.m("ip_call_entrance", true);
        zs.a aVar = zs.b.f475222a;
        zs.b.f475222a = zs.a.f475210d;
        zs.c.f475224b = false;
        zs.c.f475225c = false;
        zs.c.f475226d = false;
        zs.c.f475228f = 0;
        zs.c.f475229g = 0;
        en3.g0 g0Var = (en3.g0) ((ra0.z) i95.n0.c(ra0.z.class));
        g0Var.getClass();
        kotlin.jvm.internal.o.g(stateOwner, "stateOwner");
        new java.lang.ref.WeakReference(stateOwner);
        stateOwner.a().uiObserve(g0Var, new en3.f0(g0Var));
        e1();
    }

    public final void p1() {
        com.tencent.mm.autogen.events.SendEntranceStateEvent sendEntranceStateEvent = new com.tencent.mm.autogen.events.SendEntranceStateEvent();
        sendEntranceStateEvent.f54750g.f7182a = this.F;
        sendEntranceStateEvent.e();
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    public void q0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "on tab destroy");
        tm0.e eVar = this.f196653t;
        eVar.a().notify(kz5.b0.c(new tm0.a(tm0.b.f420453i, eVar)));
        eVar.f420462h.e();
        h1();
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f37061a.i("lifeappreddot", this.f196662y1);
    }

    public final void q1(com.tencent.mm.ui.GameIconViewTipPreference gameIconViewTipPreference, int i17, int i18, int i19, boolean z17, int i27, int i28, int i29) {
        gameIconViewTipPreference.a0(i17);
        gameIconViewTipPreference.c0(i18);
        gameIconViewTipPreference.b0(i19);
        gameIconViewTipPreference.e0(z17);
        gameIconViewTipPreference.Y(i27);
        gameIconViewTipPreference.T(i28);
        gameIconViewTipPreference.V(i29);
        b1("more_tab_game_recommend", i17 == 0 || i18 == 0 || i19 == 0 || z17 || i27 == 0 || i28 == 0 || i29 == 0);
    }

    @Override // com.tencent.mm.ui.y7
    public void r() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "on tab switch in isTabSwitchInReport:%b isTabResumeReport:%b", java.lang.Boolean.valueOf(this.P1), java.lang.Boolean.valueOf(this.Q1));
        tm0.e eVar = this.f196653t;
        eVar.b();
        eVar.f420460f = true;
        eVar.a().notify(kz5.b0.c(new tm0.a(tm0.b.f420450f, eVar)));
        eVar.c(eVar.f420459e && eVar.f420460f);
        this.F = true;
        this.H = true;
        this.L = true;
        p1();
        nm.j.f338443g.a(new com.tencent.mm.ui.d6(this));
        su4.o2.f(null, 20, 0L, null, false);
        ((pg3.v) ((n40.n) i95.n0.c(n40.n.class))).wi(false);
        f1();
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    public void r0() {
        android.widget.AbsListView.OnScrollListener wi6;
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "on tab pause");
        tm0.e eVar = this.f196653t;
        eVar.b();
        if (eVar.b() && eVar.f420459e) {
            eVar.f420459e = false;
            eVar.c(false);
            eVar.a().notify(kz5.b0.c(new tm0.a(tm0.b.f420452h, eVar)));
        }
        if (this.f196656w != null && (wi6 = ((e55.f) ((f55.g) i95.n0.c(f55.g.class))).wi()) != null) {
            this.f196656w.u(wi6);
        }
        this.F = false;
        this.P1 = false;
        this.Q1 = false;
        this.H = false;
        this.L = false;
        su4.g3.f412902d.f412905c = null;
        wg0.a aVar = (wg0.a) ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).aj();
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchRedDotReporter", "resetAllExpose");
        ((java.util.concurrent.ConcurrentHashMap) aVar.f445708a).clear();
        ((java.util.concurrent.ConcurrentHashMap) aVar.f445709b).clear();
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        ((java.util.concurrent.ConcurrentHashMap) em4.c.f255214b).clear();
        ((pg3.v) ((n40.n) i95.n0.c(n40.n.class))).wi(true);
        p1();
        h1();
        g1();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yj(com.tencent.mm.plugin.finder.extension.reddot.b3.f105414e);
    }

    public final void r1(com.tencent.mm.ui.GameIconViewTipPreference gameIconViewTipPreference, int i17, int i18, int i19, boolean z17, int i27, int i28, int i29, com.tencent.mm.autogen.events.QueryGameMessageEvent queryGameMessageEvent) {
        com.tencent.mm.ui.g6 g6Var = this.f196655v;
        if (g6Var.b()) {
            g6Var.c(queryGameMessageEvent);
            this.D = true;
            q1(gameIconViewTipPreference, 8, 8, 8, false, 8, 8, 8);
        } else {
            if (this.D) {
                gameIconViewTipPreference.y(false);
            }
            this.D = false;
            q1(gameIconViewTipPreference, i17, i18, i19, z17, i27, i28, i29);
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    public void s0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "on tab resume isTabSwitchInReport:%b isTabResumeReport:%b", java.lang.Boolean.valueOf(this.P1), java.lang.Boolean.valueOf(this.Q1));
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.tencent.mm.plugin.finder.extension.reddot.b3 b3Var = com.tencent.mm.plugin.finder.extension.reddot.b3.f105414e;
        com.tencent.mm.ui.base.preference.h0 h0Var = this.f196656w;
        c61.l7 l7Var = (c61.l7) b6Var;
        l7Var.getClass();
        l7Var.nk().r(b3Var, h0Var);
        tm0.e eVar = this.f196653t;
        eVar.b();
        if (eVar.b() && !eVar.f420459e) {
            eVar.f420459e = true;
            eVar.c(eVar.f420460f);
            eVar.a().notify(kz5.b0.c(new tm0.a(tm0.b.f420449e, eVar)));
        }
        e1();
        com.tencent.mm.ui.base.preference.h0 h0Var2 = this.f196656w;
        if ((h0Var2 instanceof com.tencent.mm.ui.base.preference.h0) && h0Var2.A == 0) {
            h0Var2.A = java.lang.System.currentTimeMillis();
        }
        this.F = true;
        this.H = true;
        this.L = true;
        p1();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi().add(this.W);
        com.tencent.mm.pluginsdk.event.IListenerMStorage.d(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), this.f196650p0);
        com.tencent.mm.pluginsdk.event.IListenerMStorage.d(com.tencent.mm.autogen.events.ShakeMessageStorageNotifyEvent.class.getName(), this.f196661y0);
        com.tencent.mm.pluginsdk.event.IListenerMStorage.d(com.tencent.mm.autogen.events.GameLifeStorageNotifyEvent.class.getName(), this.f196658x0);
        this.Y.alive();
        this.V.alive();
        this.Z.alive();
        this.X.alive();
        this.f196649l1.alive();
        this.A1.alive();
        this.B1.alive();
        r21.w.Di().add(this);
        ((l75.a1) c01.d9.b().r()).a(this);
        c01.d9.b().a(this);
        c01.d9.b().p().a(this);
        if (o25.w1.b() != null) {
            ((com.tencent.mm.plugin.sns.model.l4) o25.w1.b()).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
            java.util.List list = com.tencent.mm.plugin.sns.model.c3.f164113h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            java.util.LinkedList linkedList = (java.util.LinkedList) com.tencent.mm.plugin.sns.model.c3.f164113h;
            if (!linkedList.contains(this)) {
                linkedList.add(this);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.imk);
        if (findViewById != null && findViewById.getVisibility() != 8) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.ui.t5(this, findViewById));
        }
        if (isAdded()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.w5(this));
        }
        u1();
        if (!this.P1 && !this.Q1) {
            if (T0()) {
                ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
                androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.finder.extension.reddot.ca.f105446a;
                com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
                com.tencent.mm.plugin.finder.extension.reddot.ca.f105447b = (aj0Var.K() ? ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f128432a.e(com.tencent.mm.plugin.finder.storage.t70.f127590a, "是否使用新的DSL红点曝光上报逻辑（修复completeType错误问题）", e42.d0.clicfg_finder_dsl_render_state_new_report_logic, 0, false, com.tencent.mm.plugin.finder.storage.ce0.f126582d)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126467u).getValue()).r()).intValue()) == 1;
                if (aj0Var.K()) {
                    com.tencent.mm.plugin.finder.storage.z70 z70Var = com.tencent.mm.plugin.finder.storage.z70.f128432a;
                    com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    e42.d0 d0Var = e42.d0.clicfg_gallery_image_edit_icon_hide;
                    com.tencent.mm.plugin.finder.storage.FinderConfigXLabData finderConfigXLabData = (com.tencent.mm.plugin.finder.storage.FinderConfigXLabData) ((jz5.n) com.tencent.mm.plugin.finder.storage.z70.f128435d).getValue();
                    finderConfigXLabData.getClass();
                } else {
                    ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126467u).getValue()).l();
                }
                com.tencent.mm.plugin.finder.extension.reddot.ca.f105448c = (aj0Var.K() ? ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "DSL红点保存RenderState", e42.d0.clicfg_finder_dsl_cache_render_state_for_report, 1, false, com.tencent.mm.plugin.finder.storage.nd0.f127247d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.P).getValue()).r()).intValue()) == 1;
                com.tencent.mars.xlog.Log.i("FinderRedDotRenderNotify", "renderStateReportNewLogic=" + com.tencent.mm.plugin.finder.extension.reddot.ca.f105447b + ",dslCacheRenderState=" + com.tencent.mm.plugin.finder.extension.reddot.ca.f105448c);
                ((com.tencent.mm.plugin.finder.extension.reddot.x2) ((c61.l7) i95.n0.c(c61.l7.class)).nk()).Y0(false, "findMoreFriendsTabResume");
                m1(true, null, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderEntrance"));
                gz2.c.e("finder");
            }
            if (U0()) {
                ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).cj(ra0.b0.f393463f, ra0.b0.f393464g, true, 108);
                int s17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().s();
                if (s17 > 0) {
                    ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).hj(s17, ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r().f384113d, true);
                }
            }
            rg5.o oVar = this.M1;
            boolean e17 = oVar != null ? oVar.e() : true;
            o1("onTabResume", java.lang.Boolean.TRUE);
            if (e17) {
                gz2.c.e("live");
            }
            if ((this.Q & 32768) == 0) {
                gz2.c.e("sns");
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.x5(this));
            this.Q1 = true;
        }
        ((jd0.c) ((kd0.e2) i95.n0.c(kd0.e2.class))).getClass();
        uy3.z.b(2, 0L);
        ((pg3.v) ((n40.n) i95.n0.c(n40.n.class))).wi(false);
        f1();
        if (com.tencent.mm.ui.a4.f197117a.h(thisActivity())) {
            ((com.tencent.mm.ui.FrostedContentView) findViewById(com.tencent.mm.R.id.jlt)).a(true, 0, 0.0f);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "on tab resume end");
    }

    public final void s1(com.tencent.mm.ui.base.preference.IconPreference iconPreference, int i17, int i18, boolean z17, int i19, int i27, int i28) {
        iconPreference.c0(i17);
        iconPreference.b0(i18);
        iconPreference.e0(z17);
        iconPreference.Y(i19);
        iconPreference.T(i27);
        iconPreference.V(i28);
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        return false;
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    public void t0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "on tab start");
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f37061a.c("lifeappreddot", this.f196662y1);
    }

    public final boolean t1() {
        boolean P0 = P0(2097152L);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        boolean l17 = su4.r2.l();
        j45.l.g(ya.a.SEARCH);
        boolean z17 = P0 || l17;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "openSearch %s, plugin installed %s isTeenMode: %s", java.lang.Boolean.valueOf(!P0), java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(l17));
        }
        return z17;
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    public void u0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "on tab stop");
    }

    public final void u1() {
        android.view.View findViewById = getView().getRootView().findViewById(com.tencent.mm.R.id.huj);
        int a17 = com.tencent.mm.ui.bl.a(getContext());
        int i17 = com.tencent.mm.ui.bl.i(getContext(), -1);
        com.tencent.mm.ui.v4 v4Var = new com.tencent.mm.ui.v4(this, findViewById);
        if (i17 <= 0) {
            getView().post(v4Var);
            return;
        }
        int K0 = K0();
        int height = findViewById.getHeight();
        if (com.tencent.mm.ui.a4.f197117a.h(thisActivity())) {
            getView().setPadding(0, K0, 0, 0);
        } else {
            getView().setPadding(0, K0, 0, height);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] statusHeight:%s actionBarHeight:%s tabBarHeight:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(height));
        getView().postDelayed(v4Var, 100L);
    }

    public final void v1() {
        m3.d[] dVarArr = new m3.d[11];
        dVarArr[0] = new m3.d("find_friends_by_near", com.tencent.mm.sdk.platformtools.f9.DiscoveryNearby);
        dVarArr[1] = new m3.d("find_live_friends_by_near", com.tencent.mm.sdk.platformtools.a0.c() ? com.tencent.mm.sdk.platformtools.f9.DiscoveryNearbyLiveFriends_GP : com.tencent.mm.sdk.platformtools.f9.DiscoveryNearbyLiveFriends);
        dVarArr[2] = new m3.d("find_friends_by_shake", com.tencent.mm.sdk.platformtools.f9.DiscoveryShake);
        dVarArr[3] = new m3.d("find_friends_by_qrcode", com.tencent.mm.sdk.platformtools.f9.GlobalScan);
        dVarArr[4] = new m3.d("more_tab_game_recommend", com.tencent.mm.sdk.platformtools.f9.DiscoveryGame);
        dVarArr[5] = new m3.d("jd_market_entrance", com.tencent.mm.sdk.platformtools.f9.DiscoveryShop);
        dVarArr[6] = new m3.d("app_brand_entrance", com.tencent.mm.sdk.platformtools.f9.DiscoveryAppbrand);
        dVarArr[7] = new m3.d("find_friends_by_search", com.tencent.mm.sdk.platformtools.f9.DiscoverySearch);
        dVarArr[8] = new m3.d("find_friends_by_look", com.tencent.mm.sdk.platformtools.f9.DiscoveryLooks);
        com.tencent.mm.sdk.platformtools.f9 f9Var = com.tencent.mm.sdk.platformtools.f9.DiscoveryChannels;
        dVarArr[9] = new m3.d("find_friends_by_finder", f9Var);
        dVarArr[10] = new m3.d("find_friends_by_finder_live", f9Var);
        for (m3.d dVar : java.util.Arrays.asList(dVarArr)) {
            com.tencent.mm.ui.base.preference.Preference h17 = this.f196656w.h((java.lang.String) dVar.f323092a);
            if (h17 instanceof com.tencent.mm.ui.base.preference.IconPreference) {
                com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) h17;
                com.tencent.mm.sdk.platformtools.f9 f9Var2 = (com.tencent.mm.sdk.platformtools.f9) dVar.f323093b;
                if (f9Var2.h()) {
                    this.f196656w.m((java.lang.String) dVar.f323092a, true);
                }
                f9Var2.getClass();
                if (!com.tencent.mm.sdk.platformtools.f9.m(f9Var2) || com.tencent.mm.sdk.platformtools.f9.p(f9Var2.f192709d)) {
                    iconPreference.getClass();
                }
            }
        }
    }

    public final void w1() {
        boolean z17 = false;
        this.I = false;
        com.tencent.mm.ui.GameIconViewTipPreference gameIconViewTipPreference = (com.tencent.mm.ui.GameIconViewTipPreference) this.f196656w.h("more_tab_game_recommend");
        if (gameIconViewTipPreference == null) {
            return;
        }
        if (this.M == null) {
            this.M = new com.tencent.mm.ui.k5(this, gameIconViewTipPreference);
        }
        android.view.View view = gameIconViewTipPreference.W1;
        if (view == null) {
            this.f196656w.c(this.M);
            return;
        }
        int firstVisiblePosition = this.f196656w.f197819u.getFirstVisiblePosition();
        if (this.f196656w.o("more_tab_game_recommend") > this.f196656w.f197819u.getLastVisiblePosition() || this.f196656w.o("more_tab_game_recommend") < firstVisiblePosition) {
            this.f196656w.c(this.M);
        } else {
            android.graphics.Rect rect = new android.graphics.Rect();
            boolean localVisibleRect = view.getLocalVisibleRect(rect);
            this.I = localVisibleRect;
            if (localVisibleRect) {
                com.tencent.mm.plugin.game.l1 l1Var = (com.tencent.mm.plugin.game.l1) ((m33.q1) i95.n0.c(m33.q1.class));
                l1Var.getClass();
                try {
                    ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.k1(l1Var, "game.gameEntryExpose", new cl0.g()), "GameLiteAppStoreService.SerialQueue");
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.opensdk.utils.Log.e("MicroMsg.GameLiteAppStoreService", "notifyGameEntryExpose exp:" + e17);
                }
                if (rect.height() == view.getHeight() && rect.width() == view.getWidth()) {
                    this.f196656w.u(this.M);
                    z17 = true;
                } else {
                    this.f196656w.c(this.M);
                }
            } else {
                this.f196656w.c(this.M);
            }
        }
        gameIconViewTipPreference.n0(this.f196656w);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(gameIconViewTipPreference);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.l5(this, z17), "updateGame");
    }

    public final void x0(r45.pm6 pm6Var, r45.lb lbVar) {
        r45.v80 v80Var;
        r45.eh6 eh6Var;
        if (lbVar == null || (v80Var = lbVar.f379284d) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "analysisRedDotXml attributeXml empty");
            return;
        }
        if (android.text.TextUtils.isEmpty(v80Var.f387981d) && ((eh6Var = lbVar.f379284d.f387982e) == null || (android.text.TextUtils.isEmpty(eh6Var.f373501d) && android.text.TextUtils.isEmpty(lbVar.f379284d.f387982e.f373502e)))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "analysisRedDotXml invalid attributeXml!");
            return;
        }
        r45.v80 v80Var2 = lbVar.f379284d;
        pm6Var.f383187e = v80Var2.f387981d;
        r45.eh6 eh6Var2 = v80Var2.f387982e;
        if (eh6Var2 != null) {
            pm6Var.f383190h = eh6Var2.f373501d;
            pm6Var.f383192m = eh6Var2.f373502e;
            pm6Var.f383191i = eh6Var2.f373503f;
            pm6Var.f383193n = eh6Var2.f373504g;
            pm6Var.f383197r = eh6Var2.f373505h;
            pm6Var.f383198s = eh6Var2.f373506i;
        }
        pm6Var.f383196q = v80Var2.f387983f;
        pm6Var.f383194o = true;
    }

    public final boolean x1(java.lang.String str, java.lang.String str2) {
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(str);
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(str2);
        com.tencent.mm.ui.e6 e6Var = (z17 && z18) ? com.tencent.mm.ui.e6.TYPE_IMG_TEXT : z18 ? com.tencent.mm.ui.e6.TYPE_IMG : z17 ? com.tencent.mm.ui.e6.TYPE_TEXT : com.tencent.mm.ui.e6.TYPE_NORMAL;
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "new type: %s, now type: %s.", e6Var, this.f196659x1);
        if (e6Var.compareTo(this.f196659x1) < 0) {
            return false;
        }
        this.f196659x1 = e6Var;
        return true;
    }

    public final void y0(android.content.Intent intent, java.lang.String str) {
        if (intent != null) {
            intent.removeExtra("key_yreportsdk_reddot_info");
        }
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().E()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "bindRedDotInfoInFinderLive cost[%d] size[%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - android.os.SystemClock.elapsedRealtime()), java.lang.Integer.valueOf(l1(intent, str, null)));
        }
    }

    public final void y1() {
        java.lang.String str;
        if (this.H1 == null) {
            this.H1 = new rg5.r(getContext(), this);
        }
        rg5.r rVar = this.H1;
        rVar.getClass();
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = rVar.f395276b;
        if (isTeenMode) {
            findMoreFriendsUI.f196656w.m("find_friends_by_near", true);
            findMoreFriendsUI.f196656w.m("find_live_friends_by_near", true);
            findMoreFriendsUI.f196656w.m("find_friends_by_near_v3", true);
            if (!findMoreFriendsUI.Q0()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(953L, 5L, 1L);
            }
            com.tencent.mars.xlog.Log.i("NearbyEntryPreferenceMgr", "updateNearbyEntry return for isTeenMode.");
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            vd2.t3 t3Var = vd2.t3.f435921a;
            boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) ae2.in.f3898v1).getValue()).r()).booleanValue();
            com.tencent.mm.ui.report.e0 e0Var = com.tencent.mm.ui.report.e0.f209633a;
            if (booleanValue && ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai()) {
                findMoreFriendsUI.f196656w.m("find_friends_by_near", true);
                findMoreFriendsUI.f196656w.m("find_live_friends_by_near", true);
                boolean z17 = !findMoreFriendsUI.P0(70368744177664L);
                boolean z18 = (findMoreFriendsUI.Q & 512) == 0;
                if (z17) {
                    if (findMoreFriendsUI.F) {
                        com.tencent.mm.ui.report.e0.f209634b = "";
                        str = "null cannot be cast to non-null type com.tencent.mm.ui.FinderIconViewTipPreference";
                        e0Var.e(1L, 2L, com.tencent.mm.ui.report.e0.b());
                    } else {
                        str = "null cannot be cast to non-null type com.tencent.mm.ui.FinderIconViewTipPreference";
                    }
                    findMoreFriendsUI.f196656w.m("find_friends_by_near_v3", false);
                    com.tencent.mm.ui.base.preference.Preference h17 = findMoreFriendsUI.f196656w.h("find_friends_by_near_v3");
                    kotlin.jvm.internal.o.e(h17, str);
                    rVar.a((com.tencent.mm.ui.FinderIconViewTipPreference) h17, z18);
                    com.tencent.mars.xlog.Log.i("NearbyEntryPreferenceMgr", "updateNearbyEntryV3");
                    r5 = 1;
                } else {
                    findMoreFriendsUI.f196656w.m("find_friends_by_near_v3", true);
                    com.tencent.mars.xlog.Log.w("NearbyEntryPreferenceMgr", "updateNearbyEntryV3 return for openNearbyLiveFriends:%s", java.lang.Boolean.valueOf(z17));
                }
            } else {
                findMoreFriendsUI.f196656w.m("find_friends_by_near_v3", true);
                if (m25.a.b()) {
                    findMoreFriendsUI.f196656w.m("find_friends_by_near", true);
                    boolean z19 = !findMoreFriendsUI.P0(70368744177664L);
                    boolean z27 = (findMoreFriendsUI.Q & 512) == 0;
                    if (z19) {
                        if (findMoreFriendsUI.F) {
                            com.tencent.mm.ui.report.e0.f209634b = "";
                            com.tencent.mm.ui.report.e0.f209635c = "";
                            e0Var.e(1L, 0L, com.tencent.mm.ui.report.e0.b());
                        }
                        findMoreFriendsUI.f196656w.m("find_live_friends_by_near", false);
                        com.tencent.mm.ui.base.preference.Preference h18 = findMoreFriendsUI.f196656w.h("find_live_friends_by_near");
                        kotlin.jvm.internal.o.e(h18, "null cannot be cast to non-null type com.tencent.mm.ui.FinderIconViewTipPreference");
                        com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference = (com.tencent.mm.ui.FinderIconViewTipPreference) h18;
                        com.tencent.mars.xlog.Log.i("NearbyEntryPreferenceMgr", "updateNearbyLiveFriendsEntry");
                        if ((z27 ? r21.w.Bi().f() : 0) <= 0) {
                            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FIRST_SHOW_NEARBY_REDDOT_BOOLEAN_SYNC;
                            if (c17.o(u3Var, true) && ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().v()) {
                                com.tencent.mars.xlog.Log.i("NearbyEntryPreferenceMgr", "updateNearbyLiveFriendsEntry: add nearby new red dot");
                                com.tencent.mm.plugin.finder.extension.reddot.na naVar = (com.tencent.mm.plugin.finder.extension.reddot.na) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().j0();
                                naVar.getClass();
                                r45.vs2 vs2Var = new r45.vs2();
                                vs2Var.f388490h = java.lang.String.valueOf(c01.id.c());
                                vs2Var.f388486d = 100000;
                                vs2Var.f388487e = 1011;
                                r45.f03 f03Var = new r45.f03();
                                f03Var.f373887d = 6;
                                f03Var.f373891h = 1;
                                f03Var.f373892i = "NearbyEntrance";
                                vs2Var.f388489g.add(f03Var);
                                naVar.f105729a.w(vs2Var, "addNearbyNewRedDot");
                                gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                            }
                        }
                        rVar.a(finderIconViewTipPreference, z27);
                        rVar.b(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().v());
                        r5 = 1;
                    } else {
                        findMoreFriendsUI.f196656w.m("find_live_friends_by_near", true);
                        com.tencent.mars.xlog.Log.w("NearbyEntryPreferenceMgr", "updateNearbyLiveFriendsEntry return for openNearbyLiveFriends:%s", java.lang.Boolean.valueOf(z19));
                    }
                } else {
                    findMoreFriendsUI.f196656w.m("find_live_friends_by_near", true);
                    androidx.lifecycle.k0 k0Var = rVar.f395277c;
                    if (k0Var != null) {
                        ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
                        com.tencent.mm.plugin.finder.extension.reddot.aa.f105359d.removeObserver(k0Var);
                    }
                    boolean z28 = (findMoreFriendsUI.Q & 512) == 0;
                    j45.l.g("nearby");
                    com.tencent.mars.xlog.Log.i("NearbyEntryPreferenceMgr", "updateNearbyFriendsEntry enableNearbyFriends:" + z28 + ", nearbyPluginInstalled:true");
                    if (z28) {
                        findMoreFriendsUI.f196656w.m("find_friends_by_near", false);
                        com.tencent.mm.ui.base.preference.Preference h19 = findMoreFriendsUI.f196656w.h("find_friends_by_near");
                        kotlin.jvm.internal.o.e(h19, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.IconPreference");
                        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) h19;
                        com.tencent.mm.autogen.events.LbsroomLogicEvent lbsroomLogicEvent = new com.tencent.mm.autogen.events.LbsroomLogicEvent();
                        lbsroomLogicEvent.f54466g.f7621a = 7;
                        lbsroomLogicEvent.e();
                        boolean z29 = lbsroomLogicEvent.f54467h.f7713a;
                        android.content.Context context = rVar.f395275a;
                        if (z29) {
                            iconPreference.T(8);
                        } else {
                            iconPreference.T(0);
                            iconPreference.Y(0);
                            android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_footstep, context.getResources().getColor(com.tencent.mm.R.color.f478694eb));
                            iconPreference.R = e17;
                            iconPreference.f197756y1 = null;
                            iconPreference.Q = -1;
                            android.widget.ImageView imageView = iconPreference.S;
                            if (imageView != null) {
                                imageView.setImageDrawable(e17);
                            }
                            iconPreference.Z(com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479693cs), com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479693cs));
                        }
                        int f17 = r21.w.Bi().f();
                        if (!m25.a.c() || m25.a.b()) {
                            if (f17 > 0) {
                                iconPreference.a0(0);
                                int b17 = com.tencent.mm.ui.tools.pd.b(context, f17);
                                iconPreference.V = "" + f17;
                                iconPreference.W = b17;
                                com.tencent.mm.ui.report.e0.c(f17);
                            } else {
                                iconPreference.a0(8);
                                iconPreference.V = "";
                                iconPreference.W = -1;
                            }
                        } else if (f17 > 0) {
                            iconPreference.c0(0);
                            com.tencent.mm.ui.report.e0.c(f17);
                        } else {
                            iconPreference.c0(8);
                        }
                        r5 = 1;
                    } else {
                        findMoreFriendsUI.f196656w.m("find_friends_by_near", true);
                        if (!findMoreFriendsUI.Q0()) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(953L, 5L, 1L);
                        }
                    }
                }
            }
        }
        if (r5 != 0) {
            this.S++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x03f0, code lost:
    
        if (r3 != 23) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03f3, code lost:
    
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z0(r45.f03 r30, com.tencent.mm.ui.FinderIconViewTipPreference r31, boolean r32, boolean r33, boolean r34, r45.f03 r35) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.FindMoreFriendsUI.z0(r45.f03, com.tencent.mm.ui.FinderIconViewTipPreference, boolean, boolean, boolean, r45.f03):void");
    }

    public final void z1() {
        if (t1()) {
            this.f196656w.m("find_friends_by_search", true);
            if (Q0()) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(953L, 4L, 1L);
            return;
        }
        this.S++;
        this.f196656w.m("find_friends_by_search", false);
        try {
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            org.json.JSONObject d17 = su4.o2.d("discoverSearchEntry");
            java.lang.String optString = d17.optString("wording");
            d17.optString("androidIcon");
            com.tencent.mm.ui.websearch.WebSearchTipPreference webSearchTipPreference = (com.tencent.mm.ui.websearch.WebSearchTipPreference) this.f196656w.h("find_friends_by_search");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                webSearchTipPreference.L(getString(com.tencent.mm.R.string.f491241cg4));
            } else {
                webSearchTipPreference.L(optString);
            }
            webSearchTipPreference.n0(this.f196656w);
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(webSearchTipPreference);
            k70.f0 f0Var = this.C1;
            com.tencent.mm.ui.y5 y5Var = new com.tencent.mm.ui.y5(this);
            webSearchTipPreference.f152360d2 = f0Var;
            webSearchTipPreference.f152361e2 = y5Var;
            webSearchTipPreference.h0();
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            if (!ug0.q.f427472n) {
                B0(webSearchTipPreference, null, false, null, null, false, null, null);
                su4.g3 g3Var = su4.g3.f412902d;
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.u4(this, webSearchTipPreference, g3Var.f412903a));
                if (com.tencent.mm.ui.LauncherUI.getCurrentTabIndex() == 2) {
                    g3Var.a(1);
                    return;
                }
                return;
            }
            bm5.p1 p1Var = this.f196664z1;
            if (!p1Var.c()) {
                tg0.w1 w1Var = (tg0.w1) i95.n0.c(tg0.w1.class);
                e75.a aVar = (e75.a) p1Var.b();
                sg0.u3 u3Var = (sg0.u3) w1Var;
                j75.f Ai = u3Var.Ai();
                j75.f fVar = null;
                if (Ai != null && (Ai.getState() instanceof ug0.x)) {
                    fVar = u3Var.Ai();
                }
                fVar.m3(this, new sg0.t3(u3Var, aVar));
            }
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).Zi(new tg0.p2("FindMoreFriendsUI<updateSearchEntry>"));
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "updateSearchEntry, start observing WebSearchState.");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FindMoreFriendsUI", e17, "update search entry exception!", new java.lang.Object[0]);
        }
    }
}
