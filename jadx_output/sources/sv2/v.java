package sv2;

/* loaded from: classes10.dex */
public final class v extends ov2.e {
    public final sv2.s A;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413354h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f413355i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f413356m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.qb4 f413357n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f413358o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f413359p;

    /* renamed from: q, reason: collision with root package name */
    public long f413360q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f413361r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f413362s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f413363t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f413364u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f413365v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f413366w;

    /* renamed from: x, reason: collision with root package name */
    public pv2.g f413367x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f413368y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage$draftModifyListener$1 f413369z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage$draftModifyListener$1] */
    public v(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413354h = draftItem;
        this.f413355i = "LogPost.FinderDraftUploadStage";
        com.tencent.mm.plugin.finder.storage.FinderItem t07 = draftItem.t0();
        this.f413356m = t07;
        this.f413357n = t07.getPostInfo();
        this.f413358o = new java.util.LinkedHashMap();
        this.f413359p = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f413362s = new java.util.ArrayList();
        this.f413364u = new java.util.ArrayList();
        this.f413365v = new java.util.ArrayList();
        this.f413367x = new sv2.c(draftItem, 2);
        this.f413368y = new java.util.concurrent.CountDownLatch(1);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f413369z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderDraftModifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage$draftModifyListener$1
            {
                this.__eventId = -881666027;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderDraftModifyEvent finderDraftModifyEvent) {
                com.tencent.mm.autogen.events.FinderDraftModifyEvent event = finderDraftModifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.za zaVar = event.f54269g;
                if (!(zaVar != null && zaVar.f8549a == 0)) {
                    sv2.v vVar = sv2.v.this;
                    if (zaVar != null && zaVar.f8549a == vVar.f413354h.field_localId) {
                        java.lang.String str = vVar.f413355i;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("draftModifyListener cancel localId:");
                        com.tencent.mm.plugin.finder.storage.x80 x80Var = vVar.f413354h;
                        sb6.append(x80Var.field_localId);
                        sb6.append(", ");
                        sb6.append(x80Var.field_objectId);
                        sb6.append(" modifyType:");
                        sb6.append(zaVar != null ? java.lang.Integer.valueOf(zaVar.f8550b) : null);
                        com.tencent.mars.xlog.Log.i(str, sb6.toString());
                        vVar.f413361r = true;
                        pm0.v.K(null, new sv2.t(vVar));
                        sv2.v.l(vVar, new sv2.c(x80Var, 3));
                    }
                }
                return false;
            }
        };
        this.A = new sv2.s(this);
    }

    public static final java.lang.String k(sv2.v vVar, java.lang.String str) {
        vVar.getClass();
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

    public static final void l(sv2.v vVar, pv2.g gVar) {
        com.tencent.mars.xlog.Log.i(vVar.f413355i, "");
        vVar.f413369z.dead();
        vVar.f413367x = gVar;
        vVar.f413368y.countDown();
    }

    public static final void m(sv2.v vVar, int i17, r45.mb4 mb4Var) {
        vVar.p(mb4Var);
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setCdnUploadRetCode(i17);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = vVar.f413356m;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setRetryCount(finderItem.getPostInfo().getInteger(1));
            finderFeedReportObject.setCdnEndTime(c01.id.c());
            if (i17 == 0) {
                finderFeedReportObject.getMediaList().add((com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69));
            }
        }
    }

    public static /* synthetic */ void o(sv2.v vVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, yz5.l lVar, int i27, java.lang.Object obj) {
        vVar.n(str, str2, str3, i17, i18, i19, (i27 & 64) != 0 ? null : str4, (i27 & 128) != 0 ? null : lVar);
    }

    public static void q(sv2.v vVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 2) != 0 ? false : z18;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = vVar.f413356m;
        r45.qb4 qb4Var = vVar.f413357n;
        if (!z17) {
            try {
                qb4Var.set(2, 2);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f413355i, e17, "", new java.lang.Object[0]);
                return;
            }
        }
        qb4Var.set(9, java.lang.Long.valueOf(c01.id.a() - vVar.f413360q));
        finderItem.setPostInfo(qb4Var);
        long j17 = qb4Var.getLong(9);
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.finder.report.f0 f0Var = com.tencent.mm.plugin.finder.report.f0.f125015a;
        f0Var.d(1718L, 9L, 1L, isLongVideo);
        f0Var.d(1718L, 10L, j17, isLongVideo);
        cu2.o.f222430a.b(vVar.f413354h);
        ov2.e.i(vVar, z17 ? "andr_CDN_Upload_Suc" : z19 ? "andr_CDN_Upload_Fail" : "andr_CDN_Upload_Check_Fail", vVar.f413356m, 0, null, 12, null);
    }

    @Override // pv2.g
    public int a() {
        return 3;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        boolean isLongVideo = this.f413356m.isLongVideo();
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
        boolean isLongVideo = this.f413356m.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 22L, 1L);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 22L, 1L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0422 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x051e A[LOOP:1: B:156:0x0518->B:158:0x051e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0437  */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 1409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv2.v.j():pv2.g");
    }

    public final void n(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, yz5.l lVar) {
        tv2.r rVar = tv2.v.f422330z;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f413356m;
        sv2.s sVar = this.A;
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes());
        kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
        dn.m a17 = rVar.a(finderItem, sVar, str, "uploaddraft_".concat(b17), str2, str3, i17, i18, i19, str4, lVar);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f413359p;
        concurrentLinkedQueue.add(a17.field_mediaId);
        java.util.Map map = this.f413358o;
        java.lang.String field_mediaId = a17.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
        java.lang.String str5 = "[addCdnTaskInfo] before cancel " + a17.field_mediaId + " size:" + concurrentLinkedQueue.size() + " appType:" + a17.field_appType + " fileType:" + a17.field_fileType;
        java.lang.String str6 = this.f413355i;
        com.tencent.mars.xlog.Log.i(str6, str5);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(a17.field_mediaId);
        com.tencent.mars.xlog.Log.i(str6, "[addCdnTaskInfo] after cancel " + a17.field_mediaId + " size:" + concurrentLinkedQueue.size() + " appType:" + a17.field_appType + " fileType:" + a17.field_fileType);
        ((java.util.ArrayList) this.f413365v).add(a17);
    }

    public final void p(r45.mb4 mb4Var) {
        jz5.f0 f0Var;
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject.setMediaId(mb4Var.getString(9));
            finderMediaReportObject.setCdnUploadTime((int) (c01.id.c() - this.f413360q));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject2 = new com.tencent.mm.protocal.protobuf.FinderMediaReportObject();
            finderMediaReportObject2.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject2.setMediaId(mb4Var.getString(9));
            finderMediaReportObject2.setCdnUploadTime((int) (c01.id.c() - this.f413360q));
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

    public final int r(r45.mb4 mb4Var) {
        if (mb4Var.getInteger(2) == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(16))) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(23));
            java.lang.String str = this.f413355i;
            if (!K0) {
                com.tencent.mars.xlog.Log.i(str, "mediaObject svr_coverUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(16))) {
                com.tencent.mars.xlog.Log.i(str, "upload failed, coverUrl not exist, " + mb4Var.getString(16));
                return 5;
            }
            com.tencent.mars.xlog.Log.i(str, "upload cover file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(16)));
            o(this, "task_FinderUploadTask_2", mb4Var.getString(16), mb4Var.getString(16), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int s(r45.mb4 mb4Var) {
        if (mb4Var.getInteger(2) == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(41))) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(40));
            java.lang.String str = this.f413355i;
            if (!K0) {
                com.tencent.mars.xlog.Log.i(str, "mediaObject svr_fullCoverUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(41))) {
                com.tencent.mars.xlog.Log.i(str, "upload failed, fullCoverUrl not exist, " + mb4Var.getString(41));
                return 0;
            }
            com.tencent.mars.xlog.Log.i(str, "upload fullCover file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(41)));
            o(this, "task_FinderUploadTask_2", mb4Var.getString(41), mb4Var.getString(41), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int t(r45.mb4 mb4Var) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(25))) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(27));
            java.lang.String str = this.f413355i;
            if (!K0) {
                com.tencent.mars.xlog.Log.i(str, "mediaObject svr_fullThumbUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(25))) {
                com.tencent.mars.xlog.Log.i(str, "upload failed, fullThumbUrl not exist, " + mb4Var.getString(25));
                return 6;
            }
            com.tencent.mars.xlog.Log.i(str, "upload fullthumb file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(25)));
            o(this, "task_FinderUploadTask_2", mb4Var.getString(25), mb4Var.getString(25), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int u(r45.mb4 mb4Var) {
        if (mb4Var.getInteger(2) == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(62))) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(65));
            java.lang.String str = this.f413355i;
            if (!K0) {
                com.tencent.mars.xlog.Log.i(str, "mediaObject svr_shareCoverUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(62))) {
                com.tencent.mars.xlog.Log.i(str, "upload failed, shareCoverUrl not exist, " + mb4Var.getString(62));
                return 7;
            }
            com.tencent.mars.xlog.Log.i(str, "upload shareCoverUrl file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(62)));
            o(this, "task_FinderUploadTask_2", mb4Var.getString(62), mb4Var.getString(62), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }
}
