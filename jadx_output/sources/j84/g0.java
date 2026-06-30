package j84;

/* loaded from: classes4.dex */
public abstract class g0 extends com.tencent.mm.plugin.sns.ui.widget.l {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public android.widget.FrameLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f298194J;
    public float K;
    public float L;
    public int M;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f298195o;

    /* renamed from: p, reason: collision with root package name */
    public final int f298196p;

    /* renamed from: q, reason: collision with root package name */
    public final i64.b1 f298197q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f298198r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f298199s;

    /* renamed from: t, reason: collision with root package name */
    public android.content.Context f298200t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f298201u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f298202v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f298203w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f298204x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f298205y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f298206z;

    public g0(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, i64.b1 b1Var) {
        super(str, yVar, view);
        this.f298195o = view;
        this.f298196p = i17;
        this.f298197q = b1Var;
        this.f298198r = jz5.h.b(new j84.g(this));
        this.f298201u = jz5.h.b(new j84.j(this));
        this.f298202v = jz5.h.b(new j84.i(this));
        this.f298203w = jz5.h.b(new j84.p(this));
        this.f298204x = jz5.h.b(new j84.r(this));
        this.f298205y = jz5.h.b(new j84.d0(this));
        this.f298206z = jz5.h.b(new j84.k(this));
        this.A = jz5.h.b(new j84.e0(this));
        this.B = jz5.h.b(new j84.l(this));
        this.C = jz5.h.b(new j84.q(this));
        this.D = jz5.h.b(new j84.f0(this));
        this.E = jz5.h.b(new j84.c0(this));
        this.F = jz5.h.b(new j84.n(this));
        this.G = jz5.h.b(new j84.o(this));
        this.H = jz5.h.b(new j84.h(this));
    }

