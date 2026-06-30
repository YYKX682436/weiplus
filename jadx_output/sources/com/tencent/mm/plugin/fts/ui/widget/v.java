package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public class v extends com.tencent.mm.ui.tools.ActionBarSearchView {
    public com.tencent.mm.plugin.fts.ui.widget.n1 A;
    public int B;
    public yz5.l C;
    public boolean D;
    public android.view.View E;
    public android.view.View F;
    public android.view.View G;
    public android.widget.LinearLayout H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f138329J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public final jz5.g P;
    public final jz5.g Q;
    public final jz5.g R;
    public final jz5.g S;
    public boolean T;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f138330v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f138331w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f138332x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.fts.ui.widget.a0 f138333y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f138334z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context) {
        super(context);
        android.view.ViewGroup.LayoutParams layoutParams;
        z50.d dVar;
        kotlin.jvm.internal.o.g(context, "context");
        this.A = com.tencent.mm.plugin.fts.ui.widget.n1.f138305e;
        this.B = 1;
        this.C = com.tencent.mm.plugin.fts.ui.widget.h.f138274d;
        this.I = true;
        this.f138329J = true;
        this.K = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.m(this));
        this.L = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.o(this));
        this.M = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.n(this));
        this.N = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.s(this));
        this.P = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.r(this));
        this.Q = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.p(this));
        this.R = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.q(this));
        this.S = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.u(this));
        this.T = true;
        setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -2));
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = new com.tencent.mm.plugin.fts.ui.widget.a0(context);
        this.f138333y = a0Var;
        org.json.JSONObject wi6 = ((iv4.e) ((su4.s0) i95.n0.c(su4.s0.class))).wi();
        this.I = wi6.optLong("hideAiSearch", 0L) == 0;
        this.f138329J = wi6.optLong("hideYuanbaoAd", 0L) == 0;
        if (getContext() instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
            com.tencent.mm.ui.ga controller = ((com.tencent.mm.plugin.fts.ui.FTSMainUI) context2).getController();
            a0Var.f138243b.f469402h = i65.a.c(getContext(), com.tencent.mm.sdk.platformtools.d2.b(getContext(), true));
            android.view.View r17 = controller.r(com.tencent.mm.R.id.u8r);
            this.f138330v = r17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) r17 : null;
            android.view.View r18 = controller.r(com.tencent.mm.R.id.f482798sc4);
            this.f138331w = r18 instanceof android.view.ViewGroup ? (android.view.ViewGroup) r18 : null;
            if (a0Var.f138243b.e7()) {
                g23.h hVar = a0Var.f138243b.f469398d.f415695g;
                if (hVar.f267922f) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) hVar.f267920d;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (true) {
                        dVar = z50.e.f470163a;
                        if (i17 >= size) {
                            break;
                        }
                        g23.g gVar = (g23.g) arrayList.get(i17);
                        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dy9, this.f138330v, false);
                        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.tyk);
                        checkBox.setText(gVar.f267915b);
                        z50.h hVar2 = z50.i.f470166a;
                        if (hVar2.c()) {
                            checkBox.setTextSize(0, com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479674cb) * hVar2.b());
                        }
                        checkBox.setChecked(gVar.f267916c);
                        inflate.setOnClickListener(new com.tencent.mm.plugin.fts.ui.widget.l(this, checkBox, gVar));
                        java.lang.String str = gVar.f267914a;
                        if (kotlin.jvm.internal.o.b(str, "globalSearchAskRealPeople")) {
                            dVar.b(vu4.a.f440239f, vu4.b.f440261h, this.f138333y.f138243b.a7(), this.f138333y.f138243b.f469401g);
                        } else if (kotlin.jvm.internal.o.b(str, "globalSearchDeepThink")) {
                            dVar.b(vu4.a.f440239f, vu4.b.f440260g, this.f138333y.f138243b.a7(), this.f138333y.f138243b.f469401g);
                        }
                        android.view.ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
                        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams.leftMargin = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
                        inflate.setLayoutParams(marginLayoutParams);
                        android.view.ViewGroup viewGroup = this.f138330v;
                        if (viewGroup != null) {
                            viewGroup.addView(inflate);
                        }
                        this.f138332x = true;
                        i17++;
                    }
                    if (this.f138332x) {
                        android.view.View inflate2 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dy_, this.f138330v, false);
                        android.view.ViewGroup.LayoutParams layoutParams3 = inflate2.getLayoutParams();
                        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams2.leftMargin = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479671c8);
                        inflate2.setLayoutParams(marginLayoutParams2);
                        android.view.ViewGroup viewGroup2 = this.f138330v;
                        if (viewGroup2 != null) {
                            viewGroup2.addView(inflate2);
                        }
                        this.f138332x = false;
                    }
                    com.tencent.mm.plugin.fts.ui.widget.a0 a0Var2 = this.f138333y;
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) a0Var2.f138243b.f469398d.f415695g.f267921e;
                    int size2 = arrayList2.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        g23.f fVar = (g23.f) arrayList2.get(i18);
                        android.view.View inflate3 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dya, this.f138330v, false);
                        android.widget.ImageView imageView = (android.widget.ImageView) inflate3.findViewById(com.tencent.mm.R.id.tyl);
                        java.lang.String str2 = fVar.f267910c;
                        if (kotlin.jvm.internal.o.b(str2, "camera_regular")) {
                            imageView.setImageResource(com.tencent.mm.R.raw.camera_regular);
                        } else if (!kotlin.jvm.internal.o.b(str2, "plus_circle_regular")) {
                            break;
                        } else {
                            imageView.setImageResource(com.tencent.mm.R.raw.plus_circle_regular);
                        }
                        java.lang.String str3 = fVar.f267909b;
                        if (kotlin.jvm.internal.o.b(str3, "add")) {
                            dVar.b(vu4.a.f440239f, vu4.b.f440266p, a0Var2.f138243b.a7(), a0Var2.f138243b.f469401g);
                        } else if (kotlin.jvm.internal.o.b(str3, "photo")) {
                            dVar.b(vu4.a.f440239f, vu4.b.f440262i, a0Var2.f138243b.a7(), a0Var2.f138243b.f469401g);
                        }
                        inflate3.setOnClickListener(new com.tencent.mm.plugin.fts.ui.widget.k(this, fVar));
                        inflate3.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.cx8));
                        android.view.ViewGroup.LayoutParams layoutParams4 = inflate3.getLayoutParams();
                        kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams3.leftMargin = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479671c8);
                        inflate3.setLayoutParams(marginLayoutParams3);
                        android.view.ViewGroup viewGroup3 = this.f138330v;
                        if (viewGroup3 != null) {
                            viewGroup3.addView(inflate3);
                        }
                        this.f138332x = true;
                    }
                }
                t50.e eVar = this.f138333y.f138243b.f469398d;
                if (eVar.f415696h.f267898b || eVar.f415697i.f267896f) {
                    android.view.View inflate4 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ef6, this.f138330v, false);
                    t50.e eVar2 = this.f138333y.f138243b.f469398d;
                    g23.c cVar = eVar2.f415697i;
                    g23.d dVar2 = eVar2.f415696h;
                    this.H = (android.widget.LinearLayout) inflate4.findViewById(com.tencent.mm.R.id.f482799sc5);
                    this.E = inflate4.findViewById(com.tencent.mm.R.id.vpv);
                    android.widget.TextView textView = (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.vpw);
                    this.G = inflate4.findViewById(com.tencent.mm.R.id.d0v);
                    this.F = inflate4.findViewById(com.tencent.mm.R.id.f482796sc2);
                    textView.setText(dVar2.f267897a);
                    android.view.View view = this.E;
                    if (view != null) {
                        view.setOnClickListener(new com.tencent.mm.plugin.fts.ui.widget.i(this));
                    }
                    android.view.View view2 = this.F;
                    if (view2 != null) {
                        view2.setOnClickListener(new com.tencent.mm.plugin.fts.ui.widget.j(this, cVar));
                    }
                    z50.h hVar3 = z50.i.f470166a;
                    if (hVar3.c() || !com.tencent.mm.sdk.platformtools.m2.j()) {
                        android.view.View view3 = this.G;
                        if (view3 != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList3.add(8);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "adaptBigFontForYB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "adaptBigFontForYB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.widget.LinearLayout linearLayout = this.H;
                        if (linearLayout != null) {
                            linearLayout.setOrientation(1);
                        }
                        float b17 = hVar3.b();
                        android.view.View view4 = this.E;
                        android.widget.ImageView imageView2 = view4 != null ? (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.f484361ta3) : null;
                        if (imageView2 != null && (layoutParams = imageView2.getLayoutParams()) != null) {
                            int i19 = (int) (18 * b17);
                            layoutParams.width = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i19);
                            layoutParams.height = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i19);
                        }
                        android.view.View view5 = this.F;
                        android.widget.TextView textView2 = view5 != null ? (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.f482796sc2) : null;
                        if (textView2 != null) {
                            textView2.setTextSize(0, com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479674cb) * b17);
                        }
                        android.view.ViewGroup.LayoutParams layoutParams5 = textView2 != null ? textView2.getLayoutParams() : null;
                        kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
                        android.view.View view6 = this.E;
                        android.widget.TextView textView3 = view6 != null ? (android.widget.TextView) view6.findViewById(com.tencent.mm.R.id.vpw) : null;
                        if (textView3 != null) {
                            textView3.setTextSize(0, com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479674cb) * b17);
                        }
                    }
                    android.view.ViewGroup viewGroup4 = this.f138331w;
                    if (viewGroup4 != null) {
                        viewGroup4.addView(inflate4);
                    }
                    w();
                } else {
                    eVar.f415694f.getClass();
                }
            }
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mec);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.fts.ui.widget.a(this));
        }
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText editText = this.f209962e;
        kotlin.jvm.internal.o.f(editText, "editText");
        editText.setTextSize(0, i65.a.a(editText.getContext(), 17.0f) * i65.a.m(editText.getContext()));
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.mdg);
        if (button != null) {
            button.setOnClickListener(new com.tencent.mm.plugin.fts.ui.widget.b(this));
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.tencent.mm.R.id.v1h);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new com.tencent.mm.plugin.fts.ui.widget.c(this));
        }
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        kotlin.jvm.internal.o.d(actionBarEditText);
        actionBarEditText.addTextChangedListener(new com.tencent.mm.plugin.fts.ui.widget.g(this));
        actionBarEditText.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.fts.ui.widget.d(this));
        actionBarEditText.addOnLayoutChangeListener(new com.tencent.mm.plugin.fts.ui.widget.e(this));
        if (getPullUpKeyboardWhenStartup()) {
            c(java.lang.Boolean.FALSE);
        }
        p(((java.lang.Boolean) ((jz5.n) this.K).getValue()).booleanValue(), true);
        getSettingOptionBtn().setOnClickListener(new com.tencent.mm.plugin.fts.ui.widget.f(this));
        if (((java.lang.Boolean) ((jz5.n) this.L).getValue()).booleanValue()) {
            return;
        }
        android.view.View settingOptionBtn = getSettingOptionBtn();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(settingOptionBtn, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        settingOptionBtn.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(settingOptionBtn, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getPullUpKeyboardWhenStartup() {
        k23.x0 x0Var = k23.c1.f303536h;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return ((java.lang.Boolean) ((jz5.n) x0Var.a(context).f303538d.f303531d).getValue()).booleanValue();
    }

    private final androidx.constraintlayout.widget.ConstraintLayout getSearchBarContainer() {
        return (androidx.constraintlayout.widget.ConstraintLayout) ((jz5.n) this.Q).getValue();
    }

    private final androidx.constraintlayout.widget.ConstraintLayout getSearchEditTextContainer() {
        return (androidx.constraintlayout.widget.ConstraintLayout) ((jz5.n) this.R).getValue();
    }

    private final android.view.View getSettingOptionBtn() {
        return (android.view.View) ((jz5.n) this.P).getValue();
    }

    private final android.view.View getTitleTv() {
        return (android.view.View) ((jz5.n) this.N).getValue();
    }

    private final com.tencent.mm.ui.widget.imageview.WeImageButton getVoiceV3Btn() {
        return (com.tencent.mm.ui.widget.imageview.WeImageButton) ((jz5.n) this.S).getValue();
    }

    public static final boolean o(com.tencent.mm.plugin.fts.ui.widget.v vVar) {
        vVar.getClass();
        k23.x0 x0Var = k23.c1.f303536h;
        android.content.Context context = vVar.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return ((java.lang.Boolean) ((jz5.n) x0Var.a(context).f303538d.f303530c).getValue()).booleanValue();
    }

    @Override // com.tencent.mm.ui.tools.ActionBarSearchView
    public int getLayoutId() {
        return com.tencent.mm.R.layout.efg;
    }

    public final int getSwitchModeType() {
        return this.A.f138309d;
    }

    public final com.tencent.mm.plugin.fts.ui.widget.a0 getViewMode() {
        return this.f138333y;
    }

    @Override // com.tencent.mm.ui.tools.ActionBarSearchView
    public void i(boolean z17) {
        if (getPullUpKeyboardWhenStartup() || this.f138334z) {
            return;
        }
        p(z17, false);
    }

    @Override // com.tencent.mm.ui.tools.ActionBarSearchView
    public void j(com.tencent.mm.ui.tools.r rVar) {
        if (rVar == com.tencent.mm.ui.tools.r.VOICE_SEARCH) {
            z50.d dVar = z50.e.f470163a;
            vu4.a aVar = vu4.a.D;
            vu4.b bVar = vu4.b.D;
            com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = this.f138333y;
            dVar.b(aVar, bVar, a0Var.f138243b.a7(), a0Var.f138243b.f469401g);
        }
    }

    @Override // com.tencent.mm.ui.tools.ActionBarSearchView
    public void k(com.tencent.mm.ui.tools.r rVar) {
        if (rVar == com.tencent.mm.ui.tools.r.VOICE_SEARCH) {
            z50.d dVar = z50.e.f470163a;
            vu4.a aVar = vu4.a.f440239f;
            vu4.b bVar = vu4.b.f440258e;
            com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = this.f138333y;
            dVar.b(aVar, bVar, a0Var.f138243b.a7(), a0Var.f138243b.f469401g);
        }
    }

    public final void p(boolean z17, boolean z18) {
        com.tencent.mm.ui.ga controller;
        if (!z18) {
            android.transition.AutoTransition autoTransition = new android.transition.AutoTransition();
            autoTransition.setDuration(300L);
            autoTransition.setOrdering(0);
            android.content.Context context = getContext();
            com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = context instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) context : null;
            android.view.KeyEvent.Callback r17 = (fTSMainUI == null || (controller = fTSMainUI.getController()) == null) ? null : controller.r(android.R.id.content);
            android.view.ViewGroup viewGroup = r17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) r17 : null;
            if (viewGroup != null) {
                android.transition.TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
            }
        }
        if (z17) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.d(getSearchBarContainer());
            cVar.c(com.tencent.mm.R.id.v1h, 1);
            cVar.f(com.tencent.mm.R.id.v1h, 1, com.tencent.mm.R.id.mdd, 1, (int) getResources().getDimension(com.tencent.mm.R.dimen.f479718db));
            cVar.m(com.tencent.mm.R.id.v1h, 3, 0);
            cVar.n(com.tencent.mm.R.id.odf, 8);
            cVar.n(com.tencent.mm.R.id.v3m, 8);
            cVar.a(getSearchBarContainer());
            android.view.ViewGroup viewGroup2 = this.f138330v;
            if (viewGroup2 != null) {
                com.tencent.mm.ui.kk.e(viewGroup2, (int) getResources().getDimension(com.tencent.mm.R.dimen.f479718db));
            }
            android.view.ViewGroup viewGroup3 = this.f138330v;
            if (viewGroup3 != null) {
                viewGroup3.requestLayout();
                return;
            }
            return;
        }
        android.view.View titleTv = getTitleTv();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(titleTv, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "animateEditTextFocusInVoiceV3", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        titleTv.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(titleTv, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "animateEditTextFocusInVoiceV3", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View settingOptionBtn = getSettingOptionBtn();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(settingOptionBtn, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "animateEditTextFocusInVoiceV3", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        settingOptionBtn.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(settingOptionBtn, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "animateEditTextFocusInVoiceV3", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        cVar2.d(getSearchBarContainer());
        cVar2.c(com.tencent.mm.R.id.v1h, 1);
        cVar2.f(com.tencent.mm.R.id.v1h, 1, com.tencent.mm.R.id.mdd, 1, (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
        cVar2.m(com.tencent.mm.R.id.v1h, 3, (int) getResources().getDimension(com.tencent.mm.R.dimen.f479738dv));
        cVar2.n(com.tencent.mm.R.id.odf, 0);
        if (((java.lang.Boolean) ((jz5.n) this.L).getValue()).booleanValue()) {
            cVar2.n(com.tencent.mm.R.id.v3m, 0);
        }
        cVar2.a(getSearchBarContainer());
        android.view.ViewGroup viewGroup4 = this.f138330v;
        if (viewGroup4 != null) {
            com.tencent.mm.ui.kk.e(viewGroup4, (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
        }
        android.view.ViewGroup viewGroup5 = this.f138330v;
        if (viewGroup5 != null) {
            viewGroup5.requestLayout();
        }
    }

    public final void q() {
        androidx.constraintlayout.widget.ConstraintLayout searchEditTextContainer = getSearchEditTextContainer();
        if (getPullUpKeyboardWhenStartup()) {
            android.transition.AutoTransition autoTransition = new android.transition.AutoTransition();
            autoTransition.setDuration(300L);
            autoTransition.setOrdering(0);
            android.transition.TransitionManager.beginDelayedTransition(searchEditTextContainer, autoTransition);
        } else {
            c(java.lang.Boolean.TRUE);
            p(true, true);
        }
        if (this.f138334z) {
            return;
        }
        this.f138334z = true;
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = this.f138333y;
        java.lang.String query = this.f209962e.getText().toString();
        a0Var.getClass();
        kotlin.jvm.internal.o.g(query, "query");
        z13.f fVar = a0Var.f138243b;
        fVar.getClass();
        android.app.Activity context = fVar.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
        ((com.tencent.mm.plugin.fts.ui.FTSMainUI) context).Z6(query, 0);
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = this.f209962e;
        actionBarEditText.setHorizontallyScrolling(false);
        actionBarEditText.setMinLines(2);
        actionBarEditText.setMaxLines(5);
        actionBarEditText.setGravity(8388659);
        actionBarEditText.setVerticalScrollBarEnabled(true);
        actionBarEditText.setHint(actionBarEditText.getResources().getString(com.tencent.mm.R.string.o4p));
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.d(searchEditTextContainer);
        cVar.n(com.tencent.mm.R.id.mdg, 0);
        cVar.n(com.tencent.mm.R.id.mec, 8);
        cVar.c(com.tencent.mm.R.id.mdg, 3);
        cVar.e(com.tencent.mm.R.id.mdg, 4, com.tencent.mm.R.id.v1h, 4);
        int selectionStart = this.f209962e.getSelectionStart();
        int selectionEnd = this.f209962e.getSelectionEnd();
        this.f209962e.setScrollX(0);
        this.f209962e.setSelection(selectionStart, selectionEnd);
        cVar.f(com.tencent.mm.R.id.d98, 1, 0, 1, com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9));
        cVar.f(com.tencent.mm.R.id.p7j, 1, 0, 1, com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9));
        if (!v()) {
            android.text.Editable text = this.f209962e.getText();
            kotlin.jvm.internal.o.f(text, "getText(...)");
            if (text.length() == 0) {
                z(cVar);
            }
        }
        searchEditTextContainer.getLayoutParams().height = r();
        cVar.b(searchEditTextContainer);
        searchEditTextContainer.setConstraintSet(null);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
        android.view.View r17 = ((com.tencent.mm.plugin.fts.ui.FTSMainUI) context2).getController().r(com.tencent.mm.R.id.u8s);
        if (r17 != null) {
            android.transition.AutoTransition autoTransition2 = new android.transition.AutoTransition();
            autoTransition2.setDuration(300L);
            autoTransition2.setOrdering(0);
            autoTransition2.excludeTarget(com.tencent.mm.R.id.f482798sc4, true);
            android.transition.TransitionManager.beginDelayedTransition((android.view.ViewGroup) r17, autoTransition2);
        }
    }

    public final int r() {
        int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        int dimensionPixelSize2 = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
        int dimensionPixelSize3 = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479660bx);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(dimensionPixelSize + dimensionPixelSize2 + this.f209962e.getHeight());
        if (!(valueOf.intValue() > dimensionPixelSize3)) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : dimensionPixelSize3;
    }

    public final void s() {
        getVoiceV3Btn().setVisibility(8);
    }

    public final void setCursorVisible(boolean z17) {
        this.f209962e.setCursorVisible(z17);
    }

    public final void setLargeModeSwitchType(com.tencent.mm.plugin.fts.ui.widget.n1 largeModeSwitchType) {
        kotlin.jvm.internal.o.g(largeModeSwitchType, "largeModeSwitchType");
        this.A = largeModeSwitchType;
    }

    public final void t() {
        android.view.ViewGroup viewGroup = this.f138331w;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            android.view.View view = this.E;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.G;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.F;
            if (view3 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final boolean u() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return ((z13.f) a17).e7();
    }

    public final boolean v() {
        k23.x0 x0Var = k23.c1.f303536h;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return x0Var.a(context).W6();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if ((r5.getVisibility() == 8) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fts.ui.widget.v.w():void");
    }

    public final void x() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = (com.tencent.mm.plugin.fts.ui.FTSMainUI) context;
        android.view.View r17 = fTSMainUI.getController().r(com.tencent.mm.R.id.u8s);
        if (r17 == null || r17.getVisibility() != 8) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(r17, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "showControlBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "showControlBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View r18 = fTSMainUI.getController().r(com.tencent.mm.R.id.u8q);
        if (r18 != null) {
            r18.requestLayout();
        }
    }

    public final void y() {
        if (!u() || this.D) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f138331w;
        boolean z17 = false;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            w();
        }
    }

    public final androidx.constraintlayout.widget.c z(androidx.constraintlayout.widget.c cVar) {
        cVar.c(com.tencent.mm.R.id.nhn, 3);
        cVar.e(com.tencent.mm.R.id.nhn, 2, com.tencent.mm.R.id.mdg, 1);
        cVar.f(com.tencent.mm.R.id.nhn, 4, com.tencent.mm.R.id.v1h, 4, com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479673ca));
        return cVar;
    }
}
