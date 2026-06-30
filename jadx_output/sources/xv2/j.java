package xv2;

/* loaded from: classes10.dex */
public final class j extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f457413h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f457414i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.qb4 f457415m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f457416n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f457417o;

    /* renamed from: p, reason: collision with root package name */
    public long f457418p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f457419q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f457420r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f457421s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f457422t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f457423u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f457424v;

    /* renamed from: w, reason: collision with root package name */
    public pv2.g f457425w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f457426x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.newlifestage.NewLifeUploadStage$feedDeleteListener$1 f457427y;

    /* renamed from: z, reason: collision with root package name */
    public final xv2.g f457428z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.tencent.mm.plugin.finder.upload.postlogic.newlifestage.NewLifeUploadStage$feedDeleteListener$1] */
    public j(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f457413h = finderObj;
        this.f457414i = "LogPost.FinderUploadStage";
        this.f457415m = finderObj.field_postinfo;
        this.f457416n = new java.util.LinkedHashMap();
        this.f457417o = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f457420r = new java.util.ArrayList();
        this.f457422t = new java.util.ArrayList();
        this.f457423u = new java.util.ArrayList();
        this.f457425w = new tv2.x(finderObj, 2);
        this.f457426x = new java.util.concurrent.CountDownLatch(1);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f457427y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.newlifestage.NewLifeUploadStage$feedDeleteListener$1
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
                xv2.j jVar = xv2.j.this;
                if (j17 != jVar.f457413h.getLocalId()) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i(jVar.f457414i, "feedDeleteListener localId:" + daVar.f6438b);
                cu2.t tVar = cu2.u.f222441a;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = jVar.f457413h;
                if (tVar.k(finderItem.getLocalId())) {
                    return false;
                }
                jVar.f457419q = true;
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.setUploadLogicError(100);
                }
                pm0.v.K(null, new xv2.h(jVar));
                xv2.j.l(jVar, new tv2.x(finderItem, 1));
                return false;
            }
        };
        this.f457428z = new xv2.g(this);
    }

    public static final boolean k(xv2.j jVar, java.lang.String str) {
        java.util.LinkedList linkedList;
        r45.q23 video_tmpl_info;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = jVar.f457413h.getFeedObject().getObjectDesc();
        java.lang.Object obj = null;
        r45.iy5 iy5Var = (objectDesc == null || (video_tmpl_info = objectDesc.getVideo_tmpl_info()) == null) ? null : video_tmpl_info.f383592n;
        if (iy5Var == null || (linkedList = iy5Var.f377412d) == null) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.a((java.lang.String) next), jVar.o(str))) {
                obj = next;
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        if (str2 == null) {
            return false;
        }
        linkedList.set(linkedList.indexOf(str2), "");
        jVar.f457417o.remove(str);
        com.tencent.mars.xlog.Log.i(jVar.f457414i, "handleTemplateScyThumb upload fail target:" + str2 + " to mediaId:" + str);
        return true;
    }

    public static final void l(xv2.j jVar, pv2.g gVar) {
        jVar.f457427y.dead();
        jVar.f457425w = gVar;
        jVar.f457426x.countDown();
    }

    public static final void m(xv2.j jVar, int i17, r45.mb4 mb4Var) {
        jz5.f0 f0Var;
        jVar.getClass();
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject.setMediaId(mb4Var.getString(9));
            finderMediaReportObject.setCdnUploadTime((int) (c01.id.c() - jVar.f457418p));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject2 = new com.tencent.mm.protocal.protobuf.FinderMediaReportObject();
            finderMediaReportObject2.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject2.setMediaId(mb4Var.getString(9));
            finderMediaReportObject2.setCdnUploadTime((int) (c01.id.c() - jVar.f457418p));
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo finderMediaReportInfo = new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo();
            finderMediaReportInfo.setWidth((int) mb4Var.getFloat(4));
            finderMediaReportInfo.setHeight((int) mb4Var.getFloat(5));
            finderMediaReportInfo.setFileSize((int) com.tencent.mm.vfs.w6.k(mb4Var.getString(0)));
            finderMediaReportInfo.setVideoDuration(mb4Var.getInteger(3));
            finderMediaReportInfo.setVideoBitrate(mb4Var.getInteger(8));
            finderMediaReportObject2.setVideoFinalSize(finderMediaReportInfo.getFileSize());
            finderMediaReportObject2.setTarget(finderMediaReportInfo);
            mb4Var.set(69, finderMediaReportObject2);
        }
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject3 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject3 != null) {
            finderMediaReportObject3.setCdnUploadRetCode(i17);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = jVar.f457413h;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setRetryCount(finderItem.getPostInfo().getInteger(1));
            finderFeedReportObject.setCdnEndTime(c01.id.c());
            if (i17 == 0) {
                finderFeedReportObject.getMediaList().add((com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69));
            }
        }
    }

    @Override // pv2.g
    public int a() {
        return 3;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        boolean isLongVideo = this.f457413h.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 22L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 22L, 1L);
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
        boolean isLongVideo = this.f457413h.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 22L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 22L, 1L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0461 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0491 A[SYNTHETIC] */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 1675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xv2.j.j():pv2.g");
    }

    public final java.lang.String n(java.lang.String str) {
        return "upload_" + str;
    }

    public final java.lang.String o(java.lang.String str) {
        boolean z17 = false;
        if (str != null && r26.i0.y(str, "upload_", false)) {
            z17 = true;
        }
        if (!z17) {
            return str == null ? "" : str;
        }
        java.lang.String substring = str.substring(7);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public final void p(boolean z17, boolean z18) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f457413h;
        r45.qb4 qb4Var = this.f457415m;
        try {
            if (z17) {
                qb4Var.set(2, 1);
            } else {
                qb4Var.set(2, 2);
            }
            qb4Var.set(9, java.lang.Long.valueOf(c01.id.a() - this.f457418p));
            kotlin.jvm.internal.o.d(qb4Var);
            finderItem.setPostInfo(qb4Var);
            long j17 = qb4Var.getLong(9);
            boolean isLongVideo = finderItem.isLongVideo();
            com.tencent.mm.plugin.finder.report.u4 u4Var = com.tencent.mm.plugin.finder.report.u4.f125384a;
            u4Var.d(1253L, 9L, 1L, isLongVideo);
            u4Var.d(1253L, 10L, j17, isLongVideo);
            cu2.u.f222441a.l(finderItem);
            ov2.e.i(this, z17 ? "andr_CDN_Upload_Suc" : z18 ? "andr_CDN_Upload_Fail" : "andr_CDN_Upload_Check_Fail", this.f457413h, 0, null, 12, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f457414i, e17, "", new java.lang.Object[0]);
        }
    }

    public final int q(r45.mb4 mb4Var) {
        if (mb4Var.getInteger(2) == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(16))) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(23));
            java.lang.String str = this.f457414i;
            if (!K0) {
                com.tencent.mars.xlog.Log.i(str, "mediaObject svr_coverUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(16))) {
                com.tencent.mars.xlog.Log.i(str, "upload failed, coverUrl not exist, " + mb4Var.getString(16));
                return 5;
            }
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_FinderUploadTask_2";
            mVar.f241787f = this.f457428z;
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(mb4Var.getString(16));
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            mVar.field_mediaId = n(a17);
            mVar.field_fullpath = mb4Var.getString(16);
            mVar.field_thumbpath = mb4Var.getString(16);
            mVar.field_talker = "";
            mVar.field_needStorage = true;
            com.tencent.mars.xlog.Log.i(str, "upload cover file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(16)));
            mVar.field_fileType = 20304;
            mVar.field_appType = 251;
            mVar.field_bzScene = 2;
            mVar.A = 120;
            mVar.B = 300;
            mVar.field_priority = 2;
            this.f457417o.add(mVar.field_mediaId);
            java.util.Map map = this.f457416n;
            java.lang.String field_mediaId = mVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
            ((java.util.ArrayList) this.f457423u).add(mVar);
        }
        return 0;
    }

    public final int r(r45.mb4 mb4Var) {
        if (mb4Var.getInteger(2) == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(41))) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(40));
            java.lang.String str = this.f457414i;
            if (!K0) {
                com.tencent.mars.xlog.Log.i(str, "mediaObject svr_fullCoverUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(41))) {
                com.tencent.mars.xlog.Log.i(str, "upload failed, fullCoverUrl not exist, " + mb4Var.getString(41));
                return 0;
            }
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_FinderUploadTask_2";
            mVar.f241787f = this.f457428z;
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(mb4Var.getString(41));
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            mVar.field_mediaId = n(a17);
            mVar.field_fullpath = mb4Var.getString(41);
            mVar.field_thumbpath = mb4Var.getString(41);
            mVar.field_talker = "";
            mVar.field_needStorage = true;
            com.tencent.mars.xlog.Log.i(str, "upload fullCover file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(41)));
            mVar.field_fileType = 20304;
            mVar.field_appType = 251;
            mVar.field_bzScene = 2;
            mVar.A = 120;
            mVar.B = 300;
            mVar.field_priority = 2;
            this.f457417o.add(mVar.field_mediaId);
            java.util.Map map = this.f457416n;
            java.lang.String field_mediaId = mVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
            ((java.util.ArrayList) this.f457423u).add(mVar);
        }
        return 0;
    }
}
