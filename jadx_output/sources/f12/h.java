package f12;

/* loaded from: classes4.dex */
public final class h implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258608d;

    public h(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        this.f258608d = springLuckyEggActivity;
    }

    @Override // androidx.lifecycle.k0
    public final void onChanged(java.lang.Object obj) {
        boolean b17 = kotlin.jvm.internal.o.b((java.lang.Boolean) obj, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258608d;
        if (b17) {
            f12.c0 c0Var = springLuckyEggActivity.f97440f;
            if (c0Var == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            c0Var.f258583l.setVisibility(4);
            f12.c0 c0Var2 = springLuckyEggActivity.f97440f;
            if (c0Var2 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            c0Var2.f258573b.x();
            f12.c0 c0Var3 = springLuckyEggActivity.f97440f;
            if (c0Var3 != null) {
                c0Var3.f258573b.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
        }
        long j17 = springLuckyEggActivity.f97442h;
        springLuckyEggActivity.getClass();
        android.animation.PropertyValuesHolder ofKeyframe = android.animation.PropertyValuesHolder.ofKeyframe(android.view.View.ROTATION_X, android.animation.Keyframe.ofFloat(0.0f, 90.0f), android.animation.Keyframe.ofFloat(1.0f, 0.0f));
        android.animation.Keyframe ofFloat = android.animation.Keyframe.ofFloat(0.0f, 0.0f);
        android.animation.Keyframe ofFloat2 = android.animation.Keyframe.ofFloat(1.0f, 1.0f);
        android.animation.PropertyValuesHolder ofKeyframe2 = android.animation.PropertyValuesHolder.ofKeyframe(android.view.View.SCALE_X, ofFloat, ofFloat2);
        android.animation.PropertyValuesHolder ofKeyframe3 = android.animation.PropertyValuesHolder.ofKeyframe(android.view.View.SCALE_Y, ofFloat, ofFloat2);
        android.animation.PropertyValuesHolder ofKeyframe4 = android.animation.PropertyValuesHolder.ofKeyframe(android.view.View.ALPHA, android.animation.Keyframe.ofFloat(0.0f, 0.0f), android.animation.Keyframe.ofFloat(1.0f, 1.0f));
        android.animation.PropertyValuesHolder ofKeyframe5 = android.animation.PropertyValuesHolder.ofKeyframe(android.view.View.Y, android.animation.Keyframe.ofFloat(0.0f, -50.0f), android.animation.Keyframe.ofFloat(0.5f, -610.0f), android.animation.Keyframe.ofFloat(1.0f, 0.0f));
        f12.c0 c0Var4 = springLuckyEggActivity.f97440f;
        if (c0Var4 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        android.animation.ObjectAnimator ofPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(c0Var4.f258583l, ofKeyframe, ofKeyframe2, ofKeyframe3, ofKeyframe4, ofKeyframe5);
        kotlin.jvm.internal.o.f(ofPropertyValuesHolder, "ofPropertyValuesHolder(...)");
        ofPropertyValuesHolder.setInterpolator(new android.view.animation.LinearInterpolator());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if (currentTimeMillis < 2000) {
            ofPropertyValuesHolder.setStartDelay(2000 - currentTimeMillis);
            com.tencent.mars.xlog.Log.w("MicroMsg.SpringLuckyEggActivity", "animator start delay " + ofPropertyValuesHolder.getStartDelay());
        }
        ofPropertyValuesHolder.setDuration(550L);
        ofPropertyValuesHolder.addListener(new f12.e(springLuckyEggActivity, j17));
        ofPropertyValuesHolder.start();
    }
}
