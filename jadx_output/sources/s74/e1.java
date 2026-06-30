package s74;

/* loaded from: classes4.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w64.l f404254f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(s74.o2 o2Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, w64.l lVar) {
        super(1);
        this.f404252d = o2Var;
        this.f404253e = snsInfo;
        this.f404254f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1");
        android.view.View v17 = (android.view.View) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1");
        kotlin.jvm.internal.o.g(v17, "v");
        int i17 = w64.x.f443338a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
        java.lang.Object tag = v17.getTag(com.tencent.mm.R.id.ptl);
        w64.x xVar = tag instanceof w64.x ? (w64.x) tag : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
        s74.o2 o2Var = this.f404252d;
        android.content.Context E = o2Var.E();
        int H = o2Var.H();
        i64.b1 G = o2Var.G();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMClickStateChangeListener", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        w64.k kVar = o2Var.f404465J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMClickStateChangeListener", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404253e;
        w64.n nVar = new w64.n(E, H, G, kVar, new s74.d1(xVar, o2Var, snsInfo, this.f404254f));
        com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U = o2Var.U();
        if (U != null && (adClickActionInfo = U.clickActionInfo) != null) {
            nVar.n(adClickActionInfo, snsInfo);
        }
        nVar.x(xVar);
        nVar.k(v17);
        try {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
            kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
            if ((com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(snsInfo) && timeLine.ContentObj.f369837e == 15) || timeLine.ContentObj.f369837e == 5) {
                com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent();
                snsAdLivingStreamJumpEvent.f54794g.f6405a = ca4.z0.T(snsInfo);
                snsAdLivingStreamJumpEvent.e();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1");
        return f0Var;
    }
}
