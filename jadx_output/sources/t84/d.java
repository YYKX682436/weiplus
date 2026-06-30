package t84;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t84.a f416447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer f416448e;

    public d(com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer, t84.a aVar) {
        this.f416448e = gLViewContainer;
        this.f416447d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$1");
        com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer = this.f416448e;
        java.util.ArrayList a17 = com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.a(gLViewContainer);
        t84.a aVar = this.f416447d;
        a17.add(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        boolean z17 = gLViewContainer.f163579f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            int i17 = gLViewContainer.f163580g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            aVar.d(gLViewContainer, i17);
            if (com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.b(gLViewContainer) != 0 && com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.c(gLViewContainer) != 0) {
                aVar.e(com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.b(gLViewContainer), com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer.c(gLViewContainer));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$1");
    }
}
