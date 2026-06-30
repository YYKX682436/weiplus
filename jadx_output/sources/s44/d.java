package s44;

/* loaded from: classes4.dex */
public final class d extends t44.m implements v44.a {

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f402960j = jz5.h.b(s44.b.f402959d);

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f402961k;

    /* renamed from: l, reason: collision with root package name */
    public final int f402962l;

    /* renamed from: m, reason: collision with root package name */
    public final int f402963m;

    /* renamed from: n, reason: collision with root package name */
    public final int f402964n;

    public d() {
        jz5.g b17 = jz5.h.b(s44.a.f402958d);
        this.f402961k = b17;
        int a17 = c44.b.a(14);
        this.f402962l = a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNormalPadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        int intValue = ((java.lang.Number) ((jz5.n) this.f415512b).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNormalPadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        this.f402963m = intValue;
        int d17 = a17 + d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatarRightMargin", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        int intValue2 = ((java.lang.Number) ((jz5.n) b17).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarRightMargin", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        this.f402964n = d17 + intValue2;
    }

    public final android.view.View c(android.content.Context context, s44.c cVar) {
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildAdBottomBaseInfoView", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setId(com.tencent.mm.R.id.afc);
        c44.a.l();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = -1;
            frameLayout.setLayoutParams(layoutParams);
        }
        c44.a.o();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = -2;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int b17 = b();
        android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = b17;
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = this.f402963m;
        }
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBottomBaseInfoLayout", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider$TimelineAdItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBottomBaseInfoLayout", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider$TimelineAdItemViewHolder");
        int e17 = e(com.tencent.mm.R.dimen.f479925j4);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
        frameLayout.addView(linearLayout);
        c44.a.o();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
            layoutParams5.width = -2;
            linearLayout.setLayoutParams(layoutParams5);
        }
        c44.a.o();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
            layoutParams6.height = -2;
            linearLayout.setLayoutParams(layoutParams6);
        }
        int f17 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 != null) {
            layoutParams8.gravity = f17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams9 = linearLayout.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams9 : null;
            if (layoutParams10 != null) {
                layoutParams10.gravity = f17;
            }
        }
        int a17 = c44.b.a(40);
        android.view.ViewGroup.LayoutParams layoutParams11 = linearLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams11 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams11 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.rightMargin = a17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGravity_bottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLConstantsKt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGravity_bottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLConstantsKt");
        linearLayout.setGravity(c44.a.f38527e);
        c44.a.j();
        linearLayout.setOrientation(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTimeContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimeContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.tencent.mm.kiss.widget.textview.PLSysTextView pLSysTextView = new com.tencent.mm.kiss.widget.textview.PLSysTextView(linearLayout.getContext());
        linearLayout.addView(pLSysTextView);
        pLSysTextView.setId(com.tencent.mm.R.id.f482888qv);
        c44.a.o();
        if (pLSysTextView.getLayoutParams() == null) {
            c44.a.o();
            pLSysTextView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams12 = pLSysTextView.getLayoutParams();
            layoutParams12.width = -2;
            pLSysTextView.setLayoutParams(layoutParams12);
        }
        c44.a.o();
        if (pLSysTextView.getLayoutParams() == null) {
            c44.a.o();
            pLSysTextView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams13 = pLSysTextView.getLayoutParams();
            layoutParams13.height = -2;
            pLSysTextView.setLayoutParams(layoutParams13);
        }
        pLSysTextView.setSingleLine(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsWordColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        jz5.g gVar = this.f415519i;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsWordColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        pLSysTextView.setTextColor(intValue);
        float f18 = e17;
        pLSysTextView.setTextSize(0, f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPublishTimeText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPublishTimeText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.tencent.mm.kiss.widget.textview.PLSysTextView pLSysTextView2 = new com.tencent.mm.kiss.widget.textview.PLSysTextView(linearLayout.getContext());
        linearLayout.addView(pLSysTextView2);
        pLSysTextView2.setId(com.tencent.mm.R.id.f482802o9);
        c44.a.o();
        if (pLSysTextView2.getLayoutParams() == null) {
            c44.a.o();
            pLSysTextView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams14 = pLSysTextView2.getLayoutParams();
            layoutParams14.width = -2;
            pLSysTextView2.setLayoutParams(layoutParams14);
        }
        c44.a.o();
        if (pLSysTextView2.getLayoutParams() == null) {
            c44.a.o();
            pLSysTextView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams15 = pLSysTextView2.getLayoutParams();
            layoutParams15.height = -2;
            pLSysTextView2.setLayoutParams(layoutParams15);
        }
        int a18 = c44.b.a(10);
        android.view.ViewGroup.LayoutParams layoutParams16 = pLSysTextView2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams16 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams16 : null;
        if (marginLayoutParams4 != null) {
            marginLayoutParams4.leftMargin = a18;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsLinkColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        int intValue2 = ((java.lang.Number) ((jz5.n) this.f415518h).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsLinkColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        pLSysTextView2.setTextColor(intValue2);
        pLSysTextView2.setTextSize(0, f18);
        c44.a.c();
        pLSysTextView2.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSocialchainText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSocialchainText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.tencent.mm.kiss.widget.textview.PLSysTextView pLSysTextView3 = new com.tencent.mm.kiss.widget.textview.PLSysTextView(linearLayout.getContext());
        linearLayout.addView(pLSysTextView3);
        pLSysTextView3.setId(com.tencent.mm.R.id.f482851pr);
        c44.a.o();
        if (pLSysTextView3.getLayoutParams() == null) {
            c44.a.o();
            i17 = -2;
            pLSysTextView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i17 = -2;
            android.view.ViewGroup.LayoutParams layoutParams17 = pLSysTextView3.getLayoutParams();
            layoutParams17.width = -2;
            pLSysTextView3.setLayoutParams(layoutParams17);
        }
        c44.a.o();
        if (pLSysTextView3.getLayoutParams() == null) {
            c44.a.o();
            pLSysTextView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i17, i17));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams18 = pLSysTextView3.getLayoutParams();
            layoutParams18.height = i17;
            pLSysTextView3.setLayoutParams(layoutParams18);
        }
        int a19 = c44.b.a(10);
        android.view.ViewGroup.LayoutParams layoutParams19 = pLSysTextView3.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams19 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams19 : null;
        if (marginLayoutParams5 != null) {
            marginLayoutParams5.leftMargin = a19;
        }
        pLSysTextView3.setEllipsize(c44.a.a());
        pLSysTextView3.setSingleLine(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsWordColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        int intValue3 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsWordColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        pLSysTextView3.setTextColor(intValue3);
        pLSysTextView3.setTextSize(0, f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAppNameText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAppNameText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(frameLayout.getContext());
        frameLayout.addView(frameLayout2);
        c44.a.o();
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            i18 = -2;
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i18 = -2;
            android.view.ViewGroup.LayoutParams layoutParams20 = frameLayout2.getLayoutParams();
            layoutParams20.width = -2;
            frameLayout2.setLayoutParams(layoutParams20);
        }
        c44.a.o();
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i18, i18));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams21 = frameLayout2.getLayoutParams();
            layoutParams21.height = i18;
            frameLayout2.setLayoutParams(layoutParams21);
        }
        int h17 = c44.a.h() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams22 = frameLayout2.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams23 = layoutParams22 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams22 : null;
        if (layoutParams23 != null) {
            layoutParams23.gravity = h17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams24 = frameLayout2.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams25 = layoutParams24 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams24 : null;
            if (layoutParams25 != null) {
                layoutParams25.gravity = h17;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentLikeContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentLikeContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        android.widget.ImageView imageView = new android.widget.ImageView(frameLayout2.getContext());
        frameLayout2.addView(imageView);
        imageView.setId(com.tencent.mm.R.id.f482894r2);
        int f19 = i65.a.f(imageView.getContext(), com.tencent.mm.R.dimen.f479714d7);
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(f19, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams26 = imageView.getLayoutParams();
            layoutParams26.width = f19;
            imageView.setLayoutParams(layoutParams26);
        }
        int a27 = c44.b.a(20);
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a27));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams27 = imageView.getLayoutParams();
            layoutParams27.height = a27;
            imageView.setLayoutParams(layoutParams27);
        }
        int f27 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams28 = imageView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams29 = layoutParams28 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams28 : null;
        if (layoutParams29 != null) {
            layoutParams29.gravity = f27;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams30 = imageView.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams31 = layoutParams30 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams30 : null;
            if (layoutParams31 != null) {
                layoutParams31.gravity = f27;
            }
        }
        imageView.setBackground(null);
        java.lang.String string = imageView.getContext().getString(com.tencent.mm.R.string.j9n);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        imageView.setContentDescription(string);
        imageView.setFocusable(false);
        imageView.setImageDrawable(com.tencent.mm.ui.zk.d(context, com.tencent.mm.R.attr.f478401iu));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentLikeIcon", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentLikeIcon", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildAdBottomBaseInfoView", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        return frameLayout;
    }

    public final int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatarSize", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        int intValue = ((java.lang.Number) this.f402960j.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarSize", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        return intValue;
    }

    public final int e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpecialTextSize", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        int min = (int) java.lang.Math.min(i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, i17) * i65.a.t(com.tencent.mm.sdk.platformtools.x2.f193071a), i65.a.p(com.tencent.mm.sdk.platformtools.x2.f193071a, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpecialTextSize", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        return min;
    }
}
