package f84;

/* loaded from: classes4.dex */
public abstract class u extends com.tencent.mm.plugin.sns.ui.widget.l {
    public f84.v A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public android.content.Context F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final android.os.Handler f260204J;
    public final jz5.g K;
    public final jz5.g L;
    public final f84.p M;
    public final f84.o N;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f260205o;

    /* renamed from: p, reason: collision with root package name */
    public final int f260206p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f260207q;

    /* renamed from: r, reason: collision with root package name */
    public final w64.n f260208r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f260209s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f260210t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f260211u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f260212v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f260213w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f260214x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f260215y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f260216z;

    public u(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, boolean z17, w64.n nVar) {
        super(str, yVar, view);
        this.f260205o = view;
        this.f260206p = i17;
        this.f260207q = z17;
        this.f260208r = nVar;
        this.f260209s = jz5.h.b(new f84.t(this));
        this.f260211u = jz5.h.b(new f84.l(this));
        this.f260212v = jz5.h.b(new f84.k(this));
        this.f260213w = jz5.h.b(new f84.q(this));
        this.f260214x = jz5.h.b(new f84.n(this));
        this.f260215y = jz5.h.b(new f84.s(this));
        this.f260204J = new android.os.Handler(android.os.Looper.getMainLooper());
        this.K = jz5.h.b(new f84.m(this));
        this.L = jz5.h.b(new f84.r(this));
        this.M = new f84.p(this);
        this.N = new f84.o(this);
    }

    public static final /* synthetic */ android.view.View y(f84.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.view.View C = uVar.C();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return C;
    }

    public static final /* synthetic */ android.widget.FrameLayout z(f84.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdBrandTopicView$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.widget.FrameLayout frameLayout = uVar.f260210t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdBrandTopicView$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return frameLayout;
    }

    public final void A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        if (this.F == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        f84.v vVar = this.A;
        if (vVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        f84.y a17 = vVar.a();
        if (a17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContainerWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
        int i17 = vVar.f260217a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContainerWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrandPreludeWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
        int i18 = a17.f260227e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrandPreludeWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
        if (i17 <= 0 || i18 <= 0) {
            com.tencent.mars.xlog.Log.e(j(), "adBrandTopicWidth or brandPreludeWidth <= 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        android.widget.FrameLayout frameLayout = this.f260210t;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i19 = this.D;
            marginLayoutParams.width = i19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContainerHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
            int i27 = vVar.f260218b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContainerHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
            marginLayoutParams.height = (i19 * i27) / i17;
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout B = B();
        android.view.ViewGroup.LayoutParams layoutParams2 = B != null ? B.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            int i28 = (this.D * i18) / i17;
            marginLayoutParams2.width = i28;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrandPreludeHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
            int i29 = a17.f260228f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrandPreludeHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
            marginLayoutParams2.height = (i28 * i29) / i18;
        }
        android.view.View C = C();
        android.view.ViewGroup.LayoutParams layoutParams3 = C != null ? C.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams3 != null) {
            int i37 = (this.D * 28) / i17;
            marginLayoutParams3.width = i37;
            marginLayoutParams3.height = (i37 * 73) / 28;
        }
        android.view.View E = E();
        android.view.ViewGroup.LayoutParams layoutParams4 = E != null ? E.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams4 != null) {
            int i38 = this.D;
            int i39 = (i38 * 28) / i17;
            marginLayoutParams4.width = i39;
            marginLayoutParams4.height = (i39 * 73) / 28;
            marginLayoutParams4.leftMargin = i38 - i39;
        }
        android.widget.FrameLayout frameLayout2 = this.f260210t;
        if (frameLayout2 != null) {
            frameLayout2.requestLayout();
        }
        android.widget.FrameLayout frameLayout3 = this.f260210t;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
    }

    public final com.tencent.mm.ui.widget.RoundCornerFrameLayout B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBrandPreludeLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = (com.tencent.mm.ui.widget.RoundCornerFrameLayout) ((jz5.n) this.f260211u).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBrandPreludeLayout", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return roundCornerFrameLayout;
    }

