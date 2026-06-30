package tv2;

/* loaded from: classes10.dex */
public final class v extends ov2.e {

    /* renamed from: z, reason: collision with root package name */
    public static final tv2.r f422330z = new tv2.r(null);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f422331h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.qb4 f422332i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f422333m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f422334n;

    /* renamed from: o, reason: collision with root package name */
    public long f422335o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f422336p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f422337q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f422338r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f422339s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f422340t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f422341u;

    /* renamed from: v, reason: collision with root package name */
    public pv2.g f422342v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f422343w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage$feedDeleteListener$1 f422344x;

    /* renamed from: y, reason: collision with root package name */
    public final tv2.s f422345y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage$feedDeleteListener$1] */
    public v(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f422331h = finderObj;
        this.f422332i = finderObj.field_postinfo;
        this.f422333m = new java.util.LinkedHashMap();
        this.f422334n = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f422337q = new java.util.ArrayList();
        this.f422339s = new java.util.ArrayList();
        this.f422340t = new java.util.ArrayList();
        this.f422342v = new tv2.x(finderObj, 2);
        this.f422343w = new java.util.concurrent.CountDownLatch(1);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f422344x = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage$feedDeleteListener$1
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
                tv2.v vVar = tv2.v.this;
                if (j17 != vVar.f422331h.getLocalId()) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "feedDeleteListener localId:" + daVar.f6438b);
                cu2.t tVar = cu2.u.f222441a;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = vVar.f422331h;
                if (tVar.k(finderItem.getLocalId())) {
                    return false;
                }
                vVar.f422336p = true;
                vVar.s(100);
                pm0.v.K(null, new tv2.t(vVar));
                tv2.v.l(vVar, new tv2.x(finderItem, 1));
                return false;
            }
        };
        this.f422345y = new tv2.s(this);
    }

    public static final boolean k(tv2.v vVar, java.lang.String str) {
        java.util.LinkedList linkedList;
        r45.q23 video_tmpl_info;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = vVar.f422331h.getFeedObject().getObjectDesc();
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
            if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.a((java.lang.String) next), vVar.q(str))) {
                obj = next;
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        if (str2 == null) {
            return false;
        }
        linkedList.set(linkedList.indexOf(str2), "");
        vVar.f422334n.remove(str);
        com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "handleTemplateScyThumb upload fail target:" + str2 + " to mediaId:" + str);
        return true;
    }

    public static final void l(tv2.v vVar, pv2.g gVar) {
        vVar.f422344x.dead();
        vVar.f422342v = gVar;
        vVar.f422343w.countDown();
    }

    public static final void m(tv2.v vVar, int i17, r45.mb4 mb4Var) {
        vVar.p(mb4Var);
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setCdnUploadRetCode(i17);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = vVar.f422331h;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setRetryCount(finderItem.getPostInfo().getInteger(1));
            finderFeedReportObject.setCdnEndTime(c01.id.c());
            if (i17 == 0) {
                finderFeedReportObject.getMediaList().add((com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69));
            }
        }
    }

    public static /* synthetic */ void o(tv2.v vVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, yz5.l lVar, int i27, java.lang.Object obj) {
        vVar.n(str, str2, str3, i17, i18, i19, (i27 & 64) != 0 ? null : str4, (i27 & 128) != 0 ? null : lVar);
    }

    @Override // pv2.g
    public int a() {
        return 3;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        boolean isLongVideo = this.f422331h.isLongVideo();
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
        boolean isLongVideo = this.f422331h.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 22L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 22L, 1L);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:16|(1:18)|19|(1:21)|22|(1:238)(1:26)|27|(2:29|(28:31|(4:34|(5:40|41|(1:43)|44|45)(3:36|37|38)|39|32)|46|(1:48)|49|50|51|52|(1:233)(1:56)|57|(1:232)(1:63)|64|(1:66)(1:231)|67|(3:69|(1:98)(1:75)|(3:77|(1:97)(1:81)|(2:93|(1:95)(1:96))))|99|(1:101)(1:230)|102|(4:104|(3:107|(3:109|(9:111|(2:136|(1:138)(2:139|(6:141|120|121|122|(1:134)|(3:131|132|133)(2:128|129))(23:142|(1:144)|145|(5:147|(1:149)|150|(1:152)(1:180)|153)(1:181)|154|(1:156)(1:179)|157|(1:159)(1:178)|160|(1:162)(1:177)|163|(1:165)(1:176)|166|(1:168)(1:175)|169|(7:(1:174)|172|121|122|(1:124)|134|(0)(0))|171|172|121|122|(0)|134|(0)(0))))(3:115|(1:(1:118))|135)|119|120|121|122|(0)|134|(0)(0))(2:182|(2:189|190)(1:191))|130)(3:194|195|196)|105)|197|198)(3:219|(2:221|(2:223|224)(2:225|(2:227|228)))|229)|199|(2:202|200)|203|204|(1:206)|207|(1:209)|210|(2:212|213)(4:214|(1:216)|217|218)))|237|(0)|49|50|51|52|(1:54)|233|57|(1:59)|232|64|(0)(0)|67|(0)|99|(0)(0)|102|(0)(0)|199|(1:200)|203|204|(0)|207|(0)|210|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x014b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x014c, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("LogPost.FinderUploadStage", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0557 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0664 A[LOOP:2: B:200:0x065e->B:202:0x0664, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6  */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [int] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [int] */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 1893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv2.v.j():pv2.g");
    }

    public final void n(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, yz5.l lVar) {
        tv2.r rVar = f422330z;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f422331h;
        tv2.s sVar = this.f422345y;
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes());
        kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
        uv2.i iVar = uv2.i.f431389a;
        dn.m a17 = rVar.a(finderItem, sVar, str, "upload_".concat(b17), str2, str3, i17, i18, i19, str4, lVar);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f422334n;
        concurrentLinkedQueue.add(a17.field_mediaId);
        java.util.Map map = this.f422333m;
        java.lang.String field_mediaId = a17.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
        com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "[addCdnTaskInfo] before cancel " + a17.field_mediaId + " size:" + concurrentLinkedQueue.size() + " appType:" + a17.field_appType + " fileType:" + a17.field_fileType);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(a17.field_mediaId);
        com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "[addCdnTaskInfo] after cancel " + a17.field_mediaId + " size:" + concurrentLinkedQueue.size() + " appType:" + a17.field_appType + " fileType:" + a17.field_fileType);
        ((java.util.ArrayList) this.f422340t).add(a17);
    }

    public final void p(r45.mb4 mb4Var) {
        jz5.f0 f0Var;
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject.setMediaId(mb4Var.getString(9));
            finderMediaReportObject.setCdnUploadTime((int) (c01.id.c() - this.f422335o));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject2 = new com.tencent.mm.protocal.protobuf.FinderMediaReportObject();
            finderMediaReportObject2.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject2.setMediaId(mb4Var.getString(9));
            finderMediaReportObject2.setCdnUploadTime((int) (c01.id.c() - this.f422335o));
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

    public final java.lang.String q(java.lang.String str) {
        return uv2.i.f431389a.j(str);
    }

    public final void r(boolean z17, boolean z18) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f422331h;
        r45.qb4 qb4Var = this.f422332i;
        try {
            if (z17) {
                com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                kotlin.jvm.internal.o.g(finderItem, "finderItem");
                com.tencent.mm.plugin.finder.report.p2.v(p2Var, finderItem, "CDNUpload", null, null, 0, 0L, 60, null);
                qb4Var.set(2, 1);
            } else {
                qb4Var.set(2, 2);
            }
            qb4Var.set(9, java.lang.Long.valueOf(c01.id.a() - this.f422335o));
            finderItem.setPostInfo(qb4Var);
            long j17 = qb4Var.getLong(9);
            boolean isLongVideo = finderItem.isLongVideo();
            com.tencent.mm.plugin.finder.report.u4 u4Var = com.tencent.mm.plugin.finder.report.u4.f125384a;
            u4Var.d(1253L, 9L, 1L, isLongVideo);
            u4Var.d(1253L, 10L, j17, isLongVideo);
            cu2.u.f222441a.l(finderItem);
            ov2.e.i(this, z17 ? "andr_CDN_Upload_Suc" : z18 ? "andr_CDN_Upload_Fail" : "andr_CDN_Upload_Check_Fail", this.f422331h, 0, null, 12, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LogPost.FinderUploadStage", e17, "", new java.lang.Object[0]);
        }
    }

    public final void s(int i17) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.f422331h.field_reportObject;
        if (finderFeedReportObject == null) {
            return;
        }
        finderFeedReportObject.setUploadLogicError(i17);
    }

    public final int t(r45.mb4 mb4Var) {
        if (mb4Var.getInteger(2) == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(16))) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(23))) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "mediaObject svr_coverUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(16))) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload failed, coverUrl not exist, " + mb4Var.getString(16));
                return 5;
            }
            com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload cover file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(16)));
            o(this, "task_FinderUploadTask_2", mb4Var.getString(16), mb4Var.getString(16), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int u(r45.mb4 mb4Var) {
        if (mb4Var.getInteger(2) == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(41))) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(40))) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "mediaObject svr_fullCoverUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(41))) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload failed, fullCoverUrl not exist, " + mb4Var.getString(41));
                return 0;
            }
            com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload fullCover file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(41)));
            o(this, "task_FinderUploadTask_2", mb4Var.getString(41), mb4Var.getString(41), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int v(r45.mb4 mb4Var) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(25))) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(27))) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "mediaObject svr_fullThumbUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(25))) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload failed, fullThumbUrl not exist, " + mb4Var.getString(25));
                return 6;
            }
            com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload fullthumb file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(25)));
            o(this, "task_FinderUploadTask_2", mb4Var.getString(25), mb4Var.getString(25), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int w(r45.mb4 mb4Var) {
        if (mb4Var.getInteger(2) == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(62))) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(65))) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "mediaObject svr_shareCoverUrl exist");
                return 0;
            }
            if (!com.tencent.mm.vfs.w6.j(mb4Var.getString(62))) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload failed, shareCoverUrl not exist, " + mb4Var.getString(62));
                return 7;
            }
            com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload shareCover file length " + com.tencent.mm.vfs.w6.k(mb4Var.getString(62)));
            o(this, "task_FinderUploadTask_2", mb4Var.getString(62), mb4Var.getString(62), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }
}
