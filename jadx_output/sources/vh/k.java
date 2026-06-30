package vh;

/* loaded from: classes12.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh.m f436791d;

    public k(vh.m mVar) {
        this.f436791d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        vh.m mVar = this.f436791d;
        vh.h hVar = mVar.f436818d;
        ((com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventDumpItem) hVar).f52627q = !((com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventDumpItem) hVar).f52627q;
        mVar.j((com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventDumpItem) hVar);
    }
}
