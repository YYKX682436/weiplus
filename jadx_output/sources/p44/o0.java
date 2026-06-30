package p44;

/* loaded from: classes4.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f351811a;

    /* renamed from: b, reason: collision with root package name */
    public final int f351812b;

    /* renamed from: c, reason: collision with root package name */
    public final int f351813c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f351814d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f351815e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f351816f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f351817g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f351818h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f351819i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f351820j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f351821k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f351822l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f351823m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView f351824n;

    /* renamed from: o, reason: collision with root package name */
    public p44.r f351825o;

    /* renamed from: p, reason: collision with root package name */
    public p44.d0 f351826p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.y0 f351827q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f351828r;

    /* renamed from: s, reason: collision with root package name */
    public int f351829s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.r0 f351830t;

    public o0(android.content.Context mContext, int i17, int i18, android.view.View mContentView) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mContentView, "mContentView");
        this.f351811a = mContext;
        this.f351812b = i17;
        this.f351813c = i18;
        this.f351814d = mContentView;
        this.f351829s = -1;
        int i19 = kotlinx.coroutines.r0.N0;
        this.f351830t = new p44.l0(kotlinx.coroutines.q0.f310567d);
    }

    public static final void a(p44.o0 o0Var, boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateDescText", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        o0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDescText", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        if (z17) {
            android.widget.TextView textView = o0Var.f351823m;
            if (textView != null) {
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
            }
        } else {
            android.widget.TextView textView2 = o0Var.f351823m;
            if (textView2 != null) {
                if (str2 == null) {
                    str2 = "";
                }
                textView2.setText(str2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDescText", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateDescText", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (r8 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p44.o0.b():void");
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPlayAllDonePagAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        try {
            if (this.f351820j == null) {
                android.widget.FrameLayout frameLayout = this.f351819i;
                boolean z17 = true;
                if (frameLayout != null && frameLayout.getChildCount() == 0) {
                    com.tencent.mars.xlog.Log.i("TimelineRandomPickLayoutCtrl", "doPlayAllDonePagAnim");
                    com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(this.f351811a);
                    if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) != 1) {
                        z17 = false;
                    }
                    mMPAGView.o(z17);
                    android.widget.FrameLayout frameLayout2 = this.f351819i;
                    if (frameLayout2 != null) {
                        c44.a.l();
                        c44.a.l();
                        frameLayout2.addView(mMPAGView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    }
                    this.f351820j = mMPAGView;
                    mMPAGView.setPath("assets://sns/sns_ad_random_pick_all_done.pag");
                    mMPAGView.g();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("TimelineRandomPickLayoutCtrl", "doPlayAllDonePagAnim, exp=" + e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPlayAllDonePagAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dynamicUpdateDescText", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        try {
            e(this.f351828r, this.f351825o);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("TimelineRandomPickLayoutCtrl", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dynamicUpdateDescText", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if ((!kotlinx.coroutines.z0.h(r0)) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.tencent.mm.plugin.sns.storage.SnsInfo r22, p44.r r23) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            java.lang.String r8 = "dynamicUpdateDescText"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            if (r7 != 0) goto L11
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return
        L11:
            if (r23 != 0) goto L17
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return
        L17:
            kotlin.jvm.internal.c0 r4 = new kotlin.jvm.internal.c0
            r4.<init>()
            boolean r0 = r21.h()
            r4.f310112d = r0
            kotlinx.coroutines.y0 r0 = r6.f351827q
            if (r0 == 0) goto L31
            boolean r0 = kotlinx.coroutines.z0.h(r0)
            if (r0 != 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 == 0) goto L3e
        L31:
            java.lang.String r0 = "TimelineRandomPickLayoutCtrl"
            java.lang.String r1 = "dynamicUpdateDescText, init scope"
            com.tencent.mars.xlog.Log.i(r0, r1)
            kotlinx.coroutines.y0 r0 = kotlinx.coroutines.z0.b()
            r6.f351827q = r0
        L3e:
            kotlinx.coroutines.y0 r10 = r6.f351827q
            kotlinx.coroutines.r0 r15 = r6.f351830t
            if (r10 == 0) goto L66
            kotlinx.coroutines.p0 r0 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.internal.b0.f310484a
            t26.a r0 = (t26.a) r0
            t26.a r0 = r0.f415347h
            oz5.l r11 = r0.plus(r15)
            r12 = 0
            p44.i0 r13 = new p44.i0
            r5 = 0
            r0 = r13
            r1 = r22
            r2 = r23
            r3 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r14 = 2
            r0 = 0
            r1 = r15
            r15 = r0
            kotlinx.coroutines.l.d(r10, r11, r12, r13, r14, r15)
            goto L67
        L66:
            r1 = r15
        L67:
            kotlinx.coroutines.y0 r15 = r6.f351827q
            if (r15 == 0) goto L88
            kotlinx.coroutines.p0 r0 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.internal.b0.f310484a
            t26.a r0 = (t26.a) r0
            t26.a r0 = r0.f415347h
            oz5.l r16 = r0.plus(r1)
            r17 = 0
            p44.k0 r0 = new p44.k0
            r1 = 0
            r0.<init>(r6, r7, r1)
            r19 = 2
            r20 = 0
            r18 = r0
            kotlinx.coroutines.l.d(r15, r16, r17, r18, r19, r20)
        L88:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p44.o0.e(com.tencent.mm.plugin.sns.storage.SnsInfo, p44.r):void");
    }

    public final int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalCardNumForAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView = this.f351824n;
        int totalCardNum = timelineRandomPickCardView != null ? timelineRandomPickCardView.getTotalCardNum() : 3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalCardNumForAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        return totalCardNum;
    }

    public final boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasPickedCard", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView = this.f351824n;
        boolean f17 = timelineRandomPickCardView != null ? timelineRandomPickCardView.f() : false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasPickedCard", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        return f17;
    }

    public final boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAllCardPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView = this.f351824n;
        boolean i17 = timelineRandomPickCardView != null ? timelineRandomPickCardView.i() : false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllCardPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        return i17;
    }

    public final void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        com.tencent.mars.xlog.Log.i("TimelineRandomPickLayoutCtrl", "refresh");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView = this.f351824n;
        if (timelineRandomPickCardView != null) {
            timelineRandomPickCardView.j();
        }
        o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
    }

    public final int j(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        if (this.f351813c == 0) {
            int a17 = c44.b.a(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
            return a17;
        }
        int i18 = (int) ((r2 * i17) / 298.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        return i18;
    }

    public final void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetOthers", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        kotlinx.coroutines.y0 y0Var = this.f351827q;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.f351827q = null;
        com.tencent.mars.xlog.Log.i("TimelineRandomPickLayoutCtrl", "resetOthers");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetOthers", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ea, code lost:
    
        if (r3 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r3 == null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p44.o0.l():void");
    }

    public final void m() {
        java.util.List<p44.c0> mItemViewList;
        p44.c0 c0Var;
        android.view.View j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showRandomPickCardView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        int i17 = this.f351829s;
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView = this.f351824n;
        if (!a84.b0.a(i17, timelineRandomPickCardView != null ? timelineRandomPickCardView.getMItemViewList() : null)) {
            com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView2 = this.f351824n;
            if (timelineRandomPickCardView2 == null || (mItemViewList = timelineRandomPickCardView2.getMItemViewList()) == null || (c0Var = mItemViewList.get(this.f351829s)) == null || (j17 = c0Var.j()) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showRandomPickCardView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
                return;
            }
            j17.setEnabled(true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(j17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickLayoutCtrl", "showRandomPickCardView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            j17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(j17, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickLayoutCtrl", "showRandomPickCardView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mars.xlog.Log.i("TimelineRandomPickLayoutCtrl", "showRandomPickCardView");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView3 = this.f351824n;
        if (timelineRandomPickCardView3 != null) {
            timelineRandomPickCardView3.setEnabled(true);
            timelineRandomPickCardView3.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showRandomPickCardView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
    }

    public final void n(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startIntroImgAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        com.tencent.mars.xlog.Log.i("TimelineRandomPickLayoutCtrl", "startIntroImgAnim");
        android.widget.ImageView imageView = this.f351821k;
        if (imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startIntroImgAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
            return;
        }
        p44.q qVar = p44.q.f351832a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startIntroImgAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.42f, 0.0f, 1.0f, 1.0f);
        android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 0.0f, 0.8f);
        ofFloat.setDuration(667L);
        ofFloat.setInterpolator(pathInterpolator);
        arrayList.add(ofFloat);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 0.8f, 0.2f);
        ofFloat2.setDuration(667L);
        ofFloat2.setStartDelay(500L);
        ofFloat2.setInterpolator(pathInterpolator2);
        arrayList.add(ofFloat2);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 0.2f, 0.9f);
        ofFloat3.setDuration(500L);
        ofFloat3.setStartDelay(500L);
        ofFloat3.setInterpolator(pathInterpolator);
        arrayList.add(ofFloat3);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 0.9f, 0.0f);
        ofFloat4.setDuration(500L);
        ofFloat4.setStartDelay(500L);
        ofFloat4.setInterpolator(pathInterpolator2);
        arrayList.add(ofFloat4);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.setStartDelay(j17);
        qVar.a(imageView, animatorSet);
        animatorSet.addListener(new p44.n());
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startIntroImgAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startIntroImgAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
    }

    public final void o() {
        int i17;
        int i18;
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDynamicInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        p44.r rVar = this.f351825o;
        if (rVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDynamicInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
            return;
        }
        boolean h17 = h();
        com.tencent.mars.xlog.Log.i("TimelineRandomPickLayoutCtrl", "updateDynamicInfo, isAllCardPicked=" + h17);
        if (h17) {
            android.widget.TextView textView = this.f351818h;
            if (textView != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDoneTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                java.lang.String str = rVar.f351841g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDoneTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                textView.setText(str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDoneTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                int i27 = rVar.f351842h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDoneTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                textView.setTextColor(i27);
                c44.a.n();
                textView.setVisibility(0);
            }
            android.view.View view = this.f351815e;
            if (view != null) {
                c44.a.c();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickLayoutCtrl", "updateDynamicInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickLayoutCtrl", "updateDynamicInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView2 = this.f351823m;
            if (textView2 != null) {
                c44.a.n();
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = this.f351823m;
            if (textView3 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                java.lang.String str2 = rVar.f351843i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                textView3.setText(str2);
                if (com.tencent.mm.ui.bk.C()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDoneDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                    i19 = rVar.f351845k;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDoneDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDoneDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                    i19 = rVar.f351844j;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDoneDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                }
                textView3.setTextColor(i19);
            }
        } else {
            android.view.View view2 = this.f351815e;
            if (view2 != null) {
                c44.a.n();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickLayoutCtrl", "updateDynamicInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickLayoutCtrl", "updateDynamicInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView4 = this.f351823m;
            if (textView4 != null) {
                c44.a.n();
                textView4.setVisibility(0);
            }
            android.widget.TextView textView5 = this.f351818h;
            if (textView5 != null) {
                c44.a.c();
                textView5.setVisibility(8);
            }
            android.widget.TextView textView6 = this.f351817g;
            if (textView6 != null) {
                if (g()) {
                    textView6.setText(rVar.b());
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                    java.lang.String str3 = rVar.f351835a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                    textView6.setText(str3);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                int i28 = rVar.f351837c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                textView6.setTextColor(i28);
            }
            android.widget.TextView textView7 = this.f351823m;
            if (textView7 != null) {
                textView7.setText(rVar.a());
                if (com.tencent.mm.ui.bk.C()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                    i17 = rVar.f351840f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                    i17 = rVar.f351839e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                }
                textView7.setTextColor(i17);
            }
        }
        android.widget.TextView textView8 = this.f351822l;
        if (textView8 != null) {
            textView8.setText(rVar.a());
            if (com.tencent.mm.ui.bk.C()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                i18 = rVar.f351840f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                i18 = rVar.f351839e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            }
            textView8.setTextColor(i18);
        }
        android.widget.TextView textView9 = this.f351822l;
        if (textView9 != null) {
            textView9.setAlpha(1.0f);
        }
        if (g()) {
            android.widget.TextView textView10 = this.f351822l;
            if (textView10 != null) {
                textView10.setVisibility(4);
            }
            android.widget.TextView textView11 = this.f351823m;
            if (textView11 != null) {
                textView11.setAlpha(1.0f);
            }
        } else {
            android.widget.TextView textView12 = this.f351822l;
            if (textView12 != null) {
                textView12.setVisibility(0);
            }
            android.widget.TextView textView13 = this.f351823m;
            if (textView13 != null) {
                textView13.setAlpha(0.0f);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDynamicInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
    }
}
