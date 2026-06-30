package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class kw {
    public static int A;
    public static com.tencent.mm.plugin.sns.model.k4 B;
    public static long C;
    public static final android.view.View.OnClickListener D = new com.tencent.mm.plugin.sns.ui.hx();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.rx f169653a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f169654b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f169655c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f169656d = new com.tencent.mm.plugin.sns.ui.lx(this);

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnClickListener f169657e = new com.tencent.mm.plugin.sns.ui.mx(this);

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View.OnClickListener f169658f = new com.tencent.mm.plugin.sns.ui.nx(this);

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View.OnClickListener f169659g = new com.tencent.mm.plugin.sns.ui.px(this);

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f169660h = new com.tencent.mm.plugin.sns.ui.qx(this);

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnClickListener f169661i = new com.tencent.mm.plugin.sns.ui.lw(this);

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View.OnClickListener f169662j = new com.tencent.mm.plugin.sns.ui.mw(this);

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View.OnClickListener f169663k = new com.tencent.mm.plugin.sns.ui.nw(this);

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View.OnClickListener f169664l;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f169665m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnClickListener f169666n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f169667o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f169668p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnClickListener f169669q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f169670r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f169671s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f169672t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnClickListener f169673u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f169674v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f169675w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View.OnClickListener f169676x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View.OnClickListener f169677y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View.OnClickListener f169678z;

    public kw(android.content.Context context, com.tencent.mm.plugin.sns.ui.rx rxVar, int i17, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        new com.tencent.mm.plugin.sns.ui.qw(this);
        this.f169664l = new com.tencent.mm.plugin.sns.ui.rw(this);
        this.f169665m = new com.tencent.mm.plugin.sns.ui.sw(this);
        this.f169666n = new com.tencent.mm.plugin.sns.ui.kw$$c();
        this.f169667o = new com.tencent.mm.plugin.sns.ui.tw(this);
        this.f169668p = new com.tencent.mm.plugin.sns.ui.uw(this);
        this.f169669q = new com.tencent.mm.plugin.sns.ui.vw(this);
        this.f169670r = new com.tencent.mm.plugin.sns.ui.ww(this);
        this.f169671s = new com.tencent.mm.plugin.sns.ui.yw(this);
        this.f169672t = new com.tencent.mm.plugin.sns.ui.zw(this);
        this.f169673u = new com.tencent.mm.plugin.sns.ui.ax(this);
        new com.tencent.mm.plugin.sns.ui.bx(this);
        this.f169674v = new com.tencent.mm.plugin.sns.ui.cx(this);
        this.f169675w = new com.tencent.mm.plugin.sns.ui.dx(this);
        this.f169676x = new com.tencent.mm.plugin.sns.ui.ex(this);
        this.f169677y = new com.tencent.mm.plugin.sns.ui.fx(this);
        this.f169678z = new com.tencent.mm.plugin.sns.ui.jx(this);
        this.f169654b = context;
        this.f169653a = rxVar;
        A = i17;
        B = k4Var;
    }

    public static void A(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToFinderLivePage", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.protocal.protobuf.TimeLineObject)) {
            final com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = (com.tencent.mm.protocal.protobuf.TimeLineObject) view.getTag();
            android.content.Context context = view.getContext();
            final long F0 = ca4.z0.F0(timeLineObject.ContentObj.f369848s.getString(0));
            final long F02 = ca4.z0.F0(timeLineObject.ContentObj.f369848s.getString(2));
            if (F0 != 0 && F02 != 0) {
                android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n8n);
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).Ni());
                if (valueOf.booleanValue()) {
                    r45.g92 g92Var = timeLineObject.ContentObj.f369848s;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStreamUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    if (((r45.nw1) g92Var.getCustom(24)) == null || ((r45.nw1) g92Var.getCustom(24)).getInteger(42) == 1) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStreamUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    } else if (g92Var.getInteger(13) == 1) {
                        str4 = ((r45.nw1) g92Var.getCustom(24)).getString(3) != null ? ((r45.nw1) g92Var.getCustom(24)).getString(3) : "";
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStreamUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                        str = str4;
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStreamUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    }
                    str4 = "";
                    str = str4;
                } else {
                    str = "";
                }
                boolean Zi = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(timeLineObject.ContentObj.f369848s.getString(1), view.findViewById(com.tencent.mm.R.id.f4x), view.findViewById(com.tencent.mm.R.id.f7y), F0);
                boolean vk6 = ((r45.nw1) timeLineObject.ContentObj.f369848s.getCustom(24)) != null ? ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk((r45.nw1) timeLineObject.ContentObj.f369848s.getCustom(24), "timeline") : ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(F0), "timeline");
                if (!Zi || vk6) {
                    str2 = "jumpToFinderLivePage";
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(context), timeLineObject.ContentObj.f369848s.getString(1))) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("KEY_PARAMS_SOURCE_TYPE", timeLineObject.ContentObj.f369848s.getInteger(15));
                        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).oj(intent, context, F02, java.lang.Long.valueOf(F0), timeLineObject.ContentObj.f369848s.getString(12), timeLineObject.ContentObj.f369848s.getString(4), "", "", "");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "finderLiveListener click fluentSwitch: " + valueOf + " streamUrl: " + str + " liveStatus = " + timeLineObject.ContentObj.f369848s.getInteger(13));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToVisitorLive", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        android.content.Context context2 = view.getContext();
                        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
                        a52.a.d("temp_6");
                        android.view.KeyEvent.Callback findViewWithTag = view.findViewWithTag("nearby-live-preview-view-tag");
                        cl0.g gVar = new cl0.g();
                        if (findViewWithTag instanceof ws5.f) {
                            ws5.f fVar = (ws5.f) findViewWithTag;
                            int playStatus = fVar.getPlayStatus();
                            java.lang.String streamId = fVar.getStreamId();
                            try {
                                gVar.s("playstatus", java.lang.Integer.valueOf(playStatus));
                                if (streamId == null) {
                                    streamId = "";
                                }
                                gVar.s("streamid", streamId);
                            } catch (cl0.f e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "enterFinderLiveVisitorUI: set json error", e17);
                            }
                        }
                        try {
                            gVar.s("share_scene", java.lang.Integer.valueOf(timeLineObject.ContentObj.f369848s.getInteger(44)));
                            gVar.s("share_username", timeLineObject.UserName);
                            str3 = gVar.toString().replace(",", ";");
                        } catch (cl0.f e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "enterFinderLiveVisitorUI: set share json error", e18);
                            str3 = "";
                        }
                        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
                        java.lang.String string = timeLineObject.ContentObj.f369848s.getString(1);
                        int i17 = timeLineObject.ContentObj.f369848s.getInteger(13) == 1 ? 1 : 2;
                        p52.e[] eVarArr = p52.e.f352008d;
                        ((c61.w8) paVar).Zi(F02, F0, string, -1, -1, 7L, "temp_6", i17, 3, p52.h.f352021f, p52.h.f352022g, java.lang.System.currentTimeMillis(), 1, str3, "", null);
                        ((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).Ai(timeLineObject.ContentObj.f369848s, F02, view, imageView, ez2.a.f257862n, new com.tencent.mm.plugin.sns.ui.ox(context2, timeLineObject, F0, F02, elapsedRealtime, imageView));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToVisitorLive", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("view_id", "live_room_card_share");
                        hashMap.put("live_share_type", 2);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", view, hashMap, 26236);
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToReplayLive", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    final android.content.Context context3 = view.getContext();
                    int integer = timeLineObject.ContentObj.f369848s.getInteger(22);
                    int i18 = ((integer == 2 || integer == 8 || integer == 16) || timeLineObject.ContentObj.f369848s.getInteger(22) == 6) ? 1 : 2;
                    final java.lang.String str5 = ya.a.SHARE;
                    ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Vi(false, F02, ya.a.SHARE, i18, 3);
                    com.tencent.mm.feature.finder.live.v4 v4Var = (com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class));
                    jz5.o oVar = (jz5.o) v4Var.f66986g.get(java.lang.Long.valueOf(F0));
                    int i19 = zy2.v.f477591b;
                    if (i19 <= 0) {
                        i19 = ae2.in.f3762h3;
                    }
                    str2 = "jumpToFinderLivePage";
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "jumpToReplayLive fluentSwitch " + valueOf + " validStatus = " + java.lang.Boolean.valueOf(v4Var.jk(oVar, i19 * 1000)));
                    if (imageView == null || !valueOf.booleanValue()) {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).wi(vd2.t3.f435921a.b(null, ya.a.SHARE, 3), context3, F02, F0, timeLineObject.ContentObj.f369848s.getString(1), timeLineObject.ContentObj.f369848s.getString(12), timeLineObject.ContentObj.f369848s.getString(4), "", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
                    } else if (((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh()) {
                        c50.s0 s0Var = (c50.s0) i95.n0.c(c50.s0.class);
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put("key_enter_type", 1);
                        final r45.g92 g92Var2 = timeLineObject.ContentObj.f369848s;
                        hashMap2.put("liveUrl", str);
                        pg2.j0 j0Var = (pg2.j0) s0Var;
                        hashMap2.put("liveSdkChannelParams", j0Var.Bi((r45.nw1) g92Var2.getCustom(24)));
                        hashMap2.put("playerInfoData", j0Var.Di(str, g92Var2.getString(3) == null ? "" : g92Var2.getString(3), F0, F02, (r45.nw1) g92Var2.getCustom(24)));
                        j0Var.Ni((androidx.appcompat.app.AppCompatActivity) context3, F02, imageView, new android.graphics.Rect(), hashMap2, new yz5.p(str5, F02, context3, F0, g92Var2, timeLineObject) { // from class: com.tencent.mm.plugin.sns.ui.kw$$d

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ long f169684d;

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ android.content.Context f169685e;

                            /* renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ long f169686f;

                            /* renamed from: g, reason: collision with root package name */
                            public final /* synthetic */ r45.g92 f169687g;

                            /* renamed from: h, reason: collision with root package name */
                            public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f169688h;

                            {
                                this.f169684d = F02;
                                this.f169685e = context3;
                                this.f169686f = F0;
                                this.f169687g = g92Var2;
                                this.f169688h = timeLineObject;
                            }

                            @Override // yz5.p
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                long j17 = this.f169684d;
                                android.content.Context context4 = this.f169685e;
                                long j18 = this.f169686f;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$jumpToReplayLive$1", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                                android.content.Intent b17 = vd2.t3.f435921a.b((android.content.Intent) obj2, ya.a.SHARE, 3);
                                b17.putExtra("CURRENT_FEED_ID", j17);
                                b17.putExtra("LAUNCH_WITH_ANIM", true);
                                ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
                                r45.g92 g92Var3 = this.f169687g;
                                ((vd2.d5) i0Var).wi(b17, context4, j17, j18, g92Var3.getString(3) == null ? "" : g92Var3.getString(3), g92Var3.getString(12) == null ? "" : g92Var3.getString(12), this.f169688h.ContentObj.f369848s.getString(4), "", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$jumpToReplayLive$1", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                                return null;
                            }
                        });
                    } else {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        final android.content.Intent b17 = vd2.t3.f435921a.b(null, ya.a.SHARE, 3);
                        zy2.c8 c8Var = (zy2.c8) i95.n0.c(zy2.c8.class);
                        ez2.a aVar = ez2.a.f257863o;
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) imageView.getParent();
                        zy2.c8 c8Var2 = (zy2.c8) i95.n0.c(zy2.c8.class);
                        r45.nw1 nw1Var = (r45.nw1) timeLineObject.ContentObj.f369848s.getCustom(24);
                        ((c61.d8) c8Var2).getClass();
                        ez2.b Ri = ((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).Ri(view.getContext(), ((c61.d8) c8Var).wi(aVar, F02, viewGroup, imageView, "", !((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(nw1Var), (r45.nw1) timeLineObject.ContentObj.f369848s.getCustom(24), timeLineObject.ContentObj.f369848s.getString(25)));
                        if (Ri != null) {
                            ((ig2.f) Ri).g(new yz5.a() { // from class: com.tencent.mm.plugin.sns.ui.kw$$e
                                @Override // yz5.a
                                public final java.lang.Object invoke() {
                                    long j17 = F02;
                                    android.content.Context context4 = context3;
                                    long j18 = F0;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$jumpToReplayLive$2", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                                    android.content.Intent intent2 = b17;
                                    intent2.putExtra("CURRENT_FEED_ID", j17);
                                    intent2.putExtra("LAUNCH_WITH_ANIM", true);
                                    ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
                                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = timeLineObject;
                                    ((vd2.d5) i0Var).wi(intent2, context4, j17, j18, timeLineObject2.ContentObj.f369848s.getString(1), timeLineObject2.ContentObj.f369848s.getString(12), timeLineObject2.ContentObj.f369848s.getString(4), "", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$jumpToReplayLive$2", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                                    return null;
                                }
                            });
                        } else {
                            ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).wi(b17, context3, F02, F0, timeLineObject.ContentObj.f369848s.getString(1), timeLineObject.ContentObj.f369848s.getString(12), timeLineObject.ContentObj.f369848s.getString(4), "", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToReplayLive", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToFinderLivePage", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void B(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("liteAppClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "LiteApp Click");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1293L, 35L, 1L);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        r45.n74 n74Var = timeLineObject.liteappInfo;
        if (n74Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener username is null");
        } else {
            java.lang.String str = n74Var.f381130d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                r45.a90 a90Var = timeLineObject.ContentObj;
                boolean z17 = true;
                boolean z18 = (a90Var == null || com.tencent.mm.sdk.platformtools.t8.K0(a90Var.f369839g)) ? false : true;
                if (z18 && !((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Lj(str)) {
                    z17 = false;
                }
                if (z17) {
                    I(i2Var);
                    g0Var.C(1293L, 85L, 1L);
                    q80.d0 d0Var = new q80.d0();
                    r45.n74 n74Var2 = timeLineObject.liteappInfo;
                    d0Var.f360649a = n74Var2.f381130d;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(n74Var2.f381131e)) {
                        d0Var.f360650b = timeLineObject.liteappInfo.f381131e;
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.liteappInfo.f381132f)) {
                        d0Var.f360651c = timeLineObject.liteappInfo.f381132f;
                    }
                    d0Var.f360652d = java.lang.Boolean.valueOf(timeLineObject.liteappInfo.f381133g);
                    com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
                    liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.TIMELINE;
                    d0Var.f360674z = liteAppReferrerInfo;
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new com.tencent.mm.plugin.sns.ui.ix(db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.sns.ui.gx()), z18, context, i2Var));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("liteAppClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    return;
                }
                g0Var.C(1293L, 86L, 1L);
            }
        }
        android.view.View view = new android.view.View(context);
        view.setTag(i2Var);
        D.onClick(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("liteAppClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void C(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mallClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        if (timeLineObject.ContentObj.f369840h.size() > 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b);
            if (K(k4Var)) {
                k4Var.a().e(k17);
            }
            java.lang.String str = ((r45.jj4) timeLineObject.ContentObj.f369840h.get(0)).f377872u;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_product_scene", 2);
            intent.putExtra("key_product_info", str);
            j45.l.j(context, "product", ".ui.MallProductUI", intent, null);
        }
        I(i2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mallClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void D(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("musicTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        if (timeLineObject.ContentObj.f369854y == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("musicTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_feed_id", pm0.v.Z(timeLineObject.ContentObj.f369854y.getString(7)));
        intent.putExtra("key_topic_title", timeLineObject.ContentObj.f369854y.getString(0));
        intent.putExtra("key_topic_type", timeLineObject.ContentObj.f369854y.getInteger(1));
        r45.ze2 ze2Var = new r45.ze2();
        r45.hv2 hv2Var = (r45.hv2) timeLineObject.ContentObj.f369854y.getCustom(4);
        if (hv2Var != null) {
            ze2Var.set(5, hv2Var.getString(0));
            ze2Var.set(0, java.lang.Float.valueOf(hv2Var.getFloat(1)));
            ze2Var.set(1, java.lang.Float.valueOf(hv2Var.getFloat(2)));
        }
        try {
            intent.putExtra("key_topic_poi_location", ze2Var.toByteArray());
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "location toByteArray exception");
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_from_user", timeLineObject.UserName);
        intent.putExtra("key_report_scene", 3);
        intent.putExtra("KEY_TAB_TYPE", 5);
        r45.ht0 ht0Var = (r45.ht0) timeLineObject.ContentObj.f369854y.getCustom(6);
        if (ht0Var != null) {
            intent.putExtra("key_activity_id", pm0.v.Z(ht0Var.getString(0)));
        }
        intent.putExtra("key_activity_name", timeLineObject.ContentObj.f369854y.getString(0));
        intent.putExtra("key_cover_url", timeLineObject.ContentObj.f369854y.getString(2));
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 138, intent);
        intent.putExtra("key_entrance_type", 0);
        intent.putExtra("key_source_postion", 7);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el()) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.assist.i0.Rk((com.tencent.mm.plugin.finder.assist.i0) c17, context, intent, false, 4, null);
        } else {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).kl(context);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("musicTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void E(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("noteLinkClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        r45.a90 a90Var = timeLineObject.ContentObj;
        int i17 = a90Var.f369837e;
        java.lang.String str = i2Var.f168550b;
        if (i17 == 26) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(a90Var.f369842m)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("noteLinkClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 37;
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = i2Var.f168549a;
            r45.a90 a90Var2 = timeLineObject2.ContentObj;
            z9Var.f8530c = a90Var2.f369842m;
            java.util.LinkedList linkedList = a90Var2.f369840h;
            java.lang.String str2 = "";
            if (linkedList != null && linkedList.size() >= 1) {
                java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), ((r45.jj4) timeLineObject2.ContentObj.f369840h.get(0)).f377855d);
                java.lang.String U = ca4.z0.U((r45.jj4) timeLineObject2.ContentObj.f369840h.get(0));
                if (com.tencent.mm.vfs.w6.j(d17 + U)) {
                    str2 = d17 + U;
                }
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("serverMsgID", timeLineObject.Id);
            intent.putExtra("geta8key_username", timeLineObject.UserName);
            z9Var.f8534g = intent;
            z9Var.f8542o = str2;
            z9Var.f8529b = str;
            z9Var.f8535h = context;
            favoriteOperationEvent.e();
        }
        J(timeLineObject.UserName, str, i2Var.f168551c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("noteLinkClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void F(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("paidCollectionClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        if (timeLineObject.ContentObj.E == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("paidCollectionClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.u(context, timeLineObject.ContentObj.E, 4);
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        java.lang.String b17 = com.tencent.mm.plugin.finder.report.m0.f125120d.b(3);
        com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct finderEnterSharedCardStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct();
        finderEnterSharedCardStruct.f56705d = finderEnterSharedCardStruct.b("SessionId", b17, true);
        finderEnterSharedCardStruct.f56706e = 3;
        finderEnterSharedCardStruct.f56707f = 7L;
        finderEnterSharedCardStruct.f56708g = finderEnterSharedCardStruct.b("SourceUsr", timeLineObject.UserName, true);
        finderEnterSharedCardStruct.f56722u = finderEnterSharedCardStruct.b("collection_id", com.tencent.mm.sdk.platformtools.t8.r0(timeLineObject.ContentObj.E.getLong(0)), true);
        finderEnterSharedCardStruct.f56723v = timeLineObject.CreateTime;
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b);
        if (k17 != null) {
            finderEnterSharedCardStruct.f56724w = finderEnterSharedCardStruct.b("messageid", java.lang.String.valueOf(k17.field_snsId), true);
        }
        finderEnterSharedCardStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("paidCollectionClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void G(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("poiPageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        if (timeLineObject.ContentObj.f369853x == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("poiPageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        r45.f96 f96Var = new r45.f96();
        f96Var.set(5, timeLineObject.ContentObj.f369853x.getString(6));
        f96Var.set(0, java.lang.Float.valueOf(com.tencent.mm.sdk.platformtools.t8.B1(timeLineObject.ContentObj.f369853x.getString(1))));
        f96Var.set(1, java.lang.Float.valueOf(com.tencent.mm.sdk.platformtools.t8.B1(timeLineObject.ContentObj.f369853x.getString(0))));
        f96Var.set(3, timeLineObject.ContentObj.f369853x.getString(2));
        f96Var.set(7, timeLineObject.ContentObj.f369853x.getString(5));
        f96Var.set(4, timeLineObject.ContentObj.f369853x.getString(4));
        f96Var.set(8, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1(timeLineObject.ContentObj.f369853x.getString(3), 0)));
        f96Var.set(6, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1(timeLineObject.ContentObj.f369853x.getString(7), 0)));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        g0Var.B(1663L, 1L);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.service.p3.f126174a.b(context, f96Var, zy2.o9.f477516d, 7, timeLineObject.Id, new com.tencent.mm.plugin.sns.ui.xw(f96Var, intent, context, timeLineObject));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("poiPageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void H(com.tencent.mm.plugin.sns.ui.i2 i2Var, android.content.Context context, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("productClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        int size = timeLineObject.ContentObj.f369840h.size();
        java.lang.String str = i2Var.f168550b;
        if (size > 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
            if (K(k4Var)) {
                k4Var.a().e(k17);
            }
            java.lang.String str2 = ((r45.jj4) timeLineObject.ContentObj.f369840h.get(0)).f377872u;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_Product_xml", str2);
            intent.putExtra("key_ProductUI_getProductInfoScene", 2);
            j45.l.j(context, "scanner", ".ui.ProductUI", intent, null);
        }
        J(timeLineObject.UserName, str, i2Var.f168551c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("productClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void I(com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        J(timeLineObject.UserName, i2Var.f168550b, i2Var.f168551c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void J(final java.lang.String str, final java.lang.String str2, final int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.plugin.sns.model.l4.Uj().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.kw$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$publicClickEvent$4", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                int i18 = i17;
                if (!com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(i18) && i18 != 3 && i18 != 15) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$publicClickEvent$4", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    return;
                }
                com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str2);
                if (k17 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$publicClickEvent$4", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    return;
                }
                el0.i.d(str, k17.getSnsId(), i18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$publicClickEvent$4", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static boolean K(com.tencent.mm.plugin.sns.model.k4 k4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCheck", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        boolean z17 = (k4Var == null || k4Var.a() == null) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCheck", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return z17;
    }

    public static void L(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("singlePageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b);
        if (K(k4Var)) {
            k4Var.a().e(k17);
        }
        r45.y87 y87Var = timeLineObject.weappInfo;
        if (y87Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "appbrandSingePageListener weappInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("singlePageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77322d = 6;
        appBrandLaunchReferrer.f77326h = y87Var.f390870m;
        l81.b1 b1Var = new l81.b1();
        r45.y87 y87Var2 = timeLineObject.weappInfo;
        b1Var.f317012a = y87Var2.f390864d;
        b1Var.f317022f = y87Var2.f390865e;
        b1Var.f317016c = y87Var2.f390867g;
        b1Var.f317018d = y87Var2.f390866f;
        java.lang.String str = timeLineObject.ContentObj.f369838f;
        b1Var.f317048z = 1;
        b1Var.f317032k = 1154;
        b1Var.f317034l = timeLineObject.weappInfo.f390868h + ":" + timeLineObject.UserName;
        b1Var.f317044v = timeLineObject.Id;
        b1Var.f317047y = 2;
        b1Var.f317045w = timeLineObject.UserName;
        b1Var.f317041s = appBrandLaunchReferrer;
        if (timeLineObject.weappInfo.f390872o != null) {
            try {
                cl0.e eVar = new cl0.e(timeLineObject.weappInfo.f390872o);
                b1Var.F = new java.util.ArrayList();
                for (int i17 = 0; i17 < eVar.length(); i17++) {
                    b1Var.F.add(eVar.getString(i17));
                }
            } catch (cl0.f unused) {
            }
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
        I(i2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("singlePageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void M(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("templateTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        if (timeLineObject.ContentObj.C == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("templateTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_feed_id", pm0.v.Z(timeLineObject.ContentObj.C.getString(7)));
        intent.putExtra("key_topic_title", timeLineObject.ContentObj.C.getString(0));
        intent.putExtra("key_topic_type", timeLineObject.ContentObj.C.getInteger(1));
        r45.ze2 ze2Var = new r45.ze2();
        r45.hv2 hv2Var = (r45.hv2) timeLineObject.ContentObj.C.getCustom(4);
        if (hv2Var != null) {
            ze2Var.set(5, hv2Var.getString(0));
            ze2Var.set(0, java.lang.Float.valueOf(hv2Var.getFloat(1)));
            ze2Var.set(1, java.lang.Float.valueOf(hv2Var.getFloat(2)));
        }
        try {
            intent.putExtra("key_topic_poi_location", ze2Var.toByteArray());
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "location toByteArray exception");
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_from_user", timeLineObject.UserName);
        intent.putExtra("key_report_scene", 3);
        intent.putExtra("KEY_TAB_TYPE", 5);
        r45.ub4 ub4Var = (r45.ub4) timeLineObject.ContentObj.C.getCustom(8);
        if (ub4Var != null) {
            intent.putExtra("key_activity_id", pm0.v.Z(ub4Var.getString(0)));
        }
        intent.putExtra("key_entrance_type", 0);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).fl(context, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("templateTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x038d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void N(android.content.Context r51, com.tencent.mm.plugin.sns.ui.i2 r52, android.view.View r53, com.tencent.mm.plugin.sns.model.k4 r54, int r55) {
        /*
            Method dump skipped, instructions count: 2057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.kw.N(android.content.Context, com.tencent.mm.plugin.sns.ui.i2, android.view.View, com.tencent.mm.plugin.sns.model.k4, int):void");
    }

    public static void O(com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("urlLickClickHeader", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b);
        if (K(B)) {
            B.a().e(k17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("urlLickClickHeader", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static /* synthetic */ int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        int i17 = A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return i17;
    }

    public static /* synthetic */ android.content.Context b(com.tencent.mm.plugin.sns.ui.kw kwVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        android.content.Context context = kwVar.f169654b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x066c, code lost:
    
        if ((r7.f362036b.length() == 0) != false) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0675 A[LOOP:0: B:144:0x0635->B:168:0x0675, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0673 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x077e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.view.View r64, int r65) {
        /*
            Method dump skipped, instructions count: 3140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.kw.c(android.view.View, int):void");
    }

    public static void d(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        if (timeLineObject.ContentObj.f369840h.size() > 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b);
            if (K(k4Var)) {
                k4Var.a().e(k17);
            }
            java.lang.String str = ((r45.jj4) timeLineObject.ContentObj.f369840h.get(0)).f377872u;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_from_scene", 12);
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData is empty");
            } else {
                java.lang.String[] split = str.split("#");
                if (split.length >= 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData[0]:" + split[0]);
                    intent.putExtra("key_card_id", split[0]);
                    intent.putExtra("key_card_ext", split[1]);
                    j45.l.j(context, "card", ".ui.CardDetailUI", intent, null);
                } else if (split.length == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData not include cardExt");
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "cardRediretListener card_id :".concat(str));
                    intent.putExtra("key_card_id", split[0]);
                    intent.putExtra("key_card_ext", "");
                    j45.l.j(context, "card", ".ui.CardDetailUI", intent, null);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData not include card_id and cardExt");
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData :".concat(str));
                }
            }
        }
        I(i2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void e(android.view.View view, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        r45.ek4 ek4Var;
        r45.kv2 kv2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickFinderMedia", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (view.getTag() == null || !(view.getTag() instanceof com.tencent.mm.protocal.protobuf.TimeLineObject)) {
            str2 = "clickFinderMedia";
            str3 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent";
        } else {
            if (!com.tencent.mm.sdk.platformtools.f9.MomentChannels.k(view.getContext(), null)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickFinderMedia", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
            if (K(B) && view.getTag(com.tencent.mm.R.id.lzc) != null) {
                B.a().e((com.tencent.mm.plugin.sns.storage.SnsInfo) view.getTag(com.tencent.mm.R.id.lzc));
            }
            final android.content.Context context = view.getContext();
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = (com.tencent.mm.protocal.protobuf.TimeLineObject) view.getTag();
            r45.a90 a90Var = timeLineObject.ContentObj;
            if (a90Var == null || (kv2Var = a90Var.f369844o) == null) {
                str4 = "clickFinderMedia";
                str5 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent";
                if (a90Var != null && (ek4Var = a90Var.f369849t) != null) {
                    long F0 = ca4.z0.F0(ek4Var.getString(0));
                    if (F0 != 0) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("report_scene", 3);
                        intent.putExtra("from_user", timeLineObject.UserName);
                        intent.putExtra("feed_object_id", F0);
                        intent.putExtra("feed_object_nonceId", timeLineObject.ContentObj.f369849t.getString(7));
                        intent.putExtra("business_type", 1);
                        intent.putExtra("key_from_user_name", timeLineObject.UserName);
                        intent.putExtra("key_ec_source", timeLineObject.ContentObj.f369844o.getString(24));
                        intent.putExtra("tab_type", 5);
                        intent.putExtra("key_comment_scene", 53);
                        if (str != null) {
                            intent.putExtra("KEY_FINDER_SNS_ID", str);
                            intent.putExtra("KEY_FINDER_SHARE_SUC_TIME", timeLineObject.CreateTime);
                        }
                        intent.putExtra("key_finder_teen_mode_check", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
                        intent.putExtra("key_finder_teen_mode_scene", 3);
                        intent.putExtra("key_finder_teen_mode_user_name", timeLineObject.ContentObj.f369849t.getString(2));
                        intent.putExtra("key_finder_teen_mode_user_id", timeLineObject.ContentObj.f369849t.getString(1));
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 38, intent);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.e1.f460472a.A(context, intent, false);
                    }
                }
            } else {
                str4 = "clickFinderMedia";
                long F02 = ca4.z0.F0(kv2Var.getString(0));
                str5 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent";
                long j17 = timeLineObject.ContentObj.f369844o.getLong(9);
                if (F02 != 0 || j17 != 0) {
                    final android.content.Intent intent2 = new android.content.Intent();
                    java.lang.String Ai = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).Ai(timeLineObject.Id, timeLineObject.CreateTime);
                    r45.md5 md5Var = new r45.md5();
                    md5Var.set(0, java.lang.Long.valueOf(F02));
                    ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Cj(intent2, Ai, md5Var);
                    intent2.putExtra("report_scene", 3);
                    intent2.putExtra("from_user", timeLineObject.UserName);
                    intent2.putExtra("feed_object_id", F02);
                    intent2.putExtra("feed_object_nonceId", timeLineObject.ContentObj.f369844o.getString(8));
                    intent2.putExtra("business_type", 0);
                    intent2.putExtra("finder_user_name", timeLineObject.ContentObj.f369844o.getString(1));
                    intent2.putExtra("key_from_user_name", timeLineObject.UserName);
                    intent2.putExtra("key_ec_source", timeLineObject.ContentObj.f369844o.getString(24));
                    intent2.putExtra("tab_type", 5);
                    intent2.putExtra("key_comment_scene", 38);
                    intent2.putExtra("feed_local_id", j17);
                    intent2.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(x(timeLineObject.ContentObj.f369844o), null, null));
                    intent2.putExtra("KEY_FINDER_FORWARD_SOURCE", timeLineObject.ContentObj.f369844o.getString(22));
                    if (str != null) {
                        intent2.putExtra("KEY_FINDER_SNS_ID", str);
                        intent2.putExtra("KEY_FINDER_SHARE_SUC_TIME", timeLineObject.CreateTime);
                    }
                    intent2.putExtra("key_finder_teen_mode_check", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
                    intent2.putExtra("key_finder_teen_mode_scene", 3);
                    intent2.putExtra("key_finder_teen_mode_user_name", ca4.z0.z(timeLineObject.ContentObj.f369844o));
                    intent2.putExtra("key_finder_teen_mode_user_id", timeLineObject.ContentObj.f369844o.getString(1));
                    if (F02 == 0 && j17 != 0) {
                        intent2.putExtra("key_posting_scene", true);
                    }
                    if ((timeLineObject.ContentObj.f369844o.getInteger(25) & 4) > 0) {
                        intent2.putExtra("member_username", timeLineObject.ContentObj.f369844o.getString(1));
                    }
                    intent2.putExtra("key_source_comment_scene", timeLineObject.ContentObj.f369844o.getInteger(29));
                    ((wa2.u) ((xa2.e) i95.n0.c(xa2.e.class))).hj(intent2, view, 280L);
                    vr2.f fVar = (vr2.f) ((zy2.eb) i95.n0.c(zy2.eb.class));
                    if (fVar.wi() && fVar.Ai()) {
                        intent2.putExtra("KEY_OBJECT_ID", pm0.v.Z(timeLineObject.ContentObj.f369844o.getString(0)));
                        intent2.putExtra("KEY_OBJECT_NONCE_ID", timeLineObject.ContentObj.f369844o.getString(8));
                        intent2.putExtra("FROM_SCENE_KEY", 6);
                        intent2.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 20, intent2);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.e1.f460472a.C(context, intent2);
                    } else {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 38, intent2);
                        android.os.SystemClock.elapsedRealtime();
                        ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).Di(intent2, F02, view, (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n8n), ez2.a.f257862n, new yz5.l() { // from class: com.tencent.mm.plugin.sns.ui.kw$$a
                            @Override // yz5.l
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$clickFinderMedia$0", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                ya2.e1.f460472a.A(context, intent2, true);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$clickFinderMedia$0", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                                return null;
                            }
                        });
                    }
                }
            }
            str2 = str4;
            str3 = str5;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
    }

    public static void f(android.view.View view, int i17, com.tencent.mm.plugin.sns.ui.rx rxVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickMediaIcon", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.i2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickMediaIcon", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        com.tencent.mm.plugin.sns.ui.i2 i2Var = (com.tencent.mm.plugin.sns.ui.i2) view.getTag();
        android.content.Context context = view.getContext();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playMusic", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.plugin.sns.ui.wm.e(i2Var.f168549a, context, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playMusic", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickMediaIcon", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void g(android.view.View view) {
        r45.a90 a90Var;
        r45.km6 km6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickTingCategoryItem", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.i2)) {
            android.content.Context context = view.getContext();
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = ((com.tencent.mm.plugin.sns.ui.i2) view.getTag()).f168549a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goTingAlbum", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            if (timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null || (km6Var = a90Var.A) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "goTingAlbum fail tingAlbumShareObject null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goTingAlbum", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            } else {
                bw5.o50 v17 = il4.d.v(km6Var.f378839e);
                if (v17 != null) {
                    il4.e eVar = new il4.e();
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_Moment;
                    eVar.f292106c = v31.j.CTRL_INDEX;
                    java.lang.String str = timeLineObject.Id;
                    eVar.f292114k = str;
                    il4.f fVar = eVar.f292122s;
                    java.util.Map map = fVar.f292132d;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str == null) {
                        str = "";
                    }
                    map.put("sns", str);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.UserName)) {
                        fVar.f292132d.put("sourceuser", timeLineObject.UserName);
                    }
                    ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).o(context, v17, ar0Var, eVar, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goTingAlbum", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "goTingAlbum categoryItem null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goTingAlbum", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickTingCategoryItem", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void h(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickTingMusicItem", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.i2)) {
            com.tencent.mm.protocal.protobuf.TimeLineObject tlObj = ((com.tencent.mm.plugin.sns.ui.i2) view.getTag()).f168549a;
            int i17 = A;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoTingPlayerPage", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            kotlin.jvm.internal.o.g(tlObj, "tlObj");
            bw5.lp0 d17 = com.tencent.mm.plugin.sns.ui.wm.d(tlObj);
            i95.m c17 = i95.n0.c(qk.k6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            qk.k6 k6Var = (qk.k6) c17;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            bw5.ar0 ar0Var = bw5.ar0.TingScene_Moment;
            il4.e eVar = new il4.e(null, 0, v31.j.CTRL_INDEX, false, null, null, 0, 0, false, i17 == 0, tlObj.Id + "", null, null, null, null, null, false, false, null, null, false, null, false, bw5.x2.BizAudioEnterScene_MomentsListen, false, 25164275, null);
            java.util.Map map = eVar.f292122s.f292132d;
            java.lang.String str = eVar.f292114k;
            if (str != null) {
                map.put("sns", str);
            }
            java.lang.String str2 = tlObj.UserName;
            if (str2 != null) {
                map.put("sourceuser", str2);
            }
            if (tlObj.ContentObj.f369837e != 47) {
                map.put("baseidissharedfrom3rd", 1);
            }
            qk.k6.I1(k6Var, context, true, d17, eVar, null, null, ar0Var, null, null, null, null, 1968, null);
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ri(d17, ar0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoTingPlayerPage", "com.tencent.mm.plugin.sns.ui.SnsMusicPlayHelper");
            yc4.b0 b0Var = yc4.b0.f460839a;
            b0Var.b(tlObj.Id);
            b0Var.c(tlObj.Id, 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickTingMusicItem", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void i(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("collectionClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        if (timeLineObject.ContentObj.E == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collectionClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.n(context, timeLineObject.ContentObj.E, 4);
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        java.lang.String b17 = com.tencent.mm.plugin.finder.report.m0.f125120d.b(3);
        com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct finderEnterSharedCardStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct();
        finderEnterSharedCardStruct.f56705d = finderEnterSharedCardStruct.b("SessionId", b17, true);
        finderEnterSharedCardStruct.f56706e = 3;
        finderEnterSharedCardStruct.f56707f = 8L;
        finderEnterSharedCardStruct.f56708g = finderEnterSharedCardStruct.b("SourceUsr", timeLineObject.UserName, true);
        finderEnterSharedCardStruct.f56722u = finderEnterSharedCardStruct.b("collection_id", com.tencent.mm.sdk.platformtools.t8.r0(timeLineObject.ContentObj.E.getLong(0)), true);
        finderEnterSharedCardStruct.f56723v = timeLineObject.CreateTime;
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b);
        if (k17 != null) {
            finderEnterSharedCardStruct.f56724w = finderEnterSharedCardStruct.b("messageid", java.lang.String.valueOf(k17.field_snsId), true);
        }
        finderEnterSharedCardStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collectionClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void j(com.tencent.mm.plugin.sns.ui.i2 i2Var, android.content.Context context, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("designerClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        if (timeLineObject.ContentObj.f369840h.size() > 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b);
            if (K(k4Var)) {
                k4Var.a().e(k17);
            }
            java.lang.String str = ((r45.jj4) timeLineObject.ContentObj.f369840h.get(0)).f377872u;
            qk.v vVar = new qk.v();
            if (str == null) {
                str = "";
            }
            vVar.f364029i = str;
            vVar.f364155a = 13;
            vVar.f364035o = true;
            vVar.f364156b = true;
            vVar.f364043w = true;
            com.tencent.mm.feature.emoji.api.q6 q6Var = (com.tencent.mm.feature.emoji.api.q6) i95.n0.c(com.tencent.mm.feature.emoji.api.q6.class);
            if (q6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "emoticon page service not found");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("designerClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
            ((com.tencent.mm.feature.emoji.h4) q6Var).wi(context, vVar);
        }
        I(i2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("designerClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void k(com.tencent.mm.plugin.sns.ui.i2 i2Var, android.content.Context context, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ecsClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        r45.k86 k86Var = i2Var.f168549a.ContentObj.G;
        if (k86Var != null) {
            java.lang.String str = k86Var.f378494d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "ecsClick ecsJumpInfoBase64 nil");
            } else {
                ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).Ai(new pq.a(context), str, null);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ecsClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void l(com.tencent.mm.plugin.sns.ui.i2 i2Var, android.content.Context context, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emojiListClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        if (timeLineObject.ContentObj.f369840h.size() > 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b);
            if (K(k4Var)) {
                k4Var.a().e(k17);
            }
            java.lang.String str = ((r45.jj4) timeLineObject.ContentObj.f369840h.get(0)).f377872u;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_object_data", str);
            j45.l.j(context, "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", intent, null);
        }
        I(i2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emojiListClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void m(com.tencent.mm.plugin.sns.ui.i2 i2Var, android.content.Context context, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emojiShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        if (timeLineObject.ContentObj.f369840h.size() > 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b);
            if (K(k4Var)) {
                k4Var.a().e(k17);
            }
            java.lang.String str = ((r45.jj4) timeLineObject.ContentObj.f369840h.get(0)).f377872u;
            qk.c0 c0Var = new qk.c0("");
            if (str == null) {
                str = "";
            }
            c0Var.f364051q = str;
            c0Var.f364198g = 10;
            c0Var.f364155a = 13;
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "emoticon liteapp service not found");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emojiShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, c0Var);
        }
        I(i2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emojiShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(com.tencent.mm.plugin.sns.ui.i2 r10, android.content.Context r11, com.tencent.mm.plugin.sns.model.k4 r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.kw.n(com.tencent.mm.plugin.sns.ui.i2, android.content.Context, com.tencent.mm.plugin.sns.model.k4):void");
    }

    public static void o(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finderAgreeClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        r45.a90 a90Var = timeLineObject.ContentObj;
        int i17 = a90Var.f369850u;
        if (i17 != 3) {
            if (i17 != 100000000) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderAgreeClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
            if (a90Var.f369845p != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_topic_title", timeLineObject.ContentObj.f369845p.getString(0));
                intent.putExtra("key_topic_type", timeLineObject.ContentObj.f369845p.getInteger(1));
                r45.ze2 ze2Var = new r45.ze2();
                ze2Var.set(5, ((r45.hv2) timeLineObject.ContentObj.f369845p.getCustom(4)).getString(0));
                ze2Var.set(0, java.lang.Float.valueOf(((r45.hv2) timeLineObject.ContentObj.f369845p.getCustom(4)).getFloat(1)));
                ze2Var.set(1, java.lang.Float.valueOf(((r45.hv2) timeLineObject.ContentObj.f369845p.getCustom(4)).getFloat(2)));
                try {
                    intent.putExtra("key_topic_poi_location", ze2Var.toByteArray());
                } catch (java.io.IOException unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "location toByteArray exception");
                }
                intent.putExtra("key_from_user", timeLineObject.UserName);
                intent.putExtra("key_report_scene", 3);
                intent.putExtra("KEY_TAB_TYPE", 5);
                java.util.UUID.randomUUID().toString();
                intent.putExtra("key_finder_teen_mode_check", true);
                intent.putExtra("key_finder_teen_mode_scene", 3);
                intent.putExtra("key_finder_teen_mode_user_name", "");
                intent.putExtra("key_finder_teen_mode_user_id", "");
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, timeLineObject.ContentObj.f369845p.getInteger(1) == 1 ? 22 : 26, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                kotlin.jvm.internal.o.g(context, "context");
                if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el()) {
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).hl(context, intent);
                } else {
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).kl(context);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderAgreeClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_topic_title", timeLineObject.ContentObj.f369851v.getString(0));
        intent2.putExtra("key_topic_type", timeLineObject.ContentObj.f369851v.getInteger(1));
        r45.ze2 ze2Var2 = new r45.ze2();
        ze2Var2.set(5, ((r45.hv2) timeLineObject.ContentObj.f369851v.getCustom(4)).getString(0));
        ze2Var2.set(0, java.lang.Float.valueOf(((r45.hv2) timeLineObject.ContentObj.f369851v.getCustom(4)).getFloat(1)));
        ze2Var2.set(1, java.lang.Float.valueOf(((r45.hv2) timeLineObject.ContentObj.f369851v.getCustom(4)).getFloat(2)));
        try {
            intent2.putExtra("key_topic_poi_location", ze2Var2.toByteArray());
        } catch (java.io.IOException unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "location toByteArray exception");
        }
        intent2.putExtra("key_finder_teen_mode_check", true);
        intent2.putExtra("key_from_user", timeLineObject.UserName);
        intent2.putExtra("key_report_scene", 3);
        intent2.putExtra("KEY_TAB_TYPE", 5);
        java.util.UUID.randomUUID().toString();
        r45.ht0 ht0Var = (r45.ht0) timeLineObject.ContentObj.f369851v.getCustom(6);
        intent2.putExtra("key_activity_id", pm0.v.Z(ht0Var.getString(0)));
        intent2.putExtra("key_activity_name", ht0Var.getString(1));
        intent2.putExtra("key_nick_name", ht0Var.getString(2));
        intent2.putExtra("key_display_mask", ht0Var.getLong(4));
        intent2.putExtra("key_cover_url", timeLineObject.ContentObj.f369851v.getString(2));
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 59, intent2);
        intent2.putExtra("key_activity_profile_src_type", "3");
        intent2.putExtra("key_entrance_type", 0);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.m(context, intent2, 4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderAgreeClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void p(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finderColumnCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        r45.dv2 dv2Var = timeLineObject.ContentObj.f369847r;
        if (dv2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderColumnCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("TITLE_WORDING", dv2Var.getString(1));
        intent.putExtra("AUTO_REFRESH", true);
        try {
            intent.putExtra("FINDER_SHARE_ALBUM", dv2Var.toByteArray());
        } catch (java.io.IOException unused) {
        }
        intent.putExtra("STREAM_CARD_BUFFER", dv2Var.getByteString(5).g());
        intent.putExtra("GET_REL_SCENE", 14);
        intent.putExtra("COMMENT_SCENE", 51);
        intent.putExtra("CARD_ID", ca4.z0.F0(dv2Var.getString(0)));
        intent.putExtra("SHARED_USERNAME", timeLineObject.UserName);
        intent.putExtra("FROM_SHARE_SCENE", 3);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "[enterRelatedTimelineUI] ".concat(context.getClass().getName()));
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Ni(context, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderColumnCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void q(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finderFollowTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        if (timeLineObject.ContentObj.f369845p == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderFollowTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_title", timeLineObject.ContentObj.f369845p.getString(0));
        intent.putExtra("KEY_FOLLOW_ID", timeLineObject.ContentObj.f369845p.getString(5));
        intent.putExtra("key_topic_type", timeLineObject.ContentObj.f369845p.getInteger(1));
        r45.ze2 ze2Var = new r45.ze2();
        ze2Var.set(5, ((r45.hv2) timeLineObject.ContentObj.f369845p.getCustom(4)).getString(0));
        ze2Var.set(0, java.lang.Float.valueOf(((r45.hv2) timeLineObject.ContentObj.f369845p.getCustom(4)).getFloat(1)));
        ze2Var.set(1, java.lang.Float.valueOf(((r45.hv2) timeLineObject.ContentObj.f369845p.getCustom(4)).getFloat(2)));
        try {
            intent.putExtra("key_topic_poi_location", ze2Var.toByteArray());
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "location toByteArray exception");
        }
        intent.putExtra("key_from_user", timeLineObject.UserName);
        intent.putExtra("key_report_scene", 3);
        intent.putExtra("KEY_TAB_TYPE", 5);
        java.util.UUID.randomUUID().toString();
        int integer = timeLineObject.ContentObj.f369845p.getInteger(1);
        int i17 = 22;
        if (integer != 1) {
            if (integer == 2) {
                i17 = 26;
            } else if (integer == 4) {
                i17 = 49;
            }
        }
        intent.putExtra("key_finder_teen_mode_scene", 3);
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", "");
        intent.putExtra("key_finder_teen_mode_user_id", "");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, i17, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el()) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).hl(context, intent);
        } else {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).kl(context);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderFollowTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void r(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var, android.view.View view) {
        int i17;
        boolean Zi;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finderLiveShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        long F0 = ca4.z0.F0(timeLineObject.ContentObj.f369848s.getString(0));
        long F02 = ca4.z0.F0(timeLineObject.ContentObj.f369848s.getString(2));
        if (F0 == 0 || F02 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderLiveShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        boolean vk6 = ((r45.nw1) timeLineObject.ContentObj.f369848s.getCustom(24)) != null ? ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk((r45.nw1) timeLineObject.ContentObj.f369848s.getCustom(24), "timelineshare") : false;
        if (view != null) {
            i17 = 1;
            Zi = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(timeLineObject.ContentObj.f369848s.getString(1), view.findViewById(com.tencent.mm.R.id.f4x), view.findViewById(com.tencent.mm.R.id.f7y), F0);
        } else {
            i17 = 1;
            Zi = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(timeLineObject.ContentObj.f369848s.getString(1), null, null, F0);
        }
        if (Zi && !vk6) {
            int i18 = qs5.g.f366432a;
            int integer = timeLineObject.ContentObj.f369848s.getInteger(22);
            ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Vi(false, F02, ya.a.SHARE, (((integer == 2 || integer == 8 || integer == 16) ? i17 : 0) != 0 || timeLineObject.ContentObj.f369848s.getInteger(22) == 6) ? i17 : 2, 3);
            ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ((vd2.d5) i0Var).wi(vd2.t3.f435921a.b(null, ya.a.SHARE, 3), context, F02, F0, timeLineObject.ContentObj.f369848s.getString(i17), timeLineObject.ContentObj.f369848s.getString(12), timeLineObject.ContentObj.f369848s.getString(4), "", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(context), timeLineObject.ContentObj.f369848s.getString(i17))) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PARAMS_SOURCE_TYPE", timeLineObject.ContentObj.f369848s.getInteger(15));
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).oj(intent, context, F02, java.lang.Long.valueOf(F0), timeLineObject.ContentObj.f369848s.getString(12), timeLineObject.ContentObj.f369848s.getString(4), "", "", "");
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_enter_live_param_visitor_enter_scene", 2);
            intent2.putExtra("key_enter_live_param_ecsource", timeLineObject.ContentObj.f369848s.getString(16) == null ? "" : timeLineObject.ContentObj.f369848s.getString(16));
            int i19 = qs5.z.f366478a;
            intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 4);
            r45.m84 m84Var = new r45.m84();
            m84Var.set(0, java.lang.Long.valueOf(F02));
            m84Var.set(i17, java.lang.Long.valueOf(F0));
            m84Var.set(2, timeLineObject.ContentObj.f369848s.getString(12));
            m84Var.set(3, timeLineObject.ContentObj.f369848s.getString(i17));
            m84Var.set(4, "");
            m84Var.set(5, timeLineObject.ContentObj.f369848s.getString(4));
            m84Var.set(6, null);
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, "");
            wk0Var.set(i17, "");
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, java.lang.Integer.valueOf(i17));
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ri(context, intent2, m84Var, true, wk0Var, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderLiveShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void s(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finderLiveThemeClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        r45.hd2 hd2Var = timeLineObject.ContentObj.f369855z;
        if (hd2Var != null) {
            java.lang.String string = hd2Var.getString(3);
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "finderLiveThemeClick: error, themeId is empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderLiveThemeClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_SHARE_TYPE", 3);
                ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).Bi(context, intent, string);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderLiveThemeClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void t(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finderMegaShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        long F0 = ca4.z0.F0(timeLineObject.ContentObj.f369849t.getString(0));
        if (F0 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderMegaShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("report_scene", 3);
        intent.putExtra("from_user", timeLineObject.UserName);
        intent.putExtra("feed_object_id", F0);
        intent.putExtra("feed_object_nonceId", timeLineObject.ContentObj.f369849t.getString(7));
        intent.putExtra("business_type", 1);
        intent.putExtra("key_from_user_name", timeLineObject.UserName);
        intent.putExtra("key_ec_source", timeLineObject.ContentObj.f369844o.getString(24));
        intent.putExtra("tab_type", 5);
        intent.putExtra("KEY_FINDER_SNS_ID", i2Var.f168550b);
        intent.putExtra("KEY_FINDER_SHARE_SUC_TIME", timeLineObject.CreateTime);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 53, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.A(context, intent, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderMegaShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void u(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finderShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        long F0 = ca4.z0.F0(timeLineObject.ContentObj.f369844o.getString(0));
        long j17 = timeLineObject.ContentObj.f369844o.getLong(9);
        if (F0 != 0 || j17 != 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("report_scene", 3);
            intent.putExtra("from_user", timeLineObject.UserName);
            intent.putExtra("feed_object_id", F0);
            intent.putExtra("feed_object_nonceId", timeLineObject.ContentObj.f369844o.getString(8));
            intent.putExtra("business_type", 0);
            intent.putExtra("finder_user_name", timeLineObject.ContentObj.f369844o.getString(1));
            intent.putExtra("key_from_user_name", timeLineObject.UserName);
            intent.putExtra("key_ec_source", timeLineObject.ContentObj.f369844o.getString(24));
            intent.putExtra("tab_type", 5);
            intent.putExtra("feed_local_id", j17);
            intent.putExtra("KEY_FINDER_SNS_ID", i2Var.f168550b);
            intent.putExtra("KEY_FINDER_SHARE_SUC_TIME", timeLineObject.CreateTime);
            intent.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(x(timeLineObject.ContentObj.f369844o), null, null));
            intent.putExtra("KEY_FINDER_FORWARD_SOURCE", timeLineObject.ContentObj.f369844o.getString(22));
            intent.putExtra("key_finder_teen_mode_check", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
            intent.putExtra("key_finder_teen_mode_scene", 3);
            intent.putExtra("key_finder_teen_mode_user_name", ca4.z0.z(timeLineObject.ContentObj.f369844o));
            intent.putExtra("key_finder_teen_mode_user_id", timeLineObject.ContentObj.f369844o.getString(1));
            if ((timeLineObject.ContentObj.f369844o.getInteger(25) & 4) > 0) {
                intent.putExtra("member_username", timeLineObject.ContentObj.f369844o.getString(1));
            }
            intent.putExtra("key_source_comment_scene", timeLineObject.ContentObj.f369844o.getInteger(29));
            if (F0 == 0 && j17 != 0) {
                intent.putExtra("key_posting_scene", true);
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 25, intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.A(context, intent, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void v(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finderTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        O(i2Var);
        if (timeLineObject.ContentObj.f369845p == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_title", timeLineObject.ContentObj.f369845p.getString(0));
        intent.putExtra("key_topic_type", timeLineObject.ContentObj.f369845p.getInteger(1));
        r45.ze2 ze2Var = new r45.ze2();
        ze2Var.set(5, ((r45.hv2) timeLineObject.ContentObj.f369845p.getCustom(4)).getString(0));
        ze2Var.set(0, java.lang.Float.valueOf(((r45.hv2) timeLineObject.ContentObj.f369845p.getCustom(4)).getFloat(1)));
        ze2Var.set(1, java.lang.Float.valueOf(((r45.hv2) timeLineObject.ContentObj.f369845p.getCustom(4)).getFloat(2)));
        try {
            intent.putExtra("key_topic_poi_location", ze2Var.toByteArray());
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "location toByteArray exception");
        }
        intent.putExtra("key_from_user", timeLineObject.UserName);
        intent.putExtra("key_report_scene", 3);
        intent.putExtra("KEY_TAB_TYPE", 5);
        java.util.UUID.randomUUID().toString();
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_scene", 3);
        intent.putExtra("key_finder_teen_mode_user_name", "");
        intent.putExtra("key_finder_teen_mode_user_id", "");
        intent.putExtra("key_entrance_type", 0);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, timeLineObject.ContentObj.f369845p.getInteger(1) == 1 ? 22 : 26, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el()) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).hl(context, intent);
        } else {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).kl(context);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static void w(android.content.Context context, com.tencent.mm.plugin.sns.ui.i2 i2Var) {
        int i17;
        java.lang.Boolean valueOf;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gameShareCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        r45.e73 e73Var = i2Var.f168549a.gameShareCardObject;
        int i18 = e73Var.f373070i;
        int i19 = e73Var.f373072n;
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z17 = false;
        boolean z18 = false;
        z17 = false;
        r3 = false;
        boolean z19 = false;
        hashMap.put(0, java.lang.Integer.valueOf(i18));
        hashMap.put(1, java.lang.Integer.valueOf(i19));
        int intValue = ((java.lang.Integer) java.util.Collections.max(hashMap.values())).intValue();
        if (intValue > 0) {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                if (((java.lang.Integer) entry.getValue()).intValue() == intValue) {
                    i17 = ((java.lang.Integer) entry.getKey()).intValue();
                    break;
                }
            }
        }
        i17 = 0;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleGameShareCardAppBrandClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            r45.y87 y87Var = timeLineObject.weappInfo;
            if (y87Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "handleGameShareCardAppBrandClick, weappInfo is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGameShareCardAppBrandClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            } else {
                com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
                appBrandLaunchReferrer.f77322d = 6;
                appBrandLaunchReferrer.f77326h = y87Var.f390870m;
                l81.b1 b1Var = new l81.b1();
                r45.y87 y87Var2 = timeLineObject.weappInfo;
                b1Var.f317012a = y87Var2.f390864d;
                b1Var.f317022f = y87Var2.f390865e;
                b1Var.f317016c = y87Var2.f390867g;
                b1Var.f317018d = y87Var2.f390866f;
                java.lang.String str = timeLineObject.ContentObj.f369838f;
                b1Var.f317048z = 1;
                b1Var.f317032k = 1154;
                b1Var.f317034l = timeLineObject.weappInfo.f390868h + ":" + timeLineObject.UserName;
                b1Var.f317041s = appBrandLaunchReferrer;
                com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig appBrandCustomLoadingConfig = new com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig();
                b1Var.Y = appBrandCustomLoadingConfig;
                appBrandCustomLoadingConfig.f77204e = timeLineObject.gameShareCardObject.f373071m;
                if (timeLineObject.weappInfo.f390872o != null) {
                    try {
                        cl0.e eVar = new cl0.e(timeLineObject.weappInfo.f390872o);
                        b1Var.F = new java.util.ArrayList();
                        for (int i27 = 0; i27 < eVar.length(); i27++) {
                            ((java.util.ArrayList) b1Var.F).add(eVar.getString(i27));
                        }
                    } catch (cl0.f unused) {
                    }
                }
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGameShareCardAppBrandClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                z18 = true;
            }
            valueOf = java.lang.Boolean.valueOf(z18);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleGameShareCardLiteAppClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            if (timeLineObject.liteappInfo == null || timeLineObject.gameShareCardObject == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "liteappinfo or gamesharecardobject is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGameShareCardLiteAppClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            } else {
                m63.g gVar = (m63.g) i95.n0.c(m63.g.class);
                java.lang.String str2 = timeLineObject.Id;
                java.lang.String str3 = timeLineObject.AppInfo.f390846d;
                r45.e73 e73Var2 = timeLineObject.gameShareCardObject;
                ((l63.h) gVar).Bi(str2, str3, e73Var2.f373067f, e73Var2.f373066e, 2);
                if (com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.liteappInfo.f381130d)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGameShareCardLiteAppClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                } else {
                    r45.a90 a90Var = timeLineObject.ContentObj;
                    if (a90Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(a90Var.f369839g)) {
                        z19 = true;
                    }
                    java.lang.String str4 = timeLineObject.gameShareCardObject.f373069h;
                    I(i2Var);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("appId", timeLineObject.liteappInfo.f381130d);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.liteappInfo.f381131e)) {
                        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, timeLineObject.liteappInfo.f381131e);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.liteappInfo.f381132f)) {
                        bundle.putString("query", timeLineObject.liteappInfo.f381132f);
                    }
                    cl0.g gVar2 = new cl0.g();
                    java.lang.String str5 = null;
                    try {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                            gVar2.h("liteAppBizData", "");
                        } else {
                            gVar2.h("liteAppBizData", str4);
                            str5 = new cl0.g(str4).getString("wechat_pkgid");
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.gameShareCardObject.f373065d)) {
                            gVar2.h("shareData", timeLineObject.gameShareCardObject.f373065d);
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.ContentObj.f369838f)) {
                            gVar2.h(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, timeLineObject.ContentObj.f369838f);
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.ContentObj.f369836d)) {
                            gVar2.h("desc", timeLineObject.ContentObj.f369836d);
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.gameShareCardObject.f373066e)) {
                            gVar2.h("gameShareId", timeLineObject.gameShareCardObject.f373066e);
                        }
                        gVar2.o("isVideo", timeLineObject.gameShareCardObject.f373067f);
                        gVar2.o("duration", timeLineObject.gameShareCardObject.f373068g);
                        gVar2.o("sceneId", 1);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "johnjh liteapp jsonObject : " + e17.toString());
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                        bundle.putString("pkgId", str5);
                    }
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).hk(context, bundle, false, gVar2, null, new com.tencent.mm.plugin.sns.ui.kx(context, z19, i2Var));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGameShareCardLiteAppClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    z17 = true;
                }
            }
            valueOf = java.lang.Boolean.valueOf(z17);
        }
        if (!valueOf.booleanValue()) {
            android.view.View view = new android.view.View(context);
            view.setTag(i2Var);
            D.onClick(view);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gameShareCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    public static ot0.q x(r45.kv2 kv2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppMsgContent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        ot0.q qVar = new ot0.q();
        zy2.i iVar = new zy2.i();
        kotlin.jvm.internal.o.g(kv2Var, "<set-?>");
        iVar.f477411b = kv2Var;
        qVar.f(iVar);
        qVar.f348666i = 51;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppMsgContent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return qVar;
    }

    public static java.lang.String y(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReditectUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(str, "timeline");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReditectUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return wi6;
    }

    public static void z(com.tencent.mm.plugin.sns.ui.i2 i2Var, android.content.Context context, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hardTvClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        if (timeLineObject.ContentObj.f369840h.size() > 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b);
            if (K(k4Var)) {
                k4Var.a().e(k17);
            }
            java.lang.String str = ((r45.jj4) timeLineObject.ContentObj.f369840h.get(0)).f377872u;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_TV_xml", str);
            intent.putExtra("key_TV_getProductInfoScene", 2);
            j45.l.j(context, "shake", ".ui.TVInfoUI", intent, null);
        }
        I(i2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hardTvClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }
}
