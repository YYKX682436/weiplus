package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class ChatroomContactUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, l75.q0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f206338u = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f206339d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.contact.ContactCountView f206340e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout f206341f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f206342g;

    /* renamed from: h, reason: collision with root package name */
    public a31.v f206343h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f206344i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.contact.s0 f206345m;

    /* renamed from: n, reason: collision with root package name */
    public yk5.u f206346n;

    /* renamed from: o, reason: collision with root package name */
    public rl5.r f206347o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f206348p;

    /* renamed from: q, reason: collision with root package name */
    public int f206349q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f206350r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final db5.t4 f206351s = new com.tencent.mm.ui.contact.y0(this);

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.b0 f206352t = new com.tencent.mm.pluginsdk.ui.b0(new com.tencent.mm.ui.contact.z0(this));

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488398s8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dg6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/ui/contact/ChatroomContactUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482735mf);
        this.f206339d = listView;
        listView.setAdapter((android.widget.ListAdapter) null);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dg6);
        this.f206344i = textView2;
        textView2.setText(com.tencent.mm.R.string.f489898eu);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487370og0);
        this.f206342g = findViewById;
        findViewById.setOnTouchListener(new com.tencent.mm.ui.contact.a1(this));
        com.tencent.mm.ui.contact.s0 s0Var = new com.tencent.mm.ui.contact.s0(this, "@all.chatroom.contact");
        this.f206345m = s0Var;
        s0Var.r(true);
        yk5.u uVar = new yk5.u(getContext(), 1);
        this.f206346n = uVar;
        uVar.f462907q = "@all.chatroom.contact";
        a31.v vVar = new a31.v(true, true);
        this.f206343h = vVar;
        com.tencent.mm.ui.contact.b1 b1Var = new com.tencent.mm.ui.contact.b1(this);
        vVar.f999u = b1Var;
        vVar.f210324i = b1Var;
        addSearchMenu(true, vVar);
        this.f206345m.getClass();
        this.f206345m.getClass();
        this.f206345m.getClass();
        android.widget.ListView listView2 = this.f206339d;
        com.tencent.mm.pluginsdk.ui.b0 b0Var = this.f206352t;
        listView2.setOnScrollListener(b0Var);
        this.f206345m.f207167s = b0Var;
        this.f206347o = new rl5.r(getContext());
        this.f206339d.setOnItemClickListener(new com.tencent.mm.ui.contact.c1(this));
        this.f206339d.setOnItemLongClickListener(new com.tencent.mm.ui.contact.d1(this));
        this.f206339d.setOnTouchListener(new com.tencent.mm.ui.contact.t0(this));
        android.widget.ListView listView3 = this.f206339d;
        com.tencent.mm.ui.contact.ContactCountView contactCountView = new com.tencent.mm.ui.contact.ContactCountView(this);
        this.f206340e = contactCountView;
        listView3.addFooterView(contactCountView, null, false);
        setBackBtn(new com.tencent.mm.ui.contact.u0(this));
        setToTop(new com.tencent.mm.ui.contact.v0(this));
        this.f206339d.setAdapter((android.widget.ListAdapter) this.f206345m);
        this.f206346n.y(false);
        this.f206339d.setVisibility(0);
        this.f206341f = new com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(14);
        this.f206341f.setLayoutParams(layoutParams);
        this.f206341f.setTopMargin(com.tencent.mm.sdk.platformtools.j.d(this, 100.0f));
        this.f206341f.setVisibility(8);
        ((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.p7i)).addView(this.f206341f);
        com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout = this.f206341f;
        if (voiceSearchLayout != null) {
            voiceSearchLayout.setOnVisibleChangeListener(new com.tencent.mm.ui.contact.x0(this));
        }
        if (this.f206345m.getCount() == 0) {
            this.f206344i.setSingleLine(false);
            this.f206344i.setPadding(40, 0, 40, 0);
            this.f206344i.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f489865dw);
        initView();
        c01.d9.e().a(138, this);
        ((l75.a1) c01.d9.b().q()).a(this.f206345m);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChatroomContactUI)).Rj(this, iy1.a.GroupChatList);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        if (((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f206348p, true) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomContactUI", "onCreateContextMenu, contact is null, username = " + this.f206348p);
        } else if (c01.e2.M(this.f206348p)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = view.getContext();
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f206348p;
            ((sg3.a) v0Var).getClass();
            java.lang.String e17 = c01.a2.e(str);
            ((ke0.e) xVar).getClass();
            contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context, e17));
            contextMenu.add(adapterContextMenuInfo.position, 1, 0, com.tencent.mm.R.string.f489894eq);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(138, this);
        ((l75.a1) c01.d9.b().q()).e(this.f206345m);
        com.tencent.mm.ui.contact.s0 s0Var = this.f206345m;
        bb5.g gVar = s0Var.f207165q;
        if (gVar != null) {
            gVar.a();
            s0Var.f207165q = null;
        }
        this.f206345m.c();
        this.f206345m.f212611h = null;
        yk5.u uVar = this.f206346n;
        bb5.g gVar2 = uVar.f462916z;
        if (gVar2 != null) {
            gVar2.a();
            uVar.f462916z = null;
        }
        this.f206346n.c();
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.ui.contact.ContactCountView contactCountView = this.f206340e;
        if (contactCountView != null) {
            contactCountView.setContactType(2);
            this.f206340e.a();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        c01.d9.b().l().remove(this);
        a31.v vVar = this.f206343h;
        if (vVar != null) {
            vVar.b();
            vVar.s();
        }
        yk5.u uVar = this.f206346n;
        if (uVar != null) {
            c01.d9.e().q(106, uVar);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.ui.contact.ContactCountView contactCountView = this.f206340e;
        if (contactCountView != null) {
            contactCountView.setContactType(2);
            this.f206340e.a();
        }
        c01.d9.b().l().add(this);
        if (this.f206343h != null && this.f206341f != null) {
            if (u11.c.i() || !com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN")) {
                this.f206343h.f996r = false;
            } else {
                a31.v vVar = this.f206343h;
                vVar.f996r = false;
                vVar.f1000v = this.f206341f;
                vVar.f998t = 1;
                vVar.f997s = 2;
            }
        }
        yk5.u uVar = this.f206346n;
        if (uVar != null) {
            c01.d9.e().a(106, uVar);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (com.tencent.mm.sdk.platformtools.t8.U0(this) && !com.tencent.mm.ui.pc.a(this, i17, i18, str, 4) && i17 == 0 && i18 == 0 && m1Var.getType() == 138) {
            com.tencent.mm.ui.contact.s0 s0Var = this.f206345m;
            if (s0Var != null) {
                s0Var.f();
            }
            yk5.u uVar = this.f206346n;
            if (uVar != null) {
                uVar.f();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(la5.n.class);
    }
}
