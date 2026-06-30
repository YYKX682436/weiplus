package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lcom/tencent/mm/plugin/sns/ui/improve/component/f2;", "j2", "Ljz5/g;", "getUic", "()Lcom/tencent/mm/plugin/sns/ui/improve/component/f2;", "uic", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class ImproveRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public final jz5.g uic;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.uic = jz5.h.b(new bd4.a1(this));
    }

    private final com.tencent.mm.plugin.sns.ui.improve.component.f2 getUic() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUic", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        com.tencent.mm.plugin.sns.ui.improve.component.f2 f2Var = (com.tencent.mm.plugin.sns.ui.improve.component.f2) this.uic.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUic", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        return f2Var;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void a1(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        super.a1(i17);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Improve.RecyclerView", "scrollToPosition:" + i17, new java.lang.Object[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
    }

    public final void g1(int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeForceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.RecyclerView", "safeForceScrollToPosition position:" + i17 + " offset:" + i18 + " retry:" + i19);
        if (i19 >= 20) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeForceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView", "safeForceScrollToPosition", "(III)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView", "safeForceScrollToPosition", "(III)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        addOnLayoutChangeListener(new bd4.x0(linearLayoutManager, i17, i18));
        getViewTreeObserver().addOnGlobalLayoutListener(new bd4.z0(this, i17, i18, i19));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeForceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        xc4.p n17;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewAdded", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        super.onViewAdded(view);
        if (view == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewAdded", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
            return;
        }
        com.tencent.mm.plugin.sns.ui.improve.component.f2 uic = getUic();
        uic.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        if (view instanceof kc4.a) {
            kc4.a aVar = (kc4.a) view;
            xc4.p snsInfo = aVar.getSnsInfo();
            if (snsInfo != null && snsInfo.isAd()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                xc4.p snsInfo2 = aVar.getSnsInfo();
                if (snsInfo2 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                } else if (snsInfo2.isAd()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OldVersionUIC", "adExposeReport");
                    int j17 = com.tencent.mm.plugin.sns.ui.bs.j(snsInfo2.c1());
                    i64.b1 b1Var = uic.f168794d;
                    int position = aVar.getPosition();
                    java.lang.String W0 = snsInfo2.W0();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExposures", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                    boolean z17 = (snsInfo2.getLocalFlag() & 128) > 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExposures", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                    b1Var.n(position, W0, z17, (android.view.View) aVar, snsInfo2.y0(), snsInfo2.d1(), j17, 1);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.OldVersionUIC", "ad expose error,view hash:" + view.hashCode() + " info:" + aVar.getSnsInfo());
                i64.u1.a(209, 1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            }
        } else {
            if (view instanceof tc4.s0) {
                try {
                    zc4.b improveListItem = ((tc4.s0) view).getImproveListItem();
                    if (improveListItem != null && (n17 = improveListItem.n()) != null) {
                        com.tencent.mm.protocal.protobuf.TimeLineObject h17 = n17.h1();
                        if ((h17 == null || (a90Var = h17.ContentObj) == null || a90Var.f369837e != 3) ? false : true) {
                            java.util.HashMap hashMap = uic.f168800m;
                            if (!hashMap.containsKey(java.lang.Long.valueOf(n17.y0()))) {
                                hashMap.put(java.lang.Long.valueOf(n17.y0()), n17);
                            }
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("MicroMsg.OldVersionUIC", th6);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewAdded", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        xc4.p n17;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRemoved", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        super.onViewRemoved(view);
        if (view == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRemoved", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
            return;
        }
        com.tencent.mm.plugin.sns.ui.improve.component.f2 uic = getUic();
        uic.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        if (view instanceof kc4.a) {
            kc4.a aVar = (kc4.a) view;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            xc4.p snsInfo = aVar.getSnsInfo();
            if (snsInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            } else if (snsInfo.isAd()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OldVersionUIC", "adHideReport");
                uic.f168794d.o(aVar.getPosition(), snsInfo.W0(), snsInfo.y0(), 1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            }
        } else if (view instanceof tc4.s0) {
            try {
                zc4.b improveListItem = ((tc4.s0) view).getImproveListItem();
                if (improveListItem != null && (n17 = improveListItem.n()) != null) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo c17 = n17.c1();
                    com.tencent.mm.protocal.protobuf.TimeLineObject h17 = n17.h1();
                    if ((h17 == null || (a90Var = h17.ContentObj) == null || a90Var.f369837e != 3) ? false : true) {
                        java.util.HashMap hashMap = uic.f168800m;
                        if (hashMap.containsKey(java.lang.Long.valueOf(n17.y0()))) {
                            hashMap.remove(java.lang.Long.valueOf(n17.y0()));
                            com.tencent.mm.modelstat.k0.k(com.tencent.mm.modelstat.j0.Sns, n17.h1().statExtStr, c17.getAdRecSrc(), ca4.z0.t0(n17.y0()), c17);
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            } catch (java.lang.Throwable th6) {
                ca4.q.c("MicroMsg.OldVersionUIC", th6);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRemoved", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRemoved", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.uic = jz5.h.b(new bd4.a1(this));
    }
}
