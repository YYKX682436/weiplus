package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/setting/ui/setting/l7", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class SettingsAuthUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f160327x = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f160329e;

    /* renamed from: f, reason: collision with root package name */
    public int f160330f;

    /* renamed from: g, reason: collision with root package name */
    public int f160331g;

    /* renamed from: h, reason: collision with root package name */
    public int f160332h;

    /* renamed from: i, reason: collision with root package name */
    public int f160333i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.l7 f160335n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f160336o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Integer f160337p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f160338q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f160339r;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160341t;

    /* renamed from: u, reason: collision with root package name */
    public rl5.r f160342u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f160343v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f160344w;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f160328d = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.a8(this));

    /* renamed from: m, reason: collision with root package name */
    public int f160334m = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f160340s = -1;

    public static final void T6(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        if (settingsAuthUI.f160343v) {
            return;
        }
        settingsAuthUI.f160343v = true;
        androidx.appcompat.app.AppCompatActivity context = settingsAuthUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.setting.ui.setting.b7) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.setting.ui.setting.b7.class)).O6(settingsAuthUI.f160336o);
    }

    public static final void U6(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        if (settingsAuthUI.f160333i <= 0 || settingsAuthUI.f160334m <= 0) {
            return;
        }
        settingsAuthUI.Z6(settingsAuthUI.X6().f267575e.getVisibility() == 0);
        settingsAuthUI.Y6(settingsAuthUI.X6().f267573c.getVisibility() == 0);
        if (settingsAuthUI.f160338q) {
            settingsAuthUI.W6();
        }
    }

    public static final boolean V6(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        int i17;
        int i18 = settingsAuthUI.f160333i;
        if (i18 <= 0 || (i17 = settingsAuthUI.f160330f) <= 0 || settingsAuthUI.f160334m >= 0) {
            return false;
        }
        settingsAuthUI.f160334m = i18 - i17;
        int dimensionPixelSize = i17 - settingsAuthUI.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
        settingsAuthUI.f160331g = dimensionPixelSize;
        settingsAuthUI.f160332h = dimensionPixelSize + settingsAuthUI.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthUI", "updateViewParams titleHeaderHeight: " + settingsAuthUI.f160330f + ", containerViewHeight: " + settingsAuthUI.f160334m + ", startOffset: " + settingsAuthUI.f160331g + ", endOffset: " + settingsAuthUI.f160332h);
        return true;
    }

    public final void W6() {
        com.tencent.mm.plugin.setting.ui.setting.l7 l7Var;
        com.tencent.mm.plugin.setting.ui.setting.l7 l7Var2 = this.f160335n;
        if (l7Var2 != null && l7Var2.x()) {
            this.f160338q = true;
            java.lang.String string = getResources().getString(com.tencent.mm.R.string.ipj);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            a7(true, string);
            com.tencent.mm.plugin.setting.ui.setting.l7 l7Var3 = this.f160335n;
            if (l7Var3 != null) {
                int itemCount = l7Var3.getItemCount() - 1;
                java.util.List list = l7Var3.f161276f;
                com.tencent.mm.plugin.setting.ui.setting.h7 h7Var = (com.tencent.mm.plugin.setting.ui.setting.h7) kz5.n0.a0(list, itemCount);
                if (h7Var != null && h7Var.f161097a == 2) {
                    ((java.util.ArrayList) list).remove(itemCount);
                    l7Var3.notifyDataSetChanged();
                }
            }
        } else {
            this.f160338q = false;
            a7(false, "");
        }
        if (!this.f160339r && (l7Var = this.f160335n) != null && !l7Var.x()) {
            this.f160339r = true;
            removeAllOptionMenu();
            addIconOptionMenu(800, com.tencent.mm.R.string.f490549y8, com.tencent.mm.R.raw.icons_outlined_search, new com.tencent.mm.plugin.setting.ui.setting.b8(this));
        } else {
            com.tencent.mm.plugin.setting.ui.setting.l7 l7Var4 = this.f160335n;
            if (l7Var4 != null && l7Var4.x()) {
                this.f160339r = false;
                removeAllOptionMenu();
            }
        }
    }

    public final g14.a X6() {
        return (g14.a) ((jz5.n) this.f160328d).getValue();
    }

    public final void Y6(boolean z17) {
        X6().f267573c.setVisibility(z17 ? 0 : 8);
        if (z17) {
            android.widget.LinearLayout linearLayout = X6().f267573c;
            android.view.ViewGroup.LayoutParams layoutParams = X6().f267573c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = null;
            } else if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((int) (this.f160334m * 0.3f)) - getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1);
            }
            linearLayout.setLayoutParams(layoutParams);
            if (gm0.j1.d().n() == 0) {
                X6().f267574d.setText(getResources().getString(com.tencent.mm.R.string.ipm));
            } else {
                X6().f267574d.setText(getResources().getString(com.tencent.mm.R.string.ipl));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r7.x() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(boolean r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showLoading show: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.SettingsAuthUI"
            com.tencent.mars.xlog.Log.i(r1, r0)
            if (r7 == 0) goto L64
            com.tencent.mm.plugin.setting.ui.setting.l7 r7 = r6.f160335n
            r0 = 0
            if (r7 == 0) goto L23
            boolean r7 = r7.x()
            r1 = 1
            if (r7 != r1) goto L23
            goto L24
        L23:
            r1 = r0
        L24:
            if (r1 == 0) goto L64
            g14.a r7 = r6.X6()
            android.widget.ProgressBar r7 = r7.f267575e
            g14.a r1 = r6.X6()
            android.widget.ProgressBar r1 = r1.f267575e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L56
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L57
            r2 = r1
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r6.f160334m
            float r3 = (float) r3
            r4 = 1050253722(0x3e99999a, float:0.3)
            float r3 = r3 * r4
            int r3 = (int) r3
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131165432(0x7f0700f8, float:1.794508E38)
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r3 - r4
            r2.topMargin = r3
            goto L57
        L56:
            r1 = 0
        L57:
            r7.setLayoutParams(r1)
            g14.a r7 = r6.X6()
            android.widget.ProgressBar r7 = r7.f267575e
            r7.setVisibility(r0)
            goto L6f
        L64:
            g14.a r7 = r6.X6()
            android.widget.ProgressBar r7 = r7.f267575e
            r0 = 8
            r7.setVisibility(r0)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI.Z6(boolean):void");
    }

    public final void a7(boolean z17, java.lang.String str) {
        X6().f267578h.setVisibility(z17 ? 0 : 8);
        X6().f267578h.setText(str);
        if (z17) {
            android.widget.TextView textView = X6().f267578h;
            android.view.ViewGroup.LayoutParams layoutParams = X6().f267578h.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = null;
            } else if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (this.f160334m * 0.3f);
            }
            textView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cl6;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1000 && i18 == -1) {
            com.tencent.mm.plugin.setting.ui.setting.l7 l7Var = this.f160335n;
            boolean z17 = false;
            if (l7Var != null && l7Var.y(this.f160340s)) {
                z17 = true;
            }
            if (z17) {
                W6();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.ipn);
        hideActionbarLine();
        this.f160337p = java.lang.Integer.valueOf(getResources().getColor(com.tencent.mm.R.color.f478491c));
        getMMTitleView().setAlpha(0.0f);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f160330f = 0;
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.m7(this));
        this.f160342u = new rl5.r(this);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView settingsAuthRecyclerView = X6().f267576f;
        kotlin.jvm.internal.o.f(settingsAuthRecyclerView, "settingsAuthRecyclerView");
        com.tencent.mm.plugin.setting.ui.setting.l7 l7Var = new com.tencent.mm.plugin.setting.ui.setting.l7(this, settingsAuthRecyclerView);
        this.f160335n = l7Var;
        l7Var.f161280m = new com.tencent.mm.plugin.setting.ui.setting.p7(this);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = X6().f267576f;
        loadMoreRecyclerView.setAdapter(this.f160335n);
        loadMoreRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(loadMoreRecyclerView.getContext()));
        loadMoreRecyclerView.setItemAnimator(null);
        android.view.View inflate = android.view.LayoutInflater.from(loadMoreRecyclerView.getContext()).inflate(com.tencent.mm.R.layout.bp8, (android.view.ViewGroup) null);
        this.f160344w = inflate;
        kotlin.jvm.internal.o.d(inflate);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) inflate.findViewById(com.tencent.mm.R.id.imd);
        android.view.View view = this.f160344w;
        kotlin.jvm.internal.o.d(view);
        ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.ime)).setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.q7(progressBar, this));
        android.view.View view2 = this.f160344w;
        kotlin.jvm.internal.o.d(view2);
        loadMoreRecyclerView.setLoadingView(view2);
        loadMoreRecyclerView.m1(false);
        loadMoreRecyclerView.setOnLoadingStateChangedListener(new com.tencent.mm.plugin.setting.ui.setting.r7(progressBar, this));
        android.view.View inflate2 = android.view.LayoutInflater.from(loadMoreRecyclerView.getContext()).inflate(com.tencent.mm.R.layout.bp9, (android.view.ViewGroup) null);
        this.f160329e = inflate2;
        kotlin.jvm.internal.o.d(inflate2);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.mp7)).getPaint(), 0.8f);
        android.view.View view3 = this.f160329e;
        kotlin.jvm.internal.o.d(view3);
        view3.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.setting.ui.setting.s7(this));
        android.view.View view4 = this.f160329e;
        kotlin.jvm.internal.o.d(view4);
        loadMoreRecyclerView.addHeaderView(view4);
        loadMoreRecyclerView.i(new com.tencent.mm.plugin.setting.ui.setting.t7(this));
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.setting.ui.setting.b7) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.setting.ui.setting.b7.class)).f160861d = new com.tencent.mm.plugin.setting.ui.setting.u7(this);
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((com.tencent.mm.plugin.setting.ui.setting.d7) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.setting.ui.setting.d7.class)).f160935d = new com.tencent.mm.plugin.setting.ui.setting.v7(this);
        X6().f267572b.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.setting.ui.setting.w7(this));
        X6().f267573c.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.x7(this));
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        com.tencent.mm.sdk.platformtools.t8.q(X6().f267577g, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.setting.ui.setting.b7) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.setting.ui.setting.b7.class)).f160861d = null;
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((com.tencent.mm.plugin.setting.ui.setting.d7) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.setting.ui.setting.d7.class)).f160935d = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        com.tencent.mm.ui.ga controller = getController();
        java.lang.Integer num = this.f160337p;
        kotlin.jvm.internal.o.d(num);
        controller.G0(num.intValue());
        ul5.k bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setStart2EndBgColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.setting.ui.setting.b7.class);
        set.add(com.tencent.mm.plugin.setting.ui.setting.d7.class);
    }
}
