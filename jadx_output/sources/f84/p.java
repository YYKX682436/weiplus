package f84;

/* loaded from: classes4.dex */
public final class p extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f84.u f260199d;

    public p(f84.u uVar) {
        this.f260199d = uVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mOnScrollListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        boolean canScrollHorizontally = recyclerView.canScrollHorizontally(1);
        boolean canScrollHorizontally2 = recyclerView.canScrollHorizontally(-1);
        f84.u uVar = this.f260199d;
        uVar.j();
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i(uVar.j(), "onScrollStateChanged, idle");
            if (!canScrollHorizontally) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                uVar.H = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.View E = uVar.E();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                if (E != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(E, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    E.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(E, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (!canScrollHorizontally2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                uVar.I = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.View y17 = f84.u.y(uVar);
                if (y17 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(y17, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    y17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(y17, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mOnScrollListener$1");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mOnScrollListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        boolean canScrollHorizontally = recyclerView.canScrollHorizontally(1);
        boolean canScrollHorizontally2 = recyclerView.canScrollHorizontally(-1);
        f84.u uVar = this.f260199d;
        uVar.j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        if (canScrollHorizontally) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            boolean z17 = uVar.H;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                uVar.H = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.View E = uVar.E();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                if (E != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(E, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    E.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(E, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        if (canScrollHorizontally2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            boolean z18 = uVar.I;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            if (z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                uVar.I = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.View y17 = f84.u.y(uVar);
                if (y17 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(y17, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    y17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(y17, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mOnScrollListener$1");
    }
}
