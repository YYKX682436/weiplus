package qv2;

/* loaded from: classes10.dex */
public abstract class e extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f366938h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f366939i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.qb4 f366940m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f366941n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f366942o;

    /* renamed from: p, reason: collision with root package name */
    public long f366943p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f366944q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f366945r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f366946s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f366947t;

    /* renamed from: u, reason: collision with root package name */
    public final qv2.c f366948u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.storage.FinderItem finderObj, java.lang.String taskId) {
        super(taskId);
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        kotlin.jvm.internal.o.g(taskId, "taskId");
        this.f366938h = finderObj;
        this.f366940m = finderObj.field_postinfo;
        this.f366941n = new java.util.LinkedHashMap();
        this.f366942o = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f366944q = new java.util.ArrayList();
        this.f366947t = new java.util.concurrent.CountDownLatch(1);
        this.f366948u = new qv2.c(this);
    }

    public static final boolean k(qv2.e eVar, java.lang.String str) {
        java.util.LinkedList linkedList;
        r45.q23 video_tmpl_info;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = eVar.f366938h.getFeedObject().getObjectDesc();
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
            if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.a((java.lang.String) next), eVar.x(str))) {
                obj = next;
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        if (str2 == null) {
            return false;
        }
        linkedList.set(linkedList.indexOf(str2), "");
        eVar.f366942o.remove(str);
        com.tencent.mars.xlog.Log.i(eVar.s(), "handleTemplateScyThumb upload fail target:" + str2 + " to mediaId:" + str);
        return true;
    }

    public abstract void A(pv2.g gVar);

    public abstract void B();

    public final void C(boolean z17, boolean z18) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f366938h;
        r45.qb4 qb4Var = this.f366940m;
        try {
            if (z17) {
                com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                kotlin.jvm.internal.o.g(finderItem, "finderItem");
                com.tencent.mm.plugin.finder.report.p2.v(p2Var, finderItem, "CDNUpload", null, null, 0, 0L, 60, null);
                qb4Var.set(2, 1);
            } else {
                qb4Var.set(2, 2);
            }
            qb4Var.set(9, java.lang.Long.valueOf(c01.id.a() - this.f366943p));
            finderItem.setPostInfo(qb4Var);
            p().c().b(qb4Var.getLong(9), finderItem.isLongVideo());
            y();
            ov2.e.i(this, z17 ? "andr_CDN_Upload_Suc" : z18 ? "andr_CDN_Upload_Fail" : "andr_CDN_Upload_Check_Fail", this.f366938h, 0, null, 12, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(s(), e17, "", new java.lang.Object[0]);
        }
    }

    public final void D(int i17, r45.mb4 updateMedia) {
        kotlin.jvm.internal.o.g(updateMedia, "updateMedia");
        l(updateMedia);
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) updateMedia.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setCdnUploadRetCode(i17);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f366938h;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setRetryCount(finderItem.getPostInfo().getInteger(1));
            finderFeedReportObject.setCdnEndTime(c01.id.c());
            if (i17 == 0) {
                finderFeedReportObject.getMediaList().add((com.tencent.mm.protocal.protobuf.FinderMediaReportObject) updateMedia.getCustom(69));
            }
        }
    }

    public void E(java.lang.String str, dn.g gVar) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Map map = this.f366941n;
        if (!map.containsKey(str) || gVar == null) {
            return;
        }
        float f17 = (((float) gVar.field_finishedLength) * 1.0f) / ((float) gVar.field_toltalLength);
        s();
        java.lang.Float f18 = (java.lang.Float) ((java.util.LinkedHashMap) map).get(str);
        if (f17 > (f18 != null ? f18.floatValue() : 0.0f)) {
            map.put(str, java.lang.Float.valueOf(f17));
        }
        float H0 = kz5.n0.H0(((java.util.LinkedHashMap) map).values()) / map.size();
        int i17 = ((int) (45 * H0)) + 45;
        java.lang.String s17 = s();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f366938h;
        sb6.append(finderItem.getLocalId());
        sb6.append(" updateProgress  ");
        sb6.append(H0);
        sb6.append(", ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(s17, sb6.toString());
        if (finderItem.getPostInfo().getInteger(4) < i17) {
            finderItem.getPostInfo().set(4, java.lang.Integer.valueOf(i17));
            y();
        }
        com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
        long localId = finderItem.getLocalId();
        am.ga gaVar = feedPostProgressEvent.f54250g;
        gaVar.f6749a = localId;
        gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
        feedPostProgressEvent.e();
    }

    @Override // pv2.g
    public int a() {
        return 3;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        p().a().c(this.f366938h.isLongVideo());
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        p().a().c(this.f366938h.isLongVideo());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:16|(1:18)|19|(1:21)|22|(4:24|(2:25|(3:27|(2:107|108)(2:31|32)|(1:34)(1:106))(2:109|110))|35|(13:37|38|39|40|41|(2:47|(3:51|(1:53)|(1:55)))|56|(1:58)(1:102)|59|(1:61)(1:101)|62|(1:64)|(4:66|(1:68)|69|70)(6:(3:72|(4:75|(5:77|78|(1:80)|81|(1:87)(3:83|84|85))(1:88)|86|73)|89)|90|(1:92)|93|(1:95)|(2:97|98)(2:99|100))))|111|38|39|40|41|(4:43|45|47|(4:49|51|(0)|(0)))|56|(0)(0)|59|(0)(0)|62|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x013d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x013e, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace(s(), r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0228  */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qv2.e.j():pv2.g");
    }

    public final void l(r45.mb4 mb4Var) {
        jz5.f0 f0Var;
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69);
        if (finderMediaReportObject != null) {
            finderMediaReportObject.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject.setMediaId(mb4Var.getString(9));
            finderMediaReportObject.setCdnUploadTime((int) (c01.id.c() - this.f366943p));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject2 = new com.tencent.mm.protocal.protobuf.FinderMediaReportObject();
            finderMediaReportObject2.setMediaType(mb4Var.getInteger(2));
            finderMediaReportObject2.setMediaId(mb4Var.getString(9));
            finderMediaReportObject2.setCdnUploadTime((int) (c01.id.c() - this.f366943p));
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

    public abstract pv2.g m();

    public abstract pv2.g n();

    public abstract com.tencent.mm.sdk.event.IListener o();

    public abstract com.tencent.mm.plugin.finder.report.k5 p();

    public abstract pv2.g q();

    public abstract pv2.g r();

    public abstract java.lang.String s();

    public final void t(java.lang.String str, int i17) {
        r45.zi2 zi2Var;
        java.lang.Object obj;
        r45.el2 feedBgmInfo;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f366938h;
        java.util.Iterator<T> it = finderItem.getMediaList().iterator();
        while (true) {
            zi2Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.mb4) obj).getString(9), x(str))) {
                    break;
                }
            }
        }
        r45.mb4 mb4Var = (r45.mb4) obj;
        if (mb4Var != null) {
            D(i17, mb4Var);
        }
        C(false, true);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        if (objectDesc != null && (feedBgmInfo = objectDesc.getFeedBgmInfo()) != null) {
            zi2Var = (r45.zi2) feedBgmInfo.getCustom(0);
        }
        if (zi2Var != null && kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.a(zi2Var.getString(5)), x(str))) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1530L, 3L, 1L);
        }
        z(n());
    }

    public final boolean u() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(((r45.qo5) this.f366938h.getPostInfo().getCustom(12)) != null ? r0.getString(2) : null);
    }

    public final void v() {
        this.f366939i = true;
        uv2.i.f431389a.e(this.f366938h.getMediaList(), false);
        z(m());
    }

    public void w() {
        ov2.e.i(this, "andr_CDN_Upload_Begin", this.f366938h, 0, null, 12, null);
    }

    public final java.lang.String x(java.lang.String str) {
        return uv2.i.f431389a.j(str);
    }

    public abstract void y();

    public final void z(pv2.g stage) {
        kotlin.jvm.internal.o.g(stage, "stage");
        o().dead();
        A(stage);
        this.f366947t.countDown();
    }
}
