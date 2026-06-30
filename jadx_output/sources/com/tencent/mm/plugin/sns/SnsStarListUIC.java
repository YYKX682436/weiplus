package com.tencent.mm.plugin.sns;

/* loaded from: classes4.dex */
public final class SnsStarListUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f162541d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.LoadingMoreView f162542e;

    /* renamed from: f, reason: collision with root package name */
    public sb4.w f162543f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.statistics.b0 f162544g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f162545h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f162546i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f162547m;

    /* renamed from: n, reason: collision with root package name */
    public int f162548n;

    /* renamed from: o, reason: collision with root package name */
    public int f162549o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.d6 f162550p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f162551q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.data.SnsCmdList f162552r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f162553s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f162554t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f162555u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsStarListUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f162541d = jz5.h.b(new n34.j4(this));
        this.f162542e = new com.tencent.mm.plugin.sns.ui.LoadingMoreView(activity);
        this.f162546i = "";
        this.f162551q = "";
        this.f162552r = new com.tencent.mm.plugin.sns.data.SnsCmdList();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f162554t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.SnsStarListUIC$musicPlayerListener$1
            {
                this.__eventId = -1155728636;
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
            
                if (r5 != 7) goto L22;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = "callback"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.SnsStarListUIC$musicPlayerListener$1"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    com.tencent.mm.autogen.events.MusicPlayerEvent r5 = (com.tencent.mm.autogen.events.MusicPlayerEvent) r5
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    java.lang.String r2 = "event"
                    kotlin.jvm.internal.o.g(r5, r2)
                    am.jk r5 = r5.f54512g
                    int r5 = r5.f7036b
                    com.tencent.mm.plugin.sns.SnsStarListUIC r2 = com.tencent.mm.plugin.sns.SnsStarListUIC.this
                    if (r5 == 0) goto L4c
                    r3 = 1
                    if (r5 == r3) goto L4c
                    r3 = 2
                    if (r5 == r3) goto L4c
                    r3 = 3
                    if (r5 == r3) goto L4c
                    r3 = 4
                    if (r5 == r3) goto L29
                    r3 = 7
                    if (r5 == r3) goto L4c
                    goto L55
                L29:
                    java.lang.String r5 = "MicroMsg.SnsStarListUIC"
                    java.lang.String r3 = "musicPlayerListener error"
                    com.tencent.mars.xlog.Log.i(r5, r3)
                    sb4.w r5 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(r2)
                    if (r5 == 0) goto L3a
                    r5.notifyDataSetChanged()
                L3a:
                    androidx.appcompat.app.AppCompatActivity r5 = r2
                    r3 = 2131772157(0x7f1042fd, float:1.9175665E38)
                    java.lang.String r5 = r5.getString(r3)
                    java.lang.String r3 = "getString(...)"
                    kotlin.jvm.internal.o.f(r5, r3)
                    com.tencent.mm.plugin.sns.SnsStarListUIC.T6(r2, r5)
                    goto L55
                L4c:
                    sb4.w r5 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(r2)
                    if (r5 == 0) goto L55
                    r5.notifyDataSetChanged()
                L55:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    r5 = 0
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.SnsStarListUIC$musicPlayerListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f162555u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicCheckErrorEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1
            {
                this.__eventId = -1443570203;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicCheckErrorEvent musicCheckErrorEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1");
                com.tencent.mm.autogen.events.MusicCheckErrorEvent event = musicCheckErrorEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListUIC", "musicCheckErrorListener check error");
                am.ik ikVar = event.f54511g;
                if (ikVar.f6956a == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsStarListUIC", "musicCheckErrorListener, must has error.");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1");
                } else {
                    java.lang.String string = !com.tencent.mm.sdk.platformtools.t8.K0(ikVar.f6957b) ? ikVar.f6957b : androidx.appcompat.app.AppCompatActivity.this.getString(com.tencent.mm.R.string.h4e);
                    kotlin.jvm.internal.o.d(string);
                    com.tencent.mm.plugin.sns.SnsStarListUIC.T6(this, string);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1");
                return false;
            }
        };
    }

    public static final /* synthetic */ java.lang.String O6(com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAlbumSessionId$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        java.lang.String str = snsStarListUIC.f162551q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAlbumSessionId$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return str;
    }

    public static final /* synthetic */ android.widget.ListView P6(com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsSlotLv", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        android.widget.ListView U6 = snsStarListUIC.U6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsSlotLv", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return U6;
    }

    public static final /* synthetic */ sb4.w Q6(com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getStarListAdapter$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        sb4.w wVar = snsStarListUIC.f162543f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getStarListAdapter$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return wVar;
    }

    public static final /* synthetic */ java.lang.String R6(com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUserName$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        java.lang.String str = snsStarListUIC.f162546i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUserName$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return str;
    }

    public static final void S6(com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onFeedClick", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        snsStarListUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFeedClick", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        java.util.ArrayList arrayList = ta4.h1.f416750a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        if (snsInfo != null) {
            java.lang.String s07 = ca4.z0.s0(snsInfo.field_snsId);
            java.util.ArrayList arrayList2 = ta4.h1.f416751b;
            if (!arrayList2.contains(s07)) {
                arrayList2.add(s07);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.tencent.mm.plugin.sns.statistics.b0 b0Var = snsStarListUIC.f162544g;
        if (b0Var != null) {
            b0Var.b(snsInfo);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFeedClick", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onFeedClick", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    public static final void T6(com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$processPlayError", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        snsStarListUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processPlayError", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        db5.t7.g(snsStarListUIC.getActivity(), str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processPlayError", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$processPlayError", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    public final android.widget.ListView U6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsSlotLv", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        java.lang.Object value = ((jz5.n) this.f162541d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.ListView listView = (android.widget.ListView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsSlotLv", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return listView;
    }

    public final java.lang.Object V6(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showEndFooterView", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new n34.i4(this, null), continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEndFooterView", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return g17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListUIC", "from gallery return in list UI");
            com.tencent.mm.plugin.sns.data.SnsCmdList snsCmdList = intent != null ? (com.tencent.mm.plugin.sns.data.SnsCmdList) intent.getParcelableExtra("sns_cmd_list") : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            if (snsCmdList == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            } else {
                java.util.List<java.lang.Integer> c17 = snsCmdList.c();
                kotlin.jvm.internal.o.d(c17);
                boolean z17 = !c17.isEmpty();
                com.tencent.mm.plugin.sns.data.SnsCmdList snsCmdList2 = this.f162552r;
                if (z17) {
                    java.util.List c18 = snsCmdList2.c();
                    for (java.lang.Integer num : c17) {
                        java.util.LinkedList linkedList = (java.util.LinkedList) c18;
                        if (!linkedList.contains(num)) {
                            linkedList.add(num);
                        }
                    }
                }
                java.util.List<java.lang.Integer> b17 = snsCmdList.b();
                kotlin.jvm.internal.o.d(b17);
                if (true ^ b17.isEmpty()) {
                    java.util.List b18 = snsCmdList2.b();
                    for (java.lang.Integer num2 : b17) {
                        java.util.LinkedList linkedList2 = (java.util.LinkedList) b18;
                        if (!linkedList2.contains(num2)) {
                            linkedList2.add(num2);
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_USER_NAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f162546i = stringExtra;
        this.f162547m = getIntent().getBooleanExtra("KEY_IS_SELF", false);
        java.lang.String stringExtra2 = getIntent().getStringExtra("INTENT_ALBUM_COMMENT_SESSION_ID");
        this.f162551q = stringExtra2 != null ? stringExtra2 : "";
        this.f162548n = getIntent().getIntExtra("KEY_SNS_SOURCE", 0);
        this.f162550p = com.tencent.mm.plugin.sns.model.l4.Kj();
        this.f162545h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_moments_interaction_enabled_v2, true);
        this.f162543f = new sb4.w(this.f162545h, new n34.f4(this), getActivity(), this.f162546i);
        U6().setAdapter((android.widget.ListAdapter) this.f162543f);
        U6().addFooterView(this.f162542e);
        U6().setOnScrollListener(new n34.g4(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.model.l4.Kj().b(this.f162546i);
        java.util.ArrayList arrayList = ta4.h1.f416750a;
        java.lang.String albumSessionId = this.f162551q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        kotlin.jvm.internal.o.g(albumSessionId, "albumSessionId");
        ta4.h1.f416752c.f60772e = com.tencent.mm.plugin.sns.statistics.s0.f164937k0.y().f60772e;
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct = ta4.h1.f416752c;
        snsUserBehaviourInfoStruct.f60792y = 2L;
        snsUserBehaviourInfoStruct.f60793z = snsUserBehaviourInfoStruct.b("albumSessionid", albumSessionId, true);
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct2 = ta4.h1.f416752c;
        java.util.ArrayList arrayList2 = ta4.h1.f416750a;
        snsUserBehaviourInfoStruct2.f60775h = arrayList2.size();
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct3 = ta4.h1.f416752c;
        java.util.ArrayList arrayList3 = ta4.h1.f416751b;
        snsUserBehaviourInfoStruct3.f60776i = arrayList3.size();
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct4 = ta4.h1.f416752c;
        snsUserBehaviourInfoStruct4.f60786s = snsUserBehaviourInfoStruct4.b("AlbumClickFeedListStr", com.tencent.mm.sdk.platformtools.t8.c1(arrayList3, "|"), true);
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct5 = ta4.h1.f416752c;
        snsUserBehaviourInfoStruct5.f60777j = ta4.h1.f416758i;
        java.util.ArrayList arrayList4 = ta4.h1.f416753d;
        snsUserBehaviourInfoStruct5.f60779l = arrayList4.size();
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct6 = ta4.h1.f416752c;
        java.util.ArrayList arrayList5 = ta4.h1.f416754e;
        snsUserBehaviourInfoStruct6.f60780m = arrayList5.size();
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct7 = ta4.h1.f416752c;
        snsUserBehaviourInfoStruct7.f60781n = ta4.h1.f416760k;
        java.util.ArrayList arrayList6 = ta4.h1.f416755f;
        snsUserBehaviourInfoStruct7.f60782o = arrayList6.size();
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct8 = ta4.h1.f416752c;
        java.util.ArrayList arrayList7 = ta4.h1.f416756g;
        snsUserBehaviourInfoStruct8.f60783p = arrayList7.size();
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct9 = ta4.h1.f416752c;
        long j17 = ta4.h1.f416762m;
        snsUserBehaviourInfoStruct9.f60784q = j17;
        snsUserBehaviourInfoStruct9.f60785r = ta4.h1.f416758i + ta4.h1.f416760k + j17;
        snsUserBehaviourInfoStruct9.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        arrayList2.clear();
        arrayList3.clear();
        arrayList4.clear();
        arrayList5.clear();
        arrayList6.clear();
        arrayList7.clear();
        ta4.h1.f416757h = 0L;
        ta4.h1.f416758i = 0L;
        ta4.h1.f416759j = 0L;
        ta4.h1.f416760k = 0L;
        ta4.h1.f416761l = 0L;
        ta4.h1.f416762m = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        ta4.h1.f416752c = new com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        super.onPause();
        this.f162555u.dead();
        this.f162554t.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        this.f162554t.alive();
        this.f162555u.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }
}
