package q74;

/* loaded from: classes4.dex */
public final class t {
    public float A;
    public boolean B;
    public final com.tencent.mm.sdk.platformtools.n3 C;
    public android.animation.AnimatorSet D;
    public android.animation.AnimatorSet E;
    public android.animation.AnimatorSet F;
    public android.animation.AnimatorSet G;
    public android.animation.AnimatorSet H;
    public android.animation.AnimatorSet I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f360518J;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f360519a;

    /* renamed from: b, reason: collision with root package name */
    public final w64.n f360520b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView f360521c;

    /* renamed from: d, reason: collision with root package name */
    public final z84.h f360522d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f360523e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f360524f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f360525g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f360526h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f360527i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f360528j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f360529k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.ViewGroup f360530l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f360531m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f360532n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f360533o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f360534p;

    /* renamed from: q, reason: collision with root package name */
    public int f360535q;

    /* renamed from: r, reason: collision with root package name */
    public int f360536r;

    /* renamed from: s, reason: collision with root package name */
    public s34.o1 f360537s;

    /* renamed from: t, reason: collision with root package name */
    public s34.o1 f360538t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f360539u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f360540v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f360541w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.animation.PathInterpolator f360542x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.animation.PathInterpolator f360543y;

    /* renamed from: z, reason: collision with root package name */
    public float f360544z;

