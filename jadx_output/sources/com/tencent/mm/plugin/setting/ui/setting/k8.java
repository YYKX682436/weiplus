package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class k8 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f161229d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f161230e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f161231f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161229d = "";
        this.f161231f = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.i8(this));
    }

    public static final void T6(com.tencent.mm.plugin.setting.ui.setting.k8 k8Var) {
        java.lang.String U6;
        if (k8Var.f161230e) {
            U6 = k8Var.f161229d;
        } else {
            java.lang.String str = k8Var.f161229d;
            if (str == null) {
                str = "";
            }
            U6 = k8Var.U6(str);
        }
        int i17 = k8Var.f161230e ? com.tencent.mm.R.string.ohc : com.tencent.mm.R.string.ohs;
        em.w3 V6 = k8Var.V6();
        if (V6.f254895b == null) {
            V6.f254895b = (android.widget.TextView) V6.f254894a.findViewById(com.tencent.mm.R.id.si9);
        }
        V6.f254895b.setText(U6);
        em.w3 V62 = k8Var.V6();
        if (V62.f254896c == null) {
            V62.f254896c = (android.widget.TextView) V62.f254894a.findViewById(com.tencent.mm.R.id.v5j);
        }
        android.widget.TextView textView = V62.f254896c;
        kotlin.jvm.internal.o.d(textView);
        k8Var.W6(textView, i17, new com.tencent.mm.plugin.setting.ui.setting.j8(k8Var));
    }

    public final java.lang.String U6(java.lang.String str) {
        int K = r26.n0.K(str, '@', 0, false, 6, null);
        if (K <= 1) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str.charAt(0));
        sb6.append("****");
        sb6.append(str.charAt(K - 1));
        sb6.append('@');
        java.lang.String substring = str.substring(K + 1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        sb6.append(substring);
        return sb6.toString();
    }

    public final em.w3 V6() {
        return (em.w3) ((jz5.n) this.f161231f).getValue();
    }

    public final void W6(android.widget.TextView textView, int i17, yz5.a aVar) {
        java.lang.String string = getString(i17);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new com.tencent.mm.plugin.setting.ui.setting.g8(aVar), 0, string.length(), 18);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(P6 != null ? P6.getContext() : null));
        textView.setClickable(true);
        textView.setText(spannableStringBuilder);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.enj;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f161229d = getIntent().getStringExtra("BINDED_EMAIL");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setActionbarColor(getColor(com.tencent.mm.R.color.aaw));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P63 = P6();
        if (P63 != null) {
            P63.setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.c8(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        }
        em.w3 V6 = V6();
        if (V6.f254895b == null) {
            V6.f254895b = (android.widget.TextView) V6.f254894a.findViewById(com.tencent.mm.R.id.si9);
        }
        android.widget.TextView textView = V6.f254895b;
        java.lang.String str = this.f161229d;
        textView.setText(U6(str != null ? str : ""));
        textView.setTextAlignment(4);
        textView.setMaxLines(2);
        textView.setBreakStrategy(0);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.setting.ui.setting.d8(textView));
        em.w3 V62 = V6();
        if (V62.f254896c == null) {
            V62.f254896c = (android.widget.TextView) V62.f254894a.findViewById(com.tencent.mm.R.id.v5j);
        }
        android.widget.TextView textView2 = V62.f254896c;
        kotlin.jvm.internal.o.d(textView2);
        W6(textView2, com.tencent.mm.R.string.ohs, new com.tencent.mm.plugin.setting.ui.setting.e8(this));
        em.w3 V63 = V6();
        if (V63.f254897d == null) {
            V63.f254897d = (android.widget.Button) V63.f254894a.findViewById(com.tencent.mm.R.id.kao);
        }
        V63.f254897d.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.f8(this));
    }
}
