package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class WebViewSearchContentInputFooter extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f187083d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f187084e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f187085f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f187086g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f187087h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f187088i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.p7 f187089m;

    public WebViewSearchContentInputFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public void a() {
        android.content.Context context = this.f187084e.getContext();
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).hideVKB(this.f187084e);
        }
        this.f187084e.clearFocus();
        setVisibility(8);
        com.tencent.mm.plugin.webview.ui.tools.widget.p7 p7Var = this.f187089m;
        if (p7Var != null) {
            p7Var.d(this);
        }
    }

    public final void b() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.d_0, this);
        this.f187084e = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.d98);
        this.f187085f = inflate.findViewById(com.tencent.mm.R.id.f483758bz2);
        this.f187086g = inflate.findViewById(com.tencent.mm.R.id.l28);
        this.f187087h = inflate.findViewById(com.tencent.mm.R.id.f486139kb5);
        this.f187088i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hc6);
        this.f187083d = inflate.findViewById(com.tencent.mm.R.id.hdl);
        this.f187085f.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.i7(this));
        this.f187086g.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.j7(this));
        this.f187087h.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.k7(this));
        this.f187084e.setOnKeyListener(new com.tencent.mm.plugin.webview.ui.tools.widget.l7(this));
        this.f187084e.setOnFocusChangeListener(new com.tencent.mm.plugin.webview.ui.tools.widget.m7(this));
        this.f187084e.addTextChangedListener(new com.tencent.mm.plugin.webview.ui.tools.widget.n7(this));
        this.f187084e.setSelectAllOnFocus(true);
        c();
    }

    public void c() {
        this.f187088i.setText("");
        this.f187086g.setEnabled(false);
        this.f187087h.setEnabled(false);
    }

    public void d(int i17, int i18, boolean z17) {
        if (z17) {
            android.widget.TextView textView = this.f187088i;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i18 == 0 ? 0 : i17 + 1);
            objArr[1] = java.lang.Integer.valueOf(i18);
            textView.setText(java.lang.String.format("%d/%d", objArr));
            this.f187087h.setEnabled(i18 > 0);
            this.f187086g.setEnabled(i18 > 0);
        }
    }

    public java.lang.String getSearchContent() {
        return this.f187084e.getText().toString();
    }

    @Override // android.view.View
    public boolean isShown() {
        return getVisibility() == 0;
    }

    public void setActionDelegate(com.tencent.mm.plugin.webview.ui.tools.widget.p7 p7Var) {
        this.f187089m = p7Var;
    }

    public WebViewSearchContentInputFooter(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }
}
