package g44;

/* loaded from: classes3.dex */
public final class z implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper f268845d;

    public z(com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper adOpenAppHalfScreenHelper) {
        this.f268845d = adOpenAppHalfScreenHelper;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.FrameLayout q17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$showBottomSheet$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/AdOpenAppHalfScreenHelper$showBottomSheet$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper adOpenAppHalfScreenHelper = this.f268845d;
        if (action == 0) {
            android.widget.FrameLayout q18 = com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper.q(adOpenAppHalfScreenHelper);
            if (q18 != null) {
                q18.setVisibility(0);
            }
        } else if ((action == 1 || action == 3) && (q17 = com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper.q(adOpenAppHalfScreenHelper)) != null) {
            q17.setVisibility(4);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/halfscreen/AdOpenAppHalfScreenHelper$showBottomSheet$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$showBottomSheet$2");
        return false;
    }
}
