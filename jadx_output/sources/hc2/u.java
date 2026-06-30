package hc2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f280341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f280342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i17, r45.qt2 qt2Var) {
        super(0);
        this.f280341d = i17;
        this.f280342e = qt2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.qt2 qt2Var;
        java.util.List i17 = bu2.d0.i(bu2.e0.f24498a, this.f280341d, null, 2, null);
        java.util.Iterator it = i17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            qt2Var = this.f280342e;
            if (!hasNext) {
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                if (qt2Var != null) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((com.tencent.mm.plugin.finder.report.o3) c17).rk(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getFeedObject(), qt2Var.getInteger(5), null);
                }
                for (com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed : ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getFoldedFeedList()) {
                    i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    ((com.tencent.mm.plugin.finder.report.o3) c18).rk(baseFinderFeed.getFeedObject().getFeedObject(), 14, null);
                }
            }
        }
        if (qt2Var != null) {
            bu2.j jVar = bu2.j.f24534a;
            int integer = qt2Var.getInteger(5);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : i17) {
                if (obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it6.next()).getFeedObject().getFeedObject());
            }
            jVar.a(integer, arrayList2);
        }
        return i17;
    }
}
