package com.tencent.mm.plugin.luckymoney.appbrand.ui.view;

/* loaded from: classes9.dex */
public class WxaLuckyMoneyTextInputView extends android.widget.LinearLayout implements com.tencent.mm.plugin.luckymoney.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f145061d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f145062e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.ik f145063f;

    public WxaLuckyMoneyTextInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d_s, (android.view.ViewGroup) this, true);
        this.f145061d = (com.tencent.mm.ui.widget.MMEditText) inflate.findViewById(com.tencent.mm.R.id.j6x);
        this.f145062e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j6z);
        this.f145061d.setOnFocusChangeListener(new qb3.a(this));
        ck5.f b17 = ck5.f.b(this.f145061d);
        b17.f42561f = 0;
        b17.f42560e = 24;
        b17.f42556a = false;
        b17.d(null);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public void a() {
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public void b() {
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public java.lang.String d(int i17) {
        return null;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public int e() {
        return 0;
    }

    public java.lang.String getInput() {
        return this.f145061d.getText().toString();
    }

    public int getInputViewId() {
        return getId();
    }

    public void setHintText(java.lang.String str) {
        this.f145061d.setHint(str);
    }

    public void setOnInputValidChangerListener(com.tencent.mm.plugin.luckymoney.ui.ik ikVar) {
        this.f145063f = ikVar;
    }

    public void setTitle(java.lang.String str) {
        this.f145062e.setText(str);
    }
}
