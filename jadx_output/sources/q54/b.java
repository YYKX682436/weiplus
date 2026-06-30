package q54;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final za4.x0 f360204a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f360205b = false;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView f360206c;

    public b(za4.x0 x0Var) {
        this.f360204a = x0Var;
    }

    public boolean a(android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("attachFloatPageViewToParentIfExist", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        this.f360205b = false;
        if (viewGroup == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachFloatPageViewToParentIfExist", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
            return false;
        }
        try {
            ab4.b0 b17 = b();
            if (b17 != null) {
                com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView = new com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView(viewGroup.getContext());
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("sns_float_component_id", b17.f2817d);
                if (bundle != null && bundle.size() > 0) {
                    bundle2.putAll(bundle);
                }
                snsAdLandingPageFloatView.e(bundle2, (za4.g0) this.f360204a.f471214a.get(0));
                viewGroup.addView(snsAdLandingPageFloatView, viewGroup.getChildCount() - 1, new android.view.ViewGroup.LayoutParams(-1, -1));
                this.f360206c = snsAdLandingPageFloatView;
                this.f360205b = true;
                c(b17.G);
            }
        } catch (java.lang.Throwable unused) {
        }
        boolean z17 = this.f360205b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachFloatPageViewToParentIfExist", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        return z17;
    }

    public final ab4.b0 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        za4.x0 x0Var = this.f360204a;
        if (x0Var != null) {
            java.util.LinkedList linkedList = x0Var.f471214a;
            if (a84.b0.e(linkedList)) {
                za4.g0 g0Var = (za4.g0) linkedList.get(0);
                if (g0Var != null) {
                    java.util.Map map = g0Var.f471084d;
                    if (!a84.b0.c(map)) {
                        for (ab4.d0 d0Var : ((java.util.LinkedHashMap) map).values()) {
                            if (d0Var instanceof ab4.b0) {
                                ab4.b0 b0Var = (ab4.b0) d0Var;
                                if (b0Var.H > 0) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
                                    return b0Var;
                                }
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
                return null;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        return null;
    }

    public final void c(float f17) {
        android.view.View childAt;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFloatChildViewElevation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView = this.f360206c;
        if (snsAdLandingPageFloatView != null && snsAdLandingPageFloatView.getChildCount() > 0 && (childAt = snsAdLandingPageFloatView.getChildAt(0)) != null) {
            android.content.Context context = childAt.getContext();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createDrawable", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setColor(context.getResources().getColor(com.tencent.mm.R.color.a4z));
            gradientDrawable.setCornerRadius(f17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createDrawable", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
            childAt.setBackground(gradientDrawable);
            childAt.setElevation(childAt.getContext().getResources().getDimension(com.tencent.mm.R.dimen.a_d));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFloatChildViewElevation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
    }
}
