package xb4;

/* loaded from: classes4.dex */
public final class l extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f452958c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f452959d;

    public l(com.tencent.mm.ui.MMActivity mMActivity, w64.x jumpAnimInfo) {
        kotlin.jvm.internal.o.g(jumpAnimInfo, "jumpAnimInfo");
        this.f453000a = mMActivity;
        android.view.View c17 = jumpAnimInfo.c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List e17 = jumpAnimInfo.e();
        java.util.List list = kz5.p0.f313996d;
        arrayList.addAll(e17 == null ? list : e17);
        java.util.List j17 = jumpAnimInfo.j();
        arrayList.addAll(j17 != null ? j17 : list);
        if (c17 == null) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new xb4.g(c17));
        ofFloat.setDuration(400L);
        ofFloat.addListener(new xb4.h(this, jumpAnimInfo));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(new xb4.i(arrayList));
        ofFloat2.setDuration(100L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f452958c = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new xb4.j(this, c17, arrayList, jumpAnimInfo));
    }

    @Override // xb4.y
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        boolean z17 = false;
        android.animation.AnimatorSet animatorSet = this.f452958c;
        if (animatorSet != null && animatorSet.isStarted()) {
            z17 = true;
        }
        if (!z17) {
            if (animatorSet != null) {
                animatorSet.setStartDelay(j17);
            }
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
    }
}
