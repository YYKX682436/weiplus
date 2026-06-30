package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class c9 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f210317b;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.tools.b9 f210324i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f210325j;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.tools.a9 f210330o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.ga f210331p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.tools.z8 f210332q;

    /* renamed from: c, reason: collision with root package name */
    public boolean f210318c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f210319d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f210320e = true;

    /* renamed from: f, reason: collision with root package name */
    public android.view.MenuItem f210321f = null;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f210322g = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.o3 f210323h = null;

    /* renamed from: k, reason: collision with root package name */
    public int f210326k = com.tencent.mm.R.string.f490386tj;

    /* renamed from: l, reason: collision with root package name */
    public boolean f210327l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f210328m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f210329n = false;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f210316a = "MicroMsg.SearchViewHelper-" + java.lang.String.valueOf(java.lang.System.currentTimeMillis());

    public c9() {
        this.f210317b = false;
        this.f210325j = true;
        this.f210325j = true;
        this.f210317b = false;
    }

    public void a() {
        com.tencent.mm.ui.tools.o3 o3Var = this.f210323h;
        if (o3Var != null) {
            o3Var.b();
        }
    }

    public void b() {
        android.view.MenuItem menuItem;
        if (!this.f210318c || (menuItem = this.f210321f) == null) {
            return;
        }
        if (!this.f210317b) {
            com.tencent.mm.ui.tools.z8 z8Var = this.f210332q;
            if (z8Var != null) {
                z8Var.collapseActionView();
                return;
            }
            return;
        }
        try {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) menuItem.getActionView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewGroup.findViewById(com.tencent.mm.R.id.cob));
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.ui.tools.z8 z8Var2 = this.f210332q;
        if (z8Var2 != null) {
            z8Var2.collapseActionView();
        }
    }

    public void c(boolean z17) {
        if (this.f210318c) {
            return;
        }
        this.f210320e = z17;
        if (this.f210321f != null) {
            this.f210322g.post(new com.tencent.mm.ui.tools.x8(this));
        } else {
            this.f210319d = true;
        }
    }

    public void d(androidx.fragment.app.FragmentActivity fragmentActivity, boolean z17, android.view.Menu menu) {
        android.view.MenuItem menuItem;
        android.view.ViewGroup viewGroup;
        boolean z18 = this.f210318c;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f210322g;
        if (z18) {
            this.f210318c = false;
            try {
                if (u75.b.c() && com.tencent.mm.ui.bk.v0() && (menuItem = this.f210321f) != null && (viewGroup = (android.view.ViewGroup) menuItem.getActionView().getParent()) != null) {
                    viewGroup.removeView(viewGroup.findViewById(com.tencent.mm.R.id.cob));
                }
            } catch (java.lang.Exception unused) {
            }
            n(menu);
            com.tencent.mm.ui.tools.a9 a9Var = this.f210330o;
            if (a9Var != null) {
                i93.g$$a g__a = (i93.g$$a) a9Var;
                g__a.getClass();
                int i17 = com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI.f143385u;
                g__a.f289749a.finish();
            }
            com.tencent.mm.ui.tools.o3 o3Var = this.f210323h;
            if (o3Var != null) {
                o3Var.g(false);
            }
            n3Var.post(new com.tencent.mm.ui.tools.m8(this, fragmentActivity, z17));
            if (this.f210324i != null) {
                n3Var.post(new com.tencent.mm.ui.tools.n8(this));
            }
        }
        n3Var.post(new com.tencent.mm.ui.tools.o8(this, fragmentActivity));
    }

    public void e(androidx.fragment.app.FragmentActivity fragmentActivity, boolean z17, android.view.Menu menu) {
        if (this.f210318c) {
            return;
        }
        this.f210318c = true;
        o();
        k(fragmentActivity, menu);
        this.f210322g.post(new com.tencent.mm.ui.tools.y8(this, fragmentActivity, z17));
        com.tencent.mm.ui.tools.b9 b9Var = this.f210324i;
        if (b9Var != null) {
            b9Var.V5();
        }
    }

    public android.view.Menu f(android.view.Menu menu, android.app.Activity activity) {
        boolean z17 = menu instanceof db5.g4;
        db5.g4 g4Var = null;
        java.lang.String str = this.f210316a;
        if (!z17) {
            if (this.f210331p != null) {
                com.tencent.mars.xlog.Log.i(str, "getCurrentMenu, mActivityController.");
                com.tencent.mm.ui.tools.e eVar = this.f210331p.E;
                if (eVar != null && eVar.f210364c) {
                    g4Var = eVar.f210365d;
                }
            } else if (activity instanceof com.tencent.mm.ui.MMActivity) {
                g4Var = ((com.tencent.mm.ui.MMActivity) activity).getMenu();
            }
        }
        if (g4Var != null) {
            com.tencent.mars.xlog.Log.i(str, "getCurrentMenu, localmenu size = %s.", java.lang.Integer.valueOf(g4Var.size()));
            return g4Var;
        }
        com.tencent.mars.xlog.Log.i(str, "getCurrentMenu, localmenu is null.");
        return menu;
    }

    public java.lang.String g() {
        com.tencent.mm.ui.tools.o3 o3Var = this.f210323h;
        return o3Var != null ? o3Var.getSearchContent() : "";
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return this.f210320e;
    }

    public void j(androidx.fragment.app.FragmentActivity fragmentActivity, android.view.Menu menu) {
        if (fragmentActivity == null) {
            com.tencent.mars.xlog.Log.w(this.f210316a, "on add search menu, activity is null");
            return;
        }
        if (this.f210323h == null) {
            if (this.f210325j) {
                com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView = new com.tencent.mm.ui.tools.ActionBarSearchView(fragmentActivity);
                this.f210323h = actionBarSearchView;
                if (this.f210327l) {
                    actionBarSearchView.findViewById(com.tencent.mm.R.id.f482541h7).setBackgroundColor(actionBarSearchView.getResources().getColor(com.tencent.mm.R.color.f478512u));
                    actionBarSearchView.findViewById(com.tencent.mm.R.id.mes).setBackgroundResource(com.tencent.mm.R.drawable.f481016is);
                    ((android.widget.TextView) actionBarSearchView.f209961d).setTextColor(android.graphics.Color.parseColor("#7D90A9"));
                    ((com.tencent.mm.ui.widget.imageview.WeImageView) actionBarSearchView.findViewById(com.tencent.mm.R.id.meb)).setIconColor(android.graphics.Color.parseColor("#6B6B6B"));
                    actionBarSearchView.f209962e.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
                    actionBarSearchView.f209962e.setHintTextColor(android.graphics.Color.parseColor("#4DFFFFFF"));
                }
            } else {
                com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper searchViewNotRealTimeHelper = new com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper(fragmentActivity);
                this.f210323h = searchViewNotRealTimeHelper;
                searchViewNotRealTimeHelper.setNotRealCallBack(null);
            }
            this.f210323h.setAutoMatchKeywords(false);
            this.f210323h.setKeywords(null);
        }
        this.f210323h.setCallBack(new com.tencent.mm.ui.tools.p8(this));
        this.f210323h.f(h() && !(j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigVoiceSearchNewStyle()) == 1 && j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigFTSFloatingVoiceSearch()) <= 0 && !com.tencent.mm.ui.bk.U()));
        this.f210323h.setOnEditorActionListener(new com.tencent.mm.ui.tools.q8(this));
        android.view.MenuItem add = menu.add(0, com.tencent.mm.R.id.jha, 0, this.f210326k);
        this.f210321f = add;
        add.setEnabled(true);
        if (!this.f210329n) {
            if (this.f210327l) {
                this.f210321f.setIcon(com.tencent.mm.ui.uk.e(fragmentActivity, com.tencent.mm.R.raw.actionbar_icon_dark_search, fragmentActivity.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8)));
            } else {
                this.f210321f.setIcon(com.tencent.mm.ui.uk.e(fragmentActivity, com.tencent.mm.R.raw.actionbar_icon_dark_search, fragmentActivity.getResources().getColor(com.tencent.mm.R.color.FG_0)));
            }
        }
        if (!this.f210323h.e()) {
            this.f210321f.setActionView((android.view.View) this.f210323h);
        } else if (((android.view.View) this.f210323h).getParent() == null) {
            ((android.view.ViewGroup) fragmentActivity.findViewById(com.tencent.mm.R.id.u8p)).addView((android.view.View) this.f210323h);
        }
        boolean z17 = this.f210317b;
        if (z17) {
            this.f210321f.setShowAsAction(9);
        } else {
            this.f210321f.setShowAsAction(2);
        }
        if (z17) {
            this.f210332q = new com.tencent.mm.ui.tools.r8(this, fragmentActivity, menu);
        } else {
            this.f210332q = new com.tencent.mm.ui.tools.s8(this, fragmentActivity, menu);
        }
        this.f210323h.setBackClickCallback(new com.tencent.mm.ui.tools.t8(this));
    }

    public final void k(android.app.Activity activity, android.view.Menu menu) {
        if (this.f210318c || this.f210319d) {
            this.f210319d = false;
            if ((activity instanceof com.tencent.mm.ui.MMActivity) && !this.f210328m) {
                if (this.f210327l) {
                    ((com.tencent.mm.ui.MMActivity) activity).setActionbarColor(activity.getResources().getColor(com.tencent.mm.R.color.f478512u));
                } else {
                    ((com.tencent.mm.ui.MMActivity) activity).setActionbarColor(activity.getResources().getColor(com.tencent.mm.R.color.f478489a));
                }
            }
            if (menu != null) {
                for (int i17 = 0; i17 < menu.size(); i17++) {
                    android.view.MenuItem item = menu.getItem(i17);
                    if (item.getItemId() != com.tencent.mm.R.id.jha) {
                        item.setVisible(false);
                    }
                }
            }
            this.f210322g.postDelayed(new com.tencent.mm.ui.tools.w8(this, activity), 128L);
        }
    }

    public boolean l(int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 || !this.f210318c) {
            return false;
        }
        b();
        return true;
    }

    public void m(android.app.Activity activity, android.view.Menu menu) {
        java.lang.String str = this.f210316a;
        if (activity == null) {
            com.tencent.mars.xlog.Log.w(str, "on hanle status fail, activity is null");
            return;
        }
        android.view.Menu f17 = f(menu, activity);
        android.view.MenuItem menuItem = this.f210321f;
        if (menuItem == null) {
            com.tencent.mars.xlog.Log.w(str, "can not find search menu, error");
        } else {
            menuItem.setOnMenuItemClickListener(new com.tencent.mm.ui.tools.u8(this));
            k(activity, f17);
        }
    }

    public void n(android.view.Menu menu) {
        if (menu != null) {
            for (int i17 = 0; i17 < menu.size(); i17++) {
                android.view.MenuItem item = menu.getItem(i17);
                if (item.getItemId() != com.tencent.mm.R.id.jha) {
                    item.setVisible(true);
                }
            }
        }
    }

    public void o() {
    }

    public void p() {
    }

    public void q(java.lang.CharSequence charSequence) {
        com.tencent.mm.ui.tools.o3 o3Var = this.f210323h;
        if (o3Var == null) {
            return;
        }
        o3Var.setHint(charSequence);
    }

    public void r(java.lang.String str) {
        com.tencent.mm.ui.tools.o3 o3Var = this.f210323h;
        if (o3Var == null) {
            return;
        }
        o3Var.setSearchContent(str);
    }

    public c9(boolean z17, boolean z18) {
        this.f210317b = false;
        this.f210325j = true;
        this.f210325j = z17;
        this.f210317b = z18;
    }
}
