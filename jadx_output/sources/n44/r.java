package n44;

/* loaded from: classes4.dex */
public final class r extends n44.f1 implements l75.q0 {

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f335032q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f335033r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f335034s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f335035t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f335036u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.Button f335037v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f335038w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f335039x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f335040y;

    @Override // n44.f1
    public void a(y54.b contentSizeAttr, android.content.Intent intent) {
        android.content.Context context;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        kotlin.jvm.internal.o.g(contentSizeAttr, "contentSizeAttr");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (g() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
            return;
        }
        int a17 = contentSizeAttr.a(g().a());
        android.view.View h17 = h();
        int b17 = a17 - i65.a.b(h17 != null ? h17.getContext() : null, 28);
        android.widget.FrameLayout c17 = c();
        android.view.ViewGroup.LayoutParams layoutParams = c17 != null ? c17.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.height = b17;
        }
        if (marginLayoutParams != null) {
            android.view.View h18 = h();
            marginLayoutParams.topMargin = i65.a.b(h18 != null ? h18.getContext() : null, 28);
        }
        android.widget.FrameLayout e17 = e();
        android.view.ViewGroup.LayoutParams layoutParams2 = e17 != null ? e17.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.height = b17;
        }
        android.view.View h19 = h();
        if (h19 != null && (context = h19.getContext()) != null && (f17 = f()) != null) {
            f17.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478605ae2));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustKefuHalfScreenLayout", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        android.widget.LinearLayout linearLayout = this.f335038w;
        int height = linearLayout != null ? linearLayout.getHeight() : 0;
        android.widget.LinearLayout linearLayout2 = this.f335039x;
        int height2 = linearLayout2 != null ? linearLayout2.getHeight() : 0;
        android.view.View h27 = h();
        int i17 = b17 - height2;
        int b18 = i65.a.b(h27 != null ? h27.getContext() : null, 20) + i17;
        android.widget.LinearLayout linearLayout3 = this.f335039x;
        android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout3 != null ? linearLayout3.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.topMargin = i17;
        }
        if (b18 < height) {
            int i18 = height - b18;
            android.view.View h28 = h();
            int b19 = i65.a.b(h28 != null ? h28.getContext() : null, 24);
            android.view.View h29 = h();
            int b27 = i65.a.b(h29 != null ? h29.getContext() : null, 48) - (i18 / 2);
            if (i18 > b19 * 2) {
                android.view.View view = this.f335040y;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenKefuConfirmHelper", "adjustKefuHalfScreenLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenKefuConfirmHelper", "adjustKefuHalfScreenLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                b19 = b27;
            }
            android.widget.TextView textView = this.f335032q;
            android.view.ViewGroup.LayoutParams layoutParams5 = textView != null ? textView.getLayoutParams() : null;
            android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.topMargin = b19;
            }
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f335034s;
            java.lang.Object layoutParams7 = mMRoundCornerImageView != null ? mMRoundCornerImageView.getLayoutParams() : null;
            android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
            if (layoutParams8 != null) {
                layoutParams8.topMargin = b19;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustKefuHalfScreenLayout", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        super.a(contentSizeAttr, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
    
        if (r5 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014a, code lost:
    
        if (r5 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016c, code lost:
    
        if (r5 != null) goto L63;
     */
    @Override // n44.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n44.r.b(android.content.Intent):void");
    }

    @Override // n44.f1
    public int i(y54.b contentSizeAttr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        kotlin.jvm.internal.o.g(contentSizeAttr, "contentSizeAttr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        if (h() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        } else {
            int d17 = (contentSizeAttr.d() * 3) / 4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            contentSizeAttr.f459526g = d17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        }
        int d18 = (contentSizeAttr.d() - contentSizeAttr.c()) + contentSizeAttr.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        return d18;
    }

    public final void j(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateOpenIMDescWording", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        if (!(str2 == null || str2.length() == 0)) {
            if (kotlin.jvm.internal.o.b("3552365301", str)) {
                str2 = "@" + str2;
            }
            android.widget.TextView textView = this.f335036u;
            if (textView != null) {
                textView.setText(str2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateOpenIMDescWording", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo d17;
        com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo d18;
        com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo d19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
            return;
        }
        if (w0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
            return;
        }
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        i64.z g17 = g();
        java.lang.String str2 = null;
        java.lang.String b17 = (g17 == null || (d19 = g17.d()) == null) ? null : d19.b();
        i64.z g18 = g();
        java.lang.String Ai = ((l41.q2) b0Var).Ai(w0Var, b17, (g18 == null || (d18 = g18.d()) == null) ? null : d18.c());
        i64.z g19 = g();
        if (g19 != null && (d17 = g19.d()) != null) {
            str2 = d17.b();
        }
        j(str2, Ai);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
    }
}
