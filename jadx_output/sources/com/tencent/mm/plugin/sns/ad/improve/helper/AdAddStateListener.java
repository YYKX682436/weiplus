package com.tencent.mm.plugin.sns.ad.improve.helper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/improve/helper/AdAddStateListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsAdCommonEvent;", "Lu44/b;", "handler", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Lu44/b;Landroidx/lifecycle/y;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class AdAddStateListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdCommonEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f162727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdAddStateListener(u44.b handler, androidx.lifecycle.y lifecycleOwner) {
        super(lifecycleOwner);
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f162727d = new java.lang.ref.WeakReference(handler);
        this.__eventId = -1093521692;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.SnsAdCommonEvent snsAdCommonEvent) {
        r44.f c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
        com.tencent.mm.autogen.events.SnsAdCommonEvent event = snsAdCommonEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
        kotlin.jvm.internal.o.g(event, "event");
        u44.b bVar = (u44.b) this.f162727d.get();
        boolean z17 = false;
        if (bVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
        } else {
            com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = (com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic) bVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = commonShakeLogic.f163868r;
            long j17 = snsInfo != null ? snsInfo.field_snsId : -1L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
            am.wu wuVar = event.f54788g;
            if (j17 != wuVar.f8324a) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
            } else {
                int i17 = wuVar.f8325b;
                if (i17 == 1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdAdded", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mars.xlog.Log.i("CommonShakeLogic", "onAdAdded, hash=" + commonShakeLogic.hashCode());
                    commonShakeLogic.f163863m = true;
                    commonShakeLogic.f163864n = false;
                    commonShakeLogic.f163870t = false;
                    commonShakeLogic.f163871u = false;
                    commonShakeLogic.f163872v = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdAdded", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
                } else if (i17 != 2) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mars.xlog.Log.i("CommonShakeLogic", "onAdRemoved, hash=" + commonShakeLogic.hashCode());
                    if (commonShakeLogic.f163860g == 0 && (c17 = commonShakeLogic.c()) != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShakableAdRemoved", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
                        if (kotlin.jvm.internal.o.b(c17.f369566h, commonShakeLogic)) {
                            c17.f369566h = null;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShakableAdRemoved", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
                    }
                    commonShakeLogic.f163864n = true;
                    commonShakeLogic.b();
                    commonShakeLogic.a();
                    commonShakeLogic.f163870t = false;
                    commonShakeLogic.f163871u = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
                }
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
        return z17;
    }
}
