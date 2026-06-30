package sv2;

/* loaded from: classes10.dex */
public final class h extends qv2.e {

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413281v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f413282w;

    /* renamed from: x, reason: collision with root package name */
    public pv2.g f413283x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderAdDraftUploadStage$draftModifyListener$1 f413284y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderAdDraftUploadStage$draftModifyListener$1] */
    public h(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super(draftItem.t0(), "draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413281v = draftItem;
        this.f413282w = "LogPost.FinderAdDraftUploadStage";
        this.f413283x = n();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f413284y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderDraftModifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderAdDraftUploadStage$draftModifyListener$1
            {
                this.__eventId = -881666027;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderDraftModifyEvent finderDraftModifyEvent) {
                com.tencent.mm.autogen.events.FinderDraftModifyEvent event = finderDraftModifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.za zaVar = event.f54269g;
                if (!(zaVar != null && zaVar.f8549a == 0)) {
                    sv2.h hVar = sv2.h.this;
                    if (zaVar != null && zaVar.f8549a == hVar.f413281v.field_localId) {
                        java.lang.String str = hVar.f413282w;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("draftModifyListener cancel localId:");
                        com.tencent.mm.plugin.finder.storage.x80 x80Var = hVar.f413281v;
                        sb6.append(x80Var.field_localId);
                        sb6.append(", ");
                        sb6.append(x80Var.field_objectId);
                        sb6.append(" modifyType:");
                        sb6.append(zaVar != null ? java.lang.Integer.valueOf(zaVar.f8550b) : null);
                        com.tencent.mars.xlog.Log.i(str, sb6.toString());
                        hVar.v();
                    }
                }
                return false;
            }
        };
    }

    @Override // qv2.e
    public void A(pv2.g gVar) {
        kotlin.jvm.internal.o.g(gVar, "<set-?>");
        this.f413283x = gVar;
    }

    @Override // qv2.e
    public void B() {
        this.f366938h.trackDraftPost("doAdDraftUpload");
    }

    @Override // qv2.e
    public void E(java.lang.String str, dn.g gVar) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Map map = this.f366941n;
        if (!map.containsKey(str) || gVar == null) {
            return;
        }
        float f17 = (((float) gVar.field_finishedLength) * 1.0f) / ((float) gVar.field_toltalLength);
        java.lang.Float f18 = (java.lang.Float) ((java.util.LinkedHashMap) map).get(str);
        if (f17 > (f18 != null ? f18.floatValue() : 0.0f)) {
            map.put(str, java.lang.Float.valueOf(f17));
        }
        float H0 = kz5.n0.H0(((java.util.LinkedHashMap) map).values()) / map.size();
        int i17 = ((int) (45 * H0)) + 45;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f366938h;
        sb6.append(finderItem.getLocalId());
        sb6.append(" updateProgress  ");
        sb6.append(H0);
        sb6.append(", ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(this.f413282w, sb6.toString());
        if (finderItem.getPostInfo().getInteger(4) < i17) {
            finderItem.getPostInfo().set(4, java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
        long localId = finderItem.getLocalId();
        am.ga gaVar = feedPostProgressEvent.f54250g;
        gaVar.f6749a = localId;
        gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
        gaVar.f6751c = 4;
        feedPostProgressEvent.e();
    }

    @Override // qv2.e
    public pv2.g m() {
        return new sv2.c(this.f413281v, 3);
    }

    @Override // qv2.e
    public pv2.g n() {
        return new sv2.c(this.f413281v, 2);
    }

    @Override // qv2.e
    public com.tencent.mm.sdk.event.IListener o() {
        return this.f413284y;
    }

    @Override // qv2.e
    public com.tencent.mm.plugin.finder.report.k5 p() {
        return com.tencent.mm.plugin.finder.report.f0.f125015a;
    }

    @Override // qv2.e
    public pv2.g q() {
        return new sv2.f(this.f413281v, this.f366946s);
    }

    @Override // qv2.e
    public pv2.g r() {
        return this.f413283x;
    }

    @Override // qv2.e
    public java.lang.String s() {
        return this.f413282w;
    }

    @Override // qv2.e
    public void y() {
    }
}
