package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class in implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity f169241d;

    public in(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f169241d = snsOnlineVideoActivity;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = this.f169241d;
        if (com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.U6(snsOnlineVideoActivity) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "videoViewContainer onLongClick -> snsInfo is null");
            yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$10");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2602", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity.f167329v = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2602", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        wd4.l1 l1Var = new wd4.l1(snsOnlineVideoActivity, 4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2702", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity.f167328u = l1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2702", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        wd4.l1 V6 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.V6(snsOnlineVideoActivity);
        com.tencent.mm.plugin.sns.storage.SnsInfo U6 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.U6(snsOnlineVideoActivity);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        r45.jj4 jj4Var = snsOnlineVideoActivity.f167320o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        V6.b(U6, jj4Var);
        wd4.l1 V62 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.V6(snsOnlineVideoActivity);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.util.List h76 = snsOnlineVideoActivity.h7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.util.List i76 = snsOnlineVideoActivity.i7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        V62.n(h76, i76, null);
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.V6(snsOnlineVideoActivity).l(snsOnlineVideoActivity.B1);
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.V6(snsOnlineVideoActivity).k(new com.tencent.mm.plugin.sns.ui.hn(this));
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.V6(snsOnlineVideoActivity).m();
        wd4.c3.a(snsOnlineVideoActivity);
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$10");
        return true;
    }
}
