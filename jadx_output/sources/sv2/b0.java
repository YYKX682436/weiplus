package sv2;

/* loaded from: classes10.dex */
public final class b0 extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413254h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f413255i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f413256m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.f0 f413257n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f413258o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f413259p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413254h = draftItem;
        this.f413255i = "LogPost.MvDraftMediaProcessStage";
        this.f413256m = draftItem.t0();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f413259p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderDraftModifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftMediaProcessStage$draftModifyListener$1
            {
                this.__eventId = -881666027;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderDraftModifyEvent finderDraftModifyEvent) {
                com.tencent.mm.autogen.events.FinderDraftModifyEvent event = finderDraftModifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                sv2.b0 b0Var = sv2.b0.this;
                am.za zaVar = event.f54269g;
                if (!(zaVar != null && zaVar.f8549a == b0Var.f413254h.field_localId)) {
                    return false;
                }
                java.lang.String str = b0Var.f413255i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canceled ");
                com.tencent.mm.plugin.finder.storage.x80 x80Var = b0Var.f413254h;
                sb6.append(x80Var.field_localId);
                sb6.append(", ");
                sb6.append(x80Var.field_objectId);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                b0Var.f413258o = true;
                com.tencent.mm.plugin.vlog.model.f0 f0Var = b0Var.f413257n;
                if (f0Var != null) {
                    com.tencent.mm.plugin.vlog.model.f0.b(f0Var, null, 1, null);
                }
                return true;
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
        boolean isLongVideo = this.f413256m.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 20L, 1L);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 20L, 1L);
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
        boolean isLongVideo = this.f413256m.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 20L, 1L);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 20L, 1L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0998, code lost:
    
        r14 = r13;
        com.tencent.mars.xlog.Log.i(r14.f413255i, "error cannot get mvTrack and mvMedia");
        r0 = new sv2.c(r14.f413254h, 2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r1v105, types: [r45.mb4, com.tencent.mm.protobuf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.tencent.mm.protobuf.e, r45.jf2] */
    /* JADX WARN: Type inference failed for: r1v26, types: [pc0.g2] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.tencent.mm.protocal.protobuf.FinderMedia] */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r7v1, types: [dm.i4, com.tencent.mm.plugin.finder.storage.FinderItem] */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 2541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv2.b0.j():pv2.g");
    }

    public final void k(float f17, int i17, int i18) {
        float f18 = (f17 > 1.0f ? 1.0f : f17) * ((i17 + 1.0f) / i18);
        int i19 = (int) (45 * f18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413254h;
        sb6.append(x80Var.field_localId);
        sb6.append(" updateProgress ");
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(f18);
        sb6.append(", ");
        sb6.append(i19);
        sb6.append(", index:");
        sb6.append(i17);
        sb6.append(", size:");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i(this.f413255i, sb6.toString());
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f413256m;
        if (finderItem.getPostInfo().getInteger(4) < i19) {
            finderItem.getPostInfo().set(4, java.lang.Integer.valueOf(i19));
            cu2.o.f222430a.b(x80Var);
        }
        com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
        long j17 = x80Var.field_localId;
        am.ga gaVar = feedPostProgressEvent.f54250g;
        gaVar.f6749a = j17;
        gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
        feedPostProgressEvent.e();
    }
}