    public final android.view.View C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.f260214x).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return view;
    }

    public final com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRecyclerView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView overScrollDoubleSideRecyclerView = (com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView) ((jz5.n) this.f260213w).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRecyclerView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return overScrollDoubleSideRecyclerView;
    }

    public final android.view.View E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.f260215y).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return view;
    }

    public final android.graphics.drawable.GradientDrawable F(android.graphics.drawable.GradientDrawable.Orientation orientation) {
        android.content.res.Resources resources;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaskBackground", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.content.Context context = this.F;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(orientation, new int[]{0, (context == null || (resources = context.getResources()) == null) ? 0 : resources.getColor(com.tencent.mm.R.color.f478491c)});
        gradientDrawable.setGradientType(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaskBackground", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        return gradientDrawable;
    }

    public final void G(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, f84.v vVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        if (vVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            return;
        }
        if (!this.C) {
            this.C = true;
            com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView D = D();
            if (D != null) {
                D.setOverScrollMode(2);
                D.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
                D.N(new f84.j(this));
                D.i(this.M);
                D.setHasFixedSize(true);
                D.setItemViewCacheSize(6);
            }
        }
        f84.d dVar = new f84.d(context, snsInfo, vVar, D(), this.D);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        dVar.f260181h = this.N;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        dVar.setHasStableIds(true);
        com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView D2 = D();
        if (D2 != null) {
            D2.setAdapter(dVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        android.view.View view;
        android.content.Context context;
        f84.y a17;
        r45.jj4 jj4Var;
        r45.jj4 jj4Var2;
        androidx.recyclerview.widget.f2 adapter;
        f84.y a18;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        kotlin.jvm.internal.o.g(model, "model");
        java.lang.String j17 = j();
        try {
            view = this.f260205o;
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        if (view != null && (context = view.getContext()) != null) {
            this.F = context;
            if (!this.B) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdBrandTopicStub", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.f260209s).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdBrandTopicStub", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
                this.f260210t = inflate instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) inflate : null;
                this.B = true;
            }
            com.tencent.mars.xlog.Log.i(j(), "bindComponentModel, snsId is " + ca4.z0.t0(model.field_snsId) + ", isSame is " + z17);
            this.f260216z = model;
            f84.v vVar = model.getAdXml().adBrandTopicInfo;
            if (vVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            }
            this.A = vVar;
            int y17 = ca4.m0.y(j(), this.F, this.f260206p, this.f260207q);
            this.D = y17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRecyclerViewSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            int intValue = ((java.lang.Number) ((jz5.n) this.L).getValue()).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRecyclerViewSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            this.E = y17 + intValue;
            com.tencent.mm.ui.widget.RoundCornerFrameLayout B = B();
            if (B != null) {
                B.setTranslationX(0.0f);
            }
            com.tencent.mm.ui.widget.RoundCornerFrameLayout B2 = B();
            if (B2 != null) {
                B2.setAlpha(1.0f);
            }
            com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView D = D();
            if (D != null) {
                D.setTranslationX(-this.E);
            }
            com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView D2 = D();
            if (D2 != null) {
                D2.setAlpha(0.0f);
            }
            com.tencent.mm.ui.widget.RoundCornerFrameLayout B3 = B();
            if (B3 != null) {
                android.content.Context context2 = this.F;
                f84.v vVar2 = this.A;
                if (vVar2 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContainerCornerRadius", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                    i17 = vVar2.f260219c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContainerCornerRadius", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                } else {
                    i17 = 0;
                }
                B3.setRadius(i65.a.b(context2, i17));
            }
            if (com.tencent.mm.ui.bk.C()) {
                f84.v vVar3 = this.A;
                if (vVar3 != null && (a18 = vVar3.a()) != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrandPreludeDarkMedia", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
                    jj4Var = a18.f260226d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrandPreludeDarkMedia", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
                    jj4Var2 = jj4Var;
                }
                jj4Var2 = null;
            } else {
                f84.v vVar4 = this.A;
                if (vVar4 != null && (a17 = vVar4.a()) != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrandPreludeMedia", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
                    jj4Var = a17.f260225c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrandPreludeMedia", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.BrandPreludeInfo");
                    jj4Var2 = jj4Var;
                }
                jj4Var2 = null;
            }
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBrandPreludeIcon", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f260212v).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBrandPreludeIcon", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            android.content.Context context3 = this.F;
            int hashCode = context3 != null ? context3.hashCode() : 0;
            com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
            s7Var.f195313b = model.getTimeLine().CreateTime;
            hj6.W(jj4Var2, imageView, -1, hashCode, s7Var);
            A();
            android.view.View C = C();
            if (C != null) {
                C.setBackground(F(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT));
            }
            android.view.View E = E();
            if (E != null) {
                E.setBackground(F(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT));
            }
            android.view.View C2 = C();
            if (C2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(C2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(C2, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View E2 = E();
            if (E2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(E2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                E2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(E2, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View C3 = C();
            if (C3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(C3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                C3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(C3, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (z17) {
                com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView D3 = D();
                if (D3 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(D3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "Undefined", "scrollToPosition", "(I)V");
                    D3.a1(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(D3, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "Undefined", "scrollToPosition", "(I)V");
                }
                com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView D4 = D();
                if (D4 != null && (adapter = D4.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
            } else {
                G(this.F, model, this.A);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            kotlinx.coroutines.y0 h17 = h();
            if (h17 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(h17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new f84.i(model, this, null), 2, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        android.widget.FrameLayout frameLayout = this.f260210t;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.G = false;
        this.H = false;
        this.I = false;
        this.f260204J.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
    }
}
