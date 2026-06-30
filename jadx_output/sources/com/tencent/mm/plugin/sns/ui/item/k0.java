package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f169368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f169369e;

    public k0(com.tencent.mm.plugin.sns.ui.item.m0 m0Var, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        this.f169368d = baseViewHolder;
        this.f169369e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.PhotosContent photosContent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f169368d;
        if (baseViewHolder.isAd && (photosContent = baseViewHolder.T) != null && photosContent.g(0) != null && this.f169369e == 2) {
            com.tencent.mars.xlog.Log.i("MiroMsg.PhotoTimeLineItem", "on ad content click");
            baseViewHolder.T.g(0).performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$3");
    }
}
