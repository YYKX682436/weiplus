package y84;

/* loaded from: classes4.dex */
public final class h0 implements com.tencent.mm.plugin.sns.ui.widget.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f460063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f460064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f460065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f460066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f460067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f460068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f460069h;

    public h0(y84.h3 h3Var, int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f460062a = h3Var;
        this.f460063b = i17;
        this.f460064c = i18;
        this.f460065d = i19;
        this.f460066e = i27;
        this.f460067f = i28;
        this.f460068g = i29;
        this.f460069h = i37;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1");
        y84.h3 h3Var = this.f460062a;
        java.lang.String j17 = h3Var.j();
        int i17 = this.f460063b;
        int i18 = this.f460064c;
        int i19 = this.f460065d;
        int i27 = this.f460066e;
        int i28 = this.f460067f;
        int i29 = this.f460068g;
        int i37 = this.f460069h;
        try {
        } catch (java.lang.Throwable th6) {
            th = th6;
            str = "onPreDraw";
        }
        if (h3Var.W() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) h3Var.f460095s).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            if (linearLayout != null) {
                int[] iArr = new int[2];
                h3Var.W().getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                linearLayout.getLocationOnScreen(iArr2);
                int height = linearLayout.getHeight();
                str = "onPreDraw";
                try {
                    int i38 = iArr2[0] - iArr[0];
                    int i39 = iArr2[1] - iArr[1];
                    java.lang.String j18 = h3Var.j();
                    str2 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1";
                    try {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("testOnPreDraw, inLargeWindow is ");
                        i64.b0 C = y84.h3.C(h3Var);
                        C.getClass();
                        str3 = j17;
                        try {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMInLargeWindow", "com.tencent.mm.plugin.sns.ad.model.AdViewComponentData");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMInLargeWindow", "com.tencent.mm.plugin.sns.ad.model.AdViewComponentData");
                            sb6.append(C.f289083d);
                            sb6.append(", imagesKeeperLayoutHeight is ");
                            sb6.append(height);
                            sb6.append(", imagesKeeperLayoutHeightCalc is ");
                            sb6.append(i17);
                            sb6.append(", topMargin is ");
                            sb6.append(i39);
                            sb6.append(", topMarginCalc is ");
                            sb6.append(i18);
                            sb6.append(", leftMargin is ");
                            sb6.append(i38);
                            sb6.append(", leftMarginCalc is ");
                            sb6.append(i19);
                            com.tencent.mars.xlog.Log.w(j18, sb6.toString());
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                            h3Var.Q(height, i38, i39, i27, i28, i29, i37);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                            android.widget.LinearLayout F = y84.h3.F(h3Var);
                            if (F != null) {
                                F.setVisibility(0);
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            ca4.q.c(str3, th);
                            str4 = str;
                            str5 = str2;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        str3 = j17;
                        ca4.q.c(str3, th);
                        str4 = str;
                        str5 = str2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    str2 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1";
                    str3 = j17;
                    ca4.q.c(str3, th);
                    str4 = str;
                    str5 = str2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
                }
                str4 = str;
                str5 = str2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1");
        }
        str4 = "onPreDraw";
        str5 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
    }
}
