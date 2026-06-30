package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletCheckPwdNewUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f179974h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.r3 f179975d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f179976e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f179977f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f179978g;

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void cleanUiData(int i17) {
        this.f179978g.a();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5z;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f179976e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pes);
        this.f179977f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pen);
        this.f179978g = (com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) findViewById(com.tencent.mm.R.id.hdh);
        com.tencent.mm.wallet_core.ui.r1.d(this.f179976e);
        hideKeyboardPushDownBtn();
        qp5.p.b(this.f179978g);
        this.f179978g.setOnInputValidListener(new com.tencent.mm.plugin.wallet_core.ui.q3(this));
        setEditFocusListener(this.f179978g, 0, false);
        showTenpayKB();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCheckPwdNewUI", "scene: %s", java.lang.Integer.valueOf(intExtra));
        if (intExtra == 3) {
            this.f179975d = new com.tencent.mm.plugin.wallet_core.ui.l0(this);
        } else if (intExtra == 4) {
            this.f179975d = new com.tencent.mm.plugin.offline.ui.b4(this);
        } else {
            this.f179975d = new com.tencent.mm.plugin.wallet_core.ui.e0(this);
        }
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setMMTitle("");
        overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1);
        initView();
        this.f179975d.onCreate();
        setBackBtn(new com.tencent.mm.plugin.wallet_core.ui.p3(this));
        if (com.tencent.mm.wallet_core.ui.r1.P()) {
            getWindow().addFlags(8192);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) || android.os.Build.VERSION.SDK_INT < 31) {
                return;
            }
            try {
                if (b3.l.checkSelfPermission(getContext(), "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                    getWindow().setHideOverlayWindows(true);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletCheckPwdNewUI", "no permission");
                    jx3.f.INSTANCE.kvStat(28867, "100");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletCheckPwdNewUI", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f179975d.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean onSceneEnd = this.f179975d.onSceneEnd(i17, i18, str, m1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCheckPwdNewUI", "controller ret: %s", java.lang.Boolean.valueOf(onSceneEnd));
        return onSceneEnd;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity
    public void setContentViewVisibility(int i17) {
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet_core.utils.w.class);
    }
}
