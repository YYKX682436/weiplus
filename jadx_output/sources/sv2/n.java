package sv2;

/* loaded from: classes10.dex */
public final class n extends qv2.b {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413337m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f413338n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStageNew$draftModifyListener$1 f413339o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStageNew$draftModifyListener$1] */
    public n(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super(draftItem.t0(), "draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413337m = draftItem;
        this.f413338n = "LogPost.FinderDraftMediaProcessStageNew";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f413339o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderDraftModifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStageNew$draftModifyListener$1
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
                    sv2.n nVar = sv2.n.this;
                    if (j17 == nVar.f413337m.field_localId) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canceled ");
                        com.tencent.mm.plugin.finder.storage.x80 x80Var = nVar.f413337m;
                        sb6.append(x80Var.field_localId);
                        sb6.append(", ");
                        sb6.append(x80Var.field_objectId);
                        sb6.append(", modifyType:");
                        sb6.append(java.lang.Integer.valueOf(zaVar.f8550b));
                        com.tencent.mars.xlog.Log.i(nVar.f413338n, sb6.toString());
                        nVar.f366936i = true;
                        uv2.e.f431376a.c(nVar.f366935h.getMediaList());
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @Override // qv2.b
    public com.tencent.mm.sdk.event.IListener l() {
        return this.f413339o;
    }

    @Override // qv2.b
    public com.tencent.mm.plugin.finder.report.k5 m() {
        return com.tencent.mm.plugin.finder.report.f0.f125015a;
    }

    @Override // qv2.b
    public long n() {
        return this.f413337m.field_localId;
    }

    @Override // qv2.b
    public pv2.g o(boolean z17, boolean z18) {
        com.tencent.mm.plugin.finder.storage.x80 draftItem = this.f413337m;
        if (!z17) {
            return z18 ? new sv2.c(draftItem, 3) : new sv2.c(draftItem, 2);
        }
        uv2.i iVar = uv2.i.f431389a;
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.B).getValue()).r()).booleanValue() ? new sv2.w(draftItem) : new sv2.v(draftItem);
    }

    @Override // qv2.b
    public java.lang.String p() {
        return this.f413338n;
    }

    @Override // qv2.b
    public void t() {
        cu2.o.f222430a.b(this.f413337m);
    }

    @Override // qv2.b
    public void u() {
        this.f366935h.trackDraftPost("mediaProcess");
    }
}
