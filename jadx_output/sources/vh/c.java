package vh;

/* loaded from: classes12.dex */
public class c implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f436780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity f436781b;

    public c(com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity batteryStatsActivity, android.widget.TextView textView) {
        this.f436781b = batteryStatsActivity;
        this.f436780a = textView;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        this.f436780a.setOnClickListener(new vh.b(this, (com.tencent.matrix.batterycanary.stats.k) obj));
    }
}
