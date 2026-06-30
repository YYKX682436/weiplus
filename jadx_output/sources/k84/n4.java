package k84;

/* loaded from: classes4.dex */
public class n4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView f305149d;

    public n4(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        this.f305149d = adSocialAttitudeView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        int i18;
        int width;
        int i19;
        float f17;
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305149d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$8");
        try {
            adSocialAttitudeView.getViewTreeObserver().removeOnPreDrawListener(this);
            int i27 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.D1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            int i28 = adSocialAttitudeView.f163458v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            try {
                if (i28 == 0) {
                    try {
                        int width2 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.c(adSocialAttitudeView).getWidth();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        str3 = "onPreDraw";
                        android.widget.LinearLayout linearLayout = adSocialAttitudeView.f163463y;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int width3 = width2 - linearLayout.getWidth();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        i17 = width3;
                        i18 = adSocialAttitudeView.F;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        str3 = "onPreDraw";
                        str2 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$8";
                        str = str3;
                        com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView), th.toString());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                        return false;
                    }
                } else {
                    str3 = "onPreDraw";
                    int width4 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.c(adSocialAttitudeView).getWidth();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    android.widget.LinearLayout linearLayout2 = adSocialAttitudeView.f163463y;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int width5 = width4 - linearLayout2.getWidth();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    i17 = width5;
                    i18 = adSocialAttitudeView.G;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                }
                int i29 = i17 - i18;
                java.lang.String a17 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parentViewGroupWidth is ");
                sb6.append(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.c(adSocialAttitudeView).getWidth());
                sb6.append(", adSocialLeftViewWidth is ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                android.widget.LinearLayout linearLayout3 = adSocialAttitudeView.f163463y;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb6.append(linearLayout3.getWidth());
                sb6.append(", remainSpaceWidth is ");
                sb6.append(i29);
                com.tencent.mars.xlog.Log.i(a17, sb6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                android.widget.FrameLayout frameLayout = adSocialAttitudeView.f163448n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int width6 = frameLayout.getWidth();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                android.widget.ImageView imageView = adSocialAttitudeView.f163450p;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int width7 = width6 + imageView.getWidth();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i37 = adSocialAttitudeView.A;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i38 = width7 + i37;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i39 = adSocialAttitudeView.B;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i47 = i38 + i39 + 1;
                android.view.View findViewById = adSocialAttitudeView.findViewById(com.tencent.mm.R.id.q4a);
                if (findViewById != null && findViewById.getWidth() > 0) {
                    i47 = java.lang.Math.max(i47, findViewById.getWidth());
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView), "contentWidth = " + i47 + "  continuousContent width = " + findViewById.getWidth());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = adSocialAttitudeView.f163457u;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                if (snsInfo != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = adSocialAttitudeView.f163457u;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (snsInfo2.isFireworkCheerAd()) {
                        int a18 = a84.d0.a(32);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        android.widget.ImageView imageView2 = adSocialAttitudeView.f163450p;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int width8 = a18 + imageView2.getWidth();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i48 = adSocialAttitudeView.A;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i49 = width8 + i48;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i57 = adSocialAttitudeView.B;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        i47 = i49 + i57 + 1;
                    }
                }
                java.lang.String a19 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("cheerTextMax is ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i58 = adSocialAttitudeView.A;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb7.append(i58);
                sb7.append(", commentTextMax is ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i59 = adSocialAttitudeView.B;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb7.append(i59);
                sb7.append(", contentWidth is ");
                sb7.append(i47);
                com.tencent.mars.xlog.Log.i(a19, sb7.toString());
                int i66 = i29 - i47;
                java.lang.String a27 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("marginWidth is ");
                sb8.append(i66);
                sb8.append(", maxMarginWidth is ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i67 = adSocialAttitudeView.f163439J;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb8.append(i67);
                sb8.append(", minMarginWidth is ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i68 = adSocialAttitudeView.L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb8.append(i68);
                sb8.append(", mPreviousLineStatus is ");
                sb8.append(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.d(adSocialAttitudeView));
                com.tencent.mars.xlog.Log.i(a27, sb8.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i69 = adSocialAttitudeView.L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                if (i66 >= i69) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i76 = adSocialAttitudeView.f163439J;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (i66 < i76) {
                        float f18 = i66;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i77 = adSocialAttitudeView.f163439J;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        f17 = f18 / i77;
                    } else {
                        f17 = 1.0f;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i78 = adSocialAttitudeView.C;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i79 = (int) (i78 * f17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i86 = adSocialAttitudeView.D;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i87 = (int) (i86 * f17);
                    com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.e(adSocialAttitudeView, i79, i87);
                    com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.f(adSocialAttitudeView, false, 0);
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView), "marginOuter is " + i79 + ", marginInner is " + i87 + ", rate is " + f17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i88 = adSocialAttitudeView.f163458v;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (i88 == 0) {
                        if (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.d(adSocialAttitudeView) != 2 && com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.d(adSocialAttitudeView) != 0) {
                            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) adSocialAttitudeView.getLayoutParams();
                            layoutParams.gravity = 8388629;
                            adSocialAttitudeView.setLayoutParams(layoutParams);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            adSocialAttitudeView.f163441e = 1;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2902", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        adSocialAttitudeView.f163446l1 = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2902", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.g(adSocialAttitudeView);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2902", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        adSocialAttitudeView.f163446l1 = false;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2902", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.c(adSocialAttitudeView);
                        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 8388629;
                        frameLayout2.addView(adSocialAttitudeView, layoutParams2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        adSocialAttitudeView.f163441e = 1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    } else {
                        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.h(adSocialAttitudeView, false);
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i89 = adSocialAttitudeView.f163458v;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (i89 == 0) {
                        width = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.i(adSocialAttitudeView).getWidth();
                        int i96 = 0;
                        while (true) {
                            if (i96 >= com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.i(adSocialAttitudeView).getChildCount()) {
                                i96 = 0;
                                break;
                            }
                            if (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.i(adSocialAttitudeView).getChildAt(i96).getId() == com.tencent.mm.R.id.afc) {
                                break;
                            }
                            i96++;
                        }
                        if (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.d(adSocialAttitudeView) != 1 && com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.d(adSocialAttitudeView) != 0) {
                            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) adSocialAttitudeView.getLayoutParams();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            int i97 = adSocialAttitudeView.M;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            layoutParams3.topMargin = i97 / 2;
                            adSocialAttitudeView.setLayoutParams(layoutParams3);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            adSocialAttitudeView.f163441e = 2;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            i19 = 1;
                        }
                        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.g(adSocialAttitudeView);
                        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i98 = adSocialAttitudeView.M;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        layoutParams4.topMargin = i98 / 2;
                        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.i(adSocialAttitudeView).addView(adSocialAttitudeView, i96 + 1, layoutParams4);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        adSocialAttitudeView.f163441e = 2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        i19 = 1;
                    } else {
                        width = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.c(adSocialAttitudeView).getWidth();
                        i19 = 1;
                        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.h(adSocialAttitudeView, true);
                    }
                    int i99 = (width - i19) / 2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i100 = adSocialAttitudeView.E;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i101 = adSocialAttitudeView.D;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.e(adSocialAttitudeView, i100, i101);
                    com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.f(adSocialAttitudeView, true, i99);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3502", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                adSocialAttitudeView.P = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3502", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                adSocialAttitudeView.requestLayout();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3602", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                adSocialAttitudeView.Q = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3602", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$8");
                return true;
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            str = "onPreDraw";
            str2 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$8";
        }
    }
}
