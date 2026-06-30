package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class yi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsHeader f171636d;

    public yi(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        this.f171636d = snsHeader;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsHeader$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f171636d;
        if (com.tencent.mm.plugin.sns.ui.SnsHeader.d(snsHeader) != null && com.tencent.mm.plugin.sns.ui.SnsHeader.e(snsHeader) != null) {
            if (com.tencent.mm.plugin.sns.ui.SnsHeader.d(snsHeader).field_isLike) {
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.f(5);
            } else {
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.f(3);
            }
            com.tencent.mm.plugin.sns.ui.SnsHeader.d(snsHeader).field_isLike = !com.tencent.mm.plugin.sns.ui.SnsHeader.d(snsHeader).field_isLike;
            com.tencent.mm.plugin.sns.ui.bj e17 = com.tencent.mm.plugin.sns.ui.SnsHeader.e(snsHeader);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            long j17 = snsHeader.f167169h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            ((com.tencent.mm.plugin.sns.ui.lt) e17).a(j17, com.tencent.mm.plugin.sns.ui.SnsHeader.d(snsHeader).field_isLike);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            snsHeader.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsHeader$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$7");
    }
}
