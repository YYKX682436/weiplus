package com.tencent.mm.plugin.profile.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/ContactMoreInfoUIWxContact;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ContactMoreInfoUIWxContact extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f153694y = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f153695d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153696e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.contact.o f153697f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f153698g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f153700i;

    /* renamed from: n, reason: collision with root package name */
    public xm3.t0 f153702n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f153704p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f153705q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f153706r;

    /* renamed from: s, reason: collision with root package name */
    public long f153707s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f153708t;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f153711w;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f153699h = new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.ContactMoreInfoUI", null, 1);

    /* renamed from: m, reason: collision with root package name */
    public final pr3.h f153701m = new pr3.h();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f153703o = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f153709u = jz5.h.b(new hr3.w3(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f153710v = jz5.h.b(new hr3.t5(this));

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f153712x = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public static final void U6(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact, pr3.c cVar, com.tencent.mm.contact.o oVar, int i17) {
        contactMoreInfoUIWxContact.getClass();
        cVar.f357958i = true;
        cVar.f357966t = new hr3.x3(contactMoreInfoUIWxContact, oVar, i17);
    }

    public static final void V6(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact, com.tencent.mm.contact.o oVar, int i17) {
        if (oVar == null) {
            contactMoreInfoUIWxContact.getClass();
            return;
        }
        yq3.v vVar = (yq3.v) oVar;
        boolean z17 = true;
        com.tencent.mm.plugin.profile.p2.Bi(contactMoreInfoUIWxContact.getIntent(), i17, 1, vVar.h());
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "click event");
        android.content.Intent intent = new android.content.Intent(contactMoreInfoUIWxContact.getIntent());
        intent.putExtra("scroll_to", i17);
        if (vVar.k()) {
            intent.putExtra("Contact_User", contactMoreInfoUIWxContact.f153696e);
            intent.putExtra("view_mode", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.m(intent, contactMoreInfoUIWxContact);
            return;
        }
        java.lang.String str = contactMoreInfoUIWxContact.f153696e;
        if (str == null) {
            str = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username is ");
        sb6.append(str);
        sb6.append(", contact: ");
        sb6.append(vVar.h());
        sb6.append(", nickname: ");
        com.tencent.mm.storage.z3 z3Var = vVar.f464535f;
        sb6.append(z3Var != null ? z3Var.P0() : null);
        sb6.append(", remark: ");
        sb6.append(vVar.c());
        sb6.append(", username: ");
        sb6.append(contactMoreInfoUIWxContact.f153696e);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ContactMoreInfoUI", "view stranger remark, username is null");
            return;
        }
        java.lang.String stringExtra = contactMoreInfoUIWxContact.getIntent().getStringExtra("Contact_Nick");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "nickname: " + stringExtra);
        intent.putExtra("Contact_mode_name_type", 0);
        intent.putExtra("Contact_ModStrangerRemark", true);
        intent.putExtra("Contact_User", str);
        com.tencent.mm.storage.z3 z3Var2 = vVar.f464535f;
        java.lang.String P0 = z3Var2 != null ? z3Var2.P0() : null;
        if (P0 != null && P0.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            stringExtra = P0;
        }
        intent.putExtra("Contact_Nick", stringExtra);
        intent.putExtra("Contact_RemarkName", vVar.c());
        android.content.Intent intent2 = contactMoreInfoUIWxContact.getIntent();
        int intExtra = intent2 != null ? intent2.getIntExtra("key_label_click_source", 0) : 0;
        if (intExtra != 0) {
            intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.y(intent, contactMoreInfoUIWxContact);
    }

    public static /* synthetic */ void Z6(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact, int i17, yz5.p pVar, yz5.p pVar2, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            pVar = hr3.o5.f283850d;
        }
        if ((i18 & 4) != 0) {
            pVar2 = hr3.p5.f283876d;
        }
        contactMoreInfoUIWxContact.Y6(i17, pVar, pVar2);
    }

    public final void W6(pr3.c cVar, com.tencent.mm.contact.o oVar, pr3.f fVar, boolean z17) {
        java.util.List j17 = com.tencent.mm.plugin.profile.n2.f153540a.j(oVar, getIntent());
        java.lang.String r17 = i65.a.r(this, com.tencent.mm.R.string.oc7);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        cVar.f357956g = kz5.n0.g0(j17, r17, null, null, 0, null, null, 62, null);
        kotlin.jvm.internal.o.g(fVar, "<set-?>");
        cVar.f357963q = fVar;
    }

    public final boolean X6() {
        com.tencent.mm.contact.o oVar = this.f153697f;
        return (oVar != null && !((yq3.v) oVar).k()) && getIntent().getBooleanExtra("User_Verify", false);
    }

    public final void Y6(int i17, yz5.p pVar, yz5.p pVar2) {
        pr3.c cVar;
        pr3.h hVar = this.f153701m;
        pr3.c cVar2 = new pr3.c(((java.util.ArrayList) hVar.f357976d).size(), i17, 0, null, 0, false, null, null, null, null, null, null, null, null, 16380, null);
        java.lang.Object obj = this.f153697f;
        if (obj != null) {
            cVar = cVar2;
            pVar.invoke(cVar, obj);
        } else {
            cVar = cVar2;
        }
        ((java.util.ArrayList) hVar.f357976d).add(cVar);
        ((java.util.ArrayList) this.f153703o).add(new hr3.q5(this, pVar2, cVar));
    }

    public final void a7(int i17, int i18) {
        pr3.h hVar = this.f153701m;
        ((java.util.ArrayList) hVar.f357976d).add(new pr3.d(((java.util.ArrayList) hVar.f357976d).size(), i17, i18, true));
    }

    public final void b7() {
        getIntent().getBooleanExtra("Is_RoomOwner", false);
        this.f153698g = getIntent().getStringExtra("Contact_ChatRoomId");
        this.f153696e = getIntent().getStringExtra("Contact_User");
        this.f153697f = ((yq3.e) ((com.tencent.mm.contact.p) i95.n0.c(com.tencent.mm.contact.p.class))).wi(this.f153696e, getIntent());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.contact.o oVar = this.f153697f;
        sb6.append(oVar != null ? ((yq3.v) oVar).e() : null);
        sb6.append(" ?: ");
        com.tencent.mm.contact.o oVar2 = this.f153697f;
        sb6.append(oVar2 != null ? ((yq3.v) oVar2).h() : null);
        sb6.append(" ?: ");
        sb6.append(this.f153696e);
        sb6.append(", nickname: ");
        com.tencent.mm.contact.o oVar3 = this.f153697f;
        sb6.append(oVar3 != null ? ((yq3.v) oVar3).d() : null);
        sb6.append(", ");
        com.tencent.mm.contact.o oVar4 = this.f153697f;
        sb6.append(oVar4 != null ? java.lang.Boolean.valueOf(((yq3.v) oVar4).k()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", sb6.toString());
        this.f153704p = getIntent().getStringExtra("KLinkedInAddFriendNickName");
        this.f153705q = getIntent().getStringExtra("KLinkedInAddFriendPubUrl");
        this.f153706r = getIntent().getStringExtra("verify_gmail");
        getIntent().getStringExtra("profileName");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488688a26;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        super.onCreate(bundle);
        b7();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate, contact: ");
        sb6.append(this.f153697f);
        sb6.append(", isContact:");
        com.tencent.mm.contact.o oVar = this.f153697f;
        sb6.append(oVar != null ? java.lang.Boolean.valueOf(((yq3.v) oVar).k()) : null);
        sb6.append(" desc: ");
        com.tencent.mm.contact.o oVar2 = this.f153697f;
        sb6.append(oVar2 != null ? ((yq3.v) oVar2).f() : null);
        sb6.append(", chatRoomName: ");
        sb6.append(getIntent().getStringExtra("Contact_RoomNickname"));
        sb6.append(", addScene: ");
        sb6.append(((java.lang.Number) ((jz5.n) this.f153709u).getValue()).intValue());
        sb6.append(" searchMobile:");
        sb6.append((java.lang.String) ((jz5.n) this.f153710v).getValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", sb6.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f153698g)) {
            this.f153700i = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(this.f153698g);
        }
        setMMTitle(com.tencent.mm.R.string.o3p);
        setBackBtn(new hr3.q4(this));
        com.tencent.mm.contact.o oVar3 = this.f153697f;
        a7(com.tencent.mm.storage.z3.m4(oVar3 != null ? ((yq3.v) oVar3).h() : null) ? com.tencent.mm.R.string.nbi : com.tencent.mm.R.string.nbh, com.tencent.mm.R.dimen.f479567j);
        Y6(com.tencent.mm.R.string.f492552gy2, new hr3.b5(this), new hr3.e5(this));
        com.tencent.mm.contact.o oVar4 = this.f153697f;
        if (!com.tencent.mm.storage.z3.m4(oVar4 != null ? ((yq3.v) oVar4).h() : null)) {
            Y6(com.tencent.mm.R.string.gxv, new hr3.f5(this), new hr3.g5(this));
            Y6(com.tencent.mm.R.string.gxu, hr3.h5.f283606d, new hr3.i5(this));
            Y6(com.tencent.mm.R.string.gxx, new hr3.j5(this), new hr3.k5(this));
            Y6(com.tencent.mm.R.string.f490967nb4, new hr3.f4(this), new hr3.g4(this));
        }
        com.tencent.mm.contact.o oVar5 = this.f153697f;
        if ((oVar5 != null && ((yq3.v) oVar5).k()) || X6()) {
            com.tencent.mm.contact.o oVar6 = this.f153697f;
            if (!com.tencent.mm.storage.z3.m4(oVar6 != null ? ((yq3.v) oVar6).h() : null)) {
                a7(com.tencent.mm.R.string.f490962nb2, com.tencent.mm.R.dimen.f479876hp);
            }
            Y6(com.tencent.mm.R.string.nbc, hr3.h4.f283605d, new hr3.i4(this));
        }
        a7(com.tencent.mm.R.string.nb8, com.tencent.mm.R.dimen.f479876hp);
        Y6(com.tencent.mm.R.string.bcy, hr3.j4.f283669d, new hr3.k4(this));
        Y6(com.tencent.mm.R.string.f490970be5, hr3.l4.f283742d, new hr3.n4(this));
        Y6(com.tencent.mm.R.string.f490963nb3, hr3.o4.f283849d, new hr3.p4(this));
        Y6(com.tencent.mm.R.string.bda, hr3.r4.f283937d, new hr3.s4(this));
        Y6(com.tencent.mm.R.string.bhc, hr3.t4.f283999d, new hr3.u4(this));
        Y6(com.tencent.mm.R.string.biq, hr3.v4.f284098d, new hr3.w4(this));
        Z6(this, com.tencent.mm.R.string.mf8, null, new hr3.x4(this), 2, null);
        Z6(this, com.tencent.mm.R.string.bd8, null, hr3.y4.f284202d, 2, null);
        Z6(this, com.tencent.mm.R.string.bhh, null, new hr3.z4(this), 2, null);
        Z6(this, com.tencent.mm.R.string.bhl, null, new hr3.a5(this), 2, null);
        Z6(this, com.tencent.mm.R.string.bhf, null, new hr3.c5(this), 2, null);
        Z6(this, com.tencent.mm.R.string.bhj, null, new hr3.d5(this), 2, null);
        pr3.h hVar = this.f153701m;
        ((java.util.ArrayList) hVar.f357976d).add(new pr3.a(((java.util.ArrayList) hVar.f357976d).size(), com.tencent.mm.R.dimen.alm));
        this.f153702n = new xm3.t0(hVar, this, new in5.s() { // from class: com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact$initItems$32
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type != 0 ? type != 1 ? new pr3.i() : new pr3.o() : new pr3.n();
            }
        }, true);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.m7k);
        wxRecyclerView2.setItemAnimator(null);
        wxRecyclerView2.setAdapter(this.f153702n);
        wxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        this.f153695d = wxRecyclerView2;
        android.content.Intent intent = getIntent();
        com.tencent.mm.contact.o oVar7 = this.f153697f;
        com.tencent.mm.plugin.profile.p2.Bi(intent, 45, 1, oVar7 != null ? ((yq3.v) oVar7).h() : null);
        int intExtra = getIntent().getIntExtra("scroll_to", -1);
        if (intExtra <= 0 || (wxRecyclerView = this.f153695d) == null) {
            return;
        }
        wxRecyclerView.post(new hr3.r5(this, intExtra));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f153699h;
        if (lifecycleScope != null) {
            lifecycleScope.onDestroy();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        super.onResume();
        b7();
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "onResume, data: ".concat(kz5.n0.g0(this.f153701m.f357976d, "\n", null, null, 0, null, hr3.s5.f283968d, 30, null)));
        java.util.Iterator it = this.f153703o.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
        xm3.t0 t0Var = this.f153702n;
        if (t0Var == null || (mvvmList = t0Var.I) == null) {
            return;
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList.r(mvvmList, null, 1, null);
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(j93.n.class);
        super.superImportUIComponents(set);
    }
}
