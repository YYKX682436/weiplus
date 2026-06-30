package com.tencent.mm.plugin.label.ui;

/* loaded from: classes11.dex */
public class ContactLabelEditUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int I = 0;
    public android.app.ProgressDialog C;
    public java.lang.String D;
    public java.lang.String E;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143220d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143221e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143222f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.d4 f143223g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f143224h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f143225i;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f143229p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f143230q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference f143231r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.label.ui.widget.InputClearablePreference f143232s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f143233t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.PreferenceTitleCategory f143234u;

    /* renamed from: m, reason: collision with root package name */
    public boolean f143226m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f143227n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f143228o = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f143235v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f143236w = true;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f143237x = new java.util.ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f143238y = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f143239z = new java.util.HashSet();
    public final java.util.HashSet A = new java.util.HashSet();
    public final java.util.HashSet B = new java.util.HashSet();
    public final com.tencent.mm.autogen.mmdata.rpt.ContactLabelEditStruct G = new com.tencent.mm.autogen.mmdata.rpt.ContactLabelEditStruct();
    public final com.tencent.mm.sdk.platformtools.n3 H = new f93.g1(this, android.os.Looper.getMainLooper());

    public static void V6(com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI) {
        contactLabelEditUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[saveLabelChange]");
        contactLabelEditUI.C = db5.e1.Q(contactLabelEditUI, contactLabelEditUI.getString(com.tencent.mm.R.string.f490573yv), contactLabelEditUI.getString(com.tencent.mm.R.string.g9k), true, true, new f93.c1(contactLabelEditUI));
        java.lang.String str = contactLabelEditUI.f143221e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        contactLabelEditUI.f143221e = str;
        java.lang.String trim = str.trim();
        contactLabelEditUI.f143221e = trim;
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            contactLabelEditUI.hideLoading();
            contactLabelEditUI.a7(contactLabelEditUI.getString(com.tencent.mm.R.string.g96));
            return;
        }
        if (com.tencent.mm.ui.tools.v4.f(contactLabelEditUI.f143221e) > 36) {
            contactLabelEditUI.hideLoading();
            contactLabelEditUI.a7(java.lang.String.format(contactLabelEditUI.getString(com.tencent.mm.R.string.f489830cy), java.lang.Integer.valueOf(com.tencent.mm.ui.tools.v4.b(36, ""))));
            return;
        }
        boolean z18 = true;
        if (!(!com.tencent.mm.sdk.platformtools.t8.K0(b93.r.wi().p1(contactLabelEditUI.f143221e))) || !contactLabelEditUI.f143235v) {
            if (!(!com.tencent.mm.sdk.platformtools.t8.K0(b93.r.wi().p1(contactLabelEditUI.f143221e))) || com.tencent.mm.sdk.platformtools.t8.K0(contactLabelEditUI.f143220d) || contactLabelEditUI.f143220d.equals(contactLabelEditUI.f143221e)) {
                com.tencent.mm.storage.d4 n17 = b93.r.wi().n1(contactLabelEditUI.f143222f);
                if (contactLabelEditUI.f143235v || n17.field_isTemporary) {
                    c01.d9.e().g(new e93.a(contactLabelEditUI.f143221e));
                } else {
                    c01.d9.e().g(new e93.f(com.tencent.mm.sdk.platformtools.t8.P(contactLabelEditUI.f143222f, 0), contactLabelEditUI.f143221e));
                }
                java.lang.String str2 = contactLabelEditUI.f143227n;
                if (str2 != null) {
                    int length = str2.length();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length) {
                            break;
                        }
                        int codePointAt = str2.codePointAt(i17);
                        if (!java.lang.Character.isWhitespace(codePointAt)) {
                            z18 = false;
                            break;
                        }
                        i17 += java.lang.Character.charCount(codePointAt);
                    }
                    if (z18) {
                        return;
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("view_id", "label_update_finish_btn");
                    hashMap.put("label_business_type", java.lang.Integer.valueOf(contactLabelEditUI.f143228o));
                    hashMap.put("label_select_sessionid", contactLabelEditUI.f143227n);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", contactLabelEditUI.getListView(), hashMap, 33926);
                    return;
                }
                return;
            }
        }
        contactLabelEditUI.hideLoading();
        contactLabelEditUI.a7(contactLabelEditUI.getString(com.tencent.mm.R.string.f489826cu));
    }

    public final void W6(com.tencent.mm.storage.d4 d4Var) {
        if (b93.r.wi().delete(d4Var, "labelID")) {
            setResult(-1);
            finish();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelEditUI", "cpan[doDeleteContactLabel] fail.");
            a7(getString(com.tencent.mm.R.string.f491043bo5));
        }
    }

    public final void X6() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.util.HashSet hashSet = this.f143239z;
        objArr[0] = java.lang.Integer.valueOf(hashSet == null ? 0 : hashSet.size());
        java.util.HashSet hashSet2 = this.B;
        objArr[1] = java.lang.Integer.valueOf(hashSet2 != null ? hashSet2.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doUpdateContactList] addcount:%d,delcount:%d", objArr);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (hashSet != null && hashSet.size() > 0) {
            hashSet.size();
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n((java.lang.String) it.next(), true);
                java.lang.String D0 = n17.D0();
                java.lang.String b17 = b93.n.b(D0, this.f143222f);
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "labels:%s mixLabelIds:%s", D0, b17);
                if (!b17.equalsIgnoreCase(D0)) {
                    r45.gw6 gw6Var = new r45.gw6();
                    gw6Var.f375581d = n17.d1();
                    gw6Var.f375582e = b17;
                    linkedList.add(gw6Var);
                }
            }
        }
        if (hashSet2 != null && hashSet2.size() > 0) {
            hashSet2.size();
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                java.lang.String D02 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true).D0();
                java.lang.String c17 = b93.n.c(D02, this.f143222f);
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "username:%s labels:%s mixLabelIds:%s", str, D02, c17);
                if (!c17.equalsIgnoreCase(D02)) {
                    r45.gw6 gw6Var2 = new r45.gw6();
                    gw6Var2.f375581d = str;
                    gw6Var2.f375582e = c17;
                    linkedList.add(gw6Var2);
                }
            }
        }
        if (linkedList.size() > 0) {
            c01.d9.e().g(new e93.e(linkedList));
        } else {
            Y6();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.label.ui.ContactLabelEditUI.Y6():void");
    }

    public final void Z6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[saveFailed]");
        hideLoading();
        a7(getString(com.tencent.mm.R.string.f489827cv));
    }

    public void a7(java.lang.String str) {
        db5.e1.t(this, str, "", new f93.d1(this));
    }

    public final void b7() {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f143231r;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.Q(this.f143237x);
            java.util.ArrayList arrayList = this.f143237x;
            if (arrayList == null || arrayList.size() <= 0) {
                this.f143231r.N();
            }
        }
        com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference = this.f143232s;
        if (inputClearablePreference != null) {
            inputClearablePreference.N(this.f143221e);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public s75.b getIdentString() {
        return new s75.b(this.f143235v ? "_New" : "_Edit");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494898ay;
    }

    public final void hideLoading() {
        android.app.ProgressDialog progressDialog = this.C;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.C.dismiss();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (this.F) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 1, 0, 2);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 1, 0, 3);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f143222f)) {
            this.f143235v = true;
            this.f143229p = getString(com.tencent.mm.R.string.f492719hl2);
        } else {
            this.f143235v = false;
            this.f143223g = b93.r.wi().n1(this.f143222f);
            this.f143229p = getString(com.tencent.mm.R.string.f492718hl1);
        }
        setMMTitle(this.f143229p);
        setBackBtn(new f93.h1(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490547y6), new f93.i1(this), null, com.tencent.mm.ui.fb.GREEN);
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f143230q = preferenceScreen;
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = (com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("contact_label_contact_list");
        this.f143231r = contactListExpandPreference;
        contactListExpandPreference.R(this.f143230q, contactListExpandPreference.f197780q);
        this.f143231r.T(true);
        this.f143231r.V(true);
        lz.f fVar = this.f143231r.M;
        if (fVar != null) {
            ((r35.u1) fVar).f369274f.getClass();
        }
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = this.f143231r;
        lz.f fVar2 = contactListExpandPreference2.M;
        if (fVar2 != null) {
            ((r35.u1) fVar2).f369273e = false;
        }
        f93.j1 j1Var = new f93.j1(this);
        if (fVar2 != null) {
            ((r35.u1) fVar2).f369275g = j1Var;
        }
        contactListExpandPreference2.Z(new f93.k1(this));
        com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference = (com.tencent.mm.plugin.label.ui.widget.InputClearablePreference) ((com.tencent.mm.ui.base.preference.h0) this.f143230q).h("contact_label_name");
        this.f143232s = inputClearablePreference;
        java.lang.String string = getString(com.tencent.mm.R.string.g8z);
        inputClearablePreference.M = string;
        com.tencent.mm.ui.widget.MMEditText mMEditText = inputClearablePreference.S;
        if (mMEditText != null) {
            mMEditText.setHint(string);
        }
        this.f143232s.N = getString(com.tencent.mm.R.string.g9g);
        com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference2 = this.f143232s;
        java.lang.String string2 = getString(com.tencent.mm.R.string.f489828cw);
        inputClearablePreference2.P = string2;
        android.widget.TextView textView = inputClearablePreference2.U;
        if (textView != null) {
            textView.setText(string2);
        }
        com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference3 = this.f143232s;
        inputClearablePreference3.Q = 36;
        inputClearablePreference3.R = this.f143235v;
        inputClearablePreference3.W = new f93.l1(this);
        inputClearablePreference3.N(this.f143221e);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.H;
        if (n3Var != null) {
            n3Var.sendEmptyMessage(com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
        }
        if (this.f143235v) {
            java.util.ArrayList arrayList = this.f143237x;
            if (arrayList == null || arrayList.size() <= 0) {
                lz.f fVar3 = this.f143231r.M;
                if (fVar3 != null) {
                    r35.u1 u1Var = (r35.u1) fVar3;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(0);
                    r35.v1 v1Var = u1Var.f369274f;
                    v1Var.f369307z = false;
                    v1Var.f369291g = arrayList2;
                    u1Var.a(null);
                }
            } else {
                this.f143231r.Q(this.f143237x);
            }
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new f93.m1(this));
        }
        if (getListView() != null) {
            getListView().setOnScrollListener(new f93.n1(this));
        }
        this.f143233t = ((com.tencent.mm.ui.base.preference.h0) this.f143230q).h("contact_label_delete");
        this.f143234u = (com.tencent.mm.ui.base.preference.PreferenceTitleCategory) ((com.tencent.mm.ui.base.preference.h0) this.f143230q).h("contact_label_empty_category");
        if (!this.f143235v) {
            if (this.f143226m) {
                return;
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f143230q).v(this.f143233t);
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f143230q).v(this.f143233t);
        ((com.tencent.mm.ui.base.preference.h0) this.f143230q).v(this.f143234u);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] requestCode:%d resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1 && i17 == 7001) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] %s", stringExtra + "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            if (P1 != null && P1.size() > 0) {
                int size = P1.size();
                for (int i19 = 0; i19 < size; i19++) {
                    java.lang.String str = (java.lang.String) P1.get(i19);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        if (!c01.e2.J(str) || this.f143237x.contains(str) || str.equals(this.D)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", str);
                        } else {
                            this.f143237x.add(str);
                            java.util.ArrayList arrayList = this.f143238y;
                            if (arrayList != null && !arrayList.contains(P1.get(i19))) {
                                this.f143239z.add(str);
                                com.tencent.mm.autogen.mmdata.rpt.ContactLabelEditStruct contactLabelEditStruct = this.G;
                                contactLabelEditStruct.f55744l++;
                                contactLabelEditStruct.f55745m = contactLabelEditStruct.b("TotoalAddUinList", contactLabelEditStruct.f55745m + ";" + str, true);
                            }
                            if (booleanExtra) {
                                this.A.add(str);
                            }
                            java.util.HashSet hashSet = this.B;
                            if (hashSet != null && hashSet.contains(str)) {
                                hashSet.remove(str);
                            }
                        }
                    }
                }
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.H;
            if (n3Var != null) {
                n3Var.sendEmptyMessage(com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        if ((!com.tencent.mm.sdk.platformtools.t8.K0(this.f143221e) && !this.f143221e.equals(this.f143220d)) || (((hashSet = this.f143239z) != null && hashSet.size() > 0) || ((hashSet2 = this.B) != null && hashSet2.size() > 0))) {
            db5.e1.A(this, getString(com.tencent.mm.R.string.i8_), "", getString(com.tencent.mm.R.string.apf), getString(com.tencent.mm.R.string.api), new f93.e1(this), new f93.f1(this));
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.D = c01.z1.r();
        this.f143222f = getIntent().getStringExtra("label_id");
        this.f143220d = getIntent().getStringExtra("label_name");
        this.f143221e = getIntent().getStringExtra("label_name");
        this.f143224h = getIntent().getBooleanExtra("Is_Chatroom", false);
        this.f143225i = getIntent().getIntExtra("last_page_source_type", 0) == 1;
        java.lang.String stringExtra = getIntent().getStringExtra("label_source");
        this.E = stringExtra;
        this.F = stringExtra != null && stringExtra.equals("label_source_Address");
        this.f143226m = getIntent().getBooleanExtra("is_show_delete", true);
        this.f143227n = getIntent().getStringExtra("contact_select_label_session_id");
        this.f143228o = getIntent().getIntExtra("contact_select_label_from_scene", 0);
        java.lang.String stringExtra2 = getIntent().getStringExtra("Select_Contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(","));
            this.f143237x = new java.util.ArrayList();
            if (P1 != null && P1.size() > 0) {
                int size = P1.size();
                for (int i17 = 0; i17 < size; i17++) {
                    java.lang.String str = (java.lang.String) P1.get(i17);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        if (!c01.e2.J(str) || this.f143237x.contains(str) || str.equals(this.D)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", str);
                        } else {
                            this.f143237x.add(str);
                            this.f143239z.add(str);
                            if (this.f143224h) {
                                this.A.add(str);
                            }
                        }
                    }
                }
            }
        }
        c01.d9.e().a(kd1.c.CTRL_INDEX, this);
        c01.d9.e().a(637, this);
        c01.d9.e().a(638, this);
        initView();
        int i18 = java.util.Objects.equals(this.E, "label_source_Address") ? 1 : java.util.Objects.equals(this.E, "label_source_SNS") ? 2 : -1;
        com.tencent.mm.autogen.mmdata.rpt.ContactLabelEditStruct contactLabelEditStruct = this.G;
        contactLabelEditStruct.f55736d = i18;
        contactLabelEditStruct.f55737e = contactLabelEditStruct.b("SessionID", this.D + "-" + java.lang.System.currentTimeMillis(), true);
        contactLabelEditStruct.f55738f = contactLabelEditStruct.b("LabelID", this.f143222f, true);
        contactLabelEditStruct.f55740h = 0;
        contactLabelEditStruct.f55741i = 0;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(kd1.c.CTRL_INDEX, this);
        c01.d9.e().q(637, this);
        c01.d9.e().q(638, this);
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f143231r;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.getClass();
        }
        super.onDestroy();
        this.G.k();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.e().q(636, this);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelEditUI", "cpan [onPreferenceTreeClick] key is null.");
            return false;
        }
        if (str.equals("contact_label_delete")) {
            db5.e1.B(this, getString(com.tencent.mm.R.string.g8v), "", getString(com.tencent.mm.R.string.g8u), getString(com.tencent.mm.R.string.f490347sg), new f93.o1(this), new f93.b1(this), com.tencent.mm.R.color.f479482a31);
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        c01.d9.e().a(636, this);
        enableOptionMenu(!com.tencent.mm.sdk.platformtools.t8.K0(this.f143221e));
        b7();
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int type = m1Var.getType();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.H;
        switch (type) {
            case kd1.c.CTRL_INDEX /* 635 */:
                if (i17 != 0 || i18 != 0) {
                    Z6();
                    return;
                }
                java.util.LinkedList linkedList = ((r45.c4) ((e93.a) m1Var).f250348d.f70711b.f70700a).f371260e;
                if (linkedList == null || linkedList.size() <= 0) {
                    Z6();
                    return;
                }
                r45.f54 f54Var = (r45.f54) linkedList.get(0);
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] add label pair.LabelID:%s pair.LabelName:%s", f54Var.f374022e + "", f54Var.f374021d);
                this.f143222f = f54Var.f374022e + "";
                com.tencent.mm.storage.h4 wi6 = b93.r.wi();
                java.lang.String str2 = this.f143222f;
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f143239z);
                wi6.getClass();
                java.lang.String str3 = "cacheNewLabelUsers() called with: id = [" + str2 + "], size= [" + arrayList.size() + "], user = [" + arrayList + "] stack:%s";
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelStorage", str3, new com.tencent.mm.sdk.platformtools.z3());
                wi6.f195005g.put(str2, arrayList);
                X6();
                return;
            case 636:
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] delete fail.");
                    a7(getString(com.tencent.mm.R.string.f491043bo5));
                    return;
                } else {
                    W6(this.f143223g);
                    if (n3Var != null) {
                        n3Var.sendEmptyMessageDelayed(6002, 300L);
                        return;
                    }
                    return;
                }
            case 637:
                if (i17 != 0 || i18 != 0) {
                    Z6();
                    return;
                }
                java.lang.String str4 = this.f143222f;
                java.lang.String str5 = this.f143221e;
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doInsertOrUpdateLable]");
                try {
                    i19 = java.lang.Integer.valueOf(str4).intValue();
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelEditUI", "id is not integer type:%s", str4 + "");
                    i19 = -1;
                }
                if (i19 != -1) {
                    com.tencent.mm.storage.d4 n17 = b93.r.wi().n1(str4);
                    if (n17 == null) {
                        n17 = new com.tencent.mm.storage.d4();
                    }
                    n17.field_labelID = i19;
                    n17.field_labelName = str5;
                    n17.field_labelPYFull = x51.k.a(str5);
                    n17.field_labelPYShort = x51.k.b(str5);
                    b93.r.wi().update(n17, "labelID");
                } else {
                    Z6();
                }
                X6();
                return;
            case 638:
                if (i17 != 0 || i18 != 0) {
                    Z6();
                    return;
                }
                Y6();
                if (n3Var != null) {
                    n3Var.sendEmptyMessageDelayed(6002, 300L);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
