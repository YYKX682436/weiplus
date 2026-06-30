package com.tencent.mm.ui;

@gm0.a2
/* loaded from: classes11.dex */
public class SingleChatInfoUI extends com.tencent.mm.ui.base.preference.MMPreference implements p21.a {

    /* renamed from: x, reason: collision with root package name */
    public static boolean f197069x;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f197070d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f197071e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference f197073g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f197074h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f197075i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f197077n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f197078o;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f197072f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public android.content.SharedPreferences f197076m = null;

    /* renamed from: p, reason: collision with root package name */
    public final ik1.b0 f197079p = new ik1.b0();

    /* renamed from: q, reason: collision with root package name */
    public final ik1.b0 f197080q = new ik1.b0();

    /* renamed from: r, reason: collision with root package name */
    public boolean f197081r = false;

    /* renamed from: s, reason: collision with root package name */
    public zy2.za f197082s = null;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.b0 f197083t = new com.tencent.mm.pluginsdk.ui.b0(new com.tencent.mm.ui.ki(this));

    /* renamed from: u, reason: collision with root package name */
    public bi4.v0 f197084u = null;

    /* renamed from: v, reason: collision with root package name */
    public final l75.q0 f197085v = new com.tencent.mm.ui.ui(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f197086w = false;

    public static void V6(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI) {
        singleChatInfoUI.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 6, 2, singleChatInfoUI.f197077n);
        f197069x = false;
        java.lang.String str = null;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(singleChatInfoUI, singleChatInfoUI.getString(com.tencent.mm.R.string.f490573yv), singleChatInfoUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.aj(null));
        if (!f197069x) {
            str = ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).wi(singleChatInfoUI.f197071e.d1());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            singleChatInfoUI.X6(Q);
        } else {
            Q.dismiss();
            db5.e1.L(singleChatInfoUI, false, singleChatInfoUI.getString(com.tencent.mm.R.string.kk_, str), null, singleChatInfoUI.getString(com.tencent.mm.R.string.fs8), singleChatInfoUI.getString(com.tencent.mm.R.string.b96), new com.tencent.mm.ui.zi(singleChatInfoUI), new com.tencent.mm.ui.ai(singleChatInfoUI, Q), -1, com.tencent.mm.R.color.f478622ch);
        }
    }

    public final void W6(java.lang.String str, java.util.Map map) {
        int intExtra = getIntent().getIntExtra("chat_from_scene", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("chat_session");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", this.f197071e.d1());
        hashMap.put("enter_sessionid", stringExtra);
        hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(intExtra)));
        hashMap.put("view_id", str);
        if (map != null) {
            hashMap.putAll(map);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
    }

    public final void X6(final android.app.ProgressDialog progressDialog) {
        if (!com.tencent.mm.storage.z3.V3(this.f197077n)) {
            c01.w9.h(this.f197071e.d1(), new com.tencent.mm.ui.bi(this, progressDialog));
            this.f197072f.post(new com.tencent.mm.ui.ii(this));
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String f17 = com.tencent.mm.plugin.finder.service.m4.f126148a.f(this.f197077n);
        if (!com.tencent.mm.storage.z3.S3(f17)) {
            f17 = "";
        }
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        java.lang.String sessionId = this.f197077n;
        android.view.LayoutInflater.Factory context = getContext();
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.SingleChatInfoUI$$a
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean z17 = com.tencent.mm.ui.SingleChatInfoUI.f197069x;
                com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = com.tencent.mm.ui.SingleChatInfoUI.this;
                singleChatInfoUI.getClass();
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                android.app.ProgressDialog progressDialog2 = progressDialog;
                if (booleanValue) {
                    c01.w9.h(singleChatInfoUI.f197071e.d1(), new com.tencent.mm.ui.bi(singleChatInfoUI, progressDialog2));
                    singleChatInfoUI.f197072f.post(new com.tencent.mm.ui.ii(singleChatInfoUI));
                    return null;
                }
                progressDialog2.dismiss();
                db5.t7.i(singleChatInfoUI, singleChatInfoUI.getResources().getString(com.tencent.mm.R.string.hen), com.tencent.mm.R.raw.ic_filled_loading_fail);
                return null;
            }
        };
        ((c61.l7) b6Var).getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(context, "context");
        pq5.g l17 = new db2.g(f17, sessionId).l();
        l17.K(new c61.k6(lVar));
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            l17.f((im5.b) context);
        }
    }

    public final void Y6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        if (!com.tencent.mm.storage.z3.a4(this.f197077n)) {
            if (com.tencent.mm.storage.z3.V3(this.f197077n)) {
                intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 61));
            } else if (com.tencent.mm.storage.z3.H4(this.f197077n)) {
                ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ri(this.f197077n, com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX);
                intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 76));
            } else {
                intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 39));
            }
            intent.putExtra("k_username", this.f197077n);
            j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        t53.m0 m0Var = (t53.m0) i95.n0.c(t53.m0.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        java.lang.String sessionId = this.f197077n;
        m0Var.getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        f63.e eVar = (f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(sessionId);
        java.lang.String v07 = eVar.v0();
        intent.putExtra("k_username", v07);
        java.lang.String KExposeGameLifeUrl = com.tencent.mm.ui.n2.f209400c;
        kotlin.jvm.internal.o.f(KExposeGameLifeUrl, "KExposeGameLifeUrl");
        java.lang.String format = java.lang.String.format(KExposeGameLifeUrl, java.util.Arrays.copyOf(new java.lang.Object[]{39}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        t53.m0.hj(m0Var, 8, 40L, eVar.u0(), eVar.t0(), v07, null, null, null, 224, null);
    }

    @Override // p21.a
    public void Z1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference;
        if (!str.equals(this.f197077n) || (contactListExpandPreference = this.f197073g) == null) {
            return;
        }
        contactListExpandPreference.s();
    }

    public final boolean Z6(java.lang.String str) {
        return com.tencent.mm.storage.z3.E3(str) || com.tencent.mm.storage.z3.G3(str);
    }

    public final void a7(boolean z17) {
        boolean V3 = com.tencent.mm.storage.z3.V3(this.f197077n);
        boolean H4 = com.tencent.mm.storage.z3.H4(this.f197077n);
        ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_accept_message", true ^ (V3 || H4));
        if (V3 || H4) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f197070d).h("room_accept_message");
            checkBoxPreference.J(com.tencent.mm.R.string.axr);
            checkBoxPreference.O(z17);
            checkBoxPreference.f197785v = false;
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).notifyDataSetChanged();
        }
    }

    public void b7() {
        this.f197071e = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f197077n, true);
        ((un.j1) component(un.j1.class)).f429273d = this.f197071e;
    }

    public final void c7() {
        boolean z17;
        this.f197075i = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f197070d).h("force_notify");
        if (com.tencent.mm.storage.z3.m4(this.f197071e.d1()) || c01.z1.J(this.f197071e.d1()) || com.tencent.mm.storage.z3.p4(this.f197071e.d1())) {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("force_notify", true);
            return;
        }
        long Ai = ((h13.l0) ((f13.e) i95.n0.c(f13.e.class))).Ai(this.f197071e.d1());
        f13.e eVar = (f13.e) i95.n0.c(f13.e.class);
        java.lang.String username = this.f197071e.d1();
        h13.l0 l0Var = (h13.l0) eVar;
        l0Var.getClass();
        kotlin.jvm.internal.o.g(username, "username");
        try {
            z17 = l0Var.Ni(username.concat("@wxcontact"));
        } catch (java.lang.Exception unused) {
            z17 = false;
        }
        this.f197075i.O(z17);
        this.f197075i.S(z17);
        if (this.f197075i.N()) {
            this.f197075i.H(getResources().getString(com.tencent.mm.R.string.feu, new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(Ai))));
        } else {
            this.f197075i.H(null);
            setTitleMuteIconVisibility(c01.e2.P(this.f197071e) ? 0 : 8);
        }
        if (this.f197076m == null) {
            this.f197076m = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        this.f197076m.edit().putBoolean("force_notify", this.f197075i.N()).commit();
        ((com.tencent.mm.ui.base.preference.h0) this.f197070d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public com.tencent.mm.ui.base.preference.h0 createAdapter(android.content.SharedPreferences sharedPreferences) {
        return new com.tencent.mm.ui.base.preference.b(this, getListView(), sharedPreferences);
    }

    public final void d7() {
        if (com.tencent.mm.storage.z3.V3(this.f197077n) || com.tencent.mm.storage.z3.a4(this.f197077n) || com.tencent.mm.storage.z3.H4(this.f197077n)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m(this.f197074h.f197780q, true);
            return;
        }
        if (this.f197076m == null) {
            this.f197076m = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        boolean P = c01.e2.P(this.f197071e);
        this.f197078o = P;
        java.lang.String string = P ? getResources().getString(com.tencent.mm.R.string.blb) : "";
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((la5.i1) pf5.z.f353948a.a(activity).a(la5.i1.class)).setValue("is_mute", string);
        if (this.f197078o) {
            setTitleMuteIconVisibility(0);
            if (this.f197074h != null) {
                this.f197076m.edit().putBoolean("room_notify_new_msg", true).commit();
            }
        } else {
            setTitleMuteIconVisibility(8);
            if (this.f197074h != null) {
                this.f197076m.edit().putBoolean("room_notify_new_msg", false).commit();
            }
        }
        if (!com.tencent.mm.storage.z3.L3(this.f197077n)) {
            ((un.j1) component(un.j1.class)).Y6(true ^ this.f197078o);
        }
        ((un.j1) component(un.j1.class)).b7(this.f197078o);
        ((com.tencent.mm.ui.base.preference.h0) this.f197070d).notifyDataSetChanged();
    }

    public final void e7() {
        java.lang.String str;
        this.f197084u = new com.tencent.mm.ui.si(this);
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        linkedList.add(this.f197077n);
        bi4.w0 w0Var = (bi4.w0) i95.n0.c(bi4.w0.class);
        bi4.v0 v0Var = this.f197084u;
        ki4.x xVar = (ki4.x) w0Var;
        xVar.getClass();
        java.util.Objects.toString(linkedList);
        java.util.Objects.toString(v0Var);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (java.lang.String str2 : linkedList) {
            mj4.w Ai = xVar.Ai(str2);
            if (Ai != null && (str = Ai.field_userName) != null) {
                linkedList2.add(new jz5.l(str2, str));
            }
        }
        fi4.a aVar = new fi4.a(linkedList2, true);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        kotlin.jvm.internal.o.f(d17, "getNetSceneQueue(...)");
        ii4.a.a(d17, aVar, this, new ki4.t(aVar, v0Var));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public android.view.View getBottomView() {
        java.lang.String talker = getIntent().getStringExtra("Single_Chat_Talker");
        if (com.tencent.mm.storage.z3.V3(talker)) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.edj, (android.view.ViewGroup) null);
            inflate.findViewById(com.tencent.mm.R.id.tuc).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.xu(context));
            return inflate;
        }
        if (!Z6(talker)) {
            return null;
        }
        rk.f fVar = (rk.f) ((jz5.n) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).f274741d).getValue();
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        gr1.k kVar = (gr1.k) fVar;
        kVar.getClass();
        kotlin.jvm.internal.o.g(context2, "context");
        kotlin.jvm.internal.o.g(talker, "talker");
        int i17 = r26.i0.n(talker, "@picfansmsg", false) ? 5 : 0;
        int i18 = i17 == 5 ? com.tencent.mm.R.string.o0v : com.tencent.mm.R.string.o0r;
        android.view.View inflate2 = com.tencent.mm.ui.id.b(context2).inflate(com.tencent.mm.R.layout.dzo, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.ska);
        textView.setText(context2.getString(i18));
        textView.setOnClickListener(new gr1.j(kVar, context2, i17));
        return inflate2;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494918bk;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (this.f197071e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SingleChatInfoUI", "[initView] contact is null!");
            finish();
        }
        this.f197070d = getPreferenceScreen();
        if (com.tencent.mm.storage.z3.V3(this.f197077n) || Z6(this.f197077n)) {
            setMMTitle(getString(com.tencent.mm.R.string.i79));
        } else {
            setMMTitle(getString(com.tencent.mm.R.string.i78));
        }
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = (com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference) ((com.tencent.mm.ui.base.preference.h0) this.f197070d).h("roominfo_contact_anchor");
        this.f197073g = contactListExpandPreference;
        contactListExpandPreference.R(this.f197070d, contactListExpandPreference.f197780q);
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = this.f197073g;
        contactListExpandPreference2.T(true);
        contactListExpandPreference2.V(false);
        if (this.f197073g != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(this.f197077n);
            this.f197073g.O(this.f197077n, linkedList, true);
            android.widget.ListView listView = getListView();
            com.tencent.mm.pluginsdk.ui.b0 b0Var = this.f197083t;
            listView.setOnScrollListener(b0Var);
            lz.f fVar = this.f197073g.M;
            if (fVar != null) {
                ((r35.u1) fVar).f369274f.f369303v = b0Var;
            }
            if (!Z6(this.f197077n)) {
                this.f197073g.Z(new com.tencent.mm.ui.wi(this));
            }
        }
        setBackBtn(new com.tencent.mm.ui.xi(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 2 && i18 == -1) {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((h13.l0) ((f13.e) i95.n0.c(f13.e.class))).getClass();
        j13.a.f297177d.add(this.f197085v);
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).a(this);
        }
        this.f197077n = getIntent().getStringExtra("Single_Chat_Talker");
        this.f197081r = getIntent().getBooleanExtra("fromChatting", false);
        b7();
        if (this.f197071e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SingleChatInfoUI", "contact is null! talker:%s", this.f197077n);
            finish();
            return;
        }
        getPackageName();
        initView();
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Bi(this.f197071e.d1(), 3, c01.id.c() / 1000);
        if (com.tencent.mm.storage.z3.a4(this.f197077n)) {
            t53.m0 m0Var = (t53.m0) i95.n0.c(t53.m0.class);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            java.lang.String str = this.f197077n;
            com.tencent.mm.ui.mi miVar = new com.tencent.mm.ui.mi(this);
            m0Var.getClass();
            if (context != null) {
                com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct gameLifeSessionStruct = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct();
                gameLifeSessionStruct.f58340d = 4L;
                gameLifeSessionStruct.f58341e = 0L;
                gameLifeSessionStruct.f58342f = 0L;
                gameLifeSessionStruct.f58343g = 1L;
                gameLifeSessionStruct.f58344h = 301L;
                gameLifeSessionStruct.k();
                com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getResources().getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
                f17.show();
                y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Bi(str));
                java.lang.String t07 = Di.t0();
                if (Di.field_accountType <= 0) {
                    dp.a.makeText(context, com.tencent.mm.R.string.fq9, 0).show();
                } else {
                    ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ni(t07, new t53.y(f17, miVar, context));
                }
            }
        }
        if (com.tencent.mm.storage.z3.V3(this.f197077n)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_placed_to_the_top", true);
            this.f197082s = new com.tencent.mm.ui.ti(this);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.ui2 ui2Var = new r45.ui2();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            com.tencent.mm.plugin.finder.service.m4 m4Var = com.tencent.mm.plugin.finder.service.m4.f126148a;
            java.lang.String h17 = m4Var.h(this.f197077n);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String f18 = m4Var.f(this.f197077n);
            if (com.tencent.mm.storage.z3.S3(f18)) {
                ui2Var.set(0, 1);
            } else if (com.tencent.mm.storage.z3.T3(f18)) {
                ui2Var.set(0, 3);
            } else {
                ui2Var.set(0, 2);
            }
            ui2Var.set(2, this.f197077n);
            ui2Var.set(1, h17);
            linkedList.add(ui2Var);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            zy2.za zaVar = this.f197082s;
            com.tencent.mm.plugin.finder.service.p4 p4Var = com.tencent.mm.plugin.finder.service.p4.f126175d;
            com.tencent.mm.plugin.finder.service.p4.f126177f = zaVar;
            if (com.tencent.mm.plugin.finder.service.p4.f126176e) {
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                pm0.v.T(new bq.r1(linkedList).l(), new cq.o0(new com.tencent.mm.plugin.finder.service.n4(p4Var), new com.tencent.mm.plugin.finder.service.o4(p4Var)));
            } else {
                gm0.j1.d().a(6218, p4Var);
                gm0.j1.d().g(new db2.z5(linkedList));
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String h18 = m4Var.h(this.f197077n);
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            long j17 = com.tencent.mm.storage.z3.S3(h18) ? 1L : 2L;
            java.lang.String talkUserName = this.f197077n;
            if (talkUserName == null) {
                talkUserName = "";
            }
            ((c61.w8) paVar).getClass();
            kotlin.jvm.internal.o.g(talkUserName, "talkUserName");
            com.tencent.mm.plugin.finder.report.o oVar = com.tencent.mm.plugin.finder.report.p.f125225d;
            oVar.getClass();
            oVar.f125196a = j17;
            oVar.f125197b = talkUserName;
            oVar.f125198c = h18;
            oVar.f125199d = java.lang.String.valueOf(c01.id.c());
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).h("room_clear_chatting_history").J(com.tencent.mm.R.string.i47);
        }
        if (com.tencent.mm.storage.z3.H4(this.f197077n)) {
            e7();
        }
        if (com.tencent.mm.storage.z3.R3(this.f197071e.d1())) {
            e7();
        }
        if (com.tencent.mm.storage.z3.L3(this.f197071e.d1())) {
            int intExtra = getIntent().getIntExtra("chat_from_scene", 0);
            java.lang.String stringExtra = getIntent().getStringExtra("chat_session");
            java.util.HashMap hashMap = new java.util.HashMap();
            iy1.c cVar = iy1.c.MainUI;
            hashMap.put("page_id", 50180);
            hashMap.put("page_name", "yuanbao_chat_setting");
            hashMap.put("chat_name", this.f197071e.d1());
            hashMap.put("enter_sessionid", stringExtra);
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(intExtra)));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("session_in", hashMap, 34004);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((h13.l0) ((f13.e) i95.n0.c(f13.e.class))).getClass();
        j13.a.f297177d.remove(this.f197085v);
        zg5.a.b();
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).f(this);
        }
        super.onDestroy();
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Ai(getContext(), 0, 0);
        r45.qt2 wi6 = ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(getContext());
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.tencent.mm.plugin.finder.report.p pVar = com.tencent.mm.plugin.finder.report.p.f125222a;
        com.tencent.mm.plugin.finder.report.o oVar = com.tencent.mm.plugin.finder.report.p.f125225d;
        oVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FinderChatProfileStruct finderChatProfileStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderChatProfileStruct();
        if (wi6 != null) {
            java.lang.String string = wi6.getString(0);
            if (string == null) {
                string = "";
            }
            finderChatProfileStruct.f56616d = finderChatProfileStruct.b("sessionid", string, true);
            java.lang.String string2 = wi6.getString(2);
            if (string2 == null) {
                string2 = "";
            }
            finderChatProfileStruct.f56617e = finderChatProfileStruct.b("clicktabcontextid", string2, true);
        }
        java.lang.String str = finderChatProfileStruct.f56616d;
        if (str == null) {
            str = "";
        }
        finderChatProfileStruct.f56616d = finderChatProfileStruct.b("sessionid", str, true);
        java.lang.String str2 = finderChatProfileStruct.f56617e;
        if (str2 == null) {
            str2 = "";
        }
        finderChatProfileStruct.f56617e = finderChatProfileStruct.b("clicktabcontextid", str2, true);
        finderChatProfileStruct.f56618f = finderChatProfileStruct.b("chatSessionid", oVar.f125199d, true);
        finderChatProfileStruct.f56619g = oVar.f125196a;
        finderChatProfileStruct.f56620h = finderChatProfileStruct.b("chatName", oVar.f125197b, true);
        finderChatProfileStruct.f56621i = finderChatProfileStruct.b("talkerUsername", oVar.f125198c, true);
        finderChatProfileStruct.f56622j = oVar.f125203h;
        finderChatProfileStruct.f56623k = oVar.f125200e;
        finderChatProfileStruct.f56624l = oVar.f125202g;
        finderChatProfileStruct.f56625m = oVar.f125201f;
        finderChatProfileStruct.k();
        com.tencent.mm.plugin.finder.report.p.a(pVar, "RecordFinderChatProfile", finderChatProfileStruct);
        oVar.f125196a = 0L;
        oVar.f125197b = "";
        oVar.f125198c = "";
        oVar.f125200e = 0L;
        oVar.f125201f = 0L;
        oVar.f125202g = 0L;
        oVar.f125203h = 0L;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        androidx.appcompat.app.AppCompatActivity context;
        java.lang.Object obj;
        boolean z17;
        com.tencent.mm.protobuf.g byteString;
        boolean z18;
        java.lang.String key = preference.f197780q;
        r45.k74 k74Var = null;
        if (Z6(this.f197077n)) {
            rk.f fVar = (rk.f) ((jz5.n) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).f274741d).getValue();
            java.lang.String talker = this.f197077n;
            gr1.k kVar = (gr1.k) fVar;
            kVar.getClass();
            kotlin.jvm.internal.o.g(key, "key");
            kotlin.jvm.internal.o.g(talker, "talker");
            int i17 = r26.i0.n(talker, "@picfansmsg", false) ? 5 : 0;
            if (kotlin.jvm.internal.o.b(key, "room_expose")) {
                hr1.a y07 = i17 == 5 ? yq1.u0.Ui().y0(talker) : yq1.u0.Bi().y0(talker);
                if (y07 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BizFans.SafetyDelegate", "jumpToComplainH5 contact null for talker=".concat(talker));
                } else {
                    hr1.m z07 = i17 == 5 ? yq1.u0.Zi().z0(talker) : yq1.u0.Ni().y0(talker);
                    java.lang.String e17 = jr1.j.e(talker, i17);
                    java.lang.String str = y07.field_nickname;
                    if (str == null) {
                        str = "";
                    }
                    java.lang.String str2 = y07.field_inBlacklist ? "1" : "0";
                    java.lang.String valueOf = java.lang.String.valueOf(y07.field_identityType);
                    java.lang.String str3 = y07.field_identityName;
                    if (str3 == null) {
                        str3 = "";
                    }
                    java.lang.String str4 = y07.field_headImgUrl;
                    if (str4 == null) {
                        str4 = "";
                    }
                    java.lang.String str5 = z07.field_senderUserName;
                    java.lang.String e18 = str5 != null ? jr1.j.e(str5, i17) : null;
                    if (e18 == null) {
                        e18 = "";
                    }
                    java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/publicpoc/wap_privatemsgcomplain?action=show&openId=%s&username=%s&nickname=%s&blackState=%s&identityType=%s&identityName=%s&headImageUrl=%s&__biz=%s#wechat_redirect", java.util.Arrays.copyOf(new java.lang.Object[]{kVar.a(e17), kVar.a(talker), kVar.a(str), str2, valueOf, kVar.a(str3), kVar.a(str4), kVar.a(e18)}, 8));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizFans.SafetyDelegate", "jumpToComplainH5 urlLen=" + format.length() + " talker=" + talker + " serviceType=" + i17);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", format);
                    intent.putExtra("KRightBtn", true);
                    j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
                }
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                return true;
            }
        }
        if (key.equals("room_notify_new_msg")) {
            boolean z19 = !this.f197078o;
            this.f197078o = z19;
            if (z19) {
                c01.e2.p0(this.f197071e, true);
                ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436682h, vg3.b.f436645e, vg3.c.f436666u, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f197071e.d1()))));
            } else {
                c01.e2.z0(this.f197071e, true);
                ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436682h, vg3.b.f436645e, vg3.c.f436667v, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f197071e.d1()))));
            }
            b7();
            if (this.f197076m == null) {
                this.f197076m = getSharedPreferences(getPackageName() + "_preferences", 0);
            }
            this.f197076m.edit().putBoolean("room_notify_new_msg", this.f197078o).commit();
            d7();
            if (!this.f197078o) {
                ((un.j1) component(un.j1.class)).Q6(java.lang.Boolean.FALSE, true);
            }
            un.j1 j1Var = (un.j1) component(un.j1.class);
            boolean z27 = this.f197078o;
            j1Var.getClass();
            com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct chatBoxGroupActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct();
            chatBoxGroupActionStruct.f55598d = chatBoxGroupActionStruct.b("roomUsername", j1Var.U6(), true);
            chatBoxGroupActionStruct.f55599e = z27 ? 11 : 10;
            chatBoxGroupActionStruct.k();
            if (!com.tencent.mm.storage.z3.L3(this.f197077n)) {
                return false;
            }
            if (this.f197078o) {
                W6("yuanbao_msg_not_disturb_open", null);
                return false;
            }
            W6("yuanbao_msg_not_disturb_close", null);
            return false;
        }
        if (key.equals("room_placed_to_the_top")) {
            ((un.j1) component(un.j1.class)).O6(true);
            if (com.tencent.mm.storage.z3.L3(this.f197077n)) {
                if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("room_placed_to_the_top")).N()) {
                    W6("yuanbao_msg_top_open", null);
                } else {
                    W6("yuanbao_msg_top_close", null);
                }
            }
            if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("room_placed_to_the_top")).N()) {
                ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436682h, vg3.b.f436645e, vg3.c.f436664s, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f197071e.d1()))));
                return false;
            }
            ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436682h, vg3.b.f436645e, vg3.c.f436663r, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f197071e.d1()))));
            return false;
        }
        if (key.equals("force_notify")) {
            if (this.f197075i.N()) {
                m13.b.f322862a.a(getContext(), 1, false, new com.tencent.mm.ui.yi(this));
                ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436682h, vg3.b.f436645e, vg3.c.f436665t, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f197071e.d1()))));
                return false;
            }
            ((h13.l0) ((f13.e) i95.n0.c(f13.e.class))).wi(this.f197071e.d1() + "@wxcontact", 3);
            this.f197075i.H(null);
            return false;
        }
        if (key.equals("room_set_chatting_background")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("isApplyToAll", false);
            intent2.putExtra(dm.i4.COL_USERNAME, this.f197071e.d1());
            j45.l.n(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", intent2, 2);
            return false;
        }
        if (key.equals("room_search_chatting_content")) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("detail_username", this.f197077n);
            boolean z28 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Global_FTSMultiTabSearch_Int, 0) == 1;
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_fts_multi_tab_search_entrance_v2, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiTabEntranceConfig", "FTSMultiTabEntranceConfig >> " + z28 + ", " + fj6);
            if (z28 || fj6) {
                intent3.setClass(this, com.tencent.mm.ui.chatting.search.multi.FTSChattingConvMultiTabUI.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent3);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/SingleChatInfoUI", "searchChattingContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/SingleChatInfoUI", "searchChattingContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                o13.n.q(this, ".ui.FTSChattingConvUI", intent3);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14569, 1, 0, 0, 0, 0, 0, 0, 0, 0);
            if (!com.tencent.mm.storage.z3.L3(this.f197071e.d1())) {
                return false;
            }
            W6("yuanbao_find_chat_history", null);
            return false;
        }
        if (key.equals("room_clear_chatting_history")) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.tencent.mm.plugin.finder.report.o oVar = com.tencent.mm.plugin.finder.report.p.f125225d;
            oVar.f125202g++;
            com.tencent.mars.xlog.Log.i("RecordFinderChatProfile", "incClearHistoryCount:" + oVar.f125202g);
            if (com.tencent.mm.storage.z3.H4(this.f197077n)) {
                ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ri(this.f197077n, 157);
            }
            java.lang.String string = getString(com.tencent.mm.R.string.fc7, this.f197071e.g2());
            if (com.tencent.mm.storage.z3.V3(this.f197077n)) {
                string = getString(com.tencent.mm.R.string.fc8, this.f197071e.g2());
            }
            java.lang.String str6 = string;
            if (com.tencent.mm.storage.z3.L3(this.f197077n)) {
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(this, 1, 3, true);
                z2Var.t(android.view.View.inflate(getContext(), com.tencent.mm.R.layout.e0r, null));
                android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.e0q, null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.spz);
                textView.setText(java.lang.String.format(getString(com.tencent.mm.R.string.n7h), this.f197071e.g2()));
                android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.t3r);
                if (com.tencent.mm.storage.z3.L4(this.f197071e.d1())) {
                    textView.setVisibility(8);
                    checkBox.setVisibility(8);
                }
                inflate.findViewById(com.tencent.mm.R.id.f483752by4).setOnClickListener(new com.tencent.mm.ui.fi(this, checkBox));
                z2Var.j(inflate);
                z2Var.m(getString(com.tencent.mm.R.string.apj), getString(com.tencent.mm.R.string.apk));
                z2Var.o(2);
                com.tencent.mm.ui.gi giVar = new com.tencent.mm.ui.gi(this, z2Var, checkBox);
                com.tencent.mm.ui.hi hiVar = new com.tencent.mm.ui.hi(this, checkBox, z2Var);
                z2Var.D = giVar;
                z2Var.E = hiVar;
                z2Var.C();
            } else {
                db5.e1.B(getContext(), str6, "", getString(com.tencent.mm.R.string.f490353sl), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.ci(this), null, com.tencent.mm.R.color.f478622ch);
            }
            if (!com.tencent.mm.storage.z3.L3(this.f197071e.d1())) {
                return false;
            }
            W6("yuanbao_msg_clear", null);
            return false;
        }
        if (key.equals("room_del_chatting")) {
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(this.f197077n);
            if (p17 != null) {
                com.tencent.mm.ui.conversation.t1.c(this.f197077n, this, p17, true, new com.tencent.mm.ui.di(this), new com.tencent.mm.ui.ei(this), true, false);
            } else {
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this);
                e4Var.d(com.tencent.mm.R.string.ofq);
                e4Var.c();
            }
            if (!com.tencent.mm.storage.z3.L3(this.f197077n)) {
                return false;
            }
            W6("yuanbao_chat_delete", null);
            return false;
        }
        if (key.equals("room_set_to_conv_box")) {
            ((un.j1) component(un.j1.class)).P6();
            if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("room_set_to_conv_box")).N()) {
                ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436682h, vg3.b.f436645e, vg3.c.f436661p, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f197071e.d1()))));
                return false;
            }
            ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436682h, vg3.b.f436645e, vg3.c.f436662q, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f197071e.d1()))));
            return false;
        }
        if (key.equals("room_expose")) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.tencent.mm.plugin.finder.report.o oVar2 = com.tencent.mm.plugin.finder.report.p.f125225d;
            oVar2.f125201f++;
            com.tencent.mars.xlog.Log.i("RecordFinderChatProfile", "incCompanionCount:" + oVar2.f125201f);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("k_username", this.f197077n);
            if (com.tencent.mm.storage.z3.V3(this.f197077n)) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                ((c61.l7) b6Var).getClass();
                kotlin.jvm.internal.o.g(context2, "context");
                r45.k74 k74Var2 = new r45.k74();
                java.util.LinkedList list = g92.b.f269769e.k2().d().getList(24);
                kotlin.jvm.internal.o.f(list, "getFinder_config_item(...)");
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "personalmsg_complain_liteapp_info")) {
                        break;
                    }
                }
                r45.yy0 yy0Var = (r45.yy0) obj;
                byte[] g17 = (yy0Var == null || (byteString = yy0Var.getByteString(1)) == null) ? null : byteString.g();
                if (g17 != null) {
                    try {
                        k74Var2.parseFrom(g17);
                        k74Var = k74Var2;
                    } catch (java.lang.Exception e19) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e19);
                    }
                }
                if (k74Var == null) {
                    z17 = false;
                } else {
                    xc2.y2 y2Var = xc2.y2.f453343a;
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    finderJumpInfo.setLite_app_info(k74Var);
                    xc2.y2.L(y2Var, context2, new xc2.p0(finderJumpInfo), null, null, bundle, 12, null);
                    z17 = true;
                }
                if (z17) {
                    return false;
                }
            }
            if (com.tencent.mm.storage.z3.a4(this.f197077n) || com.tencent.mm.storage.z3.V3(this.f197077n) || com.tencent.mm.storage.z3.H4(this.f197077n)) {
                Y6();
                return false;
            }
            if (!j62.e.g().l("clicfg_single_chat_expose_config_switch_android", false, false, true)) {
                Y6();
                return false;
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            bundle2.putString("query", "{\"scene\":39}");
            bundle2.putBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, bundle);
            com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(this, bundle2, true, false, new com.tencent.mm.ui.ji(this));
            return false;
        }
        if (key.equals("chat_app_brand")) {
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("Chat_User", this.f197077n);
            j45.l.u(this, ".ui.chatting.gallery.AppBrandHistoryListUI", intent4, null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 25L, 1L, true);
            return false;
        }
        if (!key.equals("room_accept_message")) {
            if (!key.equals("room_add_blacklist")) {
                if (!key.equals("close_chat") || (context = getContext()) == null) {
                    return false;
                }
                q41.f.a(this.f197077n, 8, 0);
                db5.e1.B(context, context.getResources().getString(com.tencent.mm.R.string.heo), "", context.getString(com.tencent.mm.R.string.hem), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.pi(this, context), null, com.tencent.mm.R.color.f478622ch);
                return false;
            }
            if (!com.tencent.mm.storage.z3.a4(this.f197077n)) {
                return false;
            }
            t53.k kVar2 = (t53.k) i95.n0.c(t53.k.class);
            androidx.appcompat.app.AppCompatActivity context3 = getContext();
            java.lang.String str7 = this.f197077n;
            ik1.b0 isBlackList = this.f197080q;
            ik1.b0 isAssociateWithWAGame = this.f197079p;
            com.tencent.mm.ui.oi oiVar = new com.tencent.mm.ui.oi(this);
            t53.m0 m0Var = (t53.m0) kVar2;
            m0Var.getClass();
            kotlin.jvm.internal.o.g(isBlackList, "isBlackList");
            kotlin.jvm.internal.o.g(isAssociateWithWAGame, "isAssociateWithWAGame");
            if (context3 == null) {
                return false;
            }
            u53.c0 Ai = ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(str7);
            f63.e eVar = (f63.e) Ai;
            java.lang.String v07 = eVar.v0();
            t53.m0.hj(m0Var, 5, 2L, eVar.u0(), eVar.t0(), v07, null, null, null, 224, null);
            y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(v07);
            int i19 = Di.field_accountType;
            java.lang.String t07 = Di.t0();
            if (i19 <= 0) {
                dp.a.makeText(context3, com.tencent.mm.R.string.fq9, 0).show();
                return false;
            }
            if (i19 == 2) {
                if (isBlackList.f291824a == null || isAssociateWithWAGame.f291824a == null) {
                    return false;
                }
                m0Var.ij(context3, t07, i19, isBlackList, isAssociateWithWAGame, oiVar, Ai);
                return false;
            }
            if (i19 != 1) {
                return false;
            }
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context3, context3.getResources().getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
            f17.show();
            ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ni(t07, new t53.u(isBlackList, isAssociateWithWAGame, t07, f17, m0Var, context3, i19, oiVar, Ai));
            return false;
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f197070d).h("room_accept_message");
        if (checkBoxPreference == null) {
            return false;
        }
        boolean N = checkBoxPreference.N();
        if (com.tencent.mm.storage.z3.H4(this.f197077n)) {
            bi4.w0 w0Var = (bi4.w0) i95.n0.c(bi4.w0.class);
            java.lang.String str8 = this.f197077n;
            ki4.x xVar = (ki4.x) w0Var;
            xVar.getClass();
            hi4.m.f281555f.d(str8 != null ? str8 : "", N ? 155 : 156);
            mj4.w Ai2 = xVar.Ai(str8);
            if (Ai2 == null) {
                return false;
            }
            pj4.c2 c2Var = new pj4.c2();
            c2Var.f355011d = Ai2.field_userName;
            c2Var.f355012e = N;
            pj4.v0 v0Var = new pj4.v0();
            v0Var.f355308d = 11;
            byte[] byteArray = c2Var.toByteArray();
            v0Var.f355309e = com.tencent.mm.protobuf.g.c(android.util.Base64.encodeToString(byteArray, 0, byteArray.length, 2));
            ki4.v vVar = new ki4.v(xVar, str8, Ai2);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(v0Var);
            fi4.b bVar = new fi4.b(linkedList);
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            kotlin.jvm.internal.o.f(d17, "getNetSceneQueue(...)");
            ii4.a.a(d17, bVar, this, new ki4.h0(bVar, vVar));
            return false;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.tencent.mm.plugin.finder.service.m4 m4Var = com.tencent.mm.plugin.finder.service.m4.f126148a;
        java.lang.String h17 = m4Var.h(this.f197077n);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String f18 = m4Var.f(this.f197077n);
        if (!com.tencent.mm.storage.z3.S3(h17)) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            java.lang.String session = this.f197077n;
            kotlin.jvm.internal.o.g(session, "session");
            hb2.y0 y0Var = hb2.y0.f280116e;
            y0Var.getClass();
            r45.ji2 ji2Var = new r45.ji2();
            ji2Var.set(0, java.lang.Integer.valueOf(N ? 1 : 0));
            ji2Var.set(1, session);
            hb2.w0.m(y0Var, ji2Var, null, false, false, null, null, 60, null);
        } else if (com.tencent.mm.storage.z3.S3(f18)) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            java.lang.String session2 = this.f197077n;
            kotlin.jvm.internal.o.g(session2, "session");
            hb2.y0 y0Var2 = hb2.y0.f280116e;
            y0Var2.getClass();
            r45.ji2 ji2Var2 = new r45.ji2();
            ji2Var2.set(0, java.lang.Integer.valueOf(N ? 1 : 0));
            ji2Var2.set(1, session2);
            hb2.w0.m(y0Var2, ji2Var2, null, false, false, null, null, 60, null);
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            java.lang.String session3 = this.f197077n;
            kotlin.jvm.internal.o.g(session3, "session");
            hb2.t0 t0Var = hb2.t0.f280094e;
            t0Var.getClass();
            r45.ji2 ji2Var3 = new r45.ji2();
            ji2Var3.set(0, java.lang.Integer.valueOf(N ? 1 : 0));
            ji2Var3.set(1, session3);
            hb2.w0.m(t0Var, ji2Var3, null, false, false, null, null, 60, null);
        }
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        long j17 = N ? 1L : 0L;
        ((c61.w8) paVar).getClass();
        com.tencent.mm.plugin.finder.report.p.f125225d.f125203h = j17;
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.storage.z3 z3Var;
        b7();
        com.tencent.mm.storage.z3 z3Var2 = this.f197071e;
        boolean z17 = false;
        if (z3Var2 != null && z3Var2.F0() == 1) {
            this.f197073g.T(false);
        }
        if (!com.tencent.mm.ui.contact.i5.f() && (z3Var = this.f197071e) != null && com.tencent.mm.storage.z3.m4(z3Var.d1())) {
            this.f197073g.T(false);
        }
        this.f197074h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f197070d).h("room_notify_new_msg");
        ((un.j1) component(un.j1.class)).Y6(true);
        if (this.f197076m == null) {
            this.f197076m = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f197071e != null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("force_notify", !r4.r2());
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_del_chatting", this.f197071e.r2());
            this.f197078o = c01.e2.P(this.f197071e);
            this.f197076m.edit().putBoolean("room_notify_new_msg", this.f197078o).commit();
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("force_notify", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_del_chatting", true);
            this.f197076m.edit().putBoolean("room_notify_new_msg", false).commit();
            this.f197078o = false;
        }
        ((un.j1) component(un.j1.class)).Z6();
        if (com.tencent.mm.storage.z3.V3(this.f197077n)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_search_chatting_content", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("force_notify", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_set_chatting_background", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_del_chatting", true);
        }
        if (com.tencent.mm.storage.z3.H4(this.f197077n)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_search_chatting_content", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("force_notify", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_set_chatting_background", true);
        }
        if (Z6(this.f197077n)) {
            rk.f fVar = (rk.f) ((jz5.n) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).f274741d).getValue();
            com.tencent.mm.ui.base.preference.r screen = this.f197070d;
            java.lang.String talker = this.f197077n;
            ((gr1.k) fVar).getClass();
            kotlin.jvm.internal.o.g(screen, "screen");
            kotlin.jvm.internal.o.g(talker, "talker");
            int i17 = r26.i0.n(talker, "@picfansmsg", false) ? 5 : 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachBizFansChatInfoSection talker=");
            sb6.append(talker);
            sb6.append(" serviceType=");
            sb6.append(i17);
            sb6.append(" complainOn=");
            sb6.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_fans_private_msg_complaint_enable, 0) == 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFans.SafetyDelegate", sb6.toString());
            java.util.Iterator it = gr1.k.f274738a.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.ui.base.preference.h0) screen).m((java.lang.String) it.next(), true);
            }
            com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) screen;
            h0Var.m("room_expose", !(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_fans_private_msg_complaint_enable, 0) == 1));
            com.tencent.mm.ui.base.preference.Preference h17 = h0Var.h("room_expose");
            if (h17 != null) {
                h17.J(com.tencent.mm.R.string.o0o);
            }
            com.tencent.mm.ui.base.preference.Preference h18 = h0Var.h("roominfo_contact_anchor");
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = h18 instanceof com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference ? (com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference) h18 : null;
            if (contactListExpandPreference != null) {
                contactListExpandPreference.Z(new gr1.i(talker, i17, this));
            }
        }
        if (com.tencent.mm.storage.z3.L3(this.f197077n)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_set_to_conv_box", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_accept_message", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("force_notify", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_set_chatting_background", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_add_blacklist", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_expose", true);
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = this.f197073g;
            contactListExpandPreference2.T(true);
            contactListExpandPreference2.V(false);
        }
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).j4(this.f197077n);
        boolean r27 = this.f197071e.r2();
        com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "initSingleView() called isContact:%s", java.lang.Boolean.valueOf(r27));
        if (!r27) {
            this.f197073g.T(false);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f197070d).notifyDataSetChanged();
        if (com.tencent.mm.storage.z3.a4(this.f197077n)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_search_chatting_content", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_set_chatting_background", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_placed_to_the_top", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("force_notify", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("seperate_line_between_force_notify_and_background", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("seperate_line_between_background_and_clear_history", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_add_blacklist", true);
        }
        if (!Z6(this.f197077n)) {
            com.tencent.mm.storage.z3 z3Var3 = this.f197071e;
            if (z3Var3 == null || !com.tencent.mm.storage.z3.p4(z3Var3.d1())) {
                ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("close_chat", true);
                com.tencent.mm.ui.base.preference.r rVar = this.f197070d;
                com.tencent.mm.storage.z3 z3Var4 = this.f197071e;
                ((com.tencent.mm.ui.base.preference.h0) rVar).m("room_del_chatting", z3Var4 == null || z3Var4.r2() || com.tencent.mm.storage.z3.V3(this.f197077n));
            } else {
                ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_placed_to_the_top", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("force_notify", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("seperate_line_between_force_notify_and_background", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_set_chatting_background", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_notify_new_msg", false);
                ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("close_chat", false);
                ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_del_chatting", true);
            }
        }
        if (com.tencent.mm.storage.z3.H4(this.f197077n)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_placed_to_the_top", true);
        }
        if (com.tencent.mm.storage.z3.R3(this.f197071e.d1())) {
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_expose", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("force_notify", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_notify_new_msg", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_set_to_conv_box", true);
            this.f197073g.T(false);
        }
        d7();
        if (this.f197073g != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(this.f197077n);
            this.f197073g.O(this.f197077n, linkedList, true);
            if (com.tencent.mm.storage.z3.V3(this.f197077n)) {
                this.f197073g.T(false);
                this.f197073g.V(false);
            }
            if (com.tencent.mm.storage.z3.H4(this.f197077n)) {
                this.f197073g.T(false);
                this.f197073g.V(false);
            }
            if (com.tencent.mm.storage.z3.a4(this.f197077n)) {
                this.f197073g.T(false);
                this.f197073g.V(false);
            }
            this.f197073g.W(true);
            if (com.tencent.mm.storage.z3.p4(this.f197077n)) {
                this.f197073g.T(false);
                this.f197073g.V(false);
                this.f197073g.W(false);
            }
        }
        boolean V3 = com.tencent.mm.storage.z3.V3(this.f197077n);
        boolean H4 = com.tencent.mm.storage.z3.H4(this.f197077n);
        ((com.tencent.mm.ui.base.preference.h0) this.f197070d).m("room_accept_message", !(V3 || H4));
        if (V3) {
            a7(((com.tencent.mm.plugin.finder.storage.dj0) ((jz5.n) ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).f126196d).getValue()).J0(this.f197077n).field_rejectMsg == 1);
        }
        if (H4) {
            mj4.w Ai = ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ai(this.f197077n);
            if (Ai != null && Ai.field_block == 1) {
                z17 = true;
            }
            a7(z17);
        }
        c7();
        ((com.tencent.mm.ui.base.preference.h0) this.f197070d).notifyDataSetChanged();
        super.onResume();
        if (this.f197086w) {
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("need_matte_high_light_item");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            int o17 = ((com.tencent.mm.ui.base.preference.h0) this.f197070d).o(stringExtra);
            setSelection(o17 - 3);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.ui.vi(this, o17), 10L);
        }
        this.f197086w = true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(la5.i1.class);
        hashSet.add(un.j1.class);
    }
}
