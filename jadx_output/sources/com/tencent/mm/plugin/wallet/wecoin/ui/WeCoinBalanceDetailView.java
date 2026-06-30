package com.tencent.mm.plugin.wallet.wecoin.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WeCoinBalanceDetailView extends com.tencent.mm.ui.MMActivity {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f179139o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f179140d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f179141e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f179142f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f179143g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f179144h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f179145i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData f179146m;

    /* renamed from: n, reason: collision with root package name */
    public int f179147n;

    public final void T6(int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData wecoinEncashKVData = this.f179146m;
        int i18 = wecoinEncashKVData != null ? wecoinEncashKVData.f179136d : 1;
        java.lang.String str3 = "";
        if (wecoinEncashKVData == null || (str = wecoinEncashKVData.f179137e) == null) {
            str = "";
        }
        if (wecoinEncashKVData != null && (str2 = wecoinEncashKVData.f179138f) != null) {
            str3 = str2;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21655, java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i17), str3);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dgs;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("key_orders");
        kotlin.jvm.internal.o.d(parcelableExtra);
        this.f179145i = (com.tencent.mm.plugin.wallet_core.model.Orders) parcelableExtra;
        this.f179146m = (com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData) getIntent().getParcelableExtra("wecoin_fetch_result_kv_data");
        this.f179147n = getIntent().getIntExtra("WECOIN_FETCH_RESULT_BIZ_TYPE", 0);
        if (this.f179145i == null) {
            kotlin.jvm.internal.o.o("mOrders");
            throw null;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.axv);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f179140d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.axw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f179141e = (android.widget.TextView) findViewById2;
        android.widget.TextView textView = this.f179140d;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mPaymentStateTitleTv");
            throw null;
        }
        textView.setText(com.tencent.mm.R.string.kex);
        android.widget.TextView textView2 = this.f179141e;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("mCftHandleStateTitleTv");
            throw null;
        }
        textView2.setText(com.tencent.mm.R.string.l8w);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.axh);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f179142f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.axi);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f179143g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.axb);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f179144h = (android.widget.LinearLayout) findViewById5;
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitle(com.tencent.mm.R.string.l9h);
        setBackBtn(new ns4.t(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        T6(23);
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView.onCreate(android.os.Bundle):void");
    }
}
