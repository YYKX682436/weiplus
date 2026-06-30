package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public class f0 implements android.animation.Animator.AnimatorListener, android.animation.ValueAnimator.AnimatorUpdateListener, android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f163710d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f163711e;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f163713g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.g0 f163714h;

    /* renamed from: i, reason: collision with root package name */
    public int f163715i = 0;

    /* renamed from: m, reason: collision with root package name */
    public float f163716m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public int f163717n = 1;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f163712f = new android.os.Handler(android.os.Looper.getMainLooper(), this);

    public f0(android.widget.TextView textView, android.widget.TextView textView2) {
        this.f163710d = textView;
        this.f163711e = textView2;
    }

    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkTextViewValid", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        boolean z17 = (this.f163711e == null || this.f163710d == null) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTextViewValid", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        return z17;
    }

    public void b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetViewState", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setTranslationY(0.0f);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetViewState", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    public void c(com.tencent.mm.plugin.sns.ad.widget.living.g0 g0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            e();
            if (g0Var != null && g0Var.getCount() > 0 && a()) {
                this.f163715i = 0;
                java.lang.String b17 = g0Var.b(0);
                this.f163710d.setVisibility(0);
                this.f163710d.setText(b17);
                if (g0Var.getCount() > 1) {
                    this.f163712f.sendEmptyMessageDelayed(1, 2000L);
                }
            }
            this.f163714h = g0Var;
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureAnimator", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            if (this.f163713g == null) {
                android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
                this.f163713g = duration;
                duration.addUpdateListener(this);
                this.f163713g.addListener(this);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureAnimator", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            if (a()) {
                this.f163716m = this.f163710d.getHeight();
                this.f163713g.start();
                this.f163717n = 0;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            this.f163717n = 1;
            this.f163712f.removeMessages(1);
            android.animation.ValueAnimator valueAnimator = this.f163713g;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f163713g.cancel();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            if (message.what == 1) {
                d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
                return true;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        return false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            b(this.f163711e);
            b(this.f163710d);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ad.widget.living.g0 g0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            g0Var = this.f163714h;
        } catch (java.lang.Throwable unused) {
        }
        if (g0Var != null && g0Var.getCount() > 0 && a()) {
            android.widget.TextView textView = this.f163711e;
            android.widget.TextView textView2 = this.f163710d;
            this.f163711e = textView2;
            this.f163710d = textView;
            b(textView2);
            this.f163715i = (this.f163715i + 1) % g0Var.getCount();
            this.f163716m = 0.0f;
            if (this.f163717n == 0) {
                this.f163712f.sendEmptyMessageDelayed(1, 2000L);
            }
            this.f163713g = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ad.widget.living.g0 g0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            g0Var = this.f163714h;
        } catch (java.lang.Throwable unused) {
        }
        if (g0Var != null && g0Var.getCount() > 0 && a()) {
            this.f163711e.setTranslationY(this.f163716m);
            this.f163711e.setAlpha(0.0f);
            this.f163711e.setVisibility(0);
            this.f163711e.setText(g0Var.b((this.f163715i + 1) % g0Var.getCount()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        try {
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof java.lang.Float) {
                float floatValue = ((java.lang.Float) animatedValue).floatValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onValueUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
                if (a()) {
                    float f17 = this.f163716m;
                    float f18 = f17 * floatValue;
                    this.f163711e.setTranslationY(f17 - f18);
                    this.f163711e.setAlpha(floatValue);
                    this.f163710d.setTranslationY(-f18);
                    this.f163710d.setAlpha(1.0f - floatValue);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onValueUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
    }
}
