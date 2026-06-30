package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fs implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bs f168358d;

    public fs(com.tencent.mm.plugin.sns.ui.bs bsVar) {
        this.f168358d = bsVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$5");
            return;
        }
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f168358d;
        bsVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (baseViewHolder == null || baseViewHolder.isAd) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        } else {
            java.util.HashMap hashMap = bsVar.f168051q;
            if (hashMap.containsKey(baseViewHolder.f169268f) && ((java.lang.Integer) hashMap.get(baseViewHolder.f169268f)).equals(0)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            } else if (hashMap.containsKey(baseViewHolder.f169268f) && ((java.lang.Integer) hashMap.get(baseViewHolder.f169268f)).equals(1)) {
                hashMap.put(baseViewHolder.f169268f, 2);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "descCollapListener onClick: SPREAD");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            } else {
                hashMap.put(baseViewHolder.f169268f, 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "descCollapListener onClick: SHRINK");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            }
        }
        bsVar.f168035a.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$5");
    }
}
