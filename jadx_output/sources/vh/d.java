package vh;

/* loaded from: classes12.dex */
public class d extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f436782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity f436783b;

    public d(com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity batteryStatsActivity, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f436783b = batteryStatsActivity;
        this.f436782a = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity.O6(this.f436783b, this.f436782a.w());
    }
}
