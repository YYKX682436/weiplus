package zp1;

/* loaded from: classes12.dex */
public class c extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f474947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity f474948e;

    public c(com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity mMBatteryStatsActivity, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f474948e = mMBatteryStatsActivity;
        this.f474947d = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f474947d;
        int w17 = linearLayoutManager.w();
        int i19 = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.f93827m;
        com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity mMBatteryStatsActivity = this.f474948e;
        mMBatteryStatsActivity.U6(w17);
        if (linearLayoutManager.y() == ((java.util.ArrayList) mMBatteryStatsActivity.f93828d.f436825a.f436819d).size() - 1) {
            zp1.e eVar = mMBatteryStatsActivity.f93828d;
            if (java.lang.Math.abs(eVar.f436828d) >= eVar.f436826b) {
                z17 = false;
            } else {
                int i27 = eVar.f436828d - 1;
                eVar.f436828d = i27;
                ph.a.b(com.tencent.matrix.batterycanary.stats.k.class, new vh.u(eVar, i27));
                z17 = true;
            }
            if (!z17 && !mMBatteryStatsActivity.f93833i) {
                mMBatteryStatsActivity.f93833i = true;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
