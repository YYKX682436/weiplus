package u74;

/* loaded from: classes4.dex */
public class b implements com.tencent.mm.plugin.sns.ui.g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u74.f f425130a;

    public b(u74.f fVar) {
        this.f425130a = fVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.g7
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "offline, onStart:" + i17);
        u74.f fVar = this.f425130a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).b(i17, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.g7
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        u74.f fVar = this.f425130a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).a(i17, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.g7
    public boolean d(com.tencent.mm.pointers.PString pString, com.tencent.mm.pointers.PString pString2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "offline, downloadVideo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.g7
    public void onCompletion() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "offline, onCompletion");
        u74.f fVar = this.f425130a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).d(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
    }
}
