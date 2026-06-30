package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyNumInputView extends android.widget.LinearLayout implements com.tencent.mm.plugin.luckymoney.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f146493d;

    /* renamed from: e, reason: collision with root package name */
    public com.tenpay.android.wechat.TenpaySecureEditText f146494e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f146495f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.ik f146496g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.c1 f146497h;

    /* renamed from: i, reason: collision with root package name */
    public int f146498i;

    /* renamed from: m, reason: collision with root package name */
    public int f146499m;

    /* renamed from: n, reason: collision with root package name */
    public int f146500n;

    /* renamed from: o, reason: collision with root package name */
    public int f146501o;

    /* renamed from: p, reason: collision with root package name */
    public int f146502p;

    public LuckyMoneyNumInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f146498i = 1;
        this.f146499m = Integer.MAX_VALUE;
        this.f146500n = 1;
        this.f146501o = 0;
        this.f146502p = 0;
        com.tencent.mm.plugin.luckymoney.ui.hk hkVar = new com.tencent.mm.plugin.luckymoney.ui.hk(this);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.buw, (android.view.ViewGroup) this, true);
        this.f146493d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485807j51);
        this.f146494e = (com.tenpay.android.wechat.TenpaySecureEditText) inflate.findViewById(com.tencent.mm.R.id.j1d);
        this.f146495f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485808j52);
        this.f146494e.setText(this.f146498i + "");
        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.j2o)).setVisibility(0);
        this.f146494e.addTextChangedListener(hkVar);
        this.f146493d.setContentDescription(((java.lang.Object) this.f146493d.getText()) + "0" + ((java.lang.Object) this.f146495f.getText()));
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public void a() {
        this.f146493d.setTextColor(com.tencent.mm.plugin.luckymoney.model.m5.i(getContext()));
        this.f146494e.setTextColor(com.tencent.mm.plugin.luckymoney.model.m5.i(getContext()));
        this.f146495f.setTextColor(com.tencent.mm.plugin.luckymoney.model.m5.i(getContext()));
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public void b() {
        this.f146493d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
        this.f146494e.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
        this.f146495f.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public int c() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f146494e.getText().toString())) {
            return 0;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(this.f146494e.getText().toString(), -1);
        if (P < 0) {
            return 3;
        }
        int i17 = this.f146502p;
        if (P > i17 && i17 > 0) {
            return 5;
        }
        int i18 = this.f146499m;
        if (P > i18 && i18 > 0) {
            return 1;
        }
        int i19 = this.f146500n;
        return (P >= i19 || i19 <= 0) ? 0 : 2;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public java.lang.String d(int i17) {
        int i18 = this.f146501o;
        if (i18 == 1) {
            this.f146497h = hb3.o.Ni().Di().a();
        } else if (i18 == 2) {
            this.f146497h = hb3.o.Ni().Bi().a();
        } else {
            this.f146497h = hb3.o.Ni().wi().a();
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var = this.f146497h;
            return (c1Var == null || com.tencent.mm.sdk.platformtools.t8.K0(c1Var.f145194s)) ? false : true ? getContext().getString(com.tencent.mm.R.string.gmg, java.lang.Integer.valueOf(this.f146499m), this.f146497h.f145194s) : getContext().getString(com.tencent.mm.R.string.gmf, java.lang.Integer.valueOf(this.f146499m));
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var2 = this.f146497h;
            return (c1Var2 == null || com.tencent.mm.sdk.platformtools.t8.K0(c1Var2.f145194s)) ? false : true ? getContext().getString(com.tencent.mm.R.string.gme, java.lang.Integer.valueOf(this.f146500n), this.f146497h.f145194s) : getContext().getString(com.tencent.mm.R.string.gmd);
        }
        if (i17 == 4 || i17 == 3) {
            return getContext().getString(com.tencent.mm.R.string.f492435gn2, this.f146493d.getText());
        }
        if (i17 != 5) {
            return null;
        }
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var3 = this.f146497h;
        return (c1Var3 == null || com.tencent.mm.sdk.platformtools.t8.K0(c1Var3.f145194s)) ? false : true ? getContext().getString(com.tencent.mm.R.string.gma, this.f146497h.f145194s) : getContext().getString(com.tencent.mm.R.string.gm_);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public int e() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f146494e.getText().toString())) {
            return 4;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(this.f146494e.getText().toString(), -1);
        if (P <= 0) {
            return 3;
        }
        int i17 = this.f146499m;
        if (P > i17 && i17 > 0) {
            return 1;
        }
        int i18 = this.f146502p;
        if (P > i18 && i18 > 0) {
            return 5;
        }
        int i19 = this.f146500n;
        return (P >= i19 || i19 <= 0) ? 0 : 2;
    }

    public android.widget.EditText getEditText() {
        return this.f146494e;
    }

    public int getInput() {
        try {
            return java.lang.Integer.parseInt(this.f146494e.getText().toString(), 10);
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public int getInputViewId() {
        return getId();
    }

    public void setGroupChatNumber(int i17) {
        this.f146502p = i17;
    }

    public void setHint(java.lang.String str) {
        this.f146494e.setHint(str);
    }

    public void setMaxNum(int i17) {
        this.f146499m = i17;
        int i18 = 0;
        while (i17 > 0) {
            i18++;
            i17 /= 10;
        }
        if (i18 <= 3) {
            i18 = 3;
        }
        this.f146494e.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i18)});
    }

    public void setMinNum(int i17) {
        this.f146500n = i17;
    }

    public void setNum(java.lang.String str) {
        this.f146494e.setText(str);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f146494e;
        tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().length());
        this.f146498i = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
    }

    public void setOnInputValidChangerListener(com.tencent.mm.plugin.luckymoney.ui.ik ikVar) {
        this.f146496g = ikVar;
    }

    public void setRtxLuckyMoney(int i17) {
        this.f146501o = i17;
    }
}