    public final android.widget.TextView A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAmountTextView1", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f298206z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAmountTextView1", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return textView;
    }

    public final android.widget.TextView B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAmountTextView2", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.B).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAmountTextView2", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return textView;
    }

    public final android.widget.FrameLayout C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getButtonContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.F).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getButtonContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return frameLayout;
    }

    public final android.widget.TextView D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCouponTypeTextView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.C).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCouponTypeTextView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return textView;
    }

    public final android.view.View E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return this.f298195o;
    }

    public final android.widget.FrameLayout F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScratchCardContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f298204x).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScratchCardContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return frameLayout;
    }

    public final android.widget.LinearLayout G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.f298205y).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return linearLayout;
    }

    public final void H() {
        com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView z17;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardOtherContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.f298203w).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardOtherContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdScratchCardViewStub", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.f298201u).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdScratchCardViewStub", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (viewStub != null) {
            viewStub.setVisibility(8);
        }
        android.widget.FrameLayout y17 = y();
        if (y17 != null) {
            y17.setVisibility(8);
        }
        s34.w0 w0Var = null;
        this.I = null;
        this.f298194J = null;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f298199s;
        if (snsInfo != null && (adXml = snsInfo.getAdXml()) != null) {
            w0Var = adXml.adScratchCardInfo;
        }
        if (w0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            return;
        }
        if (!w0Var.a() && (z17 = z()) != null) {
            z17.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
    }

    public final void I() {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScratchedCouponClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f298199s;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScratchedCouponClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            return;
        }
        if (this.f298200t == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScratchedCouponClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            return;
        }
        s34.w0 w0Var = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null) ? null : adXml.adScratchCardInfo;
        if (w0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScratchedCouponClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            return;
        }
        android.widget.FrameLayout F = F();
        if (F != null) {
            F.setOnClickListener(j84.s.f298228d);
        }
        android.widget.FrameLayout C = C();
        if (C != null) {
            C.setOnClickListener(new j84.t(this, w0Var));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScratchedCouponClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        j84.g0 g0Var;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        kotlin.jvm.internal.o.g(model, "model");
        android.view.View view = this.f298195o;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        } else {
            s34.w0 w0Var = model.getAdXml().adScratchCardInfo;
            if (w0Var != null) {
                this.f298199s = model;
                this.f298200t = context;
                this.M = 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardOtherContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                android.view.View view2 = (android.view.View) ((jz5.n) this.f298203w).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardOtherContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdScratchCardRootView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.f298202v).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdScratchCardRootView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                android.widget.FrameLayout y17 = y();
                if (y17 != null) {
                    y17.setVisibility(8);
                }
                view.getViewTreeObserver().addOnPreDrawListener(new j84.m(view, this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupTextViews", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                ca4.m0.x0(A(), com.tencent.mm.R.dimen.a_k);
                ca4.m0.x0(D(), com.tencent.mm.R.dimen.a_g);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                jz5.g gVar = this.D;
                android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                ca4.m0.x0(textView, com.tencent.mm.R.dimen.a_h);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                jz5.g gVar2 = this.E;
                android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar2).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                ca4.m0.x0(textView2, com.tencent.mm.R.dimen.a_g);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getButtonText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                jz5.g gVar3 = this.G;
                android.widget.TextView textView3 = (android.widget.TextView) ((jz5.n) gVar3).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getButtonText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                ca4.m0.x0(textView3, com.tencent.mm.R.dimen.a_h);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupTextViews", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupCouponContent", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCouponType", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCouponType", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                jz5.g gVar4 = this.A;
                if (w0Var.f402808e == 1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextViewGap", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                    android.view.View view3 = (android.view.View) ((jz5.n) gVar4).getValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextViewGap", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                    if (view3 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "setupCouponContent", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ad/adxml/AdScratchCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "setupCouponContent", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ad/adxml/AdScratchCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView A = A();
                    if (A != null) {
                        A.setText(context.getString(com.tencent.mm.R.string.f493837pa3));
                    }
                    android.widget.TextView A2 = A();
                    if (A2 != null) {
                        A2.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/WeChatSansSS-Medium.ttf"));
                    }
                    android.widget.TextView B = B();
                    if (B != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVoucherNumberStr", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVoucherNumberStr", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                        B.setText(w0Var.f402809f);
                    }
                    ca4.m0.x0(B(), com.tencent.mm.R.dimen.a_k);
                    android.widget.TextView B2 = B();
                    if (B2 != null) {
                        int f17 = c44.a.f();
                        android.view.ViewGroup.LayoutParams layoutParams = B2.getLayoutParams();
                        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            layoutParams2.gravity = f17;
                        } else {
                            android.view.ViewGroup.LayoutParams layoutParams3 = B2.getLayoutParams();
                            android.widget.FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
                            if (layoutParams4 != null) {
                                layoutParams4.gravity = f17;
                            }
                        }
                    }
                    android.widget.TextView B3 = B();
                    if (B3 != null) {
                        B3.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/WeChatSansStd-Medium.ttf"));
                    }
                    android.widget.TextView D = D();
                    if (D != null) {
                        D.setText(context.getString(com.tencent.mm.R.string.f493836pa2));
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextViewGap", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                    android.view.View view4 = (android.view.View) ((jz5.n) gVar4).getValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextViewGap", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                    if (view4 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "setupCouponContent", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ad/adxml/AdScratchCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent", "setupCouponContent", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ad/adxml/AdScratchCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView A3 = A();
                    if (A3 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDiscountStr", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDiscountStr", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                        A3.setText(w0Var.f402810g);
                    }
                    android.widget.TextView A4 = A();
                    if (A4 != null) {
                        A4.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/WeChatSansStd-Medium.ttf"));
                    }
                    android.widget.TextView B4 = B();
                    if (B4 != null) {
                        B4.setText(context.getString(com.tencent.mm.R.string.p_z));
                    }
                    ca4.m0.x0(B(), com.tencent.mm.R.dimen.a_g);
                    android.widget.TextView B5 = B();
                    if (B5 != null) {
                        android.widget.ImageView.ScaleType scaleType = c44.a.f38523a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGravity_bottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLConstantsKt");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGravity_bottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLConstantsKt");
                        int i17 = c44.a.f38527e;
                        android.view.ViewGroup.LayoutParams layoutParams5 = B5.getLayoutParams();
                        android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
                        if (layoutParams6 != null) {
                            layoutParams6.gravity = i17;
                        } else {
                            android.view.ViewGroup.LayoutParams layoutParams7 = B5.getLayoutParams();
                            android.widget.FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams7 : null;
                            if (layoutParams8 != null) {
                                layoutParams8.gravity = i17;
                            }
                        }
                    }
                    android.widget.TextView B6 = B();
                    if (B6 != null) {
                        B6.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/WeChatSansSS-Medium.ttf"));
                    }
                    android.widget.TextView D2 = D();
                    if (D2 != null) {
                        D2.setText(context.getString(com.tencent.mm.R.string.f493835pa1));
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                android.widget.TextView textView4 = (android.widget.TextView) ((jz5.n) gVar).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (textView4 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleAfterScratch", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleAfterScratch", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    textView4.setText(w0Var.f402806c);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                android.widget.TextView textView5 = (android.widget.TextView) ((jz5.n) gVar2).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubTitleAfterScratchText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (textView5 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubTitleAfterScratch", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubTitleAfterScratch", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    textView5.setText(w0Var.f402807d);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getButtonText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                android.widget.TextView textView6 = (android.widget.TextView) ((jz5.n) gVar3).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getButtonText", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (textView6 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBtnTitle", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBtnTitle", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    textView6.setText(w0Var.f402816m);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupCouponContent", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupScratchState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                if (w0Var.a()) {
                    com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView z18 = z();
                    if (z18 != null) {
                        z18.setVisibility(8);
                    }
                    android.widget.FrameLayout C = C();
                    if (C != null) {
                        C.setVisibility(0);
                    }
                    android.widget.LinearLayout G = G();
                    if (G != null) {
                        G.setTranslationX(0.0f);
                        android.view.ViewGroup.LayoutParams layoutParams9 = G.getLayoutParams();
                        android.widget.RelativeLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams9 : null;
                        if (layoutParams10 != null) {
                            layoutParams10.removeRule(13);
                            layoutParams10.addRule(9);
                            layoutParams10.addRule(15);
                            layoutParams10.addRule(0, com.tencent.mm.R.id.snu);
                            layoutParams10.setMarginEnd(i65.a.b(G.getContext(), 8));
                            G.setLayoutParams(layoutParams10);
                        }
                        G.requestLayout();
                    }
                    I();
                } else {
                    com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView z19 = z();
                    if (z19 != null) {
                        z19.setVisibility(0);
                    }
                    android.widget.FrameLayout C2 = C();
                    if (C2 != null) {
                        C2.setVisibility(8);
                    }
                    android.widget.LinearLayout G2 = G();
                    if (G2 != null) {
                        G2.setTranslationX(0.0f);
                        android.view.ViewGroup.LayoutParams layoutParams11 = G2.getLayoutParams();
                        android.widget.RelativeLayout.LayoutParams layoutParams12 = layoutParams11 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams11 : null;
                        if (layoutParams12 != null) {
                            layoutParams12.addRule(13);
                            layoutParams12.removeRule(9);
                            layoutParams12.removeRule(15);
                            layoutParams12.setMarginEnd(0);
                            G2.setLayoutParams(layoutParams12);
                        }
                        G2.requestLayout();
                    }
                    com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView z27 = z();
                    if (z27 != null) {
                        z27.setModel(model.getAdXml().adScratchCardInfo);
                    }
                    com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView z28 = z();
                    if (z28 == null) {
                        g0Var = this;
                    } else {
                        g0Var = this;
                        z28.setOnScratchCompleteListener(new j84.v(g0Var, context, model));
                    }
                    com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView z29 = z();
                    if (z29 != null) {
                        z29.setOnActionDown(new j84.w(g0Var));
                    }
                    com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView z37 = z();
                    if (z37 != null) {
                        z37.setOnActionUp(new j84.x(g0Var));
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupScratchState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                str = "bindComponentModel";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        }
        str = "bindComponentModel";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        H();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
    }

    public final android.widget.FrameLayout y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f298198r).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return frameLayout;
    }

    public final com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdScratchCardCoverView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView adScratchCoverView = (com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView) ((jz5.n) this.H).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdScratchCardCoverView", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        return adScratchCoverView;
    }
}
