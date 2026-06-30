package com.tencent.mm.plugin.wallet.pwd.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletIdCardCheckUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements qp5.i0, android.widget.TextView.OnEditorActionListener {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f178897m = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f178898d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f178899e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f178900f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f178901g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f178902h;

    /* renamed from: i, reason: collision with root package name */
    public int f178903i = 1;

    public final void W6(boolean z17) {
        this.mKeyboard.post(new com.tencent.mm.plugin.wallet.pwd.ui.a1(this, z17));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void forceCancel() {
        cleanScenes();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5y;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f178898d = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485303h83);
        this.f178899e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pbe);
        this.f178902h = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.m7j);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pbm);
        this.f178900f = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f178898d.setOnInputValidChangeListener(this);
        this.f178898d.setOnEditorActionListener(this);
        int b17 = i65.a.b(getContext(), 19);
        int b18 = i65.a.b(getContext(), 8);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(b17, b17);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = b18;
        layoutParams.leftMargin = b18;
        this.f178898d.getInfoIv().setLayoutParams(layoutParams);
        this.f178898d.getInfoIv().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView infoIv = this.f178898d.getInfoIv();
        int color = getResources().getColor(com.tencent.mm.R.color.FG_2);
        infoIv.f192041u = com.tencent.mm.R.raw.icons_filled_close2;
        infoIv.f192042v = color;
        this.f178899e.setVisibility(4);
        this.f178901g = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485348he1);
        qp5.p.e(this.f178898d);
        setEditFocusListener(this.f178898d, 1, false, false, true);
        this.f178898d.getContentEt().setSingleLine(false);
        android.widget.EditText contentEt = this.f178898d.getContentEt();
        this.f178898d.getContentEt().setPadding(contentEt.getPaddingLeft(), contentEt.getPaddingTop(), contentEt.getPaddingLeft(), getBodyView().getPaddingBottom());
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.o1v);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f178901g.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.v0(this));
        this.f178903i = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().o();
        at4.v1 v1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13997f;
        java.lang.String str = v1Var != null ? v1Var.field_cre_name : "";
        com.tencent.mars.xlog.Log.i("Micromsg.WalletIdCardCheckUI", "mIdentityType %d %s", java.lang.Integer.valueOf(this.f178903i), str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = ((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.b(this, this.f178903i);
        }
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = this.f178898d;
        int i17 = this.f178903i;
        rp5.b logicDelegate = walletFormView.getLogicDelegate();
        if (logicDelegate instanceof qp5.n) {
            ((qp5.n) logicDelegate).f(i17);
        }
        this.f178898d.setTitleText(str);
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f178898d.getTitleTv().getLayoutParams();
        layoutParams2.width = -2;
        this.f178898d.getTitleTv().setLayoutParams(layoutParams2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f178898d.getText())) {
            this.f178901g.setEnabled(false);
        }
        this.f178898d.d();
        if (this.f178903i == 1) {
            setEditFocusListener(this.f178898d, 1, false, false, true);
        } else {
            setEditFocusListener(this.f178898d, 1, true);
        }
        this.f178898d.setHint(getString(com.tencent.mm.R.string.ktt, com.tencent.mm.wallet_core.ui.r1.g0(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q())));
        setTenpayKBStateListener(new com.tencent.mm.plugin.wallet.pwd.ui.w0(this));
        W6(this.mKeyboard.getVisibility() == 0);
        this.f178898d.setmWalletFormViewListener(new com.tencent.mm.plugin.wallet.pwd.ui.x0(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        addSceneEndListener(fe1.o.CTRL_INDEX);
        initView();
        setBackBtn(new com.tencent.mm.plugin.wallet.pwd.ui.u0(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(fe1.o.CTRL_INDEX);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
        this.f178899e.setVisibility(4);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        android.view.View view = this.mKBLayout;
        if (view == null || !view.isShown()) {
            return super.onKeyUp(i17, keyEvent);
        }
        android.view.View view2 = this.mKBLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onPreSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof com.tencent.mm.wallet_core.model.t0)) {
            return true;
        }
        com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
        wCPaySaftyClickReportStruct.f62116d = 1L;
        wCPaySaftyClickReportStruct.f62117e = 2L;
        wCPaySaftyClickReportStruct.k();
        android.widget.Toast makeText = dp.a.makeText(getContext(), "", 0);
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488379rq, null);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f487356oe2)).setImageResource(com.tencent.mm.R.raw.icons_filled_done);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3)).setText(getString(com.tencent.mm.R.string.ktw));
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.wallet.pwd.ui.y0 y0Var = new com.tencent.mm.plugin.wallet.pwd.ui.y0(this, makeText);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(y0Var, 750L, false);
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet.pwd.ui.b1.class);
    }
}
