package wv2;

/* loaded from: classes10.dex */
public final class c extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f450000h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.f0 f450001i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvMediaProcessStage$feedDeleteListener$1 f450002m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvMediaProcessStage$feedDeleteListener$1] */
    public c(com.tencent.mm.plugin.finder.storage.FinderItem mainFinderObj) {
        super(java.lang.String.valueOf(mainFinderObj.getLocalId()));
        kotlin.jvm.internal.o.g(mainFinderObj, "mainFinderObj");
        this.f450000h = mainFinderObj;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f450002m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvMediaProcessStage$feedDeleteListener$1
            {
                this.__eventId = -108499199;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
                com.tencent.mm.autogen.events.FeedDeleteEvent event = feedDeleteEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.da daVar = event.f54247g;
                long j17 = daVar.f6438b;
                if (j17 == 0) {
                    return false;
                }
                wv2.c cVar = wv2.c.this;
                if (j17 != cVar.f450000h.getLocalId()) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "feedDeleteListener localId:" + daVar.f6438b);
                cu2.t tVar = cu2.u.f222441a;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = cVar.f450000h;
                if (tVar.k(finderItem.getLocalId())) {
                    return false;
                }
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.setUploadLogicError(200);
                }
                com.tencent.mm.plugin.vlog.model.f0 f0Var = cVar.f450001i;
                if (f0Var == null) {
                    return false;
                }
                com.tencent.mm.plugin.vlog.model.f0.b(f0Var, null, 1, null);
                return false;
            }
        };
    }

    @Override // pv2.g
    public int a() {
        return 2;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        boolean isLongVideo = this.f450000h.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 20L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 20L, 1L);
            }
        }
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        boolean isLongVideo = this.f450000h.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 20L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 20L, 1L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r3v21, types: [pc0.g2] */
    /* JADX WARN: Type inference failed for: r3v34, types: [r45.mb4, com.tencent.mm.protobuf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.tencent.mm.protobuf.e, r45.jf2] */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.tencent.mm.protocal.protobuf.FinderMedia] */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [dm.i4, com.tencent.mm.plugin.finder.storage.FinderItem] */
    @Override // ov2.e
    public pv2.g j() {
        java.util.LinkedList list;
        int i17;
        wv2.c cVar;
        pv2.g mVar;
        java.lang.Object obj;
        int i18;
        wv2.c cVar2;
        boolean z17;
        int i19;
        android.graphics.BitmapFactory.Options options;
        wv2.c cVar3;
        boolean z18;
        int i27;
        int i28;
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject;
        r45.g70 g70Var;
        java.util.LinkedList linkedList;
        com.tencent.mm.protocal.protobuf.FinderMediaReportInfo target;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        java.util.LinkedList list2;
        java.lang.Object obj2;
        wv2.c cVar4 = this;
        com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "start localId:" + cVar4.f450000h.getLocalId());
        cVar4.f450002m.alive();
        com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "start localId:" + cVar4.f450000h.getLocalId());
        cVar4.f450002m.alive();
        cVar4.f450000h.trackPost("mediaProcess");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = cVar4.f450000h.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostStage(2);
        }
        ?? r152 = 1;
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.d1().r()).intValue() == 1) {
            mVar = new wv2.n(cVar4.f450000h, 2);
        } else {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = cVar4.f450000h.getFeedObject().getObjectDesc();
            android.graphics.BitmapFactory.Options options2 = null;
            r45.ef2 mvInfo = objectDesc != null ? objectDesc.getMvInfo() : null;
            if (mvInfo != null) {
                int i29 = 5;
                ?? r102 = 0;
                if (mvInfo.getInteger(6) == 1) {
                    list = mvInfo.getList(5);
                    kotlin.jvm.internal.o.f(list, "getOrdered_track_list_flex_clip(...)");
                } else {
                    list = mvInfo.getList(0);
                    kotlin.jvm.internal.o.f(list, "getOrderedTrackList(...)");
                }
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : list) {
                    if (((r45.jf2) obj3).getLong(2) == 0) {
                        arrayList.add(obj3);
                    }
                }
                linkedList2.addAll(arrayList);
                java.util.Iterator it = linkedList2.iterator();
                while (true) {
                    i17 = 3;
                    if (!it.hasNext()) {
                        break;
                    }
                    r45.jf2 jf2Var = (r45.jf2) it.next();
                    java.util.Iterator it6 = cVar4.f450000h.getClipListExt().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it6.next();
                        if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.storage.FinderItem) obj2).getObjectNonceId(), jf2Var.getString(3))) {
                            break;
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "processTracks size:" + linkedList2.size());
                int size = linkedList2.size();
                int i37 = 0;
                cVar = cVar4;
                wv2.c cVar5 = cVar;
                for (java.lang.Object obj4 : linkedList2) {
                    int i38 = i37 + 1;
                    if (i37 < 0) {
                        ?? r112 = options2;
                        kz5.c0.p();
                        throw r112;
                    }
                    ?? r37 = (r45.jf2) obj4;
                    java.util.Iterator it7 = cVar5.f450000h.getClipListExt().iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj = options2;
                            break;
                        }
                        obj = it7.next();
                        if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.storage.FinderItem) obj).getObjectNonceId(), r37.getString(i17))) {
                            break;
                        }
                    }
                    ?? r76 = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
                    if (r76 != 0) {
                        if (!((r37 == 0 || (list2 = r37.getList(11)) == null || list2.contains(java.lang.Integer.valueOf((int) r152)) != r152) ? r102 : r152)) {
                            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = r76.getFinderObject().getObjectDesc();
                            ?? first = (objectDesc2 == null || (media = objectDesc2.getMedia()) == null) ? options2 : media.getFirst();
                            r45.mb4 cropInfo = r76.getCropInfo(r102);
                            if (cropInfo == null) {
                                com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "cannot get local finder media");
                                mVar = new wv2.n(cVar5.f450000h, 2);
                            } else {
                                r45.dd4 dd4Var = (r45.dd4) cropInfo.getCustom(14);
                                int integer = dd4Var != null ? dd4Var.getInteger(7) : 0;
                                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                                if (integer > t70Var.O2()) {
                                    mVar = new wv2.n(cVar5.f450000h, 2);
                                } else {
                                    if (r37 == 0 || first == 0) {
                                        com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "error cannot get mvTrack and mvMedia");
                                        mVar = new wv2.n(cVar5.f450000h, 2);
                                        break;
                                    }
                                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                    r45.dd4 dd4Var2 = (r45.dd4) cropInfo.getCustom(14);
                                    if (dd4Var2 != null) {
                                        r45.dd4 dd4Var3 = (r45.dd4) cropInfo.getCustom(14);
                                        dd4Var2.set(7, java.lang.Integer.valueOf((dd4Var3 != null ? dd4Var3.getInteger(7) : 0) + r152));
                                    }
                                    cu2.t tVar = cu2.u.f222441a;
                                    tVar.n(cVar4.f450000h);
                                    java.lang.String url = first.getUrl();
                                    if (url == null) {
                                        url = "";
                                    }
                                    if (com.tencent.mm.vfs.w6.j(url)) {
                                        float width = first.getWidth();
                                        float height = first.getHeight();
                                        int videoDuration = first.getVideoDuration();
                                        long j17 = r37.getLong(4);
                                        java.lang.String str = url;
                                        long integer2 = r37.getInteger(r152) + j17;
                                        qc0.d1 Ai = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).Ai(str, r152);
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start process mv, size:[");
                                        sb6.append(width);
                                        sb6.append(',');
                                        sb6.append(height);
                                        int i39 = size;
                                        sb6.append("], videoDuration:");
                                        sb6.append(videoDuration);
                                        sb6.append(", clipRange:[");
                                        sb6.append(j17);
                                        sb6.append(',');
                                        sb6.append(integer2);
                                        sb6.append("], path:");
                                        sb6.append(str);
                                        com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", sb6.toString());
                                        com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "start process mv, videoInfo:" + Ai);
                                        if (Ai == null) {
                                            com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "start process mv, fail to get origin video info");
                                            mVar = new wv2.n(cVar.f450000h, 2);
                                        } else {
                                            com.tencent.mm.modelcontrol.VideoTransPara K2 = t70Var.K2();
                                            com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "process mv videoParams " + K2);
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject2 = new com.tencent.mm.protocal.protobuf.FinderMediaReportObject();
                                            finderMediaReportObject2.setMediaType(cropInfo.getInteger(2));
                                            finderMediaReportObject2.setOrigin(new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo());
                                            finderMediaReportObject2.setMultiMediaInfo(new java.util.LinkedList<>());
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo finderMediaReportInfo = new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo();
                                            int i47 = i37;
                                            finderMediaReportInfo.setFileSize((int) com.tencent.mm.vfs.w6.k(str));
                                            finderMediaReportInfo.setWidth((int) width);
                                            finderMediaReportInfo.setHeight((int) height);
                                            finderMediaReportInfo.setVideoBitrate(Ai.f361367e);
                                            finderMediaReportInfo.setVideoDuration(videoDuration);
                                            finderMediaReportInfo.setAudioBitrate(Ai.f361370h);
                                            finderMediaReportInfo.setFps((int) Ai.f361365c);
                                            com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "put multiMediaInfo:" + finderMediaReportInfo);
                                            finderMediaReportObject2.getMultiMediaInfo().add(finderMediaReportInfo);
                                            java.lang.String h17 = com.tencent.mm.plugin.finder.assist.e9.f102132a.h(new mn2.g4(cropInfo, com.tencent.mm.plugin.finder.storage.y90.R, "xV99", 0, 0, null, false, null, 248, null), java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                                            i95.m c17 = i95.n0.c(bg0.v.class);
                                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                                            com.tencent.mm.plugin.vlog.model.l0 Z2 = bg0.v.Z2((bg0.v) c17, str, false, 2, null);
                                            com.tencent.mm.plugin.vlog.model.k0 Bi = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Bi(kz5.b0.c(Z2));
                                            com.tencent.mm.plugin.vlog.model.h1 h1Var = (com.tencent.mm.plugin.vlog.model.h1) Bi;
                                            h1Var.s(j17, integer2);
                                            android.graphics.Rect rect = new android.graphics.Rect();
                                            int i48 = Ai.f361363a;
                                            int i49 = Ai.f361364b;
                                            int i57 = Ai.f361368f;
                                            if (i57 == 90 || i57 == 270) {
                                                i49 = i48;
                                                i48 = i49;
                                            }
                                            ((com.tencent.mm.plugin.vlog.model.i1) Z2).f175624i.f175787d.set(0, 0, i48, i49);
                                            h1Var.u(i48, i49);
                                            rect.set(0, 0, i48, i49);
                                            h1Var.t(rect);
                                            h1Var.d(false);
                                            com.tencent.mm.plugin.vlog.model.p pVar = (com.tencent.mm.plugin.vlog.model.p) ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).wi(Bi);
                                            pVar.e(h17, K2, new android.util.Size(i48, i49), rect, true, true);
                                            r45.h70 f17 = pVar.f();
                                            r45.i70 i70Var = f17.f375902i;
                                            i70Var.f376775d = h17;
                                            ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                                            com.tencent.mm.plugin.vlog.model.n nVar = new com.tencent.mm.plugin.vlog.model.n();
                                            ((bg0.a0) i95.n0.c(bg0.a0.class)).getClass();
                                            nVar.f175684c = 3;
                                            r45.dd4 dd4Var4 = (r45.dd4) cropInfo.getCustom(14);
                                            nVar.f175682a = dd4Var4 != null ? dd4Var4.getInteger(7) : 0;
                                            if (t70Var.t2()) {
                                                nVar.i(true, K2);
                                            }
                                            nVar.f175693l = new wv2.a(new kotlin.jvm.internal.e0(), cVar4, i47, i39);
                                            cVar4.f450001i = nVar;
                                            java.lang.Object obj5 = new java.lang.Object();
                                            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                                            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                                            f0Var.f310116d = -1;
                                            float a17 = com.tencent.mm.plugin.vlog.model.f0.a(nVar, f17, false, new wv2.b(f0Var, this, elapsedRealtime, finderMediaReportObject2, h17, i70Var, K2, f17, obj5, c0Var), 2, null);
                                            synchronized (obj5) {
                                                if (!c0Var.f310112d) {
                                                    com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "wait");
                                                    obj5.wait();
                                                    com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "notify " + f0Var.f310116d);
                                                }
                                            }
                                            qc0.d1 Ai2 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).Ai(h17, true);
                                            com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "remux finished, ret:" + f0Var.f310116d + ", videoQuality:" + a17 + ", outputVideoInfo:" + Ai2);
                                            cVar3 = this;
                                            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = cVar3.f450000h.field_reportObject;
                                            if (finderFeedReportObject2 != null) {
                                                finderFeedReportObject2.setMpError(f0Var.f310116d);
                                            }
                                            tVar.n(cVar3.f450000h);
                                            if (f0Var.f310116d < 0 || Ai2 == null || Ai2.f361363a < 0 || Ai2.f361364b < 0 || Ai2.f361366d < 0) {
                                                mVar = new wv2.n(cVar3.f450000h, 2);
                                                cVar = cVar3;
                                                break;
                                            }
                                            i18 = i39;
                                            cVar3.k(1.0f, i47, i18);
                                            cropInfo.set(4, java.lang.Float.valueOf(Ai2.f361363a));
                                            i19 = 5;
                                            cropInfo.set(5, java.lang.Float.valueOf(Ai2.f361364b));
                                            int i58 = K2.f71204t;
                                            int i59 = (int) ((cropInfo.getFloat(5) / cropInfo.getFloat(4)) * i58);
                                            options = null;
                                            java.lang.String g17 = mv2.q.f331618a.g(h17, i58, i59, null);
                                            if (t70Var.v2()) {
                                                z17 = false;
                                                i28 = com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate.e(40, 0, i58, i59, 0.8f);
                                            } else {
                                                z17 = false;
                                                i28 = 0;
                                            }
                                            com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "qipengfeng, audio quality level: " + (t70Var.v2() ? com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate.a(h17, K2.f71198n, K2.f71199o, K2.f71200p, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_audio_quality_analysis_switch, z17 ? 1 : 0) == 1 ? true : z17 ? 1 : 0, true) : 0.0f));
                                            cropInfo.set(69, finderMediaReportObject2);
                                            cropInfo.set(z17 ? 1 : 0, h17);
                                            cropInfo.set(1, g17);
                                            cropInfo.set(13, java.lang.Boolean.FALSE);
                                            cropInfo.set(9, com.tencent.mm.sdk.platformtools.w2.a(cropInfo.getString(z17 ? 1 : 0)));
                                            cropInfo.set(46, hc2.l.k(cropInfo.getString(1)));
                                            cropInfo.set(7, java.lang.Integer.valueOf((int) com.tencent.mm.vfs.w6.k(h17)));
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject3 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69);
                                            if (finderMediaReportObject3 != null) {
                                                finderMediaReportObject3.setTarget(new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo());
                                            }
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject4 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69);
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo target2 = finderMediaReportObject4 != null ? finderMediaReportObject4.getTarget() : null;
                                            if (target2 != null) {
                                                target2.setFileSize(cropInfo.getInteger(7));
                                            }
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject5 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69);
                                            if (finderMediaReportObject5 != null) {
                                                com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject6 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69);
                                                finderMediaReportObject5.setVideoFinalSize((finderMediaReportObject6 == null || (target = finderMediaReportObject6.getTarget()) == null) ? z17 ? 1 : 0 : target.getFileSize());
                                            }
                                            r45.h70 h70Var = (r45.h70) cropInfo.getCustom(21);
                                            if (h70Var != null) {
                                                h70Var.f375903m = z17;
                                            }
                                            if (((r45.uf2) cropInfo.getCustom(22)) == null) {
                                                cropInfo.set(22, new r45.uf2());
                                            }
                                            r45.uf2 uf2Var = (r45.uf2) cropInfo.getCustom(22);
                                            if (uf2Var != null) {
                                                uf2Var.set(z17 ? 1 : 0, java.lang.Float.valueOf(a17));
                                                uf2Var.set(2, java.lang.Float.valueOf(0.0f));
                                                java.lang.Float valueOf = java.lang.Float.valueOf(i28);
                                                i27 = 3;
                                                uf2Var.set(3, valueOf);
                                                r45.h70 h70Var2 = (r45.h70) cropInfo.getCustom(21);
                                                uf2Var.set(5, java.lang.Boolean.valueOf(((h70Var2 == null || (g70Var = h70Var2.f375904n) == null || (linkedList = g70Var.f374939e) == null) ? z17 ? 1 : 0 : linkedList.size()) > 0 ? true : z17 ? 1 : 0));
                                                com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "codec_info video_score:" + uf2Var.getFloat(z17 ? 1 : 0) + ",video_cover_score:" + uf2Var.getFloat(1) + ",video_audio_score:" + uf2Var.getFloat(2) + ",thumb_score:" + uf2Var.getFloat(3) + ",hdimg_score:" + uf2Var.getFloat(4) + ",has_stickers:" + uf2Var.getBoolean(5));
                                            } else {
                                                i27 = 3;
                                            }
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject7 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69);
                                            if ((finderMediaReportObject7 != null ? finderMediaReportObject7.getCodecInfo() : null) == null && (finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69)) != null) {
                                                finderMediaReportObject.setCodecInfo((r45.uf2) cropInfo.getCustom(22));
                                            }
                                            cropInfo.set(i27, java.lang.Integer.valueOf(a06.d.b(((float) Ai2.f361366d) / 1000.0f)));
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject8 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69);
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo target3 = finderMediaReportObject8 != null ? finderMediaReportObject8.getTarget() : null;
                                            if (target3 != null) {
                                                target3.setVideoDuration((int) Ai2.f361366d);
                                            }
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject9 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69);
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo target4 = finderMediaReportObject9 != null ? finderMediaReportObject9.getTarget() : null;
                                            if (target4 != null) {
                                                target4.setWidth(Ai2.f361363a);
                                            }
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject10 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69);
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo target5 = finderMediaReportObject10 != null ? finderMediaReportObject10.getTarget() : null;
                                            if (target5 != null) {
                                                target5.setHeight(Ai2.f361364b);
                                            }
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject11 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69);
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo target6 = finderMediaReportObject11 != null ? finderMediaReportObject11.getTarget() : null;
                                            if (target6 != null) {
                                                target6.setVideoBitrate(Ai2.f361367e);
                                            }
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject12 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69);
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo target7 = finderMediaReportObject12 != null ? finderMediaReportObject12.getTarget() : null;
                                            if (target7 != null) {
                                                target7.setAudioBitrate(Ai2.f361370h);
                                            }
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject13 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) cropInfo.getCustom(69);
                                            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo target8 = finderMediaReportObject13 != null ? finderMediaReportObject13.getTarget() : null;
                                            if (target8 != null) {
                                                target8.setFps((int) Ai2.f361365c);
                                            }
                                            java.util.LinkedList linkedList3 = new java.util.LinkedList();
                                            linkedList3.add(cropInfo);
                                            r76.setMediaList(linkedList3);
                                            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject3 = r76.field_reportObject;
                                            if (finderFeedReportObject3 != null) {
                                                finderFeedReportObject3.setRemuxEndTime(c01.id.c());
                                                finderFeedReportObject3.setRemuxType(2);
                                            }
                                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("processList url ");
                                            sb7.append(cropInfo.getString(z17 ? 1 : 0));
                                            sb7.append(" thumbUrl: ");
                                            z18 = true;
                                            sb7.append(cropInfo.getString(1));
                                            sb7.append(" newMd5: ");
                                            sb7.append(com.tencent.mm.sdk.platformtools.w2.a(cropInfo.getString(z17 ? 1 : 0)));
                                            sb7.append(" size:");
                                            sb7.append(com.tencent.mm.sdk.platformtools.t8.f0(com.tencent.mm.vfs.w6.k(cropInfo.getString(z17 ? 1 : 0))));
                                            com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", sb7.toString());
                                            tVar.n(cVar3.f450000h);
                                            cVar2 = cVar3;
                                            cVar = cVar2;
                                            r152 = z18;
                                            cVar4 = cVar3;
                                            i17 = i27;
                                            options2 = options;
                                            r102 = z17;
                                            cVar5 = cVar2;
                                            size = i18;
                                            i29 = i19;
                                            i37 = i38;
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "start process mv, file not exist:".concat(url));
                                        mVar = new wv2.n(cVar5.f450000h, 2);
                                    }
                                }
                            }
                            break;
                        }
                        ?? cropInfo2 = r76.getCropInfo(r102);
                        if (cropInfo2 != 0) {
                            java.lang.String d17 = com.tencent.mm.plugin.finder.assist.e9.f102132a.d(new mn2.c1(cropInfo2, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, null, 12, null), java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                            float f18 = cropInfo2.getFloat(4);
                            float f19 = cropInfo2.getFloat(i29);
                            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                            float min = java.lang.Math.min((t70Var2.l2() * 1.0f) / f18, (t70Var2.k2() * 1.0f) / f19);
                            if (min > 1.0f) {
                                com.tencent.mm.vfs.w6.c(cropInfo2.getString(r102), d17);
                                i29 = 5;
                            } else {
                                com.tencent.mm.sdk.platformtools.x.D0(com.tencent.mm.sdk.platformtools.x.F0(com.tencent.mm.sdk.platformtools.x.J(cropInfo2.getString(r102), options2), min, min, r152), 100, android.graphics.Bitmap.CompressFormat.JPEG, d17, r102);
                                cropInfo2.set(4, java.lang.Float.valueOf((int) (f18 * min)));
                                i29 = 5;
                                cropInfo2.set(5, java.lang.Float.valueOf((int) (f19 * min)));
                            }
                            cropInfo2.set(r102, d17);
                            cropInfo2.set(9, com.tencent.mm.sdk.platformtools.w2.a(cropInfo2.getString(r102)));
                            cropInfo2.set(46, hc2.l.k(cropInfo2.getString(r152)));
                            java.util.LinkedList linkedList4 = new java.util.LinkedList();
                            linkedList4.add(cropInfo2);
                            r76.setMediaList(linkedList4);
                            cu2.u.f222441a.n(cVar4.f450000h);
                        }
                    }
                    i18 = size;
                    cVar2 = cVar5;
                    z17 = r102;
                    i19 = i29;
                    options = options2;
                    cVar3 = cVar4;
                    z18 = r152;
                    i27 = 3;
                    r152 = z18;
                    cVar4 = cVar3;
                    i17 = i27;
                    options2 = options;
                    r102 = z17;
                    cVar5 = cVar2;
                    size = i18;
                    i29 = i19;
                    i37 = i38;
                }
                mVar = new wv2.m(cVar5.f450000h);
                cVar.f450002m.dead();
                return mVar;
            }
            mVar = new wv2.n(cVar4.f450000h, 2);
        }
        cVar = cVar4;
        break;
        cVar.f450002m.dead();
        return mVar;
    }

    public final void k(float f17, int i17, int i18) {
        float f18 = (f17 > 1.0f ? 1.0f : f17) * ((i17 + 1.0f) / i18);
        int i19 = (int) (45 * f18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f450000h;
        sb6.append(finderItem.getLocalId());
        sb6.append(" updateProgress ");
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(f18);
        sb6.append(", ");
        sb6.append(i19);
        sb6.append(", index:");
        sb6.append(i17);
        sb6.append(", size:");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", sb6.toString());
        if (finderItem.getPostInfo().getInteger(4) < i19) {
            finderItem.getPostInfo().set(4, java.lang.Integer.valueOf(i19));
            cu2.u.f222441a.l(finderItem);
        }
        com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
        long localId = finderItem.getLocalId();
        am.ga gaVar = feedPostProgressEvent.f54250g;
        gaVar.f6749a = localId;
        gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
        feedPostProgressEvent.e();
    }
}
