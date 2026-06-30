package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class a1 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f120685h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f120686i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f120687m;

    /* renamed from: n, reason: collision with root package name */
    public long f120688n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f120689o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.content.Context context, androidx.lifecycle.y owner, yz5.p completeCallback) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(completeCallback, "completeCallback");
        this.f120685h = completeCallback;
        this.f120687m = "";
        this.f118384g.f444836c.b().setGravity(5);
        this.f118384g.f444836c.b().setWindowAnimations(com.tencent.mm.R.style.f494504ot);
        this.f120689o = jz5.h.b(new com.tencent.mm.plugin.finder.live.wish.widget.y0(context, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void a() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f120686i;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
        mMEditText.clearFocus();
        java.lang.Object systemService = this.f118381d.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f120686i;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
        inputMethodManager.hideSoftInputFromWindow(mMEditText2.getWindowToken(), 0);
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) this.f120689o).getValue()).d();
        super.a();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return e();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        android.widget.TextView textView = new android.widget.TextView(this.f118381d);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
        textView.setBackground(textView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0r));
        int b17 = i65.a.b(textView.getContext(), 12);
        int b18 = i65.a.b(textView.getContext(), 4);
        textView.setPadding(b17, b18, b17, b18);
        textView.setEnabled(false);
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.f490441v5));
        return textView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.ano;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.ekq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = com.tencent.mm.plugin.finder.live.plugin.hm.T1;
        layoutParams.height = ym5.x.a(context, 412.0f - 64) + (com.tencent.mm.ui.bl.c(this.f118381d) * 2);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.d6q);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById;
        this.f120686i = mMEditText;
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.live.wish.widget.w0(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void s() {
        this.f120685h.invoke(this.f120687m, java.lang.Long.valueOf(this.f120688n));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void u() {
        a();
        this.f120685h.invoke(this.f120687m, java.lang.Long.valueOf(this.f120688n));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        long j17;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f120686i;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
        java.lang.String obj = mMEditText.getText().toString();
        kotlin.jvm.internal.o.g(obj, "<this>");
        try {
            j17 = java.lang.Long.parseLong(obj);
        } catch (java.lang.NumberFormatException unused) {
            j17 = 0;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Long l17 = (valueOf.longValue() > 0L ? 1 : (valueOf.longValue() == 0L ? 0 : -1)) > 0 ? valueOf : null;
        long longValue = l17 != null ? l17.longValue() : this.f120688n;
        jz5.g gVar = ae2.in.U1;
        if (longValue > ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue()) {
            android.content.Context context = this.f118381d;
            db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.dk9, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue())));
        } else {
            a();
            this.f120685h.invoke(this.f120687m, java.lang.Long.valueOf(longValue));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        pm0.v.V(100L, new com.tencent.mm.plugin.finder.live.wish.widget.z0(this));
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) this.f120689o).getValue()).f();
    }
}
