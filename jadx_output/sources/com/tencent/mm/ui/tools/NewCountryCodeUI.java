package com.tencent.mm.ui.tools;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/tools/NewCountryCodeUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class NewCountryCodeUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public android.view.View B;
    public com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView C;
    public android.os.Vibrator D;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f210113d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.tools.m7 f210114e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.tools.NewCountryCodeAlphabetScrollBar f210115f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f210116g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f210117h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f210118i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f210119m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f210121o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String[] f210122p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f210123q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f210124r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f210125s;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f210127u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f210128v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f210129w;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.tools.k7 f210132z;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f210120n = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f210126t = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f210130x = "";

    /* renamed from: y, reason: collision with root package name */
    public int f210131y = -1;

    public static final void T6(com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI, int i17, boolean z17) {
        com.tencent.mm.ui.tools.m7 m7Var = newCountryCodeUI.f210114e;
        if (m7Var != null) {
            int[] a17 = m7Var.a();
            int length = a17.length;
            for (int i18 = 0; i18 < length; i18++) {
                if (a17[i18] == i17) {
                    if (newCountryCodeUI.f210131y != i17) {
                        newCountryCodeUI.f210131y = i17;
                        if (android.os.Build.VERSION.SDK_INT >= 26) {
                            android.os.VibrationEffect createOneShot = android.os.VibrationEffect.createOneShot(10L, 255);
                            android.os.Vibrator vibrator = newCountryCodeUI.D;
                            if (vibrator != null) {
                                vibrator.vibrate(createOneShot);
                            }
                        } else {
                            android.os.Vibrator vibrator2 = newCountryCodeUI.D;
                            if (vibrator2 != null) {
                                vibrator2.vibrate(10L);
                            }
                        }
                    }
                    android.widget.ListView listView = newCountryCodeUI.f210113d;
                    if (listView != null) {
                        listView.setSelection(i18 + listView.getHeaderViewsCount());
                    }
                    newCountryCodeUI.f210129w = z17;
                    return;
                }
            }
        }
    }

    public final void U6() {
        android.widget.ListView listView;
        if (this.A) {
            this.A = false;
            android.view.View view = this.B;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI", "collapseSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/tools/NewCountryCodeUI", "collapseSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.tools.NewCountryCodeAlphabetScrollBar newCountryCodeAlphabetScrollBar = this.f210115f;
            if (newCountryCodeAlphabetScrollBar != null) {
                newCountryCodeAlphabetScrollBar.setVisibility(0);
            }
            com.tencent.mm.ui.tools.k7 k7Var = this.f210132z;
            if (k7Var != null) {
                k7Var.setVisibility(8);
            }
            com.tencent.mm.ui.tools.k7 k7Var2 = this.f210132z;
            if (k7Var2 != null) {
                k7Var2.b();
            }
            com.tencent.mm.ui.tools.k7 k7Var3 = this.f210132z;
            if (k7Var3 != null) {
                ((android.view.inputmethod.InputMethodManager) k7Var3.getContext().getSystemService("input_method")).hideSoftInputFromWindow(k7Var3.f209962e.getWindowToken(), 0);
            }
            android.view.ViewGroup viewGroup = this.f210127u;
            android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f482442ep) : null;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.ViewGroup viewGroup2 = this.f210127u;
            android.view.View findViewById = viewGroup2 != null ? viewGroup2.findViewById(com.tencent.mm.R.id.f483758bz2) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = findViewById;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI", "collapseSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/tools/NewCountryCodeUI", "collapseSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.f210128v;
            if (view3 != null && (listView = this.f210113d) != null) {
                listView.addHeaderView(view3);
            }
            com.tencent.mm.ui.tools.k7 k7Var4 = this.f210132z;
            if (k7Var4 != null) {
                k7Var4.setSearchContent("");
            }
            this.f210120n = "";
            V6();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            r11 = this;
            com.tencent.mm.ui.tools.m7 r0 = r11.f210114e
            if (r0 == 0) goto Lac
            java.lang.String r1 = r11.f210120n
            if (r1 == 0) goto L11
            java.lang.CharSequence r1 = r26.n0.u0(r1)
            java.lang.String r1 = r1.toString()
            goto L12
        L11:
            r1 = 0
        L12:
            r0.f210574g = r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L21
            int r1 = r1.length()
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r1 = r2
            goto L22
        L21:
            r1 = r3
        L22:
            r0.f210577m = r1
            java.util.List r1 = r0.f210572e
            r1.clear()
            java.util.List r4 = r0.f210573f
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L31:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La6
            java.lang.Object r5 = r4.next()
            u11.a r5 = (u11.a) r5
            java.lang.String r6 = r0.f210574g
            if (r6 == 0) goto L9f
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r8 = "getDefault(...)"
            kotlin.jvm.internal.o.f(r7, r8)
            java.lang.String r6 = r6.toUpperCase(r7)
            java.lang.String r7 = "toUpperCase(...)"
            kotlin.jvm.internal.o.f(r6, r7)
            java.lang.String r9 = r5.f423729c
            java.lang.String r10 = "countryName"
            kotlin.jvm.internal.o.f(r9, r10)
            java.util.Locale r10 = java.util.Locale.getDefault()
            kotlin.jvm.internal.o.f(r10, r8)
            java.lang.String r9 = r9.toUpperCase(r10)
            kotlin.jvm.internal.o.f(r9, r7)
            boolean r9 = r26.n0.B(r9, r6, r2)
            if (r9 != 0) goto L9f
            java.lang.String r9 = r5.f423730d
            java.lang.String r10 = "sortName"
            kotlin.jvm.internal.o.f(r9, r10)
            java.util.Locale r10 = java.util.Locale.getDefault()
            kotlin.jvm.internal.o.f(r10, r8)
            java.lang.String r8 = r9.toUpperCase(r10)
            kotlin.jvm.internal.o.f(r8, r7)
            boolean r6 = r26.n0.B(r8, r6, r2)
            if (r6 != 0) goto L9f
            java.lang.String r6 = r5.f423728b
            java.lang.String r7 = "zoneNum"
            kotlin.jvm.internal.o.f(r6, r7)
            java.lang.String r7 = r0.f210574g
            kotlin.jvm.internal.o.d(r7)
            boolean r6 = r26.n0.B(r6, r7, r2)
            if (r6 == 0) goto L9d
            goto L9f
        L9d:
            r6 = r2
            goto La0
        L9f:
            r6 = r3
        La0:
            if (r6 == 0) goto L31
            r1.add(r5)
            goto L31
        La6:
            r0.c()
            r0.notifyDataSetChanged()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.NewCountryCodeUI.V6():void");
    }

    public final void W6(java.lang.String str, int i17) {
        android.widget.TextView textView;
        if (str.length() == 0) {
            return;
        }
        char charAt = str.charAt(0);
        com.tencent.mm.ui.tools.m7 m7Var = this.f210114e;
        if (m7Var != null) {
            int[] a17 = m7Var.a();
            int length = a17.length;
            for (int i18 = 0; i18 < length; i18++) {
                if (a17[i18] == charAt) {
                    android.widget.ListView listView = this.f210113d;
                    if (listView != null) {
                        int firstVisiblePosition = i18 - listView.getFirstVisiblePosition();
                        android.widget.ListView listView2 = this.f210113d;
                        android.view.View childAt = listView.getChildAt(firstVisiblePosition + (listView2 != null ? listView2.getHeaderViewsCount() : 0));
                        if (childAt == null || (textView = (android.widget.TextView) childAt.findViewById(com.tencent.mm.R.id.cfx)) == null) {
                            return;
                        }
                        textView.setTextColor(b3.l.getColor(getContext(), i17));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void X6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("country_name", this.f210117h);
        intent.putExtra("couttry_code", this.f210118i);
        intent.putExtra("iso_code", this.f210119m);
        setResult(100, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.elc;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        super.onCreate(bundle);
        setTitleVisibility(8);
        com.tencent.mm.ui.ga controller = getController();
        controller.u0(com.tencent.mm.R.color.aaw);
        controller.G0(getColor(com.tencent.mm.R.color.f478489a));
        controller.f208675w = false;
        ul5.k kVar = controller.f208674v;
        if (kVar != null) {
            kVar.setBounceEnabled(false);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f210117h = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f210118i = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("iso_code");
        this.f210119m = stringExtra3 != null ? stringExtra3 : "";
        this.f210121o = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", true);
        this.f210122p = getIntent().getStringArrayExtra("exclude_countries_iso");
        this.f210123q = getIntent().getStringExtra("ui_title");
        this.D = (android.os.Vibrator) getContext().getSystemService("vibrator");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.tencent.mm.R.id.f482432ef);
        if (constraintLayout != null) {
            this.f210127u = constraintLayout;
            android.widget.TextView textView = (android.widget.TextView) constraintLayout.findViewById(com.tencent.mm.R.id.f482442ep);
            if (textView != null) {
                textView.setText(!com.tencent.mm.sdk.platformtools.t8.K0(this.f210123q) ? this.f210123q : getString(com.tencent.mm.R.string.f489935fy));
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                if (com.tencent.mm.ui.f.a()) {
                    com.tencent.mm.ui.f.b(textView, com.tencent.mm.R.dimen.f479559b);
                } else if (i65.a.D(getContext())) {
                    textView.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479559b) * i65.a.m(getContext()));
                }
            }
            android.view.View findViewById = constraintLayout.findViewById(com.tencent.mm.R.id.f483758bz2);
            if (findViewById != null) {
                findViewById.setOnClickListener(new com.tencent.mm.ui.tools.u7(this));
            }
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.jcb);
        this.B = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.tencent.mm.ui.tools.t7(this));
        }
        java.util.List b17 = u11.b.b(false);
        this.f210116g = b17;
        java.lang.String[] strArr = this.f210122p;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
                while (it.hasNext()) {
                    java.lang.String countryIsoCode = ((u11.a) it.next()).f423727a;
                    kotlin.jvm.internal.o.f(countryIsoCode, "countryIsoCode");
                    java.lang.String[] strArr2 = this.f210122p;
                    if (strArr2 != null) {
                        for (java.lang.String str : strArr2) {
                            if (kotlin.jvm.internal.o.b(str, countryIsoCode)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.NewCountryCodeUI", "exclude country: %s", countryIsoCode);
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        it.remove();
                    }
                }
            }
        }
        kz5.g0.t(b17, com.tencent.mm.ui.tools.v7.f210844d);
        this.f210124r = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.va7);
        this.f210125s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.va6);
        this.f210113d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482735mf);
        java.util.List list = this.f210116g;
        if (list != null) {
            com.tencent.mm.ui.tools.m7 m7Var = new com.tencent.mm.ui.tools.m7(this, list);
            this.f210114e = m7Var;
            m7Var.f210576i = this.f210121o;
        }
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.elb, null);
        this.f210128v = inflate;
        if (inflate != null) {
            inflate.setOnClickListener(new com.tencent.mm.ui.tools.s7(this, inflate));
        }
        android.widget.ListView listView = this.f210113d;
        if (listView != null) {
            listView.addHeaderView(this.f210128v);
        }
        android.widget.ListView listView2 = this.f210113d;
        if (listView2 != null) {
            listView2.setAdapter((android.widget.ListAdapter) this.f210114e);
        }
        android.widget.ListView listView3 = this.f210113d;
        if (listView3 != null) {
            listView3.setVisibility(0);
        }
        android.widget.ListView listView4 = this.f210113d;
        if (listView4 != null) {
            listView4.setOnScrollListener(new com.tencent.mm.ui.tools.q7(this));
        }
        android.widget.ListView listView5 = this.f210113d;
        if (listView5 != null) {
            android.view.ViewParent parent = listView5.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                this.C = new com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView(this);
                android.view.ViewGroup.LayoutParams layoutParams = listView5.getLayoutParams();
                int indexOfChild = viewGroup.indexOfChild(listView5);
                viewGroup.removeViewAt(indexOfChild);
                com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView mMWeUIBounceView = this.C;
                if (mMWeUIBounceView != null) {
                    mMWeUIBounceView.setView(listView5);
                }
                com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView mMWeUIBounceView2 = this.C;
                if (mMWeUIBounceView2 != null) {
                    mMWeUIBounceView2.setStart2EndBgColorByActionBar(getColor(com.tencent.mm.R.color.f478535ah2));
                }
                com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView mMWeUIBounceView3 = this.C;
                if (mMWeUIBounceView3 != null) {
                    mMWeUIBounceView3.setEnd2StartBgColorByNavigationBar(getColor(com.tencent.mm.R.color.aaw));
                }
                com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView mMWeUIBounceView4 = this.C;
                if (mMWeUIBounceView4 != null) {
                    mMWeUIBounceView4.q();
                }
                viewGroup.addView(this.C, indexOfChild, layoutParams);
            }
        }
        com.tencent.mm.ui.tools.NewCountryCodeAlphabetScrollBar newCountryCodeAlphabetScrollBar = (com.tencent.mm.ui.tools.NewCountryCodeAlphabetScrollBar) findViewById(com.tencent.mm.R.id.f482748mx);
        this.f210115f = newCountryCodeAlphabetScrollBar;
        if (newCountryCodeAlphabetScrollBar != null) {
            newCountryCodeAlphabetScrollBar.setOnScrollBarTouchListener(new com.tencent.mm.ui.tools.p7(this));
        }
        android.widget.ListView listView6 = this.f210113d;
        if (listView6 != null) {
            listView6.setOnItemClickListener(new com.tencent.mm.ui.tools.r7(this));
        }
        com.tencent.mm.ui.tools.k7 k7Var = new com.tencent.mm.ui.tools.k7(this);
        this.f210132z = k7Var;
        k7Var.setHint(getString(com.tencent.mm.R.string.f490549y8));
        com.tencent.mm.ui.tools.k7 k7Var2 = this.f210132z;
        if (k7Var2 != null) {
            k7Var2.setCallBack(new com.tencent.mm.ui.tools.n7(this));
        }
        com.tencent.mm.ui.tools.k7 k7Var3 = this.f210132z;
        if (k7Var3 != null) {
            k7Var3.setBackClickCallback(new com.tencent.mm.ui.tools.o7(this));
        }
        com.tencent.mm.ui.tools.k7 k7Var4 = this.f210132z;
        if (k7Var4 != null) {
            k7Var4.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = this.f210127u;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f210132z, new android.widget.LinearLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 != 4) {
            return super.onKeyUp(i17, event);
        }
        if (this.A) {
            U6();
            return true;
        }
        X6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.A) {
            U6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(la5.y.class);
    }
}
