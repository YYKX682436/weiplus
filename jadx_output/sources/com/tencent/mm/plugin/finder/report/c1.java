package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class c1 extends com.tencent.mm.plugin.finder.report.r0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f124971u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.report.n4 f124972v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f124973w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f124974x;

    /* renamed from: y, reason: collision with root package name */
    public long f124975y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f124976z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.ui.MMFragmentActivity activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f124971u = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f124973w = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f124974x = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return super.F0(dispatcher, event) || (event instanceof ec2.a) || (event instanceof fc2.s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x01e8, code lost:
    
        if ((r2.f125153a == r10) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02b7, code lost:
    
        if ((r2.f125153a == r10) != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03f8, code lost:
    
        if ((r2.f125153a == r10) != false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x046d, code lost:
    
        if ((r2.f125153a == r10) != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0536, code lost:
    
        if ((r2.f125153a == r10) != false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05b0, code lost:
    
        if ((r2.f125153a == r10) != false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x05f9, code lost:
    
        if ((r2.f125153a == r10) != false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x066e, code lost:
    
        if ((r2.f125153a == r10) != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x06b8, code lost:
    
        if ((r2.f125153a == r10) != false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x072a, code lost:
    
        if ((r2.f125153a == r10) != false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0774, code lost:
    
        if ((r2.f125153a == r10) != false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x07be, code lost:
    
        if ((r2.f125153a == r10) != false) goto L405;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G0(fc2.a r46) {
        /*
            Method dump skipped, instructions count: 2847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.c1.G0(fc2.a):void");
    }

    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void H0() {
        if (this.f124972v == null) {
            com.tencent.mars.xlog.Log.i("FinderHorizontalVideoReporter", "onRelease lastCenterFeed is null!");
        }
        pm0.v.O("FinderReporterThread", new com.tencent.mm.plugin.finder.report.a1(this));
        super.H0();
    }

    @Override // com.tencent.mm.plugin.finder.report.r0
    public void O0() {
        this.f125289p = false;
        if (this.f124972v == null) {
            com.tencent.mars.xlog.Log.i("FinderHorizontalVideoReporter", "onInvisible lastCenterFeed is null!");
        }
        pm0.v.O("FinderReporterThread", new com.tencent.mm.plugin.finder.report.a1(this));
    }

    @Override // com.tencent.mm.plugin.finder.report.r0
    public java.util.LinkedList R0() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f124971u;
        if (concurrentLinkedQueue.size() <= 0) {
            return new java.util.LinkedList();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(concurrentLinkedQueue);
        concurrentLinkedQueue.clear();
        com.tencent.mm.plugin.finder.report.w4.f125422a.b(linkedList, this.f125284h, 0);
        return linkedList;
    }

    public final void S0(com.tencent.mm.plugin.finder.report.n4 n4Var) {
        jz5.l f17 = cu2.x.f222449a.f(n4Var.f125153a);
        T0(n4Var, (int) ((java.lang.Number) f17.f302833d).floatValue(), ((java.lang.Number) f17.f302834e).intValue());
    }

    public final void T0(com.tencent.mm.plugin.finder.report.n4 n4Var, int i17, int i18) {
        if (i18 == 0) {
            return;
        }
        n4Var.F = i17;
        n4Var.R.add(java.lang.Integer.valueOf(i17));
        int i19 = (int) ((i17 * 100.0f) / i18);
        int[] iArr = n4Var.f125179n;
        int i27 = n4Var.f125183p;
        if (i19 > iArr[i27]) {
            iArr[i27] = i19;
        }
        if (i19 > n4Var.f125189t) {
            n4Var.f125188s = i17;
            n4Var.f125189t = i19;
        }
        n4Var.Z = i19;
    }

    public final void U0(com.tencent.mm.plugin.finder.report.n4 n4Var, r45.vd6 vd6Var, boolean z17) {
        com.tencent.mm.plugin.finder.report.o0 o0Var;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = n4Var.f125159d;
        if ((finderItem == null || finderItem.isUrlValid()) ? false : true) {
            return;
        }
        int i17 = n4Var.f125185q;
        com.tencent.mm.plugin.finder.report.o0 o0Var2 = com.tencent.mm.plugin.finder.report.r0.f125279q;
        if (i17 > 0) {
            o0Var = o0Var2;
            com.tencent.mm.plugin.finder.report.o0.b(o0Var2, this.f125284h, n4Var.f125153a, n4Var.f125155b, 5, java.lang.String.valueOf(i17), n4Var.f125167h, null, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        } else {
            o0Var = o0Var2;
        }
        long j17 = n4Var.f125173k - n4Var.f125157c;
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        int integer = this.f125284h.getInteger(5);
        long j18 = n4Var.f125153a;
        java.lang.String t17 = r26.i0.t(o3Var.ek(j18, n4Var.f125155b, integer), ",", ";", false);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[10];
        lVarArr[0] = new jz5.l("feed_stay_time", java.lang.Long.valueOf(j17));
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(j18));
        lVarArr[2] = new jz5.l("session_buffer", t17);
        lVarArr[3] = new jz5.l("behaviour_session_id", this.f125284h.getString(0));
        lVarArr[4] = new jz5.l("finder_context_id", this.f125284h.getString(1));
        lVarArr[5] = new jz5.l("finder_tab_context_id", this.f125284h.getString(2));
        lVarArr[6] = new jz5.l("extra_info", this.f125284h.getString(11));
        lVarArr[7] = new jz5.l("enter_source_info", this.f125284h.getString(12));
        lVarArr[8] = new jz5.l("comment_scene", java.lang.Integer.valueOf(this.f125284h.getInteger(5)));
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = n4Var.f125159d;
        lVarArr[9] = new jz5.l("finder_username", finderItem2 != null ? finderItem2.getUserName() : null);
        ((cy1.a) rVar).Cj("finder_feed_stay", null, kz5.c1.k(lVarArr), 24617);
        com.tencent.mm.plugin.finder.report.o0.b(o0Var, this.f125284h, n4Var.f125153a, n4Var.f125155b, 2, java.lang.String.valueOf(j17), 0L, n4Var.f125154a0, null, null, com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC, null);
        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoReporter", "LV-Data-Trace report 18054 video stay time isFeedChange=" + z17 + ", duration:" + j17);
        int i18 = n4Var.f125189t;
        if (i18 > 0) {
            com.tencent.mm.plugin.finder.report.o0.b(o0Var, this.f125284h, n4Var.f125153a, n4Var.f125155b, 11, java.lang.String.valueOf(i18), n4Var.f125167h, null, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        }
        r45.qt2 qt2Var = this.f125284h;
        long j19 = n4Var.f125153a;
        java.lang.String str = n4Var.f125155b;
        r45.oi oiVar = (r45.oi) vd6Var.getCustom(1);
        com.tencent.mm.plugin.finder.report.o0.b(o0Var, qt2Var, j19, str, 3, java.lang.String.valueOf(oiVar != null ? java.lang.Long.valueOf(oiVar.getLong(0)) : ""), n4Var.f125167h, null, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, n4Var.V);
        jSONObject.put("isPause", n4Var.O);
        jSONObject.put("isSeek", n4Var.P);
        jSONObject.put("playProgressInfo", n4Var.Q);
        jSONObject.put("maxPlayPercent", n4Var.f125189t);
        jSONObject.put("maxPlayLength", n4Var.f125188s);
        jSONObject.put("videoDuration", n4Var.W);
        jSONObject.put("playTime", n4Var.L);
        jSONObject.put("realPlayTime", n4Var.f125152J);
        jSONObject.put("voiceInfo", n4Var.U);
        jSONObject.put("playFormat", n4Var.X);
        jSONObject.put("firstPlay", n4Var.f125160d0);
        jSONObject.put("playWaitingCount", n4Var.f125162e0);
        jSONObject.put("firstFrameTime", n4Var.f125164f0);
        jSONObject.put("firstLoadTime", n4Var.f125166g0);
        jSONObject.put("hitPreload", n4Var.f125168h0);
        jSONObject.put("hitPreloadPercent", n4Var.f125170i0);
        jSONObject.put("playFileFormat", n4Var.f125172j0);
        jSONObject.put("downloadSpeed", n4Var.f125174k0);
        jSONObject.put("videoBitrate", n4Var.f125176l0);
        r45.qt2 qt2Var2 = this.f125284h;
        long j27 = n4Var.f125153a;
        java.lang.String str2 = n4Var.f125155b;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.finder.report.o0.b(o0Var, qt2Var2, j27, str2, 17, r26.i0.t(jSONObject2, ",", ";", false), n4Var.f125167h, null, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr2 = new jz5.l[19];
        lVarArr2[0] = new jz5.l("is_Pause", java.lang.Integer.valueOf(n4Var.O));
        lVarArr2[1] = new jz5.l("is_Seek", java.lang.Integer.valueOf(n4Var.P));
        lVarArr2[2] = new jz5.l("play_progress_info", n4Var.Q);
        lVarArr2[3] = new jz5.l("max_play_percent", java.lang.Integer.valueOf(n4Var.f125189t));
        lVarArr2[4] = new jz5.l("max_play_length", java.lang.Integer.valueOf(n4Var.f125188s));
        lVarArr2[5] = new jz5.l("video_duration", java.lang.Integer.valueOf(n4Var.W));
        lVarArr2[6] = new jz5.l("play_time", java.lang.Long.valueOf(n4Var.L));
        lVarArr2[7] = new jz5.l("real_play_time", java.lang.Long.valueOf(n4Var.f125152J));
        lVarArr2[8] = new jz5.l("voice_info", n4Var.U);
        lVarArr2[9] = new jz5.l("play_format", n4Var.X);
        lVarArr2[10] = new jz5.l("feed_id", pm0.v.u(j18));
        lVarArr2[11] = new jz5.l("session_buffer", t17);
        lVarArr2[12] = new jz5.l("behaviour_session_id", this.f125284h.getString(0));
        lVarArr2[13] = new jz5.l("finder_context_id", this.f125284h.getString(1));
        lVarArr2[14] = new jz5.l("finder_tab_context_id", this.f125284h.getString(2));
        lVarArr2[15] = new jz5.l("extra_info", this.f125284h.getString(11));
        lVarArr2[16] = new jz5.l("enter_source_info", this.f125284h.getString(12));
        lVarArr2[17] = new jz5.l("comment_scene", java.lang.Integer.valueOf(this.f125284h.getInteger(5)));
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = n4Var.f125159d;
        lVarArr2[18] = new jz5.l("finder_username", finderItem3 != null ? finderItem3.getUserName() : null);
        ((cy1.a) rVar2).Cj("finder_feed_video_play", null, kz5.c1.k(lVarArr2), 24617);
        com.tencent.mm.plugin.finder.report.o0 o0Var3 = o0Var;
        o0Var3.c(this.f125284h, n4Var, 1);
        o0Var3.f(this.f125284h, n4Var);
        V0();
    }

    public final void V0() {
        r45.jn0 jn0Var;
        com.tencent.mm.plugin.finder.report.n4 n4Var;
        com.tencent.mm.plugin.finder.report.n4 n4Var2 = this.f124972v;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f124973w;
        if (n4Var2 != null) {
            if (n4Var2.P > 0) {
                concurrentLinkedQueue.add(hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", 13))));
            }
            if (n4Var2.H > 0) {
                concurrentLinkedQueue.add(hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", 14))));
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (this.f124972v != null) {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                com.tencent.mars.xlog.Log.i("FinderHorizontalVideoReporter", "reportExtStatsInCenterSwitch action: " + str);
                kotlin.jvm.internal.o.d(str);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (n4Var = this.f124972v) == null) {
                    jn0Var = null;
                } else {
                    jn0Var = new r45.jn0();
                    long j17 = n4Var.f125153a;
                    jn0Var.set(0, java.lang.Long.valueOf(j17));
                    java.lang.String str2 = n4Var.f125155b;
                    jn0Var.set(12, str2);
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = n4Var.f125159d;
                    if (finderItem != null) {
                        jn0Var.set(1, finderItem.getUserName());
                    }
                    jn0Var.set(2, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str2, this.f125284h.getInteger(5)));
                    jn0Var.set(3, str);
                    jn0Var.set(4, java.lang.Integer.valueOf(n4Var.W));
                    jn0Var.set(5, java.lang.Integer.valueOf(finderItem != null ? finderItem.getMediaType() : 0));
                }
                if (jn0Var != null) {
                    linkedList.add(jn0Var);
                }
            }
            concurrentLinkedQueue.clear();
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f124974x;
            linkedList.addAll(concurrentLinkedQueue2);
            concurrentLinkedQueue2.clear();
            if (!linkedList.isEmpty()) {
                com.tencent.mm.plugin.finder.report.k4.E.a(this.f125284h, linkedList);
            }
        }
    }

    public final void W0(java.lang.String feedActionValue) {
        kotlin.jvm.internal.o.g(feedActionValue, "feedActionValue");
        com.tencent.mm.plugin.finder.report.n4 n4Var = this.f124972v;
        if (n4Var != null) {
            com.tencent.mars.xlog.Log.i("FinderHorizontalVideoReporter", "sendExtStatsReport ".concat(feedActionValue));
            r45.jn0 jn0Var = new r45.jn0();
            long j17 = n4Var.f125153a;
            jn0Var.set(0, java.lang.Long.valueOf(j17));
            java.lang.String str = n4Var.f125155b;
            jn0Var.set(12, str);
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = n4Var.f125159d;
            if (finderItem != null) {
                jn0Var.set(1, finderItem.getUserName());
            }
            jn0Var.set(2, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str, this.f125284h.getInteger(5)));
            jn0Var.set(3, feedActionValue);
            jn0Var.set(4, java.lang.Integer.valueOf(n4Var.W));
            jn0Var.set(5, java.lang.Integer.valueOf(finderItem != null ? finderItem.getMediaType() : 0));
            com.tencent.mm.plugin.finder.report.k4.E.b(this.f125284h, jn0Var);
        }
    }
}
