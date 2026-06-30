package xb4;

/* loaded from: classes4.dex */
public class v0 extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f452995c;

    /* renamed from: d, reason: collision with root package name */
    public final u74.d f452996d;

    public v0(com.tencent.mm.ui.MMActivity mMActivity, u74.d dVar, boolean z17) {
        try {
            int i17 = dVar.T.f425131a;
            this.f453000a = mMActivity;
            this.f452996d = dVar;
            android.view.View view = dVar.f425165z;
            int height = view.getHeight();
            int width = view.getWidth();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i18 = iArr[0];
            int i19 = iArr[1];
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(400L);
            int[] c17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(this.f453000a);
            int i27 = c17[0];
            int i28 = c17[1];
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "rotation", 0.0f, z17 ? 90 : -90);
            ofFloat2.setDuration(400L);
            float f17 = height != 0 ? (i27 * 1.0f) / height : 1.0f;
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, f17);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, f17);
            ofFloat3.setDuration(400L);
            ofFloat4.setDuration(400L);
            float f18 = i18 + (width / 2.0f);
            float f19 = i19 + (height / 2.0f);
            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, (i27 / 2.0f) - f18);
            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, (i28 / 2.0f) - f19);
            ofFloat5.setDuration(400L);
            ofFloat6.setDuration(400L);
            android.animation.ValueAnimator ofFloat7 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat7.addUpdateListener(new xb4.t0(this, dVar));
            ofFloat7.setDuration(100L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f452995c = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7);
            animatorSet.addListener(new xb4.u0(this, dVar));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAnim.simple_twist", "init exp=" + th6.toString());
            b();
        }
    }

    @Override // xb4.y
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
        android.animation.AnimatorSet animatorSet = this.f452995c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
            fd4.l lVar = this.f452996d.T.f425135e;
            if (lVar instanceof fd4.t) {
                fd4.t tVar = (fd4.t) lVar;
                tVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView = tVar.f261336q;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                if (twistCoverView != null && twistCoverView.getVisibility() == 0) {
                    twistCoverView.setAlpha(0.0f);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
    }

    public void b() {
        u74.d dVar = this.f452996d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetViewStatus", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAnim.simple_twist", "resetViewStatus");
        try {
            dVar.f425165z.setScaleX(1.0f);
            dVar.f425165z.setScaleY(1.0f);
            android.view.View view = dVar.f425165z;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            dVar.f425165z.setRotation(0.0f);
            dVar.f425165z.setTranslationX(0.0f);
            dVar.f425165z.setTranslationY(0.0f);
            android.view.View view2 = dVar.f425142c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view3 = dVar.f425145f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            fd4.l lVar = dVar.T.f425135e;
            if (lVar instanceof fd4.t) {
                fd4.t tVar = (fd4.t) lVar;
                tVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView = tVar.f261336q;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                if (twistCoverView != null) {
                    twistCoverView.setAlpha(1.0f);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAnim.simple_twist", "resetViewStatus exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetViewStatus", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
    }
}
