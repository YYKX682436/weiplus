package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class WalletConfirmCardIDUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f179999d;

    /* renamed from: e, reason: collision with root package name */
    public com.tenpay.bankcard.TenpaySegmentEditText f180000e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f180001f = true;

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        com.tencent.mm.wallet_core.model.i1.a();
        getInput().remove("key_bankcard_cropimg");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489617d65;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String string = getInput().getString("key_bankcard_id");
        java.lang.String string2 = getInput().getString("key_bankcard_des");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) getInput().getParcelable("key_bankcard_cropimg");
        if (android.text.TextUtils.isEmpty(string)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletConfirmCardIDUI", "cardID is empty");
            finish();
            return;
        }
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletConfirmCardIDUI", "cardID bitmap is null");
            finish();
            return;
        }
        setMMTitle(com.tencent.mm.R.string.kkd);
        this.f179999d = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        com.tenpay.bankcard.TenpaySegmentEditText tenpaySegmentEditText = (com.tenpay.bankcard.TenpaySegmentEditText) findViewById(com.tencent.mm.R.id.f484149d60);
        this.f180000e = tenpaySegmentEditText;
        tenpaySegmentEditText.setText(string, string2);
        this.mKeyboard = (com.tenpay.android.wechat.MyKeyboardWindow) findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.mKBLayout = findViewById(com.tencent.mm.R.id.o1v);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.b_v)).setImageBitmap(bitmap);
        this.f180000e.setKeyboard(this.mKeyboard);
        this.mKeyboard.setXMode(0);
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f180000e.getWindowToken(), 0);
        android.view.View view = this.mKBLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f180000e.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.d4(this));
        this.f179999d.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.e4(this, this.f180000e.get3DesEncrptData()));
        this.mKeyboard = (com.tenpay.android.wechat.MyKeyboardWindow) findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.mKBLayout = findViewById(com.tencent.mm.R.id.o1v);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tenpay_push_down);
        if (this.mKeyboard != null && this.mKBLayout != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.f4(this));
        }
        this.f180000e.setFocusable(false);
        this.f180000e.setFocusableInTouchMode(true);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        setBackBtn(new com.tencent.mm.plugin.wallet_core.ui.c4(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        boolean z17 = getInput().getBoolean("key_is_reset_with_new_card", false);
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.z) {
                ss4.z zVar = (ss4.z) m1Var;
                bundle.putBoolean("key_need_area", zVar.f412152i == 1);
                bundle.putBoolean("key_need_profession", zVar.f412153m == 1);
                bundle.putParcelableArray("key_profession_list", zVar.f412154n);
                bundle.putBoolean("key_need_country", zVar.f412155o == 1);
                bundle.putStringArray("key_country_excludes", zVar.f412156p);
                com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = zVar.f412148e;
                if (elementQuery != null) {
                    if (elementQuery.f179656p && elementQuery.c()) {
                        db5.e1.i(this, com.tencent.mm.R.string.kfs, com.tencent.mm.R.string.f490573yv);
                        return true;
                    }
                    bundle.putBoolean("key_is_reset_with_new_card", z17);
                    bundle.putString("bank_name", zVar.f412148e.f179648e);
                    bundle.putParcelable("elemt_query", zVar.f412148e);
                    bundle.putString("key_card_id", this.f180000e.getEncryptDataWithHash(false));
                    com.tencent.mm.wallet_core.a.d(this, bundle);
                    return true;
                }
                bundle.putBoolean("key_is_reset_with_new_card", z17);
                bundle.putString("bank_name", "");
                bundle.putParcelable("elemt_query", new com.tencent.mm.plugin.wallet_core.model.ElementQuery());
                bundle.putString("key_card_id", this.f180000e.getEncryptDataWithHash(false));
                com.tencent.mm.wallet_core.a.d(this, bundle);
            }
        } else if (i18 == 1 && (m1Var instanceof ss4.z)) {
            bundle.putString("bank_name", "");
            bundle.putBoolean("key_is_reset_with_new_card", z17);
            bundle.putParcelable("elemt_query", new com.tencent.mm.plugin.wallet_core.model.ElementQuery());
            bundle.putString("key_card_id", this.f180000e.getEncryptDataWithHash(false));
            com.tencent.mm.wallet_core.a.d(this, bundle);
            return true;
        }
        return false;
    }
}
