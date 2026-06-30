package jv0;

/* loaded from: classes5.dex */
public abstract class g extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f302185n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f302186o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTimeRange f302187p;

    /* renamed from: q, reason: collision with root package name */
    public ex0.f f302188q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f302189r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f302190s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f302185n = jz5.h.b(new jv0.e(this));
        this.f302186o = jz5.h.b(new jv0.f(this));
        this.f302187p = com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange;
        this.f302189r = new java.util.ArrayList();
        this.f302190s = new java.util.LinkedHashMap();
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        return new jv0.a(getContext());
    }

    public java.util.List k7() {
        return null;
    }

    public com.tencent.maas.model.time.MJTime l7(ex0.f vm6, com.tencent.maas.moviecomposing.segments.CaptionItem captionItem) {
        kotlin.jvm.internal.o.g(vm6, "vm");
        kotlin.jvm.internal.o.g(captionItem, "captionItem");
        com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        return ZeroTime;
    }

    public com.tencent.maas.model.time.MJTime m7(ex0.f vm6, com.tencent.maas.moviecomposing.segments.CaptionItem captionItem) {
        kotlin.jvm.internal.o.g(vm6, "vm");
        kotlin.jvm.internal.o.g(captionItem, "captionItem");
        com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        return ZeroTime;
    }

    public ex0.f n7(com.tencent.maas.base.MJID mjid) {
        return null;
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView o7() {
        java.lang.Object value = ((jz5.n) this.f302185n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView) value;
    }

    public void p7() {
    }

    public void q7() {
    }

    public void r7(com.tencent.maas.base.MJID destSegmentID) {
        kotlin.jvm.internal.o.g(destSegmentID, "destSegmentID");
    }

    public void s7() {
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    /* renamed from: t7, reason: merged with bridge method [inline-methods] */
    public void a7(jv0.a panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        java.lang.Object V6 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.V6(this, "key_dest_segment_id", null, 2, null);
        com.tencent.maas.base.MJID mjid = V6 instanceof com.tencent.maas.base.MJID ? (com.tencent.maas.base.MJID) V6 : null;
        if (mjid == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            mjid = null;
        }
        if (mjid == null) {
            return;
        }
        ex0.f n76 = n7(mjid);
        if (n76 == null) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.U6(this, false, 1, null);
            return;
        }
        this.f302188q = n76;
        this.f302187p = new com.tencent.maas.model.time.MJTimeRange(n76.k(), n76.j());
        java.util.List<ex0.r> k76 = k7();
        if (k76 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f302189r;
            arrayList.clear();
            ((java.util.LinkedHashMap) this.f302190s).clear();
            for (ex0.r rVar : k76) {
                if (!rVar.o() && (rVar instanceof ex0.f)) {
                    com.tencent.maas.base.MJID mjid2 = rVar.f257168b;
                    if (!kotlin.jvm.internal.o.b(mjid2, n76.f257168b) && !(rVar instanceof ex0.o)) {
                        if (rVar instanceof ex0.q) {
                            u7((ex0.f) rVar, ((ex0.q) rVar).I());
                        } else if (rVar instanceof ex0.b) {
                            ex0.f fVar = (ex0.f) rVar;
                            ex0.b bVar = (ex0.b) rVar;
                            u7(fVar, bVar.B(bVar.D()));
                        } else {
                            arrayList.add(new jv0.p(rVar.k(), true));
                            com.tencent.maas.model.time.MJTime endTime = rVar.l().getEndTime();
                            kotlin.jvm.internal.o.f(endTime, "getEndTime(...)");
                            arrayList.add(new jv0.p(endTime, false));
                            v7(rVar.k().getFlicks(), mjid2);
                            v7(rVar.l().getEndTime().getFlicks(), mjid2);
                        }
                    }
                }
            }
        }
        jz5.g gVar = this.f302186o;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.TextView) value).setOnClickListener(new jv0.b(this));
        jv0.a aVar = (jv0.a) this.f69240i;
        if (aVar != null) {
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.b(aVar, (android.widget.TextView) value2, null);
        }
        r7(mjid);
        q7();
        p7();
        panel.H();
        panel.I(new jv0.c(this), new jv0.d(this));
    }

    public final void u7(ex0.f fVar, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.maas.moviecomposing.segments.CaptionItem captionItem = (com.tencent.maas.moviecomposing.segments.CaptionItem) it.next();
            com.tencent.maas.model.time.MJTime m76 = m7(fVar, captionItem);
            com.tencent.maas.model.time.MJTime l76 = l7(fVar, captionItem);
            java.util.List list2 = this.f302189r;
            ((java.util.ArrayList) list2).add(new jv0.p(m76, true));
            ((java.util.ArrayList) list2).add(new jv0.p(l76, false));
            v7(m76.getFlicks(), fVar.f257168b);
            v7(l76.getFlicks(), fVar.f257168b);
        }
    }

    public final void v7(long j17, com.tencent.maas.base.MJID mjid) {
        java.util.Map map = this.f302190s;
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (list == null) {
            map.put(java.lang.Long.valueOf(j17), kz5.c0.k(mjid));
        } else {
            list.add(mjid);
        }
    }

    public void w7() {
    }

    public void x7() {
    }
}
