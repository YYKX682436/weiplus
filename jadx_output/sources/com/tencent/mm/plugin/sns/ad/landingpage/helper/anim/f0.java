package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class f0 implements e94.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f163091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f163092b;

    public f0(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var, boolean z17) {
        this.f163092b = i0Var;
        this.f163091a = z17;
    }

    @Override // e94.f0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163092b;
        boolean r17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.r(i0Var);
        boolean z17 = this.f163091a;
        if (!r17 && !z17) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.b(i0Var), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.start();
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.h(i0Var), "alpha", com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.h(i0Var).getAlpha(), 0.0f);
            ofFloat2.setDuration(300L);
            ofFloat2.start();
        }
        if (!z17) {
            if (!com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.i(i0Var)) {
                android.view.View m17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var), "alpha", 0.0f, 1.0f);
            ofFloat3.setDuration(500L);
            ofFloat3.start();
        }
        android.view.View q17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).q();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(q17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        q17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(q17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|8|(1:10)(1:20)|11|12|(1:14)(1:18)|15|16))|23|6|7|8|(0)(0)|11|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "twist report exp=" + r3.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:8:0x0056, B:10:0x005e, B:20:0x0072), top: B:7:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:8:0x0056, B:10:0x005e, B:20:0x0072), top: B:7:0x0056 }] */
    @Override // e94.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.f0.b():void");
    }

    @Override // e94.f0
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163092b;
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).getF65848t()) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).getSwipeBackLayout().setEnableGesture(true);
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).b8();
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).e8();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView twistRoateCardsView = i0Var.f163102b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        twistRoateCardsView.setVisibility(8);
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).P();
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).e0()) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).i0(true);
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).m0();
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.d(i0Var).removeCallbacksAndMessages(null);
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 c17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var);
                c17.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowDoubleHBCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                boolean z17 = c17.B;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowDoubleHBCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                if (z17) {
                    com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.d(i0Var).sendEmptyMessageDelayed(3, 7000L);
                } else {
                    com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.d(i0Var).sendEmptyMessageDelayed(1, 3000L);
                }
            } else {
                i0Var.L(true, true);
            }
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).R();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
    }
}
