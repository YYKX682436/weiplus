package gx0;

/* loaded from: classes5.dex */
public final class la implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276675d;

    public la(gx0.ac acVar) {
        this.f276675d = acVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ex0.v vVar;
        cx0.c cVar = (cx0.c) obj;
        gx0.ac acVar = this.f276675d;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.narration.timeline.NarrationTimelineView A7 = acVar.A7();
        kotlin.jvm.internal.o.d(cVar);
        A7.n(cVar);
        acVar.c8().n7();
        ex0.a0 e86 = acVar.e8();
        ex0.r n17 = e86 != null ? e86.n() : null;
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar != null) {
            int ordinal = fVar.f257134j.ordinal();
            com.tencent.maas.model.time.MJTime i76 = ordinal != 1 ? ordinal != 2 ? acVar.c8().i7() : fVar.l().getEndTime() : fVar.k();
            com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) acVar.c8().f276258y.getValue();
            if (mJTime == null) {
                mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            }
            if (i76.isValid() && mJTime.isValid()) {
                ((gx0.bh) ((jz5.n) acVar.G).getValue()).i7(i76, mJTime);
            }
        }
        java.util.List<cx0.b> list = cVar.f224500a;
        if (!list.isEmpty()) {
            for (cx0.b bVar : list) {
                ex0.a0 e87 = acVar.e8();
                ex0.r K = e87 != null ? e87.K(bVar.f224496a) : null;
                if (K != null) {
                    ex0.a0 e88 = acVar.e8();
                    if ((e88 == null || (vVar = e88.f257097g) == null || !vVar.e(K)) ? false : true) {
                        kotlinx.coroutines.l.d(acVar.getLifecycleScope(), null, null, new gx0.ka(acVar, K, null), 3, null);
                    }
                }
            }
        }
    }
}
