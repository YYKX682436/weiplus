package zp1;

/* loaded from: classes12.dex */
public class b extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f474945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity f474946b;

    public b(com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity mMBatteryStatsActivity, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f474946b = mMBatteryStatsActivity;
        this.f474945a = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        int w17 = this.f474945a.w();
        int i17 = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.f93827m;
        this.f474946b.U6(w17);
    }
}
