package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class jl implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f169521d;

    public jl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f169521d = snsMsgUI;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        int i18 = com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f169521d;
        boolean z17 = snsMsgUI.f167281u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (!z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onListViewScoll %s", java.lang.Integer.valueOf(i17));
        if (i17 == 2) {
            com.tencent.mm.hardcoder.WXHardCoderJNI wXHardCoderJNI = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance();
            boolean hcSNSMsgScrollEnable = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSMsgScrollEnable();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            int i19 = snsMsgUI.f167278r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            wXHardCoderJNI.stopPerformance(hcSNSMsgScrollEnable, i19);
            int startPerformance = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSMsgScrollEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSMsgScrollDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSMsgScrollCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSMsgScrollIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSMsgScrollThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSMsgScrollTimeout(), 705, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSMsgScrollAction(), "MicroMsg.SnsMsgUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            snsMsgUI.f167278r = startPerformance;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            int i27 = snsMsgUI.f167278r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "summer hardcoder sns startPerformance [%s]", java.lang.Integer.valueOf(i27));
        }
        if (absListView.getLastVisiblePosition() != absListView.getCount() - 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
            return;
        }
        if ((!snsMsgUI.C || snsMsgUI.B) && com.tencent.mm.plugin.sns.model.l4.Aj().f() > 0) {
            if (snsMsgUI.B) {
                com.tencent.mm.plugin.sns.model.l4.Aj().p1();
            }
            snsMsgUI.C = true;
            com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).t();
        } else {
            com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).t();
        }
        if (i17 == 0) {
            int count = absListView.getCount();
            com.tencent.mm.plugin.sns.ui.bm T6 = com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI);
            T6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            int i28 = T6.f167955p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            if (count < i28) {
                absListView.getCount();
                com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).onNotifyChange(null, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
    }
}
