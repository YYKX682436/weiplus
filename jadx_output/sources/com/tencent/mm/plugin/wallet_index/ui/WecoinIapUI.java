package com.tencent.mm.plugin.wallet_index.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/wallet_index/ui/WecoinIapUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/wallet_index/ui/s0", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class WecoinIapUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f181123p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_index.ui.r0 f181124d;

    /* renamed from: e, reason: collision with root package name */
    public final int f181125e = 6;

    /* renamed from: f, reason: collision with root package name */
    public final int f181126f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f181127g = 2;

    /* renamed from: h, reason: collision with root package name */
    public int f181128h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f181129i = 1002;

    /* renamed from: m, reason: collision with root package name */
    public boolean f181130m = true;

    /* renamed from: n, reason: collision with root package name */
    public android.app.Dialog f181131n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_index.ui.s0 f181132o;

    public final void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", "hideLoadingDialog!");
        android.app.Dialog dialog = this.f181131n;
        if (dialog != null) {
            boolean z17 = false;
            if (dialog != null && dialog.isShowing()) {
                z17 = true;
            }
            if (z17) {
                android.app.Dialog dialog2 = this.f181131n;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                this.f181131n = null;
            }
        }
    }

    public final void U6(nt4.f fVar, int i17) {
        int i18 = fVar.f339823a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Consume failed: ");
        int i19 = fVar.f339823a;
        sb6.append(i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", i19);
        intent.putExtra("key_err_msg", fVar.f339824b);
        if (i17 != -1) {
            intent.putExtra("key_response_position", i17);
        }
        setResult(-1, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", "finish");
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f181132o = new com.tencent.mm.plugin.wallet_index.ui.s0(new java.lang.ref.WeakReference(this));
        overridePendingTransition(0, 0);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        db5.f.c(this, null);
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        com.tencent.mm.plugin.wallet_index.ui.s0 s0Var = this.f181132o;
        if (s0Var == null) {
            kotlin.jvm.internal.o.o("mNetSceneCallback");
            throw null;
        }
        r1Var.a(com.tencent.wxmm.v2helper.EMethodOutputVolumeGainEnable, s0Var);
        com.tencent.mm.modelbase.r1 r1Var2 = gm0.j1.n().f273288b;
        com.tencent.mm.plugin.wallet_index.ui.s0 s0Var2 = this.f181132o;
        if (s0Var2 == null) {
            kotlin.jvm.internal.o.o("mNetSceneCallback");
            throw null;
        }
        r1Var2.a(414, s0Var2);
        this.f181124d = new com.tencent.mm.plugin.wallet_index.ui.r0();
        com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", "onHandleIntent");
        android.content.Intent intent = getIntent();
        if (getIntent().getBooleanExtra("key_request_fullscreen", false)) {
            getWindow().addFlags(1024);
        }
        com.tencent.mm.plugin.wallet_index.ui.r0 r0Var = this.f181124d;
        if (r0Var != null) {
            java.lang.String stringExtra = intent.getStringExtra("key_product_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            r0Var.f181200i = stringExtra;
            ((java.util.ArrayList) r0Var.f181199h).add(stringExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapData", "prepare pay product: ".concat(stringExtra));
            r0Var.f181195d = intent.getStringExtra("key_wecoin_price");
            r0Var.f181196e = intent.getStringExtra("key_price");
            intent.getIntExtra("key_count", 1);
            intent.getStringExtra("key_currency_type");
            java.lang.String stringExtra2 = intent.getStringExtra("key_desc");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            r0Var.f181203l = stringExtra2;
            r0Var.f181192a = intent.getIntExtra("key_pay_type", this.f181125e);
            java.lang.String stringExtra3 = intent.getStringExtra("key_product_title_insufficient");
            r0Var.f181204m = stringExtra3 != null ? stringExtra3 : "";
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", "onDestroy");
        T6();
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        com.tencent.mm.plugin.wallet_index.ui.s0 s0Var = this.f181132o;
        if (s0Var == null) {
            kotlin.jvm.internal.o.o("mNetSceneCallback");
            throw null;
        }
        r1Var.q(com.tencent.wxmm.v2helper.EMethodOutputVolumeGainEnable, s0Var);
        com.tencent.mm.modelbase.r1 r1Var2 = gm0.j1.n().f273288b;
        com.tencent.mm.plugin.wallet_index.ui.s0 s0Var2 = this.f181132o;
        if (s0Var2 == null) {
            kotlin.jvm.internal.o.o("mNetSceneCallback");
            throw null;
        }
        r1Var2.q(414, s0Var2);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", "onResume");
        super.onResume();
        com.tencent.mm.plugin.wallet_index.ui.r0 r0Var = this.f181124d;
        com.tencent.mm.wallet_core.model.b1 b1Var = r0Var != null ? new com.tencent.mm.wallet_core.model.b1(r0Var.f181200i, r0Var.f181195d, r0Var.f181192a) : null;
        if (b1Var == null || !this.f181130m) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", "showLoadingDialog!");
        this.f181131n = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.f490604zq), true, 0, new com.tencent.mm.plugin.wallet_index.ui.t0(this));
        gm0.j1.n().f273288b.g(b1Var);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", "onStop");
        super.onStop();
    }
}
