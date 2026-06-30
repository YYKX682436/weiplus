package com.tencent.mm.plugin.setting.ui.setting;

@db5.a(2048)
@ul5.d(0)
/* loaded from: classes5.dex */
public class SettingsModifyPatSuffixUI extends com.tencent.mm.ui.MMWizardActivity implements sr.k, xg3.d0 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.emoji.view.EmojiPanelInputComponent f160550e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMClearEditText f160551f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f160552g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f160553h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160554i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f160555m;

    /* renamed from: n, reason: collision with root package name */
    public int f160556n = 20;

    /* renamed from: o, reason: collision with root package name */
    public int f160557o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final android.text.TextWatcher f160558p = new com.tencent.mm.plugin.setting.ui.setting.ri(this);

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f160552g.getLayoutParams();
        if (z17) {
            layoutParams.bottomMargin = i65.a.b(this, 16) + i17;
        } else {
            layoutParams.bottomMargin = i65.a.b(this, 96);
        }
        this.f160552g.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clt;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f160550e = (com.tencent.mm.emoji.view.EmojiPanelInputComponent) findViewById(com.tencent.mm.R.id.hde);
        this.f160552g = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f160551f = (com.tencent.mm.ui.widget.MMClearEditText) findViewById(com.tencent.mm.R.id.kpy);
        this.f160553h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kpz);
        this.f160552g.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.pi(this));
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, null);
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyPatSuffixUI", "curSuffix %s, suffixVersion %d", str, java.lang.Integer.valueOf(r17));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (r17 == 0 && com.tencent.mm.sdk.platformtools.m2.j()) {
                str = "的" + str;
            }
            com.tencent.mm.ui.widget.MMClearEditText mMClearEditText = this.f160551f;
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            mMClearEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, str));
            this.f160551f.setSelection(str.length());
        }
        this.f160551f.requestFocus();
        this.f160551f.addTextChangedListener(this.f160558p);
        ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, this, true);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.qi(this));
        this.f160550e.setMMEditText(this.f160551f);
        this.f160550e.setVisibility(4);
        this.f160550e.setInputComponentListener(this);
        if (this.f160551f.getText().length() > 0) {
            this.f160550e.setSmileySendButtonEnable(true);
        } else {
            this.f160550e.setSmileySendButtonEnable(false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20379, "" + java.lang.System.currentTimeMillis(), 3, 0, java.lang.Integer.valueOf(this.f160557o));
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("jumptoPat", false)) {
            this.f160557o = 2;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20379, "" + java.lang.System.currentTimeMillis(), 1, 0, java.lang.Integer.valueOf(this.f160557o));
        this.f160556n = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PatSuffixMaxByte", 16);
        initView();
        this.f160555m = new com.tencent.mm.sdk.platformtools.b4(getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.setting.ui.setting.oi(this), false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent = this.f160550e;
        if (emojiPanelInputComponent != null) {
            emojiPanelInputComponent.f64945q = null;
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = emojiPanelInputComponent.f64938g;
            if (chatFooterPanel != null) {
                chatFooterPanel.l();
                emojiPanelInputComponent.f64938g.a();
            }
        }
        android.util.SparseArray sparseArray = ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).f246514d;
        if (sparseArray.indexOfKey(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT) >= 0) {
            ((java.util.LinkedList) sparseArray.get(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT)).remove(this);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f160555m;
        if (b4Var != null) {
            b4Var.d();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (!this.f160550e.h()) {
            finish();
            return false;
        }
        com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent = this.f160550e;
        emojiPanelInputComponent.g();
        emojiPanelInputComponent.setVisibility(8);
        return true;
    }

    @Override // xg3.d0
    public void u0(int i17, r45.g25 g25Var, xg3.q0 q0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyPatSuffixUI", "ret:%d, content:%s, title:%s", java.lang.Integer.valueOf(i17), g25Var.f374841d, g25Var.f374842e);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f160554i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        try {
            if (i17 != 0) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(g25Var.f374841d)) {
                    db5.e1.i(getContext(), com.tencent.mm.R.string.f490391to, com.tencent.mm.R.string.f490479w8);
                } else {
                    db5.e1.s(this, g25Var.f374841d, getString(com.tencent.mm.R.string.f490479w8));
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20379, "" + java.lang.System.currentTimeMillis(), 2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f160557o));
                return;
            }
            db5.e1.T(this, getString(com.tencent.mm.R.string.f490480w9));
            r45.mo4 mo4Var = (r45.mo4) q0Var.f454431j;
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_STRING_SYNC;
            java.lang.String str = (java.lang.String) c17.m(u3Var2, null);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            if (!str.equals(mo4Var.f380712d)) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, 2);
            }
            gm0.j1.u().c().x(u3Var2, mo4Var.f380712d);
            W6(1);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20379, "" + java.lang.System.currentTimeMillis(), 2, 0, java.lang.Integer.valueOf(this.f160557o));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_TIMESTAMP_LONG, java.lang.Long.valueOf(c01.id.c()));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_COUNT_INT, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsModifyPatSuffixUI", e17, "", new java.lang.Object[0]);
        }
    }
}
