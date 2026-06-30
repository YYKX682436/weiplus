package p44;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f351862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f351863b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f351864c;

    /* renamed from: d, reason: collision with root package name */
    public final i64.b1 f351865d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f351866e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f351867f;

    /* renamed from: g, reason: collision with root package name */
    public p44.r f351868g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f351869h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f351870i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f351871j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.FrameLayout f351872k;

    /* renamed from: l, reason: collision with root package name */
    public final p44.o0 f351873l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f351874m;

    /* renamed from: n, reason: collision with root package name */
    public final p44.x f351875n;

    static {
        new p44.w(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(android.content.Context mContext, int i17, int i18, android.view.View mContentView, android.view.View itemRootView, i64.b1 b1Var) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mContentView, "mContentView");
        kotlin.jvm.internal.o.g(itemRootView, "itemRootView");
        this.f351862a = mContext;
        this.f351863b = i17;
        this.f351864c = mContentView;
        this.f351865d = b1Var;
        this.f351867f = "";
        p44.o0 o0Var = new p44.o0(mContext, i17, i18, mContentView);
        this.f351873l = o0Var;
        android.view.ViewStub viewStub = (android.view.ViewStub) itemRootView.findViewById(com.tencent.mm.R.id.r0w);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        android.widget.FrameLayout frameLayout = inflate instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) inflate : null;
        this.f351872k = frameLayout;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i18;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init, displayWidth=");
        sb6.append(i18);
        sb6.append(", layout.hash=");
        sb6.append(frameLayout != null ? java.lang.Integer.valueOf(frameLayout.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("RandomPickCardLogic", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createContentView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        if (frameLayout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createContentView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        } else {
            android.content.Context context = o0Var.f351811a;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView = new com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView(context, null);
            o0Var.f351824n = timelineRandomPickCardView;
            c44.a.o();
            c44.a.o();
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = c44.a.e();
            layoutParams2.topMargin = o0Var.j(5);
            timelineRandomPickCardView.setLayoutParams(layoutParams2);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(frameLayout.getContext());
            frameLayout.addView(frameLayout2);
            c44.a.l();
            if (frameLayout2.getLayoutParams() == null) {
                c44.a.o();
                frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                layoutParams3.width = -1;
                frameLayout2.setLayoutParams(layoutParams3);
            }
            c44.a.l();
            if (frameLayout2.getLayoutParams() == null) {
                c44.a.o();
                frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
                layoutParams4.height = -1;
                frameLayout2.setLayoutParams(layoutParams4);
            }
            o0Var.f351819i = frameLayout2;
            android.widget.ImageView imageView = new android.widget.ImageView(frameLayout.getContext());
            frameLayout.addView(imageView);
            c44.a.l();
            if (imageView.getLayoutParams() == null) {
                c44.a.o();
                imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                layoutParams5.width = -1;
                imageView.setLayoutParams(layoutParams5);
            }
            c44.a.l();
            if (imageView.getLayoutParams() == null) {
                c44.a.o();
                imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams6 = imageView.getLayoutParams();
                layoutParams6.height = -1;
                imageView.setLayoutParams(layoutParams6);
            }
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            imageView.setAlpha(0.0f);
            o0Var.f351821k = imageView;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
            frameLayout.addView(linearLayout);
            c44.a.l();
            if (linearLayout.getLayoutParams() == null) {
                c44.a.o();
                linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
                layoutParams7.width = -1;
                linearLayout.setLayoutParams(layoutParams7);
            }
            c44.a.l();
            if (linearLayout.getLayoutParams() == null) {
                c44.a.o();
                linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams8 = linearLayout.getLayoutParams();
                layoutParams8.height = -1;
                linearLayout.setLayoutParams(layoutParams8);
            }
            c44.a.m();
            linearLayout.setOrientation(1);
            linearLayout.setGravity(c44.a.e());
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            android.widget.TextView textView = new android.widget.TextView(linearLayout.getContext());
            linearLayout.addView(textView);
            c44.a.o();
            if (textView.getLayoutParams() == null) {
                c44.a.o();
                textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams9 = textView.getLayoutParams();
                layoutParams9.width = -2;
                textView.setLayoutParams(layoutParams9);
            }
            c44.a.o();
            if (textView.getLayoutParams() == null) {
                c44.a.o();
                textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams10 = textView.getLayoutParams();
                layoutParams10.height = -2;
                textView.setLayoutParams(layoutParams10);
            }
            int j17 = o0Var.j(4);
            android.view.ViewGroup.LayoutParams layoutParams11 = textView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams11 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams11 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = j17;
            }
            textView.setTextSize(0, o0Var.j(15));
            textView.setSingleLine(true);
            textView.setEllipsize(c44.a.a());
            textView.setLineSpacing(0.0f, 1.0f);
            textView.setIncludeFontPadding(false);
            c44.a.c();
            textView.setVisibility(8);
            o0Var.f351818h = textView;
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
            linearLayout2.setGravity(c44.a.f());
            o0Var.f351815e = linearLayout2;
            android.widget.ImageView imageView2 = new android.widget.ImageView(linearLayout2.getContext());
            linearLayout2.addView(imageView2);
            int j18 = o0Var.j(16);
            if (imageView2.getLayoutParams() == null) {
                c44.a.o();
                imageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(j18, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams14 = imageView2.getLayoutParams();
                layoutParams14.width = j18;
                imageView2.setLayoutParams(layoutParams14);
            }
            int j19 = o0Var.j(16);
            if (imageView2.getLayoutParams() == null) {
                c44.a.o();
                imageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, j19));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams15 = imageView2.getLayoutParams();
                layoutParams15.height = j19;
                imageView2.setLayoutParams(layoutParams15);
            }
            o0Var.f351816f = imageView2;
            android.widget.TextView textView2 = new android.widget.TextView(linearLayout2.getContext());
            linearLayout2.addView(textView2);
            c44.a.o();
            if (textView2.getLayoutParams() == null) {
                c44.a.o();
                textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams16 = textView2.getLayoutParams();
                layoutParams16.width = -2;
                textView2.setLayoutParams(layoutParams16);
            }
            c44.a.o();
            if (textView2.getLayoutParams() == null) {
                c44.a.o();
                textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams17 = textView2.getLayoutParams();
                layoutParams17.height = -2;
                textView2.setLayoutParams(layoutParams17);
            }
            int j27 = o0Var.j(4);
            android.view.ViewGroup.LayoutParams layoutParams18 = textView2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams18 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams18 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = j27;
            }
            textView2.setSingleLine(true);
            textView2.setEllipsize(c44.a.a());
            textView2.setTextSize(0, o0Var.j(15));
            textView2.setLineSpacing(0.0f, 1.0f);
            o0Var.f351817g = textView2;
            android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(linearLayout.getContext());
            linearLayout.addView(frameLayout3);
            c44.a.o();
            if (frameLayout3.getLayoutParams() == null) {
                c44.a.o();
                frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams19 = frameLayout3.getLayoutParams();
                layoutParams19.width = -2;
                frameLayout3.setLayoutParams(layoutParams19);
            }
            c44.a.o();
            if (frameLayout3.getLayoutParams() == null) {
                c44.a.o();
                frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams20 = frameLayout3.getLayoutParams();
                layoutParams20.height = -2;
                frameLayout3.setLayoutParams(layoutParams20);
            }
            int j28 = o0Var.j(4);
            android.view.ViewGroup.LayoutParams layoutParams21 = frameLayout3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams21 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams21 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = j28;
            }
            android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(frameLayout3.getContext());
            frameLayout3.addView(linearLayout3);
            c44.a.o();
            if (linearLayout3.getLayoutParams() == null) {
                c44.a.o();
                linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams22 = linearLayout3.getLayoutParams();
                layoutParams22.width = -2;
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
            c44.a.m();
            linearLayout3.setOrientation(1);
            int e17 = c44.a.e();
            android.view.ViewGroup.LayoutParams layoutParams24 = linearLayout3.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams25 = layoutParams24 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams24 : null;
            if (layoutParams25 != null) {
                layoutParams25.gravity = e17;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams26 = linearLayout3.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams27 = layoutParams26 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams26 : null;
                if (layoutParams27 != null) {
                    layoutParams27.gravity = e17;
                }
            }
            android.widget.TextView textView3 = new android.widget.TextView(linearLayout3.getContext());
            linearLayout3.addView(textView3);
            c44.a.o();
            if (textView3.getLayoutParams() == null) {
                c44.a.o();
                textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams28 = textView3.getLayoutParams();
                layoutParams28.width = -2;
                textView3.setLayoutParams(layoutParams28);
            }
            c44.a.o();
            if (textView3.getLayoutParams() == null) {
                c44.a.o();
                textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams29 = textView3.getLayoutParams();
                layoutParams29.height = -2;
                textView3.setLayoutParams(layoutParams29);
            }
            textView3.setSingleLine(true);
            textView3.setEllipsize(c44.a.a());
            textView3.setTextSize(0, o0Var.j(14));
            textView3.setLineSpacing(0.0f, 1.0f);
            o0Var.f351822l = textView3;
            android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(frameLayout3.getContext());
            frameLayout3.addView(linearLayout4);
            c44.a.o();
            if (linearLayout4.getLayoutParams() == null) {
                c44.a.o();
                linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams30 = linearLayout4.getLayoutParams();
                layoutParams30.width = -2;
                linearLayout4.setLayoutParams(layoutParams30);
            }
            c44.a.o();
            if (linearLayout4.getLayoutParams() == null) {
                c44.a.o();
                linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams31 = linearLayout4.getLayoutParams();
                layoutParams31.height = -2;
                linearLayout4.setLayoutParams(layoutParams31);
            }
            c44.a.m();
            linearLayout4.setOrientation(1);
            int e18 = c44.a.e();
            android.view.ViewGroup.LayoutParams layoutParams32 = linearLayout4.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams33 = layoutParams32 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams32 : null;
            if (layoutParams33 != null) {
                layoutParams33.gravity = e18;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams34 = linearLayout4.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams35 = layoutParams34 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams34 : null;
                if (layoutParams35 != null) {
                    layoutParams35.gravity = e18;
                }
            }
            android.widget.TextView textView4 = new android.widget.TextView(linearLayout4.getContext());
            linearLayout4.addView(textView4);
            c44.a.o();
            if (textView4.getLayoutParams() == null) {
                c44.a.o();
                textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams36 = textView4.getLayoutParams();
                layoutParams36.width = -2;
                textView4.setLayoutParams(layoutParams36);
            }
            c44.a.o();
            if (textView4.getLayoutParams() == null) {
                c44.a.o();
                textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams37 = textView4.getLayoutParams();
                layoutParams37.height = -2;
                textView4.setLayoutParams(layoutParams37);
            }
            textView4.setSingleLine(true);
            textView4.setEllipsize(c44.a.a());
            textView4.setTextSize(0, o0Var.j(14));
            textView4.setLineSpacing(0.0f, 1.0f);
            o0Var.f351823m = textView4;
            android.view.View view = o0Var.f351824n;
            if (view == null) {
                ca4.m0.j0();
            } else {
                linearLayout.addView(view);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createContentView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        androidx.lifecycle.y yVar = mContext instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) mContext : null;
        if (yVar != null) {
            com.tencent.mars.xlog.Log.i("RandomPickCardLogic", "initLifeCycleListener");
            androidx.lifecycle.o mo133getLifecycle = yVar.mo133getLifecycle();
            if (mo133getLifecycle != null) {
                mo133getLifecycle.a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1
                    @Override // androidx.lifecycle.f, androidx.lifecycle.h
                    public void onDestroy(androidx.lifecycle.y owner) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                        kotlin.jvm.internal.o.g(owner, "owner");
                        com.tencent.mars.xlog.Log.i("RandomPickCardLogic", "onDestroy");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        p44.z zVar = p44.z.this;
                        zVar.i();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        p44.z.b(zVar).k();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                    }

                    @Override // androidx.lifecycle.f, androidx.lifecycle.h
                    public void onPause(androidx.lifecycle.y owner) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                        kotlin.jvm.internal.o.g(owner, "owner");
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onPause, updateFlag=");
                        p44.z zVar = p44.z.this;
                        sb7.append(p44.z.c(zVar));
                        sb7.append(", stoppedFlag=");
                        sb7.append(p44.z.a(zVar));
                        sb7.append(", pausedFlag=");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        boolean z17 = zVar.f351871j;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        sb7.append(z17);
                        com.tencent.mars.xlog.Log.i("RandomPickCardLogic", sb7.toString());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        zVar.f351871j = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                    }

                    @Override // androidx.lifecycle.f, androidx.lifecycle.h
                    public void onResume(androidx.lifecycle.y owner) {
                        java.lang.String str;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                        kotlin.jvm.internal.o.g(owner, "owner");
                        p44.z zVar = p44.z.this;
                        zVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContentView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContentView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        boolean isAttachedToWindow = zVar.f351864c.isAttachedToWindow();
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onResume, updateFlag=");
                        sb7.append(p44.z.c(zVar));
                        sb7.append(", stoppedFlag=");
                        sb7.append(p44.z.a(zVar));
                        sb7.append(", pausedFlag=");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        boolean z17 = zVar.f351871j;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        sb7.append(z17);
                        sb7.append(", isAttached=");
                        sb7.append(isAttachedToWindow);
                        com.tencent.mars.xlog.Log.i("RandomPickCardLogic", sb7.toString());
                        if (isAttachedToWindow) {
                            if (p44.z.c(zVar)) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMUpdateFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                                zVar.f351869h = false;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMUpdateFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                                p44.o0 b17 = p44.z.b(zVar);
                                com.tencent.mars.xlog.Log.i("RandomPickCardLogic", "checkStartAnim");
                                b17.i();
                                b17.d();
                                b17.b();
                            } else if (p44.z.a(zVar)) {
                                p44.o0 b18 = p44.z.b(zVar);
                                b18.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStartPartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
                                com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView2 = b18.f351824n;
                                if (timelineRandomPickCardView2 != null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStartPartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
                                    timelineRandomPickCardView2.n(true);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStartPartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
                                }
                                if (!b18.h()) {
                                    android.view.View view2 = b18.f351815e;
                                    if (view2 != null) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                        arrayList.add(java.lang.Float.valueOf(1.0f));
                                        java.util.Collections.reverse(arrayList);
                                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickLayoutCtrl", "checkStartPartAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                                        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickLayoutCtrl", "checkStartPartAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                    }
                                    android.widget.TextView textView5 = b18.f351817g;
                                    if (textView5 != null) {
                                        p44.r rVar = b18.f351825o;
                                        if (rVar == null || (str = rVar.b()) == null) {
                                            str = "";
                                        }
                                        textView5.setText(str);
                                    }
                                    b18.n(0L);
                                }
                                android.widget.TextView textView6 = b18.f351822l;
                                if (textView6 != null) {
                                    textView6.setVisibility(4);
                                }
                                android.widget.TextView textView7 = b18.f351823m;
                                if (textView7 != null) {
                                    textView7.setAlpha(1.0f);
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStartPartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        zVar.f351870i = false;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        zVar.f351871j = false;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                    }

                    @Override // androidx.lifecycle.f, androidx.lifecycle.h
                    public void onStop(androidx.lifecycle.y owner) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                        kotlin.jvm.internal.o.g(owner, "owner");
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onStop, updateFlag=");
                        p44.z zVar = p44.z.this;
                        sb7.append(p44.z.c(zVar));
                        sb7.append(", stoppedFlag=");
                        sb7.append(p44.z.a(zVar));
                        sb7.append(", pausedFlag=");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        boolean z17 = zVar.f351871j;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        sb7.append(z17);
                        com.tencent.mars.xlog.Log.i("RandomPickCardLogic", sb7.toString());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        zVar.f351870i = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        p44.z.b(zVar).l();
                        p44.z.b(zVar).m();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                    }
                });
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        this.f351875n = new p44.x(this);
    }

    public static final /* synthetic */ boolean a(p44.z zVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        boolean z17 = zVar.f351870i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        return z17;
    }

    public static final /* synthetic */ p44.o0 b(p44.z zVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTimelineRandomPickLayoutCtrl$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        p44.o0 o0Var = zVar.f351873l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTimelineRandomPickLayoutCtrl$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        return o0Var;
    }

    public static final /* synthetic */ boolean c(p44.z zVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMUpdateFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        boolean z17 = zVar.f351869h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMUpdateFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        return z17;
    }

    public final void d(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCgiClickReport", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doCgiClickReport, clickPos=");
        sb6.append(i17);
        sb6.append(", subPos=");
        sb6.append(i18);
        sb6.append(", source=");
        sb6.append(this.f351863b);
        sb6.append(", snsInfo.isNull=");
        sb6.append(this.f351866e == null);
        com.tencent.mars.xlog.Log.i("RandomPickCardLogic", sb6.toString());
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f351866e;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCgiClickReport", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
            return;
        }
        int i19 = this.f351863b;
        com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i19, i19 != 0 ? 2 : 1, snsInfo.field_snsId, i17, 21);
        ca4.m0.g(snsAdClick, this.f351865d, snsInfo, i17, i18);
        ca4.z0.x0(snsAdClick);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCgiClickReport", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
    }

    public final void e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView;
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView2;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        java.lang.String t07 = ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L);
        p44.r rVar = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null) ? null : adXml.randomPickCardAdInfo;
        p44.o0 o0Var = this.f351873l;
        android.widget.FrameLayout frameLayout = this.f351872k;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.w("RandomPickCardLogic", "initData, item reused for !randomPickAd, oldAd=" + this.f351867f + ", newAd=" + t07);
            this.f351869h = false;
            this.f351866e = null;
            this.f351867f = "";
            this.f351868g = null;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            i();
            o0Var.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        if (this.f351874m == null) {
            final android.content.Context context = this.f351862a;
            if (context instanceof androidx.lifecycle.y) {
                com.tencent.mars.xlog.Log.e("RandomPickCardLogic", "startListenEggCanvasEvent");
                try {
                    com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdEggCanvasEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdEggCanvasEvent>(context) { // from class: com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super((androidx.lifecycle.y) context);
                            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                            this.__eventId = 101315400;
                        }

                        @Override // com.tencent.mm.sdk.event.IListener
                        public boolean callback(com.tencent.mm.autogen.events.SnsAdEggCanvasEvent snsAdEggCanvasEvent) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1");
                            com.tencent.mm.autogen.events.SnsAdEggCanvasEvent event = snsAdEggCanvasEvent;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1");
                            kotlin.jvm.internal.o.g(event, "event");
                            d75.b.g(new p44.y(p44.z.this, event));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1");
                            return false;
                        }
                    };
                    this.f351874m = iListener;
                    iListener.alive();
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("RandomPickCardLogic", th6);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f351866e;
        if (snsInfo2 != null) {
            if (kotlin.jvm.internal.o.b(java.lang.Long.valueOf(snsInfo2.field_snsId), snsInfo != null ? java.lang.Long.valueOf(snsInfo.field_snsId) : null)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("RandomPickCardLogic", "initData, oldAd=" + this.f351867f + ", newAd=" + t07);
        this.f351869h = true;
        this.f351866e = snsInfo;
        this.f351867f = t07;
        this.f351868g = rVar;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        o0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initData, pageId=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        java.lang.String str = rVar.f351847m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("TimelineRandomPickLayoutCtrl", sb6.toString());
        o0Var.f351825o = rVar;
        o0Var.f351828r = snsInfo;
        if (rVar.cardInfo != null && (timelineRandomPickCardView2 = o0Var.f351824n) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            com.tencent.mars.xlog.Log.i(timelineRandomPickCardView2.TAG, "clear");
            timelineRandomPickCardView2.f162718h = "";
            timelineRandomPickCardView2.mItemViewList.clear();
            ((java.util.ArrayList) timelineRandomPickCardView2.f162719i).clear();
            timelineRandomPickCardView2.mRandomPickCardInfo = null;
            timelineRandomPickCardView2.removeAllViews();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str2 = rVar.f351847m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            timelineRandomPickCardView2.g(str2, rVar.cardInfo, o0Var.f351813c);
            p44.d0 d0Var = o0Var.f351826p;
            if (d0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
                o0Var.f351826p = d0Var;
                com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView timelineRandomPickCardView3 = o0Var.f351824n;
                if (timelineRandomPickCardView3 != null) {
                    timelineRandomPickCardView3.setOnItemClickListener(d0Var);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
            }
        }
        android.widget.ImageView imageView = o0Var.f351816f;
        if (imageView != null) {
            a84.z.e(rVar.titleIconUrl, imageView);
        }
        android.widget.ImageView imageView2 = o0Var.f351821k;
        if (imageView2 != null) {
            imageView2.setImageResource(com.tencent.mm.R.drawable.crc);
        }
        o0Var.o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        o0Var.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        p44.x xVar = this.f351875n;
        o0Var.f351826p = xVar;
        if (xVar != null && (timelineRandomPickCardView = o0Var.f351824n) != null) {
            timelineRandomPickCardView.setOnItemClickListener(xVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        o0Var.l();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.tencent.mars.xlog.Log.i("RandomPickCardLogic", "onAdRemoved, updateFlag=" + this.f351869h + ", stoppedFlag=" + this.f351870i + ", pausedFlag=" + this.f351871j);
        this.f351869h = true;
        p44.o0 o0Var = this.f351873l;
        o0Var.l();
        o0Var.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
    }

    public final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTimelineVideoPlay", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.tencent.mars.xlog.Log.i("RandomPickCardLogic", "onTimelineVideoPlay, updateFlag=" + this.f351869h + ", stoppedFlag=" + this.f351870i + ", pausedFlag=" + this.f351871j);
        if (this.f351869h && !this.f351871j) {
            this.f351869h = false;
            com.tencent.mars.xlog.Log.i("RandomPickCardLogic", "checkStartAnim");
            p44.o0 o0Var = this.f351873l;
            o0Var.i();
            o0Var.d();
            o0Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimelineVideoPlay", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:3:0x000f, B:8:0x002a, B:10:0x0031, B:15:0x003d, B:16:0x0049, B:18:0x0053, B:19:0x0058), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:3:0x000f, B:8:0x002a, B:10:0x0031, B:15:0x003d, B:16:0x0049, B:18:0x0053, B:19:0x0058), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f351862a
            java.lang.String r1 = "openEggCanvasWithPickedId, cardId="
            java.lang.String r2 = "openEggCanvasWithPickedId"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "RandomPickCardLogic"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L6a
            r5.append(r9)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L6a
            com.tencent.mars.xlog.Log.i(r4, r1)     // Catch: java.lang.Throwable -> L6a
            int r1 = r8.f351863b     // Catch: java.lang.Throwable -> L6a
            r5 = 2
            r6 = 1
            if (r1 == r6) goto L2a
            if (r1 == r5) goto L28
            r5 = r6
            goto L2a
        L28:
            r5 = 16
        L2a:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            if (r9 == 0) goto L3a
            int r7 = r9.length()     // Catch: java.lang.Throwable -> L6a
            if (r7 != 0) goto L38
            goto L3a
        L38:
            r7 = 0
            goto L3b
        L3a:
            r7 = r6
        L3b:
            if (r7 != 0) goto L49
            java.lang.String r7 = "sns_landing_page_is_local_select_egg_card"
            r1.putExtra(r7, r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "sns_landing_page_egg_card_id"
            r1.putExtra(r6, r9)     // Catch: java.lang.Throwable -> L6a
        L49:
            java.lang.String r9 = "sns_landing_page_random_pick_card_click_show_index"
            r1.putExtra(r9, r10)     // Catch: java.lang.Throwable -> L6a
            boolean r9 = r0 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L6a
            if (r9 == 0) goto L57
            r9 = r0
            android.app.Activity r9 = (android.app.Activity) r9     // Catch: java.lang.Throwable -> L6a
            goto L58
        L57:
            r9 = 0
        L58:
            boolean r9 = ca4.m0.b0(r9)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r10 = "sns_landing_page_is_dark_status_bar"
            r1.putExtra(r10, r9)     // Catch: java.lang.Throwable -> L6a
            android.view.View r9 = r8.f351864c     // Catch: java.lang.Throwable -> L6a
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r8.f351866e     // Catch: java.lang.Throwable -> L6a
            ca4.m0.p0(r0, r9, r10, r5, r1)     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r9 = move-exception
            ca4.q.c(r4, r9)
        L6e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p44.z.h(java.lang.String, int):void");
    }

    public final void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.tencent.mars.xlog.Log.e("RandomPickCardLogic", "stopListenEggCanvasEvent");
        try {
            com.tencent.mm.sdk.event.IListener iListener = this.f351874m;
            if (iListener != null) {
                iListener.dead();
            }
            this.f351874m = null;
        } catch (java.lang.Throwable th6) {
            ca4.q.c("RandomPickCardLogic", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
    }
}
