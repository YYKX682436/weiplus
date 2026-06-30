package oc4;

/* loaded from: classes4.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC f344352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f344352d = improveUnreadUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
        oc4.m mVar = new oc4.m(this.f344352d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
        oc4.m mVar = (oc4.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.lang.String str;
        java.lang.String str2;
        java.util.Iterator it;
        long j17;
        java.lang.String str3 = "invokeSuspend";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$saveUnreadInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC = this.f344352d;
        improveUnreadUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveUnreadInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadUIC", "saveUnreadInfo");
        com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList snsUnreadSaveList = new com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList(new java.util.ArrayList());
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        oc4.r R6 = improveUnreadUIC.R6();
        R6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpMaxInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpMaxInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        long j18 = currentTimeMillis - R6.f344359b;
        java.util.Iterator it6 = improveUnreadUIC.f169014g.entrySet().iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            arrayList = snsUnreadSaveList.f169027d;
            if (!hasNext) {
                str = str3;
                str2 = str4;
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
            java.lang.String str5 = (java.lang.String) entry.getKey();
            oc4.s sVar = (oc4.s) entry.getValue();
            xc4.p c17 = sVar.c();
            if (c17 != null) {
                it = it6;
                int createTime = c17.getCreateTime();
                str = str3;
                str2 = str4;
                j17 = createTime;
            } else {
                str = str3;
                str2 = str4;
                it = it6;
                j17 = 1 + j18;
            }
            if (j17 < j18) {
                break;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadUIC", "add valid feed:" + str5 + " indicator:" + sVar.b());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
            arrayList.add(new com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem(str5, sVar.a(), sVar.b()));
            it6 = it;
            str3 = str;
            str4 = str2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedMap size:");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadUIC", sb6.toString());
        improveUnreadUIC.f169012e.C("Key-Unread-Sns-Id", snsUnreadSaveList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveUnreadInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$saveUnreadInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        return f0Var;
    }
}
