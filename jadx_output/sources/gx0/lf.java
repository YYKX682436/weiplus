package gx0;

/* loaded from: classes5.dex */
public final class lf implements vu0.y {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f276686a;

    public lf(yz5.l resultBlock) {
        kotlin.jvm.internal.o.g(resultBlock, "resultBlock");
        this.f276686a = resultBlock;
    }

    @Override // vu0.y
    public void a() {
        this.f276686a.invoke(null);
    }

    @Override // vu0.y
    public void b() {
    }

    @Override // vu0.y
    public void c(java.util.List list) {
        java.util.ArrayList arrayList;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.util.LinkedList<r45.me4> sentenceGroup = ((r45.ne4) it.next()).f381311e;
                kotlin.jvm.internal.o.f(sentenceGroup, "sentenceGroup");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(sentenceGroup, 10));
                for (r45.me4 me4Var : sentenceGroup) {
                    arrayList2.add(new com.tencent.maas.moviecomposing.ASRSegmentationInfo(new com.tencent.maas.model.time.MJTimeRange(com.tencent.maas.model.time.MJTime.fromMilliseconds(me4Var.f380416m), com.tencent.maas.model.time.MJTime.fromMilliseconds(me4Var.f380411e))));
                }
                kz5.h0.u(arrayList, arrayList2);
            }
        } else {
            arrayList = null;
        }
        this.f276686a.invoke(arrayList);
    }

    @Override // vu0.y
    public void onCancel() {
        this.f276686a.invoke(null);
    }

    @Override // vu0.y
    public void onProgress(float f17) {
    }
}
