package l94;

/* loaded from: classes4.dex */
public final class g extends l94.e {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f317353h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f317354i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f317355j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f317356k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f317357l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f317358m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f317359n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super("WsFoldAdCardBigAvatarBottomComponent", context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        java.lang.String string;
        int e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBigAvatarBottomComponent");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i(h(), "the fold sns info is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBigAvatarBottomComponent");
            return;
        }
        java.lang.String str = b17.f372074g;
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f317353h;
        if (mMRoundCornerImageView == null) {
            kotlin.jvm.internal.o.o("avatarImageView");
            throw null;
        }
        a84.m.a(str, mMRoundCornerImageView);
        android.widget.TextView textView = this.f317354i;
        if (textView != null) {
            com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
            f();
            java.lang.String str2 = b17.f372073f;
            if (str2 == null) {
                str2 = "";
            }
            textView.setText(Di.Ri(str2, true));
        }
        android.widget.ImageView imageView = this.f317359n;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("goodShopImageView");
            throw null;
        }
        j94.b.a(imageView, b17);
        r45.x30 x30Var = b17.f372080p;
        if (x30Var == null) {
            java.util.LinkedList linkedList = b17.f372072e;
            x30Var = linkedList != null ? (r45.x30) kz5.n0.Z(linkedList) : null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resolveSecondLineText", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBigAvatarBottomComponent");
        if (x30Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resolveSecondLineText", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBigAvatarBottomComponent");
            string = null;
        } else {
            int i17 = x30Var.f389728d;
            if (i17 != 4) {
                if (i17 == 10 || i17 == 12 || i17 == 24) {
                    string = f().getString(com.tencent.mm.R.string.clc);
                } else if (i17 == 26) {
                    string = f().getString(com.tencent.mm.R.string.pia);
                } else if (i17 != 28) {
                    string = null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resolveSecondLineText", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBigAvatarBottomComponent");
            }
            string = kotlin.jvm.internal.o.b(x30Var.f389732h, "2") ? f().getString(com.tencent.mm.R.string.pi8) : f().getString(com.tencent.mm.R.string.j6j);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resolveSecondLineText", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBigAvatarBottomComponent");
        }
        boolean z17 = !(string == null || string.length() == 0);
        android.widget.TextView textView2 = this.f317354i;
        if (textView2 != null) {
            textView2.setTextSize(0, i65.a.j(textView2.getContext()) * i65.a.a(textView2.getContext(), z17 ? 15.0f : 17.0f));
        }
        android.widget.TextView textView3 = this.f317355j;
        if (textView3 != null) {
            if (z17) {
                textView3.setVisibility(0);
                textView3.setText(string);
            } else {
                textView3.setVisibility(8);
            }
        }
        android.widget.ImageView imageView2 = this.f317357l;
        if (imageView2 != null) {
            java.lang.String str3 = com.tencent.mm.ui.bk.C() ? b17.f372088x : b17.f372079o;
            imageView2.setVisibility(str3 == null || str3.length() == 0 ? 8 : 0);
            a84.m.a(str3, imageView2);
        }
        android.widget.TextView textView4 = this.f317356k;
        if (textView4 != null) {
            java.lang.String str4 = b17.f372078n;
            if (!(str4 == null || str4.length() == 0)) {
                com.tencent.mm.smiley.x1 Di2 = com.tencent.mm.smiley.x1.Di();
                f();
                textView4.setText(Di2.Ri(b17.f372078n, true));
            }
            int d17 = i65.a.d(f(), com.tencent.mm.R.color.abw);
            if (com.tencent.mm.ui.bk.C()) {
                r45.c43 c43Var = b17.f372089y;
                e17 = ca4.n0.e(c43Var != null ? c43Var.f371267e : null, d17);
            } else {
                r45.c43 c43Var2 = b17.f372089y;
                e17 = ca4.n0.e(c43Var2 != null ? c43Var2.f371266d : null, d17);
            }
            textView4.setTextColor(e17);
        }
        android.view.View view = this.f317358m;
        if (view != null) {
            view.setOnClickListener(new l94.f(b17, adInfo));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBigAvatarBottomComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBigAvatarBottomComponent");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(f());
        int a17 = c44.b.a(4);
        linearLayout.setPadding(a17, a17, a17, a17);
        c44.a.j();
        linearLayout.setOrientation(0);
        c44.a.l();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = -1;
            linearLayout.setLayoutParams(layoutParams);
        }
        c44.a.o();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            layoutParams2.height = -2;
            linearLayout.setLayoutParams(layoutParams2);
        }
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
        linearLayout.addView(linearLayout2);
        c44.a.j();
        linearLayout2.setOrientation(0);
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            layoutParams3.width = 0;
            linearLayout2.setLayoutParams(layoutParams3);
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams5 = layoutParams4 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams4 : null;
        if (layoutParams5 != null) {
            layoutParams5.weight = 1;
        }
        c44.a.o();
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams6 = linearLayout2.getLayoutParams();
            layoutParams6.height = -2;
            linearLayout2.setLayoutParams(layoutParams6);
        }
        int a18 = c44.b.a(12);
        android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams7 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams7 : null;
        if (marginLayoutParams != null) {
            n3.u.g(marginLayoutParams, a18);
        }
        int f17 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams8 = linearLayout2.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams9 = layoutParams8 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams8 : null;
        if (layoutParams9 != null) {
            layoutParams9.gravity = f17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams10 = linearLayout2.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams11 = layoutParams10 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams10 : null;
            if (layoutParams11 != null) {
                layoutParams11.gravity = f17;
            }
        }
        linearLayout2.setGravity(c44.a.f());
        android.content.Context context = linearLayout2.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = new com.tencent.mm.ui.widget.MMRoundCornerImageView(context);
        int a19 = (int) com.tencent.mm.ui.gk.a(c44.b.a(36));
        if (mMRoundCornerImageView.getLayoutParams() == null) {
            c44.a.o();
            mMRoundCornerImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a19, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams12 = mMRoundCornerImageView.getLayoutParams();
            layoutParams12.width = a19;
            mMRoundCornerImageView.setLayoutParams(layoutParams12);
        }
        int a27 = (int) com.tencent.mm.ui.gk.a(c44.b.a(36));
        if (mMRoundCornerImageView.getLayoutParams() == null) {
            c44.a.o();
            mMRoundCornerImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a27));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams13 = mMRoundCornerImageView.getLayoutParams();
            layoutParams13.height = a27;
            mMRoundCornerImageView.setLayoutParams(layoutParams13);
        }
        int a28 = c44.b.a(8);
        android.view.ViewGroup.LayoutParams layoutParams14 = mMRoundCornerImageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams14 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams14 : null;
        if (marginLayoutParams2 != null) {
            n3.u.g(marginLayoutParams2, a28);
        }
        mMRoundCornerImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        mMRoundCornerImageView.setRadius((int) com.tencent.mm.ui.gk.a(c44.b.a(18)));
        int f18 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams15 = mMRoundCornerImageView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams16 = layoutParams15 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams15 : null;
        if (layoutParams16 != null) {
            layoutParams16.gravity = f18;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams17 = mMRoundCornerImageView.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams18 = layoutParams17 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams17 : null;
            if (layoutParams18 != null) {
                layoutParams18.gravity = f18;
            }
        }
        this.f317353h = mMRoundCornerImageView;
        linearLayout2.addView(mMRoundCornerImageView);
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(linearLayout2.getContext());
        linearLayout2.addView(linearLayout3);
        if (linearLayout3.getLayoutParams() == null) {
            c44.a.o();
            linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams19 = linearLayout3.getLayoutParams();
            layoutParams19.width = 0;
            linearLayout3.setLayoutParams(layoutParams19);
        }
        c44.a.o();
        if (linearLayout3.getLayoutParams() == null) {
            c44.a.o();
            linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams20 = linearLayout3.getLayoutParams();
            layoutParams20.height = -2;
            linearLayout3.setLayoutParams(layoutParams20);
        }
        android.view.ViewGroup.LayoutParams layoutParams21 = linearLayout3.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams22 = layoutParams21 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams21 : null;
        if (layoutParams22 != null) {
            layoutParams22.weight = 1;
        }
        c44.a.m();
        linearLayout3.setOrientation(1);
        int f19 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams23 = linearLayout3.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams24 = layoutParams23 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams23 : null;
        if (layoutParams24 != null) {
            layoutParams24.gravity = f19;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams25 = linearLayout3.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams26 = layoutParams25 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams25 : null;
            if (layoutParams26 != null) {
                layoutParams26.gravity = f19;
            }
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = new androidx.constraintlayout.widget.ConstraintLayout(linearLayout3.getContext());
        c44.a.l();
        if (constraintLayout.getLayoutParams() == null) {
            c44.a.o();
            constraintLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams27 = constraintLayout.getLayoutParams();
            layoutParams27.width = -1;
            constraintLayout.setLayoutParams(layoutParams27);
        }
        c44.a.o();
        if (constraintLayout.getLayoutParams() == null) {
            c44.a.o();
            constraintLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams28 = constraintLayout.getLayoutParams();
            layoutParams28.height = -2;
            constraintLayout.setLayoutParams(layoutParams28);
        }
        android.widget.TextView textView = new android.widget.TextView(constraintLayout.getContext());
        textView.setId(android.view.View.generateViewId());
        c44.a.o();
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams29 = textView.getLayoutParams();
            layoutParams29.height = -2;
            textView.setLayoutParams(layoutParams29);
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            android.graphics.Typeface create = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 400, false);
            kotlin.jvm.internal.o.f(create, "create(...)");
            textView.setTypeface(create, 0);
        }
        textView.setTextSize(0, i65.a.j(textView.getContext()) * i65.a.a(textView.getContext(), 17.0f));
        textView.setTextColor(i65.a.d(textView.getContext(), com.tencent.mm.R.color.FG_0));
        textView.setMaxLines(1);
        textView.setEllipsize(c44.a.a());
        this.f317354i = textView;
        android.widget.ImageView imageView = new android.widget.ImageView(constraintLayout.getContext());
        imageView.setId(android.view.View.generateViewId());
        int a29 = c44.b.a(38);
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a29, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams30 = imageView.getLayoutParams();
            layoutParams30.width = a29;
            imageView.setLayoutParams(layoutParams30);
        }
        int a37 = c44.b.a(16);
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a37));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams31 = imageView.getLayoutParams();
            layoutParams31.height = a37;
            imageView.setLayoutParams(layoutParams31);
        }
        imageView.setVisibility(8);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.f317359n = imageView;
        android.widget.TextView textView2 = this.f317354i;
        c44.a.o();
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams32 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, -2);
        layoutParams32.f10906q = 0;
        android.widget.ImageView imageView2 = this.f317359n;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("goodShopImageView");
            throw null;
        }
        layoutParams32.f10907r = imageView2.getId();
        layoutParams32.f10893h = 0;
        layoutParams32.f10899k = 0;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams32).width = 0;
        layoutParams32.H = 1;
        layoutParams32.F = 2;
        layoutParams32.f10915z = 0.0f;
        constraintLayout.addView(textView2, layoutParams32);
        android.widget.ImageView imageView3 = this.f317359n;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("goodShopImageView");
            throw null;
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams33 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams((int) (c44.b.a(38) * i65.a.q(constraintLayout.getContext())), (int) (c44.b.a(16) * i65.a.q(constraintLayout.getContext())));
        android.widget.TextView textView3 = this.f317354i;
        layoutParams33.f10905p = textView3 != null ? textView3.getId() : -1;
        layoutParams33.f10908s = 0;
        layoutParams33.f10893h = 0;
        layoutParams33.f10899k = 0;
        layoutParams33.setMarginStart(c44.b.a(4));
        constraintLayout.addView(imageView3, layoutParams33);
        linearLayout3.addView(constraintLayout);
        android.widget.TextView textView4 = new android.widget.TextView(linearLayout3.getContext());
        linearLayout3.addView(textView4);
        this.f317355j = textView4;
        c44.a.o();
        if (textView4.getLayoutParams() == null) {
            c44.a.o();
            textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams34 = textView4.getLayoutParams();
            layoutParams34.width = -2;
            textView4.setLayoutParams(layoutParams34);
        }
        c44.a.o();
        if (textView4.getLayoutParams() == null) {
            c44.a.o();
            textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams35 = textView4.getLayoutParams();
            layoutParams35.height = -2;
            textView4.setLayoutParams(layoutParams35);
        }
        int a38 = c44.b.a(2);
        android.view.ViewGroup.LayoutParams layoutParams36 = textView4.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams36 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams36 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.topMargin = a38;
        }
        if (i17 >= 28) {
            android.graphics.Typeface create2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 400, false);
            kotlin.jvm.internal.o.f(create2, "create(...)");
            textView4.setTypeface(create2, 0);
        }
        textView4.setTextSize(0, i65.a.j(textView4.getContext()) * i65.a.a(textView4.getContext(), 12.0f));
        textView4.setTextColor(i65.a.d(textView4.getContext(), com.tencent.mm.R.color.f478520a84));
        textView4.setMaxLines(1);
        textView4.setEllipsize(c44.a.a());
        c44.a.c();
        textView4.setVisibility(8);
        android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(linearLayout.getContext());
        linearLayout.addView(linearLayout4);
        this.f317358m = linearLayout4;
        c44.a.o();
        if (linearLayout4.getLayoutParams() == null) {
            c44.a.o();
            linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams37 = linearLayout4.getLayoutParams();
            layoutParams37.width = -2;
            linearLayout4.setLayoutParams(layoutParams37);
        }
        c44.a.o();
        if (linearLayout4.getLayoutParams() == null) {
            c44.a.o();
            linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams38 = linearLayout4.getLayoutParams();
            layoutParams38.height = -2;
            linearLayout4.setLayoutParams(layoutParams38);
        }
        c44.a.j();
        linearLayout4.setOrientation(0);
        int f27 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams39 = linearLayout4.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams40 = layoutParams39 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams39 : null;
        if (layoutParams40 != null) {
            layoutParams40.gravity = f27;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams41 = linearLayout4.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams42 = layoutParams41 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams41 : null;
            if (layoutParams42 != null) {
                layoutParams42.gravity = f27;
            }
        }
        linearLayout4.setClipToOutline(true);
        linearLayout4.setOutlineProvider(new al5.z1(c44.b.a(6)));
        linearLayout4.setBackgroundColor(i65.a.d(linearLayout4.getContext(), com.tencent.mm.R.color.f478494f));
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), c44.b.a(6), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), c44.b.a(6));
        linearLayout4.setPadding(c44.b.a(12), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), c44.b.a(12), linearLayout4.getPaddingBottom());
        linearLayout4.setForeground(linearLayout4.getContext().getDrawable(com.tencent.mm.R.drawable.f482236da3));
        android.widget.ImageView imageView4 = new android.widget.ImageView(linearLayout4.getContext());
        linearLayout4.addView(imageView4);
        int a39 = c44.b.a(16);
        if (imageView4.getLayoutParams() == null) {
            c44.a.o();
            imageView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a39, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams43 = imageView4.getLayoutParams();
            layoutParams43.width = a39;
            imageView4.setLayoutParams(layoutParams43);
        }
        int a47 = c44.b.a(16);
        if (imageView4.getLayoutParams() == null) {
            c44.a.o();
            imageView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a47));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams44 = imageView4.getLayoutParams();
            layoutParams44.height = a47;
            imageView4.setLayoutParams(layoutParams44);
        }
        int a48 = c44.b.a(2);
        android.view.ViewGroup.LayoutParams layoutParams45 = imageView4.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams45 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams45 : null;
        if (marginLayoutParams4 != null) {
            n3.u.g(marginLayoutParams4, a48);
        }
        int f28 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams46 = imageView4.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams47 = layoutParams46 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams46 : null;
        if (layoutParams47 != null) {
            layoutParams47.gravity = f28;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams48 = imageView4.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams49 = layoutParams48 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams48 : null;
            if (layoutParams49 != null) {
                layoutParams49.gravity = f28;
            }
        }
        c44.a.c();
        imageView4.setVisibility(8);
        a84.v0.a(imageView4.getContext(), imageView4, 16, 16);
        this.f317357l = imageView4;
        android.widget.TextView textView5 = new android.widget.TextView(linearLayout4.getContext());
        linearLayout4.addView(textView5);
        this.f317356k = textView5;
        c44.a.o();
        if (textView5.getLayoutParams() == null) {
            c44.a.o();
            textView5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams50 = textView5.getLayoutParams();
            layoutParams50.width = -2;
            textView5.setLayoutParams(layoutParams50);
        }
        c44.a.o();
        if (textView5.getLayoutParams() == null) {
            c44.a.o();
            textView5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams51 = textView5.getLayoutParams();
            layoutParams51.height = -2;
            textView5.setLayoutParams(layoutParams51);
        }
        textView5.setMaxLines(1);
        if (i17 >= 28) {
            android.graphics.Typeface create3 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 500, false);
            kotlin.jvm.internal.o.f(create3, "create(...)");
            textView5.setTypeface(create3, 0);
        }
        java.lang.String string = textView5.getContext().getString(com.tencent.mm.R.string.pct);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        textView5.setText(string);
        textView5.setTextSize(0, i65.a.j(textView5.getContext()) * i65.a.a(textView5.getContext(), 14.0f));
        textView5.setTextColor(i65.a.d(textView5.getContext(), com.tencent.mm.R.color.abw));
        int f29 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams52 = textView5.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams53 = layoutParams52 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams52 : null;
        if (layoutParams53 != null) {
            layoutParams53.gravity = f29;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams54 = textView5.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams55 = layoutParams54 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams54 : null;
            if (layoutParams55 != null) {
                layoutParams55.gravity = f29;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBigAvatarBottomComponent");
        return linearLayout;
    }
}
