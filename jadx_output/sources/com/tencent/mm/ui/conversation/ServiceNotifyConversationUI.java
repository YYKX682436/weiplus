package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class ServiceNotifyConversationUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f207415d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f207416e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.ya f207417f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.l4 f207418g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f207419h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f207420i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f207421m = "";

    /* renamed from: n, reason: collision with root package name */
    public xg3.h0 f207422n;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ckg;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.tencent.mm.ui.conversation.qa.class);
        return hashSet;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(this.f207420i);
        setBackBtn(new com.tencent.mm.ui.conversation.ta(this));
        setTitleBarDoubleClickListener(new com.tencent.mm.ui.conversation.ua(this));
        this.f207416e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.odk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
        this.f207415d = textView;
        textView.setText(com.tencent.mm.R.string.hc9);
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.mjh);
        java.lang.String str = te5.v1.f418758b;
        mMEditText.setOnClickListener(new com.tencent.mm.ui.conversation.va(this, str));
        this.f207417f = new com.tencent.mm.ui.conversation.ya(this, this.f207419h, new com.tencent.mm.ui.conversation.wa(this));
        this.f207416e.setAdapter((android.widget.ListAdapter) this.f207417f);
        this.f207416e.setOnItemClickListener(new com.tencent.mm.ui.conversation.xa(this, str));
        this.f207417f.getClass();
        this.f207417f.getClass();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.String str = this.f207421m;
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f207421m = "";
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ServiceNotifyConversationUI", "onCreate acc not ready!!!");
            finish();
            return;
        }
        this.f207419h = "notifymessage";
        this.f207420i = getIntent().getStringExtra("enterprise_biz_display_name");
        getIntent().getStringExtra("service_notify_session_id");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f207420i)) {
            this.f207420i = getString(com.tencent.mm.R.string.fuw);
        }
        initView();
        removeAllOptionMenu();
        addIconOptionMenu(0, com.tencent.mm.R.string.f489818cm, com.tencent.mm.R.raw.actionbar_setting_icon, false, (android.view.MenuItem.OnMenuItemClickListener) new com.tencent.mm.ui.conversation.sa(this));
        ((l75.a1) c01.d9.b().r()).a(this.f207417f);
        this.f207422n = new com.tencent.mm.ui.conversation.ra(this);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this.f207422n, android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f207422n != null) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this.f207422n);
            this.f207422n = null;
        }
        if (gm0.j1.a()) {
            ((l75.a1) c01.d9.b().r()).e(this.f207417f);
        }
        com.tencent.mm.ui.conversation.ya yaVar = this.f207417f;
        if (yaVar != null) {
            yaVar.E();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ServiceNotifyConversationUI", "on pause");
        com.tencent.mm.ui.conversation.ya yaVar = this.f207417f;
        if (yaVar != null) {
            yaVar.F();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.conversation.ya yaVar = this.f207417f;
        if (yaVar != null) {
            yaVar.G();
        }
        super.onResume();
    }
}
