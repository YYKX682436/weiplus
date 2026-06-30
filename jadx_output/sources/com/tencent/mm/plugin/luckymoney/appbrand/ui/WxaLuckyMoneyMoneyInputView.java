package com.tencent.mm.plugin.luckymoney.appbrand.ui;

/* loaded from: classes9.dex */
public class WxaLuckyMoneyMoneyInputView extends android.widget.LinearLayout implements com.tencent.mm.plugin.luckymoney.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public com.tenpay.android.wechat.TenpaySecureEditText f145005d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f145006e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f145007f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f145008g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.ik f145009h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.c1 f145010i;

    /* renamed from: m, reason: collision with root package name */
    public double f145011m;

    /* renamed from: n, reason: collision with root package name */
    public double f145012n;

    /* renamed from: o, reason: collision with root package name */
    public lb3.i f145013o;

    public WxaLuckyMoneyMoneyInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        mb3.b bVar = new mb3.b(this);
        this.f145010i = hb3.o.Ni().wi().a();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d_p, (android.view.ViewGroup) this, true);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = (com.tenpay.android.wechat.TenpaySecureEditText) inflate.findViewById(com.tencent.mm.R.id.j1d);
        this.f145005d = tenpaySecureEditText;
        tenpaySecureEditText.addTextChangedListener(bVar);
        this.f145006e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j2n);
        this.f145008g = inflate.findViewById(com.tencent.mm.R.id.j2l);
        this.f145007f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485756iy3);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public void a() {
        this.f145006e.setTextColor(com.tencent.mm.plugin.luckymoney.model.m5.i(getContext()));
        this.f145005d.setTextColor(com.tencent.mm.plugin.luckymoney.model.m5.i(getContext()));
        this.f145007f.setTextColor(com.tencent.mm.plugin.luckymoney.model.m5.i(getContext()));
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public void b() {
        this.f145006e.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
        this.f145005d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
        this.f145007f.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public int c() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f145005d.getText().toString())) {
            return 0;
        }
        double F = com.tencent.mm.sdk.platformtools.t8.F(this.f145005d.getText().toString(), -1.0d);
        if (F < 0.0d) {
            return 3;
        }
        double d17 = this.f145011m;
        if (F <= d17 || d17 <= 0.0d) {
            return (F >= this.f145012n || F <= 0.0d) ? 0 : 2;
        }
        return 1;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public java.lang.String d(int i17) {
        this.f145010i = hb3.o.Ni().wi().a();
        if (i17 != 1) {
            if (i17 != 2) {
                return null;
            }
            android.content.Context context = getContext();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = com.tencent.mm.wallet_core.ui.r1.o(this.f145012n) + "";
            java.lang.String str = this.f145010i.f145192q;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[1] = str != null ? str : "";
            return context.getString(com.tencent.mm.R.string.gj_, objArr);
        }
        if (this.f145013o == lb3.i.RANDOM_LUCK) {
            android.content.Context context2 = getContext();
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = java.lang.Math.round(this.f145011m) + "";
            java.lang.String str2 = this.f145010i.f145192q;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr2[1] = str2 != null ? str2 : "";
            return context2.getString(com.tencent.mm.R.string.go7, objArr2);
        }
        android.content.Context context3 = getContext();
        java.lang.Object[] objArr3 = new java.lang.Object[2];
        objArr3[0] = java.lang.Math.round(this.f145011m) + "";
        java.lang.String str3 = this.f145010i.f145192q;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr3[1] = str3 != null ? str3 : "";
        return context3.getString(com.tencent.mm.R.string.gj8, objArr3);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public int e() {
        return c();
    }

    public double getInput() {
        return com.tencent.mm.sdk.platformtools.t8.F(this.f145005d.getText().toString(), 0.0d);
    }

    public int getInputViewId() {
        return getId();
    }

    public void setAmount(java.lang.String str) {
        this.f145005d.setText(str);
    }

    public void setHint(java.lang.String str) {
        this.f145005d.setHint(str);
    }

    public void setMaxAmount(double d17) {
        this.f145011m = d17;
    }

    public void setMaxLen(int i17) {
        this.f145005d.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i17)});
    }

    public void setMinAmount(double d17) {
        this.f145012n = d17;
    }

    public void setOnInputValidChangerListener(com.tencent.mm.plugin.luckymoney.ui.ik ikVar) {
        this.f145009h = ikVar;
    }

    public void setShowGroupIcon(boolean z17) {
        if (z17) {
            android.view.View view = this.f145008g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f145008g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setTitle(java.lang.String str) {
        this.f145006e.setText(str);
    }

    public void setType(lb3.i iVar) {
        this.f145013o = iVar;
    }
}
