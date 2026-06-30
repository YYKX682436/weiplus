package l44;

/* loaded from: classes4.dex */
public class d5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f316087a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f316088b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.AnimatorSet f316089c;

    /* renamed from: d, reason: collision with root package name */
    public android.animation.AnimatorSet f316090d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f316091e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f316092f = false;

    public d5(android.view.View view, java.lang.Object obj, android.content.Context context, boolean z17, int i17, int i18) {
        int i19;
        java.lang.Object obj2;
        android.animation.ObjectAnimator ofFloat;
        this.f316087a = view;
        this.f316088b = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(0L);
        android.animation.ObjectAnimator ofFloat3 = z17 ? android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", -180.0f, 10.0f) : android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 180.0f, -10.0f);
        long j17 = i17;
        ofFloat3.setDuration(j17);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "alpha", 0.0f, 1.0f);
        ofFloat4.setDuration(0L);
        long j18 = i17 / 2;
        ofFloat4.setStartDelay(j18);
        android.animation.ObjectAnimator ofFloat5 = z17 ? android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 10.0f, 0.0f) : android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", -10.0f, 0.0f);
        ofFloat5.setDuration(j17);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).with(ofFloat4);
        animatorSet.play(ofFloat5).after(ofFloat3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        this.f316089c = animatorSet;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        if (z17) {
            i19 = 2;
            obj2 = null;
            ofFloat = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 0.0f, 190.0f);
        } else {
            i19 = 2;
            obj2 = null;
            ofFloat = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 0.0f, -190.0f);
        }
        ofFloat.setDuration(j17);
        float[] fArr = new float[i19];
        // fill-array-data instruction
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(obj2, "alpha", fArr);
        ofFloat6.setDuration(0L);
        ofFloat6.setStartDelay(j18);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.play(ofFloat).with(ofFloat6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        this.f316090d = animatorSet2;
        this.f316089c.addListener(new l44.b5(this));
        this.f316090d.addListener(new l44.c5(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        float f17 = view.getContext().getResources().getDisplayMetrics().density * i18;
        view.setCameraDistance(f17);
        if (obj instanceof android.view.View) {
            ((android.view.View) obj).setCameraDistance(f17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        if (!this.f316092f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("flipCard", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
            boolean z17 = this.f316091e;
            android.view.View view = this.f316087a;
            java.lang.Object obj = this.f316088b;
            if (z17) {
                this.f316089c.setTarget(obj);
                this.f316090d.setTarget(view);
                this.f316089c.start();
                this.f316090d.start();
                this.f316091e = false;
            } else {
                this.f316089c.setTarget(view);
                this.f316090d.setTarget(obj);
                this.f316089c.start();
                this.f316090d.start();
                this.f316091e = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("flipCard", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
    }
}
