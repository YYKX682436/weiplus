package g44;

/* loaded from: classes4.dex */
public final class k extends j44.j {
    public final ya2.n1 A;
    public final jz5.g B;
    public android.widget.LinearLayout C;
    public android.widget.FrameLayout D;
    public android.widget.LinearLayout E;
    public android.widget.LinearLayout F;
    public android.widget.LinearLayout G;

    public k(android.content.Context context, ya2.n1 n1Var) {
        super(context);
        this.A = n1Var;
        this.B = jz5.h.b(new g44.h(context));
    }

    @Override // j44.j
    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDeleteHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDeleteHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        return com.tencent.mm.R.layout.aj8;
    }

    @Override // j44.j
    public int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        return com.tencent.mm.R.layout.dff;
    }

    @Override // j44.j
    public java.lang.String k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        return "AdFinderDownloadAppHalfScreenHelper";
    }

    @Override // j44.j
    public void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        ya2.n1 n1Var = this.A;
        if (n1Var != null) {
            ((xc2.s1) n1Var).f453294a.P6();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void n(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openUrl", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            k();
            com.tencent.mars.xlog.Log.e("AdFinderDownloadAppHalfScreenHelper", "openUrl but url is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openUrl", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
            return;
        }
        ya2.n1 n1Var = this.A;
        if (n1Var != null) {
            kotlin.jvm.internal.o.d(str);
            xc2.s1 s1Var = (xc2.s1) n1Var;
            xc2.y2.f453343a.J(s1Var.f453295b, s1Var.f453296c, str, s1Var.f453297d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openUrl", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void r(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnOrProgressBarVisible", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRoundProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            com.tencent.mm.ui.widget.progress.RoundProgressBtn roundProgressBtn = this.f297686d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRoundProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            if (roundProgressBtn != null) {
                roundProgressBtn.setVisibility(4);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDownloadAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton adAppCompatButton = this.f297688f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDownloadAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            if (adAppCompatButton != null) {
                adAppCompatButton.setVisibility(0);
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRoundProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            com.tencent.mm.ui.widget.progress.RoundProgressBtn roundProgressBtn2 = this.f297686d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRoundProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            if (roundProgressBtn2 != null) {
                roundProgressBtn2.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDownloadAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatButton adAppCompatButton2 = this.f297688f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDownloadAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            if (adAppCompatButton2 != null) {
                adAppCompatButton2.setVisibility(4);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnOrProgressBarVisible", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void s(int i17, int i18) {
        java.lang.String str;
        ya2.n1 n1Var;
        int i19;
        int i27;
        int i28;
        int i29;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        if (f() == null) {
            k();
            com.tencent.mars.xlog.Log.e("AdFinderDownloadAppHalfScreenHelper", "showBottomSheet, adDownloadParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
            return;
        }
        m();
        android.view.View g17 = g();
        this.C = g17 != null ? (android.widget.LinearLayout) g17.findViewById(com.tencent.mm.R.id.ofg) : null;
        android.view.View g18 = g();
        this.D = g18 != null ? (android.widget.FrameLayout) g18.findViewById(com.tencent.mm.R.id.ck9) : null;
        android.view.View g19 = g();
        this.E = g19 != null ? (android.widget.LinearLayout) g19.findViewById(com.tencent.mm.R.id.f483436au4) : null;
        android.view.View i37 = i();
        this.F = i37 != null ? (android.widget.LinearLayout) i37.findViewById(com.tencent.mm.R.id.ck6) : null;
        android.view.View i38 = i();
        this.G = i38 != null ? (android.widget.LinearLayout) i38.findViewById(com.tencent.mm.R.id.ahd) : null;
        ya2.n1 n1Var2 = this.A;
        int a17 = n1Var2 != null ? ((xc2.s1) n1Var2).a() : 0;
        if (a17 <= 0) {
            k();
            com.tencent.mars.xlog.Log.e("AdFinderDownloadAppHalfScreenHelper", "half screen height less than 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        int g27 = com.tencent.mm.ui.bl.g(h());
        k();
        com.tencent.mars.xlog.Log.i("AdFinderDownloadAppHalfScreenHelper", "halfScreenHeight is " + a17 + ", navigationBarHeight is " + g27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeDownloadUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        int b17 = (a17 - i65.a.b(h(), g27 == 0 ? 398 : com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE)) - g27;
        int b18 = i65.a.b(h(), 199);
        int b19 = i65.a.b(h(), 24);
        float f17 = b19 / 0.5f;
        k();
        com.tencent.mars.xlog.Log.i("AdFinderDownloadAppHalfScreenHelper", "resizeDownloadUI, remainSpace is " + b17 + ", minTotalMargins is " + f17 + ", maxMargins is " + b18 + ", topMarginRadio1 is 0.21428572, topMarginRadio2 is 0.5, topMarginRadio3 is 0.2857143");
        android.widget.LinearLayout linearLayout = this.E;
        android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout != null ? linearLayout.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
        if (g27 == 0) {
            if (layoutParams3 == null) {
                str = "showDownloadHalfScreen";
            } else {
                str = "showDownloadHalfScreen";
                layoutParams3.bottomMargin = i65.a.b(h(), 48);
            }
            android.widget.LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setLayoutParams(layoutParams3);
            }
        } else {
            str = "showDownloadHalfScreen";
        }
        if (b17 < b18) {
            float f18 = b17;
            if (f18 > f17) {
                i29 = (int) (0.21428572f * f18);
                i28 = (int) (f18 * 0.5f);
                i27 = (int) (f18 * 0.2857143f);
            } else {
                i27 = b19;
                i28 = i27;
                i29 = 0;
            }
            k();
            com.tencent.mars.xlog.Log.i("AdFinderDownloadAppHalfScreenHelper", "resizeDownloadUI, topMargin1 is " + i29 + ", topMargin2 is " + i28 + ", topMargin3 is " + i27);
            android.widget.LinearLayout linearLayout3 = this.C;
            android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout3 != null ? linearLayout3.getLayoutParams() : null;
            android.widget.LinearLayout.LayoutParams layoutParams5 = layoutParams4 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams4 : null;
            android.widget.FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
                n1Var = n1Var2;
            } else {
                n1Var = n1Var2;
                layoutParams = null;
            }
            android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams5 != null) {
                layoutParams5.topMargin = i29;
            }
            if (layoutParams6 != null) {
                layoutParams6.topMargin = i28;
            }
            if (layoutParams3 != null) {
                layoutParams3.topMargin = i27;
            }
            android.widget.LinearLayout linearLayout4 = this.C;
            if (linearLayout4 != null) {
                linearLayout4.setLayoutParams(layoutParams5);
            }
            android.widget.FrameLayout frameLayout2 = this.D;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams6);
            }
            android.widget.LinearLayout linearLayout5 = this.E;
            if (linearLayout5 != null) {
                linearLayout5.setLayoutParams(layoutParams3);
            }
        } else {
            n1Var = n1Var2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeDownloadUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeDownloadDeleteUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        int b27 = (a17 - i65.a.b(h(), g27 == 0 ? 292 : 228)) - g27;
        int b28 = i65.a.b(h(), 305);
        int b29 = i65.a.b(h(), 24);
        float f19 = b29 / 0.84210527f;
        k();
        com.tencent.mars.xlog.Log.i("AdFinderDownloadAppHalfScreenHelper", "resizeDownloadDeleteUI, remainSpace is " + b27 + ", minTotalMargins is " + f19 + ", maxMargins is " + b28 + ", topMarginRadio4 is 0.15789473, topMarginRadio5 is 0.84210527");
        android.widget.LinearLayout linearLayout6 = this.G;
        android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout6 != null ? linearLayout6.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
        if (g27 == 0) {
            if (layoutParams8 != null) {
                layoutParams8.bottomMargin = i65.a.b(h(), 64);
            }
            android.widget.LinearLayout linearLayout7 = this.G;
            if (linearLayout7 != null) {
                linearLayout7.setLayoutParams(layoutParams8);
            }
        }
        if (b27 < b28) {
            float f27 = b27;
            if (f27 > f19) {
                b29 = (int) (f27 * 0.84210527f);
                i19 = (int) (0.15789473f * f27);
            } else {
                i19 = 0;
            }
            k();
            com.tencent.mars.xlog.Log.i("AdFinderDownloadAppHalfScreenHelper", "resizeDownloadDeleteUI, topMargin4 is " + i19 + ", topMargin5 is " + b29);
            android.widget.LinearLayout linearLayout8 = this.F;
            android.view.ViewGroup.LayoutParams layoutParams9 = linearLayout8 != null ? linearLayout8.getLayoutParams() : null;
            android.widget.LinearLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams9 : null;
            if (layoutParams10 != null) {
                layoutParams10.topMargin = i19;
            }
            if (layoutParams8 != null) {
                layoutParams8.topMargin = b29;
            }
            android.widget.LinearLayout linearLayout9 = this.F;
            if (linearLayout9 != null) {
                linearLayout9.setLayoutParams(layoutParams10);
            }
            android.widget.LinearLayout linearLayout10 = this.G;
            if (linearLayout10 != null) {
                linearLayout10.setLayoutParams(layoutParams8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeDownloadDeleteUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        q();
        u().addView(g());
        if (n1Var != null) {
            android.widget.ScrollView customContent = u();
            g44.i iVar = new g44.i(this);
            kotlin.jvm.internal.o.g(customContent, "customContent");
            gx2.q Q6 = ((xc2.s1) n1Var).f453294a.Q6(customContent);
            if (Q6 != null) {
                Q6.setContentReachTop(iVar);
            }
        }
        if (n1Var != null) {
            ((xc2.s1) n1Var).b(new g44.j(this));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        this.f297705w = currentTimeMillis;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        b(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void t(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
            return;
        }
        u().removeAllViews();
        u().addView(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
    }

    public final android.widget.ScrollView u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        android.widget.ScrollView scrollView = (android.widget.ScrollView) ((jz5.n) this.B).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        return scrollView;
    }
}
