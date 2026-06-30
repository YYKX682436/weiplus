package xv2;

/* loaded from: classes10.dex */
public final class b extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f457394h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f457395i;

    /* renamed from: m, reason: collision with root package name */
    public pv2.g f457396m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.newlifestage.NewLifeMediaProcessStage$feedDeleteListener$1 f457397n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f457398o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.tencent.mm.plugin.finder.upload.postlogic.newlifestage.NewLifeMediaProcessStage$feedDeleteListener$1] */
    public b(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f457394h = finderObj;
        this.f457396m = new tv2.x(finderObj, 2);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f457397n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.newlifestage.NewLifeMediaProcessStage$feedDeleteListener$1
            {
                this.__eventId = -108499199;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
                com.tencent.mm.autogen.events.FeedDeleteEvent event = feedDeleteEvent;
                kotlin.jvm.internal.o.g(event, "event");
                xv2.b bVar = xv2.b.this;
                long j17 = event.f54247g.f6438b;
                if (j17 != 0 && j17 == bVar.f457394h.getLocalId()) {
                    com.tencent.mars.xlog.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", "feedDeleteListener localId:" + event.f54247g.f6438b);
                    if (!cu2.u.f222441a.k(bVar.f457394h.getLocalId())) {
                        bVar.f457395i = true;
                        java.util.List list = bVar.f457398o;
                        if (list != null) {
                            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                            while (it.hasNext()) {
                                wu5.c cVar = (wu5.c) it.next();
                                if (!cVar.isDone()) {
                                    cVar.cancel(false);
                                }
                            }
                        }
                        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = bVar.f457394h.field_reportObject;
                        if (finderFeedReportObject != null) {
                            finderFeedReportObject.setUploadLogicError(200);
                        }
                    }
                }
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
        boolean isLongVideo = this.f457394h.isLongVideo();
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
        boolean isLongVideo = this.f457394h.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 20L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 20L, 1L);
            }
        }
    }

    @Override // ov2.e
    public pv2.g j() {
        java.lang.Object m521constructorimpl;
        r45.q23 video_tmpl_info;
        r45.ko6 ko6Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        sb6.append(this.f457394h.getLocalId());
        sb6.append(" checkSum:");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = this.f457394h.getFeedObject().getObjectDesc();
        sb6.append((objectDesc == null || (video_tmpl_info = objectDesc.getVideo_tmpl_info()) == null || (ko6Var = video_tmpl_info.f383601w) == null) ? null : ko6Var.f378884i);
        com.tencent.mars.xlog.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", sb6.toString());
        alive();
        this.f457394h.trackPost("mediaProcess");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.f457394h.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostStage(2);
        }
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.d1().r()).intValue() == 1) {
            tv2.x xVar = new tv2.x(this.f457394h, 2);
            dead();
            this.f457396m = xVar;
            return xVar;
        }
        int i17 = (int) (45 * 1.0f);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("feed ");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f457394h;
        sb7.append(finderItem.getLocalId());
        sb7.append(" updateProgress  1.0, ");
        sb7.append(i17);
        com.tencent.mars.xlog.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", sb7.toString());
        if (finderItem.getPostInfo().getInteger(4) < i17) {
            finderItem.getPostInfo().set(4, java.lang.Integer.valueOf(i17));
            cu2.u.f222441a.l(finderItem);
        }
        com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
        long localId = finderItem.getLocalId();
        am.ga gaVar = feedPostProgressEvent.f54250g;
        gaVar.f6749a = localId;
        gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
        feedPostProgressEvent.e();
        if (this.f457394h.getMediaType() == 2) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderObj = this.f457394h;
            kotlin.jvm.internal.o.g(finderObj, "finderObj");
            int i18 = 0;
            if (finderObj.getMediaType() == 2 && finderObj.isNewLife()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.LinkedList<r45.mb4> mediaList = this.f457394h.getMediaList();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mediaList, 10));
                java.util.Iterator<T> it = mediaList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new xv2.a(this.f457394h, (r45.mb4) it.next()));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mars.xlog.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", "[finderpost]:dealWxamCompress ThreadPool.INSTANCE.execute:" + i18);
                    arrayList2.add(((ku5.t0) ku5.t0.f312615d).h((xv2.a) next, "NewLife.LogPost.NewLifeMediaProcessStage_" + (i18 % 3)));
                    i18 = i19;
                }
                this.f457398o = arrayList2;
                java.util.Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    wu5.c cVar = (wu5.c) it7.next();
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(cVar.get());
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                    kotlin.Result.m527isFailureimpl(m521constructorimpl);
                }
                this.f457398o = null;
                com.tencent.mars.xlog.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", "[finderpost]:dealWxamCompress all success! cost:[" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms]");
            }
        }
        if (this.f457395i) {
            tv2.x xVar2 = new tv2.x(this.f457394h, 1);
            dead();
            this.f457396m = xVar2;
        } else {
            xv2.j jVar = new xv2.j(this.f457394h);
            dead();
            this.f457396m = jVar;
        }
        return this.f457396m;
    }
}
