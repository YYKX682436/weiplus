package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(1)
/* loaded from: classes9.dex */
public class WalletCheckPwdUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    public static final /* synthetic */ int B = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f179979d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f179980e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f179981f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f179982g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f179983h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f179984i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ScrollView f179985m;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f179988p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f179989q;

    /* renamed from: t, reason: collision with root package name */
    public int f179992t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f179993u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f179994v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f179995w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f179996x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.animation.Animation f179997y;

    /* renamed from: z, reason: collision with root package name */
    public int f179998z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f179986n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f179987o = false;

    /* renamed from: r, reason: collision with root package name */
    public int f179990r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f179991s = 0;
    public java.lang.String A = "";

    public final void U6() {
        com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "hy: send release FPManager");
        new com.tencent.mm.autogen.events.ReleaseFingerPrintAuthEvent().e();
    }

    public final void V6() {
        this.f179993u = true;
        re4.n.b();
        com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent = new com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent();
        java.lang.String str = this.f179994v;
        am.on onVar = openFingerPrintAuthEvent.f54595g;
        onVar.f7563a = str;
        onVar.f7564b = 1;
        onVar.f7565c = new com.tencent.mm.plugin.wallet_core.ui.z3(this, openFingerPrintAuthEvent);
        openFingerPrintAuthEvent.b(android.os.Looper.getMainLooper());
    }

    public final void W6(int i17) {
        if (getIntent().getBooleanExtra("from_kinda", false)) {
            com.tencent.mm.autogen.events.WalletEndResultEvent walletEndResultEvent = new com.tencent.mm.autogen.events.WalletEndResultEvent();
            walletEndResultEvent.f54953g.f6728a = i17;
            walletEndResultEvent.e();
        }
    }

    public final void X6(r45.r65 r65Var) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(r65Var != null);
        com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "[setTitleByScene] has info： %s", objArr);
        com.tencent.mm.wallet_core.h process = getProcess();
        if (process != null) {
            this.f179995w = getString(com.tencent.mm.R.string.f493520kk5);
            if (!"UnbindProcess".equals(process.e())) {
                if (process instanceof qs4.j) {
                    this.f179982g.setText(com.tencent.mm.R.string.kmo);
                    this.f179983h.setText(this.f179995w);
                    return;
                } else if ("ModifyPwdProcess".equals(process.e())) {
                    this.f179982g.setText(com.tencent.mm.R.string.krk);
                    this.f179983h.setText(this.f179995w);
                    return;
                } else {
                    if ("OfflineProcess".equals(process.e())) {
                        this.f179982g.setText(com.tencent.mm.R.string.f493519kk4);
                        this.f179983h.setText(this.f179995w);
                        return;
                    }
                    return;
                }
            }
            java.lang.String string = process.f213801c.getString("key_check_pwd_title");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                this.f179982g.setText(com.tencent.mm.R.string.f493537kn3);
            } else {
                this.f179982g.setText(string);
            }
            this.f179983h.setText(this.f179995w);
            if (r65Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(r65Var.f384573d)) {
                com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "[setTitleByScene] title : %s", r65Var.f384573d);
                this.f179982g.setText(r65Var.f384573d);
            }
            if (r65Var == null || com.tencent.mm.sdk.platformtools.t8.K0(r65Var.f384574e)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "[setTitleByScene] paypwd_desc : %s", r65Var.f384574e);
            this.f179983h.setText(r65Var.f384574e);
        }
    }

    public final void Y6(r45.r65 r65Var) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(r65Var != null);
        com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "[updateByJsApiPageMsgInfo] has info： %s", objArr);
        if (r65Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(r65Var.f384573d)) {
            this.f179982g.setText(r65Var.f384573d);
        }
        if (r65Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(r65Var.f384574e)) {
            this.f179983h.setText(r65Var.f384574e);
        }
        X6(r65Var);
    }

    public final void Z6() {
        com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "change mode: %s", java.lang.Integer.valueOf(this.f179990r));
        if (this.f179990r == 1) {
            this.f179980e.setVisibility(0);
            this.f179979d.setVisibility(8);
            this.f179984i.setText(com.tencent.mm.R.string.kjz);
            this.f179980e.postDelayed(new com.tencent.mm.plugin.wallet_core.ui.x3(this), 300L);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f179996x)) {
                this.f179983h.setText(com.tencent.mm.R.string.f493516kk1);
                return;
            } else {
                this.f179983h.setText(this.f179996x);
                return;
            }
        }
        this.f179980e.setVisibility(8);
        this.f179979d.a();
        this.f179979d.setVisibility(0);
        this.f179984i.setText(com.tencent.mm.R.string.kjy);
        showTenpayKB();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f179995w)) {
            this.f179983h.setText(com.tencent.mm.R.string.f493520kk5);
        } else {
            this.f179983h.setText(this.f179995w);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void cleanUiData(int i17) {
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f179979d;
        if (editHintPasswdView != null) {
            editHintPasswdView.a();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f179998z == 0) {
            overridePendingTransition(0, com.tencent.mm.R.anim.f477877e1);
        }
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
        return com.tencent.mm.R.layout.d5z;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = (com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) findViewById(com.tencent.mm.R.id.hdh);
        this.f179979d = editHintPasswdView;
        qp5.p.b(editHintPasswdView);
        this.f179979d.setOnInputValidListener(new com.tencent.mm.plugin.wallet_core.ui.t3(this));
        this.f179985m = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.pgr);
        this.f179980e = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.g5t);
        this.f179982g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pes);
        this.f179983h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pen);
        this.f179981f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g5w);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pgo);
        this.f179984i = textView;
        textView.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.u3(this));
        com.tencent.mm.wallet_core.ui.r1.d(this.f179982g);
        setTenpayKBStateListener(new com.tencent.mm.plugin.wallet_core.ui.w3(this));
        hideKeyboardPushDownBtn();
        setEditFocusListener(this.f179979d, 0, false);
        showTenpayKB();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isTransparent() {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return getInput().getInt("key_pay_flag", 0) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115  */
    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f179993u) {
            U6();
        }
        removeSceneEndListener(580);
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
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f179990r = 0;
        Z6();
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f179979d;
        if (editHintPasswdView != null) {
            editHintPasswdView.a();
        }
        super.onResume();
        addSceneEndListener(580);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f179979d;
            if (editHintPasswdView != null) {
                editHintPasswdView.a();
            }
            if (!(m1Var instanceof ss4.d) && !(m1Var instanceof ss4.e)) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "check jsapi fail");
            com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
            if (g17 == null || !g17.e().equals("UnbindProcess")) {
                setResult(0);
                W6(0);
                finish();
            } else {
                setResult(1);
                g17.f213801c.putInt("key_process_result_code", 1);
                com.tencent.mm.wallet_core.a.d(this, g17.f213801c);
            }
            return true;
        }
        if (m1Var instanceof ss4.x) {
            android.os.Bundle input = getInput();
            input.putString("key_pwd1", this.f179979d.getText());
            input.putString("key_bind_card_user_token", ((ss4.x) m1Var).f412141e);
            com.tencent.mm.wallet_core.a.d(this, input);
            com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView2 = this.f179979d;
            if (editHintPasswdView2 != null) {
                editHintPasswdView2.a();
            }
            finish();
        } else if (m1Var instanceof ss4.e0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.A) || !"1".equals(this.A)) {
                db5.e1.T(this, getString(com.tencent.mm.R.string.kk9));
            }
            com.tencent.mm.wallet_core.h g18 = com.tencent.mm.wallet_core.a.g(this);
            if (g18 != null) {
                g18.f213801c.putInt("key_process_result_code", -1);
            }
            com.tencent.mm.wallet_core.a.d(this, g18.f213801c);
            com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView3 = this.f179979d;
            if (editHintPasswdView3 != null) {
                editHintPasswdView3.a();
            }
            finish();
        } else if (m1Var instanceof ss4.d) {
            ss4.d dVar = (ss4.d) m1Var;
            h45.y.f278968a = dVar.H();
            com.tencent.mm.modelbase.o oVar = dVar.f412029e;
            this.f179988p = ((r45.y10) oVar.f70711b.f70700a).f390702f;
            setResult(-1);
            Y6(((r45.y10) oVar.f70711b.f70700a).f390703g);
            setContentViewVisibility(0);
        } else if (m1Var instanceof ss4.e) {
            ss4.e eVar = (ss4.e) m1Var;
            r45.v20 v20Var = eVar.f412035f;
            this.f179988p = v20Var.f387821f;
            java.lang.String str2 = v20Var.f387823h;
            this.f179994v = str2;
            h45.y.f278968a = str2;
            r45.r65 r65Var = v20Var.f387822g;
            if (r65Var != null) {
                this.f179995w = r65Var.f384574e;
                this.f179996x = r65Var.f384575f;
            }
            setResult(-1);
            Y6(eVar.f412035f.f387822g);
            r45.co6 co6Var = eVar.f412035f.f387824i;
            if (co6Var != null && co6Var.f371735e != null) {
                pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
                if (co6Var.f371734d == 1 && co6Var.f371737g == 1 && aVar.yh() && aVar.Ic() && !aVar.H4()) {
                    com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "can use touch pay");
                    this.f179990r = 1;
                    com.tencent.mm.protobuf.g gVar = co6Var.f371735e;
                    mz2.d2 d2Var = mz2.d2.IML;
                    if (gVar != null) {
                        d2Var.f333111d = gVar.i();
                    }
                    d2Var.f333113f = co6Var.f371736f == 1;
                    V6();
                    this.f179984i.setVisibility(0);
                }
            }
            Z6();
            setContentViewVisibility(0);
            ((android.widget.TextView) ((com.tencent.mm.plugin.wallet_core.utils.w) component(com.tencent.mm.plugin.wallet_core.utils.w.class)).getContext().findViewById(com.tencent.mm.R.id.pen)).sendAccessibilityEvent(128);
        } else if (m1Var instanceof ss4.y) {
            ss4.y yVar = (ss4.y) m1Var;
            if (yVar.f412144e == 0) {
                com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "need free sms");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key_pwd1", this.f179989q);
                bundle.putString("key_jsapi_token", this.f179988p);
                bundle.putString("key_relation_key", yVar.f412146g);
                bundle.putString("key_mobile", yVar.f412145f);
                com.tencent.mm.wallet_core.a.j(this, com.tencent.mm.plugin.wallet_core.ui.z4.class, bundle, new com.tencent.mm.plugin.wallet_core.ui.y3(this));
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("token", yVar.f412143d);
                setResult(-1, intent);
                W6(-1);
                finish();
            }
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity
    public void setContentViewVisibility(int i17) {
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet_core.utils.w.class);
    }
}
