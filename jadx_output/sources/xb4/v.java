package xb4;

/* loaded from: classes4.dex */
public class v extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final s74.p0 f452992c;

    /* renamed from: d, reason: collision with root package name */
    public final s74.o2 f452993d;

    /* renamed from: e, reason: collision with root package name */
    public final android.animation.AnimatorSet f452994e;

    public v(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f453000a = mMActivity;
        s74.p0 p0Var = (s74.p0) baseViewHolder;
        this.f452992c = p0Var;
        s74.o2 H = ((s74.z0) p0Var.f169283m0).H();
        this.f452993d = H;
        if (H == null) {
            return;
        }
        android.view.View I = H.I();
        java.util.List J2 = H.J();
        if (I == null || J2 == null) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new xb4.r(this, I));
        ofFloat.setDuration(400L);
        ofFloat.addListener(new xb4.s(this));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(new xb4.t(this, J2));
        ofFloat2.setDuration(100L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f452994e = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new xb4.u(this, I, J2));
    }

    public static /* synthetic */ s74.o2 b(xb4.v vVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        s74.o2 o2Var = vVar.f452993d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        return o2Var;
    }

    @Override // xb4.y
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        com.tencent.mars.xlog.Log.e("MicroMsg.AdDynamicCardClickAnimation", "error ! do not use this class!");
        ca4.q.a("MicroMsg.AdDynamicCardClickAnimation", "useOldAnimation", 8);
        android.animation.AnimatorSet animatorSet = this.f452994e;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
    }
}