    public t(android.content.Context mContext, int i17, android.view.ViewGroup viewGroup, w64.n nVar, com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView adSlideRecyclerView, z84.h hVar) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f360519a = mContext;
        this.f360520b = nVar;
        this.f360521c = adSlideRecyclerView;
        this.f360522d = hVar;
        this.f360536r = -1;
        this.f360539u = jz5.h.b(new q74.r(this));
        this.f360540v = jz5.h.b(new q74.s(this));
        this.f360541w = jz5.h.b(new q74.g(this));
        this.f360542x = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        this.f360543y = new android.view.animation.PathInterpolator(0.15f, 0.15f, 0.2f, 1.0f);
        this.C = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        android.view.View findViewById = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.rb6) : null;
        this.f360523e = findViewById;
        this.f360524f = findViewById != null ? (android.view.ViewGroup) findViewById.findViewById(com.tencent.mm.R.id.f483752by4) : null;
        android.view.ViewGroup viewGroup2 = findViewById != null ? (android.view.ViewGroup) findViewById.findViewById(com.tencent.mm.R.id.raj) : null;
        this.f360525g = viewGroup2;
        this.f360526h = findViewById != null ? (android.view.ViewGroup) findViewById.findViewById(com.tencent.mm.R.id.rak) : null;
        this.f360527i = findViewById != null ? (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.ram) : null;
        this.f360528j = findViewById != null ? (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.ral) : null;
        this.f360529k = findViewById != null ? (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) findViewById.findViewById(com.tencent.mm.R.id.obc) : null;
        this.f360530l = findViewById != null ? (android.view.ViewGroup) findViewById.findViewById(com.tencent.mm.R.id.f482450db0) : null;
        this.f360531m = findViewById != null ? (com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView) findViewById.findViewById(com.tencent.mm.R.id.f482456db1) : null;
        this.f360532n = findViewById != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById.findViewById(com.tencent.mm.R.id.f482469fd) : null;
        this.f360533o = findViewById != null ? findViewById.findViewById(com.tencent.mm.R.id.r_a) : null;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new q74.f(this));
        }
    }

    public static final /* synthetic */ float a(q74.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAnimOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        float t17 = tVar.t();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAnimOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return t17;
    }

    public static final /* synthetic */ android.view.ViewGroup b(q74.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMActionBtnLayout$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.view.ViewGroup viewGroup = tVar.f360530l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMActionBtnLayout$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return viewGroup;
    }

    public static final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 c(q74.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.sdk.platformtools.n3 n3Var = tVar.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return n3Var;
    }

    public static final /* synthetic */ android.view.View d(q74.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHighlightBackground$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.view.View view = tVar.f360533o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHighlightBackground$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return view;
    }

    public static final /* synthetic */ int e(q74.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIndex$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        int i17 = tVar.f360535q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIndex$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return i17;
    }

    public static final /* synthetic */ int f(q74.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPreIndex$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        int i17 = tVar.f360536r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPreIndex$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return i17;
    }

    public static final /* synthetic */ android.widget.ImageView g(q74.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMProductIconIn$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.widget.ImageView imageView = tVar.f360528j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMProductIconIn$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return imageView;
    }

    public static final /* synthetic */ android.widget.ImageView h(q74.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMProductIconOut$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.widget.ImageView imageView = tVar.f360527i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMProductIconOut$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return imageView;
    }

    public static final /* synthetic */ s34.o1 i(q74.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMProductInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        s34.o1 o1Var = tVar.f360537s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMProductInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return o1Var;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo j(q74.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = tVar.f360534p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return snsInfo;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView k(q74.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTitleView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = tVar.f360529k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTitleView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return adAppCompatTextView;
    }

    public final void l(int i17) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        s34.a1 a1Var;
        s34.z0 z0Var;
        java.util.List c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (s34.z0.f402836c.a(this.f360534p)) {
            this.f360536r = this.f360535q;
            this.f360538t = this.f360537s;
            this.f360535q = i17;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f360534p;
            this.f360537s = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null || (a1Var = adXml.adSliderFullCardInfo) == null || (z0Var = a1Var.f402569f) == null || (c17 = z0Var.c()) == null) ? null : (s34.o1) c17.get(i17);
            com.tencent.mars.xlog.Log.i("AdSlideProductItemViewLogic", "bindData, mPreIndex is " + this.f360536r + ", mIndex is " + this.f360535q);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        this.C.removeCallbacksAndMessages(null);
        android.animation.AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSet2 = this.E;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        android.animation.AnimatorSet animatorSet3 = this.F;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        android.animation.AnimatorSet animatorSet4 = this.G;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        android.animation.AnimatorSet animatorSet5 = this.H;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
        }
        android.animation.AnimatorSet animatorSet6 = this.I;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
        }
        com.tencent.mars.xlog.Log.i("AdSlideProductItemViewLogic", "cancelAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r19) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.t.n(int):void");
    }

    public final void o(boolean z17) {
        android.animation.ObjectAnimator ofFloat;
        android.animation.ObjectAnimator ofFloat2;
        android.animation.ObjectAnimator ofFloat3;
        android.animation.ObjectAnimator ofFloat4;
        android.animation.ObjectAnimator ofFloat5;
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (z17) {
            boolean z18 = this.B;
            android.view.animation.PathInterpolator pathInterpolator = this.f360542x;
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = this.f360529k;
            if (z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTwoStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                this.H = new android.animation.AnimatorSet();
                r(this.f360537s, this.f360538t);
                s(this.f360538t);
                s34.o1 o1Var = this.f360537s;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawStatusTwoProductTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                if (adAppCompatTextView != null) {
                    java.lang.String d17 = o1Var != null ? o1Var.d() : null;
                    if (!(d17 == null || d17.length() == 0)) {
                        adAppCompatTextView.setText(o1Var != null ? o1Var.d() : null);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawStatusTwoProductTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                android.widget.ImageView imageView = this.f360527i;
                kotlin.jvm.internal.o.d(imageView);
                android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
                s74.q4 q4Var = s74.q4.f404513a;
                ofFloat6.setInterpolator(q4Var.e());
                ofFloat6.setDuration(250L);
                android.view.View view = this.f360533o;
                kotlin.jvm.internal.o.d(view);
                android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                ofFloat7.setInterpolator(q4Var.e());
                ofFloat7.setDuration(250L);
                android.view.ViewGroup viewGroup = this.f360530l;
                kotlin.jvm.internal.o.d(viewGroup);
                android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 1.0f, 0.0f);
                ofFloat8.setInterpolator(q4Var.e());
                ofFloat8.setDuration(250L);
                kotlin.jvm.internal.o.d(adAppCompatTextView);
                android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(adAppCompatTextView, "alpha", 0.0f, 1.0f);
                ofFloat9.setInterpolator(pathInterpolator);
                ofFloat9.setDuration(500L);
                if (this.f360535q > this.f360536r) {
                    android.widget.ImageView imageView2 = this.f360528j;
                    kotlin.jvm.internal.o.d(imageView2);
                    ofFloat5 = android.animation.ObjectAnimator.ofFloat(imageView2, "translationX", -t(), 0.0f);
                    ofFloat5.setInterpolator(pathInterpolator);
                    j17 = 500;
                    ofFloat5.setDuration(500L);
                } else {
                    android.widget.ImageView imageView3 = this.f360528j;
                    kotlin.jvm.internal.o.d(imageView3);
                    ofFloat5 = android.animation.ObjectAnimator.ofFloat(imageView3, "translationX", t(), 0.0f);
                    ofFloat5.setInterpolator(pathInterpolator);
                    j17 = 500;
                    ofFloat5.setDuration(500L);
                }
                android.widget.ImageView imageView4 = this.f360528j;
                kotlin.jvm.internal.o.d(imageView4);
                android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat(imageView4, "alpha", 0.0f, 1.0f);
                ofFloat10.setInterpolator(pathInterpolator);
                ofFloat10.setDuration(j17);
                android.animation.AnimatorSet animatorSet = this.H;
                if (animatorSet != null) {
                    animatorSet.addListener(new q74.q(this));
                }
                android.animation.AnimatorSet animatorSet2 = this.H;
                if (animatorSet2 != null) {
                    animatorSet2.playTogether(ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofFloat5, ofFloat10);
                }
                android.animation.AnimatorSet animatorSet3 = this.H;
                if (animatorSet3 != null) {
                    animatorSet3.start();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTwoStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOneStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                if (this.f360527i == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOneStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                } else if (this.f360528j == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOneStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                } else if (adAppCompatTextView == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOneStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                } else {
                    r(this.f360537s, this.f360538t);
                    s(this.f360538t);
                    this.F = new android.animation.AnimatorSet();
                    if (this.f360535q > this.f360536r) {
                        android.widget.ImageView imageView5 = this.f360527i;
                        kotlin.jvm.internal.o.d(imageView5);
                        ofFloat = android.animation.ObjectAnimator.ofFloat(imageView5, "translationX", 0.0f, t());
                        ofFloat.setInterpolator(pathInterpolator);
                        ofFloat.setDuration(250L);
                    } else {
                        android.widget.ImageView imageView6 = this.f360528j;
                        kotlin.jvm.internal.o.d(imageView6);
                        ofFloat = android.animation.ObjectAnimator.ofFloat(imageView6, "translationX", t(), 0.0f);
                        ofFloat.setInterpolator(pathInterpolator);
                        ofFloat.setDuration(500L);
                    }
                    if (this.f360535q > this.f360536r) {
                        android.widget.ImageView imageView7 = this.f360527i;
                        kotlin.jvm.internal.o.d(imageView7);
                        ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView7, "alpha", 1.0f, 0.0f);
                        ofFloat2.setInterpolator(pathInterpolator);
                        ofFloat2.setDuration(250L);
                    } else {
                        android.widget.ImageView imageView8 = this.f360528j;
                        kotlin.jvm.internal.o.d(imageView8);
                        ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView8, "alpha", 0.0f, 1.0f);
                        ofFloat2.setInterpolator(pathInterpolator);
                        ofFloat2.setDuration(500L);
                    }
                    android.animation.ObjectAnimator ofFloat11 = android.animation.ObjectAnimator.ofFloat(adAppCompatTextView, "alpha", 1.0f, 0.0f);
                    ofFloat11.setInterpolator(s74.q4.f404513a.e());
                    ofFloat11.setDuration(150L);
                    if (this.f360535q > this.f360536r) {
                        android.widget.ImageView imageView9 = this.f360528j;
                        kotlin.jvm.internal.o.d(imageView9);
                        ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView9, "translationX", -t(), 0.0f);
                        ofFloat3.setInterpolator(pathInterpolator);
                        ofFloat3.setDuration(500L);
                    } else {
                        android.widget.ImageView imageView10 = this.f360527i;
                        kotlin.jvm.internal.o.d(imageView10);
                        ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView10, "translationX", 0.0f, -t());
                        ofFloat3.setInterpolator(pathInterpolator);
                        ofFloat3.setDuration(500L);
                    }
                    android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat(adAppCompatTextView, "alpha", 0.0f, 1.0f);
                    ofFloat12.setInterpolator(pathInterpolator);
                    ofFloat12.setDuration(350L);
                    if (this.f360535q > this.f360536r) {
                        android.widget.ImageView imageView11 = this.f360528j;
                        kotlin.jvm.internal.o.d(imageView11);
                        ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView11, "alpha", 0.0f, 1.0f);
                        ofFloat4.setInterpolator(pathInterpolator);
                        ofFloat4.setDuration(500L);
                    } else {
                        android.widget.ImageView imageView12 = this.f360527i;
                        kotlin.jvm.internal.o.d(imageView12);
                        ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView12, "alpha", 1.0f, 0.0f);
                        ofFloat4.setInterpolator(pathInterpolator);
                        ofFloat4.setDuration(500L);
                    }
                    ofFloat11.addListener(new q74.j(this, ofFloat12));
                    android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
                    this.G = animatorSet4;
                    animatorSet4.addListener(new q74.k(this));
                    android.animation.AnimatorSet animatorSet5 = this.F;
                    if (animatorSet5 != null) {
                        animatorSet5.addListener(new q74.m(this));
                    }
                    android.animation.AnimatorSet animatorSet6 = this.F;
                    if (animatorSet6 != null) {
                        animatorSet6.playTogether(ofFloat, ofFloat2, ofFloat11, ofFloat3, ofFloat4);
                    }
                    android.animation.AnimatorSet animatorSet7 = this.F;
                    if (animatorSet7 != null) {
                        animatorSet7.start();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOneStatusEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                }
            }
        } else {
            n(this.f360535q);
        }
        this.B = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doEnterOrExitAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTwoStatusAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        this.I = new android.animation.AnimatorSet();
        android.widget.ImageView imageView = this.f360527i;
        kotlin.jvm.internal.o.d(imageView);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, -this.f360544z);
        android.view.animation.PathInterpolator pathInterpolator = this.f360543y;
        ofFloat.setInterpolator(pathInterpolator);
        ofFloat.setDuration(300L);
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = this.f360529k;
        kotlin.jvm.internal.o.d(adAppCompatTextView);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(adAppCompatTextView, "translationX", 0.0f, -this.f360544z);
        ofFloat2.setInterpolator(pathInterpolator);
        ofFloat2.setDuration(300L);
        kotlin.jvm.internal.o.d(adAppCompatTextView);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(adAppCompatTextView, "alpha", 1.0f, 0.0f);
        ofFloat3.setInterpolator(pathInterpolator);
        ofFloat3.setDuration(300L);
        android.view.View view = this.f360533o;
        kotlin.jvm.internal.o.d(view);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "translationX", this.A, 0.0f);
        ofFloat4.setInterpolator(pathInterpolator);
        ofFloat4.setDuration(300L);
        kotlin.jvm.internal.o.d(view);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat5.setInterpolator(pathInterpolator);
        ofFloat5.setDuration(300L);
        android.view.ViewGroup viewGroup = this.f360530l;
        kotlin.jvm.internal.o.d(viewGroup);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 0.0f, 1.0f);
        ofFloat6.setInterpolator(pathInterpolator);
        ofFloat6.setDuration(300L);
        android.animation.AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.addListener(new q74.o(this));
        }
        android.animation.AnimatorSet animatorSet2 = this.I;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
        }
        android.animation.AnimatorSet animatorSet3 = this.I;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTwoStatusAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void q(android.graphics.drawable.GradientDrawable gradientDrawable, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawHighlightBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        gradientDrawable.setShape(0);
        gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setCornerRadii(new float[]{v(), v(), v(), v(), v(), v(), v(), v()});
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            gradientDrawable.setColors(new int[]{android.graphics.Color.parseColor("#00000000"), i17, i17}, new float[]{0.0f, 0.7f, 1.0f});
        } else {
            gradientDrawable.setColors(new int[]{android.graphics.Color.parseColor("#00000000"), i17});
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawHighlightBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void r(s34.o1 o1Var, s34.o1 o1Var2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawProductImg", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (this.f360527i != null) {
            java.lang.String b17 = o1Var2 != null ? o1Var2.b() : null;
            if (!(b17 == null || b17.length() == 0)) {
                a84.m.a(o1Var2 != null ? o1Var2.b() : null, this.f360527i);
            }
        }
        if (this.f360528j != null) {
            java.lang.String b18 = o1Var != null ? o1Var.b() : null;
            if (!(b18 == null || b18.length() == 0)) {
                a84.m.a(o1Var != null ? o1Var.b() : null, this.f360528j);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawProductImg", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void s(s34.o1 o1Var) {
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawUI", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (o1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawUI", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            return;
        }
        java.lang.String d17 = o1Var.d();
        if (!(d17 == null || d17.length() == 0) && (adAppCompatTextView = this.f360529k) != null) {
            adAppCompatTextView.setText(o1Var.d());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBarTitle", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        java.lang.String str = o1Var.f402726c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBarTitle", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView2 = this.f360531m;
        if (!z17 && adAppCompatTextView2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBarTitle", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
            java.lang.String str2 = o1Var.f402726c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBarTitle", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
            adAppCompatTextView2.setText(str2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBarTitleColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        s34.g1 g1Var = o1Var.f402727d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBarTitleColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        android.graphics.drawable.GradientDrawable gradientDrawable = null;
        int e17 = ca4.n0.e(g1Var != null ? g1Var.a() : null, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlphaColor", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        int i17 = (((int) (255 * 0.9f)) << 24) | (16777215 & e17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlphaColor", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        if (adAppCompatTextView2 != null) {
            adAppCompatTextView2.setTextColor(i17);
        }
        android.text.TextPaint paint = adAppCompatTextView2 != null ? adAppCompatTextView2.getPaint() : null;
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f360532n;
        if (weImageView != null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.sns_ad_slide_product_btn_arrow);
        }
        if (weImageView != null) {
            weImageView.setEnableColorFilter(true);
        }
        if (weImageView != null) {
            weImageView.setIconColor(e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHighlightColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        s34.g1 g1Var2 = o1Var.f402728e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHighlightColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        int e18 = ca4.n0.e(g1Var2 != null ? g1Var2.a() : null, android.graphics.Color.parseColor("#07C160"));
        android.view.View view = this.f360533o;
        if ((view != null ? view.getBackground() : null) instanceof android.graphics.drawable.GradientDrawable) {
            android.graphics.drawable.Drawable background = view != null ? view.getBackground() : null;
            android.graphics.drawable.GradientDrawable gradientDrawable2 = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
            if (gradientDrawable2 != null) {
                q(gradientDrawable2, e18);
                gradientDrawable = gradientDrawable2;
            }
        } else {
            gradientDrawable = new android.graphics.drawable.GradientDrawable();
            q(gradientDrawable, e18);
        }
        if (view != null) {
            view.setBackground(gradientDrawable);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawUI", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final float t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        float floatValue = ((java.lang.Number) ((jz5.n) this.f360541w).getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return floatValue;
    }

    public final w64.n u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMClickActionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMClickActionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return this.f360520b;
    }

    public final float v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCornerRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        float floatValue = ((java.lang.Number) ((jz5.n) this.f360539u).getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCornerRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return floatValue;
    }

    public final int w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMargin", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        int intValue = ((java.lang.Number) ((jz5.n) this.f360540v).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMargin", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        return intValue;
    }

    public final void x(int i17) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        s34.a1 a1Var;
        s34.z0 z0Var;
        java.util.List c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initNoPAGStatus", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f360534p;
        s34.o1 o1Var = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null || (a1Var = adXml.adSliderFullCardInfo) == null || (z0Var = a1Var.f402569f) == null || (c17 = z0Var.c()) == null) ? null : (s34.o1) c17.get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawProductImg$default", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        r(o1Var, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawProductImg$default", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        s(o1Var);
        android.widget.ImageView imageView = this.f360527i;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        }
        android.widget.ImageView imageView2 = this.f360528j;
        if (imageView2 != null) {
            imageView2.setTranslationX(0.0f);
        }
        android.widget.ImageView imageView3 = this.f360528j;
        if (imageView3 != null) {
            imageView3.setAlpha(1.0f);
        }
        android.view.ViewGroup viewGroup = this.f360525g;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f);
        }
        a84.y0.i(this.f360528j);
        android.widget.ImageView imageView4 = this.f360528j;
        this.f360528j = this.f360527i;
        this.f360527i = imageView4;
        a84.y0.b(this.f360526h, imageView4, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initNoPAGStatus", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }

    public final void y(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAlpha", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.view.ViewGroup viewGroup = this.f360525g;
        if (viewGroup != null) {
            viewGroup.setAlpha(f17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAlpha", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
    }
}
