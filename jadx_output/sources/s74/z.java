package s74;

/* loaded from: classes4.dex */
public final class z implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w64.x f404612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404614c;

    public z(w64.x xVar, s74.o0 o0Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f404612a = xVar;
        this.f404613b = o0Var;
        this.f404614c = snsInfo;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.listener.i f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$11$adClickActionHandler$1");
        w64.x xVar = this.f404612a;
        if (xVar != null && (f17 = this.f404613b.C().f()) != null) {
            f17.U(xVar, this.f404614c.getAdXml().forbiddenCustomAnimation);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$11$adClickActionHandler$1");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$11$adClickActionHandler$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$11$adClickActionHandler$1");
        s74.f3 D = this.f404613b.D();
        android.view.ViewGroup o17 = D != null ? D.o() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$11$adClickActionHandler$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$11$adClickActionHandler$1");
        return o17;
    }
}
