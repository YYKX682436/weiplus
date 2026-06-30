package sv2;

/* loaded from: classes10.dex */
public final class w extends qv2.e {

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413370v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f413371w;

    /* renamed from: x, reason: collision with root package name */
    public pv2.g f413372x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStageNew$draftModifyListener$1 f413373y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStageNew$draftModifyListener$1] */
    public w(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super(draftItem.t0(), "draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413370v = draftItem;
        this.f413371w = "LogPost.FinderDraftUploadStageNew";
        this.f413372x = n();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f413373y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderDraftModifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStageNew$draftModifyListener$1
            {
                this.__eventId = -881666027;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderDraftModifyEvent finderDraftModifyEvent) {
                com.tencent.mm.autogen.events.FinderDraftModifyEvent event = finderDraftModifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.za zaVar = event.f54269g;
                if (!(zaVar != null && zaVar.f8549a == 0)) {
                    sv2.w wVar = sv2.w.this;
                    if (zaVar != null && zaVar.f8549a == wVar.f413370v.field_localId) {
                        java.lang.String str = wVar.f413371w;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("draftModifyListener cancel localId:");
                        com.tencent.mm.plugin.finder.storage.x80 x80Var = wVar.f413370v;
                        sb6.append(x80Var.field_localId);
                        sb6.append(", ");
                        sb6.append(x80Var.field_objectId);
                        sb6.append(" modifyType:");
                        sb6.append(zaVar != null ? java.lang.Integer.valueOf(zaVar.f8550b) : null);
                        com.tencent.mars.xlog.Log.i(str, sb6.toString());
                        wVar.v();
                    }
                }
                return false;
            }
        };
    }

    @Override // qv2.e
    public void A(pv2.g gVar) {
        kotlin.jvm.internal.o.g(gVar, "<set-?>");
        this.f413372x = gVar;
    }

    @Override // qv2.e
    public void B() {
        this.f366938h.trackDraftPost("upload");
    }

    @Override // qv2.e
    public pv2.g m() {
        return new sv2.c(this.f413370v, 3);
    }

    @Override // qv2.e
    public pv2.g n() {
        return new sv2.c(this.f413370v, 2);
    }

    @Override // qv2.e
    public com.tencent.mm.sdk.event.IListener o() {
        return this.f413373y;
    }

    @Override // qv2.e
    public com.tencent.mm.plugin.finder.report.k5 p() {
        return com.tencent.mm.plugin.finder.report.f0.f125015a;
    }

    @Override // qv2.e
    public pv2.g q() {
        return new sv2.q(this.f413370v, this.f366946s);
    }

    @Override // qv2.e
    public pv2.g r() {
        return this.f413372x;
    }

    @Override // qv2.e
    public java.lang.String s() {
        return this.f413371w;
    }

    @Override // qv2.e
    public void y() {
        cu2.o.f222430a.b(this.f413370v);
    }
}
