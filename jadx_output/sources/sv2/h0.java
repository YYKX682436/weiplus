package sv2;

/* loaded from: classes10.dex */
public final class h0 extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413285h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f413286i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f413287m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.qb4 f413288n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f413289o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f413290p;

    /* renamed from: q, reason: collision with root package name */
    public long f413291q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f413292r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f413293s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f413294t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f413295u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f413296v;

    /* renamed from: w, reason: collision with root package name */
    public pv2.g f413297w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f413298x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage$draftModifyListener$1 f413299y;

    /* renamed from: z, reason: collision with root package name */
    public final sv2.d0 f413300z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage$draftModifyListener$1] */
    public h0(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413285h = draftItem;
        this.f413286i = "LogPost.MvDraftUploadStage";
        com.tencent.mm.plugin.finder.storage.FinderItem t07 = draftItem.t0();
        this.f413287m = t07;
        this.f413288n = t07.getPostInfo();
        this.f413289o = new java.util.LinkedHashMap();
        this.f413290p = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f413293s = new java.util.ArrayList();
        this.f413295u = new java.util.ArrayList();
        this.f413296v = new java.util.ArrayList();
        this.f413297w = new sv2.c(draftItem, 2);
        this.f413298x = new java.util.concurrent.CountDownLatch(1);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f413299y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderDraftModifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage$draftModifyListener$1
            {
                this.__eventId = -881666027;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderDraftModifyEvent finderDraftModifyEvent) {
                com.tencent.mm.autogen.events.FinderDraftModifyEvent event = finderDraftModifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.za zaVar = event.f54269g;
                long j17 = zaVar.f8549a;
                if (j17 == 0) {
                    return false;
                }
                sv2.h0 h0Var = sv2.h0.this;
                if (j17 != h0Var.f413285h.field_localId) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i(h0Var.f413286i, "draftModifyListener localId:" + zaVar.f8549a);
                h0Var.f413292r = true;
                pm0.v.K(null, new sv2.e0(h0Var));
                sv2.h0.l(h0Var, new sv2.c(h0Var.f413285h, 2));
                return false;
            }
        };
        this.f413300z = new sv2.d0(this);
    }

    public static final java.lang.String k(sv2.h0 h0Var, java.lang.String str) {
        h0Var.getClass();
        boolean z17 = false;
        if (str != null && r26.i0.y(str, "uploaddraft_", false)) {
            z17 = true;
        }
        if (z17) {
            java.lang.String substring = str.substring(12);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            return substring;
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    public static final void l(sv2.h0 h0Var, pv2.g gVar) {
        h0Var.f413299y.dead();
        h0Var.f413297w = gVar;
        h0Var.f413298x.countDown();
    }

    public static final void m(sv2.h0 h0Var, int i17, r45.mb4 mb4Var) {
        h0Var.n(mb4Var);
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setCdnUploadRetCode(i17);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = h0Var.f413287m;
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
        boolean isLongVideo = this.f413287m.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 22L, 1L);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 22L, 1L);
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
        boolean isLongVideo = this.f413287m.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 22L, 1L);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 22L, 1L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv2.h0.j():pv2.g");
    }

    public final void n(r45.mb4 mb4Var) {
        jz5.f0 f0Var;
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject.setMediaId(mb4Var.getString(9));
            finderMediaReportObject.setCdnUploadTime((int) (c01.id.c() - this.f413291q));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject2 = new com.tencent.mm.protocal.protobuf.FinderMediaReportObject();
            finderMediaReportObject2.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject2.setMediaId(mb4Var.getString(9));
            finderMediaReportObject2.setCdnUploadTime((int) (c01.id.c() - this.f413291q));
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
            com.tencent.mars.xlog.Log.i(this.f413286i, "customHeader " + str2);
            mVar.N = str2;
        }
        return d17;
    }

    public final boolean p(r45.mb4 mb4Var) {
        java.util.Iterator it = ((java.util.ArrayList) this.f413293s).iterator();
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
        return "uploaddraft_" + str;
    }

    public final java.lang.String r() {
        return "uploaddraft_" + this.f413285h.field_localId;
    }

    public final void s(boolean z17) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f413287m;
        r45.qb4 qb4Var = this.f413288n;
        try {
            if (z17) {
                qb4Var.set(2, 1);
            } else {
                qb4Var.set(2, 2);
            }
            qb4Var.set(9, java.lang.Long.valueOf(c01.id.a() - this.f413291q));
            finderItem.setPostInfo(qb4Var);
            long j17 = qb4Var.getLong(9);
            boolean isLongVideo = finderItem.isLongVideo();
            com.tencent.mm.plugin.finder.report.f0 f0Var = com.tencent.mm.plugin.finder.report.f0.f125015a;
            f0Var.d(1718L, 9L, 1L, isLongVideo);
            f0Var.d(1718L, 10L, j17, isLongVideo);
            cu2.o.f222430a.b(this.f413285h);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f413286i, e17, "", new java.lang.Object[0]);
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
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(23));
            java.lang.String str = this.f413286i;
            if (!K0) {
                com.tencent.mars.xlog.Log.i(str, "mediaObject svr_coverUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(16))) {
                com.tencent.mars.xlog.Log.w(str, "upload failed, coverUrl not exist, " + mb4Var.getString(16));
                return 5;
            }
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_FinderUploadTask_2";
            mVar.f241787f = this.f413300z;
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(mb4Var.getString(16));
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            mVar.field_mediaId = q(a17);
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
            this.f413290p.add(mVar.field_mediaId);
            java.util.Map map = this.f413289o;
            java.lang.String field_mediaId = mVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
            ((java.util.ArrayList) this.f413296v).add(mVar);
        }
        return 0;
    }

    public final int v(r45.mb4 mb4Var) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(25))) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(27));
            java.lang.String str = this.f413286i;
            if (!K0) {
                com.tencent.mars.xlog.Log.i(str, "mediaObject svr_fullThumbUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(25))) {
                com.tencent.mars.xlog.Log.w(str, "upload failed, fullThumbUrl not exist, " + mb4Var.getString(25));
                return 6;
            }
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_FinderUploadTask_2";
            mVar.f241787f = this.f413300z;
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(mb4Var.getString(25));
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            mVar.field_mediaId = q(a17);
            mVar.field_fullpath = mb4Var.getString(25);
            mVar.field_thumbpath = mb4Var.getString(25);
            mVar.field_talker = "";
            mVar.field_needStorage = true;
            com.tencent.mars.xlog.Log.i(str, "upload fullthumb file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(25)));
            mVar.field_fileType = 20304;
            mVar.field_appType = 251;
            mVar.field_bzScene = 2;
            mVar.A = 120;
            mVar.B = 300;
            mVar.field_priority = 2;
            this.f413290p.add(mVar.field_mediaId);
            java.util.Map map = this.f413289o;
            java.lang.String field_mediaId = mVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
            ((java.util.ArrayList) this.f413296v).add(mVar);
        }
        return 0;
    }
}
