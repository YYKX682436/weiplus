package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyTextInputView extends android.widget.LinearLayout implements com.tencent.mm.plugin.luckymoney.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f146672d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f146673e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f146674f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f146675g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.emoji.view.BaseEmojiView f146676h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.ik f146677i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View.OnClickListener f146678m;

    public LuckyMoneyTextInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bv8, (android.view.ViewGroup) this, true);
        this.f146672d = (com.tencent.mm.ui.widget.MMEditText) inflate.findViewById(com.tencent.mm.R.id.j6x);
        this.f146673e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j6z);
        this.f146674f = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.j0o);
        this.f146675g = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.j0p);
        this.f146676h = (com.tencent.mm.emoji.view.BaseEmojiView) inflate.findViewById(com.tencent.mm.R.id.j0n);
        this.f146672d.setOnFocusChangeListener(new com.tencent.mm.plugin.luckymoney.ui.gp(this));
        this.f146674f.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.hp(this));
        this.f146674f.setVisibility(8);
        this.f146675g.setContentDescription(inflate.getContext().getString(com.tencent.mm.R.string.gj7));
        this.f146672d.setMaxLines(Integer.MAX_VALUE);
        this.f146672d.setFilters(new android.text.InputFilter[0]);
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

    public void f(boolean z17) {
        if (z17) {
            this.f146674f.setVisibility(8);
            return;
        }
        this.f146674f.setVisibility(0);
        this.f146675g.setVisibility(0);
        this.f146676h.setVisibility(8);
    }

    public void g(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f146674f.setTag("delete");
        this.f146675g.setVisibility(8);
        this.f146676h.setVisibility(0);
        this.f146676h.setEmojiInfo(iEmojiInfo);
    }

    public java.lang.String getInput() {
        return this.f146672d.getText().toString();
    }

    public int getInputViewId() {
        return getId();
    }

    public void setHintText(java.lang.String str) {
        this.f146672d.setHint(str);
    }

    public void setOnInputValidChangerListener(com.tencent.mm.plugin.luckymoney.ui.ik ikVar) {
        this.f146677i = ikVar;
    }

    public void setTitle(java.lang.String str) {
        this.f146673e.setText(str);
    }

    public void setmOnEmojiSelectClickListener(android.view.View.OnClickListener onClickListener) {
        this.f146678m = onClickListener;
    }
}
