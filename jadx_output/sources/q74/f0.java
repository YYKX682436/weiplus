package q74;

/* loaded from: classes4.dex */
public final class f0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.s0 f360456d;

    public f0(q74.s0 s0Var) {
        this.f360456d = s0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        int i17;
        s34.m1 b17;
        s34.m1 b18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$calcProductCompBreakFrameLayoutParams$1");
        q74.s0 s0Var = this.f360456d;
        if (!s0Var.k().isAttachedToWindow()) {
            com.tencent.mars.xlog.Log.w("SlideFullCardBreakFrameUICtrl", "calcProductCompBreakFrameLayoutParams, mRecycleViewContainer is not attach to window");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$calcProductCompBreakFrameLayoutParams$1");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMContentView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        android.view.View view = s0Var.f360499h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMContentView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        if (view == null) {
            com.tencent.mars.xlog.Log.e("SlideFullCardBreakFrameUICtrl", "calcProductCompBreakFrameLayoutParams, mContentView is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$calcProductCompBreakFrameLayoutParams$1");
            return true;
        }
        int[] iArr = new int[2];
        s0Var.k().getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMItemRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMItemRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s0Var.f360495d.getLocationOnScreen(iArr2);
        int b19 = (iArr[0] + i65.a.b(s0Var.j(), 8)) - iArr2[0];
        int e17 = q74.t0.e();
        int b27 = (iArr[1] + i65.a.b(s0Var.j(), 6)) - iArr2[1];
        int width = s0Var.k().getWidth() - i65.a.b(s0Var.j(), 16);
        int height = (s0Var.k().getHeight() + i65.a.b(s0Var.j(), 44)) - i65.a.b(s0Var.j(), 6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        android.view.View view2 = s0Var.f360499h;
        android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = width + e17;
            layoutParams.height = height;
        }
        android.view.View view3 = s0Var.f360499h;
        if (view3 != null) {
            view3.setLayoutParams(layoutParams);
        }
        android.view.View view4 = s0Var.f360499h;
        if (view4 != null) {
            view4.setTranslationX(b19);
        }
        android.view.View view5 = s0Var.f360499h;
        if (view5 != null) {
            view5.setTranslationY(b27);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "calcProductCompBreakFrameLayoutParams, breakFrameWidth is " + width + ", breakFrameHeight is " + height + ", leftOffset is " + b19 + ", topOffset is " + b27 + ", rightMargin is " + e17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdSlideItemProductInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s34.z0 z0Var = s0Var.f360505n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdSlideItemProductInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        if (z0Var != null && z0Var.a()) {
            float f17 = width;
            float f18 = height;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$calcPAGViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcPAGViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            s34.z0 z0Var2 = s0Var.f360505n;
            if (z0Var2 == null || (b17 = z0Var2.b()) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPAGViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWidth", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                int i18 = b17.f402714c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWidth", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                float f19 = i18;
                s34.z0 z0Var3 = s0Var.f360505n;
                if (z0Var3 == null || (b18 = z0Var3.b()) == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPAGViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                    int i19 = b18.f402715d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
                    float f27 = i19;
                    if (!(f19 == 0.0f)) {
                        if (!(f27 == 0.0f)) {
                            float f28 = f19 / f27;
                            if (!(f17 == 0.0f)) {
                                if (!(f18 == 0.0f)) {
                                    if (f28 >= f17 / f18) {
                                        s0Var.f360508q = (int) f18;
                                        s0Var.f360507p = (int) ((f18 * f19) / f27);
                                    } else {
                                        s0Var.f360507p = (int) f17;
                                        s0Var.f360508q = (int) ((f17 * f27) / f19);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPAGViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                                }
                            }
                            com.tencent.mars.xlog.Log.e("SlideFullCardBreakFrameUICtrl", "calcPAGViewLayoutParams, containerWidth or containerHeight is 0");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPAGViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                        }
                    }
                    com.tencent.mars.xlog.Log.e("SlideFullCardBreakFrameUICtrl", "calcPAGViewLayoutParams, pagWidth or pagHeight is 0");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPAGViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$calcPAGViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$translationXY", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("translationXY", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            if (width == 0 || height == 0) {
                com.tencent.mars.xlog.Log.e("SlideFullCardBreakFrameUICtrl", "translationXY, containerWidth or containerHeight is 0");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("translationXY", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            } else {
                s0Var.f360509r = (width - s0Var.f360507p) / 2;
                s0Var.f360510s = (height - s0Var.f360508q) / 2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("translationXY", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$translationXY", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPAGLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPAGLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            android.widget.FrameLayout frameLayout = s0Var.f360500i;
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout != null ? frameLayout.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.width = width;
                layoutParams2.height = height;
            }
            android.widget.FrameLayout frameLayout2 = s0Var.f360500i;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams2);
            }
            android.widget.ImageView imageView = s0Var.f360502k;
            android.view.ViewGroup.LayoutParams layoutParams3 = imageView != null ? imageView.getLayoutParams() : null;
            if (layoutParams3 != null) {
                layoutParams3.width = s0Var.f360507p;
                layoutParams3.height = s0Var.f360508q;
            }
            android.widget.ImageView imageView2 = s0Var.f360502k;
            if (imageView2 != null) {
                imageView2.setLayoutParams(layoutParams3);
            }
            android.widget.ImageView imageView3 = s0Var.f360502k;
            if (imageView3 != null) {
                imageView3.setTranslationX(s0Var.f360509r);
            }
            android.widget.ImageView imageView4 = s0Var.f360502k;
            if (imageView4 != null) {
                imageView4.setTranslationY(s0Var.f360510s);
            }
            com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "setPAGLayoutParams, mPagViewWidth is " + s0Var.f360507p + ", mPagViewHeight is " + s0Var.f360508q + ", mPagViewTranslationX is " + s0Var.f360509r + ", mPagViewTranslationY is " + s0Var.f360510s);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPAGLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPAGLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        }
        q74.t c17 = q74.s0.c(s0Var);
        if (c17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            int i27 = (width * 128) / com.tencent.mm.plugin.appbrand.jsapi.webview.u.CTRL_INDEX;
            int i28 = (width * 112) / com.tencent.mm.plugin.appbrand.jsapi.webview.u.CTRL_INDEX;
            c17.A = width;
            int i29 = width - i27;
            c17.f360544z = i29 - (c17.w() * 2);
            android.view.ViewGroup viewGroup = c17.f360524f;
            android.view.ViewGroup.LayoutParams layoutParams4 = viewGroup != null ? viewGroup.getLayoutParams() : null;
            if (layoutParams4 != null) {
                layoutParams4.width = width;
                layoutParams4.height = i28;
            }
            android.widget.ImageView imageView5 = c17.f360527i;
            android.view.ViewGroup.LayoutParams layoutParams5 = imageView5 != null ? imageView5.getLayoutParams() : null;
            if (layoutParams5 != null) {
                layoutParams5.width = i27;
                layoutParams5.height = i28;
            }
            android.widget.ImageView imageView6 = c17.f360527i;
            if (imageView6 != null) {
                int w17 = c17.w() + q74.t0.e();
                android.view.ViewGroup.LayoutParams layoutParams6 = imageView6.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams6 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams6 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.rightMargin = w17;
                }
            }
            android.widget.ImageView imageView7 = c17.f360528j;
            android.view.ViewGroup.LayoutParams layoutParams7 = imageView7 != null ? imageView7.getLayoutParams() : null;
            if (layoutParams7 != null) {
                layoutParams7.width = i27;
                layoutParams7.height = i28;
            }
            android.widget.ImageView imageView8 = c17.f360528j;
            if (imageView8 != null) {
                int w18 = c17.w() + q74.t0.e();
                android.view.ViewGroup.LayoutParams layoutParams8 = imageView8.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams8 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams8 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.rightMargin = w18;
                }
            }
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView2 = c17.f360529k;
            android.content.Context context = c17.f360519a;
            if (adAppCompatTextView2 != null) {
                android.view.ViewGroup.LayoutParams layoutParams9 = adAppCompatTextView2.getLayoutParams();
                if (layoutParams9 != null) {
                    layoutParams9.width = i29 - (c17.w() * 3);
                }
                int w19 = c17.w();
                android.view.ViewGroup.LayoutParams layoutParams10 = adAppCompatTextView2.getLayoutParams();
                str = "onPreDraw";
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams10 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams10 : null;
                if (marginLayoutParams3 != null) {
                    marginLayoutParams3.leftMargin = w19;
                }
                int w27 = c17.w();
                android.view.ViewGroup.LayoutParams layoutParams11 = adAppCompatTextView2.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams11 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams11 : null;
                if (marginLayoutParams4 != null) {
                    marginLayoutParams4.rightMargin = w27;
                }
                adAppCompatTextView2.setMaxLines(1);
                adAppCompatTextView2.setTextSize(i65.a.b(context, 14));
                androidx.core.widget.a0.b(adAppCompatTextView2, 1, i65.a.b(context, 14), 1, 0);
            } else {
                str = "onPreDraw";
            }
            android.view.ViewGroup viewGroup2 = c17.f360530l;
            if (viewGroup2 == null || (adAppCompatTextView = c17.f360531m) == null || (weImageView = c17.f360532n) == null) {
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$calcProductCompBreakFrameLayoutParams$1";
                str3 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl";
            } else {
                android.view.ViewGroup.LayoutParams layoutParams12 = viewGroup2.getLayoutParams();
                if (layoutParams12 != null) {
                    layoutParams12.width = i29 - (c17.w() * 3);
                }
                int w28 = c17.w();
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$calcProductCompBreakFrameLayoutParams$1";
                android.view.ViewGroup.LayoutParams layoutParams13 = viewGroup2.getLayoutParams();
                str3 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl";
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams13 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams13 : null;
                if (marginLayoutParams5 != null) {
                    marginLayoutParams5.leftMargin = w28;
                }
                int w29 = c17.w();
                android.view.ViewGroup.LayoutParams layoutParams14 = viewGroup2.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams14 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams14 : null;
                if (marginLayoutParams6 != null) {
                    marginLayoutParams6.rightMargin = w29;
                }
                android.view.ViewGroup.LayoutParams layoutParams15 = weImageView.getLayoutParams();
                if (layoutParams15 != null) {
                    layoutParams15.width = i65.a.b(context, 10);
                    layoutParams15.height = i65.a.b(context, 20);
                }
                int b28 = i65.a.b(context, 4);
                android.view.ViewGroup.LayoutParams layoutParams16 = weImageView.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams16 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams16 : null;
                if (marginLayoutParams7 != null) {
                    marginLayoutParams7.leftMargin = b28;
                }
                if (layoutParams12 != null && layoutParams15 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams17 = adAppCompatTextView.getLayoutParams();
                    if (layoutParams17 != null) {
                        int i37 = layoutParams12.width - layoutParams15.width;
                        i17 = 1;
                        layoutParams17.width = i37 + 1;
                    } else {
                        i17 = 1;
                    }
                    adAppCompatTextView.setMaxLines(i17);
                    adAppCompatTextView.setTextSize(i65.a.b(context, 15));
                    androidx.core.widget.a0.b(adAppCompatTextView, i17, i65.a.b(context, 15), i17, 0);
                }
            }
            android.view.View view6 = c17.f360523e;
            android.view.ViewGroup.LayoutParams layoutParams18 = view6 != null ? view6.getLayoutParams() : null;
            if (layoutParams18 != null) {
                layoutParams18.width = width + q74.t0.e();
            }
            android.view.ViewGroup.LayoutParams layoutParams19 = view6 != null ? view6.getLayoutParams() : null;
            if (layoutParams19 != null) {
                layoutParams19.height = i28;
            }
            if (view6 != null) {
                view6.requestLayout();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        } else {
            str = "onPreDraw";
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$calcProductCompBreakFrameLayoutParams$1";
            str3 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl";
        }
        ((kotlinx.coroutines.flow.h3) q74.s0.f(s0Var)).k(1);
        com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "calcProductCompBreakFrameLayoutParams onPreDraw finish, tryEmit");
        android.view.ViewTreeObserver viewTreeObserver = s0Var.k().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        java.lang.String str4 = str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMHasSetOnPreDrawListener$p", str4);
        s0Var.f360503l = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMHasSetOnPreDrawListener$p", str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        return true;
    }
}
