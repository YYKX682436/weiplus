package k74;

/* loaded from: classes4.dex */
public class i implements i74.l, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f304798d;

    /* renamed from: e, reason: collision with root package name */
    public m74.b f304799e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f304800f;

    /* renamed from: g, reason: collision with root package name */
    public final k74.h f304801g;

    /* renamed from: h, reason: collision with root package name */
    public final i74.a f304802h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.i f304803i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f304804m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public int f304805n;

    public i(android.content.Context context) {
        this.f304798d = context;
        i74.a aVar = new i74.a();
        this.f304802h = aVar;
        this.f304801g = new k74.h(context, aVar, this);
        this.f304805n = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a_c);
        if (context instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            aVar.f289457c = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
    }

    @Override // i74.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanReasonIds", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        com.tencent.mars.xlog.Log.i("FeedbackNewStylePromptManager", "cleanReasonIds");
        java.util.Set set = this.f304804m;
        if (set != null) {
            ((java.util.HashSet) set).clear();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanReasonIds", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    @Override // i74.l
    public void b(android.view.View view, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        try {
            if (i17 == 5) {
                h(view, obj);
            } else {
                if (i17 == 3) {
                    g();
                } else if (i17 == 4) {
                    i(view, obj);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1962, i17 + 10);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("FeedbackNewStylePromptManager", "onAction failed : actionId = " + i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final int c(android.graphics.Rect rect, android.graphics.Rect rect2, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        com.tencent.mars.xlog.Log.i("FeedbackNewStylePromptManager", "adjustWindowPosition, anchorRect=" + rect + ", windowsRect=" + rect2);
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f304805n, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        if (rect.bottom + measuredHeight <= rect2.height()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
            return 0;
        }
        int i17 = -(measuredHeight + rect.height());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        return i17;
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        com.tencent.mars.xlog.Log.i("FeedbackNewStylePromptManager", "dismissWindow");
        m74.b bVar = this.f304799e;
        if (bVar != null) {
            bVar.dismiss();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    @Override // i74.l
    public void dismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final void e() {
        java.lang.String str;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        android.widget.FrameLayout frameLayout;
        java.lang.String str2 = "ensurePopupWindow";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        if (this.f304799e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder");
            android.content.Context context = this.f304798d;
            if (context == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder");
                str = "ensurePopupWindow";
                frameLayout = null;
            } else {
                k74.j jVar = new k74.j();
                android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
                c44.a.l();
                if (frameLayout2.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    layoutParams.width = -1;
                    frameLayout2.setLayoutParams(layoutParams);
                }
                c44.a.o();
                if (frameLayout2.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                    layoutParams2.height = -2;
                    frameLayout2.setLayoutParams(layoutParams2);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMRootView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMRootView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout2.getContext());
                frameLayout2.addView(linearLayout);
                c44.a.o();
                if (linearLayout.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                    layoutParams3.width = -2;
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
                int h17 = c44.a.h();
                android.view.ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    layoutParams6.gravity = h17;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams7 : null;
                    if (layoutParams8 != null) {
                        layoutParams8.gravity = h17;
                    }
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(linearLayout.getContext());
                linearLayout.addView(weImageView);
                int a17 = c44.b.a(15);
                if (weImageView.getLayoutParams() == null) {
                    c44.a.o();
                    weImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a17, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams9 = weImageView.getLayoutParams();
                    layoutParams9.width = a17;
                    weImageView.setLayoutParams(layoutParams9);
                }
                int a18 = c44.b.a(6);
                if (weImageView.getLayoutParams() == null) {
                    c44.a.o();
                    weImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a18));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams10 = weImageView.getLayoutParams();
                    layoutParams10.height = a18;
                    weImageView.setLayoutParams(layoutParams10);
                }
                int h18 = c44.a.h();
                android.view.ViewGroup.LayoutParams layoutParams11 = weImageView.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams12 = layoutParams11 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams11 : null;
                if (layoutParams12 != null) {
                    layoutParams12.gravity = h18;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams13 = weImageView.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams14 = layoutParams13 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams13 : null;
                    if (layoutParams14 != null) {
                        layoutParams14.gravity = h18;
                    }
                }
                int a19 = c44.b.a(26);
                android.view.ViewGroup.LayoutParams layoutParams15 = weImageView.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams15 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams15 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.rightMargin = a19;
                }
                weImageView.setScaleType(c44.a.b());
                weImageView.setImageResource(com.tencent.mm.R.raw.sns_ad_feedback_trangle);
                weImageView.setIconColor(i65.a.d(weImageView.getContext(), com.tencent.mm.R.color.f478494f));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f304808c = weImageView;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
                linearLayout.addView(linearLayout2);
                c44.a.o();
                if (linearLayout2.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams16 = linearLayout2.getLayoutParams();
                    layoutParams16.width = -2;
                    linearLayout2.setLayoutParams(layoutParams16);
                }
                c44.a.o();
                if (linearLayout2.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams17 = linearLayout2.getLayoutParams();
                    layoutParams17.height = -2;
                    linearLayout2.setLayoutParams(layoutParams17);
                }
                c44.a.m();
                linearLayout2.setOrientation(1);
                int h19 = c44.a.h();
                android.view.ViewGroup.LayoutParams layoutParams18 = linearLayout2.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams19 = layoutParams18 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams18 : null;
                if (layoutParams19 != null) {
                    layoutParams19.gravity = h19;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams20 = linearLayout2.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams21 = layoutParams20 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams20 : null;
                    if (layoutParams21 != null) {
                        layoutParams21.gravity = h19;
                    }
                }
                linearLayout2.setBackgroundResource(com.tencent.mm.R.drawable.f482103co3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMPanelContentView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f304813h = linearLayout2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMPanelContentView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(linearLayout2.getContext());
                linearLayout2.addView(linearLayout3);
                c44.a.l();
                if (linearLayout3.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams22 = linearLayout3.getLayoutParams();
                    layoutParams22.width = -1;
                    linearLayout3.setLayoutParams(layoutParams22);
                }
                c44.a.o();
                if (linearLayout3.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams23 = linearLayout3.getLayoutParams();
                    layoutParams23.height = -2;
                    linearLayout3.setLayoutParams(layoutParams23);
                }
                str = "ensurePopupWindow";
                linearLayout3.setPadding(c44.b.a(16), linearLayout3.getPaddingTop(), linearLayout3.getPaddingRight(), linearLayout3.getPaddingBottom());
                linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop(), c44.b.a(16), linearLayout3.getPaddingBottom());
                int a27 = c44.b.a(16);
                android.view.ViewGroup.LayoutParams layoutParams24 = linearLayout3.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams24 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams24 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = a27;
                }
                int a28 = c44.b.a(12);
                android.view.ViewGroup.LayoutParams layoutParams25 = linearLayout3.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams25 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams25 : null;
                if (marginLayoutParams3 != null) {
                    marginLayoutParams3.bottomMargin = a28;
                }
                c44.a.j();
                linearLayout3.setOrientation(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMTopLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f304807b = linearLayout3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMTopLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(linearLayout3.getContext());
                linearLayout3.addView(linearLayout4);
                if (linearLayout4.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams26 = linearLayout4.getLayoutParams();
                    layoutParams26.width = 0;
                    linearLayout4.setLayoutParams(layoutParams26);
                }
                c44.a.o();
                if (linearLayout4.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams27 = linearLayout4.getLayoutParams();
                    layoutParams27.height = -2;
                    linearLayout4.setLayoutParams(layoutParams27);
                }
                int g17 = c44.a.g() | c44.a.i();
                android.view.ViewGroup.LayoutParams layoutParams28 = linearLayout4.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams29 = layoutParams28 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams28 : null;
                if (layoutParams29 != null) {
                    layoutParams29.gravity = g17;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams30 = linearLayout4.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams31 = layoutParams30 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams30 : null;
                    if (layoutParams31 != null) {
                        layoutParams31.gravity = g17;
                    }
                }
                c44.a.m();
                linearLayout4.setOrientation(1);
                android.view.ViewGroup.LayoutParams layoutParams32 = linearLayout4.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams33 = layoutParams32 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams32 : null;
                if (layoutParams33 != null) {
                    layoutParams33.weight = 3;
                }
                int a29 = c44.b.a(16);
                android.view.ViewGroup.LayoutParams layoutParams34 = linearLayout4.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams34 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams34 : null;
                if (marginLayoutParams4 != null) {
                    marginLayoutParams4.rightMargin = a29;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMFeedbackTextContainer", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMFeedbackTextContainer", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.TextView textView = new android.widget.TextView(linearLayout4.getContext());
                linearLayout4.addView(textView);
                c44.a.o();
                if (textView.getLayoutParams() == null) {
                    c44.a.o();
                    i17 = -2;
                    textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    i17 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams35 = textView.getLayoutParams();
                    layoutParams35.width = -2;
                    textView.setLayoutParams(layoutParams35);
                }
                c44.a.o();
                if (textView.getLayoutParams() == null) {
                    c44.a.o();
                    textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i17, i17));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams36 = textView.getLayoutParams();
                    layoutParams36.height = i17;
                    textView.setLayoutParams(layoutParams36);
                }
                textView.setIncludeFontPadding(false);
                int a37 = c44.b.a(4);
                android.view.ViewGroup.LayoutParams layoutParams37 = textView.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams37 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams37 : null;
                if (marginLayoutParams5 != null) {
                    marginLayoutParams5.bottomMargin = a37;
                }
                textView.setTextSize(0, (int) ca4.m0.I(com.tencent.mm.R.dimen.a_i));
                textView.setTextColor(i65.a.d(textView.getContext(), com.tencent.mm.R.color.abw));
                java.lang.String string = textView.getContext().getString(com.tencent.mm.R.string.ls8);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                textView.setText(string);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMFeedbackTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMFeedbackTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.TextView textView2 = new android.widget.TextView(linearLayout4.getContext());
                linearLayout4.addView(textView2);
                c44.a.o();
                if (textView2.getLayoutParams() == null) {
                    c44.a.o();
                    i18 = -2;
                    textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    i18 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams38 = textView2.getLayoutParams();
                    layoutParams38.width = -2;
                    textView2.setLayoutParams(layoutParams38);
                }
                c44.a.o();
                if (textView2.getLayoutParams() == null) {
                    c44.a.o();
                    textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i18, i18));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams39 = textView2.getLayoutParams();
                    layoutParams39.height = i18;
                    textView2.setLayoutParams(layoutParams39);
                }
                textView2.setTextSize(0, (int) ca4.m0.I(com.tencent.mm.R.dimen.a_h));
                textView2.setTextColor(i65.a.d(textView2.getContext(), com.tencent.mm.R.color.FG_1));
                java.lang.String string2 = textView2.getContext().getString(com.tencent.mm.R.string.f493190ls5);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                textView2.setText(string2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMFeedbackDescView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMFeedbackDescView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(linearLayout3.getContext());
                linearLayout3.addView(frameLayout3);
                if (frameLayout3.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams40 = frameLayout3.getLayoutParams();
                    layoutParams40.width = 0;
                    frameLayout3.setLayoutParams(layoutParams40);
                }
                c44.a.o();
                if (frameLayout3.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams41 = frameLayout3.getLayoutParams();
                    layoutParams41.height = -2;
                    frameLayout3.setLayoutParams(layoutParams41);
                }
                android.view.ViewGroup.LayoutParams layoutParams42 = frameLayout3.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams43 = layoutParams42 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams42 : null;
                if (layoutParams43 != null) {
                    layoutParams43.weight = 2;
                }
                android.widget.TextView textView3 = new android.widget.TextView(frameLayout3.getContext());
                frameLayout3.addView(textView3);
                c44.a.o();
                if (textView3.getLayoutParams() == null) {
                    c44.a.o();
                    i19 = -2;
                    textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    i19 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams44 = textView3.getLayoutParams();
                    layoutParams44.width = -2;
                    textView3.setLayoutParams(layoutParams44);
                }
                c44.a.o();
                if (textView3.getLayoutParams() == null) {
                    c44.a.o();
                    textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i19, i19));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams45 = textView3.getLayoutParams();
                    layoutParams45.height = i19;
                    textView3.setLayoutParams(layoutParams45);
                }
                int h27 = c44.a.h() | c44.a.i();
                android.view.ViewGroup.LayoutParams layoutParams46 = textView3.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams47 = layoutParams46 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams46 : null;
                if (layoutParams47 != null) {
                    layoutParams47.gravity = h27;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams48 = textView3.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams49 = layoutParams48 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams48 : null;
                    if (layoutParams49 != null) {
                        layoutParams49.gravity = h27;
                    }
                }
                textView3.setGravity(c44.a.d());
                textView3.setIncludeFontPadding(false);
                textView3.setPadding(c44.b.a(12), textView3.getPaddingTop(), textView3.getPaddingRight(), textView3.getPaddingBottom());
                textView3.setPadding(textView3.getPaddingLeft(), c44.b.a(8), textView3.getPaddingRight(), textView3.getPaddingBottom());
                textView3.setPadding(textView3.getPaddingLeft(), textView3.getPaddingTop(), c44.b.a(12), textView3.getPaddingBottom());
                textView3.setPadding(textView3.getPaddingLeft(), textView3.getPaddingTop(), textView3.getPaddingRight(), c44.b.a(8));
                textView3.setTextSize(0, (int) ca4.m0.I(com.tencent.mm.R.dimen.a_h));
                java.lang.String string3 = textView3.getContext().getString(com.tencent.mm.R.string.f493188ls3);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                textView3.setText(string3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMFeedbackSubmitBtn", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f304806a = textView3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMFeedbackSubmitBtn", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer feedbackItemContainer = new com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer(context, null);
                c44.a.o();
                if (feedbackItemContainer.getLayoutParams() == null) {
                    c44.a.o();
                    i27 = -2;
                    feedbackItemContainer.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    i27 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams50 = feedbackItemContainer.getLayoutParams();
                    layoutParams50.width = -2;
                    feedbackItemContainer.setLayoutParams(layoutParams50);
                }
                c44.a.o();
                if (feedbackItemContainer.getLayoutParams() == null) {
                    c44.a.o();
                    feedbackItemContainer.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i27, i27));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams51 = feedbackItemContainer.getLayoutParams();
                    layoutParams51.height = i27;
                    feedbackItemContainer.setLayoutParams(layoutParams51);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMSelectItemContainer", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f304810e = feedbackItemContainer;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMSelectItemContainer", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                linearLayout2.addView(jVar.b());
                android.view.View view = new android.view.View(linearLayout2.getContext());
                linearLayout2.addView(view);
                c44.a.l();
                if (view.getLayoutParams() == null) {
                    c44.a.o();
                    i28 = -2;
                    view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                } else {
                    i28 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams52 = view.getLayoutParams();
                    layoutParams52.width = -1;
                    view.setLayoutParams(layoutParams52);
                }
                if (view.getLayoutParams() == null) {
                    c44.a.o();
                    view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i28, 1));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams53 = view.getLayoutParams();
                    layoutParams53.height = 1;
                    view.setLayoutParams(layoutParams53);
                }
                int a38 = c44.b.a(16);
                android.view.ViewGroup.LayoutParams layoutParams54 = view.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams54 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams54 : null;
                if (marginLayoutParams6 != null) {
                    marginLayoutParams6.topMargin = a38;
                }
                view.setBackgroundColor(i65.a.d(view.getContext(), com.tencent.mm.R.color.FG_3));
                android.widget.FrameLayout frameLayout4 = new android.widget.FrameLayout(linearLayout2.getContext());
                linearLayout2.addView(frameLayout4);
                c44.a.l();
                if (frameLayout4.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams55 = frameLayout4.getLayoutParams();
                    layoutParams55.width = -1;
                    frameLayout4.setLayoutParams(layoutParams55);
                }
                c44.a.o();
                if (frameLayout4.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams56 = frameLayout4.getLayoutParams();
                    layoutParams56.height = -2;
                    frameLayout4.setLayoutParams(layoutParams56);
                }
                int a39 = c44.b.a(16);
                frameLayout4.setPadding(a39, a39, a39, a39);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f304811f = frameLayout4;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.TextView textView4 = new android.widget.TextView(frameLayout4.getContext());
                frameLayout4.addView(textView4);
                c44.a.o();
                if (textView4.getLayoutParams() == null) {
                    c44.a.o();
                    i29 = -2;
                    textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    i29 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams57 = textView4.getLayoutParams();
                    layoutParams57.width = -2;
                    textView4.setLayoutParams(layoutParams57);
                }
                c44.a.o();
                if (textView4.getLayoutParams() == null) {
                    c44.a.o();
                    textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i29, i29));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams58 = textView4.getLayoutParams();
                    layoutParams58.height = i29;
                    textView4.setLayoutParams(layoutParams58);
                }
                int g18 = c44.a.g() | c44.a.f();
                android.view.ViewGroup.LayoutParams layoutParams59 = textView4.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams60 = layoutParams59 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams59 : null;
                if (layoutParams60 != null) {
                    layoutParams60.gravity = g18;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams61 = textView4.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams62 = layoutParams61 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams61 : null;
                    if (layoutParams62 != null) {
                        layoutParams62.gravity = g18;
                    }
                }
                int a47 = c44.b.a(48);
                android.view.ViewGroup.LayoutParams layoutParams63 = textView4.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams63 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams63 : null;
                if (marginLayoutParams7 != null) {
                    marginLayoutParams7.rightMargin = a47;
                }
                textView4.setIncludeFontPadding(false);
                textView4.setSingleLine(true);
                textView4.setEllipsize(android.text.TextUtils.TruncateAt.END);
                textView4.setTextColor(i65.a.d(textView4.getContext(), com.tencent.mm.R.color.FG_1));
                textView4.setTextSize(0, (int) ca4.m0.I(com.tencent.mm.R.dimen.a_h));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMComplaintTextView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f304812g = textView4;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMComplaintTextView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = new com.tencent.mm.ui.widget.imageview.WeImageView(frameLayout4.getContext());
                frameLayout4.addView(weImageView2);
                int a48 = c44.b.a(10);
                if (weImageView2.getLayoutParams() == null) {
                    c44.a.o();
                    weImageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a48, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams64 = weImageView2.getLayoutParams();
                    layoutParams64.width = a48;
                    weImageView2.setLayoutParams(layoutParams64);
                }
                int a49 = c44.b.a(20);
                if (weImageView2.getLayoutParams() == null) {
                    c44.a.o();
                    weImageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a49));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams65 = weImageView2.getLayoutParams();
                    layoutParams65.height = a49;
                    weImageView2.setLayoutParams(layoutParams65);
                }
                weImageView2.setScaleType(c44.a.b());
                int h28 = c44.a.h() | c44.a.f();
                android.view.ViewGroup.LayoutParams layoutParams66 = weImageView2.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams67 = layoutParams66 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams66 : null;
                if (layoutParams67 != null) {
                    layoutParams67.gravity = h28;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams68 = weImageView2.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams69 = layoutParams68 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams68 : null;
                    if (layoutParams69 != null) {
                        layoutParams69.gravity = h28;
                    }
                }
                weImageView2.setImageResource(com.tencent.mm.R.raw.sns_ad_feedback_right_arrow);
                weImageView2.setIconColor(i65.a.d(weImageView2.getContext(), com.tencent.mm.R.color.FG_2));
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = new com.tencent.mm.ui.widget.imageview.WeImageView(linearLayout.getContext());
                linearLayout.addView(weImageView3);
                int a57 = c44.b.a(15);
                if (weImageView3.getLayoutParams() == null) {
                    c44.a.o();
                    weImageView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a57, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams70 = weImageView3.getLayoutParams();
                    layoutParams70.width = a57;
                    weImageView3.setLayoutParams(layoutParams70);
                }
                int a58 = c44.b.a(6);
                if (weImageView3.getLayoutParams() == null) {
                    c44.a.o();
                    weImageView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a58));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams71 = weImageView3.getLayoutParams();
                    layoutParams71.height = a58;
                    weImageView3.setLayoutParams(layoutParams71);
                }
                int h29 = c44.a.h();
                android.view.ViewGroup.LayoutParams layoutParams72 = weImageView3.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams73 = layoutParams72 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams72 : null;
                if (layoutParams73 != null) {
                    layoutParams73.gravity = h29;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams74 = weImageView3.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams75 = layoutParams74 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams74 : null;
                    if (layoutParams75 != null) {
                        layoutParams75.gravity = h29;
                    }
                }
                int a59 = c44.b.a(26);
                android.view.ViewGroup.LayoutParams layoutParams76 = weImageView3.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams76 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams76 : null;
                if (marginLayoutParams8 != null) {
                    marginLayoutParams8.rightMargin = a59;
                }
                weImageView3.setScaleType(c44.a.b());
                weImageView3.setImageResource(com.tencent.mm.R.raw.sns_ad_feedback_trangle);
                weImageView3.setIconColor(i65.a.d(weImageView3.getContext(), com.tencent.mm.R.color.f478494f));
                weImageView3.setRotation(180.0f);
                c44.a.c();
                weImageView3.setVisibility(8);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f304809d = weImageView3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                frameLayout2.setTag(com.tencent.mm.R.id.qae, jVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder");
                frameLayout = frameLayout2;
            }
            m74.b bVar = new m74.b(context);
            this.f304799e = bVar;
            bVar.setContentView(frameLayout);
            this.f304799e.setWidth(this.f304805n);
            this.f304799e.setHeight(-2);
            this.f304799e.setFocusable(true);
            this.f304799e.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            this.f304799e.setOnDismissListener(this);
            str2 = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final android.graphics.Rect f(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = iArr[0];
        rect.left = i17;
        rect.top = iArr[1];
        rect.right = i17 + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        return rect;
    }

    public final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("complaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        try {
            android.content.Context context = this.f304798d;
            if (context != null) {
                android.content.Intent f17 = this.f304802h.f();
                boolean c17 = com.tencent.mm.sdk.platformtools.c2.c(f17, "complaint_weapp", false);
                com.tencent.mars.xlog.Log.i("FeedbackNewStylePromptManager", "complaint, toWeApp=" + c17);
                if (c17) {
                    l(f17);
                } else {
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(f17, context);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("complaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final void h(android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onComplaintReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        java.util.Set set = this.f304804m;
        if (set != null && (obj instanceof j74.c)) {
            int i17 = ((j74.c) obj).f298064a;
            if (view == null || !view.isSelected()) {
                ((java.util.HashSet) set).remove(java.lang.Integer.valueOf(i17));
                com.tencent.mars.xlog.Log.i("FeedbackNewStylePromptManager", "onComplaintReason, remove id=" + i17);
            } else {
                ((java.util.HashSet) set).add(java.lang.Integer.valueOf(i17));
                com.tencent.mars.xlog.Log.i("FeedbackNewStylePromptManager", "onComplaintReason, add id=" + i17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onComplaintReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final void i(android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.model.q2 l17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        boolean booleanValue = obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : false;
        java.util.Set set = this.f304804m;
        com.tencent.mars.xlog.Log.i("FeedbackNewStylePromptManager", "onConfirm, isFeedback=" + booleanValue + ", selectCount=" + (set != null ? ((java.util.HashSet) set).size() : 0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("thanks", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        try {
            com.tencent.mars.xlog.Log.i("FeedbackNewStylePromptManager", "thanks, isFeedback=" + booleanValue);
            android.content.Context context = this.f304798d;
            db5.t7.h(context, booleanValue ? context.getString(com.tencent.mm.R.string.ls7) : context.getString(com.tencent.mm.R.string.f493189ls4));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("thanks", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        d();
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f304803i;
        if (iVar != null) {
            iVar.G(view);
        }
        i74.a aVar = this.f304802h;
        if (aVar != null && (l17 = aVar.l(set)) != null) {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(l17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final void j(int i17) {
        android.view.View view;
        android.view.View view2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        k74.h hVar = this.f304801g;
        if (hVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            android.view.View view3 = null;
            if (i17 >= 0) {
                k74.j jVar = hVar.f304793e;
                if (jVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                    view2 = jVar.f304808c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                } else {
                    view2 = null;
                }
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view4 = view2;
                    yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                k74.j jVar2 = hVar.f304793e;
                if (jVar2 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                    view3 = jVar2.f304809d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                }
                if (view3 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    android.view.View view5 = view3;
                    yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                k74.j jVar3 = hVar.f304793e;
                if (jVar3 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                    view = jVar3.f304808c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                } else {
                    view = null;
                }
                if (view != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    android.view.View view6 = view;
                    yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                k74.j jVar4 = hVar.f304793e;
                if (jVar4 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                    view3 = jVar4.f304809d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                }
                if (view3 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    android.view.View view7 = view3;
                    yj0.a.d(view7, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[Catch: all -> 0x0176, TRY_ENTER, TryCatch #0 {all -> 0x0176, blocks: (B:7:0x0020, B:9:0x002e, B:11:0x0040, B:14:0x004a, B:22:0x0063, B:26:0x0071, B:28:0x0088, B:29:0x009c, B:31:0x00b4, B:33:0x00ba, B:35:0x00c3, B:36:0x00e8, B:37:0x00d5, B:38:0x00f9, B:42:0x011d, B:44:0x013c, B:45:0x0149, B:47:0x0163, B:48:0x016f, B:51:0x016a, B:52:0x0143, B:53:0x008c, B:55:0x0092, B:56:0x0099, B:59:0x0067, B:62:0x0034), top: B:6:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(android.view.View r14, com.tencent.mm.plugin.sns.storage.SnsInfo r15) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k74.i.k(android.view.View, com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    public final void l(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "appUserName");
        java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(intent, "appPagePath");
        java.lang.String l19 = com.tencent.mm.sdk.platformtools.c2.l(intent, "appVersion");
        java.lang.String l27 = com.tencent.mm.sdk.platformtools.c2.l(intent, "aId");
        java.lang.String l28 = com.tencent.mm.sdk.platformtools.c2.l(intent, "traceId");
        java.lang.String l29 = com.tencent.mm.sdk.platformtools.c2.l(intent, "sceneNote");
        java.lang.String l37 = com.tencent.mm.sdk.platformtools.c2.l(intent, "uxInfo");
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1045);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        if (android.text.TextUtils.isEmpty(l17)) {
            com.tencent.mars.xlog.Log.w("FeedbackNewStylePromptManager", "the app user name is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        } else {
            ca4.z0.r0(l17, l18, l19, l27, l28, l29, l37, g17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        m74.b bVar = this.f304799e;
        com.tencent.mars.xlog.Log.i("FeedbackNewStylePromptManager", "onDismiss, windows.hash=" + (bVar == null ? 0 : bVar.hashCode()));
        this.f304799e = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }
}
