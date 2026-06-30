package com.tencent.mm.plugin.sns.ad.widget.shakead;

/* loaded from: classes4.dex */
public class ShakeCardAnimView extends android.widget.FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f163820o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f163821d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f163822e;

    /* renamed from: f, reason: collision with root package name */
    public s34.p f163823f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView f163824g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView f163825h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f163826i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f163827m;

    /* renamed from: n, reason: collision with root package name */
    public a94.q f163828n;

    public ShakeCardAnimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z17;
        this.f163826i = false;
        this.f163827m = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        this.f163821d = context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUseGLCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_shake_anim_gl, 0);
            z17 = Ni > 0;
            com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "isUseGLCardView, exptValue=" + Ni);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseGLCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ShakeCardAnimView", "isUseGLCardView, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseGLCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            z17 = false;
        }
        this.f163826i = z17;
        android.content.Context context2 = this.f163821d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        if (this.f163826i) {
            com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView = new com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView(context2);
            this.f163825h = gLCardAnimView;
            addView(gLCardAnimView, new android.widget.FrameLayout.LayoutParams(-1, -1));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 15);
        } else {
            com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView = new com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView(context2);
            this.f163824g = cardAnimView;
            addView(cardAnimView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        android.content.Context context3 = this.f163821d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context3);
        this.f163822e = mMPAGView;
        mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) == 1);
        this.f163822e.a(new a94.n(this));
        addView(this.f163822e, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
    }

    public static /* synthetic */ com.tencent.mm.view.MMPAGView a(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mm.view.MMPAGView mMPAGView = shakeCardAnimView.f163822e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        return mMPAGView;
    }

    public static boolean b(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView) {
        int[] c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        shakeCardAnimView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isForceLocalLowPag", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        boolean z17 = false;
        try {
            c17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(shakeCardAnimView.f163821d);
            com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "w=" + c17[0] + ", h=" + c17[1]);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ShakeCardAnimView", "isForceLocalLowPag, exp=" + th6.toString());
        }
        if (c17[0] * c17[1] <= 921600 || shakeCardAnimView.d()) {
            com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "isLowPerformanceDevice, ret=true");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 9);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForceLocalLowPag", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            z17 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            return z17;
        }
        com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "isLowPerformanceDevice, ret=false");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForceLocalLowPag", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        return z17;
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f163822e;
        if (mMPAGView == null) {
            com.tencent.mars.xlog.Log.e("ShakeCardAnimView", "initPagAnimViewData, mPAGAnimView==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        } else {
            mMPAGView.post(new a94.o(this, str, str2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        }
    }

    public final boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInBlackList", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        try {
            boolean z17 = true;
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_ad_shake_pag_black_list, "", true);
            java.lang.String m17 = wo.w0.m();
            if (android.text.TextUtils.isEmpty(Zi) || android.text.TextUtils.isEmpty(m17) || !Zi.toLowerCase().contains(m17.toLowerCase())) {
                z17 = false;
            }
            com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "isInBlackList, blackList=" + Zi + ", curDev=" + m17 + ", ret=" + z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInBlackList", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ShakeCardAnimView", "isInBlackList, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInBlackList", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            return false;
        }
    }

    public void e() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "startCardAnim");
        if (this.f163826i) {
            com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView = this.f163825h;
            gLCardAnimView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            gLCardAnimView.f163818x = true;
            int b17 = i65.a.b(gLCardAnimView.f163811q, 140);
            t84.c cVar = (t84.c) gLCardAnimView.e(0);
            t84.c cVar2 = (t84.c) gLCardAnimView.e(4);
            int i17 = -b17;
            gLCardAnimView.k(cVar, 0, 500, i17);
            gLCardAnimView.k(cVar2, 0, 500, b17);
            t84.c cVar3 = (t84.c) gLCardAnimView.e(2);
            gLCardAnimView.f163816v = cVar3;
            cVar3.j(1.0f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(cVar3, "translationY", -((gLCardAnimView.getHeight() / 2) + (gLCardAnimView.f163813s / 2) + gLCardAnimView.f163814t), 0.0f);
            long j17 = 500;
            ofFloat.setDuration(j17);
            ofFloat.addListener(new a94.h(gLCardAnimView, cVar3));
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(cVar3, "scaleX", 0.33333334f, 1.0f);
            ofFloat2.setDuration(j17);
            str = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView";
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(cVar3, "scaleY", 0.33333334f, 1.0f);
            ofFloat3.setDuration(j17);
            ofFloat.addListener(new a94.j(gLCardAnimView));
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(cVar3, "scaleX", 1.0f, 3.3333333f);
            ofFloat4.setDuration(j17);
            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(cVar3, "scaleY", 1.0f, 3.3333333f);
            ofFloat5.setDuration(j17);
            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(gLCardAnimView.f163815u, "scaleX", 0.33333334f, 1.0f);
            ofFloat6.setDuration(j17);
            android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(gLCardAnimView.f163815u, "scaleY", 0.33333334f, 1.0f);
            ofFloat7.setDuration(j17);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
            animatorSet.play(ofFloat4).with(ofFloat5).with(ofFloat6).with(ofFloat7).after(ofFloat2);
            animatorSet.setStartDelay(100L);
            animatorSet.start();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            t84.c cVar4 = (t84.c) gLCardAnimView.e(1);
            t84.c cVar5 = (t84.c) gLCardAnimView.e(3);
            gLCardAnimView.k(cVar4, 50, 500, i17);
            gLCardAnimView.k(cVar5, 50, 500, b17);
            str2 = "startCardAnim";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        } else {
            str = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView";
            com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView = this.f163824g;
            cardAnimView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            cardAnimView.f163808n = true;
            int b18 = i65.a.b(cardAnimView.f163801d, 140);
            android.view.View childAt = cardAnimView.getChildAt(0);
            android.view.View childAt2 = cardAnimView.getChildAt(4);
            int i18 = -b18;
            cardAnimView.d(childAt, 0, 500, i18);
            cardAnimView.d(childAt2, 0, 500, b18);
            android.view.View childAt3 = cardAnimView.getChildAt(2);
            cardAnimView.f163806i = childAt3;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(childAt3, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startCardAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(childAt3, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startCardAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(childAt3, "translationY", -((cardAnimView.getHeight() / 2) + (cardAnimView.f163803f / 2) + cardAnimView.f163804g), 0.0f);
            long j18 = 500;
            ofFloat8.setDuration(j18);
            ofFloat8.addListener(new a94.c(cardAnimView, childAt3));
            android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(childAt3, "scaleX", 0.33333334f, 1.0f);
            ofFloat9.setDuration(j18);
            android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat(childAt3, "scaleY", 0.33333334f, 1.0f);
            ofFloat10.setDuration(j18);
            ofFloat8.addListener(new a94.e(cardAnimView));
            android.animation.ObjectAnimator ofFloat11 = android.animation.ObjectAnimator.ofFloat(childAt3, "scaleX", 1.0f, 3.3333333f);
            ofFloat11.setDuration(j18);
            android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat(childAt3, "scaleY", 1.0f, 3.3333333f);
            ofFloat12.setDuration(j18);
            android.animation.ObjectAnimator ofFloat13 = android.animation.ObjectAnimator.ofFloat(cardAnimView.f163805h, "scaleX", 0.33333334f, 1.0f);
            ofFloat13.setDuration(j18);
            android.animation.ObjectAnimator ofFloat14 = android.animation.ObjectAnimator.ofFloat(cardAnimView.f163805h, "scaleY", 0.33333334f, 1.0f);
            ofFloat14.setDuration(j18);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.playTogether(ofFloat8, ofFloat9, ofFloat10);
            animatorSet2.play(ofFloat11).with(ofFloat12).with(ofFloat13).with(ofFloat14).after(ofFloat9);
            animatorSet2.setStartDelay(100L);
            animatorSet2.start();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            android.view.View childAt4 = cardAnimView.getChildAt(1);
            android.view.View childAt5 = cardAnimView.getChildAt(3);
            cardAnimView.d(childAt4, 50, 500, i18);
            cardAnimView.d(childAt5, 50, 500, b18);
            str2 = "startCardAnim";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
    }

    public void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPAGAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "startPAGAnim");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f163822e;
        if (mMPAGView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPAGAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        } else {
            mMPAGView.post(new a94.p(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPAGAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        }
    }

    public void setAnimCardView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "setAnimCardView");
        if (this.f163826i) {
            this.f163825h.setAnimCardView(view);
        } else {
            this.f163824g.setAnimCardView(view);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
    }

    public void setOnCardAnimListener(a94.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        this.f163828n = qVar;
        if (this.f163826i) {
            this.f163825h.setOnCardAnimListener(qVar);
        } else {
            this.f163824g.setOnCardAnimListener(qVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
    }
}
