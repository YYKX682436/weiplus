package com.tencent.mm.plugin.honey_pay.ui;

/* loaded from: classes9.dex */
public class HoneyPayMainUI extends com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f142334u = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f142335f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f142336g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f142337h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f142338i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f142339m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f142340n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f142341o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f142342p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.CheckBox f142343q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f142344r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f142345s = "";

    /* renamed from: t, reason: collision with root package name */
    public boolean f142346t = false;

    public static void V6(com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI) {
        com.tencent.mars.xlog.Log.i(honeyPayMainUI.f142260d, "do check payer");
        r73.a aVar = new r73.a();
        aVar.K(honeyPayMainUI);
        honeyPayMainUI.doSceneProgress(aVar, true);
    }

    public final void W6(java.lang.String str, boolean z17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i(this.f142260d, "go to card manager: %s", str);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI.class);
        intent.putExtra("key_card_no", str);
        intent.putExtra("key_scene", 0);
        intent.putExtra("key_is_create", z17);
        intent.putExtra("key_card_type", str2);
        startActivityForResult(intent, 3);
    }

    public final void X6(android.content.Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("key_create_succ", false);
        java.lang.String stringExtra = intent.getStringExtra("key_card_no");
        java.lang.String stringExtra2 = intent.getStringExtra("key_card_type");
        com.tencent.mars.xlog.Log.i(this.f142260d, "create succ: %s", java.lang.Boolean.valueOf(booleanExtra));
        if (booleanExtra) {
            W6(stringExtra, true, stringExtra2);
            if (this.f142346t) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24522, 1, 2);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bjr;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f142339m = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485272h44);
        this.f142337h = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.h4d);
        this.f142336g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h4c);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.h4a);
        this.f142338i = button;
        com.tencent.mm.ui.bk.r0(button.getPaint(), 0.8f);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h4e);
        this.f142340n = textView;
        if (textView != null) {
            com.tencent.mm.wallet_core.ui.r1.d(textView);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h4i);
        if (textView2 != null) {
            com.tencent.mm.wallet_core.ui.r1.d(textView2);
        }
        this.f142342p = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.h48);
        this.f142343q = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.h47);
        this.f142341o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h49);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485273h45);
        this.f142335f = linearLayout;
        linearLayout.setOnClickListener(new v73.p0(this));
        this.f142338i.setOnClickListener(new v73.q0(this));
        if (com.tencent.mm.ui.bk.C()) {
            this.f142336g.setImageResource(com.tencent.mm.R.raw.honey_pay_input_logo_dm);
            this.f142343q.setBackgroundResource(com.tencent.mm.R.drawable.agk);
        } else {
            this.f142336g.setImageResource(com.tencent.mm.R.raw.honey_pay_input_logo);
            this.f142343q.setBackgroundResource(com.tencent.mm.R.drawable.agj);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.i(this.f142260d, "get payer list");
            r73.f fVar = new r73.f();
            fVar.K(this);
            doSceneProgress(fVar, false);
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        addSceneEndListener(2725);
        addSceneEndListener(2618);
        addSceneEndListener(2926);
        X6(getIntent());
        initView();
        com.tencent.mars.xlog.Log.i(this.f142260d, "get payer list");
        r73.f fVar = new r73.f();
        fVar.K(this);
        doSceneProgress(fVar, true);
        setMMTitle("");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2725);
        removeSceneEndListener(2618);
        removeSceneEndListener(2926);
        if (this.f142346t) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24522, 1, 3);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(this.f142260d, "on new intent");
        X6(intent);
        super.onNewIntent(intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof r73.f) {
            r73.f fVar = (r73.f) m1Var;
            fVar.O(new v73.r0(this, fVar));
            if (fVar.f214032m) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 1L, 1L);
            }
            if (fVar.f214031i) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 1L, 1L);
            }
        } else if (m1Var instanceof r73.a) {
            r73.a aVar = (r73.a) m1Var;
            aVar.O(new v73.s0(this, aVar));
            if (aVar.f214032m && aVar.f393163r.f390668f != null) {
                com.tencent.mars.xlog.Log.i(this.f142260d, "do realname guide");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayMainUI");
                u73.h.i(this, bundle, aVar.f393163r.f390668f, true);
            }
        } else if (m1Var instanceof r73.b) {
            r73.b bVar = (r73.b) m1Var;
            bVar.O(new v73.l0(this, bVar));
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(v73.v0.class);
    }
}
