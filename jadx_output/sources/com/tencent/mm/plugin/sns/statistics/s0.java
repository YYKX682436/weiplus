package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public class s0 {

    /* renamed from: j0, reason: collision with root package name */
    public static final java.lang.Integer f164936j0 = new java.lang.Integer(1);

    /* renamed from: k0, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.statistics.s0 f164937k0 = new com.tencent.mm.plugin.sns.statistics.s0();
    public long A;
    public long B;
    public long C;
    public long D;
    public final java.util.LinkedList E;
    public final java.util.List F;
    public final java.util.List G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f164938J;
    public long K;
    public com.tencent.mm.autogen.mmdata.rpt.TimelineMissReadJumpBtnExposureStruct L;
    public final com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct M;
    public com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct N;
    public java.lang.String O;
    public int P;
    public long Q;
    public int R;
    public com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct S;
    public int T;
    public com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct U;
    public com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct V;
    public int W;
    public final com.tencent.mm.autogen.mmdata.rpt.SnsCoverActionStruct X;
    public final java.util.Map Y;
    public com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct Z;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.j3 f164939a;

    /* renamed from: a0, reason: collision with root package name */
    public final java.util.List f164940a0;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f164941b;

    /* renamed from: b0, reason: collision with root package name */
    public long f164942b0;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f164943c;

    /* renamed from: c0, reason: collision with root package name */
    public java.lang.String f164944c0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f164945d;

    /* renamed from: d0, reason: collision with root package name */
    public java.lang.String f164946d0;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedHashMap f164947e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f164948e0;

    /* renamed from: f, reason: collision with root package name */
    public int f164949f = 0;

    /* renamed from: f0, reason: collision with root package name */
    public int f164950f0;

    /* renamed from: g, reason: collision with root package name */
    public cm.e f164951g;

    /* renamed from: g0, reason: collision with root package name */
    public int f164952g0;

    /* renamed from: h, reason: collision with root package name */
    public int f164953h;

    /* renamed from: h0, reason: collision with root package name */
    public final java.util.HashSet f164954h0;

    /* renamed from: i, reason: collision with root package name */
    public int f164955i;

    /* renamed from: i0, reason: collision with root package name */
    public final e62.e f164956i0;

    /* renamed from: j, reason: collision with root package name */
    public int f164957j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f164958k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct f164959l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f164960m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f164961n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f164962o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f164963p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct f164964q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f164965r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f164966s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f164967t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f164968u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f164969v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f164970w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f164971x;

    /* renamed from: y, reason: collision with root package name */
    public long f164972y;

    /* renamed from: z, reason: collision with root package name */
    public long f164973z;

    public s0() {
        this.f164953h = 100;
        this.f164955i = 14400;
        this.f164957j = 1;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f164958k = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.statistics.SnsReportHelper$2
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$2");
                java.lang.Integer num = com.tencent.mm.plugin.sns.statistics.s0.f164936j0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                com.tencent.mm.plugin.sns.statistics.s0.this.P();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$2");
                return false;
            }
        };
        this.f164959l = new com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct();
        this.f164960m = new java.util.HashMap();
        this.f164961n = new java.util.HashMap();
        this.f164962o = new java.util.HashMap();
        this.f164963p = new java.util.HashMap();
        this.f164964q = new com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct();
        this.f164965r = new java.util.ArrayList();
        this.f164966s = new java.util.ArrayList();
        this.f164967t = new java.util.ArrayList();
        this.f164968u = new java.util.ArrayList();
        this.f164969v = new java.util.ArrayList();
        this.f164970w = new java.util.ArrayList();
        this.f164971x = new java.util.ArrayList();
        this.f164972y = 0L;
        this.f164973z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = new java.util.LinkedList();
        this.F = new java.util.ArrayList();
        this.G = new java.util.ArrayList();
        this.H = 0L;
        this.I = 0L;
        this.f164938J = 0L;
        this.K = 0L;
        this.L = new com.tencent.mm.autogen.mmdata.rpt.TimelineMissReadJumpBtnExposureStruct();
        this.M = new com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct();
        this.N = new com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct();
        this.O = "";
        this.P = 0;
        this.Q = 0L;
        this.R = 0;
        this.S = new com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct();
        this.T = 0;
        this.U = new com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct();
        this.V = new com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct();
        this.W = 0;
        this.X = new com.tencent.mm.autogen.mmdata.rpt.SnsCoverActionStruct();
        this.Y = new java.util.concurrent.ConcurrentHashMap();
        this.Z = new com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct();
        this.f164940a0 = new java.util.ArrayList();
        this.f164942b0 = 0L;
        this.f164944c0 = "";
        this.f164946d0 = "";
        this.f164948e0 = false;
        this.f164950f0 = 0;
        this.f164952g0 = 0;
        this.f164954h0 = new java.util.HashSet();
        this.f164956i0 = new com.tencent.mm.plugin.sns.statistics.n0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initAbtestArg", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.f164953h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_feed_exposure_maxcachefeedcount, 100);
        this.f164955i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_feed_exposure_maxcacheseconds, 14400);
        this.f164957j = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_feed_exposure_needuploaddata, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportHelper", "initAbtestArg maxCacheFeedCount:%d, maxCacheSeconds:%d, needUploadData:%d", java.lang.Integer.valueOf(this.f164953h), java.lang.Integer.valueOf(this.f164955i), java.lang.Integer.valueOf(this.f164957j));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initAbtestArg", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        P();
        try {
            this.f164939a = new com.tencent.mm.storage.j3(com.tencent.mm.storage.v3.f196273a + "snsreport.cfg");
        } catch (java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsReportHelper", e17, "", new java.lang.Object[0]);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str = com.tencent.mm.storage.v3.f196273a;
            sb6.append(str);
            sb6.append("snsreport.cfg");
            com.tencent.mm.vfs.w6.h(sb6.toString());
            this.f164939a = new com.tencent.mm.storage.j3(str + "snsreport.cfg");
        }
        java.lang.Object b17 = this.f164939a.b(3, new java.util.HashMap());
        java.lang.Object b18 = this.f164939a.b(4, new java.util.HashMap());
        java.lang.Object b19 = this.f164939a.b(5, new java.util.HashSet());
        java.lang.Object b27 = this.f164939a.b(6, new java.util.LinkedHashMap());
        if ((b17 instanceof java.util.HashMap) && (b18 instanceof java.util.HashMap) && (b19 instanceof java.util.HashSet) && (b27 instanceof java.util.LinkedHashMap)) {
            this.f164941b = (java.util.HashMap) b17;
            this.f164943c = (java.util.HashMap) b18;
            this.f164945d = (java.util.HashSet) b19;
            this.f164947e = (java.util.LinkedHashMap) b27;
        } else {
            com.tencent.mm.vfs.w6.h(com.tencent.mm.storage.v3.f196273a + "snsreport.cfg");
            com.tencent.mm.storage.j3 j3Var = this.f164939a;
            synchronized (j3Var) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConfigFileStorage", "ConfigFileStorage reset ");
                java.io.File file = new java.io.File(j3Var.f195041a);
                if (file.exists()) {
                    file.delete();
                }
                j3Var.f195042b = new java.util.HashMap();
                if (j3Var.i()) {
                    com.tencent.mm.sdk.platformtools.o4 o4Var = j3Var.f195049i.f195115d;
                    if (o4Var != null) {
                        o4Var.d();
                    }
                    j3Var.f195049i.h(36);
                    j3Var.f195049i.j(36, null);
                }
            }
            this.f164941b = new java.util.HashMap();
            this.f164943c = new java.util.HashMap();
            this.f164945d = new java.util.HashSet();
            this.f164947e = new java.util.LinkedHashMap();
        }
        this.f164941b.size();
        this.f164943c.size();
        this.f164945d.size();
        this.f164947e.size();
        this.f164958k.alive();
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCoverPostStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct snsCoverPostStruct = this.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverPostStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return snsCoverPostStruct;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineGroupUserBehavior", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        int i17 = 0;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_GROUP_INT_SYNC, 0);
        if (r17 == 0) {
            boolean z17 = cc4.a.f40481a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
            i17 = z17;
        } else if (r17 != 2) {
            if (cc4.a.f40481a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl false");
                cc4.a.f40481a = false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        } else {
            i17 = 1;
            if (!cc4.a.f40481a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl true");
                cc4.a.f40481a = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        }
        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = this.f164959l;
        timelineGroupUserBehaviorStruct.B = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineGroupUserBehavior", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return timelineGroupUserBehaviorStruct;
    }

    public com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return this.M;
    }

    public void D(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("increaseChatroomMemberClickSet", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.util.Map map = this.f164960m;
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) map).get(str);
        if (num == null) {
            ((java.util.HashMap) map).put(str, 1);
        } else {
            ((java.util.HashMap) map).put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("increaseChatroomMemberClickSet", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public final void E(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pureSnsUserBehaviorEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportHelper", "pureSnsUserBehaviorEvent action [%d]", java.lang.Integer.valueOf(i17));
        com.tencent.mm.autogen.events.SnsBehaviorNotifyFinderEvent snsBehaviorNotifyFinderEvent = new com.tencent.mm.autogen.events.SnsBehaviorNotifyFinderEvent();
        snsBehaviorNotifyFinderEvent.f54803g.f7275a = i17;
        snsBehaviorNotifyFinderEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pureSnsUserBehaviorEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct F(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushNewAlbumFeedStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        O();
        com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct snsAlbumFeedBehaviourStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct();
        snsAlbumFeedBehaviourStruct.f60460t = i17;
        snsAlbumFeedBehaviourStruct.f60461u = snsAlbumFeedBehaviourStruct.b("albumSessionid", str, true);
        this.E.push(snsAlbumFeedBehaviourStruct);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushNewAlbumFeedStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return snsAlbumFeedBehaviourStruct;
    }

    public void G(int i17, boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report26579ModifyShareScopeExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.WCMomentsModifyShareScopeExposureReportStruct wCMomentsModifyShareScopeExposureReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCMomentsModifyShareScopeExposureReportStruct();
        wCMomentsModifyShareScopeExposureReportStruct.f62081d = i17;
        wCMomentsModifyShareScopeExposureReportStruct.f62083f = wCMomentsModifyShareScopeExposureReportStruct.b("feedid", str, true);
        wCMomentsModifyShareScopeExposureReportStruct.f62082e = z17 ? 1L : 0L;
        wCMomentsModifyShareScopeExposureReportStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report26579ModifyShareScopeExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportClickReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct timelineTrashReEditStruct = this.N;
        timelineTrashReEditStruct.f61293d = 2L;
        timelineTrashReEditStruct.k();
        this.N = new com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportClickReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void I(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.lang.String str, int i18) {
        int i19;
        int i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCommentDelete", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsInfo != null) {
            int i28 = com.tencent.mm.sdk.platformtools.t8.D0(snsInfo.getUserName(), c01.z1.r()) ? com.tencent.mm.sdk.platformtools.t8.D0(str, c01.z1.r()) ? 2 : 3 : 1;
            com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(snsInfo);
            if (e17 != null) {
                i19 = e17.CommentCount;
                i27 = e17.LikeCount;
            } else {
                i19 = 0;
                i27 = 0;
            }
            com.tencent.mm.autogen.mmdata.rpt.SnsFeedOwnerDeleteCommentReportStruct snsFeedOwnerDeleteCommentReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFeedOwnerDeleteCommentReportStruct();
            snsFeedOwnerDeleteCommentReportStruct.f60566d = snsFeedOwnerDeleteCommentReportStruct.b("PublishId", ca4.z0.s0(snsInfo.field_snsId), true);
            snsFeedOwnerDeleteCommentReportStruct.f60568f = snsFeedOwnerDeleteCommentReportStruct.b("CommentId", java.lang.String.valueOf(i17), true);
            snsFeedOwnerDeleteCommentReportStruct.f60569g = i28;
            snsFeedOwnerDeleteCommentReportStruct.f60567e = snsFeedOwnerDeleteCommentReportStruct.b("FriendUsername", str, true);
            snsFeedOwnerDeleteCommentReportStruct.f60572j = i18;
            snsFeedOwnerDeleteCommentReportStruct.f60570h = i27;
            snsFeedOwnerDeleteCommentReportStruct.f60571i = i19;
            snsFeedOwnerDeleteCommentReportStruct.k();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCommentDelete", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void J(int i17, java.lang.String str, int i18, int i19, long j17, long j18, long j19, int i27) {
        int intValue;
        java.lang.String wording;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsFinderEntrance", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        int i28 = 0;
        if (i27 == 2) {
            intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SNS_JUMP_FINDER_POST_EXPOSE_COUNT_INT_SYNC, 0)).intValue();
            wording = "";
        } else {
            intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SNS_FINDER_EXPOSE_COUNT_INT_SYNC, 0)).intValue();
            wording = str;
            i28 = i19;
        }
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        java.lang.String sessionID = f164937k0.O;
        ((c61.w8) paVar).getClass();
        kotlin.jvm.internal.o.g(sessionID, "sessionID");
        kotlin.jvm.internal.o.g(wording, "wording");
        if (i17 == 2) {
            com.tencent.mm.plugin.finder.report.o4.f125221b = sessionID;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderSnsPostStruct finderSnsPostStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderSnsPostStruct();
        finderSnsPostStruct.f57837d = finderSnsPostStruct.b("SessinId", sessionID, true);
        finderSnsPostStruct.f57838e = i17;
        finderSnsPostStruct.f57839f = j17;
        finderSnsPostStruct.f57840g = i18;
        finderSnsPostStruct.f57842i = finderSnsPostStruct.b("FinderFeedId", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(j19), true);
        finderSnsPostStruct.f57841h = finderSnsPostStruct.b("SnsFeedId", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(j18), true);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        finderSnsPostStruct.f57846m = i28;
        finderSnsPostStruct.f57847n = intValue;
        long j27 = 0;
        long j28 = com.tencent.mm.sdk.platformtools.t8.K0(e17) ? 0L : 1L;
        finderSnsPostStruct.f57843j = j28;
        if (j28 == 1 && (!bu2.e0.f24498a.j(e17, 1).isEmpty())) {
            j27 = 1;
        }
        finderSnsPostStruct.f57844k = j27;
        finderSnsPostStruct.f57845l = finderSnsPostStruct.b("Wording", wording, true);
        finderSnsPostStruct.f57848o = i27;
        finderSnsPostStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderSnsPostStruct);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsFinderEntrance", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportTimelineGroupUserBehavior", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = this.f164959l;
        if (timelineGroupUserBehaviorStruct != null && timelineGroupUserBehaviorStruct.f61247n != -1) {
            android.os.Vibrator vibrator = ca4.z0.f40068a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaEditPublishIds", "com.tencent.mm.plugin.sns.data.SnsUtil");
            java.lang.String str = ca4.z0.f40072e;
            ca4.z0.f40072e = "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaEditPublishIds", "com.tencent.mm.plugin.sns.data.SnsUtil");
            timelineGroupUserBehaviorStruct.A = timelineGroupUserBehaviorStruct.b("MediaEditedPublishIds", str, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.HashMap hashMap = (java.util.HashMap) this.f164960m;
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                sb6.append((java.lang.String) entry.getKey());
                sb6.append("|");
                sb7.append(entry.getValue());
                sb7.append("|");
            }
            int lastIndexOf = sb6.lastIndexOf("|");
            int lastIndexOf2 = sb7.lastIndexOf("|");
            if (lastIndexOf != -1) {
                com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = this.f164959l;
                timelineGroupUserBehaviorStruct2.f61249p = timelineGroupUserBehaviorStruct2.b("ChatroomMemClickList", sb6.substring(0, lastIndexOf), true);
            }
            if (lastIndexOf2 != -1) {
                com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct3 = this.f164959l;
                timelineGroupUserBehaviorStruct3.f61259z = timelineGroupUserBehaviorStruct3.b("ChatroomMemClickNumList", sb7.substring(0, lastIndexOf2), true);
            }
            this.f164959l.k();
            this.f164959l = new com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct();
            hashMap.clear();
            ((java.util.HashMap) this.f164961n).clear();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTimelineGroupUserBehavior", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void L(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportWechatWorkBlackPermiss", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.WechatWorkSnsStruct wechatWorkSnsStruct = new com.tencent.mm.autogen.mmdata.rpt.WechatWorkSnsStruct();
        wechatWorkSnsStruct.f62978f = wechatWorkSnsStruct.b("OpenimUsername", str, true);
        wechatWorkSnsStruct.f62976d = i17;
        wechatWorkSnsStruct.f62977e = i18;
        wechatWorkSnsStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportWechatWorkBlackPermiss", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportWsFoldDetail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List list = this.f164940a0;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            sb6.append(ca4.z0.s0(((java.lang.Long) it.next()).longValue()));
            sb6.append("#");
        }
        com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct = this.Z;
        snsTimelineWeiShangeFoldBrowseStruct.f60734j = snsTimelineWeiShangeFoldBrowseStruct.b("BrowseFeedList", sb6.toString(), true);
        this.Z.f60732h = ((java.util.ArrayList) list).size();
        com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct2 = this.Z;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        snsTimelineWeiShangeFoldBrowseStruct2.f60728d = snsTimelineWeiShangeFoldBrowseStruct2.b("SessionId", v52.c.g().d(), true);
        this.Z.f60735k = java.lang.System.currentTimeMillis() - this.f164942b0;
        this.Z.f60738n = pc4.d.f353410a.F() ? 2L : 1L;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportHelper", "setBrowseFeedList:%s FeedList:%s", sb6, this.Z.f60733i);
        this.Z.k();
        this.Z = new com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct();
        ((java.util.ArrayList) list).clear();
        this.f164942b0 = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportWsFoldDetail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void N() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAlbumBehaviourRpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        ((java.util.ArrayList) this.f164965r).clear();
        ((java.util.ArrayList) this.f164966s).clear();
        ((java.util.ArrayList) this.f164967t).clear();
        ((java.util.ArrayList) this.f164968u).clear();
        ((java.util.ArrayList) this.f164969v).clear();
        ((java.util.ArrayList) this.f164970w).clear();
        ((java.util.ArrayList) this.f164971x).clear();
        this.f164972y = 0L;
        this.f164973z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAlbumBehaviourRpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetFeedBehaviourRpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        ((java.util.ArrayList) this.F).clear();
        ((java.util.ArrayList) this.G).clear();
        this.H = 0L;
        this.f164938J = 0L;
        this.I = 0L;
        this.K = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetFeedBehaviourRpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public final void P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetXExptControl", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.f164949f = 100;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportHelper", "resetXExptControl maxFeedIdForCgiRecord[%d]", 100);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetXExptControl", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct Q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeGetLastSnsAlbumFeedBehaviourStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct snsAlbumFeedBehaviourStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct) this.E.peekLast();
        if (snsAlbumFeedBehaviourStruct == null) {
            snsAlbumFeedBehaviourStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeGetLastSnsAlbumFeedBehaviourStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return snsAlbumFeedBehaviourStruct;
    }

    public void R(android.view.View view, com.tencent.mm.plugin.sns.ui.ns nsVar, java.lang.String str, java.lang.String str2, int i17, int i18, boolean z17, int i19, int i27) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        int i28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupSnsLikeRptStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (view != null && nsVar != null && nsVar.f170037i != null && (snsInfo = nsVar.f170025a) != null && snsInfo.getTimeLine() != null && nsVar.f170025a.getTimeLine().ContentObj != null) {
            java.util.Map map = this.f164962o;
            if (((java.util.HashMap) map).get(ca4.z0.t0(nsVar.f170025a.field_snsId)) == null) {
                java.lang.String r17 = c01.z1.r();
                com.tencent.mm.autogen.mmdata.rpt.SnsLikeCollapseStruct snsLikeCollapseStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsLikeCollapseStruct();
                snsLikeCollapseStruct.f60591d = snsLikeCollapseStruct.b("Username", nsVar.f170025a.getUserName(), true);
                snsLikeCollapseStruct.f60592e = snsLikeCollapseStruct.b("PublicID", ca4.z0.t0(nsVar.f170025a.field_snsId), true);
                snsLikeCollapseStruct.f60593f = nsVar.f170025a.getTimeLine().ContentObj.f369837e;
                int i29 = 0;
                snsLikeCollapseStruct.f60594g = str.split(",") != null ? r8.length : 0;
                snsLikeCollapseStruct.f60595h = str2.split(",") != null ? r7.length : 0;
                snsLikeCollapseStruct.f60596i = i17;
                snsLikeCollapseStruct.f60597j = i18;
                if (z17) {
                    snsLikeCollapseStruct.f60598k = 1L;
                } else {
                    snsLikeCollapseStruct.f60598k = 2L;
                }
                if (nsVar.U != null) {
                    for (int i37 = 0; i37 < nsVar.U.b(); i37++) {
                        if (com.tencent.mm.sdk.platformtools.t8.D0(r17, (java.lang.String) ((nm5.j) nsVar.U.a(i37)).a(0))) {
                            i28 = 1;
                            break;
                        }
                    }
                }
                i28 = 4;
                if (nsVar.V != null) {
                    while (true) {
                        if (i29 >= nsVar.V.b()) {
                            break;
                        }
                        nm5.j jVar = (nm5.j) nsVar.V.a(i29);
                        if ((jVar.a(1) instanceof java.lang.String) && com.tencent.mm.sdk.platformtools.t8.D0(r17, (java.lang.String) jVar.a(1))) {
                            i28 = i28 == 1 ? 3 : 2;
                        } else {
                            i29++;
                        }
                    }
                    snsLikeCollapseStruct.f60599l = nsVar.V.b();
                }
                snsLikeCollapseStruct.f60602o = i28;
                snsLikeCollapseStruct.f60609v = i27;
                snsLikeCollapseStruct.f60604q = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.statistics.r0 r0Var = new com.tencent.mm.plugin.sns.statistics.r0(this);
                r0Var.f164935a = snsLikeCollapseStruct;
                ((java.util.HashMap) map).put(ca4.z0.t0(nsVar.f170025a.field_snsId), r0Var);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupSnsLikeRptStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void S(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLastVisibleReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (list != null && !list.isEmpty() && this.f164959l != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                wa4.y yVar = (wa4.y) it.next();
                int i17 = yVar.f444306e;
                if (i17 == 0) {
                    arrayList2.add(yVar.f444305d);
                } else if (i17 == 1) {
                    arrayList3.add(yVar.f444305d);
                } else if (i17 == 2) {
                    arrayList.add(yVar.f444305d);
                }
            }
            if (arrayList3.size() > 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    java.lang.String str = (java.lang.String) it6.next();
                    java.lang.String e17 = ((b93.b) c93.a.a()).e(str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                        e17 = str;
                    }
                    java.util.List j17 = ((b93.b) c93.a.a()).j(e17);
                    if (j17 == null || j17.size() == 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsReportHelper", "[updateLastVisibleReport] label empty, id:%s, name:%s", e17, str);
                    } else {
                        sb6.append(str);
                        sb6.append("|");
                        sb6.append(j17.size());
                        sb6.append(";");
                    }
                }
                this.f164959l.f61245l = arrayList3.size();
                com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = this.f164959l;
                timelineGroupUserBehaviorStruct.f61246m = timelineGroupUserBehaviorStruct.b("LatestTimelinePsotSettingLabelList", sb6.toString(), true);
            }
            if (arrayList.size() > 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it7.next();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                    java.util.List<java.lang.String> n17 = c01.v1.n(str2);
                    if (n17 != null) {
                        for (java.lang.String str3 : n17) {
                            if (c01.e2.J(str3)) {
                                arrayList4.add(str3);
                            }
                        }
                        sb7.append(str2);
                        sb7.append("|");
                        sb7.append(arrayList4.size());
                        sb7.append(";");
                    }
                }
                this.f164959l.f61241h = arrayList.size();
                com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = this.f164959l;
                timelineGroupUserBehaviorStruct2.f61242i = timelineGroupUserBehaviorStruct2.b("LatestTimelinePsotSettingGroupList", sb7.toString(), true);
            }
            this.f164959l.f61243j = arrayList2.size();
            com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct3 = this.f164959l;
            timelineGroupUserBehaviorStruct3.f61244k = timelineGroupUserBehaviorStruct3.b("LatestTimelinePsotSettingUinList", com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, "|"), true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLastVisibleReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void T(java.util.List list) {
        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSelectedContactReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (list != null && !list.isEmpty() && (timelineGroupUserBehaviorStruct = this.f164959l) != null) {
            timelineGroupUserBehaviorStruct.f61253t = list.size();
            com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = this.f164959l;
            timelineGroupUserBehaviorStruct2.f61254u = timelineGroupUserBehaviorStruct2.b("SelectedUINList", com.tencent.mm.sdk.platformtools.t8.c1(list, "|"), true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSelectedContactReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void U(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTimelinePostPrivaceSetting", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = this.f164959l;
        if (timelineGroupUserBehaviorStruct != null) {
            if (i17 == 0) {
                timelineGroupUserBehaviorStruct.f61247n = 1;
            } else if (i17 == 1) {
                timelineGroupUserBehaviorStruct.f61247n = 2;
            } else if (i17 == 2) {
                timelineGroupUserBehaviorStruct.f61247n = 3;
            } else if (i17 == 3) {
                timelineGroupUserBehaviorStruct.f61247n = 4;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTimelinePostPrivaceSetting", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void V(long j17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateWsFoldClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct snsTimelineWeiShangeFoldExposeStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct) ((java.util.concurrent.ConcurrentHashMap) this.Y).get(java.lang.Long.valueOf(j17));
        if (snsTimelineWeiShangeFoldExposeStruct != null) {
            if (z17) {
                snsTimelineWeiShangeFoldExposeStruct.f60744i = 1;
            } else {
                snsTimelineWeiShangeFoldExposeStruct.f60744i = 2;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWsFoldClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void W(long j17, boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateWsFoldExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct snsTimelineWeiShangeFoldExposeStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct) ((java.util.concurrent.ConcurrentHashMap) this.Y).get(java.lang.Long.valueOf(j17));
        if (snsTimelineWeiShangeFoldExposeStruct != null) {
            if (z17) {
                snsTimelineWeiShangeFoldExposeStruct.f60743h = 1;
                snsTimelineWeiShangeFoldExposeStruct.f60746k = i17 + 1;
            } else {
                snsTimelineWeiShangeFoldExposeStruct.f60743h = 2;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWsFoldExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void X(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("wsFoldExposeItem", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.util.List list = this.f164940a0;
        if (!((java.util.ArrayList) list).contains(java.lang.Long.valueOf(j17))) {
            ((java.util.ArrayList) list).add(java.lang.Long.valueOf(j17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("wsFoldExposeItem", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browseDetailMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsInfo != null) {
            java.lang.String str = ca4.z0.s0(snsInfo.field_snsId) + "_" + i17;
            java.util.List list = this.f164971x;
            if (!((java.util.ArrayList) list).contains(str)) {
                ((java.util.ArrayList) list).add(str);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browseDetailMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReportFinderShareMoment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.S.k();
        this.S = new com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportFinderShareMoment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void c(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReportMaasTemplate", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.SecondCutSmallTailStruct secondCutSmallTailStruct = new com.tencent.mm.autogen.mmdata.rpt.SecondCutSmallTailStruct();
        secondCutSmallTailStruct.f60178d = secondCutSmallTailStruct.b("Publishid", str, true);
        secondCutSmallTailStruct.f60179e = i17;
        secondCutSmallTailStruct.f60181g = 1;
        secondCutSmallTailStruct.f60182h = secondCutSmallTailStruct.b("EgID", str2, true);
        secondCutSmallTailStruct.f60183i = secondCutSmallTailStruct.b("MusicID", str3, true);
        secondCutSmallTailStruct.f60180f = dw3.c.f244181a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF") ? 1 : 2;
        secondCutSmallTailStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportMaasTemplate", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReportSecondCutShareMoment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.U.k();
        this.U = new com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportSecondCutShareMoment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void e(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReportSecondCutSmallTail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.SecondCutSmallTailStruct secondCutSmallTailStruct = new com.tencent.mm.autogen.mmdata.rpt.SecondCutSmallTailStruct();
        secondCutSmallTailStruct.f60178d = secondCutSmallTailStruct.b("Publishid", str, true);
        secondCutSmallTailStruct.f60179e = i17;
        secondCutSmallTailStruct.f60181g = 2;
        secondCutSmallTailStruct.f60180f = dw3.c.f244181a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF") ? 1 : 2;
        secondCutSmallTailStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportSecondCutSmallTail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReportSnsCoverActionStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (!w94.a.f444075a.b()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportSnsCoverActionStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverActionStruct snsCoverActionStruct = this.X;
        int i18 = snsCoverActionStruct.f60509e;
        if (i18 == 1 || i18 == 2) {
            snsCoverActionStruct.f60512h = snsCoverActionStruct.b("FinderFeedID", "", true);
        }
        snsCoverActionStruct.f60511g = i17;
        snsCoverActionStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportSnsCoverActionStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReportSnsCoverPostStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (!w94.a.f444075a.b()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportSnsCoverPostStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct snsCoverPostStruct = this.V;
        int i17 = snsCoverPostStruct.f60513d;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsReportHelper", "error source");
            this.V = new com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportSnsCoverPostStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            return;
        }
        if (i17 == 1 || i17 == 2 || i17 == 8) {
            snsCoverPostStruct.f60516g = snsCoverPostStruct.b("FinderFeedID", "", true);
        }
        this.V.k();
        this.V = new com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportSnsCoverPostStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSnsAlbumFeedBehaviourReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct Q = Q();
        Q.f60452l = ((java.util.ArrayList) this.F).size();
        Q.f60453m = ((java.util.ArrayList) this.G).size();
        Q.f60454n = this.K;
        Q.f60455o = this.I;
        Q.n();
        Q.k();
        try {
            this.E.removeLast();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsReportHelper", "doSnsAlbumFeedBehaviourReport remove err: %s", e17.getMessage());
        }
        O();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSnsAlbumFeedBehaviourReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void i(java.util.List list, long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterWsFoldDetail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.f164942b0 = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append(ca4.z0.s0(((java.lang.Long) it.next()).longValue()));
            sb6.append("#");
        }
        com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct = this.Z;
        snsTimelineWeiShangeFoldBrowseStruct.f60733i = snsTimelineWeiShangeFoldBrowseStruct.b("FeedList", sb6.toString(), true);
        this.Z.f60731g = list.size();
        com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct2 = this.Z;
        snsTimelineWeiShangeFoldBrowseStruct2.f60729e = snsTimelineWeiShangeFoldBrowseStruct2.b("FoldedBlockId", ca4.z0.s0(j17), true);
        com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct3 = this.Z;
        snsTimelineWeiShangeFoldBrowseStruct3.f60729e = snsTimelineWeiShangeFoldBrowseStruct3.b("FoldedBlockId", ca4.z0.s0(j17), true);
        com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct4 = this.Z;
        snsTimelineWeiShangeFoldBrowseStruct4.f60730f = snsTimelineWeiShangeFoldBrowseStruct4.b("UserName", str, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterWsFoldDetail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exitTimeline", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (this.f164957j == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exitTimeline", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            return;
        }
        try {
            int i17 = 0;
            int i18 = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportHelper", "exitTimeline exposureFeedSize %d, exposureAppIdSize %d", java.lang.Integer.valueOf(this.f164941b.size()), java.lang.Integer.valueOf(this.f164943c.size()));
            long d17 = this.f164939a.d(2, 0L);
            if (this.f164941b.isEmpty() || (this.f164941b.size() <= this.f164953h && com.tencent.mm.sdk.platformtools.t8.H1(d17) <= this.f164955i)) {
                this.f164939a.f(3, this.f164941b);
                this.f164939a.f(4, this.f164943c);
                this.f164939a.f(5, this.f164945d);
            } else {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                int i19 = 0;
                int i27 = 0;
                for (java.lang.String str : this.f164941b.keySet()) {
                    java.lang.String str2 = (java.lang.String) this.f164943c.get(str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        str2 = "";
                    } else {
                        i19 = i18;
                    }
                    stringBuffer.append(str + "#" + this.f164941b.get(str) + "#" + str2 + "#" + (this.f164945d.contains(str) ? i18 : i17) + "|");
                    i27++;
                    i17 = 0;
                    i18 = 1;
                }
                stringBuffer.append("," + d17 + "," + com.tencent.mm.sdk.platformtools.t8.i1() + ",1," + i19 + "," + i27 + ",1");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(13226, stringBuffer.toString());
                this.f164939a.f(3, null);
                this.f164939a.f(4, null);
                this.f164939a.f(5, null);
                this.f164941b.clear();
                this.f164943c.clear();
                this.f164945d.clear();
                this.f164939a.h(2, com.tencent.mm.sdk.platformtools.t8.i1());
            }
        } catch (java.lang.ClassCastException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsReportHelper", "exitTimeline ClassCastException e : [%s]", e17);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsReportHelper", "exitTimeline Exception e : [%s]", e18);
        }
        synchronized (this) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveExposureFeedIdForCgi", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            if (this.f164949f <= 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveExposureFeedIdForCgi", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            } else {
                s75.d.b(new com.tencent.mm.plugin.sns.statistics.l0(this, (java.util.LinkedHashMap) this.f164947e.clone()), "save_exposure_feed");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveExposureFeedIdForCgi", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushExitSnsTimeLineEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        v30.e eVar = (v30.e) i95.n0.c(v30.e.class);
        e62.e eVar2 = this.f164956i0;
        ((u30.e) eVar).getClass();
        e62.n.f249785d = -1;
        e62.n.f249786e = -1;
        e62.n.f249784c.clear();
        if (eVar2 != null) {
            e62.n.f249783b.remove(eVar2);
        }
        E(2);
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.sns.statistics.p0(this), "sns_feed_expose_tag");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushExitSnsTimeLineEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exitTimeline", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void k(java.lang.String str) {
        com.tencent.mm.plugin.sns.statistics.r0 r0Var;
        com.tencent.mm.autogen.mmdata.rpt.SnsLikeCollapseStruct snsLikeCollapseStruct;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exposeSnsLikeClickComment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (str != null && (r0Var = (com.tencent.mm.plugin.sns.statistics.r0) ((java.util.HashMap) this.f164962o).get(str)) != null && (snsLikeCollapseStruct = r0Var.f164935a) != null) {
            snsLikeCollapseStruct.f60601n = 1L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposeSnsLikeClickComment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void l(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.statistics.r0 r0Var;
        com.tencent.mm.autogen.mmdata.rpt.SnsLikeCollapseStruct snsLikeCollapseStruct;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exposeSnsLikeClickLike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (str != null && (r0Var = (com.tencent.mm.plugin.sns.statistics.r0) ((java.util.HashMap) this.f164962o).get(str)) != null && (snsLikeCollapseStruct = r0Var.f164935a) != null) {
            if (z17) {
                snsLikeCollapseStruct.f60600m = 1L;
            } else {
                snsLikeCollapseStruct.f60600m = 3L;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposeSnsLikeClickLike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void m(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.statistics.r0 r0Var;
        com.tencent.mm.autogen.mmdata.rpt.SnsLikeCollapseStruct snsLikeCollapseStruct;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exposeSnsLikeClickOpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (str != null && (r0Var = (com.tencent.mm.plugin.sns.statistics.r0) ((java.util.HashMap) this.f164962o).get(str)) != null && (snsLikeCollapseStruct = r0Var.f164935a) != null) {
            if (z17) {
                snsLikeCollapseStruct.f60603p = 1L;
            } else {
                snsLikeCollapseStruct.f60610w = 1L;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposeSnsLikeClickOpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void n(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exposure", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (this.f164957j == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposure", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            return;
        }
        java.util.HashMap hashMap = this.f164941b;
        hashMap.put(str, java.lang.Integer.valueOf(hashMap.containsKey(str) ? 1 + ((java.lang.Integer) hashMap.get(str)).intValue() : 1));
        if (z17) {
            this.f164945d.add(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposure", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exposureAppId", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (this.f164957j == 0 || com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposureAppId", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        } else {
            this.f164943c.put(str, str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposureAppId", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
    }

    public synchronized void p(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exposureFeedId", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (this.f164949f > 0) {
            this.f164947e.put(java.lang.Long.valueOf(j17), f164936j0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposureFeedId", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void q(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feedBrowseDetailMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsInfo != null) {
            java.lang.String str = ca4.z0.s0(snsInfo.field_snsId) + "_" + i17;
            java.util.List list = this.F;
            if (!((java.util.ArrayList) list).contains(str)) {
                ((java.util.ArrayList) list).add(str);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedBrowseDetailMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feedGalleryPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.H = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedGalleryPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public void s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feedGalleryPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (this.H != 0) {
            this.I += java.lang.System.currentTimeMillis() - this.H;
            this.H = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedGalleryPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    public com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickTimelineReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct timelineTrashReEditStruct = this.N;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickTimelineReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return timelineTrashReEditStruct;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderShareMomentReportStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct finderShareMomentReportStruct = this.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderShareMomentReportStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return finderShareMomentReportStruct;
    }

    public synchronized java.util.LinkedList v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRealExposureForCgi", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f164947e.clone();
        if (linkedHashMap.size() > 0 && this.f164949f > 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = linkedHashMap.keySet().iterator();
            int i17 = 0;
            while (it.hasNext()) {
                linkedList.addFirst((java.lang.Long) it.next());
                i17++;
                if (i17 > this.f164949f) {
                    linkedList.removeLast();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealExposureForCgi", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            return linkedList;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealExposureForCgi", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return null;
    }

    public java.util.Set w(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSearchLabelCntOfDynaLabelByVisibleState", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.util.Map map = this.f164961n;
        if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) == null) {
            ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), new java.util.HashSet());
        }
        java.util.Set set = (java.util.Set) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSearchLabelCntOfDynaLabelByVisibleState", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return set;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct x() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSecondCutShareSnsStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct secondCutShareSnsStruct = this.U;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSecondCutShareSnsStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return secondCutShareSnsStruct;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAlbumBehaviourInfo", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct = this.f164964q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAlbumBehaviourInfo", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return snsUserBehaviourInfoStruct;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsCoverActionStruct z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCoverActionStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverActionStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return this.X;
    }
}
