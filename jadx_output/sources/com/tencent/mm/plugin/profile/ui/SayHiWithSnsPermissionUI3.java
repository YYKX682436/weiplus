package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes11.dex */
public class SayHiWithSnsPermissionUI3 extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, com.tencent.mm.ui.tools.c5 {
    public static final /* synthetic */ int R1 = 0;
    public boolean A;
    public boolean C;
    public android.view.View N1;
    public com.tencent.mm.ui.base.MMLimitedClearEditText O1;
    public com.tencent.mm.ui.tools.f5 P;
    public java.lang.String P1;
    public android.view.View Q1;
    public com.tencent.mm.plugin.profile.ui.widget.SayHiItemView R;
    public com.tencent.mm.plugin.profile.ui.widget.SayHiItemView S;
    public android.widget.Button T;
    public java.lang.Boolean U;
    public java.lang.String Y;
    public java.lang.String Z;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f153842d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153843e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f153844f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f153845g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f153846h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f153847i;

    /* renamed from: l1, reason: collision with root package name */
    public int f153848l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f153849m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f153850n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f153851o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f153852p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f153855q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f153856r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f153857s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f153859u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f153860v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f153861w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f153862x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f153863x0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f153865y;

    /* renamed from: y0, reason: collision with root package name */
    public int f153866y0;

    /* renamed from: z, reason: collision with root package name */
    public int f153868z;

    /* renamed from: t, reason: collision with root package name */
    public android.app.ProgressDialog f153858t = null;
    public boolean B = false;
    public final int[] D = new int[8];
    public final int[] E = new int[6];
    public int[] F = new int[3];
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f153841J = false;
    public boolean K = false;
    public java.util.List L = new java.util.ArrayList();
    public java.util.ArrayList M = new java.util.ArrayList();
    public final java.util.ArrayList N = new java.util.ArrayList();
    public final java.util.ArrayList Q = new java.util.ArrayList();
    public boolean V = false;
    public boolean W = false;
    public boolean X = false;

    /* renamed from: p0, reason: collision with root package name */
    public int f153853p0 = 0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f153854p1 = "";

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f153864x1 = "";

    /* renamed from: y1, reason: collision with root package name */
    public java.util.List f153867y1 = new java.util.ArrayList();

    /* renamed from: z1, reason: collision with root package name */
    public final java.util.HashSet f153869z1 = new java.util.HashSet();
    public final java.util.HashSet A1 = new java.util.HashSet();
    public final java.util.HashSet B1 = new java.util.HashSet();
    public final java.util.HashSet C1 = new java.util.HashSet();
    public boolean D1 = false;
    public java.lang.CharSequence E1 = null;
    public final boolean[] F1 = {true};
    public final boolean[] G1 = {false};
    public final android.text.TextWatcher H1 = new hr3.kh(this);
    public final long I1 = java.lang.System.currentTimeMillis();
    public int J1 = 0;
    public int K1 = 0;
    public int L1 = 0;
    public com.tencent.mm.ui.widget.dialog.j0 M1 = null;

