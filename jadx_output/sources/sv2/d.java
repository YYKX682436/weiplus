package sv2;

/* loaded from: classes10.dex */
public final class d extends qv2.b {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413265m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f413266n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderAdDraftMediaPocessStage$draftModifyListener$1 f413267o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderAdDraftMediaPocessStage$draftModifyListener$1] */
    public d(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super(draftItem.t0(), "draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413265m = draftItem;
        this.f413266n = "LogPost.FinderAdDraftMediaPocessStage";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f413267o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderDraftModifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderAdDraftMediaPocessStage$draftModifyListener$1
            {
                this.__eventId = -881666027;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderDraftModifyEvent finderDraftModifyEvent) {
                com.tencent.mm.autogen.events.FinderDraftModifyEvent event = finderDraftModifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.za zaVar = event.f54269g;
                long j17 = zaVar.f8549a;
                if (j17 != 0) {
                    sv2.d dVar = sv2.d.this;
                    if (j17 == dVar.f413265m.field_localId) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canceled ");
                        com.tencent.mm.plugin.finder.storage.x80 x80Var = dVar.f413265m;
                        sb6.append(x80Var.field_localId);
                        sb6.append(", ");
                        sb6.append(x80Var.field_objectId);
                        sb6.append(", modifyType:");
                        sb6.append(java.lang.Integer.valueOf(zaVar.f8550b));
                        com.tencent.mars.xlog.Log.i(dVar.f413266n, sb6.toString());
                        dVar.f366936i = true;
                        uv2.e.f431376a.c(dVar.f366935h.getMediaList());
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @Override // qv2.b
    public com.tencent.mm.sdk.event.IListener l() {
        return this.f413267o;
    }

    @Override // qv2.b
    public com.tencent.mm.plugin.finder.report.k5 m() {
        return com.tencent.mm.plugin.finder.report.f0.f125015a;
    }

    @Override // qv2.b
    public long n() {
        return this.f413265m.field_localId;
    }

    @Override // qv2.b
    public pv2.g o(boolean z17, boolean z18) {
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413265m;
        return z17 ? new sv2.h(x80Var) : z18 ? new sv2.c(x80Var, 3) : new sv2.c(x80Var, 2);
    }

    @Override // qv2.b
    public java.lang.String p() {
        return this.f413266n;
    }

    @Override // qv2.b
    public void t() {
    }

    @Override // qv2.b
    public void u() {
        this.f366935h.trackDraftPost("adDraftMediaProcess");
    }

    @Override // qv2.b
    public void v(float f17) {
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int i17 = (int) (45 * f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413265m;
        sb6.append(x80Var.field_localId);
        sb6.append(" updateProgress  ");
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(this.f413266n, sb6.toString());
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f366935h;
        if (finderItem.getPostInfo().getInteger(4) < i17) {
            finderItem.getPostInfo().set(4, java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
        long j17 = x80Var.field_localId;
        am.ga gaVar = feedPostProgressEvent.f54250g;
        gaVar.f6749a = j17;
        gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
        gaVar.f6751c = 4;
        feedPostProgressEvent.e();
    }
}
