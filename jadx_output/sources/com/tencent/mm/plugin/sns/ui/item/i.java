package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class i implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.l f169341a;

    public i(com.tencent.mm.plugin.sns.ui.item.l lVar) {
        this.f169341a = lVar;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$3");
        com.tencent.mm.plugin.sns.ui.item.l lVar = this.f169341a;
        lVar.f169251h.f168039e.N(com.tencent.mm.plugin.sns.ui.item.l.F(lVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$3");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$3");
        return null;
    }
}
