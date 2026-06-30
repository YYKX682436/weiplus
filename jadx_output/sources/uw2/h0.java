package uw2;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final uw2.h0 f431674a = new uw2.h0();

    /* renamed from: b, reason: collision with root package name */
    public static android.animation.ValueAnimator f431675b;

    /* renamed from: c, reason: collision with root package name */
    public static yz5.a f431676c;

    public static void e(uw2.h0 h0Var, android.view.View view, long j17, long j18, float f17, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = 150;
        }
        if ((i17 & 4) != 0) {
            j18 = 150;
        }
        if ((i17 & 8) != 0) {
            f17 = view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        }
        if ((i17 & 16) != 0) {
            aVar = null;
        }
        h0Var.getClass();
        float f18 = -f17;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, f18);
        ofFloat.setDuration(j17);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "translationY", f18, 0.0f);
        ofFloat2.setDuration(j18);
        ofFloat2.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat2.addUpdateListener(new uw2.h(aVar));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public static android.animation.AnimatorSet f(uw2.h0 h0Var, android.view.View view, float f17, android.view.MotionEvent motionEvent, boolean z17, float f18, long j17, long j18, long j19, int i17, java.lang.Object obj) {
        float f19 = (i17 & 2) != 0 ? 1.0f : f17;
        android.view.MotionEvent motionEvent2 = (i17 & 4) != 0 ? null : motionEvent;
        boolean z18 = (i17 & 8) != 0 ? false : z17;
        float f27 = (i17 & 16) != 0 ? 0.0f : f18;
        long j27 = (i17 & 32) != 0 ? 500L : j17;
        long j28 = (i17 & 64) != 0 ? 300L : j18;
        long j29 = (i17 & 128) == 0 ? j19 : 300L;
        h0Var.getClass();
        kotlin.jvm.internal.o.g(view, "view");
        android.animation.Animator i18 = h0Var.i(view, f19, motionEvent2, f27, j27);
        android.animation.Animator k17 = h0Var.k(view, z18, j28, j29);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        uw2.o oVar = new uw2.o(z18, view);
        animatorSet.addListener(new uw2.k(oVar, oVar));
        animatorSet.playSequentially(i18, k17);
        return animatorSet;
    }

    public static android.animation.AnimatorSet g(uw2.h0 h0Var, android.view.View view, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = 500;
        }
        h0Var.getClass();
        kotlin.jvm.internal.o.g(view, "view");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j17);
        ofFloat.addUpdateListener(new uw2.l(view));
        ofFloat.addListener(new uw2.i(view));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setStartDelay(300L);
        ofFloat2.addUpdateListener(new uw2.m(view));
        ofFloat2.addListener(new uw2.j(view));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    public static /* synthetic */ android.animation.Animator j(uw2.h0 h0Var, android.view.View view, float f17, android.view.MotionEvent motionEvent, float f18, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            f17 = 1.0f;
        }
        float f19 = f17;
        if ((i17 & 4) != 0) {
            motionEvent = null;
        }
        android.view.MotionEvent motionEvent2 = motionEvent;
        if ((i17 & 8) != 0) {
            f18 = 0.0f;
        }
        float f27 = f18;
        if ((i17 & 16) != 0) {
            j17 = 500;
        }
        return h0Var.i(view, f19, motionEvent2, f27, j17);
    }

    public static /* synthetic */ android.animation.Animator l(uw2.h0 h0Var, android.view.View view, boolean z17, long j17, long j18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return h0Var.k(view, z17, (i17 & 4) != 0 ? 300L : j17, (i17 & 8) != 0 ? 300L : j18);
    }

    public static android.animation.Animator m(uw2.h0 h0Var, android.view.View view, android.view.MotionEvent motionEvent, float f17, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            motionEvent = null;
        }
        if ((i17 & 4) != 0) {
            f17 = 0.0f;
        }
        if ((i17 & 8) != 0) {
            j17 = 500;
        }
        h0Var.getClass();
        kotlin.jvm.internal.o.g(view, "view");
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("alpha", 0.7f, 0.5f, 0.8f, 1.0f));
        ofPropertyValuesHolder.setDuration(j17).addUpdateListener(new uw2.w(view));
        ofPropertyValuesHolder.addListener(new uw2.v(view, motionEvent, f17));
        return ofPropertyValuesHolder;
    }

    public static void o(uw2.h0 h0Var, android.view.View view, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = 500;
        }
        h0Var.getClass();
        kotlin.jvm.internal.o.g(view, "view");
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("scale", 1.0f, 1.05f, 1.0f, 0.95f, 1.0f));
        ofPropertyValuesHolder.setDuration(j17).addUpdateListener(new uw2.d0(view));
        ofPropertyValuesHolder.start();
    }

    public static void p(uw2.h0 h0Var, android.view.View view, float f17, android.view.MotionEvent motionEvent, boolean z17, float f18, long j17, int i17, java.lang.Object obj) {
        float f19 = (i17 & 2) != 0 ? 1.0f : f17;
        android.view.MotionEvent motionEvent2 = (i17 & 4) != 0 ? null : motionEvent;
        boolean z18 = (i17 & 8) != 0 ? false : z17;
        float f27 = (i17 & 16) != 0 ? 0.0f : f18;
        long j18 = (i17 & 32) != 0 ? 500L : j17;
        h0Var.getClass();
        kotlin.jvm.internal.o.g(view, "view");
        if (view.getVisibility() == 0) {
            return;
        }
        view.post(new uw2.g0(view, f19, motionEvent2, z18, f27, j18));
    }

    public final void a(android.view.View view, java.lang.String str, float f17, float f18, android.animation.Animator.AnimatorListener animatorListener) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, str, f17, f18);
        ofFloat.setDuration(250L);
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        } else {
            ofFloat.addListener(new uw2.b(view));
        }
        ofFloat.start();
    }

    public final void b(android.view.View view, long j17, long j18) {
        float f17 = -view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, f17);
        ofFloat.setDuration(j17);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "translationX", f17, 0.0f);
        ofFloat2.setDuration(j18);
        ofFloat2.setInterpolator(new android.view.animation.AccelerateInterpolator());
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "rotation", 0.0f, -5.0f);
        ofFloat3.setDuration(j17);
        ofFloat3.setInterpolator(new android.view.animation.DecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "rotation", -5.0f, 0.0f);
        ofFloat4.setDuration(j18);
        ofFloat4.setInterpolator(new android.view.animation.AccelerateInterpolator());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playSequentially(ofFloat3, ofFloat4);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.playTogether(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    public final void d(android.view.View view) {
        view.getGlobalVisibleRect(new android.graphics.Rect());
        android.graphics.Path path = new android.graphics.Path();
        float f17 = -view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        path.moveTo(f17, 0.0f);
        path.quadTo(view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479644bj) + f17, 0.0f - view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl), f17 + view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl), 0.0f);
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new uw2.f(pathMeasure, new float[2], view));
        ofFloat.addListener(new uw2.g(view));
        ofFloat.start();
    }

    public final int h() {
        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIKE_ANIMATION_SVR_DISABLE_BOOLEAN_SYNC, false)) {
            return 0;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.T7).getValue()).r()).intValue();
    }

    public final android.animation.Animator i(android.view.View view, float f17, android.view.MotionEvent motionEvent, float f18, long j17) {
        kotlin.jvm.internal.o.g(view, "view");
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("scale", 0.5f * f17, 1.75f * f17, 1.25f * f17, f17 * 1.5f), android.animation.PropertyValuesHolder.ofFloat("alpha", 0.7f, 0.5f, 0.8f, 1.0f));
        ofPropertyValuesHolder.setDuration(j17).addUpdateListener(new uw2.q(view));
        ofPropertyValuesHolder.addListener(new uw2.p(view, motionEvent, f18));
        return ofPropertyValuesHolder;
    }

    public final android.animation.Animator k(android.view.View view, boolean z17, long j17, long j18) {
        kotlin.jvm.internal.o.g(view, "view");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new uw2.s(view));
        ofFloat.setStartDelay(j17);
        ofFloat.setDuration(j18);
        ofFloat.addListener(new uw2.r(view, z17, z17, view));
        return ofFloat;
    }

    public final void n(com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, android.widget.ImageView imageView) {
        imageView.setImageDrawable(null);
        boolean b17 = kotlin.jvm.internal.o.b(finderCommentInfo.getUsername(), c01.z1.r());
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (!b17) {
            g1Var.i().c(new mn2.n(finderCommentInfo.getHeadUrl(), null, 2, null), imageView, g1Var.h(mn2.f1.f329960n));
            return;
        }
        g1Var.i().c(new mn2.n("", null, 2, null), imageView, g1Var.h(mn2.f1.f329960n));
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.s2().r()).intValue() == 1) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, c01.z1.r(), null);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, c01.z1.r(), 0.0f);
        }
    }

    public final void q(in5.s0 s0Var) {
        java.lang.Object systemService = s0Var.f293121e.getSystemService("vibrator");
        if (systemService instanceof android.os.Vibrator) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                ((android.os.Vibrator) systemService).vibrate(android.os.VibrationEffect.createOneShot(10L, 255));
            } else {
                ((android.os.Vibrator) systemService).vibrate(10L);
            }
        }
    }
}
