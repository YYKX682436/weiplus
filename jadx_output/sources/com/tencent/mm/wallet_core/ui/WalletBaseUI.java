package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public abstract class WalletBaseUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements np5.f, com.tencent.mm.wallet_core.model.s {
    public static final int CLEAN_UI_DATA_ACTION_CODE_CLEAN_PASSWORD = 1;
    public static final int CLEAN_UI_DATA_ACTION_CODE_DEFAULT = 0;
    public static final int DIALOG_ID_CONFIRM_FINISH = 1000;
    private static final java.lang.String TAG = "MicroMsg.WalletBaseUI";
    private byte _hellAccFlag_;
    private android.view.MenuItem.OnMenuItemClickListener backListener;
    private java.lang.String mClassSimpleName;
    private boolean mIsAuthDoing;
    protected android.view.View mKBLayout;
    protected com.tenpay.android.wechat.MyKeyboardWindow mKeyboard;
    protected boolean mKindaEnable;
    private com.tencent.mm.wallet_core.g mProcessEnd;
    private android.app.Dialog mProgressDialog;
    private com.tencent.mm.wallet_core.ui.m mTenpayKBStateListener;
    protected com.tencent.mm.wallet_core.keyboard.WcPayKeyboard mWcKeyboard;
    private android.view.MenuItem.OnMenuItemClickListener nextListener;
    public static final int HARDCODE_TENPAY_KEYBOARD_HEIGHT = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 270);
    private static java.util.Set<java.lang.String> mLockSet = new java.util.HashSet();
    private com.tencent.mm.wallet_core.h mProcess = null;
    protected np5.b0 mNetSceneMgr = null;
    private np5.g mNetController = null;
    private com.tencent.mm.wallet_core.model.z0 mCurrentNetScene = null;
    private android.os.Bundle mBundle = new android.os.Bundle();
    protected int mPayResultType = 0;
    protected android.app.Dialog mTipDialog = null;
    private com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PayLoopInterruptEvent> mPayLoopInterruptListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PayLoopInterruptEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.wallet_core.ui.WalletBaseUI.1
        {
            this.__eventId = 1264607315;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.PayLoopInterruptEvent payLoopInterruptEvent) {
            if (1 != payLoopInterruptEvent.f54610g.f6481a) {
                return false;
            }
            com.tencent.mm.wallet_core.ui.WalletBaseUI.this.finish();
            return false;
        }
    };
    private boolean _hasFinish = false;
    protected boolean isVKBFirstTimeShown = false;
    private java.util.LinkedList<com.tencent.mm.wallet_core.model.u> callbacks = new java.util.LinkedList<>();

    public static boolean ifAutoReqFocusTarget28() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_target28_pay_keyboard_focus, 1);
        com.tencent.mars.xlog.Log.i(TAG, "ifAutoReqFocusTarget28() swt:%s", java.lang.Integer.valueOf(Ni));
        return Ni == 1;
    }

    public void addSceneEndListener(int i17) {
        this.mNetSceneMgr.c(i17);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void addTextOptionMenu(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.nextListener = onMenuItemClickListener;
        super.addTextOptionMenu(i17, str, onMenuItemClickListener);
    }

    public void cancelNetScene(com.tencent.mm.modelbase.m1 m1Var) {
        android.app.Dialog dialog;
        np5.b0 b0Var = this.mNetSceneMgr;
        b0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "cancel scene: %s %s", b0Var, m1Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.d(m1Var);
        java.util.HashSet hashSet = b0Var.f338821g;
        hashSet.remove(m1Var);
        java.util.HashSet hashSet2 = b0Var.f338820f;
        hashSet2.remove(m1Var);
        b0Var.f338822h.remove(m1Var);
        if (hashSet.isEmpty() && hashSet2.isEmpty() && (dialog = b0Var.f338823i) != null && dialog.isShowing()) {
            b0Var.f338823i.dismiss();
        }
    }

    public void cancelQRPay() {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
        if (payInfo == null) {
            payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) getIntent().getParcelableExtra("key_pay_info");
        }
        if (payInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(payInfo.f192115n)) {
            return;
        }
        this.mNetSceneMgr.d(new com.tencent.mm.wallet_core.model.q0(payInfo.f192115n, payInfo.f192114m), true);
        payInfo.f192115n = null;
    }

    public boolean checkProcLife() {
        return true;
    }

    public void cleanScenes() {
        this.mNetSceneMgr.f();
    }

    public void cleanUiData(int i17) {
    }

    public void clearErr() {
        com.tencent.mm.wallet_core.ui.v1.f214242a = 0;
        com.tencent.mm.wallet_core.ui.v1.f214243b = 0;
        com.tencent.mm.wallet_core.ui.v1.f214244c = null;
    }

    public void doSceneForceProgress(com.tencent.mm.modelbase.m1 m1Var) {
        doSceneProgress(m1Var, true, false);
    }

    public void doSceneProgress(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        doSceneProgress(m1Var, z17, false);
    }

    public void doSceneProgressWithVerify(com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.wallet_core.h process = getProcess();
        if (process != null) {
            this.mNetSceneMgr.f338826o = process.f213801c;
        }
        this.mNetSceneMgr.e(m1Var, true, 3, 0);
    }

    public void doSceneSafeProgress(com.tencent.mm.modelbase.m1 m1Var) {
        doSceneProgress(m1Var, true, true);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        hideLoading();
        hideTenpayKB();
        hideWcKb();
        this._hasFinish = true;
    }

    public void forceCancel() {
        this.mNetSceneMgr.f();
        finish();
    }

    public boolean getCancelable() {
        return true;
    }

    public int getContentViewVisibility() {
        return getContentView().getVisibility();
    }

    public android.os.Bundle getInput() {
        return this.mBundle;
    }

    public np5.g getNetController() {
        if (this.mNetController == null) {
            com.tencent.mm.wallet_core.h process = getProcess();
            if (process != null) {
                this.mNetController = process.p(this, this.mNetSceneMgr);
            }
            if (this.mNetController == null) {
                this.mNetController = new com.tencent.mm.wallet_core.ui.g0(this, this, this.mNetSceneMgr);
            }
        }
        return this.mNetController;
    }

    public java.lang.String getPayReqKey() {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo;
        android.os.Bundle bundle = this.mBundle;
        return (bundle == null || (payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) bundle.getParcelable("key_pay_info")) == null) ? "" : payInfo.f192114m;
    }

    public com.tencent.mm.wallet_core.h getProcess() {
        if (this.mProcess == null) {
            this.mProcess = com.tencent.mm.wallet_core.a.g(this);
        }
        return this.mProcess;
    }

    public java.lang.Class<? extends com.tencent.mm.wallet_core.ui.c0> getReportUIC() {
        return com.tencent.mm.wallet_core.ui.c0.class;
    }

    public java.lang.String getSubTitle() {
        return "";
    }

    public java.lang.CharSequence getTips(int i17) {
        np5.g gVar = this.mNetController;
        if (gVar == null) {
            return null;
        }
        return gVar.a(i17);
    }

    public void handleKeyboardTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || this.mWcKeyboard.r()) {
            return;
        }
        showCircleStWcKb();
    }

    public boolean hasFinish() {
        return this._hasFinish;
    }

    public void hideKeyboardPushDownBtn() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tenpay_push_down);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = findViewById(com.tenpay.R.id.tenpay_keyboard_top_line);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void hideLoading() {
        android.app.Dialog dialog = this.mTipDialog;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.mTipDialog.dismiss();
        this.mTipDialog = null;
    }

    public void hideProgress() {
        android.app.Dialog dialog = this.mProgressDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void hideTenpayKB() {
        android.view.View view = this.mKBLayout;
        if (view == null || !view.isShown()) {
            return;
        }
        android.view.View view2 = this.mKBLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.wallet_core.ui.m mVar = this.mTenpayKBStateListener;
        if (mVar != null) {
            mVar.onVisibleStateChange(false);
        }
    }

    public void hideWcKb() {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.i();
            com.tencent.mm.wallet_core.ui.m mVar = this.mTenpayKBStateListener;
            if (mVar != null) {
                mVar.onVisibleStateChange(false);
            }
            ((com.tencent.mm.wallet_core.ui.c0) component(getReportUIC())).T6(2);
        }
    }

    public boolean isAuthDoing() {
        return this.mIsAuthDoing;
    }

    public boolean isHandleAutoShowNormalStWcKb() {
        return false;
    }

    public boolean isProcessing() {
        return this.mNetSceneMgr.g();
    }

    public boolean isTransparent() {
        return getLayoutId() <= 0 || this.mNetSceneMgr.g();
    }

    public void keepProcessEnd(com.tencent.mm.wallet_core.g gVar) {
        this.mProcessEnd = gVar;
    }

    public boolean lockPage() {
        java.lang.String simpleName = getClass().getSimpleName();
        if (!mLockSet.contains(simpleName)) {
            return mLockSet.add(simpleName);
        }
        com.tencent.mars.xlog.Log.w(TAG, "has contain lock key: %s", simpleName);
        finish();
        return false;
    }

    public boolean needConfirmFinish() {
        return false;
    }

    public boolean needExecuteBackListener() {
        return true;
    }

    public boolean needLockPage() {
        return false;
    }

    public void next() {
        getProcess().o(this, 0, getInput());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        getNetController().b(i17, i18, intent);
        java.util.Iterator it = ((java.util.List) this.callbacks.clone()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.wallet_core.model.p0 p0Var = ((com.tencent.mm.wallet_core.model.n0) ((com.tencent.mm.wallet_core.model.u) it.next())).f213950a;
            p0Var.f213972k.dead();
            p0Var.f213973l.dead();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (needLockPage()) {
            lockPage();
        }
        shouldFixStatusBar();
        if (shouldEnsureSoterConnection()) {
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).Ai();
            cu5.b.b();
        }
        super.onCreate(bundle);
        setStatusColor();
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e(TAG, "hy: account not ready. finish now");
            db5.e1.G(this, getString(com.tencent.mm.R.string.f493479ke0), "", false, new com.tencent.mm.wallet_core.ui.m0(this));
        }
        np5.b0 b0Var = new np5.b0(this, this);
        this.mNetSceneMgr = b0Var;
        b0Var.c(385);
        this.mNetSceneMgr.c(1518);
        this.mPayLoopInterruptListener.alive();
        getIntent().getIntExtra("process_id", 0);
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
        if (g17 != null) {
            this.mNetSceneMgr.f338825n = g17.e();
            g17.b(this);
        }
        java.util.Objects.toString(g17);
        android.os.Bundle e17 = com.tencent.mm.wallet_core.a.e(this);
        this.mBundle = e17;
        if (e17 == null) {
            this.mBundle = new android.os.Bundle();
        }
        this.mNetSceneMgr.f338826o = this.mBundle;
        if (checkProcLife()) {
            if (!(com.tencent.mm.wallet_core.a.g(this) != null)) {
                com.tencent.mars.xlog.Log.e(TAG, "Activity extends WalletBaseUI but not in process!!!");
            }
        }
        if (getLayoutId() > 0) {
            java.lang.String subTitle = getSubTitle();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(subTitle)) {
                setMMSubTitle(subTitle);
            }
        }
        setBackBtn(new com.tencent.mm.wallet_core.ui.n0(this));
        np5.g netController = getNetController();
        this.mNetController = netController;
        if (netController != null && netController.c(new java.lang.Object[0])) {
            setContentViewVisibility(4);
        } else if (getLayoutId() <= 0) {
            setContentViewVisibility(4);
        } else if (isTransparent()) {
            setContentViewVisibility(4);
        } else {
            setContentViewVisibility(0);
        }
        java.util.Iterator it = ((java.util.List) this.callbacks.clone()).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.wallet_core.model.u) it.next()).getClass();
        }
        com.tencent.mm.wallet_core.b.a().getClass();
        this.mKindaEnable = true;
        com.tencent.mars.xlog.Log.i(TAG, "old id: %s, new id: %s", (java.lang.String) wo.p.a().f447772a.get(256), wo.w0.k());
        java.lang.String simpleName = getClass().getSimpleName();
        this.mClassSimpleName = simpleName;
        com.tencent.mm.wallet_core.ui.b0.c(simpleName);
    }

    @Override // android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        com.tencent.mars.xlog.Log.i(TAG, "onCreateDialog id = %s, this.hascode = %x", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(hashCode()));
        if (i17 != 1000) {
            return super.onCreateDialog(i17);
        }
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
        int q17 = g17 != null ? g17.q(this, 1) : -1;
        com.tencent.mars.xlog.Log.i(TAG, "[onCreateDialog] tipsId : %s", java.lang.Integer.valueOf(q17));
        if (q17 != -1) {
            return db5.e1.K(this, true, getString(q17), "", getString(com.tencent.mm.R.string.f490608zu), getString(com.tencent.mm.R.string.f490503wx), new com.tencent.mm.wallet_core.ui.o0(this), new com.tencent.mm.wallet_core.ui.p0(this));
        }
        if (g17 != null) {
            com.tencent.mars.xlog.Log.i(TAG, "[onCreateDialog] pro.end");
            g17.f(this, getInput());
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "[onCreateDialog] finish");
            this.mPayResultType = 4;
            finish();
        }
        return super.onCreateDialog(i17);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mNetSceneMgr.i(385);
        this.mNetSceneMgr.i(1518);
        this.mPayLoopInterruptListener.dead();
        com.tencent.mm.wallet_core.h process = getProcess();
        if (process != null) {
            process.y(this);
        }
        unlockPage();
        java.util.Iterator it = ((java.util.List) this.callbacks.clone()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.wallet_core.model.p0 p0Var = ((com.tencent.mm.wallet_core.model.n0) ((com.tencent.mm.wallet_core.model.u) it.next())).f213950a;
            p0Var.f213972k.dead();
            p0Var.f213973l.dead();
        }
        this.callbacks.clear();
        keepProcessEnd(null);
        com.tencent.mm.wallet_core.ui.b0.d(getClass().getSimpleName());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            android.view.View view = this.mKBLayout;
            if (view != null && view.isShown()) {
                hideTenpayKB();
                return true;
            }
            if (needConfirmFinish()) {
                hideVKB();
                showDialog(1000);
                return true;
            }
            if (this.backListener != null && needExecuteBackListener()) {
                this.backListener.onMenuItemClick(new db5.h4(getContext(), 0, 0));
                return true;
            }
            android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.nextListener;
            if (onMenuItemClickListener != null) {
                onMenuItemClickListener.onMenuItemClick(new db5.h4(getContext(), 0, 0));
                return true;
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (!intent.getBooleanExtra("key_process_is_end", false) || intent.getBooleanExtra("key_process_is_stay", true)) {
            return;
        }
        setIntent(intent);
        android.os.Bundle extras = getIntent().getExtras();
        int i17 = (extras == null || !extras.containsKey("key_process_result_code")) ? 0 : extras.getInt("key_process_result_code", 0);
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i(TAG, "process end ok!");
            setResult(-1, getIntent());
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "process end with user cancel or err! resultCode : " + i17);
            setResult(0, getIntent());
        }
        if (intent.getBooleanExtra("key_should_contain_activity_when_on_new_intent", false)) {
            return;
        }
        finish();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    public boolean onPreSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return true;
    }

    public boolean onProgressFinish() {
        return false;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tenpay.android.wechat.TenpaySecureEditText.setSalt(com.tencent.mm.wallet_core.ui.r1.B());
        if (!com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            com.tencent.mars.xlog.Log.i(TAG, "VoiceOverUsingReport, voiceover disable.");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29123, 1);
            com.tencent.mars.xlog.Log.i(TAG, "VoiceOverUsingReport, voiceover enable report.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r19, int r20, java.lang.String r21, com.tencent.mm.modelbase.m1 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.wallet_core.ui.WalletBaseUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1, boolean):void");
    }

    public abstract boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var);

    @Override // com.tencent.mm.ui.MMActivity
    public boolean onSwipeBackFinish() {
        hideWcKb();
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.backListener;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(new db5.h4(getContext(), 0, 0));
            return true;
        }
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener2 = this.nextListener;
        if (onMenuItemClickListener2 == null) {
            return super.onSwipeBackFinish();
        }
        onMenuItemClickListener2.onMenuItemClick(new db5.h4(getContext(), 0, 0));
        return true;
    }

    public void regeistQueryOrder(int i17, np5.c cVar) {
        np5.b0 b0Var = this.mNetSceneMgr;
        b0Var.getClass();
        cVar.f338831e = i17;
        cVar.f338830d = b0Var;
        b0Var.f338829r.put(java.lang.Integer.valueOf(i17), cVar);
    }

    @Override // com.tencent.mm.wallet_core.model.s
    public void register(com.tencent.mm.wallet_core.model.u uVar) {
        if (this.callbacks.contains(uVar)) {
            return;
        }
        this.callbacks.add(uVar);
    }

    public void removeSceneEndListener(int i17) {
        this.mNetSceneMgr.i(i17);
    }

    public boolean resend(boolean z17) {
        com.tencent.mm.wallet_core.model.z0 z0Var = this.mCurrentNetScene;
        if (z0Var == null) {
            return false;
        }
        if (!z0Var.resend() && !z17) {
            return false;
        }
        this.mNetSceneMgr.a(this.mCurrentNetScene, true);
        return true;
    }

    public void scrollToFormEditPosAfterShowTenPay(android.view.View view, android.view.View view2, int i17) {
        if (view != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int k17 = (i65.a.k(this) - (iArr[1] + view2.getHeight())) - i65.a.b(this, i17);
            int i18 = HARDCODE_TENPAY_KEYBOARD_HEIGHT;
            if (k17 <= 0 || k17 >= i18) {
                return;
            }
            view.post(new com.tencent.mm.wallet_core.ui.j0(this, view, i18 - k17));
        }
    }

    public void setAuthState(boolean z17) {
        h45.f0 f0Var;
        this.mIsAuthDoing = z17;
        synchronized (h45.f0.class) {
            f0Var = h45.e0.f278942a;
        }
        f0Var.f278944a.put("key_pay_offline_is_auth_doing", java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setBackBtn(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.backListener = onMenuItemClickListener;
        super.setBackBtn(onMenuItemClickListener);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setContentViewVisibility(int i17) {
        super.setContentViewVisibility(i17);
    }

    public void setEditFocusListener(android.view.View view, int i17, boolean z17) {
        setEditFocusListener(view, i17, z17, true);
    }

    public void setKBMode(int i17) {
        this.mKeyboard.setXMode(i17);
    }

    public void setStatusColor() {
        setActionbarColor(getActionbarColor());
    }

    public void setTenpayKBStateListener(com.tencent.mm.wallet_core.ui.m mVar) {
        this.mTenpayKBStateListener = mVar;
    }

    public void setWPKeyboard(android.widget.EditText editText, boolean z17, boolean z18) {
        if (this.mWcKeyboard == null) {
            this.mWcKeyboard = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.mm.R.id.pok);
        }
        if (this.mWcKeyboard == null || editText == null) {
            return;
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = z18 ? editText.getOnFocusChangeListener() : null;
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new com.tencent.mm.wallet_core.ui.s0(this, z17, editText, onFocusChangeListener));
        if (fp.h.c(28) && z17) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (ifAutoReqFocusTarget28()) {
                editText.post(new com.tencent.mm.wallet_core.ui.t0(this, editText));
            }
        }
        editText.setOnClickListener(new com.tencent.mm.wallet_core.ui.u0(this));
    }

    public void setWcKbHeightListener(mp5.v vVar) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.setHeightListener(vVar);
        }
    }

    public void setmPayResultType(int i17) {
        this.mPayResultType = i17;
    }

    public boolean shouldEnsureSoterConnection() {
        return false;
    }

    public void shouldFixStatusBar() {
    }

    public void showCircleStWcKb() {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.v();
            com.tencent.mm.wallet_core.ui.m mVar = this.mTenpayKBStateListener;
            if (mVar != null) {
                mVar.onVisibleStateChange(true);
            }
            ((com.tencent.mm.wallet_core.ui.c0) component(getReportUIC())).U6(2);
            ((com.tencent.mm.wallet_core.ui.c0) component(getReportUIC())).T6(1);
        }
    }

    public void showLoading(boolean z17) {
        android.app.Dialog dialog = this.mTipDialog;
        if (dialog != null) {
            dialog.show();
            return;
        }
        if (z17) {
            this.mTipDialog = com.tencent.mm.wallet_core.ui.b2.i(getContext(), false, false, new com.tencent.mm.wallet_core.ui.k0(this));
        } else {
            this.mTipDialog = com.tencent.mm.wallet_core.ui.b2.e(getContext(), true, false, null);
        }
        android.app.Dialog dialog2 = this.mTipDialog;
        if (dialog2 != null) {
            dialog2.setCancelable(true);
        }
    }

    public void showNetErrorDialog(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = getString(com.tencent.mm.R.string.l0g);
        }
        db5.e1.E(this, str, null, getContext().getString(com.tencent.mm.R.string.f490454vi), false, new com.tencent.mm.wallet_core.ui.l0(this, z17));
    }

    public void showNormalStWcKb() {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.u();
            com.tencent.mm.wallet_core.ui.m mVar = this.mTenpayKBStateListener;
            if (mVar != null) {
                mVar.onVisibleStateChange(true);
            }
            ((com.tencent.mm.wallet_core.ui.c0) component(getReportUIC())).U6(1);
        }
    }

    public void showProgress() {
        android.app.Dialog dialog = this.mProgressDialog;
        if (dialog == null || !(dialog == null || dialog.isShowing())) {
            android.app.Dialog dialog2 = this.mProgressDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.mProgressDialog = com.tencent.mm.wallet_core.ui.b2.e(this, false, false, new com.tencent.mm.wallet_core.ui.i0(this));
        }
    }

    public void showSafeProgress() {
        android.app.Dialog dialog = this.mProgressDialog;
        if (dialog == null || !(dialog == null || dialog.isShowing())) {
            android.app.Dialog dialog2 = this.mProgressDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.mProgressDialog = com.tencent.mm.wallet_core.ui.b2.h(this, false, new com.tencent.mm.wallet_core.ui.h0(this));
        }
    }

    public void showTenpayKB() {
        android.view.View view = this.mKBLayout;
        if (view == null || view.isShown()) {
            return;
        }
        android.view.View view2 = this.mKBLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.wallet_core.ui.m mVar = this.mTenpayKBStateListener;
        if (mVar != null) {
            mVar.onVisibleStateChange(true);
        }
    }

    public void showWcKb() {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard == null || wcPayKeyboard.isShown()) {
            return;
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2 = this.mWcKeyboard;
        wcPayKeyboard2.g(true);
        wcPayKeyboard2.setVisibility(0);
        wcPayKeyboard2.f213819w.setVisibility(4);
        wcPayKeyboard2.f213819w.post(new mp5.g(wcPayKeyboard2, true));
        com.tencent.mm.wallet_core.ui.m mVar = this.mTenpayKBStateListener;
        if (mVar != null) {
            mVar.onVisibleStateChange(true);
        }
        ((com.tencent.mm.wallet_core.ui.c0) component(getReportUIC())).U6(1);
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(getReportUIC());
    }

    public void unlockPage() {
        mLockSet.remove(getClass().getSimpleName());
    }

    public void unregister(com.tencent.mm.wallet_core.model.u uVar) {
        if (this.callbacks.contains(uVar)) {
            this.callbacks.remove(uVar);
        }
    }

    public void doSceneForceProgress(com.tencent.mm.modelbase.m1 m1Var, int i17) {
        doSceneProgress(m1Var, true, false, i17);
    }

    public void doSceneProgress(com.tencent.mm.modelbase.m1 m1Var, boolean z17, boolean z18) {
        doSceneProgress(m1Var, z17, z18, 0);
    }

    public void setEditFocusListener(android.view.View view, int i17, boolean z17, boolean z18) {
        setEditFocusListener(view, i17, z17, true, z18);
    }

    public void addTextOptionMenu(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, com.tencent.mm.ui.fb fbVar) {
        this.nextListener = onMenuItemClickListener;
        super.addTextOptionMenu(i17, str, onMenuItemClickListener, null, fbVar);
    }

    public void doSceneProgress(com.tencent.mm.modelbase.m1 m1Var) {
        doSceneProgress(m1Var, true, true);
    }

    public void next(android.os.Bundle bundle) {
        getProcess().o(this, 0, bundle);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setBackBtn(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i17) {
        this.backListener = onMenuItemClickListener;
        super.setBackBtn(onMenuItemClickListener, i17);
    }

    public void setEditFocusListener(android.view.View view, int i17, boolean z17, boolean z18, boolean z19) {
        setEditFocusListener(view, null, i17, z17, z18, z19);
    }

    public void doSceneProgress(com.tencent.mm.modelbase.m1 m1Var, boolean z17, boolean z18, int i17) {
        com.tencent.mm.wallet_core.h process = getProcess();
        if (process != null) {
            this.mNetSceneMgr.f338826o = process.f213801c;
        }
        this.mNetSceneMgr.e(m1Var, z17, !z18 ? 2 : 1, i17);
    }

    public void setEditFocusListener(android.view.View view, android.widget.EditText editText, int i17, boolean z17, boolean z18, boolean z19) {
        this.mKeyboard = (com.tenpay.android.wechat.MyKeyboardWindow) findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.mKBLayout = findViewById(com.tencent.mm.R.id.o1v);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tenpay_push_down);
        if (editText == null) {
            editText = (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.pbn);
        }
        if (this.mKeyboard == null || editText == null || this.mKBLayout == null) {
            return;
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = z19 ? editText.getOnFocusChangeListener() : null;
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new com.tencent.mm.wallet_core.ui.x0(this, z17, view, editText, i17, onFocusChangeListener));
        editText.setOnClickListener(new com.tencent.mm.wallet_core.ui.d0(this, z17, i17, editText));
        if (fp.h.c(28) && z18) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (ifAutoReqFocusTarget28()) {
                editText.post(new com.tencent.mm.wallet_core.ui.e0(this, editText));
            }
        }
        findViewById.setOnClickListener(new com.tencent.mm.wallet_core.ui.f0(this));
    }

    public void showLoading() {
        showLoading(true);
    }
}
