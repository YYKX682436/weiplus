package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyMoneyInputView extends android.widget.LinearLayout implements com.tencent.mm.plugin.luckymoney.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.FixedAlignRightLabelEditText f146144d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f146145e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f146146f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.ik f146147g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.c1 f146148h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f146149i;

    /* renamed from: m, reason: collision with root package name */
    public double f146150m;

    /* renamed from: n, reason: collision with root package name */
    public double f146151n;

    /* renamed from: o, reason: collision with root package name */
    public int f146152o;

    /* renamed from: p, reason: collision with root package name */
    public int f146153p;

    public LuckyMoneyMoneyInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f146152o = 0;
        com.tencent.mm.plugin.luckymoney.ui.e6 e6Var = new com.tencent.mm.plugin.luckymoney.ui.e6(this);
        this.f146148h = hb3.o.Ni().wi().a();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bun, (android.view.ViewGroup) this, true);
        com.tencent.mm.plugin.luckymoney.ui.FixedAlignRightLabelEditText fixedAlignRightLabelEditText = (com.tencent.mm.plugin.luckymoney.ui.FixedAlignRightLabelEditText) inflate.findViewById(com.tencent.mm.R.id.j1d);
        this.f146144d = fixedAlignRightLabelEditText;
        fixedAlignRightLabelEditText.setTypeface(com.tencent.mm.wallet_core.ui.r1.F(context, 7));
        this.f146144d.addTextChangedListener(e6Var);
        this.f146145e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j2n);
        this.f146146f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.j2l);
        this.f146145e.setContentDescription(((java.lang.Object) this.f146145e.getText()) + "0");
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public void a() {
        this.f146145e.setTextColor(com.tencent.mm.plugin.luckymoney.model.m5.i(getContext()));
        this.f146144d.setTextColor(com.tencent.mm.plugin.luckymoney.model.m5.i(getContext()));
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public void b() {
        this.f146145e.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
        this.f146144d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public int c() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f146144d.getText().toString())) {
            return 0;
        }
        double input = getInput();
        if (input < 0.0d) {
            return 3;
        }
        double d17 = this.f146150m;
        if (input <= d17 || d17 <= 0.0d) {
            return (input >= this.f146151n || input <= 0.0d) ? 0 : 2;
        }
        return 1;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public java.lang.String d(int i17) {
        int i18 = this.f146152o;
        if (i18 == 1) {
            this.f146148h = hb3.o.Ni().Di().a();
        } else if (i18 == 2) {
            this.f146148h = hb3.o.Ni().Bi().a();
        } else {
            this.f146148h = hb3.o.Ni().wi().a();
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 == 4 || i17 == 3) {
                    return getContext().getString(com.tencent.mm.R.string.f492435gn2, this.f146145e.getText());
                }
                return null;
            }
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var = this.f146148h;
            if (!((c1Var == null || com.tencent.mm.sdk.platformtools.t8.K0(c1Var.f145194s)) ? false : true)) {
                android.content.Context context = getContext();
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = com.tencent.mm.wallet_core.ui.r1.o(this.f146151n) + "";
                java.lang.String str = this.f146148h.f145192q;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                objArr[1] = str != null ? str : "";
                return context.getString(com.tencent.mm.R.string.gj_, objArr);
            }
            android.content.Context context2 = getContext();
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = this.f146148h.f145194s;
            objArr2[1] = com.tencent.mm.wallet_core.ui.r1.o(this.f146151n) + "";
            java.lang.String str2 = this.f146148h.f145192q;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr2[2] = str2 != null ? str2 : "";
            return context2.getString(com.tencent.mm.R.string.gja, objArr2);
        }
        if (this.f146153p == 1) {
            android.content.Context context3 = getContext();
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            objArr3[0] = java.lang.Math.round(this.f146150m) + "";
            java.lang.String str3 = this.f146148h.f145192q;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr3[1] = str3 != null ? str3 : "";
            return context3.getString(com.tencent.mm.R.string.go7, objArr3);
        }
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var2 = this.f146148h;
        if (!((c1Var2 == null || com.tencent.mm.sdk.platformtools.t8.K0(c1Var2.f145194s)) ? false : true)) {
            android.content.Context context4 = getContext();
            java.lang.Object[] objArr4 = new java.lang.Object[2];
            objArr4[0] = java.lang.Math.round(this.f146150m) + "";
            java.lang.String str4 = this.f146148h.f145192q;
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr4[1] = str4 != null ? str4 : "";
            return context4.getString(com.tencent.mm.R.string.gj8, objArr4);
        }
        android.content.Context context5 = getContext();
        java.lang.Object[] objArr5 = new java.lang.Object[3];
        objArr5[0] = this.f146148h.f145194s;
        objArr5[1] = java.lang.Math.round(this.f146150m) + "";
        java.lang.String str5 = this.f146148h.f145192q;
        boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr5[2] = str5 != null ? str5 : "";
        return context5.getString(com.tencent.mm.R.string.gj9, objArr5);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public int e() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f146144d.getText().toString())) {
            return 4;
        }
        double F = com.tencent.mm.sdk.platformtools.t8.F(this.f146144d.getText().toString(), -1.0d);
        if (F <= 0.0d) {
            return 3;
        }
        double d17 = this.f146150m;
        if (F <= d17 || d17 <= 0.0d) {
            return (F >= this.f146151n || F <= 0.0d) ? 0 : 2;
        }
        return 1;
    }

    public android.widget.EditText getEditText() {
        return this.f146144d;
    }

    public double getInput() {
        return com.tencent.mm.sdk.platformtools.t8.F(this.f146144d.getText().toString(), 0.0d);
    }

    public int getInputViewId() {
        return getId();
    }

    public double getMaxAmount() {
        return this.f146150m;
    }

    public void setAmount(java.lang.String str) {
        this.f146144d.setText(str);
        android.text.Editable text = this.f146144d.getText();
        if (com.tencent.mm.sdk.platformtools.t8.J0(text) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.f146144d.setSelection(java.lang.Math.min(str.length(), text.length()));
    }

    public void setCurrencyUnitPrefix(java.lang.String str) {
        this.f146149i = str;
        this.f146144d.setFixedLabelText(str);
    }

    public void setGroupIconIv(int i17) {
        this.f146146f.setImageResource(i17);
    }

    public void setHint(java.lang.String str) {
        this.f146144d.setHint(str);
    }

    public void setMaxAmount(double d17) {
        this.f146150m = d17;
    }

    public void setMaxLen(int i17) {
        this.f146144d.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i17)});
    }

    public void setMinAmount(double d17) {
        this.f146151n = d17;
    }

    public void setOnInputValidChangerListener(com.tencent.mm.plugin.luckymoney.ui.ik ikVar) {
        this.f146147g = ikVar;
    }

    public void setRtxLuckyMoney(int i17) {
        this.f146152o = i17;
    }

    public void setShowGroupIcon(boolean z17) {
        if (z17) {
            this.f146146f.setVisibility(0);
        } else {
            this.f146146f.setVisibility(8);
        }
    }

    public void setTitle(java.lang.String str) {
        this.f146145e.setText(str);
    }

    public void setType(int i17) {
        this.f146153p = i17;
    }
}
