package com.tencent.mm.plugin.sns.ad.halfscreen;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/halfscreen/AdFinderOpenAppHalfScreenHelper;", "Lcom/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenOpenAppHelper;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class AdFinderOpenAppHalfScreenHelper extends com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f162657o;

    /* renamed from: p, reason: collision with root package name */
    public ya2.n1 f162658p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f162659q;

    public AdFinderOpenAppHalfScreenHelper(android.content.Context context) {
        super(context);
        this.f162657o = "AdFinderOpenAppHalfScreenHelper";
        this.f162659q = jz5.h.b(new g44.l(context));
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        return com.tencent.mm.R.layout.dfg;
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        return this.f162657o;
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        ya2.n1 n1Var = this.f162658p;
        if (n1Var != null) {
            ((xc2.s1) n1Var).f453294a.P6();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
    }

    public final android.widget.ScrollView p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        android.widget.ScrollView scrollView = (android.widget.ScrollView) ((jz5.n) this.f162659q).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        return scrollView;
    }

    public void q(ya2.n1 halfScreenListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnDetachListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        kotlin.jvm.internal.o.g(halfScreenListener, "halfScreenListener");
        ((xc2.s1) halfScreenListener).b(new g44.m(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnDetachListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
    }

    public final void r(h44.c cVar, ya2.n1 halfScreenListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        kotlin.jvm.internal.o.g(halfScreenListener, "halfScreenListener");
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e(i(), "showBottomSheet, adOpenAppParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
            return;
        }
        m(cVar);
        this.f162658p = halfScreenListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        k();
        ya2.n1 n1Var = this.f162658p;
        int i17 = 0;
        int a17 = n1Var != null ? ((xc2.s1) n1Var).a() : 0;
        if (a17 <= 0) {
            com.tencent.mars.xlog.Log.e(i(), "half screen height less than 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        } else {
            a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
            int g17 = com.tencent.mm.ui.bl.g(g());
            com.tencent.mars.xlog.Log.i(i(), "halfScreenHeight is " + a17 + ", navigationBarHeight is " + g17);
            int b17 = (a17 - i65.a.b(g(), g17 == 0 ? 260 : 196)) - g17;
            int b18 = i65.a.b(g(), 305);
            int b19 = i65.a.b(g(), 24);
            float f17 = b19 / 0.85714287f;
            com.tencent.mars.xlog.Log.i(i(), "resizeUI, remainSpace is " + b17 + ", minTotalMargins is " + f17 + ", maxMargins is " + b18 + ", topMarginRadio1 is 0.14285715, topMarginRadio2 is 0.85714287");
            android.widget.Button h17 = h();
            android.view.ViewGroup.LayoutParams layoutParams = h17 != null ? h17.getLayoutParams() : null;
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (g17 == 0) {
                if (layoutParams2 != null) {
                    layoutParams2.bottomMargin = i65.a.b(g(), 64);
                }
                android.widget.Button h18 = h();
                if (h18 != null) {
                    h18.setLayoutParams(layoutParams2);
                }
            }
            if (b17 < b18) {
                float f18 = b17;
                if (f18 > f17) {
                    i17 = (int) (0.14285715f * f18);
                    b19 = (int) (f18 * 0.85714287f);
                }
                com.tencent.mars.xlog.Log.i(i(), "resizeUI, topMargin1 is " + i17 + ", topMargin2 is " + b19);
                com.tencent.mm.ui.widget.MMRoundCornerImageView e17 = e();
                android.view.ViewGroup.LayoutParams layoutParams3 = e17 != null ? e17.getLayoutParams() : null;
                android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams4 != null) {
                    layoutParams4.topMargin = i17;
                }
                if (layoutParams2 != null) {
                    layoutParams2.topMargin = b19;
                }
                com.tencent.mm.ui.widget.MMRoundCornerImageView e18 = e();
                if (e18 != null) {
                    e18.setLayoutParams(layoutParams4);
                }
                android.widget.Button h19 = h();
                if (h19 != null) {
                    h19.setLayoutParams(layoutParams2);
                }
                android.view.View f19 = f();
                if (f19 != null) {
                    f19.requestLayout();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
            n();
            p().addView(f());
            android.widget.ScrollView customContent = p();
            g44.n nVar = new g44.n(this);
            xc2.s1 s1Var = (xc2.s1) halfScreenListener;
            kotlin.jvm.internal.o.g(customContent, "customContent");
            gx2.q Q6 = s1Var.f453294a.Q6(customContent);
            if (Q6 != null) {
                Q6.setContentReachTop(nVar);
            }
            q(s1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
    }
}
