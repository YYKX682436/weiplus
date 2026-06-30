package oc4;

/* loaded from: classes4.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC f344354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f344354d = improveUnreadUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        oc4.o oVar = new oc4.o(this.f344354d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        oc4.o oVar = (oc4.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMmkv$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC = this.f344354d;
        com.tencent.mm.sdk.platformtools.o4 o4Var = improveUnreadUIC.f169012e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMmkv$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList snsUnreadSaveList = (com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList) o4Var.r("Key-Unread-Sns-Id", com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList.class);
        if (snsUnreadSaveList != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
            java.util.ArrayList<com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem> arrayList = snsUnreadSaveList.f169027d;
            if (arrayList != null) {
                for (com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem snsUnreadSaveItem : arrayList) {
                    oc4.x O6 = com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.O6(improveUnreadUIC);
                    snsUnreadSaveItem.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedId", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedId", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    boolean z17 = snsUnreadSaveItem.f169025e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    O6.put(snsUnreadSaveItem.f169024d, new oc4.s(z17, snsUnreadSaveItem.f169026f, null, 4, null));
                }
            }
        }
        if (!com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.O6(improveUnreadUIC).isEmpty()) {
            java.lang.Object firstKey = com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.O6(improveUnreadUIC).firstKey();
            kotlin.jvm.internal.o.f(firstKey, "firstKey(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setRptPageInFeedId$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            improveUnreadUIC.f169017m = (java.lang.String) firstKey;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setRptPageInFeedId$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadUIC", "unread restoreData:" + com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.O6(improveUnreadUIC).size());
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        return f0Var;
    }
}
