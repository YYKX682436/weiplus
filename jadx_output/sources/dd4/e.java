package dd4;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView f228989d;

    public e(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        this.f228989d = flexibleLivePhotoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f228989d.n();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$1");
    }
}
