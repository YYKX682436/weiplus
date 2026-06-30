package g44;

/* loaded from: classes3.dex */
public final class x implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper f268843d;

    public x(com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper adGalleryOpenAppHalfScreenHelper) {
        this.f268843d = adGalleryOpenAppHalfScreenHelper;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper$showBottomSheet$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/AdGalleryOpenAppHalfScreenHelper$showBottomSheet$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper adGalleryOpenAppHalfScreenHelper = this.f268843d;
        if (action == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMExpandClickAreaBottomBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            android.widget.FrameLayout frameLayout = adGalleryOpenAppHalfScreenHelper.f162670v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMExpandClickAreaBottomBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else if (action == 1 || action == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMExpandClickAreaBottomBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            android.widget.FrameLayout frameLayout2 = adGalleryOpenAppHalfScreenHelper.f162670v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMExpandClickAreaBottomBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(4);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/halfscreen/AdGalleryOpenAppHalfScreenHelper$showBottomSheet$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper$showBottomSheet$2");
        return false;
    }
}
