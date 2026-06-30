package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public final class b7 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithSeekbarAnimation f191530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f191531e;

    public b7(com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithSeekbarAnimation redesignVideoPlayerSeekBarWithSeekbarAnimation, float f17) {
        this.f191530d = redesignVideoPlayerSeekBarWithSeekbarAnimation;
        this.f191531e = f17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithSeekbarAnimation$init$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        float f17 = this.f191531e;
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithSeekbarAnimation redesignVideoPlayerSeekBarWithSeekbarAnimation = this.f191530d;
        if (action == 0) {
            android.widget.TextView speedRatioTextView = redesignVideoPlayerSeekBarWithSeekbarAnimation.getSpeedRatioTextView();
            speedRatioTextView.setTextColor(redesignVideoPlayerSeekBarWithSeekbarAnimation.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
            speedRatioTextView.setTextSize(0, f17 * 0.9f);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            redesignVideoPlayerSeekBarWithSeekbarAnimation.getSpeedRatioTextView().setTextSize(0, f17);
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithSeekbarAnimation$init$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
