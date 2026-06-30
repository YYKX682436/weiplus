package q74;

/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q74.t0 f360545a = new q74.t0();

    public static final void a(android.view.View view, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, android.view.ViewGroup viewGroup3, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        if (viewGroup == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        if (viewGroup2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("SlideFullCardLogicHelper", "adjustContentContainerLayout, adDisplayWidth <= 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        if (i18 == 0) {
            a84.y0.m(viewGroup3, false);
        }
        a84.y0.m(viewGroup, false);
        a84.y0.m(viewGroup2, false);
        layoutParams.width = i17;
        view.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        view.setTranslationX(-b17);
        view.requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
    }

    public static final void b(q74.y0 y0Var, int i17, int i18) {
        android.widget.FrameLayout frameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustInnerItemLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        if (i17 <= 0 || i18 <= 0) {
            com.tencent.mars.xlog.Log.e("SlideFullCardLogicHelper", "adjustInnerItemLayout, materialWidth is " + i17 + ", materialHeight is " + i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustInnerItemLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = (y0Var == null || (frameLayout = y0Var.f360572e) == null) ? null : frameLayout.getLayoutParams();
        if (layoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustInnerItemLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        layoutParams.width = i17;
        layoutParams.height = i18;
        y0Var.f360572e.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustInnerItemLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
    }

    public static final int c(android.content.Context context, int i17, boolean z17) {
        int d17;
        int i18;
        int d18;
        android.view.Display defaultDisplay;
        android.view.Display defaultDisplay2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return 0;
        }
        if (z17) {
            d18 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aav);
        } else {
            java.lang.Object systemService = context.getSystemService("window");
            android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
            int min = java.lang.Math.min((windowManager == null || (defaultDisplay2 = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay2.getWidth(), (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay.getHeight());
            q74.t0 t0Var = f360545a;
            int d19 = t0Var.d(56);
            if (i17 == 0) {
                d17 = t0Var.d(14);
                i18 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
            } else {
                d17 = t0Var.d(12);
                i18 = d17;
            }
            d18 = (((min - d19) - d17) - i18) + t0Var.d(16);
        }
        com.tencent.mars.xlog.Log.i("SlideFullCardLogicHelper", "getAdDisplayWidth, remainSpace is " + d18 + " and inLargeWindow is " + z17);
        if (d18 <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        return d18;
    }

    public static final int e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlideFullCardBreakFrameRightOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        int d17 = f360545a.d(12);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlideFullCardBreakFrameRightOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        return d17;
    }

    public static final boolean f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSlideFullCardAd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        boolean z17 = false;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSlideFullCardAd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return false;
        }
        if (snsInfo.isAd() && snsInfo.isSlideFullCardAd()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSlideFullCardAd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        return z17;
    }

    public static final void g(android.widget.ImageView imageView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBorderImage", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        if (imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBorderImage", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("SlideFullCardLogicHelper", "setBorderImage, the resInfo is img, thumbUrl is " + str);
        if (!(str == null || str.length() == 0)) {
            a84.y0.p(imageView, true);
            java.lang.String l17 = za4.t0.l("adId", str);
            imageView.setTag(com.tencent.mm.R.id.nae, str);
            if (com.tencent.mm.vfs.w6.j(l17)) {
                n74.a2.c(imageView, l17, 0);
            } else {
                n74.a2.a(imageView, str, 0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBorderImage", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
    }

    public final int d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        return b17;
    }
}
