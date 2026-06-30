package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes8.dex */
public class WcPayRealnameVerifyBindcardEntranceUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f179261h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f179262d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f179263e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f179264f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f179265g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI.1
        {
            this.__eventId = 323604482;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
            com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI wcPayRealnameVerifyBindcardEntranceUI = com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI.this;
            wcPayRealnameVerifyBindcardEntranceUI.f179265g.dead();
            int i17 = walletRealNameResultNotifyEvent.f54973g.f6120a;
            if (i17 != -1 && i17 != 0) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyBindcardEntranceUI", "WcPayRealnameVerifyBindcardEntranceUI finish");
            wcPayRealnameVerifyBindcardEntranceUI.finish();
            return false;
        }
    };

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9a;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f179262d = (android.widget.Button) findViewById(com.tencent.mm.R.id.pps);
        this.f179263e = (android.widget.Button) findViewById(com.tencent.mm.R.id.ppt);
        this.f179264f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pql);
        java.lang.String string = getInput().getString("realname_verify_process_add_bank_word");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            this.f179264f.setText(string);
        }
        this.f179262d.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.o1(this));
        this.f179263e.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.p1(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyBindcardEntranceUI", "onActivityResult: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 != -1 || intent == null || intent.getExtras() == null) {
            return;
        }
        getInput().putString("realname_verify_process_face_token", intent.getExtras().getString("token"));
        getProcess().o(this, 0, getInput());
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478494f));
        hideActionbarLine();
        setMMTitle("");
        initView();
        setBackBtn(new com.tencent.mm.plugin.wallet_core.id_verify.n1(this));
        this.f179265g.alive();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f179265g.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
