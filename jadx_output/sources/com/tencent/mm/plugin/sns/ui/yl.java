package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class yl implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f171637a;

    public yl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f171637a = snsMsgUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreReset", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$8");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreReset", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$8");
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostReset", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$8");
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f171637a;
        com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.tencent.mm.plugin.sns.model.l4.Aj().f();
        com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).y();
        if (snsMsgUI.m7() || com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).getCount() != 0) {
            snsMsgUI.f167267d.setVisibility(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            android.view.View view = snsMsgUI.f167274n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$8", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$8", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            snsMsgUI.enableOptionMenu(true);
        } else {
            snsMsgUI.f167267d.setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            android.view.View view2 = snsMsgUI.f167274n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$8", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$8", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            snsMsgUI.enableOptionMenu(snsMsgUI.n7());
        }
        if (!snsMsgUI.m7() && ((com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).H() && com.tencent.mm.plugin.sns.model.l4.Aj().f() == 0) || com.tencent.mm.plugin.sns.model.l4.Aj().f() == com.tencent.mm.plugin.sns.model.l4.Aj().J0(false))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            android.view.View view3 = snsMsgUI.f167269f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$8", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$8", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostReset", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$8");
    }
}
