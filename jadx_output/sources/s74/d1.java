package s74;

/* loaded from: classes4.dex */
public final class d1 implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w64.x f404242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404244c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w64.l f404245d;

    public d1(w64.x xVar, s74.o2 o2Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, w64.l lVar) {
        this.f404242a = xVar;
        this.f404243b = o2Var;
        this.f404244c = snsInfo;
        this.f404245d = lVar;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1$mAdClickActionHandler$1");
        w64.x xVar = this.f404242a;
        if (xVar != null) {
            com.tencent.mm.plugin.sns.ui.listener.i f17 = this.f404243b.C().f();
            if (f17 != null) {
                f17.U(xVar, this.f404244c.getAdXml().forbiddenCustomAnimation);
            }
        } else {
            w64.l lVar = this.f404245d;
            if (lVar != null) {
                lVar.a();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1$mAdClickActionHandler$1");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1$mAdClickActionHandler$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1$mAdClickActionHandler$1");
        s74.f3 D = this.f404243b.D();
        android.view.ViewGroup o17 = D != null ? D.o() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1$mAdClickActionHandler$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1$mAdClickActionHandler$1");
        return o17;
    }
}
