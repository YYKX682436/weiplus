package com.tencent.mm.plugin.honey_pay.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class HoneyPayProxyUI extends com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f142362h = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f142363f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142364g;

    @Override // com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI
    public void U6() {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(2876);
        addSceneEndListener(2613);
        this.f142363f = getIntent().getBooleanExtra("key_is_payer", false);
        this.f142364g = getIntent().getStringExtra("key_card_no");
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(this.f142363f)};
        java.lang.String str = this.f142260d;
        com.tencent.mars.xlog.Log.i(str, "is payer: %s", objArr);
        if (u73.h.g()) {
            finish();
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            if (!this.f142363f) {
                create.putString("card_id", this.f142364g);
                ((h45.q) i95.n0.c(h45.q.class)).startUseCase("honeyPayReceiverUseCase", create, new v73.e1(this));
                return;
            } else {
                create.putString("card_no", this.f142364g);
                create.putInt("request_source_type", 2);
                ((h45.q) i95.n0.c(h45.q.class)).startUseCase("HoneyPayPayerDetailUseCase", create, new v73.d1(this));
                return;
            }
        }
        if (!this.f142363f) {
            r73.m mVar = new r73.m(this.f142364g);
            mVar.K(this);
            doSceneProgress(mVar, true);
        } else {
            com.tencent.mars.xlog.Log.i(str, "do qry payer detail");
            r73.l lVar = new r73.l(this.f142364g);
            lVar.K(this);
            doSceneProgress(lVar, true);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2876);
        removeSceneEndListener(2613);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onProgressFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof r73.l) {
            r73.l lVar = (r73.l) m1Var;
            lVar.O(new v73.b1(this, lVar));
            return true;
        }
        if (!(m1Var instanceof r73.m)) {
            return true;
        }
        r73.m mVar = (r73.m) m1Var;
        mVar.O(new v73.c1(this, mVar));
        return true;
    }
}
