package i94;

/* loaded from: classes4.dex */
public final class a implements i74.l {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f289756d;

    /* renamed from: e, reason: collision with root package name */
    public final m74.b f289757e;

    /* renamed from: f, reason: collision with root package name */
    public final int f289758f;

    /* renamed from: g, reason: collision with root package name */
    public final i94.c f289759g;

    /* renamed from: h, reason: collision with root package name */
    public final i94.g f289760h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f289761i;

    public a(android.content.Context context, h94.a foldAdInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(foldAdInfo, "foldAdInfo");
        this.f289756d = context;
        this.f289757e = new m74.b(context);
        this.f289758f = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a_c);
        i94.c cVar = new i94.c(foldAdInfo);
        this.f289759g = cVar;
        this.f289760h = new i94.g(context, cVar, this);
    }

    @Override // i74.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanReasonIds", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanReasonIds", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
    }

    @Override // i74.l
    public void b(android.view.View view, int i17, java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAction", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        com.tencent.mars.xlog.Log.i("WsFoldAdFeedback", "onAction, actionId: " + i17);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (i17 == 1) {
                h();
            } else if (i17 == 2) {
                f();
            } else if (i17 == 3) {
                g();
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("WsFoldAdFeedback", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAction", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
    }

    public final int c(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustWindowPositionY", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f289758f, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view2.getMeasuredHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = iArr[0];
        rect.left = i17;
        rect.top = iArr[1];
        rect.right = i17 + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        android.graphics.Rect rect2 = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        if (rect.bottom + measuredHeight <= rect2.height()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustWindowPositionY", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
            return 0;
        }
        int i18 = -(measuredHeight + rect.height());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustWindowPositionY", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        return i18;
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissWindow", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        this.f289757e.dismiss();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissWindow", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
    }

    @Override // i74.l
    public void dismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
    }

    public final void e() {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPopUpWindow", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFeedbackView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder");
        android.content.Context context = this.f289756d;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFeedbackView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder");
            str = "initPopUpWindow";
            str2 = "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback";
            view = null;
        } else {
            i94.h hVar = new i94.h();
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
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
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
            frameLayout.addView(linearLayout);
            c44.a.l();
            if (linearLayout.getLayoutParams() == null) {
                c44.a.o();
                linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                layoutParams3.width = -1;
                linearLayout.setLayoutParams(layoutParams3);
            }
            c44.a.o();
            if (linearLayout.getLayoutParams() == null) {
                c44.a.o();
                linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                layoutParams4.height = -2;
                linearLayout.setLayoutParams(layoutParams4);
            }
            c44.a.m();
            linearLayout.setOrientation(1);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(linearLayout.getContext());
            linearLayout.addView(weImageView);
            int a17 = c44.b.a(15);
            if (weImageView.getLayoutParams() == null) {
                c44.a.o();
                weImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a17, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams5 = weImageView.getLayoutParams();
                layoutParams5.width = a17;
                weImageView.setLayoutParams(layoutParams5);
            }
            int a18 = c44.b.a(6);
            if (weImageView.getLayoutParams() == null) {
                c44.a.o();
                weImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a18));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams6 = weImageView.getLayoutParams();
                layoutParams6.height = a18;
                weImageView.setLayoutParams(layoutParams6);
            }
            int h17 = c44.a.h();
            android.view.ViewGroup.LayoutParams layoutParams7 = weImageView.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
            if (layoutParams8 != null) {
                layoutParams8.gravity = h17;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams9 = weImageView.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams9 : null;
                if (layoutParams10 != null) {
                    layoutParams10.gravity = h17;
                }
            }
            int a19 = c44.b.a(32);
            android.view.ViewGroup.LayoutParams layoutParams11 = weImageView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams11 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams11 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.rightMargin = a19;
            }
            weImageView.setScaleType(c44.a.b());
            weImageView.setImageResource(com.tencent.mm.R.raw.sns_ad_feedback_trangle);
            weImageView.setIconColor(i65.a.d(weImageView.getContext(), com.tencent.mm.R.color.f478494f));
            hVar.i(weImageView);
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
            linearLayout.addView(linearLayout2);
            c44.a.o();
            if (linearLayout2.getLayoutParams() == null) {
                c44.a.o();
                linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams12 = linearLayout2.getLayoutParams();
                layoutParams12.width = -2;
                linearLayout2.setLayoutParams(layoutParams12);
            }
            c44.a.o();
            if (linearLayout2.getLayoutParams() == null) {
                c44.a.o();
                linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams13 = linearLayout2.getLayoutParams();
                layoutParams13.height = -2;
                linearLayout2.setLayoutParams(layoutParams13);
            }
            c44.a.m();
            linearLayout2.setOrientation(1);
            int h18 = c44.a.h();
            android.view.ViewGroup.LayoutParams layoutParams14 = linearLayout2.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams15 = layoutParams14 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams14 : null;
            if (layoutParams15 != null) {
                layoutParams15.gravity = h18;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams16 = linearLayout2.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams17 = layoutParams16 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams16 : null;
                if (layoutParams17 != null) {
                    layoutParams17.gravity = h18;
                }
            }
            linearLayout2.setBackgroundResource(com.tencent.mm.R.drawable.f482103co3);
            android.widget.TextView textView = new android.widget.TextView(linearLayout2.getContext());
            linearLayout2.addView(textView);
            int a27 = c44.b.a(16);
            android.view.ViewGroup.LayoutParams layoutParams18 = textView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams18 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams18 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = a27;
            }
            int a28 = c44.b.a(16);
            android.view.ViewGroup.LayoutParams layoutParams19 = textView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams19 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams19 : null;
            if (marginLayoutParams3 != null) {
                n3.u.h(marginLayoutParams3, a28);
            }
            c44.a.l();
            if (textView.getLayoutParams() == null) {
                c44.a.o();
                textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams20 = textView.getLayoutParams();
                layoutParams20.width = -1;
                textView.setLayoutParams(layoutParams20);
            }
            c44.a.o();
            if (textView.getLayoutParams() == null) {
                c44.a.o();
                textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams21 = textView.getLayoutParams();
                layoutParams21.height = -2;
                textView.setLayoutParams(layoutParams21);
            }
            java.lang.String string = textView.getContext().getString(com.tencent.mm.R.string.f493839pa5);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            textView.setText(string);
            textView.setTextColor(i65.a.d(textView.getContext(), com.tencent.mm.R.color.FG_1));
            i94.i iVar = i94.i.f289784a;
            textView.setTextSize(0, iVar.a(com.tencent.mm.R.dimen.a_h));
            hVar.h(textView);
            android.widget.TextView textView2 = new android.widget.TextView(linearLayout2.getContext());
            linearLayout2.addView(textView2);
            int a29 = c44.b.a(8);
            android.view.ViewGroup.LayoutParams layoutParams22 = textView2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams22 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams22 : null;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.topMargin = a29;
            }
            int a37 = c44.b.a(16);
            android.view.ViewGroup.LayoutParams layoutParams23 = textView2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams23 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams23 : null;
            if (marginLayoutParams5 != null) {
                n3.u.h(marginLayoutParams5, a37);
            }
            c44.a.l();
            if (textView2.getLayoutParams() == null) {
                c44.a.o();
                textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams24 = textView2.getLayoutParams();
                layoutParams24.width = -1;
                textView2.setLayoutParams(layoutParams24);
            }
            c44.a.o();
            if (textView2.getLayoutParams() == null) {
                c44.a.o();
                textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams25 = textView2.getLayoutParams();
                layoutParams25.height = -2;
                textView2.setLayoutParams(layoutParams25);
            }
            java.lang.String string2 = textView2.getContext().getString(com.tencent.mm.R.string.j7y);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            textView2.setText(string2);
            textView2.setTextColor(i65.a.d(textView2.getContext(), com.tencent.mm.R.color.FG_0));
            textView2.setTextSize(0, iVar.a(com.tencent.mm.R.dimen.a_h));
            android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(linearLayout2.getContext());
            linearLayout2.addView(linearLayout3);
            c44.a.l();
            if (linearLayout3.getLayoutParams() == null) {
                c44.a.o();
                linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams26 = linearLayout3.getLayoutParams();
                layoutParams26.width = -1;
                linearLayout3.setLayoutParams(layoutParams26);
            }
            c44.a.o();
            if (linearLayout3.getLayoutParams() == null) {
                c44.a.o();
                linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams27 = linearLayout3.getLayoutParams();
                layoutParams27.height = -2;
                linearLayout3.setLayoutParams(layoutParams27);
            }
            int a38 = c44.b.a(12);
            android.view.ViewGroup.LayoutParams layoutParams28 = linearLayout3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams28 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams28 : null;
            if (marginLayoutParams6 != null) {
                marginLayoutParams6.topMargin = a38;
            }
            int a39 = c44.b.a(16);
            android.view.ViewGroup.LayoutParams layoutParams29 = linearLayout3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams29 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams29 : null;
            if (marginLayoutParams7 != null) {
                marginLayoutParams7.bottomMargin = a39;
            }
            int a47 = c44.b.a(16);
            android.view.ViewGroup.LayoutParams layoutParams30 = linearLayout3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams30 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams30 : null;
            if (marginLayoutParams8 != null) {
                n3.u.h(marginLayoutParams8, a47);
            }
            int a48 = c44.b.a(16);
            android.view.ViewGroup.LayoutParams layoutParams31 = linearLayout3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams31 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams31 : null;
            if (marginLayoutParams9 != null) {
                n3.u.g(marginLayoutParams9, a48);
            }
            c44.a.j();
            linearLayout3.setOrientation(0);
            android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(linearLayout3.getContext());
            linearLayout3.addView(linearLayout4);
            c44.a.o();
            if (linearLayout4.getLayoutParams() == null) {
                c44.a.o();
                i17 = -2;
                linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                i17 = -2;
                android.view.ViewGroup.LayoutParams layoutParams32 = linearLayout4.getLayoutParams();
                layoutParams32.height = -2;
                linearLayout4.setLayoutParams(layoutParams32);
            }
            c44.a.o();
            if (linearLayout4.getLayoutParams() == null) {
                c44.a.o();
                linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i17, i17));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams33 = linearLayout4.getLayoutParams();
                layoutParams33.width = i17;
                linearLayout4.setLayoutParams(layoutParams33);
            }
            str = "initPopUpWindow";
            linearLayout4.setPadding(c44.b.a(12), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
            linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), c44.b.a(12), linearLayout4.getPaddingBottom());
            str2 = "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback";
            linearLayout4.setPadding(linearLayout4.getPaddingLeft(), c44.b.a(8), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
            linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), c44.b.a(8));
            int a49 = c44.b.a(12);
            android.view.ViewGroup.LayoutParams layoutParams34 = linearLayout4.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams34 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams34 : null;
            if (marginLayoutParams10 != null) {
                n3.u.g(marginLayoutParams10, a49);
            }
            c44.a.j();
            linearLayout4.setOrientation(0);
            linearLayout4.setBackgroundResource(com.tencent.mm.R.drawable.b0w);
            linearLayout4.setGravity(c44.a.d());
            hVar.f(linearLayout4);
            android.widget.ImageView weImageView2 = new com.tencent.mm.ui.widget.imageview.WeImageView(linearLayout4.getContext());
            linearLayout4.addView(weImageView2);
            int a57 = c44.b.a(20);
            if (weImageView2.getLayoutParams() == null) {
                c44.a.o();
                weImageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a57, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams35 = weImageView2.getLayoutParams();
                layoutParams35.width = a57;
                weImageView2.setLayoutParams(layoutParams35);
            }
            int a58 = c44.b.a(20);
            if (weImageView2.getLayoutParams() == null) {
                c44.a.o();
                weImageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a58));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams36 = weImageView2.getLayoutParams();
                layoutParams36.height = a58;
                weImageView2.setLayoutParams(layoutParams36);
            }
            int a59 = c44.b.a(4);
            android.view.ViewGroup.LayoutParams layoutParams37 = weImageView2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams37 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams37 : null;
            if (marginLayoutParams11 != null) {
                n3.u.g(marginLayoutParams11, a59);
            }
            weImageView2.setImageResource(com.tencent.mm.R.raw.sns_ad_feedback_approve);
            hVar.g(weImageView2);
            android.widget.TextView textView3 = new android.widget.TextView(linearLayout4.getContext());
            linearLayout4.addView(textView3);
            c44.a.o();
            if (textView3.getLayoutParams() == null) {
                c44.a.o();
                i18 = -2;
                textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                i18 = -2;
                android.view.ViewGroup.LayoutParams layoutParams38 = textView3.getLayoutParams();
                layoutParams38.width = -2;
                textView3.setLayoutParams(layoutParams38);
            }
            c44.a.o();
            if (textView3.getLayoutParams() == null) {
                c44.a.o();
                textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i18, i18));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams39 = textView3.getLayoutParams();
                layoutParams39.height = i18;
                textView3.setLayoutParams(layoutParams39);
            }
            java.lang.String string3 = textView3.getContext().getString(com.tencent.mm.R.string.f493185j83);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            textView3.setText(string3);
            textView3.setTextSize(0, iVar.a(com.tencent.mm.R.dimen.a_h));
            textView3.setTextColor(i65.a.d(textView3.getContext(), com.tencent.mm.R.color.FG_0));
            android.widget.LinearLayout linearLayout5 = new android.widget.LinearLayout(linearLayout3.getContext());
            linearLayout3.addView(linearLayout5);
            c44.a.o();
            if (linearLayout5.getLayoutParams() == null) {
                c44.a.o();
                i19 = -2;
                linearLayout5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                i19 = -2;
                android.view.ViewGroup.LayoutParams layoutParams40 = linearLayout5.getLayoutParams();
                layoutParams40.height = -2;
                linearLayout5.setLayoutParams(layoutParams40);
            }
            c44.a.o();
            if (linearLayout5.getLayoutParams() == null) {
                c44.a.o();
                linearLayout5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i19, i19));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams41 = linearLayout5.getLayoutParams();
                layoutParams41.width = i19;
                linearLayout5.setLayoutParams(layoutParams41);
            }
            c44.a.j();
            linearLayout5.setOrientation(0);
            linearLayout5.setPadding(c44.b.a(12), linearLayout5.getPaddingTop(), linearLayout5.getPaddingRight(), linearLayout5.getPaddingBottom());
            linearLayout5.setPadding(linearLayout5.getPaddingLeft(), linearLayout5.getPaddingTop(), c44.b.a(12), linearLayout5.getPaddingBottom());
            linearLayout5.setPadding(linearLayout5.getPaddingLeft(), c44.b.a(8), linearLayout5.getPaddingRight(), linearLayout5.getPaddingBottom());
            linearLayout5.setPadding(linearLayout5.getPaddingLeft(), linearLayout5.getPaddingTop(), linearLayout5.getPaddingRight(), c44.b.a(8));
            linearLayout5.setGravity(c44.a.d());
            linearLayout5.setBackgroundResource(com.tencent.mm.R.drawable.b0w);
            hVar.e(linearLayout5);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = new com.tencent.mm.ui.widget.imageview.WeImageView(linearLayout5.getContext());
            linearLayout5.addView(weImageView3);
            int a67 = c44.b.a(20);
            if (weImageView3.getLayoutParams() == null) {
                c44.a.o();
                weImageView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a67, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams42 = weImageView3.getLayoutParams();
                layoutParams42.width = a67;
                weImageView3.setLayoutParams(layoutParams42);
            }
            int a68 = c44.b.a(20);
            if (weImageView3.getLayoutParams() == null) {
                c44.a.o();
                weImageView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a68));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams43 = weImageView3.getLayoutParams();
                layoutParams43.height = a68;
                weImageView3.setLayoutParams(layoutParams43);
            }
            int a69 = c44.b.a(4);
            android.view.ViewGroup.LayoutParams layoutParams44 = weImageView3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams44 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams44 : null;
            if (marginLayoutParams12 != null) {
                n3.u.g(marginLayoutParams12, a69);
            }
            int d17 = c44.a.d();
            android.view.ViewGroup.LayoutParams layoutParams45 = weImageView3.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams46 = layoutParams45 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams45 : null;
            if (layoutParams46 != null) {
                layoutParams46.gravity = d17;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams47 = weImageView3.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams48 = layoutParams47 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams47 : null;
                if (layoutParams48 != null) {
                    layoutParams48.gravity = d17;
                }
            }
            weImageView3.setImageResource(com.tencent.mm.R.raw.sns_ad_feedback_no_interesting);
            weImageView3.setIconColor(i65.a.d(weImageView3.getContext(), com.tencent.mm.R.color.FG_0));
            hVar.b(weImageView3);
            android.widget.TextView textView4 = new android.widget.TextView(linearLayout5.getContext());
            linearLayout5.addView(textView4);
            int d18 = c44.a.d();
            android.view.ViewGroup.LayoutParams layoutParams49 = textView4.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams50 = layoutParams49 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams49 : null;
            if (layoutParams50 != null) {
                layoutParams50.gravity = d18;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams51 = textView4.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams52 = layoutParams51 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams51 : null;
                if (layoutParams52 != null) {
                    layoutParams52.gravity = d18;
                }
            }
            c44.a.o();
            if (textView4.getLayoutParams() == null) {
                c44.a.o();
                i27 = -2;
                textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                i27 = -2;
                android.view.ViewGroup.LayoutParams layoutParams53 = textView4.getLayoutParams();
                layoutParams53.width = -2;
                textView4.setLayoutParams(layoutParams53);
            }
            c44.a.o();
            if (textView4.getLayoutParams() == null) {
                c44.a.o();
                textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i27, i27));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams54 = textView4.getLayoutParams();
                layoutParams54.height = i27;
                textView4.setLayoutParams(layoutParams54);
            }
            java.lang.String string4 = textView4.getContext().getString(com.tencent.mm.R.string.f493186j84);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            textView4.setText(string4);
            textView4.setTextSize(0, iVar.a(com.tencent.mm.R.dimen.a_h));
            textView4.setTextColor(i65.a.d(textView4.getContext(), com.tencent.mm.R.color.FG_0));
            android.view.View view2 = new android.view.View(linearLayout2.getContext());
            linearLayout2.addView(view2);
            c44.a.l();
            if (view2.getLayoutParams() == null) {
                c44.a.o();
                i28 = -2;
                view2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                i28 = -2;
                android.view.ViewGroup.LayoutParams layoutParams55 = view2.getLayoutParams();
                layoutParams55.width = -1;
                view2.setLayoutParams(layoutParams55);
            }
            if (view2.getLayoutParams() == null) {
                c44.a.o();
                view2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i28, 1));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams56 = view2.getLayoutParams();
                layoutParams56.height = 1;
                view2.setLayoutParams(layoutParams56);
            }
            view2.setBackgroundColor(i65.a.d(view2.getContext(), com.tencent.mm.R.color.FG_3));
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(linearLayout2.getContext());
            linearLayout2.addView(frameLayout2);
            c44.a.l();
            if (frameLayout2.getLayoutParams() == null) {
                c44.a.o();
                frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams57 = frameLayout2.getLayoutParams();
                layoutParams57.width = -1;
                frameLayout2.setLayoutParams(layoutParams57);
            }
            c44.a.o();
            if (frameLayout2.getLayoutParams() == null) {
                c44.a.o();
                frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams58 = frameLayout2.getLayoutParams();
                layoutParams58.height = -2;
                frameLayout2.setLayoutParams(layoutParams58);
            }
            int a76 = c44.b.a(16);
            frameLayout2.setPadding(a76, a76, a76, a76);
            hVar.c(frameLayout2);
            android.widget.TextView textView5 = new android.widget.TextView(frameLayout2.getContext());
            frameLayout2.addView(textView5);
            c44.a.o();
            if (textView5.getLayoutParams() == null) {
                c44.a.o();
                i29 = -2;
                textView5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                i29 = -2;
                android.view.ViewGroup.LayoutParams layoutParams59 = textView5.getLayoutParams();
                layoutParams59.width = -2;
                textView5.setLayoutParams(layoutParams59);
            }
            c44.a.o();
            if (textView5.getLayoutParams() == null) {
                c44.a.o();
                textView5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i29, i29));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams60 = textView5.getLayoutParams();
                layoutParams60.height = i29;
                textView5.setLayoutParams(layoutParams60);
            }
            int g17 = c44.a.g() | c44.a.f();
            android.view.ViewGroup.LayoutParams layoutParams61 = textView5.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams62 = layoutParams61 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams61 : null;
            if (layoutParams62 != null) {
                layoutParams62.gravity = g17;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams63 = textView5.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams64 = layoutParams63 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams63 : null;
                if (layoutParams64 != null) {
                    layoutParams64.gravity = g17;
                }
            }
            int a77 = c44.b.a(48);
            android.view.ViewGroup.LayoutParams layoutParams65 = textView5.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams13 = layoutParams65 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams65 : null;
            if (marginLayoutParams13 != null) {
                marginLayoutParams13.rightMargin = a77;
            }
            java.lang.String string5 = textView5.getContext().getString(com.tencent.mm.R.string.f493183j81);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            textView5.setText(string5);
            textView5.setIncludeFontPadding(false);
            textView5.setSingleLine(true);
            textView5.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textView5.setTextColor(i65.a.d(textView5.getContext(), com.tencent.mm.R.color.FG_1));
            textView5.setTextSize(0, iVar.a(com.tencent.mm.R.dimen.a_h));
            hVar.d(textView5);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = new com.tencent.mm.ui.widget.imageview.WeImageView(frameLayout2.getContext());
            frameLayout2.addView(weImageView4);
            int a78 = c44.b.a(10);
            if (weImageView4.getLayoutParams() == null) {
                c44.a.o();
                weImageView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a78, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams66 = weImageView4.getLayoutParams();
                layoutParams66.width = a78;
                weImageView4.setLayoutParams(layoutParams66);
            }
            int a79 = c44.b.a(20);
            if (weImageView4.getLayoutParams() == null) {
                c44.a.o();
                weImageView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a79));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams67 = weImageView4.getLayoutParams();
                layoutParams67.height = a79;
                weImageView4.setLayoutParams(layoutParams67);
            }
            weImageView4.setScaleType(c44.a.b());
            int h19 = c44.a.h() | c44.a.f();
            android.view.ViewGroup.LayoutParams layoutParams68 = weImageView4.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams69 = layoutParams68 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams68 : null;
            if (layoutParams69 != null) {
                layoutParams69.gravity = h19;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams70 = weImageView4.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams71 = layoutParams70 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams70 : null;
                if (layoutParams71 != null) {
                    layoutParams71.gravity = h19;
                }
            }
            weImageView4.setImageResource(com.tencent.mm.R.raw.sns_ad_feedback_right_arrow);
            weImageView4.setIconColor(i65.a.d(weImageView4.getContext(), com.tencent.mm.R.color.FG_2));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = new com.tencent.mm.ui.widget.imageview.WeImageView(linearLayout.getContext());
            linearLayout.addView(weImageView5);
            int a86 = c44.b.a(15);
            if (weImageView5.getLayoutParams() == null) {
                c44.a.o();
                weImageView5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a86, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams72 = weImageView5.getLayoutParams();
                layoutParams72.width = a86;
                weImageView5.setLayoutParams(layoutParams72);
            }
            int a87 = c44.b.a(6);
            if (weImageView5.getLayoutParams() == null) {
                c44.a.o();
                weImageView5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a87));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams73 = weImageView5.getLayoutParams();
                layoutParams73.height = a87;
                weImageView5.setLayoutParams(layoutParams73);
            }
            int h27 = c44.a.h();
            android.view.ViewGroup.LayoutParams layoutParams74 = weImageView5.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams75 = layoutParams74 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams74 : null;
            if (layoutParams75 != null) {
                layoutParams75.gravity = h27;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams76 = weImageView5.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams77 = layoutParams76 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams76 : null;
                if (layoutParams77 != null) {
                    layoutParams77.gravity = h27;
                }
            }
            int a88 = c44.b.a(32);
            android.view.ViewGroup.LayoutParams layoutParams78 = weImageView5.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams14 = layoutParams78 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams78 : null;
            if (marginLayoutParams14 != null) {
                marginLayoutParams14.rightMargin = a88;
            }
            weImageView5.setScaleType(c44.a.b());
            weImageView5.setImageResource(com.tencent.mm.R.raw.sns_ad_feedback_trangle);
            weImageView5.setIconColor(i65.a.d(weImageView5.getContext(), com.tencent.mm.R.color.f478494f));
            weImageView5.setRotation(180.0f);
            c44.a.c();
            weImageView5.setVisibility(8);
            hVar.a(weImageView5);
            frameLayout.setTag(com.tencent.mm.R.id.vpl, hVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFeedbackView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder");
            view = frameLayout;
        }
        m74.b bVar = this.f289757e;
        bVar.setContentView(view);
        bVar.setWidth(this.f289758f);
        bVar.setHeight(-2);
        bVar.setFocusable(true);
        bVar.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        bVar.setOnDismissListener(bVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onApprove", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        j(true);
        d();
        i94.c cVar = this.f289759g;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportApprove", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
        a84.t0.a(new i94.b(cVar.f289763a));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportApprove", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onApprove", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
    }

    public final void g() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.app.y7 y7Var;
        android.content.Intent a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onComplaint", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        d();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
            a17 = this.f289759g.a();
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (a17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onComplaint", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
            return;
        }
        y7Var.D(a17, this.f289756d);
        m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("WsFoldAdFeedback", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onComplaint", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
    }

    public final void h() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNoInterest", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        j(false);
        d();
        i94.c cVar = this.f289759g;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
        android.content.Context context = this.f289756d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(f94.a.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        f94.a aVar = (f94.a) a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleAdDelete", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        h94.a foldAdInfo = cVar.f289763a;
        kotlin.jvm.internal.o.g(foldAdInfo, "foldAdInfo");
        foldAdInfo.d();
        java.lang.String viewId = foldAdInfo.d();
        k94.j jVar = aVar.f260532d;
        jVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregisterView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        k94.h hVar = (k94.h) jVar.f305961a.remove(viewId);
        if (hVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
            str = "onNoInterest";
        } else {
            k94.j.f(jVar, hVar, k94.i.f305959h, 0.0d, 4, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            str = "onNoInterest";
            hVar.f305952e.clear();
            hVar.f305953f.clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        }
        android.app.Activity context2 = aVar.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList T6 = ((com.tencent.mm.plugin.sns.ui.wsfold.w) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.sns.ui.wsfold.w.class)).T6();
        h94.c cVar2 = new h94.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalId", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalId", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalId", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.ImproveWsFoldAdInfo");
        cVar2.Y1 = foldAdInfo.f279744n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalId", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.ImproveWsFoldAdInfo");
        T6.u(new zc4.b(cVar2, true));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAdDelete", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdReportHelper");
        kotlin.jvm.internal.o.g(foldAdInfo, "foldAdInfo");
        r45.p3 p3Var = new r45.p3();
        r45.x2 x2Var = new r45.x2();
        k94.d.f305942a.a(x2Var, foldAdInfo);
        x2Var.f389670d = 5;
        p3Var.f382693d = x2Var;
        p3Var.b().l();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
    }

    public final void i(int i17) {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.view.View view4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        i94.g gVar = this.f289760h;
        gVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackDisplayer");
        if (i17 >= 0) {
            i94.h hVar = gVar.f289774e;
            if (hVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
                view3 = hVar.f289775a;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("topArrowIcon");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            } else {
                view3 = null;
            }
            if (view3 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view5 = view3;
                yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/wsfold/feedback/WsFoldAdFeedbackDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/sns/ad/wsfold/feedback/WsFoldAdFeedbackDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i94.h hVar2 = gVar.f289774e;
            if (hVar2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
                view4 = hVar2.f289776b;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("bottomArrowIcon");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            } else {
                view4 = null;
            }
            if (view4 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                android.view.View view6 = view4;
                yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/wsfold/feedback/WsFoldAdFeedbackDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/sns/ad/wsfold/feedback/WsFoldAdFeedbackDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            i94.h hVar3 = gVar.f289774e;
            if (hVar3 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
                view = hVar3.f289775a;
                if (view == null) {
                    kotlin.jvm.internal.o.o("topArrowIcon");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopArrowIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            } else {
                view = null;
            }
            if (view != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                android.view.View view7 = view;
                yj0.a.d(view7, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/wsfold/feedback/WsFoldAdFeedbackDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/sns/ad/wsfold/feedback/WsFoldAdFeedbackDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i94.h hVar4 = gVar.f289774e;
            if (hVar4 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
                view2 = hVar4.f289776b;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("bottomArrowIcon");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomArrowIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            } else {
                view2 = null;
            }
            if (view2 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                android.view.View view8 = view2;
                yj0.a.d(view8, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/wsfold/feedback/WsFoldAdFeedbackDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/sns/ad/wsfold/feedback/WsFoldAdFeedbackDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackDisplayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
    }

    public final void j(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("thanks", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        android.content.Context context = this.f289756d;
        db5.t7.h(context, context.getString(z17 ? com.tencent.mm.R.string.j8_ : com.tencent.mm.R.string.j8a));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("thanks", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
    }
}
