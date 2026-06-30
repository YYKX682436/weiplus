package com.tencent.mm.ui.contact.privacy;

@db5.a(32768)
/* loaded from: classes10.dex */
public abstract class ContactMgrUIBase extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.ui.contact.l4, l75.z0, com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int E = 0;
    public boolean A;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f207102f;

    /* renamed from: g, reason: collision with root package name */
    public uf5.w0 f207103g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f207104h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f207105i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f207106m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.contact.ContactCountView f207107n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.EditText f207108o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f207109p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f207110q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f207111r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f207112s;

    /* renamed from: t, reason: collision with root package name */
    public int f207113t;

    /* renamed from: x, reason: collision with root package name */
    public int f207117x;

    /* renamed from: y, reason: collision with root package name */
    public int f207118y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f207119z;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f207100d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f207101e = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f207114u = null;

    /* renamed from: v, reason: collision with root package name */
    public final int f207115v = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 30);

    /* renamed from: w, reason: collision with root package name */
    public final int f207116w = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForClient", 30);
    public final android.os.Handler B = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.lang.Runnable C = new uf5.k0(this);
    public final uf5.j1 D = new uf5.j1(this);

    public android.widget.ListView O3() {
        return this.f207102f;
    }

    public abstract uf5.w0 T6(com.tencent.mm.ui.contact.l4 l4Var);

    public java.lang.CharSequence U6() {
        return getResources().getString(com.tencent.mm.R.string.hlf);
    }

    public abstract void V6();

    @Override // com.tencent.mm.ui.contact.l4
    public java.lang.String W5(com.tencent.mm.ui.contact.item.d dVar) {
        return null;
    }

    public abstract void W6();

    public void X6(android.content.Intent intent, android.content.Context context) {
    }

    public abstract boolean Y6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17);

    public abstract void Z6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17);

    public void a7(android.content.Intent intent, android.content.Context context) {
    }

    public void b7(android.content.Intent intent) {
        intent.putExtra("already_select_contact", (java.lang.String[]) this.f207100d.toArray(new java.lang.String[0]));
        intent.putExtra("privacy_del_tips", this.f207112s);
        intent.putExtra("privacy_source_type", this.f207103g.v());
    }

    public void c7() {
        if (this.f207119z) {
            this.f207119z = false;
            android.widget.Toast.makeText(this, getString(com.tencent.mm.R.string.hld), 0).show();
        }
        if (this.A) {
            this.A = false;
            android.widget.Toast.makeText(this, getString(com.tencent.mm.R.string.hle), 0).show();
        }
    }

    public void d7() {
        if (this.f207119z) {
            this.f207119z = false;
            android.widget.Toast.makeText(this, getString(com.tencent.mm.R.string.f489888ej), 0).show();
        }
        if (this.A) {
            this.A = false;
            android.widget.Toast.makeText(this, getString(com.tencent.mm.R.string.f489891em), 0).show();
        }
    }

    public void e7() {
        this.f207107n.setFixedContactCount(this.f207103g.u());
        this.f207104h.setVisibility(this.f207103g.u() == 0 ? 0 : 8);
        this.f207110q.setEnabled(this.f207103g.u() > 0);
    }

    public synchronized void f7() {
        this.B.removeCallbacksAndMessages(null);
        this.B.post(this.C);
    }

    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMgrUIBase", "onNotifyChange: event = " + i17 + " stg = " + a1Var + " obj = " + obj);
        if (i17 == 4) {
            g7();
        }
    }

    public synchronized void g7() {
        this.B.removeCallbacksAndMessages(null);
        this.B.postDelayed(this.C, 350L);
    }

    public android.app.Activity getActivity() {
        return this;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c_y;
    }

    public void h7() {
    }

    public void i7() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
    
        if ("@social.black.android".equals(r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x003c, code lost:
    
        if (r9 != 6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r9 != 6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r9 = false;
     */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(U6());
        this.f207102f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f485880jf5);
        setToTop(new uf5.l0(this));
        this.f207104h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfx);
        this.f207105i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483450aw0);
        this.f207103g = T6(this);
        this.f207106m = findViewById(com.tencent.mm.R.id.meq);
        java.lang.String stringExtra = getIntent().getStringExtra("intent_status_show_bottom_tips");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f207105i.setVisibility(8);
        } else {
            this.f207105i.setText(stringExtra);
            this.f207105i.setVisibility(0);
        }
        this.f207102f.setOnItemClickListener(new uf5.m0(this));
        this.f207102f.setOnItemLongClickListener(new uf5.p0(this));
        this.f207102f.setOnTouchListener(new uf5.q0(this));
        this.f207102f.setAdapter((android.widget.ListAdapter) this.f207103g);
        android.widget.ListView listView = this.f207102f;
        com.tencent.mm.ui.contact.ContactCountView contactCountView = new com.tencent.mm.ui.contact.ContactCountView(this);
        this.f207107n = contactCountView;
        listView.addFooterView(contactCountView, null, false);
        this.f207107n.setVisible(false);
        ((com.tencent.mm.chatroom.ui.SelectMemberScrollBar) findViewById(com.tencent.mm.R.id.jft)).setOnScrollBarTouchListener(new uf5.r0(this));
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.mjh);
        this.f207108o = mMEditText;
        mMEditText.addTextChangedListener(new uf5.t0(this));
        android.view.View view = this.f207106m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f207109p = (android.widget.Button) findViewById(com.tencent.mm.R.id.f482692lf);
        this.f207110q = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485456hq1);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.crz);
        this.f207111r = button;
        button.setEnabled(false);
        this.f207109p.setVisibility(0);
        this.f207110q.setVisibility(0);
        this.f207111r.setVisibility(8);
        this.f207109p.setOnClickListener(new uf5.u0(this));
        this.f207110q.setOnClickListener(new uf5.v0(this));
        setBackBtn(new uf5.h0(this));
        e7();
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(3990, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.D.c();
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(3990, this);
        this.f207103g.k();
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMgrUIBase", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + ", scene type = " + m1Var.getType());
    }

    @Override // com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        if (!(dVar instanceof com.tencent.mm.ui.contact.item.u)) {
            return false;
        }
        return ((java.util.LinkedList) this.f207103g.f427318r).contains(((com.tencent.mm.ui.contact.item.u) dVar).f206819z);
    }
}