    public final void T6(java.util.List list) {
        com.tencent.mm.storage.p7 b17 = r21.w.Ai().b1(this.f153860v);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f153860v, true);
        if (list == null || !list.contains(this.f153860v)) {
            return;
        }
        boolean z17 = !n17.r2();
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "buildContact userName:%s contact.getContactID():%s type:%s isNewContact:%s", this.f153860v, java.lang.Integer.valueOf((int) n17.E2), java.lang.Integer.valueOf(n17.getType()), java.lang.Boolean.valueOf(z17));
        if (((int) n17.E2) == 0) {
            n17 = y35.r.f(b17);
            n17.X1(this.f153860v);
            if (!(((com.tencent.mm.storage.k4) c01.d9.b().q()).i0(n17) > 0)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SayHiWithSnsPermissionUI3", "canAddContact fail, insert fail");
                return;
            }
        }
        c01.e2.m0(n17);
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).g();
        r21.w.wi().k1(this.f153860v, 1);
        if (z17) {
            y35.r.l(this.f153860v, this.f153868z, "sayhiui1");
        }
    }

    public void U6() {
        this.T.setEnabled(false);
        this.T.setTextColor(getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        this.T.setBackground(getDrawable(com.tencent.mm.R.drawable.f481068jy));
    }

    public void V6() {
        this.T.setEnabled(true);
        this.T.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478838io));
        this.T.setBackground(getDrawable(com.tencent.mm.R.drawable.f481057jk));
    }

    public final boolean W6(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList.addAll(list);
        arrayList2.addAll(list2);
        java.util.Collections.sort(arrayList);
        java.util.Collections.sort(arrayList2);
        return !arrayList.equals(arrayList2);
    }

    public final void X6() {
        if (this.A) {
            java.lang.String trim = this.f153842d.getText().toString().trim();
            if (com.tencent.mm.sdk.platformtools.t8.K0(trim) || trim.equals(this.E1) || !com.tencent.mm.sdk.platformtools.t8.K0(this.f153859u)) {
                c01.d9.b().p().w(294913, "");
            } else {
                c01.d9.b().p().w(294913, trim);
            }
        }
    }

    public final void Y6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "dismissTipDialog");
        android.app.ProgressDialog progressDialog = this.f153858t;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f153858t = null;
        }
    }

    public void Z6(long j17) {
        if (j17 == 1) {
            ((gc0.p2) pf5.z.f353948a.a(this).a(gc0.p2.class)).f270248m.b(a7(), ((hr3.ld) pf5.z.f353948a.a(this).a(hr3.ld.class)).Q6(), null, this.f153846h);
            ((hr3.w1) component(hr3.w1.class)).O6();
        }
        ((ku5.t0) ku5.t0.f312615d).g(new hr3.wh(this, j17));
    }

    public final java.lang.String a7() {
        java.lang.String charSequence = this.f153846h.getText() != null ? this.f153846h.getText().toString() : "";
        return (com.tencent.mm.sdk.platformtools.t8.K0(charSequence) || charSequence.length() <= 50) ? charSequence : charSequence.substring(0, 50);
    }

    public final java.lang.String b7() {
        java.lang.String trim = this.f153842d.getText().toString().trim();
        return com.tencent.mm.ui.tools.v4.e(this.f153842d.getText().toString(), com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2) <= 100 ? trim : trim.substring(0, 100);
    }

    public final java.util.ArrayList c7() {
        com.tencent.mm.storage.ya z07;
        if (this.M == null) {
            return null;
        }
        com.tencent.mm.storage.ya z08 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(this.f153860v);
        java.lang.String str = z08 != null ? z08.field_contactLabels : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f153860v, true);
            if (n17 != null) {
                java.lang.String J0 = n17.J0();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(J0) && (z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(J0)) != null) {
                    str = z07.field_contactLabels;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mm.storage.ya z09 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(n17.d1());
                    if (z09 != null) {
                        str = z09.field_contactLabels;
                    }
                }
            }
        }
        return (java.util.ArrayList) ((b93.b) c93.a.a()).f(str);
    }

    public void d7(boolean z17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.class);
        intent.putExtras(getIntent().getExtras());
        intent.putExtra("Contact_IsForceVerifyFriend", true);
        int i17 = g7() ? 8 : 1;
        if (z17) {
            if (str != null && !str.isEmpty()) {
                intent.putExtra("AntispamTicket", str);
            }
            intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        }
        intent.putExtra("Contact_default_permission", i17);
        intent.putExtra("Contact_RemarkName", a7());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPageWithoutDialog", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPageWithoutDialog", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final boolean e7() {
        this.E[0] = 1;
        com.tencent.mm.storage.p7 b17 = r21.w.Ai().b1(this.f153860v);
        if (b17 != null) {
            y35.r c17 = y35.r.c(this, b17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c17.f459233b) && !c17.f459233b.equals(getString(com.tencent.mm.R.string.fbh))) {
                this.f153864x1 = c17.f459233b;
            }
        }
        if (((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(1)) {
            java.lang.String str = this.f153860v;
            ((gc0.p2) pf5.z.f353948a.a(this).a(gc0.p2.class)).V6(new gc0.b0(str, this.f153862x), new yz5.a() { // from class: hr3.hh$$i
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this.f153846h.getEditText();
                }
            }, new yz5.a() { // from class: hr3.hh$$j
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i17 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.R1;
                    com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this;
                    sayHiWithSnsPermissionUI3.getClass();
                    return ((hr3.ld) pf5.z.f353948a.a(sayHiWithSnsPermissionUI3).a(hr3.ld.class)).Q6();
                }
            }, new yz5.a() { // from class: hr3.hh$$k
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i17 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.R1;
                    com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this;
                    sayHiWithSnsPermissionUI3.getClass();
                    if (((hr3.ld) pf5.z.f353948a.a(sayHiWithSnsPermissionUI3).a(hr3.ld.class)).f283766d != null) {
                        return java.lang.Boolean.valueOf(!r0.f());
                    }
                    kotlin.jvm.internal.o.o("editPhoneNumberView");
                    throw null;
                }
            }, new yz5.l() { // from class: hr3.hh$$l
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    int i17 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.R1;
                    com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this;
                    sayHiWithSnsPermissionUI3.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "onclick AddPhone");
                    return java.lang.Boolean.valueOf(((hr3.ld) pf5.z.f353948a.a(sayHiWithSnsPermissionUI3).a(hr3.ld.class)).O6((java.lang.String) obj));
                }
            }, null, new yz5.a() { // from class: hr3.hh$$e
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(sayHiWithSnsPermissionUI3.f153864x1)) {
                        return null;
                    }
                    sayHiWithSnsPermissionUI3.h7(sayHiWithSnsPermissionUI3.f153864x1);
                    return null;
                }
            });
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f153864x1)) {
            h7(this.f153864x1);
        }
        this.D[3] = 3;
        this.B = true;
        return true;
    }

    public final boolean f7() {
        return ((java.lang.Boolean) this.f153856r.getTag()).booleanValue();
    }

    public final boolean g7() {
        return ((java.lang.Boolean) this.f153855q.getTag()).booleanValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.chm;
    }

    public final void h7(java.lang.String str) {
        android.view.View view = this.f153847i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "setRecomRemarkTipSelect", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "setRecomRemarkTipSelect", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f153849m;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String string = getString(com.tencent.mm.R.string.bh9, str);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        float textSize = this.f153849m.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string, textSize));
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(getString(com.tencent.mm.R.string.la7));
        f0Var.c(new hr3.mi(this, str), 0, f0Var.length(), 17);
        this.f153849m.append(" ");
        this.f153849m.append(f0Var);
        this.f153849m.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public final void i7() {
        java.lang.String str;
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView O6 = ((bs3.l) pf5.z.f353948a.a(this).a(bs3.l.class)).O6();
        boolean z17 = (O6 != null ? O6.getContent() : null) != null;
        int[] iArr = this.E;
        if (z17) {
            iArr[5] = 1;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f153860v, true);
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(this.f153860v);
        if (z07 == null || (str = z07.field_conDescription) == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && n17 != null) {
            str = n17.f236589y1;
        }
        if (this.S != null) {
            iArr[4] = com.tencent.mm.ui.tools.v4.g(str);
            this.S.setContent(str);
        }
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet(super.importUIComponents());
        hashSet.add(ir3.f.class);
        hashSet.add(hr3.ld.class);
        hashSet.add(gc0.p2.class);
        hashSet.add(hr3.pf.class);
        hashSet.add(bs3.l.class);
        hashSet.add(j93.n.class);
        hashSet.add(hr3.gg.class);
        hashSet.add(hr3.w1.class);
        hashSet.add(gc0.b.class);
        return hashSet;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        r61.a h17;
        android.text.SpannableString spannableString;
        com.tencent.mm.storage.z3 n17;
        boolean z17 = false;
        this.A = getIntent().getBooleanExtra("sayhi_with_sns_perm_send_verify", false);
        this.C = getIntent().getBooleanExtra("sayhi_with_sns_perm_add_remark", false);
        this.f153860v = getIntent().getStringExtra("Contact_User");
        this.f153868z = getIntent().getIntExtra("Contact_Scene", 9);
        this.f153859u = getIntent().getStringExtra("room_name");
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_RemarkName");
        this.f153865y = stringExtra;
        this.Z = stringExtra;
        this.f153862x = getIntent().getStringExtra("Contact_Nick");
        this.f153861w = getIntent().getStringExtra("Contact_RoomNickname");
        this.f153847i = findViewById(com.tencent.mm.R.id.jp7);
        this.f153849m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jp8);
        this.T = (android.widget.Button) findViewById(com.tencent.mm.R.id.g68);
        boolean z18 = com.tencent.mm.plugin.profile.s1.d(this.f153860v) && !getIntent().getBooleanExtra("Contact_IsForceVerifyFriend", false);
        this.V = z18;
        this.W = !z18 && this.A;
        this.S = (com.tencent.mm.plugin.profile.ui.widget.SayHiItemView) findViewById(com.tencent.mm.R.id.v08);
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView sayHiItemView = (com.tencent.mm.plugin.profile.ui.widget.SayHiItemView) findViewById(com.tencent.mm.R.id.v0c);
        this.R = sayHiItemView;
        if (sayHiItemView != null) {
            sayHiItemView.getUi().c().setId(com.tencent.mm.R.id.u8m);
            if (com.tencent.mm.storage.z3.m4(this.f153860v)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "initLabelPanelAll, isOpenIM, userName: %s.", this.f153860v);
                this.R.setVisibility(8);
                com.tencent.mm.plugin.profile.ui.widget.SayHiItemView sayHiItemView2 = this.S;
                if (sayHiItemView2 != null) {
                    sayHiItemView2.setVisibility(8);
                }
            } else {
                this.R.setOnClickListener(new android.view.View.OnClickListener() { // from class: hr3.hh$$f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i17 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.R1;
                        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this;
                        sayHiWithSnsPermissionUI3.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", sayHiWithSnsPermissionUI3, array);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "cpan[All startContactLabelUI].");
                        android.content.Intent intent = new android.content.Intent();
                        java.util.ArrayList<java.lang.String> arrayList2 = sayHiWithSnsPermissionUI3.M;
                        if (arrayList2 != null) {
                            intent.putStringArrayListExtra("label_str_list", arrayList2);
                        }
                        sayHiWithSnsPermissionUI3.f153863x0 = true;
                        intent.putExtra("save_label_to_contact_on_prepage", false);
                        intent.putExtra("label_username", sayHiWithSnsPermissionUI3.f153860v);
                        intent.putExtra("is_stranger", true);
                        ((j93.n) sayHiWithSnsPermissionUI3.component(j93.n.class)).V6(600, intent, false, sayHiWithSnsPermissionUI3.M);
                        yj0.a.h(sayHiWithSnsPermissionUI3, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                this.S.setOnClickListener(new android.view.View.OnClickListener() { // from class: hr3.hh$$g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i17 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.R1;
                        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this;
                        sayHiWithSnsPermissionUI3.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", sayHiWithSnsPermissionUI3, array);
                        android.content.Intent intent = new android.content.Intent();
                        intent.setClass(sayHiWithSnsPermissionUI3.getContext(), com.tencent.mm.plugin.profile.ui.AddDescriptionUI.class);
                        intent.putExtra("Contact_User", sayHiWithSnsPermissionUI3.f153860v);
                        intent.putExtra("key_intent_assemble_ui_half_screen_title", sayHiWithSnsPermissionUI3.getString(com.tencent.mm.R.string.o_k));
                        kr3.s1.f311475a.a(intent, sayHiWithSnsPermissionUI3, sayHiWithSnsPermissionUI3.f153860v, com.tencent.mm.plugin.profile.ui.mod.components.h.class, 100, false);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("note_sid", (java.lang.String) ((jz5.n) ((hr3.w1) sayHiWithSnsPermissionUI3.component(hr3.w1.class)).f284130e).getValue());
                        hashMap.put("add_username", sayHiWithSnsPermissionUI3.f153860v);
                        hashMap.put("view_id", "add_describe_float");
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 33926);
                        yj0.a.h(sayHiWithSnsPermissionUI3, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                this.L = b93.r.wi().k1();
                java.util.ArrayList c76 = c7();
                if (c76 != null) {
                    this.M.addAll(c76);
                    java.util.ArrayList arrayList = this.N;
                    java.util.ArrayList arrayList2 = this.M;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    if (arrayList2 != null) {
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(b93.r.wi().p1((java.lang.String) it.next()));
                        }
                    }
                    arrayList.addAll(arrayList3);
                }
                java.util.List list = this.L;
                if (list != null) {
                    this.f153866y0 = list.size();
                }
                if (c76 != null) {
                    this.f153848l1 = c76.size();
                    this.f153867y1.addAll(c76);
                }
                j7(c76);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "isCurrentHappenChatting = " + this.V);
        boolean z19 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMSocialBlackListFlag", 1) == 1;
        this.G = z19;
        if (!z19) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.nxt);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        gm0.j1.i();
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f153860v, true);
        this.I = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0) == 1;
        this.f153851o = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.kdq).findViewById(com.tencent.mm.R.id.kdu);
        getIntent().getBooleanExtra("sayhi_with_sns_permission", false);
        this.f153851o.setCheck(n18.x2());
        this.f153855q = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nxq);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.n_y);
        this.f153856r = imageView;
        imageView.setVisibility(0);
        this.f153855q.setVisibility(0);
        l02.n.a(this.f153856r, "checkbox_cell_off");
        l02.n.a(this.f153855q, "checkbox_cell_off");
        android.widget.ImageView imageView2 = this.f153856r;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        imageView2.setTag(bool);
        this.f153855q.setTag(bool);
        this.f153857s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nxr);
        this.f153852p = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.n6q).findViewById(com.tencent.mm.R.id.f486159ke3);
        this.f153852p.setCheck(((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).P0(this.f153860v, 5L));
        pf5.z zVar = pf5.z.f353948a;
        ((hr3.ld) zVar.a(this).a(hr3.ld.class)).S6();
        findViewById(com.tencent.mm.R.id.f483430at4).setOnClickListener(new hr3.qh(this));
        i7();
        int i17 = n18.I;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kdv);
        if (i17 == 1) {
            textView.setText(com.tencent.mm.R.string.jdc);
        } else if (i17 == 2) {
            textView.setText(com.tencent.mm.R.string.jdb);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486160ke4);
        if (i17 == 1) {
            textView2.setText(com.tencent.mm.R.string.j9h);
        } else if (i17 == 2) {
            textView2.setText(com.tencent.mm.R.string.j9g);
        }
        boolean m47 = com.tencent.mm.storage.z3.m4(this.f153860v);
        this.K = m47;
        if (m47) {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.nxt);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.kds);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            ((android.view.View) this.f153855q.getParent()).setOnClickListener(new hr3.xh(this));
            ((android.view.View) this.f153856r.getParent()).setOnClickListener(this.H ? null : new hr3.yh(this));
            int intExtra = getIntent().getIntExtra("Contact_default_permission", -1);
            if (intExtra > 0) {
                if ((intExtra & 8) == 8) {
                    this.U = bool;
                    k7(false);
                } else {
                    this.U = java.lang.Boolean.TRUE;
                    k7(true);
                }
            }
        }
        if (this.K) {
            this.f153852p.setCheck(true);
        }
        if (this.A) {
            this.f153842d = (com.tencent.mm.ui.base.MMLimitedClearEditText) findViewById(com.tencent.mm.R.id.m9y);
            this.f153844f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mnm);
            this.f153845g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c8o);
            if (this.W) {
                ((hr3.pf) component(hr3.pf.class)).V6(new yz5.a() { // from class: hr3.hh$$h
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this.f153841J = true;
                        return null;
                    }
                });
            }
            java.lang.String l17 = c01.z1.l();
            java.lang.String string = getString(com.tencent.mm.R.string.iih);
            if (string.length() + l17.length() > 50) {
                l17 = l17.substring(0, 50 - string.length());
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f153859u) || (n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f153859u, true)) == null || com.tencent.mm.sdk.platformtools.t8.K0(n17.P0())) {
                spannableString = null;
            } else {
                java.lang.String z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f153859u).z0(c01.z1.r());
                if (com.tencent.mm.sdk.platformtools.t8.J0(z07)) {
                    z07 = l17;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "chatroomName:%s nick:%s", this.f153859u, n17.P0());
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context = getContext();
                java.lang.String string2 = getResources().getString(com.tencent.mm.R.string.iii, n17.P0(), z07);
                float textSize = this.f153842d.getTextSize();
                ((ke0.e) xVar).getClass();
                spannableString = com.tencent.mm.pluginsdk.ui.span.c0.j(context, string2, textSize);
                this.E1 = spannableString;
            }
            if (com.tencent.mm.sdk.platformtools.t8.J0(this.E1)) {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                java.lang.String format = java.lang.String.format(string, l17);
                float textSize2 = this.f153842d.getTextSize();
                ((ke0.e) xVar2).getClass();
                this.E1 = com.tencent.mm.pluginsdk.ui.span.c0.j(context2, format, textSize2);
            }
            if (com.tencent.mm.sdk.platformtools.t8.J0(spannableString)) {
                this.f153842d.setText(this.E1);
            } else {
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context3 = getContext();
                float textSize3 = this.f153842d.getTextSize();
                ((ke0.e) xVar3).getClass();
                this.f153842d.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, spannableString, textSize3));
            }
            this.f153843e = this.f153842d.getText().toString();
            this.f153842d.b(new hr3.zh(this));
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f153842d;
        if (mMLimitedClearEditText == null || !(mMLimitedClearEditText.getParent() instanceof android.widget.LinearLayout)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "updateSayHiContextVisiable");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "updateSayHiContextVisiable, needVerify = %s, sayHiContent= %s, isNeedSendSayHiContext= %s.", java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.V), java.lang.Boolean.valueOf(this.W));
            if (this.W) {
                ((android.widget.LinearLayout) this.f153842d.getParent()).setVisibility(0);
            } else {
                ((android.widget.LinearLayout) this.f153842d.getParent()).setVisibility(8);
            }
        }
        if (this.C) {
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText2 = (com.tencent.mm.ui.base.MMLimitedClearEditText) findViewById(com.tencent.mm.R.id.m_1);
            this.f153846h = mMLimitedClearEditText2;
            ((android.widget.LinearLayout) mMLimitedClearEditText2.getParent()).setVisibility(0);
            this.f153850n = findViewById(com.tencent.mm.R.id.uya);
            this.f153846h.b(this.H1);
            if (!this.A) {
                this.f153846h.clearFocus();
            }
            if (this.A) {
                setMMTitle(com.tencent.mm.R.string.hny);
            } else {
                setMMTitle(com.tencent.mm.R.string.hnq);
                this.D[0] = 1;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f153865y)) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f153862x)) {
                    if (com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname.p()) {
                        this.f153846h.setHint(getString(com.tencent.mm.R.string.f492551gy1));
                        this.f153846h.setHintToText(false);
                    } else {
                        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText3 = this.f153846h;
                        le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                        androidx.appcompat.app.AppCompatActivity context4 = getContext();
                        java.lang.String str = this.f153862x;
                        float textSize4 = this.f153846h.getTextSize();
                        ((ke0.e) xVar4).getClass();
                        mMLimitedClearEditText3.setHint(com.tencent.mm.pluginsdk.ui.span.c0.j(context4, str, textSize4));
                    }
                    this.f153846h.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: hr3.hh$$d
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(android.view.View view, boolean z27) {
                            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this;
                            if (z27) {
                                sayHiWithSnsPermissionUI3.X = true;
                            } else {
                                int i18 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.R1;
                                sayHiWithSnsPermissionUI3.getClass();
                            }
                        }
                    });
                }
                switch (this.f153868z) {
                    case 8:
                    case 14:
                        if (!com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname.p() && !com.tencent.mm.sdk.platformtools.t8.K0(this.f153861w) && !this.f153861w.equals(this.f153846h.getText().toString())) {
                            this.E[0] = 2;
                            android.view.View view = this.f153847i;
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            arrayList7.add(0);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(view, arrayList7.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initChatroomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initChatroomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.widget.TextView textView3 = this.f153849m;
                            le0.x xVar5 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String string3 = getString(com.tencent.mm.R.string.bh6, this.f153861w);
                            java.lang.String str2 = string3 != null ? string3 : "";
                            float textSize5 = this.f153849m.getTextSize();
                            ((ke0.e) xVar5).getClass();
                            textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str2, textSize5));
                            com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(getString(com.tencent.mm.R.string.la6));
                            f0Var.c(new hr3.mi(this, this.f153861w), 0, f0Var.length(), 17);
                            this.f153849m.append(" ");
                            this.f153849m.append(f0Var);
                            this.f153849m.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                            this.D[3] = 2;
                            z17 = true;
                            break;
                        }
                        break;
                    case 10:
                    case 11:
                    case 13:
                        if (!com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname.p() && (h17 = m61.k.wi().h(this.f153860v)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.h()) && !h17.h().equals(this.f153846h.getText().toString())) {
                            android.view.View view2 = this.f153847i;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                            arrayList8.add(0);
                            java.util.Collections.reverse(arrayList8);
                            yj0.a.d(view2, arrayList8.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.widget.TextView textView4 = this.f153849m;
                            le0.x xVar6 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String string4 = getString(com.tencent.mm.R.string.bh7, h17.h());
                            if (string4 == null) {
                                string4 = "";
                            }
                            float textSize6 = this.f153849m.getTextSize();
                            ((ke0.e) xVar6).getClass();
                            textView4.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string4, textSize6));
                            com.tencent.mm.pluginsdk.ui.span.f0 f0Var2 = new com.tencent.mm.pluginsdk.ui.span.f0(getString(com.tencent.mm.R.string.la6));
                            f0Var2.c(new hr3.mi(this, h17.h()), 0, f0Var2.length(), 17);
                            this.f153849m.append(" ");
                            this.f153849m.append(f0Var2);
                            this.f153849m.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                            this.D[3] = 1;
                            java.lang.String f17 = h17.f();
                            if (f17 == null) {
                                f17 = "";
                            }
                            this.f153854p1 = f17.replace(" ", "");
                            z17 = true;
                            break;
                        }
                        break;
                }
                if ((com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname.p() || !this.A) && !z17) {
                    e7();
                }
            } else {
                com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText4 = this.f153846h;
                le0.x xVar7 = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context5 = getContext();
                java.lang.String str3 = this.f153865y;
                float textSize7 = this.f153846h.getTextSize();
                ((ke0.e) xVar7).getClass();
                mMLimitedClearEditText4.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context5, str3, textSize7));
                this.D[6] = 1;
                if (!this.A && ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(1)) {
                    e7();
                }
            }
            if (this.f153846h.getHint() != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f153846h.getHint().toString())) {
                this.Y = this.f153846h.getHint().toString();
            }
            if (this.f153846h.getText() != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f153846h.getText().toString())) {
                this.Y = this.f153846h.getText().toString();
            }
        }
        if (!this.K && !this.A && ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(1)) {
            ((hr3.ld) zVar.a(this).a(hr3.ld.class)).T6(this.f153860v, this.f153854p1);
        }
        java.lang.String string5 = getString(com.tencent.mm.R.string.f490551ya);
        if (!this.A) {
            string5 = getString(com.tencent.mm.R.string.f490441v5);
        }
        if (this.V) {
            string5 = getString(com.tencent.mm.R.string.f490441v5);
        }
        java.lang.String a17 = fo3.l.a(3);
        this.T.setText(string5);
        this.T.setOnClickListener(new hr3.ai(this, a17));
        this.T.setOnTouchListener(new hr3.di(this, a17));
        setBackBtn(new hr3.ei(this));
        U6();
        if (!this.G) {
            V6();
        }
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this);
        this.P = f5Var;
        f5Var.f210400e = this;
        if (this.V) {
            setMMTitle(com.tencent.mm.R.string.hnr);
        }
        int intExtra2 = getIntent().getIntExtra("Contact_default_permission", -1);
        if (!this.K && intExtra2 > 0) {
            V6();
        }
        l7();
        if (this.f153846h.c()) {
            U6();
        } else {
            V6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean isHideVKBWhenScroll() {
        return true;
    }

    public final void j7(java.util.List list) {
        java.util.ArrayList arrayList = (java.util.ArrayList) ((j93.n) component(j93.n.class)).W6(list);
        if (arrayList.isEmpty()) {
            this.R.setContent("");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (i17 < arrayList.size()) {
            sb6.append((java.lang.String) arrayList.get(i17));
            sb6.append(i17 < arrayList.size() + (-1) ? "，" : "");
            i17++;
        }
        this.R.setContent(sb6.toString());
    }

    public final void k7(boolean z17) {
        this.f153856r.setVisibility(0);
        this.f153855q.setVisibility(0);
        if (z17) {
            l02.n.a(this.f153856r, "checkbox_cell_on");
            l02.n.a(this.f153855q, "checkbox_cell_off");
            this.f153856r.setTag(java.lang.Boolean.TRUE);
            this.f153855q.setTag(java.lang.Boolean.FALSE);
            return;
        }
        l02.n.a(this.f153856r, "checkbox_cell_off");
        l02.n.a(this.f153855q, "checkbox_cell_on");
        this.f153856r.setTag(java.lang.Boolean.FALSE);
        this.f153855q.setTag(java.lang.Boolean.TRUE);
    }

    public final void l7() {
        android.widget.ImageView imageView = this.f153856r;
        if (imageView != null) {
            imageView.setContentDescription(!f7() ? getResources().getString(com.tencent.mm.R.string.i8m) : getResources().getString(com.tencent.mm.R.string.i8l));
        }
        android.widget.ImageView imageView2 = this.f153855q;
        if (imageView2 != null) {
            imageView2.setContentDescription(!g7() ? getResources().getString(com.tencent.mm.R.string.i8m) : getResources().getString(com.tencent.mm.R.string.i8l));
        }
    }

    public final void m7() {
        android.content.res.Resources resources;
        int i17;
        this.U = java.lang.Boolean.valueOf((this.I || this.H) ? false : true);
        this.f153855q.setVisibility(0);
        this.f153856r.setVisibility(0);
        k7(this.U.booleanValue());
        ((android.view.View) this.f153855q.getParent()).setOnClickListener(new hr3.lh(this));
        ((android.view.View) this.f153856r.getParent()).setOnClickListener(this.H ? null : new hr3.mh(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kds);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487037na3);
        if (this.H) {
            resources = getResources();
            i17 = com.tencent.mm.R.color.f479232tk;
        } else {
            resources = getResources();
            i17 = com.tencent.mm.R.color.a0c;
        }
        textView.setTextColor(resources.getColor(i17));
        if (this.H) {
            this.f153857s.setVisibility(0);
        }
        this.I = false;
    }

    public final void n7(java.lang.String str, int i17, long j17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = new com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent();
        am.oo ooVar = postSnsTagMemberOptionEvent.f54621g;
        ooVar.f7570e = linkedList;
        ooVar.f7566a = i17;
        ooVar.f7567b = j17;
        postSnsTagMemberOptionEvent.e();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 100) {
            if (intent != null && intent.hasExtra("Contact_get_desc_report_data")) {
                this.F = intent.getIntArrayExtra("Contact_get_desc_report_data");
            }
            i7();
            return;
        }
        if (i18 == -1 && intent != null && i17 == 600) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("result_label_id_list");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>();
            }
            ((j93.n) component(j93.n.class)).O6(stringArrayListExtra, intent.getIntExtra("recommend_label_adopt_count", 0));
            java.util.List<java.lang.String> c17 = ((b93.b) c93.a.a()).c();
            if (W6(stringArrayListExtra, this.M) || W6(c17, this.L)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "cpan[All onActivityResult], labelLists: %s", stringArrayListExtra);
                if (c17 == null) {
                    c17 = new java.util.ArrayList();
                }
                if (this.L == null) {
                    this.L = new java.util.ArrayList();
                }
                for (java.lang.String str : c17) {
                    if (!this.L.contains(str)) {
                        java.util.ArrayList arrayList = this.Q;
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    }
                }
                this.L = c17;
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    if (this.L.contains(next)) {
                        this.L.remove(next);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.addAll(this.L);
                this.L.clear();
                this.L.addAll(stringArrayListExtra);
                this.L.addAll(arrayList2);
                this.M.clear();
                this.M.addAll(stringArrayListExtra);
                java.util.ArrayList arrayList3 = this.N;
                arrayList3.clear();
                java.util.ArrayList arrayList4 = this.M;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                if (arrayList4 != null) {
                    java.util.Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(b93.r.wi().p1((java.lang.String) it6.next()));
                    }
                }
                arrayList3.addAll(arrayList5);
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("contact_search_label_new_list");
                if (stringArrayListExtra2 != null) {
                    this.f153869z1.addAll(stringArrayListExtra2);
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_search_label_add_list");
                if (stringArrayListExtra3 != null) {
                    this.A1.addAll(stringArrayListExtra3);
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_select_label_add_list");
                if (stringArrayListExtra4 != null) {
                    this.C1.addAll(stringArrayListExtra4);
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra5 = intent.getStringArrayListExtra("contact_select_label_new_list");
                if (stringArrayListExtra5 != null) {
                    this.B1.addAll(stringArrayListExtra5);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "cpan[All onActivityResult], labelLists: %s, mCurrentSelectLabelStrList: %s,mAllCanShowLabelStrList:%s.", stringArrayListExtra, this.M, this.L);
                j7(this.M);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        gc0.p2 p2Var = (gc0.p2) component(gc0.p2.class);
        p2Var.f270247i = true;
        p2Var.f270248m.f270145d = true;
        initView();
        gm0.j1.i();
        gr3.k.f274889a.a("page_in", this.f153859u, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f153860v, true), 50101);
        c01.d9.e().a(30, this);
        c01.d9.e().a(243, this);
        c01.d9.e().a(td1.h.CTRL_INDEX, this);
        ((j93.n) component(j93.n.class)).S6(this.f153860v, true, this.R.getUi().c(), new yz5.a() { // from class: hr3.hh$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                int i17 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.R1;
                com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.this;
                sayHiWithSnsPermissionUI3.j7(sayHiWithSnsPermissionUI3.c7());
                return null;
            }
        });
        if (getIntent().getBooleanExtra("sayhi_with_sns_perm_send_verify", false)) {
            ((hr3.w1) component(hr3.w1.class)).P6(iy1.c.WeChatFriendRequestPage);
        } else {
            ((hr3.w1) component(hr3.w1.class)).P6(iy1.c.WeChatFriendVerificationProcessPge);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(30, this);
        c01.d9.e().q(243, this);
        c01.d9.e().q(td1.h.CTRL_INDEX, this);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int[] iArr = this.D;
        g0Var.d(14036, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(iArr[2]), java.lang.Integer.valueOf(iArr[3]), java.lang.Integer.valueOf(iArr[4]), java.lang.Integer.valueOf(iArr[5]), java.lang.Integer.valueOf(iArr[6]), java.lang.Integer.valueOf(iArr[7]), this.f153860v);
        super.onDestroy();
        removeAllOptionMenu();
        fo3.s.INSTANCE.E7("ie_ver_usr");
        com.tencent.mm.ui.tools.f5 f5Var = this.P;
        if (f5Var != null) {
            f5Var.d();
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f153846h;
        if (mMLimitedClearEditText != null) {
            mMLimitedClearEditText.e(this.H1);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.D[0] = 1;
        finish();
        ((ku5.t0) ku5.t0.f312615d).q(new hr3.ph(this, false));
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.e().q(kd1.c.CTRL_INDEX, this);
        com.tencent.mm.ui.tools.f5 f5Var = this.P;
        if (f5Var != null) {
            f5Var.d();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(kd1.c.CTRL_INDEX, this);
        com.tencent.mm.ui.tools.f5 f5Var = this.P;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        int i19;
        long j17;
        r45.v60 v60Var;
        java.lang.String str3;
        com.tencent.mm.modelbase.n nVar;
        java.util.List list;
        int i27;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        try {
            try {
                Y6();
                if (m1Var instanceof com.tencent.mm.pluginsdk.model.m3) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd: getopCode: %s.", java.lang.Integer.valueOf(((com.tencent.mm.pluginsdk.model.m3) m1Var).M()));
                    if ((i17 != 0 || i18 != 0) && ((com.tencent.mm.pluginsdk.model.m3) m1Var).M() == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd:is MM_VERIFYUSER_ADDCONTACT return");
                        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                        return;
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd: is no NetSceneVerifyUser.");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "sendrequest_second");
                X6();
                if (i17 == 0 && i18 == 0) {
                    db5.e1.T(this, getString(com.tencent.mm.R.string.iim));
                    r61.z1.c(this.f153860v, 1);
                    com.tencent.mm.autogen.events.RecoverAccountFriendEvent recoverAccountFriendEvent = new com.tencent.mm.autogen.events.RecoverAccountFriendEvent();
                    am.hq hqVar = recoverAccountFriendEvent.f54666g;
                    hqVar.f6862a = this.f153860v;
                    hqVar.f6863b = 1;
                    recoverAccountFriendEvent.e();
                    if (this.f153868z == 17 && (m1Var instanceof com.tencent.mm.pluginsdk.model.m3)) {
                        long longExtra = getIntent().getLongExtra("key_msg_id", 0L);
                        java.lang.String stringExtra = getIntent().getStringExtra("key_msg_talker");
                        if (longExtra > 0) {
                            com.tencent.mm.storage.f9 Li = pt0.f0.Li(stringExtra, longExtra);
                            if (Li.getMsgId() > 0) {
                                Li.l1(Li.F | 2048);
                                ((com.tencent.mm.storage.g9) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj()).bb(longExtra, Li);
                                com.tencent.mm.modelsimple.g1.L(Li, 21, 2);
                            }
                        }
                    }
                    if (this.C) {
                        java.lang.String a76 = a7();
                        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(a76);
                        int[] iArr = this.D;
                        if (!K0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "set temp remark of %s: %s", this.f153860v, a76);
                            com.tencent.mm.storage.z3 m17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).m(this.f153860v);
                            m17.n1(a76);
                            com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(this.f153860v);
                            z07.v0(this.f153860v);
                            z07.u0(a76);
                            ((com.tencent.mm.storage.ab) c01.d9.b().B()).replace(z07);
                            ((com.tencent.mm.storage.k4) c01.d9.b().q()).l0(m17);
                            iArr[2] = 1;
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f153862x) && !a76.equals(this.f153862x)) {
                                iArr[5] = 1;
                            }
                        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f153862x)) {
                            iArr[2] = 2;
                        } else {
                            iArr[2] = 0;
                        }
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        if (m1Var instanceof com.tencent.mm.pluginsdk.model.m3) {
                            i27 = ((com.tencent.mm.pluginsdk.model.m3) m1Var).M();
                            list = ((com.tencent.mm.pluginsdk.model.m3) m1Var).L();
                        } else {
                            if (m1Var instanceof l41.h0) {
                                linkedList.add(((l41.h0) m1Var).H());
                            }
                            list = linkedList;
                            i27 = 0;
                        }
                        if (i27 == 3 || (m1Var instanceof l41.h0)) {
                            T6(list);
                            com.tencent.mm.storage.z3 m18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).m(this.f153860v);
                            com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent = new com.tencent.mm.autogen.events.SnsPermissionNotifyEvent();
                            am.jw jwVar = snsPermissionNotifyEvent.f54827g;
                            jwVar.getClass();
                            jwVar.f7102a = false;
                            jwVar.f7103b = this.f153860v;
                            snsPermissionNotifyEvent.e();
                            if (this.f153851o.d()) {
                                c01.e2.r0(m18);
                            } else {
                                c01.e2.x0(m18, false, true);
                            }
                            com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent2 = new com.tencent.mm.autogen.events.SnsPermissionNotifyEvent();
                            am.jw jwVar2 = snsPermissionNotifyEvent2.f54827g;
                            jwVar2.getClass();
                            jwVar2.f7102a = true;
                            java.lang.String str4 = this.f153860v;
                            jwVar2.f7103b = str4;
                            jwVar2.f7104c = ((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).P0(str4, 5L);
                            n7(this.f153860v, !this.f153852p.d() ? 2 : 1, 5L);
                            snsPermissionNotifyEvent2.e();
                            ((hr3.ld) pf5.z.f353948a.a(this).a(hr3.ld.class)).P6(m18);
                            if (getIntent().getBooleanExtra("sayhi_with_jump_to_profile", false)) {
                                android.content.Intent intent = new android.content.Intent();
                                intent.putExtra("friend_message_transfer_username", this.f153860v);
                                intent.setAction("friend_message_accept_" + this.f153860v);
                                intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477886ea);
                                intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477882e6);
                                j45.l.i(this, "subapp", ".ui.friend.FMessageTransferUI", intent);
                            }
                        }
                    }
                    getIntent().putExtra("CONTACT_INFO_UI_SOURCE", 7);
                    com.tencent.mm.plugin.profile.p2.Bi(getIntent(), 1, 1, this.f153860v);
                    setResult(-1, getIntent());
                    if (this.W) {
                        if (m1Var instanceof com.tencent.mm.pluginsdk.model.m3) {
                            r45.v60 H = ((com.tencent.mm.pluginsdk.model.m3) m1Var).H();
                            j17 = ((com.tencent.mm.pluginsdk.model.m3) m1Var).K();
                            java.lang.String I = ((com.tencent.mm.pluginsdk.model.m3) m1Var).I();
                            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "prepare createSendMessage from NetSceneVerifyUser, userName=%s, respUsername=%s, encryptUsername=%s, svrMsgId=%d", this.f153860v, ((com.tencent.mm.pluginsdk.model.m3) m1Var).J(), I, java.lang.Long.valueOf(j17));
                            str3 = I;
                            v60Var = H;
                        } else {
                            j17 = 0;
                            v60Var = null;
                            str3 = null;
                        }
                        if (m1Var instanceof l41.f0) {
                            com.tencent.mm.modelbase.o oVar = ((l41.f0) m1Var).f315809e;
                            long j18 = (oVar == null || (nVar = oVar.f70711b) == null) ? 0L : ((r45.iz5) nVar.f70700a).f377416d;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "prepare createSendMessage from NetSceneSendOpenIMVerifyRequest, userName=%s, svrMsgId=%d", this.f153860v, java.lang.Long.valueOf(j18));
                            j17 = j18;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "call ProfileUtilsKt.createSendMessage, userName=%s, addContactScene=%d, svrMsgId=%d, encryptUsername=%s", this.f153860v, java.lang.Integer.valueOf(this.f153868z), java.lang.Long.valueOf(j17), str3);
                        com.tencent.mm.plugin.profile.n2.b(this.f153860v, b7(), 1, this.f153868z, v60Var, this.D1, java.lang.Long.valueOf(j17), str3);
                    }
                    finish();
                    ((ku5.t0) ku5.t0.f312615d).q(new hr3.ph(this, true));
                    Z6(1L);
                    if ((this.J1 & 8) == 0) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0);
                    }
                } else {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        str2 = "";
                    } else {
                        tm.a b17 = tm.a.b(str);
                        if (b17 == null || (str2 = b17.f420399b) == null) {
                            str2 = str;
                        }
                    }
                    if (i17 == 4 && i18 == -302) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SayHiWithSnsPermissionUI3", "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d", java.lang.Integer.valueOf(m1Var.getType() == 30 ? ((com.tencent.mm.pluginsdk.model.m3) m1Var).M() : 0));
                        db5.e1.A(this, getString(com.tencent.mm.R.string.bja), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490004i6), getString(com.tencent.mm.R.string.f490347sg), new hr3.nh(this, m1Var), null);
                    } else {
                        if (i17 != 4) {
                            i19 = 4;
                        } else if (i18 != -24 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            i19 = 4;
                        } else if (!((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(this, i17, i18, str)) {
                            android.widget.Toast.makeText(this, str2, 1).show();
                            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                            return;
                        }
                        if (i17 == i19 && ((i18 == -2 || i18 == -101) && !com.tencent.mm.sdk.platformtools.t8.K0(str2))) {
                            db5.e1.y(this, str2, "", getString(com.tencent.mm.R.string.f490507x1), null);
                        } else if (this.A && (i18 == -24 || i18 == -34)) {
                            android.widget.Toast.makeText(this, com.tencent.mm.R.string.fbm, 0).show();
                        } else if (i17 == 4 && i18 == -3400 && this.G) {
                            this.H = true;
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 1);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                this.f153857s.setText(str2);
                            }
                            m7();
                            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
                            u1Var.g(str2);
                            u1Var.a(true);
                            u1Var.j(getString(com.tencent.mm.R.string.hmr));
                            u1Var.m(com.tencent.mm.R.string.hms);
                            u1Var.b(new hr3.oh(this));
                            u1Var.p();
                        } else {
                            android.widget.Toast.makeText(this, com.tencent.mm.R.string.iil, 0).show();
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SayHiWithSnsPermissionUI3", e17, "onSceneEnd: EXCEPTION occurred", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            throw th6;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mm.ui.tools.f5 f5Var = this.P;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "height:%s", java.lang.Integer.valueOf(i17));
    }
}
