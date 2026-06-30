package wv2;

/* loaded from: classes10.dex */
public final class m extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f450018h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.qb4 f450019i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f450020m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f450021n;

    /* renamed from: o, reason: collision with root package name */
    public long f450022o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f450023p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f450024q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f450025r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f450026s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f450027t;

    /* renamed from: u, reason: collision with root package name */
    public pv2.g f450028u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f450029v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage$feedDeleteListener$1 f450030w;

    /* renamed from: x, reason: collision with root package name */
    public final wv2.i f450031x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage$feedDeleteListener$1] */
    public m(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f450018h = finderObj;
        this.f450019i = finderObj.field_postinfo;
        this.f450020m = new java.util.LinkedHashMap();
        this.f450021n = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f450024q = new java.util.ArrayList();
        this.f450026s = new java.util.ArrayList();
        this.f450027t = new java.util.ArrayList();
        this.f450028u = new wv2.n(finderObj, 2);
        this.f450029v = new java.util.concurrent.CountDownLatch(1);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f450030w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage$feedDeleteListener$1
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
                wv2.m mVar = wv2.m.this;
                if (j17 != mVar.f450018h.getLocalId()) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("LogPost.MvUploadStage", "feedDeleteListener localId:" + daVar.f6438b);
                cu2.t tVar = cu2.u.f222441a;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = mVar.f450018h;
                if (tVar.k(finderItem.getLocalId())) {
                    return false;
                }
                mVar.f450023p = true;
                pm0.v.K(null, new wv2.j(mVar));
                wv2.m.l(mVar, new wv2.n(finderItem, 2));
                return false;
            }
        };
        this.f450031x = new wv2.i(this);
    }

    public static final java.lang.String k(wv2.m mVar, java.lang.String str) {
        mVar.getClass();
        boolean z17 = false;
        if (str != null && r26.i0.y(str, "upload_", false)) {
            z17 = true;
        }
        if (z17) {
            java.lang.String substring = str.substring(7);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            return substring;
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    public static final void l(wv2.m mVar, pv2.g gVar) {
        mVar.f450030w.dead();
        mVar.f450028u = gVar;
        mVar.f450029v.countDown();
    }

    public static final void m(wv2.m mVar, int i17, r45.mb4 mb4Var) {
        mVar.n(mb4Var);
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setCdnUploadRetCode(i17);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = mVar.f450018h;
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
        boolean isLongVideo = this.f450018h.isLongVideo();
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
        boolean isLongVideo = this.f450018h.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 22L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 22L, 1L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x045f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x048d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wv2.m.j():pv2.g");
    }

    public final void n(r45.mb4 mb4Var) {
        jz5.f0 f0Var;
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject.setMediaId(mb4Var.getString(9));
            finderMediaReportObject.setCdnUploadTime((int) (c01.id.c() - this.f450022o));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject2 = new com.tencent.mm.protocal.protobuf.FinderMediaReportObject();
            finderMediaReportObject2.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject2.setMediaId(mb4Var.getString(9));
            finderMediaReportObject2.setCdnUploadTime((int) (c01.id.c() - this.f450022o));
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
    }

    public final com.tencent.mm.plugin.sight.base.b o(dn.m mVar) {
        mVar.getClass();
        bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
        java.lang.String str = mVar.field_fullpath;
        ((b92.u2) vVar).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 != null) {
            int i17 = d17.f162383b;
            bg0.v vVar2 = (bg0.v) i95.n0.c(bg0.v.class);
            java.lang.String field_fullpath = mVar.field_fullpath;
            kotlin.jvm.internal.o.f(field_fullpath, "field_fullpath");
            ((b92.u2) vVar2).getClass();
            java.lang.String str2 = "videobitrate:" + i17 + "\r\nvideoformat:" + (t21.u2.b(field_fullpath) ? 174 : 28) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE;
            com.tencent.mars.xlog.Log.i("LogPost.MvUploadStage", "customHeader " + str2);
            mVar.N = str2;
        }
        return d17;
    }

    public final boolean p(r45.mb4 mb4Var) {
        java.util.Iterator it = ((java.util.ArrayList) this.f450024q).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (kotlin.jvm.internal.o.b(((r45.mb4) it.next()).getString(9), mb4Var.getString(9))) {
                break;
            }
            i17++;
        }
        return i17 >= 0;
    }

    public final java.lang.String q(java.lang.String str) {
        return "upload_" + str;
    }

    public final java.lang.String r() {
        return "upload_" + this.f450018h.getLocalId();
    }

    public final void s(boolean z17) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f450018h;
        r45.qb4 qb4Var = this.f450019i;
        try {
            if (z17) {
                qb4Var.set(2, 1);
            } else {
                qb4Var.set(2, 2);
            }
            qb4Var.set(9, java.lang.Long.valueOf(c01.id.a() - this.f450022o));
            finderItem.setPostInfo(qb4Var);
            long j17 = qb4Var.getLong(9);
            boolean isLongVideo = finderItem.isLongVideo();
            com.tencent.mm.plugin.finder.report.u4 u4Var = com.tencent.mm.plugin.finder.report.u4.f125384a;
            u4Var.d(1253L, 9L, 1L, isLongVideo);
            u4Var.d(1253L, 10L, j17, isLongVideo);
            cu2.u.f222441a.n(finderItem);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LogPost.MvUploadStage", e17, "", new java.lang.Object[0]);
        }
    }

    public final void t(boolean z17, int i17, r45.mb4 mb4Var) {
        n(mb4Var);
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setIsBigFile(z17 ? 1 : 0);
        }
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject2 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject2 == null) {
            return;
        }
        finderMediaReportObject2.setCdnControl(i17);
    }

    public final int u(r45.mb4 mb4Var) {
        if (mb4Var.getInteger(2) == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(16))) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(23))) {
                com.tencent.mars.xlog.Log.i("LogPost.MvUploadStage", "mediaObject svr_coverUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(16))) {
                com.tencent.mars.xlog.Log.w("LogPost.MvUploadStage", "upload failed, coverUrl not exist, " + mb4Var.getString(16));
                return 5;
            }
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_FinderUploadTask_2";
            mVar.f241787f = this.f450031x;
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(mb4Var.getString(16));
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            mVar.field_mediaId = q(a17);
            mVar.field_fullpath = mb4Var.getString(16);
            mVar.field_thumbpath = mb4Var.getString(16);
            mVar.field_talker = "";
            mVar.field_needStorage = true;
            com.tencent.mars.xlog.Log.i("LogPost.MvUploadStage", "upload cover file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(16)));
            mVar.field_fileType = 20304;
            mVar.field_appType = 251;
            mVar.field_bzScene = 2;
            mVar.A = 120;
            mVar.B = 300;
            mVar.field_priority = 2;
            this.f450021n.add(mVar.field_mediaId);
            java.util.Map map = this.f450020m;
            java.lang.String field_mediaId = mVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
            ((java.util.ArrayList) this.f450027t).add(mVar);
        }
        return 0;
    }

    public final int v(r45.mb4 mb4Var) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(25))) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(27))) {
                com.tencent.mars.xlog.Log.i("LogPost.MvUploadStage", "mediaObject svr_fullThumbUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(25))) {
                com.tencent.mars.xlog.Log.w("LogPost.MvUploadStage", "upload failed, fullThumbUrl not exist, " + mb4Var.getString(25));
                return 6;
            }
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_FinderUploadTask_2";
            mVar.f241787f = this.f450031x;
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(mb4Var.getString(25));
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            mVar.field_mediaId = q(a17);
            mVar.field_fullpath = mb4Var.getString(25);
            mVar.field_thumbpath = mb4Var.getString(25);
            mVar.field_talker = "";
            mVar.field_needStorage = true;
            com.tencent.mars.xlog.Log.i("LogPost.MvUploadStage", "upload fullthumb file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(25)));
            mVar.field_fileType = 20304;
            mVar.field_appType = 251;
            mVar.field_bzScene = 2;
            mVar.A = 120;
            mVar.B = 300;
            mVar.field_priority = 2;
            this.f450021n.add(mVar.field_mediaId);
            java.util.Map map = this.f450020m;
            java.lang.String field_mediaId = mVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
            ((java.util.ArrayList) this.f450027t).add(mVar);
        }
        return 0;
    }
}
