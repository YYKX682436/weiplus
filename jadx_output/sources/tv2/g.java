package tv2;

/* loaded from: classes10.dex */
public final class g extends qv2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f422304m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStageNew$feedDeleteListener$1 f422305n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStageNew$feedDeleteListener$1] */
    public g(final com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(finderObj, java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f422304m = "Finder.LogPost.FinderMediaProcessStageNew";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f422305n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStageNew$feedDeleteListener$1
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
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = com.tencent.mm.plugin.finder.storage.FinderItem.this;
                if (j17 != finderItem.getLocalId()) {
                    return false;
                }
                tv2.g gVar = this;
                com.tencent.mars.xlog.Log.i(gVar.f422304m, "feedDeleteListener localId:" + daVar.f6438b);
                if (cu2.u.f222441a.k(finderItem.getLocalId())) {
                    return false;
                }
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = gVar.f366935h.field_reportObject;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.setUploadLogicError(200);
                }
                gVar.f366936i = true;
                uv2.e.f431376a.c(gVar.f366935h.getMediaList());
                return false;
            }
        };
    }

    @Override // qv2.b
    public void k(com.tencent.mm.plugin.vlog.model.z result, com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        mv2.f0.f331561a.d(result, finderObj);
    }

    @Override // qv2.b
    public com.tencent.mm.sdk.event.IListener l() {
        return this.f422305n;
    }

    @Override // qv2.b
    public com.tencent.mm.plugin.finder.report.k5 m() {
        return com.tencent.mm.plugin.finder.report.u4.f125384a;
    }

    @Override // qv2.b
    public pv2.g o(boolean z17, boolean z18) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f366935h;
        if (!z17) {
            return z18 ? new tv2.x(finderItem, 1) : new tv2.x(finderItem, 2);
        }
        uv2.i iVar = uv2.i.f431389a;
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.B).getValue()).r()).booleanValue() ? new tv2.w(finderItem) : new tv2.v(finderItem);
    }

    @Override // qv2.b
    public java.lang.String p() {
        return this.f422304m;
    }

    @Override // qv2.b
    public void r() {
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f366935h;
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        com.tencent.mm.plugin.finder.report.p2.y(p2Var, finderItem, "CompressVideo", null, null, 0, 0L, 60, null);
        super.r();
    }

    @Override // qv2.b
    public void s() {
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f366935h;
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        com.tencent.mm.plugin.finder.report.p2.v(p2Var, finderItem, "CompressVideo", null, null, 0, 0L, 60, null);
        super.s();
    }

    @Override // qv2.b
    public void t() {
        cu2.u.f222441a.l(this.f366935h);
    }

    @Override // qv2.b
    public void u() {
        this.f366935h.trackPost("mediaProcess");
    }
}
