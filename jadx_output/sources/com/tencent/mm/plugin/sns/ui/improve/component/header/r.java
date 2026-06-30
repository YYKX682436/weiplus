package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168865d;

    public r(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC) {
        this.f168865d = improveHeaderUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadAvatar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (z65.c.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_TRIGGER_CRASH_INT_SYNC, 0);
            if (r17 == 1) {
                java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("trigger sns crash");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2$1");
                throw illegalArgumentException;
            }
            if (r17 == 2) {
                java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("trigger Pag crash:org.libpag.PAGView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2$1");
                throw illegalArgumentException2;
            }
        }
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$jumpToSelfPage(this.f168865d);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadAvatar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2$1");
    }
}
