package com.tencent.mm.plugin.topstory.ui.home;

@db5.a(3)
/* loaded from: classes11.dex */
public class TopStorySettingVisibilityDetailUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f174900t = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference f174901d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f174902e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f174903f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f174904g;

    /* renamed from: n, reason: collision with root package name */
    public long f174908n;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f174905h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f174906i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f174907m = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f174909o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f174910p = "";

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f174911q = null;

    /* renamed from: r, reason: collision with root package name */
    public final r35.d2 f174912r = new com.tencent.mm.plugin.topstory.ui.home.o1(this);

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f174913s = new java.util.HashSet();

    public final boolean V6() {
        if ((((java.lang.Object) this.f174909o) + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f174905h, ",")).equals(this.f174910p)) {
            finish();
            return true;
        }
        db5.e1.A(this, getString(this.f174911q != null ? com.tencent.mm.R.string.k0q : com.tencent.mm.R.string.k0o), "", getString(com.tencent.mm.R.string.k0t), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.topstory.ui.home.m1(this), null);
        return false;
    }

    public void W6(java.util.List list, boolean z17) {
        java.util.List list2;
        com.tencent.mm.storage.z3 n17;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(list == null ? -1 : list.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "dealOnAddContact %s", objArr);
        gm0.j1.i();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list2 = this.f174905h;
            if (!hasNext) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (!((java.util.ArrayList) list2).contains(str) && r17 != null && !r17.equals(str) && (n17 = Bi.n(str, true)) != null && (n17.r2() || !z17)) {
                ((java.util.ArrayList) list2).add(str);
                ((java.util.ArrayList) this.f174907m).add(str);
            }
        }
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f174901d;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.S(list2);
            this.f174901d.s();
        }
        if (((java.util.ArrayList) list2).size() > 0) {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = this.f174901d;
            contactListExpandPreference2.T(true);
            contactListExpandPreference2.V(true);
        } else {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference3 = this.f174901d;
            contactListExpandPreference3.T(true);
            contactListExpandPreference3.V(false);
        }
        X6();
        Y6();
    }

    public final void X6() {
        java.util.List list = this.f174907m;
        if (((java.util.ArrayList) list).isEmpty()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f174904g).m("revert_pref", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f174904g).m("revert_pref", false);
            this.f174903f.L(getString(com.tencent.mm.R.string.k0r, java.lang.Integer.valueOf(((java.util.ArrayList) list).size())));
        }
    }

    public void Y6() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(this.f174909o);
        spannableStringBuilder.append((java.lang.CharSequence) ("(" + ((java.util.ArrayList) this.f174905h).size() + ")"));
        setMMTitle(spannableStringBuilder);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        V6();
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494965cu;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f174904g = preferenceScreen;
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = (com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("roominfo_contact_anchor");
        this.f174901d = contactListExpandPreference;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.R(this.f174904g, contactListExpandPreference.f197780q);
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = this.f174901d;
            contactListExpandPreference2.T(true);
            contactListExpandPreference2.V(true);
            this.f174901d.Q(this.f174905h);
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference3 = this.f174901d;
            com.tencent.mm.plugin.topstory.ui.home.n1 n1Var = new com.tencent.mm.plugin.topstory.ui.home.n1(this);
            lz.f fVar = contactListExpandPreference3.M;
            if (fVar != null) {
                ((r35.u1) fVar).f369275g = n1Var;
            }
            contactListExpandPreference3.Z(this.f174912r);
        }
        this.f174902e = ((com.tencent.mm.ui.base.preference.h0) this.f174904g).h("desc");
        this.f174903f = ((com.tencent.mm.ui.base.preference.h0) this.f174904g).h("revert_pref");
        ((com.tencent.mm.ui.base.preference.h0) this.f174904g).m("revert_pref", true);
        getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
        setBackBtn(new com.tencent.mm.plugin.topstory.ui.home.k1(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.topstory.ui.home.l1(this), null, com.tencent.mm.ui.fb.GREEN);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onActivityResult %s", stringExtra);
            java.lang.String r17 = c01.z1.r();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (r17 == null) {
                r17 = "";
            }
            boolean equals = r17.equals(stringExtra);
            java.util.List list = this.f174905h;
            if (equals) {
                z17 = true;
            } else if (list == null) {
                z17 = false;
            } else {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                z17 = false;
                while (it.hasNext()) {
                    if (((java.lang.String) it.next()).equals(stringExtra)) {
                        z17 = true;
                    }
                }
            }
            if (z17) {
                db5.e1.s(this, getString(com.tencent.mm.R.string.f489840d8), "");
                return;
            }
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            if (P1 == null) {
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("App_MsgId");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) || !stringExtra2.equals("fromSns")) {
                W6(P1, true);
            } else {
                W6(P1, false);
            }
            if (!(((java.lang.Object) this.f174909o) + " " + com.tencent.mm.sdk.platformtools.t8.c1(list, ",")).equals(this.f174910p) || this.f174908n == 0) {
                enableOptionMenu(true);
            } else {
                enableOptionMenu(false);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
        java.util.List a17 = k35.c.a();
        java.lang.String stringExtra = getIntent().getStringExtra("k_topstory_user_list");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra);
        java.util.List list = this.f174905h;
        if (!K0) {
            java.util.List<java.lang.String> asList = java.util.Arrays.asList(stringExtra.split(","));
            this.f174906i = asList;
            for (java.lang.String str : asList) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !((java.util.ArrayList) a17).contains(str)) {
                    ((java.util.ArrayList) list).add(str);
                }
            }
        }
        initView();
        this.f174908n = getIntent().getIntExtra("k_topstory_type", 0);
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        long j17 = this.f174908n;
        mf0.f0 f0Var = mf0.f0.Medium;
        if (j17 == 1) {
            this.f174909o = getString(com.tencent.mm.R.string.k0x);
            lf0.h0 h0Var = (lf0.h0) g0Var;
            if (h0Var.Ai()) {
                this.f174902e.L(h0Var.wi(this, getString(com.tencent.mm.R.string.omt), "#", getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479853h2), f0Var, getColor(com.tencent.mm.R.color.f479211sz)));
                this.f174909o = h0Var.wi(this, getString(com.tencent.mm.R.string.omu), "#", (int) getMMTitleView().getTextSize(), f0Var, getMMTitleView().getCurrentTextColor());
            } else {
                this.f174902e.J(com.tencent.mm.R.string.k0y);
            }
        } else {
            this.f174909o = getString(com.tencent.mm.R.string.k0m);
            lf0.h0 h0Var2 = (lf0.h0) g0Var;
            if (h0Var2.Ai()) {
                this.f174902e.L(h0Var2.wi(this, getString(com.tencent.mm.R.string.omr), "#", getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479853h2), f0Var, getColor(com.tencent.mm.R.color.f479211sz)));
                this.f174909o = h0Var2.wi(this, getString(com.tencent.mm.R.string.oms), "#", (int) getMMTitleView().getTextSize(), f0Var, getMMTitleView().getCurrentTextColor());
            } else {
                this.f174902e.J(com.tencent.mm.R.string.k0n);
            }
        }
        gm0.j1.d().a(2859, this);
        enableOptionMenu(false);
        Y6();
        this.f174910p = ((java.lang.Object) this.f174909o) + " " + com.tencent.mm.sdk.platformtools.t8.c1(list, ",");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f174901d;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.getClass();
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f174911q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(2859, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (!"revert_pref".equals(preference.f197780q)) {
            return false;
        }
        db5.e1.A(this, getString(com.tencent.mm.R.string.k0o), "", getString(com.tencent.mm.R.string.k0t), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.topstory.ui.home.j1(this), null);
        return false;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var instanceof sm4.i) {
            sm4.i iVar = (sm4.i) m1Var;
            boolean z17 = false;
            boolean z18 = i17 == 0 && i18 == 0;
            if (!z18 || (i19 = ((r45.o50) iVar.f409948f.f70711b.f70700a).BaseResponse.f376959d) == 0) {
                z17 = z18;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd ret:%s", java.lang.Integer.valueOf(i19));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd succ:%s", java.lang.Boolean.valueOf(z17));
            java.util.Set set = this.f174913s;
            if (!z17) {
                int i27 = iVar.f409951i + 1;
                iVar.f409951i = i27;
                if (i27 < 2) {
                    sm4.i iVar2 = new sm4.i(iVar);
                    gm0.j1.n().f273288b.g(iVar2);
                    ((java.util.HashSet) set).add(iVar2);
                }
            }
            java.util.HashSet hashSet = (java.util.HashSet) set;
            if (hashSet.contains(m1Var)) {
                hashSet.remove(m1Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd netSceneSet remove, size:%s", java.lang.Integer.valueOf(hashSet.size()));
                if (hashSet.isEmpty()) {
                    com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f174911q;
                    if (u3Var != null) {
                        u3Var.dismiss();
                        this.f174911q = null;
                    }
                    finish();
                }
            }
        }
    }
}
