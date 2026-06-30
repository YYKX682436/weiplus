package t84;

/* loaded from: classes4.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer f416450d;

    public f(com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer) {
        this.f416450d = gLViewContainer;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$4");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.f163576p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer = this.f416450d;
        boolean z17 = gLViewContainer.f163579f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        if (z17 && com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.b(gLViewContainer) != 0 && com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.c(gLViewContainer) != 0) {
            java.util.Iterator it = com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.a(gLViewContainer).iterator();
            while (it.hasNext()) {
                ((t84.a) it.next()).e(com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.b(gLViewContainer), com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.c(gLViewContainer));
            }
            gLViewContainer.g(com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.b(gLViewContainer), com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.c(gLViewContainer));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$4");
    }
}
