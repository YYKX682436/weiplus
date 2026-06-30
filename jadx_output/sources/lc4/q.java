package lc4;

/* loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final lc4.q f317981d = new lc4.q();

    public q() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xc4.p n17;
        xc4.p n18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$1");
        java.util.List list = (java.util.List) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$1");
        kotlin.jvm.internal.o.g(list, "list");
        java.util.Iterator it = list.iterator();
        zc4.b bVar = null;
        if (it.hasNext()) {
            ?? next = it.next();
            if (it.hasNext()) {
                zc4.b bVar2 = (zc4.b) next;
                if (!(!bVar2.n().isAd())) {
                    bVar2 = null;
                }
                jz5.x xVar = new jz5.x((bVar2 == null || (n18 = bVar2.n()) == null) ? -1L : n18.y0());
                do {
                    java.lang.Object next2 = it.next();
                    zc4.b bVar3 = (zc4.b) next2;
                    if (!(!bVar3.n().isAd())) {
                        bVar3 = null;
                    }
                    jz5.x xVar2 = new jz5.x((bVar3 == null || (n17 = bVar3.n()) == null) ? -1L : n17.y0());
                    next = next;
                    if (xVar.compareTo(xVar2) > 0) {
                        next = next2;
                        xVar = xVar2;
                    }
                } while (it.hasNext());
            }
            bVar = next;
        }
        zc4.b bVar4 = bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$1");
        return bVar4;
    }
}
