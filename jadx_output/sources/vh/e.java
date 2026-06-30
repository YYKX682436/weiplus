package vh;

/* loaded from: classes12.dex */
public class e extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f436784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity f436785e;

    public e(com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity batteryStatsActivity, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f436785e = batteryStatsActivity;
        this.f436784d = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        boolean z17;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f436784d;
        int w17 = linearLayoutManager.w();
        com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity batteryStatsActivity = this.f436785e;
        com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity.O6(batteryStatsActivity, w17);
        if (linearLayoutManager.y() == ((java.util.ArrayList) batteryStatsActivity.f52622d.f436825a.f436819d).size() - 1) {
            vh.y yVar = batteryStatsActivity.f52622d;
            if (java.lang.Math.abs(yVar.f436828d) >= yVar.f436826b) {
                z17 = false;
            } else {
                int i19 = yVar.f436828d - 1;
                yVar.f436828d = i19;
                ph.a.b(com.tencent.matrix.batterycanary.stats.k.class, new vh.u(yVar, i19));
                z17 = true;
            }
            if (z17 || batteryStatsActivity.f52624f) {
                return;
            }
            batteryStatsActivity.f52624f = true;
        }
    }
}
