package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class SnsTagDetailUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0, l75.z0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f167442q = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f167444e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference f167445f;

    /* renamed from: h, reason: collision with root package name */
    public long f167447h;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f167443d = null;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f167446g = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f167448i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f167449m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f167450n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f167451o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final r35.d2 f167452p = new com.tencent.mm.plugin.sns.ui.rr(this);

    public void V6(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(291, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(292, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.audio.c0.CTRL_INDEX, this);
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        if (((java.util.ArrayList) com.tencent.mm.plugin.sns.model.l4.Lj().z0()).size() == 0) {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.d3(1));
            this.f167450n = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void W6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(291, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(292, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.c0.CTRL_INDEX, this);
        gm0.j1.i();
        if (gm0.j1.b().m()) {
            gm0.j1.i();
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void X6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if ((this.f167448i + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f167446g, ",")).equals(this.f167449m) && this.f167447h != 0) {
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        } else {
            if (com.tencent.mm.plugin.sns.model.l4.Lj().b1(this.f167447h, this.f167448i)) {
                db5.e1.s(this, getString(com.tencent.mm.R.string.jfg, this.f167448i), getString(com.tencent.mm.R.string.f490573yv));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                return;
            }
            com.tencent.mm.plugin.sns.model.e3 e3Var = new com.tencent.mm.plugin.sns.model.e3(3, this.f167447h, this.f167448i, this.f167446g.size(), this.f167446g, this.f167451o);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(e3Var);
            this.f167443d = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.jfx), true, true, new com.tencent.mm.plugin.sns.ui.qr(this, e3Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        }
    }

    public void Y6(java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if (str == null || str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            return;
        }
        this.f167446g.remove(str);
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = this.f167445f;
        if (contactListExpandPreference2 != null) {
            contactListExpandPreference2.S(this.f167446g);
            this.f167445f.s();
        }
        if (this.f167446g.size() != 0 || (contactListExpandPreference = this.f167445f) == null) {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference3 = this.f167445f;
            if (contactListExpandPreference3 != null) {
                contactListExpandPreference3.T(true);
                contactListExpandPreference3.V(true);
            }
        } else {
            contactListExpandPreference.N();
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference4 = this.f167445f;
            contactListExpandPreference4.T(true);
            contactListExpandPreference4.V(false);
            ((com.tencent.mm.ui.base.preference.h0) this.f167444e).notifyDataSetChanged();
        }
        d7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void Z6(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.tencent.mm.storage.e8 pj6 = com.tencent.mm.plugin.sns.model.l4.pj();
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f167446g.contains(str) && ((com.tencent.mm.storage.k4) pj6).n(str, true) != null && ((com.tencent.mm.storage.k4) pj6).n(str, true).r2() && !r17.equals(str)) {
                this.f167446g.add(str);
            }
        }
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f167445f;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.S(this.f167446g);
            this.f167445f.s();
        }
        if (this.f167446g.size() > 0) {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = this.f167445f;
            contactListExpandPreference2.T(true);
            contactListExpandPreference2.V(true);
        } else {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference3 = this.f167445f;
            contactListExpandPreference3.T(true);
            contactListExpandPreference3.V(false);
        }
        d7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void a7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if (this.f167447h != 0) {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.f3(3, this.f167447h, this.f167448i));
        }
        this.f167443d = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.jfx), true, true, new com.tencent.mm.plugin.sns.ui.kr(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public java.util.List b7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        java.util.List linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.sns.storage.q2 D0 = com.tencent.mm.plugin.sns.model.l4.Lj().D0(this.f167447h);
        java.lang.String str = D0.field_memberList;
        if (str != null && !str.equals("")) {
            linkedList = com.tencent.mm.sdk.platformtools.t8.P1(D0.field_memberList.split(","));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return linkedList;
    }

    public final void c7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTagName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f167444e).h("settings_tag_name");
        if (h17 != null) {
            if (this.f167448i.length() > 20) {
                this.f167448i = this.f167448i.substring(0, 20);
            }
            h17.H(this.f167448i);
            ((com.tencent.mm.ui.base.preference.h0) this.f167444e).notifyDataSetChanged();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTagName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTitle", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        setMMTitle(this.f167448i + "(" + this.f167446g.size() + ")");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTitle", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            return dispatchKeyEvent;
        }
        if (!(this.f167448i + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f167446g, ",")).equals(this.f167449m) || this.f167447h == 0) {
            db5.e1.n(this, com.tencent.mm.R.string.jff, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.sns.ui.pr(this), null);
        } else {
            finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return true;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return com.tencent.mm.R.xml.f494962cs;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        this.f167444e = getPreferenceScreen();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("__initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = (com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference) ((com.tencent.mm.ui.base.preference.h0) this.f167444e).h("roominfo_contact_anchor");
        this.f167445f = contactListExpandPreference;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.R(this.f167444e, contactListExpandPreference.f197780q);
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = this.f167445f;
            contactListExpandPreference2.T(true);
            contactListExpandPreference2.V(true);
            this.f167445f.Q(this.f167446g);
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference3 = this.f167445f;
            com.tencent.mm.plugin.sns.ui.lr lrVar = new com.tencent.mm.plugin.sns.ui.lr(this);
            lz.f fVar = contactListExpandPreference3.M;
            if (fVar != null) {
                ((r35.u1) fVar).f369275g = lrVar;
            }
            contactListExpandPreference3.Z(this.f167452p);
        }
        if (bi4.v1.g()) {
            com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = (com.tencent.mm.ui.base.preference.PreferenceTitleCategory) ((com.tencent.mm.ui.base.preference.h0) this.f167444e).h("outside");
            if (preferenceTitleCategory != null) {
                preferenceTitleCategory.J(com.tencent.mm.R.string.jfp);
            }
            com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory2 = (com.tencent.mm.ui.base.preference.PreferenceTitleCategory) ((com.tencent.mm.ui.base.preference.h0) this.f167444e).h("black");
            if (preferenceTitleCategory2 != null) {
                preferenceTitleCategory2.J(com.tencent.mm.R.string.jfn);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("__initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
        setBackBtn(new com.tencent.mm.plugin.sns.ui.nr(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.sns.ui.or(this), null, com.tencent.mm.ui.fb.GREEN);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("k_sns_tag_name");
            if (stringExtra != null) {
                this.f167448i = stringExtra;
            }
            d7();
        } else {
            if (intent == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            java.lang.String r17 = c01.z1.r();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (r17 == null) {
                r17 = "";
            }
            if (r17.equals(stringExtra2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                z17 = true;
            } else {
                java.util.List list = this.f167446g;
                if (list == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                    z17 = false;
                } else {
                    java.util.Iterator it = list.iterator();
                    z17 = false;
                    while (it.hasNext()) {
                        if (((java.lang.String) it.next()).equals(stringExtra2)) {
                            z17 = true;
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                }
            }
            if (z17) {
                db5.e1.s(this, getString(com.tencent.mm.R.string.f489840d8, 0, 0), getString(com.tencent.mm.R.string.f490573yv));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                return;
            } else {
                java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(","));
                if (P1 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                    return;
                }
                Z6(P1);
            }
        }
        if (!(this.f167448i + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f167446g, ",")).equals(this.f167449m) || this.f167447h == 0) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        super.onCreate(bundle);
        V6(bundle);
        this.f167451o = getIntent().getIntExtra("k_tag_detail_sns_block_scene", 0);
        long longExtra = getIntent().getLongExtra("k_sns_tag_id", 0L);
        this.f167447h = longExtra;
        if (longExtra == 4) {
            this.f167448i = getString(com.tencent.mm.R.string.jfr);
        } else if (longExtra == 5) {
            this.f167448i = getString(com.tencent.mm.R.string.jfz);
        } else {
            this.f167448i = com.tencent.mm.plugin.sns.model.l4.Lj().D0(this.f167447h).field_tagName;
        }
        if (this.f167447h == 0) {
            java.lang.String stringExtra = getIntent().getStringExtra("k_sns_tag_list");
            java.lang.String stringExtra2 = getIntent().getStringExtra("k_sns_tag_name");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.f167448i = stringExtra2;
            com.tencent.mm.storage.e8 pj6 = com.tencent.mm.plugin.sns.model.l4.pj();
            java.lang.String r17 = c01.z1.r();
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            if (P1 != null) {
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!this.f167446g.contains(str) && ((com.tencent.mm.storage.k4) pj6).n(str, true).r2() && !r17.equals(str)) {
                        this.f167446g.add(str);
                    }
                }
            }
        } else {
            this.f167446g = b7();
        }
        java.lang.String str2 = this.f167448i;
        if (str2 == null || str2.equals("")) {
            this.f167448i = getString(com.tencent.mm.R.string.jfq);
            this.f167448i = com.tencent.mm.plugin.sns.model.s5.g(getString(com.tencent.mm.R.string.jfq));
        }
        initView();
        c7();
        d7();
        if (this.f167447h < 6) {
            ((com.tencent.mm.ui.base.preference.h0) this.f167444e).w("delete_tag_name");
            ((com.tencent.mm.ui.base.preference.h0) this.f167444e).w("delete_tag_name_category");
            if (this.f167447h > 0) {
                ((com.tencent.mm.ui.base.preference.h0) this.f167444e).w("settings_tag_name");
                ((com.tencent.mm.ui.base.preference.h0) this.f167444e).w("settings_tag_name_category");
            }
        }
        long j17 = this.f167447h;
        if (j17 == 4) {
            ((com.tencent.mm.ui.base.preference.h0) this.f167444e).w("black");
            ((com.tencent.mm.ui.base.preference.h0) this.f167444e).w("group");
        } else if (j17 == 5) {
            ((com.tencent.mm.ui.base.preference.h0) this.f167444e).w("outside");
            ((com.tencent.mm.ui.base.preference.h0) this.f167444e).w("group");
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f167444e).w("black");
            ((com.tencent.mm.ui.base.preference.h0) this.f167444e).w("outside");
        }
        if (this.f167447h == 0) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
        this.f167449m = this.f167448i + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f167446g, ",");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f167445f;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.getClass();
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f167443d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        W6();
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        java.lang.String str = preference.f197780q;
        if (str.equals("settings_tag_name")) {
            long j17 = this.f167447h;
            if (j17 >= 6 || j17 == 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_mode_name_type", 3);
                java.lang.String str2 = this.f167448i;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = " ";
                }
                intent.putExtra("Contact_Nick", str2);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.getClass();
                intent.setClass(this, com.tencent.mm.ui.contact.ModRemarkNameUI.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(2);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(this, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startRemarkUIForResult", "(Landroid/content/Intent;Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
        if (str.equals("delete_tag_name")) {
            db5.e1.n(this, com.tencent.mm.R.string.iiy, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.sns.ui.ir(this), new com.tencent.mm.plugin.sns.ui.jr(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        super.onResume();
        c7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f167443d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        switch (m1Var.getType()) {
            case com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX /* 290 */:
                finish();
                break;
            case 291:
                finish();
                break;
            case 292:
                if (this.f167445f != null && this.f167450n && !(this instanceof com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI)) {
                    com.tencent.mm.plugin.sns.model.d3 d3Var = (com.tencent.mm.plugin.sns.model.d3) m1Var;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(d3Var.H(this.f167447h))) {
                        for (int i19 = 0; i19 < ((java.util.LinkedList) d3Var.H(this.f167447h)).size(); i19++) {
                            java.lang.String str2 = (java.lang.String) ((java.util.LinkedList) d3Var.H(this.f167447h)).get(i19);
                            if (str2 != null) {
                                arrayList.add(str2);
                            }
                        }
                    }
                    this.f167449m = this.f167448i + " " + com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ",");
                    new java.util.LinkedList();
                    java.util.List<java.lang.String> list = this.f167446g;
                    this.f167446g = b7();
                    if (list != null) {
                        for (java.lang.String str3 : list) {
                            if (!this.f167446g.contains(str3)) {
                                this.f167446g.add(str3);
                            }
                        }
                    }
                    this.f167445f.S(this.f167446g);
                    this.f167445f.s();
                    break;
                }
                break;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }
}
