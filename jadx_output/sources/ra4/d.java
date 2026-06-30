package ra4;

/* loaded from: classes4.dex */
public class d implements com.tencent.mm.plugin.sns.model.g1, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f393553d;

    static {
        java.util.regex.Pattern.compile("\\{richtext:([\\s\\S]*?)\\}");
        java.util.regex.Pattern.compile("\\{sex:([\\s\\S]*?):([\\s\\S]*?):([\\s\\S]*?)\\}");
    }

    public d() {
        new java.util.HashMap();
        new java.util.HashSet();
        new java.util.HashSet();
        this.f393553d = new java.util.HashMap();
    }

    @Override // com.tencent.mm.plugin.sns.model.g1
    public void a(int i17, java.lang.String str, long j17, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        java.util.HashMap hashMap = this.f393553d;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            ra4.c cVar = (ra4.c) hashMap.get(java.lang.Long.valueOf(j17));
            if (cVar.f393552a == -1) {
                cVar.f393552a = java.lang.System.currentTimeMillis();
            }
            cVar.getClass();
            cVar.getClass();
            cVar.a(0, 0, 0, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }

    @Override // com.tencent.mm.plugin.sns.model.g1
    public void b(int i17, java.lang.String str, long j17, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, boolean z17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }

    public final void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissAbTestView", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        if (baseViewHolder == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissAbTestView", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
            return;
        }
        android.view.ViewStub viewStub = baseViewHolder.f169259a0;
        if (viewStub != null) {
            viewStub.setVisibility(8);
        }
        android.view.ViewStub viewStub2 = baseViewHolder.f169261b0;
        if (viewStub2 != null) {
            viewStub2.setVisibility(8);
        }
        if (baseViewHolder.f169277j0.getVisibility() == 8) {
            android.view.View view = baseViewHolder.f169277j0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (baseViewHolder.f169274i.getVisibility() == 8) {
            baseViewHolder.f169274i.setVisibility(0);
        }
        if (baseViewHolder.f169272h.getVisibility() == 8) {
            android.view.View view2 = baseViewHolder.f169272h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissAbTestView", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnSABTestMgr", "onSceneend " + i17 + " errCode " + i18);
        new com.tencent.mm.autogen.events.NotifyTimelineFpEvent().e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }
}
