package u74;

/* loaded from: classes4.dex */
public class a implements com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u74.f f425129a;

    public a(u74.f fVar) {
        this.f425129a = fVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
        com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "online, onStart:" + i17);
        u74.f fVar = this.f425129a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).b(i17, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
        u74.f fVar = this.f425129a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).a(i17, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback
    public void onCompletion() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
        com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "online, onCompletion");
        u74.f fVar = this.f425129a;
        if (u74.f.a(fVar) != null) {
            u74.f.a(fVar).d(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
    }
}
