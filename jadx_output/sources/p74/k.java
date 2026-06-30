package p74;

/* loaded from: classes4.dex */
public abstract class k {
    public static final void a(android.view.View view, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, android.view.ViewGroup viewGroup3, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return;
        }
        if (viewGroup == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return;
        }
        if (viewGroup2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return;
        }
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("AdSlideCardLogicHelper", "adjustContentContainerLayout, adDisplayWidth <= 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return;
        }
        if (i18 == 0) {
            a84.y0.m(viewGroup3, false);
        }
        a84.y0.m(viewGroup, false);
        a84.y0.m(viewGroup2, false);
        layoutParams.width = i17;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
    }

    public static final int b(android.content.Context context, int i17, boolean z17) {
        int b17;
        int i18;
        int i19;
        android.view.Display defaultDisplay;
        android.view.Display defaultDisplay2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return 0;
        }
        if (z17) {
            i19 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aav);
        } else {
            java.lang.Object systemService = context.getSystemService("window");
            android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
            int min = java.lang.Math.min((windowManager == null || (defaultDisplay2 = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay2.getWidth(), (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay.getHeight());
            int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 56);
            if (i17 == 0) {
                b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 14);
                i18 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
            } else {
                b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
                i18 = b17;
            }
            i19 = ((min - b18) - b17) - i18;
        }
        com.tencent.mars.xlog.Log.i("AdSlideCardLogicHelper", "getAdDisplayWidth, source is " + i17 + ", remainSpace is " + i19 + " and inLargeWindow is " + z17);
        if (i19 <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        return i19;
    }

    public static final p74.j c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardSizeInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        p74.j jVar = i17 != 1 ? i17 != 2 ? new p74.j(234.0f, 132.0f, 28.0f, 24.0f) : new p74.j(127.0f, 225.0f, 28.0f, 24.0f) : new p74.j(234.0f, 132.0f, 28.0f, 24.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardSizeInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        return jVar;
    }

    public static final int d(s34.x0 x0Var) {
        r45.jj4 jj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardSpecType", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        if (x0Var == null || (jj4Var = x0Var.f402828e) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardSpecType", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return 1;
        }
        r45.lj4 lj4Var = jj4Var.f377865p;
        int i17 = (lj4Var != null ? (int) lj4Var.f379520d : 0) <= (lj4Var != null ? (int) lj4Var.f379521e : 0) ? 2 : 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardSpecType", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        return i17;
    }
}
