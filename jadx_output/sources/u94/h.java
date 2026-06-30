package u94;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u94.i f425864d;

    public h(u94.i iVar) {
        this.f425864d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$2$1");
        u94.i iVar = this.f425864d;
        if (iVar.f425865d.i()) {
            com.tencent.mars.xlog.Log.i("HalfSubscribeController", "mmBottomSheet tryHide due to closeIv click");
            iVar.f425865d.u();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$2$1");
    }
}
