package dc4;

/* loaded from: classes4.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.u f228812d;

    public r(dc4.u uVar) {
        this.f228812d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$2");
        dc4.u uVar = this.f228812d;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = uVar.f228832e;
        if (snsInfo != null && snsInfo.isAdForbidAutoPlay()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdNormalSightDetailItem", "forbidAutoPlay");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
            uVar.o();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$2");
            return;
        }
        if (dc4.u.l(uVar).w() || dc4.u.l(uVar).f0()) {
            dc4.u.l(uVar).K();
        } else {
            l44.b3.f316041a.h(uVar.f228832e);
            dc4.u.l(uVar).C();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$2");
    }
}
