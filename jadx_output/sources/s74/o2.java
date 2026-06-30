package s74;

/* loaded from: classes4.dex */
public final class o2 extends s74.o0 {
    public final java.util.List E;
    public com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer F;
    public com.tencent.mm.plugin.sns.ad.widget.living.v G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final w64.k f404465J;
    public final java.util.List K;
    public final s74.b3 L;
    public boolean M;
    public com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper N;
    public final kotlinx.coroutines.flow.k O;

    static {
        new s74.b1(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, i64.b1 mSnsAdStatistic, w64.l lVar, com.tencent.mm.plugin.sns.model.k4 k4Var, s74.p2 dependViews) {
        super(str, yVar, view, i17, mSnsAdStatistic, lVar, k4Var, dependViews);
        kotlin.jvm.internal.o.g(mSnsAdStatistic, "mSnsAdStatistic");
        kotlin.jvm.internal.o.g(dependViews, "dependViews");
        this.E = new java.util.ArrayList();
        this.H = jz5.h.b(s74.i1.f404344d);
        this.I = jz5.h.b(s74.h1.f404324d);
        this.f404465J = new s74.g1(this);
        this.K = new java.util.ArrayList();
        this.L = new s74.b3();
        this.O = new s74.i2(this);
    }

    public static /* synthetic */ void c0(s74.o2 o2Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateButtonState$default", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        if ((i17 & 2) != 0) {
            z18 = z17;
        }
        o2Var.b0(z17, z18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateButtonState$default", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    @Override // s74.o0
    public void K(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindDynamicComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        l44.q3.f316313a.a(a84.d0.c(snsInfo), new s74.p1(snsInfo, this));
        kotlinx.coroutines.y0 h17 = h();
        if (h17 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExceptionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            kotlinx.coroutines.r0 r0Var = this.f404453t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExceptionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            kotlinx.coroutines.l.d(h17, g3Var.plus(r0Var), null, new s74.a2(this, snsInfo, null), 2, null);
        }
        s74.f3 D = D();
        if (D != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdBulletScreenView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView adBulletScreenView = D.U;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdBulletScreenView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            if (adBulletScreenView != null) {
                if (snsInfo.getAdXml().bulletScreenInfo != null) {
                    s34.c bulletScreenInfo = snsInfo.getAdXml().bulletScreenInfo;
                    kotlin.jvm.internal.o.f(bulletScreenInfo, "bulletScreenInfo");
                    adBulletScreenView.setBulletScreenInfo(bulletScreenInfo);
                    adBulletScreenView.setVisibility(0);
                } else {
                    adBulletScreenView.setVisibility(8);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindDynamicComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0448  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34, types: [java.util.ArrayList] */
    @Override // s74.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L(s74.f3 r44) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.o2.L(s74.f3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r2 == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(s34.r0 r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "checkShowLivingAnim"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.e(r8, r10)
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext"
            java.lang.String r4 = "getHasLivingAnimComponent"
            java.lang.String r5 = "checkShowLivingAnim, isLivingNow="
            if (r2 == 0) goto L8d
            s74.f3 r2 = r7.D()
            if (r2 == 0) goto L25
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            boolean r2 = r2.R
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            r6 = 1
            if (r2 != r6) goto L25
            goto L26
        L25:
            r6 = 0
        L26:
            if (r6 == 0) goto L8d
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper r2 = r7.N
            if (r2 != 0) goto L51
            s74.p2 r2 = r7.C()
            android.view.ViewGroup r2 = r2.a()
            r3 = 2131296730(0x7f0901da, float:1.8211385E38)
            android.view.View r2 = r2.findViewById(r3)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            if (r2 == 0) goto L51
            android.view.View r2 = a84.y0.h(r2)
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper r2 = (com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper) r2
            r7.N = r2
            java.lang.String r2 = r7.k()
            java.lang.String r3 = "inflate livingAnimWrapper"
            com.tencent.mars.xlog.Log.i(r2, r3)
        L51:
            java.lang.String r2 = r7.k()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r10)
            java.lang.String r10 = ", snsId="
            r3.append(r10)
            r3.append(r9)
            java.lang.String r10 = ", isAttached="
            r3.append(r10)
            s74.p2 r10 = r7.C()
            android.view.ViewGroup r10 = r10.a()
            boolean r10 = r10.isAttachedToWindow()
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r10)
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper r10 = r7.N
            if (r10 == 0) goto Lca
            s74.c1 r10 = new s74.c1
            r10.<init>(r7, r9, r8)
            r7.c(r10)
            goto Lca
        L8d:
            java.lang.String r8 = r7.k()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r5)
            r9.append(r10)
            java.lang.String r10 = ", hasLivingAnimComp="
            r9.append(r10)
            s74.f3 r10 = r7.D()
            if (r10 == 0) goto Lb1
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            boolean r10 = r10.R
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            goto Lb2
        Lb1:
            r10 = 0
        Lb2:
            r9.append(r10)
            java.lang.String r10 = ", showLivingAnim=false, hide"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.i(r8, r9)
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper r8 = r7.N
            if (r8 == 0) goto Lca
            r9 = 8
            r8.setVisibility(r9)
        Lca:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.o2.O(s34.r0, java.lang.String, boolean):void");
    }

    public final void P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearNormalStyleTextSelectableHelpers", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        java.util.List list = this.E;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((bd4.f2) it.next()).k();
        }
        ((java.util.ArrayList) list).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearNormalStyleTextSelectableHelpers", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    public final void Q(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout;
        com.tencent.mm.plugin.sns.ad.widget.living.j0 j0Var;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        try {
            s74.f3 D = D();
            com.tencent.mm.plugin.sns.ad.widget.living.j0 j0Var2 = null;
            if (D != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivingStatusLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                viewGroup = D.P;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingStatusLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            } else {
                viewGroup = null;
            }
            s74.f3 D2 = D();
            if (D2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivingDescBar", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                livingDescBarLayout = D2.O;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingDescBar", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            } else {
                livingDescBarLayout = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$Companion");
            boolean z17 = ((snsInfo == null || (adXml = snsInfo.getAdXml()) == null) ? null : adXml.adLiveInfo) != null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$Companion");
            if (z17) {
                com.tencent.mars.xlog.Log.i(k(), "--fillLivingViewInfo, shouldShowLivingView=true--");
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
                if (viewGroup != null && livingDescBarLayout != null) {
                    if (D() != null) {
                        s74.f3 D3 = D();
                        if (D3 != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivingStatusController", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                            j0Var = D3.S;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingStatusController", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                        } else {
                            j0Var = null;
                        }
                        if (j0Var == null) {
                            com.tencent.mars.xlog.Log.i(k(), "create mLivingStatusController");
                            s74.f3 D4 = D();
                            if (D4 != null) {
                                com.tencent.mm.plugin.sns.ad.widget.living.j0 j0Var3 = new com.tencent.mm.plugin.sns.ad.widget.living.j0(viewGroup, livingDescBarLayout, new s74.f1(this));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLivingStatusController", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                                D4.S = j0Var3;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLivingStatusController", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                            }
                        }
                    }
                    s74.f3 D5 = D();
                    if (D5 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivingStatusController", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                        j0Var2 = D5.S;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingStatusController", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    }
                    if (j0Var2 != null) {
                        s34.r0 r0Var = snsInfo.getAdXml().adLiveInfo;
                        int c17 = com.tencent.mm.plugin.sns.ad.widget.living.i0.c(timeLine.Id, r0Var.f402745a);
                        com.tencent.mars.xlog.Log.i(k(), "setLiveStatus=" + c17);
                        j0Var2.g(timeLine.Id, r0Var);
                        j0Var2.h(c17);
                        com.tencent.mm.plugin.sns.ad.widget.living.i0.a(timeLine.Id, j0Var2);
                        if (!com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(snsInfo)) {
                            com.tencent.mars.xlog.Log.i(k(), "doLivingStatusRequest");
                            e74.i.f().d(0, snsInfo);
                        }
                        boolean f17 = com.tencent.mm.plugin.sns.ad.widget.living.j0.f(c17);
                        java.lang.String Id = timeLine.Id;
                        kotlin.jvm.internal.o.f(Id, "Id");
                        O(r0Var, Id, f17);
                    }
                    if (ca4.m0.Z(E())) {
                        com.tencent.mars.xlog.Log.i(k(), "isAdapterElder, hide livingDescBar");
                        livingDescBarLayout.setVisibility(8);
                    }
                }
                com.tencent.mars.xlog.Log.e(k(), "the livingStatusLayout or livingDescBar is null!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                return;
            }
            com.tencent.mars.xlog.Log.i(k(), "fillLivingViewInfo, shouldShowLivingView=false, hide livingViews");
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            if (livingDescBarLayout != null) {
                livingDescBarLayout.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = this.N;
            if (finderLivingAnimWrapper != null) {
                finderLivingAnimWrapper.setVisibility(8);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(k(), "fillLivingViewInfo, exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    public final com.tencent.mm.plugin.sns.ad.widget.living.v R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLivingStreamHelper", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLivingStreamHelper", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        return vVar;
    }

    public final com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivingAnimWrapper", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = this.N;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingAnimWrapper", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        return finderLivingAnimWrapper;
    }

    public final android.widget.Button T() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActionBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        s74.f3 D = D();
        android.widget.Button g17 = D != null ? D.g() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActionBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        return g17;
    }

    public final com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U() {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActionBtnInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) i();
        com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo adCardActionBtnInfo = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null) ? null : adXml.adCardActionBtnInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActionBtnInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        return adCardActionBtnInfo;
    }

    public final boolean V(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdLoadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMIsLoadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        jz5.g gVar = this.H;
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMIsLoadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        if (booleanValue) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            boolean z18 = this.f404455v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            if (!z18 && snsInfo.isDynamicAD()) {
                z17 = true;
                java.lang.String j17 = j();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dynamicAd, isVideoStyle=");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
                boolean z19 = this.f404455v;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
                sb6.append(z19);
                sb6.append(", isAdLoadBigImage=");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMIsLoadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                boolean booleanValue2 = ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMIsLoadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                sb6.append(booleanValue2);
                sb6.append(", ret=");
                sb6.append(z17);
                com.tencent.mars.xlog.Log.i(j17, sb6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdLoadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                return z17;
            }
        }
        z17 = false;
        java.lang.String j172 = j();
        java.lang.StringBuilder sb62 = new java.lang.StringBuilder("dynamicAd, isVideoStyle=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        boolean z192 = this.f404455v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        sb62.append(z192);
        sb62.append(", isAdLoadBigImage=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMIsLoadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        boolean booleanValue22 = ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMIsLoadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        sb62.append(booleanValue22);
        sb62.append(", ret=");
        sb62.append(z17);
        com.tencent.mars.xlog.Log.i(j172, sb62.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdLoadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        return z17;
    }

    public final void W(z74.b event, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        kotlin.jvm.internal.o.g(event, "event");
        kotlinx.coroutines.y0 h17 = h();
        if (h17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExceptionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            kotlinx.coroutines.r0 r0Var = this.f404453t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExceptionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            kotlinx.coroutines.l.d(h17, r0Var, null, new s74.c2(this, event, i17, i18, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    public void X() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mars.xlog.Log.i(j(), "onVideoPlay");
        s74.f3 D = D();
        if (D != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdBulletScreenView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView adBulletScreenView = D.U;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdBulletScreenView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            if (adBulletScreenView != null && adBulletScreenView.getVisibility() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
                s34.c cVar = adBulletScreenView.f163545d;
                if (cVar == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
                } else {
                    com.tencent.mars.xlog.Log.i("AdBulletScreenView", "startAnim");
                    adBulletScreenView.f163547f = false;
                    if (!adBulletScreenView.f163548g) {
                        adBulletScreenView.f163548g = true;
                        r84.f fVar = adBulletScreenView.f163552n;
                        fVar.removeCallbacksAndMessages(null);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBulletShootingDelay", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
                        long j17 = cVar.f402591f;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBulletShootingDelay", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
                        fVar.sendEmptyMessageDelayed(1, j17);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    public final void Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetProcessedAnimationList", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        this.M = false;
        for (s74.a1 a1Var : this.K) {
            java.util.Iterator it = a1Var.b().iterator();
            while (it.hasNext()) {
                ((android.animation.Animator) it.next()).cancel();
            }
            a1Var.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetProcessedAnimationList", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    public final void Z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetProcessedAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mars.xlog.Log.i("DynamicComponent", "resetProcessedAnimations is called, hasProcessOnVideoEnd " + this.M);
        if (this.M) {
            Y();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetProcessedAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    public final void a0() {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAddFinderBtnInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
        com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U = U();
        java.lang.String str = (U == null || (adClickActionInfo = U.clickActionInfo) == null) ? null : adClickActionInfo.finderUsername;
        if (str == null) {
            str = "";
        }
        ((com.tencent.mm.plugin.finder.service.s1) e6Var).Ui(str, new s74.n2(this), 4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAddFinderBtnInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    public final void b0(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        try {
            if (T() != null) {
                android.widget.Button T = T();
                if (T != null) {
                    T.setEnabled(z17);
                }
                android.widget.Button T2 = T();
                if (T2 != null) {
                    s74.q4.f404513a.t(T2, z18);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    public final void d0(java.lang.String str) {
        android.widget.Button T;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateNewOrderUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        if (U() != null) {
            com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U = U();
            if ((U != null ? U.clickActionInfo : null) != null) {
                com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U2 = U();
                if (((U2 == null || (adClickActionInfo = U2.clickActionInfo) == null) ? null : adClickActionInfo.f162594m0) != null) {
                    if (kotlin.jvm.internal.o.b("0", str)) {
                        android.widget.Button T2 = T();
                        if (T2 != null) {
                            com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U3 = U();
                            kotlin.jvm.internal.o.d(U3);
                            T2.setText(U3.btnTitle);
                        }
                        c0(this, true, false, 2, null);
                    } else if (kotlin.jvm.internal.o.b("1", str)) {
                        android.widget.Button T3 = T();
                        if (T3 != null) {
                            com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U4 = U();
                            kotlin.jvm.internal.o.d(U4);
                            T3.setText(U4.clickActionInfo.f162594m0.f402554i);
                        }
                        c0(this, true, false, 2, null);
                        android.widget.Button T4 = T();
                        if (T4 != null) {
                            s74.q4.f404513a.t(T4, false);
                        }
                    } else if (kotlin.jvm.internal.o.b("1000", str)) {
                        com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U5 = U();
                        if (U5 != null && (T = T()) != null) {
                            T.setText(U5.clickActionInfo.f162594m0.f402560o);
                        }
                        c0(this, false, false, 2, null);
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateNewOrderUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void p(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        kotlin.jvm.internal.o.g(model, "model");
        Y();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mars.xlog.Log.i(j(), "onDetach");
        java.util.List<s74.a1> list = this.A;
        if (list != null) {
            for (s74.a1 a1Var : list) {
                java.util.Iterator it = ((java.util.ArrayList) a1Var.b()).iterator();
                while (it.hasNext()) {
                    ((android.animation.Animator) it.next()).cancel();
                }
                a1Var.e();
            }
        }
        s74.p2 p2Var = this.f404452s;
        p2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        android.widget.FrameLayout frameLayout = p2Var.f404490k;
        kotlin.jvm.internal.o.f(frameLayout, "<get-dynamicViewContainer>(...)");
        M(frameLayout);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:10|(4:12|(3:16|(1:18)(1:368)|(4:20|(1:22)|23|(12:25|26|27|(1:29)(1:365)|30|(1:32)|34|(1:364)(1:40)|(3:42|(1:362)(1:48)|(3:327|328|(3:330|331|(6:333|(3:343|(1:349)|350)(1:335)|336|(1:338)(1:342)|339|(1:341))(2:351|(3:354|(1:358)|359)(1:353))))(3:50|(1:326)(1:56)|(1:58)(3:59|(1:325)(1:65)|(1:67)(5:68|(1:324)(1:74)|(7:76|(1:78)(1:293)|79|(1:292)(1:83)|84|(1:291)(1:88)|(7:92|(1:94)(1:290)|95|(1:97)(1:289)|98|(1:288)(1:104)|105))(3:294|(1:296)(1:323)|(2:316|(3:318|(1:320)(1:322)|321))(5:300|(1:302)(1:315)|(1:304)(1:314)|305|(3:309|(1:311)(1:313)|312)))|106|107))))|363|106|107)))|369|107)(1:370)|108|(1:287)(3:110|(1:286)(1:114)|(46:116|(4:118|(1:120)(1:124)|121|(1:123))|125|126|127|128|(2:130|(3:132|(1:134)(1:136)|135))|137|(1:139)(1:282)|(1:141)(1:281)|142|143|(2:145|(3:147|(1:149)(1:151)|150))|152|(1:154)(1:280)|(1:156)(1:278)|157|(1:159)(1:277)|160|(1:162)(1:276)|163|(1:165)|166|(6:168|(3:170|(1:172)(1:175)|(1:174))|176|(1:178)|179|(1:181)(1:272))(2:273|(1:275))|182|(1:184)|185|186|187|(1:189)(1:269)|190|(1:192)(1:268)|(1:194)(1:267)|195|(13:197|(7:201|202|(3:204|(1:206)(1:212)|(1:211))|213|(2:215|(1:217))|218|(1:220))|263|222|223|224|(1:226)(1:260)|227|(1:229)(3:251|(1:259)(1:257)|258)|(2:231|(1:233))(2:248|(1:250))|234|(6:236|(1:238)(1:246)|(1:240)(1:245)|241|(1:243)|244)|247)(2:264|(1:266))|221|222|223|224|(0)(0)|227|(0)(0)|(0)(0)|234|(0)|247))|285|(0)|125|126|127|128|(0)|137|(0)(0)|(0)(0)|142|143|(0)|152|(0)(0)|(0)(0)|157|(0)(0)|160|(0)(0)|163|(0)|166|(0)(0)|182|(0)|185|186|187|(0)(0)|190|(0)(0)|(0)(0)|195|(0)(0)|221|222|223|224|(0)(0)|227|(0)(0)|(0)(0)|234|(0)|247) */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x069f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x06a0, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace(j(), r0, "fillPromotionalBar Error", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x05e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05e9, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace(k(), r0, "fillRollViewInfo Error", new java.lang.Object[r13]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x03f2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x03f3, code lost:
    
        com.tencent.mars.xlog.Log.e(j(), "fillSelectButtons, exp=" + android.util.Log.getStackTraceString(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0373 A[Catch: all -> 0x03f2, TRY_ENTER, TryCatch #1 {all -> 0x03f2, blocks: (B:127:0x036b, B:130:0x0373, B:132:0x037d, B:134:0x0387, B:135:0x038c, B:137:0x038f, B:139:0x0395, B:142:0x03ae, B:145:0x03b6, B:147:0x03c0, B:149:0x03ca, B:150:0x03cf, B:152:0x03d2, B:154:0x03d8, B:278:0x03e6, B:281:0x03a3), top: B:126:0x036b }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0395 A[Catch: all -> 0x03f2, TryCatch #1 {all -> 0x03f2, blocks: (B:127:0x036b, B:130:0x0373, B:132:0x037d, B:134:0x0387, B:135:0x038c, B:137:0x038f, B:139:0x0395, B:142:0x03ae, B:145:0x03b6, B:147:0x03c0, B:149:0x03ca, B:150:0x03cf, B:152:0x03d2, B:154:0x03d8, B:278:0x03e6, B:281:0x03a3), top: B:126:0x036b }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b6 A[Catch: all -> 0x03f2, TRY_ENTER, TryCatch #1 {all -> 0x03f2, blocks: (B:127:0x036b, B:130:0x0373, B:132:0x037d, B:134:0x0387, B:135:0x038c, B:137:0x038f, B:139:0x0395, B:142:0x03ae, B:145:0x03b6, B:147:0x03c0, B:149:0x03ca, B:150:0x03cf, B:152:0x03d2, B:154:0x03d8, B:278:0x03e6, B:281:0x03a3), top: B:126:0x036b }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d8 A[Catch: all -> 0x03f2, TryCatch #1 {all -> 0x03f2, blocks: (B:127:0x036b, B:130:0x0373, B:132:0x037d, B:134:0x0387, B:135:0x038c, B:137:0x038f, B:139:0x0395, B:142:0x03ae, B:145:0x03b6, B:147:0x03c0, B:149:0x03ca, B:150:0x03cf, B:152:0x03d2, B:154:0x03d8, B:278:0x03e6, B:281:0x03a3), top: B:126:0x036b }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0523 A[Catch: all -> 0x05e8, TryCatch #2 {all -> 0x05e8, blocks: (B:187:0x051d, B:189:0x0523, B:190:0x0530, B:192:0x053c, B:195:0x0547, B:197:0x054c, B:201:0x0558, B:204:0x0567, B:206:0x056d, B:208:0x057a, B:211:0x0581, B:213:0x0591, B:215:0x0597, B:217:0x05a1, B:218:0x05b7, B:220:0x05c1, B:263:0x05d0, B:264:0x05dd, B:266:0x05e2), top: B:186:0x051d }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x053c A[Catch: all -> 0x05e8, TryCatch #2 {all -> 0x05e8, blocks: (B:187:0x051d, B:189:0x0523, B:190:0x0530, B:192:0x053c, B:195:0x0547, B:197:0x054c, B:201:0x0558, B:204:0x0567, B:206:0x056d, B:208:0x057a, B:211:0x0581, B:213:0x0591, B:215:0x0597, B:217:0x05a1, B:218:0x05b7, B:220:0x05c1, B:263:0x05d0, B:264:0x05dd, B:266:0x05e2), top: B:186:0x051d }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x054c A[Catch: all -> 0x05e8, TryCatch #2 {all -> 0x05e8, blocks: (B:187:0x051d, B:189:0x0523, B:190:0x0530, B:192:0x053c, B:195:0x0547, B:197:0x054c, B:201:0x0558, B:204:0x0567, B:206:0x056d, B:208:0x057a, B:211:0x0581, B:213:0x0591, B:215:0x0597, B:217:0x05a1, B:218:0x05b7, B:220:0x05c1, B:263:0x05d0, B:264:0x05dd, B:266:0x05e2), top: B:186:0x051d }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0616 A[Catch: all -> 0x069f, TryCatch #3 {all -> 0x069f, blocks: (B:224:0x0610, B:226:0x0616, B:227:0x0623, B:229:0x0638, B:231:0x065f, B:233:0x0667, B:248:0x0694, B:250:0x0699, B:251:0x063d, B:253:0x0645, B:255:0x064f, B:258:0x0659), top: B:223:0x0610 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0638 A[Catch: all -> 0x069f, TryCatch #3 {all -> 0x069f, blocks: (B:224:0x0610, B:226:0x0616, B:227:0x0623, B:229:0x0638, B:231:0x065f, B:233:0x0667, B:248:0x0694, B:250:0x0699, B:251:0x063d, B:253:0x0645, B:255:0x064f, B:258:0x0659), top: B:223:0x0610 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x065f A[Catch: all -> 0x069f, TryCatch #3 {all -> 0x069f, blocks: (B:224:0x0610, B:226:0x0616, B:227:0x0623, B:229:0x0638, B:231:0x065f, B:233:0x0667, B:248:0x0694, B:250:0x0699, B:251:0x063d, B:253:0x0645, B:255:0x064f, B:258:0x0659), top: B:223:0x0610 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0694 A[Catch: all -> 0x069f, TryCatch #3 {all -> 0x069f, blocks: (B:224:0x0610, B:226:0x0616, B:227:0x0623, B:229:0x0638, B:231:0x065f, B:233:0x0667, B:248:0x0694, B:250:0x0699, B:251:0x063d, B:253:0x0645, B:255:0x064f, B:258:0x0659), top: B:223:0x0610 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x063d A[Catch: all -> 0x069f, TryCatch #3 {all -> 0x069f, blocks: (B:224:0x0610, B:226:0x0616, B:227:0x0623, B:229:0x0638, B:231:0x065f, B:233:0x0667, B:248:0x0694, B:250:0x0699, B:251:0x063d, B:253:0x0645, B:255:0x064f, B:258:0x0659), top: B:223:0x0610 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05dd A[Catch: all -> 0x05e8, TryCatch #2 {all -> 0x05e8, blocks: (B:187:0x051d, B:189:0x0523, B:190:0x0530, B:192:0x053c, B:195:0x0547, B:197:0x054c, B:201:0x0558, B:204:0x0567, B:206:0x056d, B:208:0x057a, B:211:0x0581, B:213:0x0591, B:215:0x0597, B:217:0x05a1, B:218:0x05b7, B:220:0x05c1, B:263:0x05d0, B:264:0x05dd, B:266:0x05e2), top: B:186:0x051d }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03e6 A[Catch: all -> 0x03f2, TRY_LEAVE, TryCatch #1 {all -> 0x03f2, blocks: (B:127:0x036b, B:130:0x0373, B:132:0x037d, B:134:0x0387, B:135:0x038c, B:137:0x038f, B:139:0x0395, B:142:0x03ae, B:145:0x03b6, B:147:0x03c0, B:149:0x03ca, B:150:0x03cf, B:152:0x03d2, B:154:0x03d8, B:278:0x03e6, B:281:0x03a3), top: B:126:0x036b }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03a3 A[Catch: all -> 0x03f2, TryCatch #1 {all -> 0x03f2, blocks: (B:127:0x036b, B:130:0x0373, B:132:0x037d, B:134:0x0387, B:135:0x038c, B:137:0x038f, B:139:0x0395, B:142:0x03ae, B:145:0x03b6, B:147:0x03c0, B:149:0x03ca, B:150:0x03cf, B:152:0x03d2, B:154:0x03d8, B:278:0x03e6, B:281:0x03a3), top: B:126:0x036b }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x039e  */
    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.o2.q(java.lang.Object):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        P();
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
    }
}
