package n44;

/* loaded from: classes8.dex */
public final class x0 extends n44.f1 {
    @Override // n44.f1
    public void a(y54.b contentSizeAttr, android.content.Intent intent) {
        android.content.Context context;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        kotlin.jvm.internal.o.g(contentSizeAttr, "contentSizeAttr");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (g() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
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
        super.a(contentSizeAttr, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
    }

    @Override // n44.f1
    public void b(android.content.Intent intent) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createHalfScreen", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.Object clone = intent.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type android.content.Intent");
        android.content.Intent intent2 = (android.content.Intent) clone;
        pf5.j0.a(intent2, com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC.class);
        pf5.j0.a(intent2, wm3.l.class);
        boolean z17 = false;
        com.tencent.mm.ui.vas.VASCommonFragment b17 = lk5.q0.b("com.tencent.mm.plugin.profile.ui.ContactInfoUI", intent2, false, 4, null);
        b17.q0(n44.w0.f335068d);
        android.view.View h17 = h();
        android.content.Context context = h17 != null ? h17.getContext() : null;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null && (supportFragmentManager = mMActivity.getSupportFragmentManager()) != null && !supportFragmentManager.isDestroyed()) {
            z17 = true;
        }
        if (z17) {
            androidx.fragment.app.i2 beginTransaction = mMActivity.getSupportFragmentManager().beginTransaction();
            beginTransaction.k(com.tencent.mm.R.id.cgi, b17, null);
            beginTransaction.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createHalfScreen", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
    }

    @Override // n44.f1
    public int i(y54.b contentSizeAttr) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        kotlin.jvm.internal.o.g(contentSizeAttr, "contentSizeAttr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        if (h() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        } else {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context context = h().getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((c61.l7) b6Var).getClass();
            int c17 = com.tencent.mm.ui.bl.c(context);
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i18 = b17.x;
            int i19 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z17) {
                i17 = i19 - c17;
            } else {
                if (i19 >= i18) {
                    i18 = i19;
                }
                i17 = i18 - c17;
            }
            int a17 = (int) (i17 * kx2.a.f313278a.a(context));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            contentSizeAttr.f459526g = a17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        }
        int d17 = (contentSizeAttr.d() - contentSizeAttr.c()) + contentSizeAttr.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenWeComProfileHelper");
        return d17;
    }
}
