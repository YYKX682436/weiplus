package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class aq extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f133796a;

    /* renamed from: b, reason: collision with root package name */
    public long f133797b;

    public aq(java.lang.ref.WeakReference rUIC) {
        kotlin.jvm.internal.o.g(rUIC, "rUIC");
        this.f133796a = rUIC;
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.tencent.mm.plugin.finder.viewmodel.component.jq jqVar;
        com.tencent.mars.xlog.Log.i("FinderNegativeFeedBackUIC", "onRefreshBegin refreshType=" + i17 + ",extInfo=" + aVar + ",loaderId=" + this.f133797b);
        boolean z18 = false;
        if (aVar != null) {
            if (aVar.f397971a == this.f133797b) {
                z18 = true;
            }
        }
        if (z18 || (jqVar = (com.tencent.mm.plugin.finder.viewmodel.component.jq) this.f133796a.get()) == null) {
            return;
        }
        jqVar.R6("onRefreshBegin_" + i17);
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.viewmodel.component.jq jqVar = (com.tencent.mm.plugin.finder.viewmodel.component.jq) this.f133796a.get();
        if (jqVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderNegativeFeedBackUIC", "onRefreshEnd actionType=" + reason.f463516a + ",cur TabType=" + jqVar.O6() + ",loaderId=" + this.f133797b);
        ey2.l lVar = (ey2.l) pf5.u.f353936a.e(c61.l7.class).a(ey2.l.class);
        long j17 = this.f133797b;
        java.util.HashSet hashSet = lVar.f257421e;
        java.lang.Object obj = null;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((rn5.a) next).f397971a == j17) {
                    obj = next;
                    break;
                }
            }
            obj = (rn5.a) obj;
        }
        if (obj != null) {
            java.util.HashSet hashSet2 = lVar.f257421e;
            if (hashSet2 != null) {
                pm0.v.c0(hashSet2, new ey2.k(j17));
            }
            com.tencent.mars.xlog.Log.i("FinderCgiEndVM", "remove ext info id=" + j17 + '!');
        }
        if (obj != null) {
            jqVar.R6("onCgiEnd_" + this.f133797b);
        }
    }
}
