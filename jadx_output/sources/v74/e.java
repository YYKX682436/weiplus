package v74;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final v74.e f433775d = new v74.e();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$mOnTitleClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter$mOnTitleClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("AdLookbookLogic", "title onClick");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter$mOnTitleClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$mOnTitleClickListener$1");
    }
}
