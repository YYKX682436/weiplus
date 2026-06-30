package com.tencent.mm.plugin.fts.ui;

@db5.a(3)
/* loaded from: classes12.dex */
public class FTSAddWw extends com.tencent.mm.plugin.fts.ui.FTSBaseUI {
    public static final /* synthetic */ int P = 0;
    public android.widget.TextView A;
    public android.widget.TextView B;
    public boolean C;
    public boolean D;
    public com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView F;
    public com.tencent.mm.plugin.fts.ui.j H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public r45.cx5 f137889J;
    public int K;
    public android.app.Dialog L;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f137891q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f137892r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f137893s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f137894t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f137895u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f137896v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f137897w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f137898x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f137899y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f137900z;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f137890p = "";
    public int E = 1;
    public java.lang.String G = "";
    public int M = -1;
    public final q01.e N = new com.tencent.mm.plugin.fts.ui.a0(this);

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str, str2, list, oVar);
        this.C = false;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.n
    public boolean G0() {
        f7(this.f137910n);
        hideVKB();
        return true;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public com.tencent.mm.plugin.fts.ui.f0 U6(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        if (this.H == null) {
            this.H = new com.tencent.mm.plugin.fts.ui.j(w0Var);
        }
        return this.H;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void Y6() {
        super.Y6();
        setBackBtn(new com.tencent.mm.plugin.fts.ui.y(this));
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void d7() {
        super.d7();
        android.view.View view = this.f137892r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void e7() {
        super.e7();
        com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct();
        openIMSearchFriendtLogStruct.p(this.G);
        openIMSearchFriendtLogStruct.f59792e = 3L;
        openIMSearchFriendtLogStruct.k();
        android.view.View view = this.f137892r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void f7(java.lang.String str) {
        this.C = true;
        this.D = false;
        this.E = 1;
        if (str == null || str.length() == 0 || str.trim().length() == 0) {
            return;
        }
        this.M = java.lang.Character.isDigit(str.charAt(0)) ? 15 : 3;
        this.K = 0;
        ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).getClass();
        l41.e0 e0Var = new l41.e0(str, 1);
        gm0.j1.d().g(e0Var);
        this.L = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.icm), true, true, new com.tencent.mm.plugin.fts.ui.b0(this, e0Var));
    }

    public final void g7() {
        java.lang.String str = this.f137889J.f371900d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() > 0) {
            int i17 = this.f137889J.f371908o;
            if (2 == i17) {
                this.M = 15;
            } else if (1 == i17) {
                this.M = 1;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", str);
            intent.putExtra("AntispamTicket", this.f137889J.f371910q);
            if (this.M == 15 && 2 == this.f137889J.f371908o) {
                intent.putExtra("Contact_Search_Mobile", this.f137890p.trim());
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f137889J.f371911r)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAddFriendUI", "FinderUsername is empty");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAddFriendUI", "FinderUsername is " + this.f137889J.f371911r);
            }
            intent.putExtra("key_add_contact_openim_appid", this.f137889J.f371907n);
            intent.putExtra("key_add_contact_openim_finder_username", this.f137889J.f371911r);
            intent.putExtra("Contact_Nick", this.f137889J.f371901e);
            intent.putExtra("Contact_PyInitial", this.f137889J.f371902f);
            intent.putExtra("Contact_QuanPin", this.f137889J.f371903g);
            intent.putExtra("Contact_Sex", this.f137889J.f371904h);
            intent.putExtra("key_add_contact_custom_detail_visible", this.f137889J.f371909p.f370395d);
            intent.putExtra("key_add_contact_custom_detail", this.f137889J.f371909p.f370396e);
            intent.putExtra("Contact_Scene", this.M);
            intent.putExtra("key_ww_add_session_id", this.G);
            intent.putExtra("add_more_friend_search_scene", 2);
            j45.l.j(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bbs;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct();
        openIMSearchFriendtLogStruct.p(this.G);
        openIMSearchFriendtLogStruct.f59792e = 2L;
        openIMSearchFriendtLogStruct.k();
        finish();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.w
    public void onClickBackBtn(android.view.View view) {
        super.onClickBackBtn(view);
        com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct();
        openIMSearchFriendtLogStruct.p(this.G);
        openIMSearchFriendtLogStruct.f59792e = 2L;
        openIMSearchFriendtLogStruct.k();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        super.onClickClearTextBtn(view);
        if (this.f137907h.getFtsEditText().k()) {
            return;
        }
        this.f137907h.getFtsEditText().m();
        showVKB();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.G = kk.k.g((java.lang.System.currentTimeMillis() + "").getBytes());
        o13.p.f342250c = o13.n.g(16);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.tencent.mm.R.id.f482435ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        hideActionbarLine();
        this.f137908i = getContext().getResources().getString(com.tencent.mm.R.string.bkh);
        this.f137907h.getFtsEditText().setHint(W6());
        this.f137891q = findViewById(com.tencent.mm.R.id.ago);
        this.f137892r = findViewById(com.tencent.mm.R.id.cag);
        this.f137893s = findViewById(com.tencent.mm.R.id.f485212gx3);
        this.f137897w = findViewById(com.tencent.mm.R.id.cah);
        this.f137894t = findViewById(com.tencent.mm.R.id.f486143kc2);
        this.f137895u = findViewById(com.tencent.mm.R.id.ji8);
        this.f137896v = findViewById(com.tencent.mm.R.id.mdu);
        this.F = (com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView) findViewById(com.tencent.mm.R.id.lts);
        this.f137898x = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ca7);
        this.f137899y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cfq);
        this.f137900z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cal);
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cam);
        this.B = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mdw);
        try {
            java.lang.String optString = su4.o2.d("webSearchBar").optString("wording");
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAddFriendUI", "set searchNetworkTips %s", optString);
            this.B.setText(optString);
        } catch (java.lang.Exception unused) {
        }
        getContentView().postDelayed(new com.tencent.mm.plugin.fts.ui.w(this), 128L);
        this.f137891q.setOnClickListener(new com.tencent.mm.plugin.fts.ui.x(this));
        gm0.j1.d().o(vb1.e.CTRL_INDEX, this, this.N);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.C || this.D) {
            return;
        }
        su4.k3.c(this.f137910n, this.E, 3, 16);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        su4.r2.o();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.plugin.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
        if (!(gVar instanceof e23.c) || java.lang.System.currentTimeMillis() - this.I <= 1000) {
            return;
        }
        this.I = java.lang.System.currentTimeMillis();
        this.f137890p = gVar.i();
        f7(gVar.i());
        com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct();
        openIMSearchFriendtLogStruct.p(this.G);
        openIMSearchFriendtLogStruct.f59792e = 1L;
        openIMSearchFriendtLogStruct.k();
    }
}
