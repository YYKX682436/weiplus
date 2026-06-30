package dd4;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView f229021d;

    public m(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        this.f229021d = flexibleLivePhotoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhoto$1$2");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = this.f229021d;
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.f(flexibleLivePhotoView).setVisibility(8);
        android.view.View a17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.a(flexibleLivePhotoView);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView$prepareLivePhoto$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView$prepareLivePhoto$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhoto$1$2");
    }
}
