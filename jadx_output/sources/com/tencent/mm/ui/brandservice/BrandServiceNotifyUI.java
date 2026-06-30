package com.tencent.mm.ui.brandservice;

/* loaded from: classes11.dex */
public class BrandServiceNotifyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f198019x = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f198020d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f198021e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.brandservice.l f198022f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.l4 f198023g;

    /* renamed from: h, reason: collision with root package name */
    public rl5.r f198024h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f198025i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f198026m;

    /* renamed from: s, reason: collision with root package name */
    public long f198032s;

    /* renamed from: n, reason: collision with root package name */
    public int f198027n = 1;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f198028o = "";

    /* renamed from: p, reason: collision with root package name */
    public long f198029p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f198030q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f198031r = 0;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f198033t = com.tencent.mm.sdk.platformtools.o4.R("brandService_accounts");

    /* renamed from: u, reason: collision with root package name */
    public boolean f198034u = false;

    /* renamed from: v, reason: collision with root package name */
    public final db5.t4 f198035v = new com.tencent.mm.ui.brandservice.g(this);

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f198036w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppActiveEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.ui.brandservice.BrandServiceNotifyUI.20
        {
            this.__eventId = 2123042947;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.AppActiveEvent appActiveEvent) {
            am.q qVar;
            com.tencent.mm.autogen.events.AppActiveEvent appActiveEvent2 = appActiveEvent;
            if (appActiveEvent2 == null || (qVar = appActiveEvent2.f53977g) == null || qVar.f7684a) {
                return false;
            }
            com.tencent.mm.ui.brandservice.BrandServiceNotifyUI.this.f198029p = 0L;
            return false;
        }
    };

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d1c;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(this.f198026m);
        setBackBtn(new com.tencent.mm.ui.brandservice.h(this));
        setTitleBarDoubleClickListener(new com.tencent.mm.ui.brandservice.i(this));
        this.f198021e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.odk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
        this.f198020d = textView;
        textView.setText(com.tencent.mm.R.string.mfw);
        this.f198022f = new com.tencent.mm.ui.brandservice.l(this, this.f198025i, new com.tencent.mm.ui.brandservice.k(this));
        this.f198022f.getClass();
        this.f198021e.setAdapter((android.widget.ListAdapter) this.f198022f);
        this.f198024h = new rl5.r(this);
        this.f198021e.setOnItemClickListener(new com.tencent.mm.ui.brandservice.a(this));
        this.f198021e.setOnTouchListener(new com.tencent.mm.ui.brandservice.b(this));
        this.f198021e.setOnItemLongClickListener(new com.tencent.mm.ui.brandservice.c(this));
        this.f198022f.getClass();
        this.f198022f.getClass();
        this.f198022f.getClass();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.String str = this.f198028o;
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f198028o = "";
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceConversationUI", "onCreate acc not ready!!!");
            finish();
            return;
        }
        this.f198032s = getIntent().getLongExtra("biz_time_line_line_session_id", 0L);
        this.f198027n = getIntent().getIntExtra("biz_enter_source", 1);
        this.f198025i = "service_officialaccounts";
        java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_display_name");
        this.f198026m = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f198026m = getString(com.tencent.mm.R.string.m7b);
        }
        initView();
        ((l75.a1) c01.d9.b().r()).a(this.f198022f);
        this.f198029p = java.lang.System.currentTimeMillis();
        this.f198036w.alive();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f198028o, true);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceConversationUI", "onCreateContextMenu, contact is null, talker = " + this.f198028o);
            return;
        }
        java.lang.String g27 = n17.g2();
        if (g27.toLowerCase().endsWith("@chatroom") && com.tencent.mm.sdk.platformtools.t8.K0(n17.P0())) {
            g27 = getString(com.tencent.mm.R.string.b5v);
        }
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(this, g27));
        if (n17.r2()) {
            contextMenu.add(adapterContextMenuInfo.position, 2, 0, com.tencent.mm.R.string.gqb);
        }
        contextMenu.add(adapterContextMenuInfo.position, 3, 0, com.tencent.mm.R.string.gqi);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.e().j(new com.tencent.mm.ui.brandservice.j(this));
        this.f198036w.dead();
        if (gm0.j1.a()) {
            ((l75.a1) c01.d9.b().r()).e(this.f198022f);
        }
        com.tencent.mm.ui.brandservice.l lVar = this.f198022f;
        if (lVar != null) {
            lVar.E();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceConversationUI", "on pause");
        com.tencent.mm.ui.brandservice.l lVar = this.f198022f;
        if (lVar != null) {
            lVar.F();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.brandservice.l lVar = this.f198022f;
        if (lVar != null) {
            lVar.G();
        }
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.addAll(super.importUIComponents());
        hashSet.add(com.tencent.mm.ui.conversation.b8.class);
    }
}
