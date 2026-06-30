package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class i implements com.tencent.mm.plugin.sns.ui.widget.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.y f163341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f163342b;

    public i(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar, android.view.View view) {
        this.f163341a = yVar;
        this.f163342b = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    @Override // com.tencent.mm.plugin.sns.ui.widget.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        android.content.Context context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
        com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar = this.f163341a;
        java.lang.String j17 = yVar.j();
        android.view.View view = this.f163342b;
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            context = yVar.F;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            try {
            } catch (java.lang.Throwable th6) {
                th = th6;
                str = j17;
                ca4.q.c(str, th);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            z17 = j17;
        }
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
        } else if (com.tencent.mm.plugin.sns.ad.widget.adpag.y.z(yVar) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
        } else {
            com.tencent.mm.plugin.sns.ad.widget.adpag.a y17 = com.tencent.mm.plugin.sns.ad.widget.adpag.y.y(yVar);
            try {
            } catch (java.lang.Throwable th8) {
                th = th8;
                str = z17;
                ca4.q.c(str, th);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
            }
            if (y17 != null) {
                int i17 = y17.f163324a;
                com.tencent.mm.plugin.sns.ad.widget.adpag.a y18 = com.tencent.mm.plugin.sns.ad.widget.adpag.y.y(yVar);
                if (y18 != null) {
                    int i18 = y18.f163325b;
                    com.tencent.mm.plugin.sns.ad.widget.adpag.a y19 = com.tencent.mm.plugin.sns.ad.widget.adpag.y.y(yVar);
                    if (y19 != null) {
                        int i19 = y19.f163326c;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAvailableWidth$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                        float f17 = yVar.E;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAvailableWidth$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                        int i27 = (int) f17;
                        if (i17 <= 0) {
                            com.tencent.mars.xlog.Log.e(yVar.j(), "containerWidth <= 0");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
                        } else {
                            int i28 = (i18 * i27) / i17;
                            int i29 = (i27 * 8) / i17;
                            int i37 = (i19 * i27) / i17;
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            android.widget.LinearLayout z18 = com.tencent.mm.plugin.sns.ad.widget.adpag.y.z(yVar);
                            if (z18 != null) {
                                z18.getLocationOnScreen(iArr2);
                            }
                            android.widget.LinearLayout z19 = com.tencent.mm.plugin.sns.ad.widget.adpag.y.z(yVar);
                            kotlin.jvm.internal.o.d(z19);
                            int height = z19.getHeight() + iArr2[1];
                            int i38 = (((height + i29) + i37) - iArr[1]) - i28;
                            int i39 = iArr2[0] - iArr[0];
                            com.tencent.mars.xlog.Log.i(yVar.j(), "adjustContentContainerLayout, imagesKeeperLayoutBottomOffset is " + height + ", realBottomMarginOffset is " + i29 + ", realBottomBarOffset is " + i37);
                            android.widget.FrameLayout B = com.tencent.mm.plugin.sns.ad.widget.adpag.y.B(yVar);
                            android.view.ViewGroup.LayoutParams layoutParams = B != null ? B.getLayoutParams() : null;
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                            if (marginLayoutParams != null) {
                                marginLayoutParams.width = i27;
                                marginLayoutParams.height = i28;
                                marginLayoutParams.leftMargin = i39;
                                marginLayoutParams.topMargin = i38;
                            }
                            android.widget.FrameLayout B2 = com.tencent.mm.plugin.sns.ad.widget.adpag.y.B(yVar);
                            if (B2 != null) {
                                B2.setVisibility(0);
                            }
                            android.widget.FrameLayout B3 = com.tencent.mm.plugin.sns.ad.widget.adpag.y.B(yVar);
                            if (B3 != null) {
                                B3.requestLayout();
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdGeneralPAGSpaceView$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                            android.widget.FrameLayout frameLayout = yVar.B;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdGeneralPAGSpaceView$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                            java.lang.Object layoutParams2 = frameLayout != null ? frameLayout.getLayoutParams() : null;
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (marginLayoutParams2 != null) {
                                marginLayoutParams2.width = i27;
                                marginLayoutParams2.height = i37;
                                marginLayoutParams2.topMargin = i29;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                                android.content.Context context2 = yVar.F;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                                marginLayoutParams2.bottomMargin = i65.a.b(context2, 5);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdGeneralPAGSpaceView$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                            android.widget.FrameLayout frameLayout2 = yVar.B;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdGeneralPAGSpaceView$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                            if (frameLayout2 != null) {
                                frameLayout2.requestLayout();
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
                        }
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
                }
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$adjustContentContainerLayout$1");
    }
}
