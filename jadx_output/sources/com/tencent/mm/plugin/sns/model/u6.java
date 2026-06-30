package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f164709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.w6 f164710e;

    public u6(com.tencent.mm.plugin.sns.model.w6 w6Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3) {
        this.f164710e = w6Var;
        this.f164709d = linkedList2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$3");
        com.tencent.mm.plugin.sns.model.w6 w6Var = this.f164710e;
        w6Var.getClass();
        w6Var.f164740b = null;
        w6Var.f164739a.f444288e = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        w6Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFinderTier", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (w6Var.f164740b != null) {
            rc4.e eVar = rc4.e.f394136a;
            eVar.e("1:优先级低于未读跳转曝光");
            eVar.a(1);
        } else {
            rc4.e.f394136a.h(this.f164709d, w6Var.f164741c);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderTier", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$3");
    }
}
