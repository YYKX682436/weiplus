package v74;

/* loaded from: classes4.dex */
public final class r {
    public r(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.view.View view, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, android.view.ViewGroup viewGroup3, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            return;
        }
        if (viewGroup == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            return;
        }
        if (viewGroup2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            return;
        }
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("AdLookbookLogic", "adjustContentContainerLayout, adDisplayWidth <= 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            return;
        }
        com.tencent.mars.xlog.Log.w("AdLookbookLogic", "adjustContentContainerLayout, adDisplayWidth=" + i17 + ", source=" + i18);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
    }

    public final v74.s b(android.content.Context context, boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcItemSize", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
        kotlin.jvm.internal.o.g(context, "context");
        int y17 = ca4.m0.y("AdLookbookLogic", context, i17, z17);
        if (z17) {
            y17 = java.lang.Math.min(y17, i65.a.f(context, com.tencent.mm.R.dimen.f480600aq5));
        }
        float f17 = (y17 * 3.0f) / 4.0f;
        int ceil = (int) java.lang.Math.ceil(f17);
        v74.s sVar = new v74.s(y17, ceil, (int) java.lang.Math.ceil((f17 * 9.0f) / 16.0f), ceil);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcItemSize", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
        return sVar;
    }

    public final int c(android.content.Context context, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dp2Px", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
        int ceil = (int) java.lang.Math.ceil(i65.a.g(context) * f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dp2Px", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
        return ceil;
    }

    public final int d(android.content.Context context, boolean z17, int i17, v74.s itemSize, com.tencent.mm.pointers.PBool pShowEdgeMask) {
        android.view.Display defaultDisplay;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
        kotlin.jvm.internal.o.g(itemSize, "itemSize");
        kotlin.jvm.internal.o.g(pShowEdgeMask, "pShowEdgeMask");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            return 0;
        }
        java.lang.Object systemService = context.getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        int width = (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay.getWidth();
        if (width <= 0) {
            com.tencent.mars.xlog.Log.e("AdLookbookLogic", "getAdDisplayWidth err, screenWidth=" + width + ", inLargeWindow=" + z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            return 0;
        }
        int c17 = c(context, 1.0f);
        int c18 = c(context, 54.0f);
        int a17 = itemSize.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxNumItemWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
        int b17 = (int) ((i65.a.b(context, 12) * 3) + (a17 * 3.25d));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxNumItemWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
        if (z17) {
            float f17 = ((width - (((width - i65.a.f(context, com.tencent.mm.R.dimen.aav)) - c18) * 0.5f)) - c18) + c17;
            if (f17 >= b17) {
                pShowEdgeMask.value = true;
            }
            com.tencent.mars.xlog.Log.w("AdLookbookLogic", "getAdDisplayWidth, inLargeWindow, contentW=" + f17 + ", maxWidth=" + b17 + ", extra=" + c17 + ", source=" + i17);
            int min = java.lang.Math.min((int) f17, b17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            return min;
        }
        int c19 = ((width - c18) - (i17 == 0 ? c(context, 14.0f) : c(context, 12.0f))) + c17;
        if (c19 >= b17) {
            pShowEdgeMask.value = true;
        }
        com.tencent.mars.xlog.Log.w("AdLookbookLogic", "getAdDisplayWidth, !inLargeWindow, contentW=" + c19 + ", maxWidth=" + b17 + ", extra=" + c17 + ", source=" + i17);
        int min2 = java.lang.Math.min(c19, b17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
        return min2;
    }

    public final boolean e(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLandscape", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLandscape", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            return false;
        }
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        com.tencent.mars.xlog.Log.i("AdLookbookLogic", "isLandscape, ret=" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLandscape", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(v74.b r8) {
        /*
            r7 = this;
            java.lang.String r0 = "setNotDestroyVideoNextDetach"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r8 == 0) goto L52
            android.widget.FrameLayout r2 = r8.i()
            if (r2 != 0) goto L11
            goto L52
        L11:
            android.widget.FrameLayout r2 = r8.i()
            java.lang.String r3 = "getVideoViewInContainer"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r5 = a84.y0.e(r2)
            r6 = 0
            if (r5 == 0) goto L37
            if (r2 == 0) goto L2b
            r5 = 0
            android.view.View r2 = r2.getChildAt(r5)
            goto L2c
        L2b:
            r2 = r6
        L2c:
            boolean r5 = r2 instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView
            if (r5 == 0) goto L37
            r6 = r2
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r6 = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) r6
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L3a
        L37:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L3a:
            boolean r2 = r6 instanceof com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView
            if (r2 == 0) goto L4e
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r6 = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) r6
            r2 = 1
            r6.f170645q2 = r2
            r8.getAdapterPosition()
            android.view.View r8 = r8.itemView
            r8.hashCode()
            r6.hashCode()
        L4e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L52:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.r.f(v74.b):void");
    }
}
