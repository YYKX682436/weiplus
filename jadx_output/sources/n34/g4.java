package n34;

/* loaded from: classes4.dex */
public final class g4 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.SnsStarListUIC f334608d;

    public g4(com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC) {
        this.f334608d = snsStarListUIC;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/SnsStarListUIC$initData$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC = this.f334608d;
        if (com.tencent.mm.plugin.sns.SnsStarListUIC.P6(snsStarListUIC).getLastVisiblePosition() == com.tencent.mm.plugin.sns.SnsStarListUIC.P6(snsStarListUIC).getCount() - 2) {
            int count = com.tencent.mm.plugin.sns.SnsStarListUIC.P6(snsStarListUIC).getCount();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getListCount$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            int i27 = snsStarListUIC.f162549o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getListCount$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            if (count != i27) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListUIC", "now refresh count: " + com.tencent.mm.plugin.sns.SnsStarListUIC.P6(snsStarListUIC).getCount());
                int count2 = com.tencent.mm.plugin.sns.SnsStarListUIC.P6(snsStarListUIC).getCount();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setListCount$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                snsStarListUIC.f162549o = count2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setListCount$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLoadingDownView$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLoadingDownView$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.tencent.mm.plugin.sns.ui.LoadingMoreView loadingMoreView = snsStarListUIC.f162542e;
                if (loadingMoreView != null) {
                    loadingMoreView.c();
                }
                androidx.appcompat.app.AppCompatActivity activity = snsStarListUIC.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                ((com.tencent.mm.plugin.sns.SnsStarListDataUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.SnsStarListDataUIC.class)).U6();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$2");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/SnsStarListUIC$initData$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC = this.f334608d;
            if (com.tencent.mm.plugin.sns.SnsStarListUIC.P6(snsStarListUIC).getLastVisiblePosition() == com.tencent.mm.plugin.sns.SnsStarListUIC.P6(snsStarListUIC).getCount() - 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListUIC", "onScrollStateChanged >> to load more data");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLoadingDownView$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLoadingDownView$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.tencent.mm.plugin.sns.ui.LoadingMoreView loadingMoreView = snsStarListUIC.f162542e;
                if (loadingMoreView != null) {
                    loadingMoreView.c();
                }
                androidx.appcompat.app.AppCompatActivity activity = snsStarListUIC.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                ((com.tencent.mm.plugin.sns.SnsStarListDataUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.SnsStarListDataUIC.class)).U6();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$2");
    }
}
