package l44;

/* loaded from: classes4.dex */
public class s5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f316346a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f316347b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.AnimatorSet f316348c;

    /* renamed from: d, reason: collision with root package name */
    public android.animation.AnimatorSet f316349d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f316350e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f316351f = false;

    /* renamed from: g, reason: collision with root package name */
    public l44.r5 f316352g;

    public s5(android.view.View view, java.lang.Object obj, android.content.Context context, boolean z17, int i17, int i18) {
        int i19;
        java.lang.Object obj2;
        android.animation.ObjectAnimator ofFloat;
        this.f316346a = view;
        this.f316347b = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(0L);
        android.animation.ObjectAnimator ofFloat3 = z17 ? android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", -180.0f, 0.0f) : android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 180.0f, 0.0f);
        long j17 = i17;
        ofFloat3.setDuration(j17);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "alpha", 0.0f, 1.0f);
        ofFloat4.setDuration(0L);
        long j18 = i17 / 2;
        ofFloat4.setStartDelay(j18);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).with(ofFloat4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        this.f316348c = animatorSet;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        if (z17) {
            i19 = 2;
            obj2 = null;
            ofFloat = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 0.0f, 180.0f);
        } else {
            i19 = 2;
            obj2 = null;
            ofFloat = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "rotationY", 0.0f, -180.0f);
        }
        ofFloat.setDuration(j17);
        float[] fArr = new float[i19];
        // fill-array-data instruction
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(obj2, "alpha", fArr);
        ofFloat5.setDuration(0L);
        ofFloat5.setStartDelay(j18);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.play(ofFloat).with(ofFloat5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        this.f316349d = animatorSet2;
        this.f316348c.addListener(new l44.p5(this));
        this.f316349d.addListener(new l44.q5(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        float f17 = view.getContext().getResources().getDisplayMetrics().density * i18;
        view.setCameraDistance(f17);
        if (obj instanceof android.view.View) {
            ((android.view.View) obj).setCameraDistance(f17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
    }

    public static /* synthetic */ l44.r5 a(l44.s5 s5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        l44.r5 r5Var = s5Var.f316352g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        return r5Var;
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        if (!this.f316351f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("flipCard", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
            boolean z17 = this.f316350e;
            android.view.View view = this.f316346a;
            java.lang.Object obj = this.f316347b;
            if (z17) {
                this.f316348c.setTarget(obj);
                this.f316349d.setTarget(view);
                this.f316348c.start();
                this.f316349d.start();
                this.f316350e = false;
            } else {
                this.f316348c.setTarget(view);
                this.f316349d.setTarget(obj);
                this.f316348c.start();
                this.f316349d.start();
                this.f316350e = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("flipCard", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
    }
}
