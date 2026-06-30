package com.tencent.mm.plugin.masssend.ui;

@db5.a(131)
/* loaded from: classes5.dex */
public class MassSendMsgUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f148539v = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f148540d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f148541e;

    /* renamed from: f, reason: collision with root package name */
    public int f148542f;

    /* renamed from: g, reason: collision with root package name */
    public int f148543g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.ChatFooter f148544h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f148545i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f148546m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f148547n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f148548o;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f148552s;

    /* renamed from: t, reason: collision with root package name */
    public kf3.u f148553t;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f148549p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f148550q = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f148551r = false;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.u f148554u = new kf3.b2(this);

    public static void T6(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI) {
        massSendMsgUI.getClass();
        rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
        java.lang.String title = massSendMsgUI.getResources().getString(com.tencent.mm.R.string.m67, java.lang.Integer.valueOf(((java.util.ArrayList) massSendMsgUI.f148540d).size()));
        java.util.List memberList = massSendMsgUI.f148540d;
        ((qd0.u0) g1Var).getClass();
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(memberList, "memberList");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", title);
        intent.putExtra("custom_contact", com.tencent.mm.sdk.platformtools.t8.c1(memberList, ","));
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206780a);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        pf5.j0.a(intent, cj5.b.class);
        pf5.j0.a(intent, cj5.o0.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = massSendMsgUI;
        cVar.f(false);
        cVar.d(intent);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.g();
    }

    public static void U6(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI, java.lang.String str, int i17) {
        massSendMsgUI.getClass();
        if3.y yVar = new if3.y();
        yVar.f291217m = massSendMsgUI.f148541e;
        yVar.f291218n = ((java.util.ArrayList) massSendMsgUI.f148540d).size();
        yVar.f291215h = str;
        yVar.f291220p = i17;
        yVar.f291225u = 2;
        yVar.f291219o = 43;
        if3.g0 g0Var = new if3.g0(yVar, massSendMsgUI.f148551r, 0);
        c01.d9.e().g(g0Var);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = massSendMsgUI.f148549p;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        massSendMsgUI.f148549p.setOnCancelListener(new kf3.v1(massSendMsgUI, g0Var));
    }

    public final void V6(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
        if (stringExtra == null) {
            return;
        }
        boolean a17 = c01.z1.a(stringExtra, null, intent.getBooleanExtra("CropImage_Compress_Img", true));
        if3.y m07 = if3.k0.Ai().m0(stringExtra, this.f148541e, ((java.util.ArrayList) this.f148540d).size(), a17 ? 1 : 0);
        if (m07 == null) {
            return;
        }
        if3.g0 g0Var = new if3.g0(m07, this.f148551r, a17 ? 1 : 0);
        c01.d9.e().g(g0Var);
        this.f148549p = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.iin), true, true, new kf3.e2(this, g0Var));
    }

    public final void W6(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("VideoRecorder_FileName");
        int intExtra = intent.getIntExtra("VideoRecorder_VideoLength", 0);
        if3.y yVar = new if3.y();
        yVar.f291217m = this.f148541e;
        yVar.f291218n = ((java.util.ArrayList) this.f148540d).size();
        yVar.f291215h = stringExtra;
        yVar.f291220p = intExtra;
        yVar.f291219o = 43;
        if3.g0 g0Var = new if3.g0(yVar, this.f148551r, 0);
        c01.d9.e().g(g0Var);
        this.f148549p = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.iin), true, true, new kf3.d2(this, g0Var));
    }

    public final android.text.SpannableString X6(int i17) {
        if (this.f148540d == null) {
            return new android.text.SpannableString("");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < ((java.util.ArrayList) this.f148540d).size(); i18++) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = (java.lang.String) ((java.util.ArrayList) this.f148540d).get(i18);
            ((sg3.a) v0Var).getClass();
            java.lang.String e17 = c01.a2.e(str);
            if (i18 == ((java.util.ArrayList) this.f148540d).size() - 1) {
                sb6.append(e17);
            } else {
                sb6.append(e17 + ",  ");
            }
        }
        return ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(this, sb6.toString(), i17);
    }

    public final void Y6(boolean z17, java.lang.String str) {
        int i17;
        int i18;
        int i19;
        if (z17) {
            i17 = 246;
            i18 = 247;
            i19 = 255;
        } else {
            i17 = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR;
            i18 = 234;
            i19 = 242;
        }
        int k17 = (int) (com.tencent.mm.vfs.w6.k(str) / 1024);
        int[] iArr = {512, 1024, 2048, 5120, 8192, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 15360, 20480};
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.y(k17, iArr, i18, i19));
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.idkeyStat(106L, q17, 1L, false);
        g0Var2.idkeyStat(106L, i17, 1L, false);
    }

    public final void Z6(android.content.Intent intent) {
        t21.l0 l0Var = new t21.l0();
        this.f148549p = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new kf3.p1(this, l0Var));
        l0Var.a(this, intent, this.f148541e, false, new kf3.u1(this));
    }

    public final void a7(java.lang.String str, int i17) {
        this.f148549p = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new kf3.i1(this, new t21.l0()));
        s75.d.b(new kf3.m1(this, str, i17), "MassSend_Remux");
    }

    public final void b7(android.content.Intent intent) {
        if (com.tencent.mm.network.y2.a(this)) {
            Z6(intent);
        } else {
            db5.e1.n(this, com.tencent.mm.R.string.k77, com.tencent.mm.R.string.f490573yv, new kf3.n1(this, intent), new kf3.o1(this));
        }
    }

    public void c7(com.tencent.mm.ui.widget.dialog.p3 p3Var) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 1, 0, false);
        z2Var.m(getResources().getString(com.tencent.mm.R.string.f490347sg), getResources().getString(com.tencent.mm.R.string.f490551ya));
        kf3.d1 d1Var = new kf3.d1(this, z2Var);
        kf3.e1 e1Var = new kf3.e1(this, z2Var, p3Var);
        z2Var.D = d1Var;
        z2Var.E = e1Var;
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dnc, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.r3y);
        textView.setText(X6((int) textView.getTextSize()));
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.r3x);
        if (((java.util.ArrayList) this.f148540d).size() > 1) {
            textView2.setText(getResources().getString(com.tencent.mm.R.string.f492486m65, java.lang.Integer.valueOf(((java.util.ArrayList) this.f148540d).size())));
        } else {
            textView2.setText(getResources().getString(com.tencent.mm.R.string.m66));
        }
        com.tencent.mm.ui.bk.s0(textView2.getPaint());
        inflate.findViewById(com.tencent.mm.R.id.r2c).setOnClickListener(new kf3.f1(this));
        z2Var.k(inflate, 0, 0);
        z2Var.C();
    }

    public final void d7() {
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String m17 = lp0.b.m();
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        ((ub0.r) oVar).getClass();
        if (com.tencent.mm.pluginsdk.ui.tools.l7.l(this, m17, str, 2)) {
            return;
        }
        dp.a.makeText(this, getString(com.tencent.mm.R.string.igw), 1).show();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.r3z;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489264bx4;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.gtc);
        this.f148546m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jcu);
        this.f148547n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jct);
        android.widget.TextView textView = this.f148546m;
        textView.setText(X6((int) textView.getTextSize()));
        this.f148547n.setText(getResources().getQuantityString(com.tencent.mm.R.plurals.f489683u, ((java.util.ArrayList) this.f148540d).size(), java.lang.Integer.valueOf(((java.util.ArrayList) this.f148540d).size())));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.jlt);
        if (findViewById != null) {
            com.tencent.mm.ui.a4.f(findViewById);
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = (com.tencent.mm.pluginsdk.ui.chat.ChatFooter) findViewById(com.tencent.mm.R.id.f486092k52);
        this.f148544h = chatFooter;
        chatFooter.setActivity(this);
        com.tencent.mm.plugin.masssend.ui.MassSendLayout massSendLayout = (com.tencent.mm.plugin.masssend.ui.MassSendLayout) findViewById(com.tencent.mm.R.id.jcy);
        massSendLayout.setPanel(this.f148544h.getPanel());
        massSendLayout.setChatFooter(this.f148544h);
        this.f148553t = new kf3.u(this, this.f148544h, this.f148541e, this.f148540d, this.f148551r);
        this.f148544h.setSupportPasteImg(false);
        this.f148544h.setFooterEventListener(this.f148553t);
        this.f148544h.setSmileyPanelCallback(new kf3.q2(this.f148553t));
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = this.f148544h;
        int intValue = ((java.lang.Integer) c01.d9.b().p().l(18, -1)).intValue();
        if (intValue == -1) {
            intValue = 1;
        }
        chatFooter2.setMode(intValue);
        this.f148544h.setUserName("masssendapp");
        this.f148544h.f189993h.x();
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f148544h.f189993h;
        appPanel.C.f190167y.f190766a = false;
        appPanel.o();
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel2 = this.f148544h.f189993h;
        appPanel2.C.f190168z.f190766a = false;
        appPanel2.o();
        this.f148544h.O();
        this.f148544h.getChatFooterPanel().setShowGame(false);
        if (((java.lang.Boolean) c01.d9.b().p().l(66832, java.lang.Boolean.FALSE)).booleanValue()) {
            this.f148544h.f0();
            this.f148544h.l0();
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter3 = this.f148544h;
        kf3.a2 a2Var = new kf3.a2(this);
        chatFooter3.getClass();
        com.tencent.mm.pluginsdk.ui.chat.g5 g5Var = new com.tencent.mm.pluginsdk.ui.chat.g5(chatFooter3, a2Var);
        chatFooter3.f189997h5 = g5Var;
        chatFooter3.f190021m.addTextChangedListener(g5Var);
        this.f148544h.P();
        this.f148544h.Q();
        this.f148544h.S();
        this.f148544h.c0(true, true);
        this.f148544h.X(true);
        this.f148544h.M(true);
        this.f148544h.setAppPanelListener(this.f148554u);
        this.f148544h.a0(u11.c.g());
        this.f148544h.J();
        this.f148544h.L();
        this.f148544h.N();
        this.f148544h.K();
        this.f148544h.R();
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_mass_send_emoji, false)) {
            this.f148544h.v0();
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_mass_send_finder, false);
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel3 = this.f148544h.f189993h;
        appPanel3.C.E.f190766a = !(!fj6);
        appPanel3.o();
        boolean z17 = appPanel3.C.E.f190766a;
        setBackBtn(new kf3.q1(this));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jcd)).setOnClickListener(new kf3.x1(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.r3z);
        this.f148548o = findViewById2;
        findViewById2.setOnTouchListener(new kf3.y1(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "onAcvityResult requestCode:" + i17);
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            return;
        }
        if (i17 > 0 && i17 <= 10) {
            c7(new kf3.f2(this, i17, intent));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String[] split;
        super.onCreate(bundle);
        c01.d9.e().a(193, this);
        this.f148551r = getIntent().getBooleanExtra("mass_send_again", false);
        this.f148541e = getIntent().getStringExtra("mass_send_contact_list");
        this.f148542f = getIntent().getIntExtra("mass_send_contact_chatroom", 0);
        this.f148543g = getIntent().getIntExtra("mass_send_contact_label", 0);
        java.lang.String str = this.f148541e;
        this.f148540d = new java.util.ArrayList();
        if (str != null && !str.equals("") && (split = str.split(";")) != null && split.length > 0) {
            this.f148540d = com.tencent.mm.sdk.platformtools.t8.P1(split);
        }
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(193, this);
        super.onDestroy();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f148544h;
        if (chatFooter != null) {
            chatFooter.G();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0 || !this.f148544h.K0()) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f148544h.setBottomPanelVisibility(8);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        this.f148544h.d1(com.tencent.mm.pluginsdk.ui.chat.f5.Pause);
        this.f148544h.Q0();
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            return;
        }
        if (iArr[0] == 0) {
            d7();
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new kf3.c2(this), null);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f148544h;
        if (chatFooter != null) {
            chatFooter.setLastText(this.f148550q);
            this.f148544h.R0(getContext(), this);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f148549p;
        if (u3Var2 != null) {
            u3Var2.dismiss();
            this.f148549p = null;
        }
        kf3.u uVar = this.f148553t;
        if (uVar != null && (u3Var = uVar.f307441f) != null) {
            u3Var.dismiss();
            uVar.f307441f = null;
        }
        if (i17 != 0 || i18 != 0) {
            if (i17 == 4 && i18 == -24) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MassSendMsgUI", "onSceneEnd, masssend err spam");
                dp.a.makeText(this, com.tencent.mm.R.string.gt8, 0).show();
                return;
            }
            if (i17 == 2 || i17 == 1 || i17 == 3) {
                this.f148544h.setLastText(this.f148550q);
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            androidx.appcompat.app.AppCompatActivity context = getContext();
            ((com.tencent.mm.app.o7) wi6).getClass();
            com.tencent.mm.ui.pc.a(context, i17, i18, str, 4);
            if (i18 != -71) {
                if (i18 != -34) {
                    dp.a.makeText(this, com.tencent.mm.R.string.iil, 0).show();
                    return;
                } else {
                    dp.a.makeText(this, com.tencent.mm.R.string.gt7, 0).show();
                    return;
                }
            }
            int c17 = if3.k0.Bi().c();
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
            u1Var.u(getString(com.tencent.mm.R.string.m69, java.lang.Integer.valueOf(c17)));
            u1Var.n(getString(com.tencent.mm.R.string.f490454vi));
            u1Var.l(new kf3.w1(this));
            u1Var.q(false);
            return;
        }
        r45.si4 si4Var = (r45.si4) ((if3.g0) m1Var).f291171e.f70711b.f70700a;
        java.util.LinkedList linkedList = si4Var.f385765i;
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MassSendMsgUI", "[dealInsertTipSysMsg] Fail: resp.NewMsgIdForNewXmlList null");
        } else if (linkedList.size() != si4Var.f385764h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MassSendMsgUI", "[dealInsertTipSysMsg] Fail: resp.NewMsgIdForNewXmlList.size()[%s] != resp.NewMsgIdForNewXmlCount[%s]", java.lang.Integer.valueOf(si4Var.f385765i.size()), java.lang.Integer.valueOf(si4Var.f385764h));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            long j17 = si4Var.f385763g;
            java.util.Iterator it = si4Var.f385765i.iterator();
            while (it.hasNext()) {
                r45.vv4 vv4Var = (r45.vv4) it.next();
                hashMap.put(vv4Var.f388606d, java.lang.Long.valueOf(vv4Var.f388607e));
            }
            com.tencent.mars.xlog.Log.i("MassSysTipHelper", "insertSysTip talkerMap:" + hashMap + ", masMsgId:" + j17);
            ((ku5.t0) ku5.t0.f312615d).g(new if3.d0(hashMap, j17));
        }
        if3.y s07 = if3.k0.Ai().s0(java.lang.Long.toString(si4Var.f385763g));
        int i19 = s07 != null ? s07.f291219o : 0;
        int size = ((java.util.ArrayList) this.f148540d).size();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("mass_send_msg_type", java.lang.Integer.valueOf(i19));
        hashMap2.put("mass_send_users_from_contact", java.lang.Integer.valueOf((size - this.f148542f) - this.f148543g));
        hashMap2.put("mass_send_users_from_room", java.lang.Integer.valueOf(this.f148542f));
        hashMap2.put("mass_send_users_from_tags", java.lang.Integer.valueOf(this.f148543g));
        hashMap2.put("mass_send_to_list_count", java.lang.Integer.valueOf(size));
        hashMap2.put("mass_send_source", java.lang.Integer.valueOf(this.f148551r ? 2 : 1));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("mass_send_success", hashMap2, 31081);
        this.f148550q = "";
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.class);
        intent.addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/masssend/ui/MassSendMsgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/masssend/ui/MassSendMsgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }
}
