package p44;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p44.z f351860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsAdEggCanvasEvent f351861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p44.z zVar, com.tencent.mm.autogen.events.SnsAdEggCanvasEvent snsAdEggCanvasEvent) {
        super(0);
        this.f351860d = zVar;
        this.f351861e = snsAdEggCanvasEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1$callback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1$callback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$handleEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        p44.z zVar = this.f351860d;
        zVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.tencent.mm.autogen.events.SnsAdEggCanvasEvent snsAdEggCanvasEvent = this.f351861e;
        int i17 = snsAdEggCanvasEvent.f54789g.f8401a;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = zVar.f351866e;
        java.lang.String str = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null) ? null : adXml.eggCanvasPageId;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEvent, eventType=");
        sb6.append(i17);
        sb6.append(", event.pageId=");
        am.xu xuVar = snsAdEggCanvasEvent.f54789g;
        sb6.append(xuVar.f8402b);
        sb6.append(", adPageId=");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("TimelineRandomPickLayoutCtrl", sb6.toString());
        if (zVar.f351868g == null) {
            com.tencent.mars.xlog.Log.e("TimelineRandomPickLayoutCtrl", "onEvent RandomPickCardAdInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        } else {
            if (kotlin.jvm.internal.o.b(str, xuVar.f8402b)) {
                p44.o0 o0Var = zVar.f351873l;
                if (i17 == 1) {
                    o0Var.l();
                    o0Var.m();
                    zVar.f351869h = true;
                } else if (i17 == 2) {
                    o0Var.i();
                    o0Var.d();
                    o0Var.l();
                    zVar.f351869h = true;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$handleEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1$callback$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1$callback$1");
        return f0Var;
    }
}
