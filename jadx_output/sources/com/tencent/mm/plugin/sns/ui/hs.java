package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class hs implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bs f168532d;

    public hs(com.tencent.mm.plugin.sns.ui.bs bsVar) {
        this.f168532d = bsVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f168532d;
        if (!bsVar.f168046l || bsVar.f168045k <= 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$7");
            return;
        }
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$7");
            return;
        }
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
        if (baseViewHolder == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$7");
            return;
        }
        if (bsVar.f168052r.containsKey(baseViewHolder.f169268f) && (((java.lang.Integer) bsVar.f168052r.get(baseViewHolder.f169268f)).equals(1) || ((java.lang.Integer) bsVar.f168052r.get(baseViewHolder.f169268f)).equals(3))) {
            bsVar.f168052r.put(baseViewHolder.f169268f, 2);
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.m(ca4.z0.t0(baseViewHolder.f169266e), true);
        } else {
            bsVar.f168052r.put(baseViewHolder.f169268f, 1);
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.m(ca4.z0.t0(baseViewHolder.f169266e), false);
        }
        bsVar.f168035a.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$7");
    }
}
