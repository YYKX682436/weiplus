package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class OnlyChatContactMgrUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.ui.contact.l4, l75.z0, com.tencent.mm.modelbase.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f206501u = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f206502d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.contact.j7 f206503e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f206504f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.contact.ContactCountView f206505g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f206506h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f206507i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f206508m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f206509n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f206510o;

    /* renamed from: p, reason: collision with root package name */
    public final int f206511p = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 30);

    /* renamed from: q, reason: collision with root package name */
    public final int f206512q = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForClient", 30);

    /* renamed from: r, reason: collision with root package name */
    public int f206513r;

    /* renamed from: s, reason: collision with root package name */
    public int f206514s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct f206515t;

    @Override // com.tencent.mm.ui.contact.l4
    public android.widget.ListView O3() {
        return this.f206502d;
    }

    @Override // com.tencent.mm.ui.contact.l4
    public java.lang.String W5(com.tencent.mm.ui.contact.item.d dVar) {
        return null;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        this.f206503e.s();
        int t17 = this.f206503e.t();
        this.f206505g.setFixedContactCount(t17);
        this.f206504f.setVisibility(t17 == 0 ? 0 : 8);
        this.f206508m.setEnabled(t17 > 0);
    }

    @Override // com.tencent.mm.ui.contact.l4
    public android.app.Activity getActivity() {
        return this;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c8j;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList P1;
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            return;
        }
        if (i17 != 3) {
            if (i17 == 2) {
                java.util.ArrayList P12 = com.tencent.mm.sdk.platformtools.t8.P1(intent.getStringExtra("Select_Contact").split(","));
                if (P12 == null || P12.isEmpty()) {
                    return;
                }
                db5.e1.B(this, getString(com.tencent.mm.R.string.f489880eb), "", getString(com.tencent.mm.R.string.f489881ec), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.contact.t6(this, P12), null, com.tencent.mm.R.color.f478622ch);
                return;
            }
            if (i17 != 1 || (P1 = com.tencent.mm.sdk.platformtools.t8.P1(intent.getStringExtra("Select_Contact").split(","))) == null || P1.isEmpty()) {
                return;
            }
            w11.h0 h0Var = new w11.h0(P1, 8388608, 1, this.f206511p);
            gm0.j1.n().f273288b.g(h0Var);
            this.f206515t.f55373e = P1.size();
            this.f206515t.f55376h = this.f206503e.t();
            this.f206515t.f55381m = java.lang.System.currentTimeMillis() - this.f206515t.f55381m;
            this.f206510o = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.e_), true, true, new com.tencent.mm.ui.contact.u6(this, h0Var));
            return;
        }
        int intExtra = intent.getIntExtra("label_id", 0);
        java.util.ArrayList P13 = b93.r.wi().P1(intExtra + "");
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.contact.SelectContactsFromRangeUI.class);
        intent2.putExtra("list_type", 1);
        intent2.putExtra("filter_type", "@all.contact.android");
        java.lang.String[] strArr = new java.lang.String[0];
        if (P13 != null) {
            strArr = (java.lang.String[]) P13.toArray(strArr);
        }
        intent2.putExtra("already_select_contact", strArr);
        intent2.putExtra("max_limit_num", this.f206512q);
        startActivityForResult(intent2, 1);
        com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct = this.f206515t;
        batchSocialBlackLogStruct.f55380l = batchSocialBlackLogStruct.b("selecttagid", intExtra + "", true);
        com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct2 = this.f206515t;
        batchSocialBlackLogStruct2.f55379k = batchSocialBlackLogStruct2.b("selecttagname", b93.r.wi().z1(intExtra + ""), true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f489874e5);
        this.f206502d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f485880jf5);
        setToTop(new com.tencent.mm.ui.contact.x6(this));
        this.f206504f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfx);
        this.f206503e = new com.tencent.mm.ui.contact.j7(this, this);
        boolean booleanExtra = getIntent().getBooleanExtra("intent_status_mgr", false);
        if (booleanExtra) {
            this.f206503e.f207078f = true;
        }
        this.f206502d.setOnItemClickListener(new com.tencent.mm.ui.contact.y6(this));
        this.f206502d.setOnItemLongClickListener(new com.tencent.mm.ui.contact.b7(this));
        this.f206502d.setOnTouchListener(new com.tencent.mm.ui.contact.c7(this));
        this.f206502d.setAdapter((android.widget.ListAdapter) this.f206503e);
        android.widget.ListView listView = this.f206502d;
        com.tencent.mm.ui.contact.ContactCountView contactCountView = new com.tencent.mm.ui.contact.ContactCountView(this);
        this.f206505g = contactCountView;
        listView.addFooterView(contactCountView, null, false);
        this.f206505g.setFixedContactCount(this.f206503e.t());
        this.f206504f.setVisibility(this.f206503e.t() == 0 ? 0 : 8);
        ((com.tencent.mm.chatroom.ui.SelectMemberScrollBar) findViewById(com.tencent.mm.R.id.jft)).setOnScrollBarTouchListener(new com.tencent.mm.ui.contact.d7(this));
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.mjh);
        this.f206506h = mMEditText;
        mMEditText.addTextChangedListener(new com.tencent.mm.ui.contact.f7(this));
        this.f206507i = (android.widget.Button) findViewById(com.tencent.mm.R.id.f482692lf);
        this.f206508m = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485456hq1);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.crz);
        this.f206509n = button;
        button.setEnabled(false);
        this.f206507i.setVisibility(booleanExtra ? 8 : 0);
        this.f206508m.setVisibility(booleanExtra ? 8 : 0);
        this.f206509n.setVisibility(booleanExtra ? 0 : 8);
        this.f206508m.setEnabled(this.f206503e.t() > 0);
        this.f206507i.setOnClickListener(new com.tencent.mm.ui.contact.g7(this));
        this.f206508m.setOnClickListener(new com.tencent.mm.ui.contact.h7(this));
        setBackBtn(new com.tencent.mm.ui.contact.i7(this));
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(3990, this);
        if (((java.util.ArrayList) com.tencent.mm.plugin.sns.model.l4.Lj().z0()).size() == 0) {
            com.tencent.mm.autogen.events.GetSnsTagListEvent getSnsTagListEvent = new com.tencent.mm.autogen.events.GetSnsTagListEvent();
            getSnsTagListEvent.f54413g.f7532a = 1;
            getSnsTagListEvent.e();
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.OnlyChatContactMgrUI)).Rj(this, iy1.a.ContactSocialBlackList);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(3990, this);
        this.f206503e.k();
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String errMsg;
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlyChatContactMgrUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.getType());
        if (m1Var instanceof w11.h0) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f206510o;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f206510o = null;
            }
            w11.h0 h0Var = (w11.h0) m1Var;
            int i19 = h0Var.f442041g;
            java.util.List list = h0Var.f442039e;
            if (i17 == 0 && i18 == 0) {
                android.widget.Toast.makeText(this, getString(i19 == 1 ? com.tencent.mm.R.string.f489888ej : com.tencent.mm.R.string.f489891em), 0).show();
                com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct = this.f206515t;
                batchSocialBlackLogStruct.f55374f = batchSocialBlackLogStruct.f55373e;
                batchSocialBlackLogStruct.f55375g = batchSocialBlackLogStruct.b("modifiedsucfriendlist", com.tencent.mm.sdk.platformtools.t8.c1(list, "#"), true);
                if (h0Var.f442041g == 1) {
                    com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct2 = this.f206515t;
                    batchSocialBlackLogStruct2.f55377i = batchSocialBlackLogStruct2.f55376h + ((java.util.LinkedList) list).size();
                } else {
                    com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct3 = this.f206515t;
                    batchSocialBlackLogStruct3.f55377i = batchSocialBlackLogStruct3.f55376h - ((java.util.LinkedList) list).size();
                }
                com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct4 = this.f206515t;
                batchSocialBlackLogStruct4.f55378j = 1L;
                batchSocialBlackLogStruct4.f55382n = batchSocialBlackLogStruct4.b("sessionid", hashCode() + "", true);
                this.f206515t.k();
                return;
            }
            int i27 = com.tencent.mm.R.string.f489886eh;
            if (i18 == -3503) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
                java.lang.String errMsg2 = m1Var.getReqResp().getRespObj().getErrMsg();
                java.lang.String string = getString(com.tencent.mm.R.string.f489886eh);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (errMsg2 == null) {
                    errMsg2 = string;
                }
                u1Var.g(errMsg2);
                u1Var.a(true);
                u1Var.j(getString(com.tencent.mm.R.string.hmr));
                u1Var.m(com.tencent.mm.R.string.hms);
                u1Var.b(new com.tencent.mm.ui.contact.v6(this));
                u1Var.q(false);
                return;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(this);
            if (i18 == -3500) {
                errMsg = getString(i19 == 1 ? com.tencent.mm.R.string.f489887ei : com.tencent.mm.R.string.f489890el, java.lang.Integer.valueOf(h0Var.f442045n - ((java.util.LinkedList) list).size()));
            } else {
                errMsg = m1Var.getReqResp().getRespObj().getErrMsg();
                if (com.tencent.mm.sdk.platformtools.t8.K0(errMsg)) {
                    if (i19 != 1) {
                        i27 = com.tencent.mm.R.string.f489889ek;
                    }
                    errMsg = getString(i27);
                }
            }
            u1Var2.g(errMsg);
            u1Var2.m(com.tencent.mm.R.string.f490507x1);
            u1Var2.l(new com.tencent.mm.ui.contact.w6(this));
            u1Var2.q(false);
        }
    }

    @Override // com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        if (!(dVar instanceof com.tencent.mm.ui.contact.item.u)) {
            return false;
        }
        return ((java.util.LinkedList) this.f206503e.f206966r).contains(((com.tencent.mm.ui.contact.item.u) dVar).f206819z);
    }
}
