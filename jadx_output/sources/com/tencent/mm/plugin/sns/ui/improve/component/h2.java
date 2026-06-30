package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class h2 extends xm3.t0 {
    public com.tencent.mm.plugin.sns.ui.improve.component.g2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, in5.s itemConvertFactory, com.tencent.mm.plugin.sns.ui.improve.component.g2 g2Var) {
        super(mvvmList, itemConvertFactory, false);
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
        kotlin.jvm.internal.o.g(itemConvertFactory, "itemConvertFactory");
        this.K = g2Var;
    }

    @Override // xm3.t0, xm3.m0
    public void k(xm3.o0 pendingData) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
        kotlin.jvm.internal.o.g(pendingData, "pendingData");
        com.tencent.mm.plugin.sns.ui.improve.component.g2 g2Var = this.K;
        if (g2Var != null) {
            g2Var.a3(pendingData);
        }
        super.k(pendingData);
        com.tencent.mm.plugin.sns.ui.improve.component.g2 g2Var2 = this.K;
        if (g2Var2 != null) {
            g2Var2.B2(pendingData);
        }
        java.util.Iterator it = pendingData.f455366c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            xm3.b bVar = (xm3.b) obj;
            if (bVar.f455287a == xm3.c.f455296d && bVar.f455288b == 0 && bVar.f455289c > 0) {
                break;
            }
        }
        if (((xm3.b) obj) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
            return;
        }
        if (kotlin.jvm.internal.o.b(((zc4.b) pendingData.f455364a.get(0)).n().getUserName(), c01.z1.r())) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = b0().getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            } else if (layoutManager != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(layoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
                layoutManager.scrollToPosition(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(layoutManager, "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
    }
}
