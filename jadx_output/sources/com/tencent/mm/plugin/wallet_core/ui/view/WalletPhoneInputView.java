package com.tencent.mm.plugin.wallet_core.ui.view;

/* loaded from: classes9.dex */
public class WalletPhoneInputView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f180717d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f180718e;

    /* renamed from: f, reason: collision with root package name */
    public com.tenpay.android.wechat.TenpaySecureEditText f180719f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f180720g;

    /* renamed from: h, reason: collision with root package name */
    public int f180721h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map f180722i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f180723m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f180724n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f180725o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f180726p;

    public WalletPhoneInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f180721h = 0;
        this.f180723m = "";
        this.f180724n = "";
        this.f180725o = true;
        a(context);
        b(context, attributeSet, -1);
    }

    public final void a(android.content.Context context) {
        android.view.View.inflate(context, com.tencent.mm.R.layout.d7y, this);
        this.f180717d = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f486294ku0);
        this.f180718e = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.kue);
        this.f180720g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kyc);
        this.f180717d.setOnClickListener(new gt4.d1(this));
        this.f180719f = (com.tenpay.android.wechat.TenpaySecureEditText) this.f180718e.findViewById(com.tencent.mm.R.id.f486388l30);
        if (getContext() instanceof com.tencent.mm.ui.MMActivity) {
            this.f180718e.setOnInfoIvClickListener(new gt4.e1(this));
            this.f180718e.getInfoIv().setContentDescription(getContext().getString(com.tencent.mm.R.string.kix));
            this.f180718e.setLogicDelegate(new gt4.f1(this));
        }
        java.util.List b17 = u11.b.b(true);
        this.f180722i = new java.util.HashMap();
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            u11.a aVar = (u11.a) it.next();
            this.f180722i.put(aVar.f423728b, aVar);
        }
    }

    public final void b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188587j, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f180718e.setHint(context.getString(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            this.f180718e.setTitleText(context.getString(resourceId2));
        }
    }

    public void c() {
        this.f180721h = 1;
        u11.a aVar = (u11.a) ((java.util.HashMap) this.f180722i).get("86");
        this.f180724n = aVar.f423728b;
        java.lang.String str = aVar.f423729c;
        this.f180723m = str;
        this.f180717d.setText(str);
        this.f180719f.setText(this.f180724n);
        this.f180717d.setVisibility(0);
        this.f180719f.setVisibility(0);
        this.f180720g.setVisibility(0);
        this.f180719f.addTextChangedListener(new gt4.h1(this));
        this.f180719f.setOnFocusChangeListener(new gt4.i1(this));
    }

    public boolean d(int i17, int i18, android.content.Intent intent) {
        if (i17 != 65521) {
            return false;
        }
        if (i18 != 100) {
            return true;
        }
        java.lang.String stringExtra = intent.getStringExtra("country_name");
        java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPhoneInputView", "countryName: %s, countryCode: %s", this.f180723m, this.f180724n);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPhoneInputView", "cancel pick");
            return true;
        }
        this.f180723m = stringExtra;
        this.f180724n = stringExtra2;
        this.f180725o = false;
        this.f180717d.setText(stringExtra);
        this.f180719f.setText(this.f180724n);
        this.f180719f.clearFocus();
        return true;
    }

    public java.lang.String getCountryCode() {
        return this.f180721h == 0 ? "86" : this.f180719f.getText().toString();
    }

    public com.tencent.mm.wallet_core.ui.formview.WalletFormView getPhoneNumberEt() {
        return this.f180718e;
    }

    public WalletPhoneInputView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f180721h = 0;
        this.f180723m = "";
        this.f180724n = "";
        this.f180725o = true;
        a(context);
        b(context, attributeSet, i17);
    }
}
