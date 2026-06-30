package com.tencent.mm.plugin.wallet.balance.ui.lqt;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishProgressNewUI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WalletLqtSaveFetchFinishProgressNewUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f178035d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f178036e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f178037f;

    /* renamed from: g, reason: collision with root package name */
    public r45.an5 f178038g;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bto;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.iwf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f178035d = (android.widget.TextView) findViewById;
        r45.an5 an5Var = this.f178038g;
        if (an5Var == null) {
            kotlin.jvm.internal.o.o("redeemFundRes");
            throw null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(an5Var.f370153r)) {
            android.widget.TextView textView = this.f178035d;
            if (textView == null) {
                kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                throw null;
            }
            textView.setText(getString(com.tencent.mm.R.string.b_8));
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            r45.an5 an5Var2 = this.f178038g;
            if (an5Var2 == null) {
                kotlin.jvm.internal.o.o("redeemFundRes");
                throw null;
            }
            objArr[0] = an5Var2.f370153r;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchFinishProgressNewUI", "redeemFundRes.pre_arrival_time_headline: %s", objArr);
            android.widget.TextView textView2 = this.f178035d;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                throw null;
            }
            r45.an5 an5Var3 = this.f178038g;
            if (an5Var3 == null) {
                kotlin.jvm.internal.o.o("redeemFundRes");
                throw null;
            }
            textView2.setText(an5Var3.f370153r);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.iwc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f178037f = (android.widget.LinearLayout) findViewById2;
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView walletBalanceFetchResultItemView = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView((android.content.Context) this, true);
        if (this.f178038g == null) {
            kotlin.jvm.internal.o.o("redeemFundRes");
            throw null;
        }
        walletBalanceFetchResultItemView.b(com.tencent.mm.R.string.kqq, com.tencent.mm.wallet_core.ui.r1.m(r4.f370149n / 100.0f));
        android.widget.LinearLayout linearLayout = this.f178037f;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("contentLayout");
            throw null;
        }
        linearLayout.addView(walletBalanceFetchResultItemView);
        r45.an5 an5Var4 = this.f178038g;
        if (an5Var4 == null) {
            kotlin.jvm.internal.o.o("redeemFundRes");
            throw null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(an5Var4.f370150o)) {
            r45.an5 an5Var5 = this.f178038g;
            if (an5Var5 == null) {
                kotlin.jvm.internal.o.o("redeemFundRes");
                throw null;
            }
            java.lang.String str = an5Var5.f370150o;
            if (an5Var5 == null) {
                kotlin.jvm.internal.o.o("redeemFundRes");
                throw null;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(an5Var5.f370151p)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(" (");
                r45.an5 an5Var6 = this.f178038g;
                if (an5Var6 == null) {
                    kotlin.jvm.internal.o.o("redeemFundRes");
                    throw null;
                }
                sb6.append(an5Var6.f370151p);
                sb6.append(')');
                str = sb6.toString();
            }
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView walletBalanceFetchResultItemView2 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView((android.content.Context) this, false);
            walletBalanceFetchResultItemView2.b(com.tencent.mm.R.string.kpf, str);
            android.widget.LinearLayout linearLayout2 = this.f178037f;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("contentLayout");
                throw null;
            }
            linearLayout2.addView(walletBalanceFetchResultItemView2);
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.iwb);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f178036e = findViewById3;
        findViewById3.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.e5(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        supportActionBar.o();
        showHomeBtn(false);
        enableBackMenu(false);
        setBackBtnVisible(false);
        this.mController.G0(getResources().getColor(com.tencent.mm.R.color.aaw));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_redeem_res");
        r45.an5 an5Var = new r45.an5();
        this.f178038g = an5Var;
        try {
            an5Var.parseFrom(byteArrayExtra);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchFinishProgressNewUI", e17, "parse redeemFundRes error!", new java.lang.Object[0]);
            finish();
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.an5 an5Var2 = this.f178038g;
        if (an5Var2 == null) {
            kotlin.jvm.internal.o.o("redeemFundRes");
            throw null;
        }
        java.lang.String format = java.lang.String.format("status:%s, wording_for_status2:%s, pre_arrive_time_wording:%s, redeem_fee:%s, bank_name:%s, card_tail:%s, failure_wording:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(an5Var2.f370146h), an5Var2.f370147i, an5Var2.f370148m, java.lang.Integer.valueOf(an5Var2.f370149n), an5Var2.f370150o, an5Var2.f370151p, an5Var2.f370152q}, 7));
        kotlin.jvm.internal.o.f(format, "format(...)");
        objArr[0] = format;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchFinishProgressNewUI", "onCreate, redeemRes: %s", objArr);
        initView();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20287, 8);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
