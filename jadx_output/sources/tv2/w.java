package tv2;

/* loaded from: classes10.dex */
public final class w extends qv2.e {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f422346v;

    /* renamed from: w, reason: collision with root package name */
    public pv2.g f422347w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStageNew$feedDeleteListener$1 f422348x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStageNew$feedDeleteListener$1] */
    public w(final com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(finderObj, java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f422346v = "LogPost.FinderUploadStageNew";
        this.f422347w = n();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f422348x = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStageNew$feedDeleteListener$1
            {
                this.__eventId = -108499199;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
                com.tencent.mm.autogen.events.FeedDeleteEvent event = feedDeleteEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.da daVar = event.f54247g;
                long j17 = daVar.f6438b;
                if (j17 != 0) {
                    tv2.w wVar = tv2.w.this;
                    if (j17 == wVar.f366938h.getLocalId()) {
                        com.tencent.mars.xlog.Log.i(wVar.f422346v, "feedDeleteListener localId:" + daVar.f6438b);
                        if (!cu2.u.f222441a.k(finderObj.getLocalId())) {
                            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = wVar.f366938h.field_reportObject;
                            if (finderFeedReportObject != null) {
                                finderFeedReportObject.setUploadLogicError(100);
                            }
                            wVar.C(false, false);
                            wVar.v();
                        }
                    }
                }
                return false;
            }
        };
    }

    @Override // qv2.e
    public void A(pv2.g gVar) {
        kotlin.jvm.internal.o.g(gVar, "<set-?>");
        this.f422347w = gVar;
    }

    @Override // qv2.e
    public void B() {
        this.f366938h.trackPost("upload");
    }

    @Override // qv2.e
    public pv2.g m() {
        return new tv2.x(this.f366938h, 1);
    }

    @Override // qv2.e
    public pv2.g n() {
        return new tv2.x(this.f366938h, 2);
    }

    @Override // qv2.e
    public com.tencent.mm.sdk.event.IListener o() {
        return this.f422348x;
    }

    @Override // qv2.e
    public com.tencent.mm.plugin.finder.report.k5 p() {
        return com.tencent.mm.plugin.finder.report.u4.f125384a;
    }

    @Override // qv2.e
    public pv2.g q() {
        return new tv2.m(this.f366938h, this.f366946s);
    }

    @Override // qv2.e
    public pv2.g r() {
        return this.f422347w;
    }

    @Override // qv2.e
    public java.lang.String s() {
        return this.f422346v;
    }

    @Override // qv2.e
    public void w() {
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f366938h;
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        com.tencent.mm.plugin.finder.report.p2.y(p2Var, finderItem, "CDNUpload", null, null, 0, 0L, 60, null);
        super.w();
    }

    @Override // qv2.e
    public void y() {
        cu2.u.f222441a.l(this.f366938h);
    }
}
