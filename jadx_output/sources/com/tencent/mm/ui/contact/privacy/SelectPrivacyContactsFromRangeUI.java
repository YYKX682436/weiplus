package com.tencent.mm.ui.contact.privacy;

@db5.a(8192)
/* loaded from: classes10.dex */
public class SelectPrivacyContactsFromRangeUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int W = 0;
    public uf5.q1 C;
    public uf5.r1 D;
    public int E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String[] H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f207121J;
    public android.widget.ImageView K;
    public boolean L;
    public boolean M;
    public boolean T;
    public boolean U;
    public boolean N = true;
    public final java.util.Set P = new java.util.HashSet();
    public final java.util.Set Q = new java.util.HashSet();
    public final uf5.j1 R = new uf5.j1(this);
    public boolean S = false;
    public boolean V = false;

    public static void w7(com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI) {
        int i17;
        selectPrivacyContactsFromRangeUI.getClass();
        com.tencent.mm.autogen.mmdata.rpt.ContactsAuthorityManageOperateLogStruct contactsAuthorityManageOperateLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ContactsAuthorityManageOperateLogStruct();
        int i18 = 2;
        if ("@sns.black.android".equals(selectPrivacyContactsFromRangeUI.G)) {
            i17 = 1;
        } else if ("@sns.unlike.android".equals(selectPrivacyContactsFromRangeUI.G)) {
            i17 = 2;
        } else {
            if ("@werun.black.android".equals(selectPrivacyContactsFromRangeUI.G)) {
                i18 = 5;
            } else {
                int i19 = 4;
                if (!"@tophistory.black.android".equals(selectPrivacyContactsFromRangeUI.G)) {
                    if (!"@tophistory.unlike.android".equals(selectPrivacyContactsFromRangeUI.G)) {
                        i19 = 3;
                        if (!"@finder.block.his.liked.android".equals(selectPrivacyContactsFromRangeUI.G)) {
                            if (!"@finder.block.my.liked.android".equals(selectPrivacyContactsFromRangeUI.G)) {
                                if ("@social.black.android".equals(selectPrivacyContactsFromRangeUI.G)) {
                                    i18 = 1;
                                } else {
                                    i17 = -1;
                                    i18 = 0;
                                }
                            }
                        }
                    }
                    i17 = 2;
                    i18 = i19;
                }
                i17 = 1;
                i18 = i19;
            }
            i17 = 0;
        }
        contactsAuthorityManageOperateLogStruct.f55754e = i18;
        contactsAuthorityManageOperateLogStruct.f55753d = selectPrivacyContactsFromRangeUI.E != 16 ? 1L : 2L;
        contactsAuthorityManageOperateLogStruct.f55755f = i17;
        contactsAuthorityManageOperateLogStruct.f55756g = selectPrivacyContactsFromRangeUI.getIntent().getIntExtra("privacy_menu_enter_type", 0);
        contactsAuthorityManageOperateLogStruct.f55757h = selectPrivacyContactsFromRangeUI.getIntent().getIntExtra("privacy_select_chatroom_or_lebal_count", 0);
        contactsAuthorityManageOperateLogStruct.f55758i = (selectPrivacyContactsFromRangeUI.C.f427285n != null ? r1.getCount() : 0) - ((java.util.HashSet) selectPrivacyContactsFromRangeUI.P).size();
        contactsAuthorityManageOperateLogStruct.f55760k = ((java.util.LinkedList) selectPrivacyContactsFromRangeUI.C.f427289r).size();
        contactsAuthorityManageOperateLogStruct.f55759j = selectPrivacyContactsFromRangeUI.C.f427285n != null ? r7.getCount() : 0;
        contactsAuthorityManageOperateLogStruct.k();
        su4.k3.m(contactsAuthorityManageOperateLogStruct);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 != 1 || str == null) {
            return;
        }
        this.C.t(str);
        z7();
        this.C.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        return this.C;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return this.D;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return com.tencent.mm.sdk.platformtools.t8.K0(this.I) ? getString(com.tencent.mm.R.string.f489934fx) : this.I;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public android.app.Activity getActivity() {
        return this;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489359ca0;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        j75.f stateCenter;
        int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectPrivacyContactsFromRangeUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mm.ui.contact.item.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.tencent.mm.ui.contact.item.u) || p5(item)) {
            return;
        }
        java.lang.String str = item.f206850s;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPrivacyContactsFromRangeUI", "ClickUser=%s", str);
        if (this.V && (stateCenter = getStateCenter()) != null && ((uf5.l) stateCenter.getState()).f427266e) {
            this.C.t(str);
            stateCenter.B3(new uf5.c(str, ((java.util.LinkedList) this.C.f427289r).contains(str)));
            z7();
            return;
        }
        this.C.t(str);
        z7();
        if (b7() instanceof uf5.r1) {
            Y6();
            hideVKB();
        }
        if (this.U) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", str);
            intent.putExtra("Contact_Scene", 3);
            intent.putExtra("key_label_click_source", getIntent().getIntExtra("key_label_click_source", 0));
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 4);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            j45.l.j(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        boolean z17 = false;
        this.E = getIntent().getIntExtra("list_type", 0);
        this.F = getIntent().getStringExtra("filter_type");
        this.H = getIntent().getStringArrayExtra("already_select_contact");
        int intExtra = getIntent().getIntExtra("max_limit_num", 100);
        this.G = getIntent().getStringExtra("privacy_source_type");
        this.C = new uf5.q1(this, this, intExtra);
        boolean booleanExtra = getIntent().getBooleanExtra("only_show_contact", false);
        this.M = booleanExtra;
        this.C.f207078f = !booleanExtra;
        if (booleanExtra) {
            this.N = false;
        }
        if (!booleanExtra && ("@all.contact.android".equals(this.F) || "@all.contact.without.chatroom.without.openim".equals(this.F))) {
            com.tencent.mm.storage.e8 pj6 = com.tencent.mm.plugin.sns.model.l4.pj();
            java.lang.String[] strArr = this.H;
            if (strArr != null && strArr.length != 0) {
                int length = strArr.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        break;
                    }
                    if (((com.tencent.mm.storage.k4) pj6).n(strArr[i17], true).r2()) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
            }
            this.S = !z17;
        }
        uf5.r1 r1Var = new uf5.r1(this, this, this.C);
        this.D = r1Var;
        r1Var.f207078f = true;
        this.C.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean k7() {
        return this.N;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.List arrayList;
        super.onCreate(bundle);
        this.I = getIntent().getStringExtra("titile");
        this.U = getIntent().getBooleanExtra("can_go_to_profile", false);
        setMMTitle(g7());
        setBackBtn(new uf5.l1(this));
        if (!this.M) {
            addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490441v5), new uf5.n1(this), null, this.E == 16 ? com.tencent.mm.ui.fb.RED : com.tencent.mm.ui.fb.GREEN);
            enableOptionMenu(1, false);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("need_show_all_selected", false);
        this.T = booleanExtra;
        if (booleanExtra) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.bsd);
            this.f207121J = findViewById;
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.bsc);
            this.K = imageView;
            imageView.setVisibility(0);
            this.L = true;
            y7();
            this.f207121J.setOnClickListener(new uf5.o1(this));
            if (!this.S) {
                gm0.j1.i();
                android.database.Cursor U = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(this.H, "", this.F, "", new java.util.ArrayList());
                java.util.Set set = this.Q;
                if (U != null) {
                    U.moveToFirst();
                    while (!U.isAfterLast()) {
                        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                        z3Var.convertFrom(U);
                        if (x7(z3Var)) {
                            ((java.util.HashSet) this.P).add(z3Var.d1());
                        } else {
                            ((java.util.HashSet) set).add(z3Var.d1());
                        }
                        U.moveToNext();
                    }
                    U.close();
                }
                ((java.util.LinkedList) this.C.f427289r).addAll(set);
                z7();
            }
        } else {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.bsd);
            this.f207121J = findViewById2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int intExtra = getIntent().getIntExtra("last_page_source_type", 0);
        if (intExtra == 1) {
            b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 5L, 0L, 0L, 0L);
        }
        boolean z17 = this.M && intExtra == 1 && j62.e.g().c(new com.tencent.mm.repairer.config.friend.RepairerConfigBatchLabelEnable()) == 1;
        this.V = z17;
        if (z17) {
            j75.f stateCenter = getStateCenter();
            if (stateCenter != null) {
                uf5.l lVar = (uf5.l) stateCenter.getState();
                java.util.List list = this.C.f427289r;
                lVar.getClass();
                kotlin.jvm.internal.o.g(list, "<set-?>");
                lVar.f427268g = list;
                lVar.f427269h = this.H;
            }
            j75.f stateCenter2 = getStateCenter();
            if (stateCenter2 != null) {
                stateCenter2.m3(this, new e75.a() { // from class: uf5.k1$$a
                    @Override // e75.a
                    public final void onChanged(java.lang.Object obj) {
                        final uf5.l lVar2 = (uf5.l) obj;
                        int i17 = com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.W;
                        final com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI = com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.this;
                        selectPrivacyContactsFromRangeUI.getClass();
                        lVar2.b(uf5.x0.class, new j75.l() { // from class: uf5.k1$$b
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI2 = com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.this;
                                selectPrivacyContactsFromRangeUI2.M = false;
                                uf5.q1 q1Var = selectPrivacyContactsFromRangeUI2.C;
                                q1Var.f207078f = true;
                                q1Var.notifyDataSetChanged();
                                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) selectPrivacyContactsFromRangeUI2.f206446d.getLayoutParams();
                                layoutParams.addRule(2, com.tencent.mm.R.id.shf);
                                selectPrivacyContactsFromRangeUI2.f206446d.setLayoutParams(layoutParams);
                            }
                        });
                        lVar2.b(uf5.y0.class, new j75.l() { // from class: uf5.k1$$c
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI2 = com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.this;
                                selectPrivacyContactsFromRangeUI2.M = true;
                                ((java.util.LinkedList) selectPrivacyContactsFromRangeUI2.C.f427289r).clear();
                                uf5.q1 q1Var = selectPrivacyContactsFromRangeUI2.C;
                                q1Var.f207078f = false;
                                q1Var.notifyDataSetChanged();
                                selectPrivacyContactsFromRangeUI2.z7();
                                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) selectPrivacyContactsFromRangeUI2.f206446d.getLayoutParams();
                                layoutParams.addRule(2, com.tencent.mm.R.id.bsd);
                                selectPrivacyContactsFromRangeUI2.f206446d.setLayoutParams(layoutParams);
                            }
                        });
                        lVar2.b(uf5.c.class, new j75.l() { // from class: uf5.k1$$d
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                int i18 = com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.W;
                                com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.this.z7();
                            }
                        });
                        lVar2.b(uf5.d.class, new j75.l() { // from class: uf5.k1$$e
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI2 = com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.this;
                                selectPrivacyContactsFromRangeUI2.M = true;
                                ((java.util.LinkedList) selectPrivacyContactsFromRangeUI2.C.f427289r).clear();
                                uf5.q1 q1Var = selectPrivacyContactsFromRangeUI2.C;
                                q1Var.f207078f = false;
                                selectPrivacyContactsFromRangeUI2.H = lVar2.f427269h;
                                q1Var.s();
                                selectPrivacyContactsFromRangeUI2.z7();
                                java.lang.String[] strArr = selectPrivacyContactsFromRangeUI2.H;
                                if (strArr == null || strArr.length <= 0) {
                                    selectPrivacyContactsFromRangeUI2.setMMTitle(selectPrivacyContactsFromRangeUI2.g7());
                                } else {
                                    java.lang.String str = selectPrivacyContactsFromRangeUI2.I;
                                    if (str != null && str.contains("(")) {
                                        str = str.substring(0, str.lastIndexOf("("));
                                    }
                                    selectPrivacyContactsFromRangeUI2.setMMTitle(str + "(" + selectPrivacyContactsFromRangeUI2.H.length + ")");
                                }
                                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) selectPrivacyContactsFromRangeUI2.f206446d.getLayoutParams();
                                layoutParams.addRule(2, com.tencent.mm.R.id.bsd);
                                selectPrivacyContactsFromRangeUI2.f206446d.setLayoutParams(layoutParams);
                            }
                        });
                        lVar2.b(uf5.c2.class, new j75.l() { // from class: uf5.k1$$f
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                uf5.c2 c2Var = (uf5.c2) dVar;
                                int i18 = com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.W;
                                com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI2 = com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.this;
                                selectPrivacyContactsFromRangeUI2.getClass();
                                java.util.Iterator it = c2Var.f427208b.iterator();
                                while (it.hasNext()) {
                                    ((java.util.LinkedList) selectPrivacyContactsFromRangeUI2.C.f427289r).remove((java.lang.String) it.next());
                                }
                                for (java.lang.String str : c2Var.f427209c) {
                                    if (!((java.util.LinkedList) selectPrivacyContactsFromRangeUI2.C.f427289r).contains(str)) {
                                        ((java.util.LinkedList) selectPrivacyContactsFromRangeUI2.C.f427289r).add(str);
                                    }
                                }
                                selectPrivacyContactsFromRangeUI2.C.notifyDataSetChanged();
                                selectPrivacyContactsFromRangeUI2.z7();
                            }
                        });
                        lVar2.b(uf5.a.class, new j75.l() { // from class: uf5.k1$$g
                            @Override // j75.l
                            public final void a(j75.d dVar) {
                                com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI2 = com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.this;
                                ((java.util.LinkedList) selectPrivacyContactsFromRangeUI2.C.f427289r).remove(((uf5.a) dVar).f427196b);
                                selectPrivacyContactsFromRangeUI2.C.notifyDataSetChanged();
                            }
                        });
                    }
                });
            }
            uf5.x xVar = (uf5.x) pf5.z.f353948a.a(this).e(uf5.x.class);
            if (xVar != null) {
                java.lang.String batchSetText = getString(com.tencent.mm.R.string.p_x);
                kotlin.jvm.internal.o.g(batchSetText, "batchSetText");
                android.view.View findViewById3 = xVar.getActivity().findViewById(com.tencent.mm.R.id.shf);
                kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
                xVar.f427321d = findViewById3;
                android.view.View findViewById4 = xVar.getActivity().findViewById(com.tencent.mm.R.id.she);
                kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
                xVar.f427322e = (androidx.recyclerview.widget.RecyclerView) findViewById4;
                android.view.View findViewById5 = xVar.getActivity().findViewById(com.tencent.mm.R.id.shg);
                kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
                xVar.f427323f = (android.widget.ImageView) findViewById5;
                android.view.View findViewById6 = xVar.getActivity().findViewById(com.tencent.mm.R.id.shh);
                kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
                xVar.f427324g = (android.widget.Button) findViewById6;
                j75.f Q6 = xVar.Q6();
                uf5.l lVar2 = Q6 != null ? (uf5.l) Q6.getState() : null;
                if (lVar2 == null || (arrayList = lVar2.f427267f) == null) {
                    arrayList = new java.util.ArrayList();
                }
                uf5.u1 u1Var = new uf5.u1(arrayList, 4, new uf5.o(xVar));
                xVar.f427325h = u1Var;
                androidx.recyclerview.widget.RecyclerView recyclerView = xVar.f427322e;
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("batchAvatarRv");
                    throw null;
                }
                recyclerView.setAdapter(u1Var);
                androidx.recyclerview.widget.RecyclerView recyclerView2 = xVar.f427322e;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.o.o("batchAvatarRv");
                    throw null;
                }
                recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(xVar.getActivity(), 0, false));
                android.widget.Button button = xVar.f427324g;
                if (button == null) {
                    kotlin.jvm.internal.o.o("batchSetBtn");
                    throw null;
                }
                button.setText(xVar.getActivity().getString(com.tencent.mm.R.string.f493838pa4));
                android.widget.Button button2 = xVar.f427324g;
                if (button2 == null) {
                    kotlin.jvm.internal.o.o("batchSetBtn");
                    throw null;
                }
                button2.setEnabled(false);
                android.widget.Button button3 = xVar.f427324g;
                if (button3 == null) {
                    kotlin.jvm.internal.o.o("batchSetBtn");
                    throw null;
                }
                button3.setOnClickListener(new uf5.p(xVar));
                android.widget.ImageView imageView2 = xVar.f427323f;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("batchExpandIcon");
                    throw null;
                }
                imageView2.setOnClickListener(new uf5.q(xVar));
                xVar.f427326i = new uf5.k(xVar.getActivity(), new uf5.t(xVar), new uf5.u(xVar));
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = xVar.P6();
                if (P6 != null) {
                    P6.addTextOptionMenu(2, batchSetText, new uf5.n(xVar), null, com.tencent.mm.ui.fb.BLUE_TEXT_MEDIUM);
                }
                j75.f Q62 = xVar.Q6();
                if (Q62 != null) {
                    Q62.z3(xVar.getActivity(), uf5.s.f427295d);
                }
                j75.f Q63 = xVar.Q6();
                if (Q63 != null) {
                    Q63.L2(xVar.getActivity(), new uf5.r(xVar));
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.C.k();
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPrivacyContactsFromRangeUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.getType());
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        com.tencent.mm.storage.z3 z3Var;
        return (dVar instanceof com.tencent.mm.ui.contact.item.u) && (z3Var = ((com.tencent.mm.ui.contact.item.u) dVar).B) != null && this.E != 16 && x7(z3Var);
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(uf5.m.class);
        hashSet.add(uf5.x.class);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        if (!(dVar instanceof com.tencent.mm.ui.contact.item.u)) {
            return false;
        }
        return ((java.util.LinkedList) this.C.f427289r).contains(((com.tencent.mm.ui.contact.item.u) dVar).f206819z);
    }

    public final boolean x7(com.tencent.mm.storage.z3 z3Var) {
        if (z3Var == null) {
            return false;
        }
        boolean z17 = this.E != 16;
        if ("@sns.black.android".equals(this.G)) {
            if (!z17 || !z3Var.x2()) {
                return false;
            }
        } else if ("@sns.unlike.android".equals(this.G)) {
            if (!z17) {
                return false;
            }
            if (!((z3Var.getType() & 1048576) != 0)) {
                return false;
            }
        } else if ("@werun.black.android".equals(this.G)) {
            if (!z17) {
                return false;
            }
            if (!((z3Var.getType() & 524288) != 0)) {
                return false;
            }
        } else if ("@tophistory.black.android".equals(this.G)) {
            if (!z17) {
                return false;
            }
            if (!((z3Var.getType() & 131072) != 0)) {
                return false;
            }
        } else if ("@tophistory.unlike.android".equals(this.G)) {
            if (!z17) {
                return false;
            }
            if (!((z3Var.getType() & 262144) != 0)) {
                return false;
            }
        } else if ("@social.black.android".equals(this.G)) {
            if (!z17 || !z3Var.y2()) {
                return false;
            }
        } else if ("@finder.block.his.liked.android".equals(this.G)) {
            if (!z17) {
                return false;
            }
            if (!((z3Var.getType() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0)) {
                return false;
            }
        } else {
            if (!"@finder.block.my.liked.android".equals(this.G) || !z17) {
                return false;
            }
            if (!((z3Var.getType() & 134217728) != 0)) {
                return false;
            }
        }
        return true;
    }

    public final void y7() {
        if (this.L) {
            l02.n.a(this.K, "checkbox_cell_on");
        } else {
            l02.n.a(this.K, "checkbox_cell_off");
        }
    }

    public final void z7() {
        if (this.M) {
            return;
        }
        if (((java.util.LinkedList) this.C.f427289r).size() > 0) {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5) + "(" + ((java.util.LinkedList) this.C.f427289r).size() + ")");
            enableOptionMenu(1, true);
        } else {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5));
            enableOptionMenu(1, false);
        }
        if (this.T) {
            int size = ((java.util.LinkedList) this.C.f427289r).size();
            android.database.Cursor cursor = this.C.f427285n;
            if (size == (cursor != null ? cursor.getCount() : 0)) {
                if (this.L) {
                    return;
                }
                this.L = true;
                y7();
                return;
            }
            if (this.L) {
                this.L = false;
                y7();
            }
        }
    }
}
