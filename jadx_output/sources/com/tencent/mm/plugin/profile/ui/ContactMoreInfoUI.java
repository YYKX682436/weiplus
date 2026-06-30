package com.tencent.mm.plugin.profile.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/ContactMoreInfoUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ContactMoreInfoUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f153674z = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f153675d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153676e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f153677f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.ya f153678g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f153679h;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f153681m;

    /* renamed from: o, reason: collision with root package name */
    public xm3.t0 f153683o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f153685q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f153686r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f153687s;

    /* renamed from: t, reason: collision with root package name */
    public long f153688t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f153689u;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f153692x;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f153680i = new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.ContactMoreInfoUI", null, 1);

    /* renamed from: n, reason: collision with root package name */
    public final pr3.h f153682n = new pr3.h();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f153684p = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f153690v = jz5.h.b(new hr3.x1(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f153691w = jz5.h.b(new hr3.v3(this));

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f153693y = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public static final void T6(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, pr3.c cVar, com.tencent.mm.storage.z3 z3Var, int i17) {
        contactMoreInfoUI.getClass();
        cVar.f357958i = true;
        cVar.f357966t = new hr3.y1(contactMoreInfoUI, z3Var, i17);
    }

    public static final void U6(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, pr3.c cVar, com.tencent.mm.storage.z3 z3Var, pr3.f fVar) {
        com.tencent.mm.plugin.profile.n2 n2Var = com.tencent.mm.plugin.profile.n2.f153540a;
        android.content.Intent intent = contactMoreInfoUI.getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        java.util.List k17 = n2Var.k(z3Var, intent);
        java.lang.String r17 = i65.a.r(contactMoreInfoUI, com.tencent.mm.R.string.oc7);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        cVar.f357956g = kz5.n0.g0(k17, r17, null, null, 0, null, null, 62, null);
        kotlin.jvm.internal.o.g(fVar, "<set-?>");
        cVar.f357963q = fVar;
    }

    public static final void V6(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, com.tencent.mm.storage.z3 z3Var, int i17) {
        if (z3Var == null) {
            contactMoreInfoUI.getClass();
            return;
        }
        boolean z17 = true;
        com.tencent.mm.plugin.profile.p2.Bi(contactMoreInfoUI.getIntent(), i17, 1, z3Var.d1());
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "click event");
        android.content.Intent intent = new android.content.Intent(contactMoreInfoUI.getIntent());
        intent.putExtra("scroll_to", i17);
        if (z3Var.r2()) {
            intent.putExtra("Contact_User", contactMoreInfoUI.f153676e);
            intent.putExtra("view_mode", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.m(intent, contactMoreInfoUI);
            return;
        }
        java.lang.String str = contactMoreInfoUI.f153676e;
        if (str == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "username is " + str + ", contact: " + z3Var.d1() + ", nickname: " + z3Var.P0() + ", remark: " + z3Var.w0() + ", username: " + contactMoreInfoUI.f153676e);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ContactMoreInfoUI", "view stranger remark, username is null");
            return;
        }
        java.lang.String stringExtra = contactMoreInfoUI.getIntent().getStringExtra("Contact_Nick");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "nickname: " + stringExtra);
        intent.putExtra("Contact_mode_name_type", 0);
        intent.putExtra("Contact_ModStrangerRemark", true);
        intent.putExtra("Contact_User", str);
        java.lang.String P0 = z3Var.P0();
        if (!(P0 == null || P0.length() == 0)) {
            stringExtra = P0;
        }
        intent.putExtra("Contact_Nick", stringExtra);
        java.lang.String w07 = z3Var.w0();
        if (w07 != null && w07.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.storage.ya yaVar = contactMoreInfoUI.f153678g;
            w07 = yaVar != null ? yaVar.field_conRemark : null;
        }
        intent.putExtra("Contact_RemarkName", w07);
        android.content.Intent intent2 = contactMoreInfoUI.getIntent();
        int intExtra = intent2 != null ? intent2.getIntExtra("key_label_click_source", 0) : 0;
        if (intExtra != 0) {
            intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.y(intent, contactMoreInfoUI);
    }

    public static /* synthetic */ void Y6(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, int i17, yz5.p pVar, yz5.p pVar2, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            pVar = hr3.q3.f283908d;
        }
        if ((i18 & 4) != 0) {
            pVar2 = hr3.r3.f283936d;
        }
        contactMoreInfoUI.X6(i17, pVar, pVar2);
    }

    public final boolean W6() {
        com.tencent.mm.storage.z3 z3Var = this.f153677f;
        return (z3Var != null && !z3Var.r2()) && getIntent().getBooleanExtra("User_Verify", false);
    }

    public final void X6(int i17, yz5.p pVar, yz5.p pVar2) {
        pr3.c cVar;
        pr3.h hVar = this.f153682n;
        pr3.c cVar2 = new pr3.c(((java.util.ArrayList) hVar.f357976d).size(), i17, 0, null, 0, false, null, null, null, null, null, null, null, null, 16380, null);
        java.lang.Object obj = this.f153677f;
        if (obj != null) {
            cVar = cVar2;
            pVar.invoke(cVar, obj);
        } else {
            cVar = cVar2;
        }
        ((java.util.ArrayList) hVar.f357976d).add(cVar);
        ((java.util.ArrayList) this.f153684p).add(new hr3.s3(this, pVar2, cVar));
    }

    public final void Z6(int i17, int i18) {
        pr3.h hVar = this.f153682n;
        ((java.util.ArrayList) hVar.f357976d).add(new pr3.d(((java.util.ArrayList) hVar.f357976d).size(), i17, i18, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if ((r1 == null || r26.n0.N(r1)) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.a7():void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488688a26;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        super.onCreate(bundle);
        a7();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate, contact: ");
        sb6.append(this.f153677f);
        sb6.append(", isContact:");
        com.tencent.mm.storage.z3 z3Var = this.f153677f;
        sb6.append(z3Var != null ? java.lang.Boolean.valueOf(z3Var.r2()) : null);
        sb6.append(" desc: ");
        com.tencent.mm.storage.z3 z3Var2 = this.f153677f;
        sb6.append(z3Var2 != null ? z3Var2.f236589y1 : null);
        sb6.append(", stranger: ");
        sb6.append(this.f153678g);
        sb6.append(", stranger desc: ");
        com.tencent.mm.storage.ya yaVar = this.f153678g;
        sb6.append(yaVar != null ? yaVar.field_conDescription : null);
        sb6.append(", chatRoomName: ");
        sb6.append(getIntent().getStringExtra("Contact_RoomNickname"));
        sb6.append(", addScene: ");
        sb6.append(((java.lang.Number) ((jz5.n) this.f153690v).getValue()).intValue());
        sb6.append(" searchMobile:");
        sb6.append((java.lang.String) ((jz5.n) this.f153691w).getValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", sb6.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f153679h)) {
            this.f153681m = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(this.f153679h);
        }
        setMMTitle(com.tencent.mm.R.string.o3p);
        setBackBtn(new hr3.s2(this));
        com.tencent.mm.storage.z3 z3Var3 = this.f153677f;
        Z6(com.tencent.mm.storage.z3.m4(z3Var3 != null ? z3Var3.d1() : null) ? com.tencent.mm.R.string.nbi : com.tencent.mm.R.string.nbh, com.tencent.mm.R.dimen.f479567j);
        X6(com.tencent.mm.R.string.f492552gy2, new hr3.d3(this), new hr3.g3(this));
        com.tencent.mm.storage.z3 z3Var4 = this.f153677f;
        if (!com.tencent.mm.storage.z3.m4(z3Var4 != null ? z3Var4.d1() : null)) {
            X6(com.tencent.mm.R.string.gxv, new hr3.h3(this), new hr3.i3(this));
            X6(com.tencent.mm.R.string.gxu, hr3.j3.f283668d, new hr3.k3(this));
            X6(com.tencent.mm.R.string.gxx, new hr3.l3(this), new hr3.m3(this));
            X6(com.tencent.mm.R.string.f490967nb4, new hr3.h2(this), new hr3.i2(this));
        }
        com.tencent.mm.storage.z3 z3Var5 = this.f153677f;
        if ((z3Var5 != null && z3Var5.r2()) || W6()) {
            com.tencent.mm.storage.z3 z3Var6 = this.f153677f;
            if (!com.tencent.mm.storage.z3.m4(z3Var6 != null ? z3Var6.d1() : null)) {
                Z6(com.tencent.mm.R.string.f490962nb2, com.tencent.mm.R.dimen.f479876hp);
            }
            X6(com.tencent.mm.R.string.nbc, hr3.j2.f283667d, new hr3.k2(this));
        }
        Z6(com.tencent.mm.R.string.nb8, com.tencent.mm.R.dimen.f479876hp);
        X6(com.tencent.mm.R.string.bcy, hr3.l2.f283740d, new hr3.m2(this));
        X6(com.tencent.mm.R.string.f490970be5, hr3.n2.f283819d, new hr3.p2(this));
        X6(com.tencent.mm.R.string.f490963nb3, hr3.q2.f283907d, new hr3.r2(this));
        X6(com.tencent.mm.R.string.bda, hr3.t2.f283996d, new hr3.u2(this));
        X6(com.tencent.mm.R.string.bhc, hr3.v2.f284096d, new hr3.w2(this));
        X6(com.tencent.mm.R.string.biq, hr3.x2.f284166d, new hr3.y2(this));
        Y6(this, com.tencent.mm.R.string.mf8, null, new hr3.z2(this), 2, null);
        Y6(this, com.tencent.mm.R.string.bd8, null, hr3.a3.f283374d, 2, null);
        Y6(this, com.tencent.mm.R.string.bhh, null, new hr3.b3(this), 2, null);
        Y6(this, com.tencent.mm.R.string.bhl, null, new hr3.c3(this), 2, null);
        Y6(this, com.tencent.mm.R.string.bhf, null, new hr3.e3(this), 2, null);
        Y6(this, com.tencent.mm.R.string.bhj, null, new hr3.f3(this), 2, null);
        pr3.h hVar = this.f153682n;
        ((java.util.ArrayList) hVar.f357976d).add(new pr3.a(((java.util.ArrayList) hVar.f357976d).size(), com.tencent.mm.R.dimen.alm));
        this.f153683o = new xm3.t0(hVar, this, new in5.s() { // from class: com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI$initItems$32
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type != 0 ? type != 1 ? new pr3.i() : new pr3.o() : new pr3.n();
            }
        }, true);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.m7k);
        wxRecyclerView2.setItemAnimator(null);
        wxRecyclerView2.setAdapter(this.f153683o);
        wxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        this.f153675d = wxRecyclerView2;
        android.content.Intent intent = getIntent();
        com.tencent.mm.storage.z3 z3Var7 = this.f153677f;
        com.tencent.mm.plugin.profile.p2.Bi(intent, 45, 1, z3Var7 != null ? z3Var7.d1() : null);
        int intExtra = getIntent().getIntExtra("scroll_to", -1);
        if (intExtra <= 0 || (wxRecyclerView = this.f153675d) == null) {
            return;
        }
        wxRecyclerView.post(new hr3.t3(this, intExtra));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f153680i;
        if (lifecycleScope != null) {
            lifecycleScope.onDestroy();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        super.onResume();
        a7();
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "onResume, data: ".concat(kz5.n0.g0(this.f153682n.f357976d, "\n", null, null, 0, null, hr3.u3.f284042d, 30, null)));
        java.util.Iterator it = this.f153684p.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
        xm3.t0 t0Var = this.f153683o;
        if (t0Var == null || (mvvmList = t0Var.I) == null) {
            return;
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList.r(mvvmList, null, 1, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(j93.n.class);
        super.superImportUIComponents(set);
    }
}
