package r84;

/* loaded from: classes4.dex */
public final class a extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView f393319d;

    public a(com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView adBulletScreenRecyclerView) {
        this.f393319d = adBulletScreenRecyclerView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView$init$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/danmuview/AdBulletScreenRecyclerView$init$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/danmuview/AdBulletScreenRecyclerView$init$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView$init$1");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView$init$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/danmuview/AdBulletScreenRecyclerView$init$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int i19 = com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView.f163541d2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCurrentScrollX$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView adBulletScreenRecyclerView = this.f393319d;
        int i27 = adBulletScreenRecyclerView.f163543c2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCurrentScrollX$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMCurrentScrollX$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        adBulletScreenRecyclerView.f163543c2 = i27 + i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMCurrentScrollX$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCurrentScrollY$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        int i28 = adBulletScreenRecyclerView.f163542b2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCurrentScrollY$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMCurrentScrollY$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        adBulletScreenRecyclerView.f163542b2 = i28 + i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMCurrentScrollY$p", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/danmuview/AdBulletScreenRecyclerView$init$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView$init$1");
    }
}
