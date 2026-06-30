package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class q3 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {

    /* renamed from: x, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n3 f162921x = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n3(null);

    /* renamed from: s, reason: collision with root package name */
    public final ab4.g0 f162922s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView f162923t;

    /* renamed from: u, reason: collision with root package name */
    public int f162924u;

    /* renamed from: v, reason: collision with root package name */
    public int f162925v;

    /* renamed from: w, reason: collision with root package name */
    public int f162926w;

    public q3(android.content.Context context, ab4.g0 g0Var, android.view.ViewGroup viewGroup) {
        super(context, g0Var, viewGroup);
        this.f162922s = g0Var;
        this.f162926w = -1;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jsonObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        if (!super.D(jsonObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
            return false;
        }
        try {
            jsonObject.put("pickedCardClickNum", this.f162924u);
            jsonObject.put("unPickedCardClickNum", this.f162925v);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdLandingRandomPickCardComp", "setComponentKVReportData exp=" + e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        super.G();
        android.view.View view = this.f165056n;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            ab4.g0 g0Var = this.f162922s;
            marginLayoutParams.leftMargin = g0Var != null ? (int) g0Var.f2821h : 0;
            marginLayoutParams.topMargin = g0Var != null ? (int) g0Var.f2819f : 0;
            marginLayoutParams.rightMargin = g0Var != null ? (int) g0Var.f2822i : 0;
            marginLayoutParams.bottomMargin = g0Var != null ? (int) g0Var.f2820g : 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        super.K();
        com.tencent.mars.xlog.Log.i("AdLandingRandomPickCardComp", "viewWillAppear");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        super.L();
        com.tencent.mars.xlog.Log.i("AdLandingRandomPickCardComp", "viewWillDestroy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O() {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3.O():void");
    }

    public final java.lang.String P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView = this.f162923t;
        java.lang.String selectCardId = adLandingPageRandomPickCardView != null ? adLandingPageRandomPickCardView.getSelectCardId() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        return selectCardId;
    }

    public final java.lang.String R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectCardTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView = this.f162923t;
        java.lang.String selectCardTitle = adLandingPageRandomPickCardView != null ? adLandingPageRandomPickCardView.getSelectCardTitle() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectCardTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        return selectCardTitle;
    }

    public final void S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView = this.f162923t;
        if (adLandingPageRandomPickCardView != null) {
            adLandingPageRandomPickCardView.j();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
    }

    public final void T() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUIForAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView = this.f162923t;
        if (adLandingPageRandomPickCardView != null) {
            adLandingPageRandomPickCardView.m();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUIForAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r11.g() == true) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3.U(java.lang.String):void");
    }

    public final void V(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        W(z17, z18, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
    }

    public final void W(boolean z17, boolean z18, android.animation.Animator.AnimatorListener animatorListener) {
        android.animation.ObjectAnimator ofFloat;
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        android.view.View view = this.f165056n;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
            return;
        }
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView2 = this.f162923t;
        if (adLandingPageRandomPickCardView2 != null) {
            adLandingPageRandomPickCardView2.setEnabled(z17);
        }
        com.tencent.mars.xlog.Log.i("AdLandingRandomPickCardComp", "setVisibility, visible=" + z17 + ", withAnim=" + z18);
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView3 = this.f162923t;
        if (adLandingPageRandomPickCardView3 != null) {
            adLandingPageRandomPickCardView3.setEnabled(false);
        }
        if (z18) {
            if (z17) {
                ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 1.0f);
                ofFloat.setDuration(150L);
                if (animatorListener != null) {
                    ofFloat.addListener(animatorListener);
                    ofFloat.addListener(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.p3(this));
                }
            } else {
                ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 0.0f);
                ofFloat.setDuration(200L);
            }
            ofFloat.start();
        } else {
            float f17 = z17 ? 1.0f : 0.0f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingRandomPickCardComp", "setVisibility", "(ZZLandroid/animation/Animator$AnimatorListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingRandomPickCardComp", "setVisibility", "(ZZLandroid/animation/Animator$AnimatorListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (z17 && (adLandingPageRandomPickCardView = this.f162923t) != null) {
                adLandingPageRandomPickCardView.setEnabled(true);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x0043, B:24:0x0049, B:26:0x0055, B:27:0x0060, B:28:0x0068, B:30:0x006e, B:32:0x0076, B:34:0x007f, B:37:0x0087, B:40:0x008f, B:41:0x0092, B:43:0x0093, B:45:0x0099, B:50:0x00a5, B:51:0x00af), top: B:21:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x0043, B:24:0x0049, B:26:0x0055, B:27:0x0060, B:28:0x0068, B:30:0x006e, B:32:0x0076, B:34:0x007f, B:37:0x0087, B:40:0x008f, B:41:0x0092, B:43:0x0093, B:45:0x0099, B:50:0x00a5, B:51:0x00af), top: B:21:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "tryInitRandomCardInfo"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            if (r0 != 0) goto L10
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L10:
            r3 = 0
            r4 = r16
            ab4.g0 r5 = r4.f162922s
            if (r5 == 0) goto L1e
            p44.u r5 = r5.F
            if (r5 == 0) goto L1e
            java.util.List<p44.s> r5 = r5.cardItemList
            goto L1f
        L1e:
            r5 = r3
        L1f:
            java.lang.String r6 = "initLocalRandomCardList"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            r9 = 0
            if (r5 == 0) goto L33
            boolean r10 = r5.isEmpty()
            if (r10 == 0) goto L31
            goto L33
        L31:
            r10 = r9
            goto L34
        L33:
            r10 = 1
        L34:
            java.lang.String r11 = "RandomPickCardStorage"
            if (r10 == 0) goto L43
            java.lang.String r0 = "initLocalRandomCardList, but xmlList is null or empty"
            com.tencent.mars.xlog.Log.e(r11, r0)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            goto Ldb
        L43:
            java.util.List r5 = kz5.n0.V0(r5)     // Catch: java.lang.Throwable -> Ld4
            p44.b0 r10 = p44.b0.f351771a
            java.util.List r12 = r10.e(r0)     // Catch: java.lang.Throwable -> Ld4
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch: java.lang.Throwable -> Ld4
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> Ld4
            if (r12 != 0) goto L60
            java.lang.String r0 = "initLocalRandomCardList, localCardItemList is not null or empty"
            com.tencent.mars.xlog.Log.i(r11, r0)     // Catch: java.lang.Throwable -> Ld4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch: java.lang.Throwable -> Ld4
            goto Ldb
        L60:
            r12 = r5
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch: java.lang.Throwable -> Ld4
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> Ld4
            r13 = r9
        L68:
            boolean r14 = r12.hasNext()     // Catch: java.lang.Throwable -> Ld4
            if (r14 == 0) goto L93
            java.lang.Object r14 = r12.next()     // Catch: java.lang.Throwable -> Ld4
            int r15 = r13 + 1
            if (r13 < 0) goto L8f
            p44.s r14 = (p44.s) r14     // Catch: java.lang.Throwable -> Ld4
            int r13 = r14.d()     // Catch: java.lang.Throwable -> Ld4
            r8 = -1
            if (r13 != r8) goto L87
            int r8 = r14.f()     // Catch: java.lang.Throwable -> Ld4
            r14.i(r8)     // Catch: java.lang.Throwable -> Ld4
            goto L8d
        L87:
            java.lang.String r8 = "localCardItemList is not init, but why init again"
            com.tencent.mars.xlog.Log.e(r11, r8)     // Catch: java.lang.Throwable -> Ld4
        L8d:
            r13 = r15
            goto L68
        L8f:
            kz5.c0.p()     // Catch: java.lang.Throwable -> Ld4
            throw r3     // Catch: java.lang.Throwable -> Ld4
        L93:
            java.lang.String r3 = r10.i(r5)     // Catch: java.lang.Throwable -> Ld4
            if (r3 == 0) goto La2
            int r5 = r3.length()     // Catch: java.lang.Throwable -> Ld4
            if (r5 != 0) goto La0
            goto La2
        La0:
            r8 = r9
            goto La3
        La2:
            r8 = 1
        La3:
            if (r8 == 0) goto Laf
            java.lang.String r0 = "initLocalRandomCardList, randomCardListToJson error"
            com.tencent.mars.xlog.Log.e(r11, r0)     // Catch: java.lang.Throwable -> Ld4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch: java.lang.Throwable -> Ld4
            goto Ldb
        Laf:
            java.lang.String r0 = r10.d(r0)     // Catch: java.lang.Throwable -> Ld4
            p34.o.i(r0, r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld4
            r5.<init>()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r8 = "saveRandomCardList, key is "
            r5.append(r8)     // Catch: java.lang.Throwable -> Ld4
            r5.append(r0)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = ", ret is "
            r5.append(r0)     // Catch: java.lang.Throwable -> Ld4
            r5.append(r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Ld4
            com.tencent.mars.xlog.Log.i(r11, r0)     // Catch: java.lang.Throwable -> Ld4
            goto Ld8
        Ld4:
            r0 = move-exception
            ca4.q.c(r11, r0)
        Ld8:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
        Ldb:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3.X(java.lang.String):void");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public android.view.View j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f165049d);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        android.content.Context context = frameLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView = new com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView(context, null);
        c44.a.o();
        c44.a.o();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = c44.a.d();
        frameLayout.addView(adLandingPageRandomPickCardView, layoutParams);
        this.f162923t = adLandingPageRandomPickCardView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        return frameLayout;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        super.k();
        int[] c17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int min = java.lang.Math.min(c17[0], c17[1]);
        java.lang.String i17 = u().i();
        com.tencent.mars.xlog.Log.i("AdLandingRandomPickCardComp", "fillItem, pageId=" + i17 + ", screenW=" + min);
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView = this.f162923t;
        if (adLandingPageRandomPickCardView != null) {
            ab4.g0 g0Var = this.f162922s;
            adLandingPageRandomPickCardView.g(i17, g0Var != null ? g0Var.F : null, min);
        }
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView2 = this.f162923t;
        if (adLandingPageRandomPickCardView2 != null) {
            adLandingPageRandomPickCardView2.m();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
    }
}
