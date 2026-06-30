package t84;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer f416449d;

    public e(com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer) {
        this.f416449d = gLViewContainer;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$2");
        com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer = this.f416449d;
        java.util.Iterator it = com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.a(gLViewContainer).iterator();
        while (it.hasNext()) {
            t84.a aVar = (t84.a) it.next();
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            aVar.f416436q = false;
            aVar.f416432m = 0;
            aVar.f416426g = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        }
        com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.a(gLViewContainer).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$2");
    }
}
