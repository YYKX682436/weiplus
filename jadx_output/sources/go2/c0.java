package go2;

/* loaded from: classes2.dex */
public final class c0 extends x92.m {
    public static int E = -1;
    public android.view.ViewGroup A;
    public android.widget.TextView B;
    public android.widget.ProgressBar C;
    public android.view.ViewGroup D;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f273958y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f273959z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f273958y = "";
        this.f273959z = "";
    }

    @Override // x92.m
    public void C7(int i17, java.lang.String str) {
        super.C7(i17, str);
        android.view.ViewGroup viewGroup = this.A;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
        viewGroup.setVisibility(0);
        android.widget.TextView textView = this.B;
        if (textView == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        textView.setVisibility(0);
        android.widget.ProgressBar progressBar = this.C;
        if (progressBar == null) {
            kotlin.jvm.internal.o.o("progressView");
            throw null;
        }
        progressBar.setVisibility(8);
        android.view.ViewGroup viewGroup2 = this.A;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new go2.a0(this));
        } else {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
    }

    @Override // x92.m
    public void G7() {
        android.view.ViewGroup viewGroup = this.A;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
        viewGroup.setVisibility(0);
        android.widget.TextView textView = this.B;
        if (textView == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        textView.setVisibility(8);
        android.widget.ProgressBar progressBar = this.C;
        if (progressBar == null) {
            kotlin.jvm.internal.o.o("progressView");
            throw null;
        }
        progressBar.setVisibility(0);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        this.f273959z = java.lang.String.valueOf(getIntent().getStringExtra("KEY_FINDER_PROFILE_UI_REQUEST_LIST_POSITION"));
        km5.d T = pm0.v.T(new ho2.b(V6, this.f273958y, this.f273959z, 0).l(), new go2.b0(this));
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        T.f((com.tencent.mm.plugin.finder.ui.MMFinderUI) activity);
    }

    public final void I7(java.lang.Integer num, java.lang.Integer num2, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        if (num == null || num.intValue() <= 0) {
            str = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("+");
            int intValue = num.intValue();
            if (intValue > 99) {
                intValue = 99;
            }
            sb6.append(intValue);
            str = sb6.toString();
        }
        if ((num2 != null ? num2.intValue() : 0) > 0) {
            kotlin.jvm.internal.o.d(num2);
            if (num2.intValue() > 999) {
                java.lang.String str3 = fragment.f129266q;
                kotlin.jvm.internal.o.d(str3);
                str2 = str3.concat("(999+)");
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String str4 = fragment.f129266q;
                kotlin.jvm.internal.o.d(str4);
                sb7.append(str4);
                sb7.append('(');
                sb7.append(num2);
                sb7.append(')');
                str2 = sb7.toString();
            }
        } else {
            str2 = fragment.f129266q;
            kotlin.jvm.internal.o.d(str2);
        }
        eo2.l lVar = new eo2.l(getContext(), -1, str2, false, fragment.f129265p, 0, com.tencent.mm.R.layout.f489028di0, false);
        lVar.f255587q = str;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, lVar, fragment, false, 4, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1000 && i18 == -1) {
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.t7(this, 1, false, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        E = -1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (E != -1) {
            java.util.Iterator it = f7().iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                zx2.i iVar = (zx2.i) it.next();
                if ((iVar instanceof w92.a) && ((w92.a) iVar).f444073l == E) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 != -1) {
                com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.t7(this, i17, false, 2, null);
            }
        }
        E = -1;
    }

    @Override // x92.m
    public int w7() {
        return com.tencent.mm.R.layout.b2m;
    }

    @Override // x92.m
    public void z7() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f273958y = stringExtra;
        getIntent().getIntExtra("key_finder_member_visitor_status", 0);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484229dg3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.A = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.m2g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.B = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.lbi);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.C = (android.widget.ProgressBar) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f485875jf1);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.D = (android.view.ViewGroup) findViewById4;
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout == null) {
            return;
        }
        tabLayout.setTabRippleColor(null);
    }
}
