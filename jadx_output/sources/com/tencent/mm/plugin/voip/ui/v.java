package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public final class v extends com.tencent.mm.ui.widget.dialog.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f177000d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f177001e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f177002f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f177003g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f177004h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f177005i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f177006m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f177007n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f177008o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f177009p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f177010q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f177011r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, yz5.l onAddParam) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onAddParam, "onAddParam");
        this.f177000d = onAddParam;
        this.f177001e = jz5.h.b(new com.tencent.mm.plugin.voip.ui.r(this));
        this.f177002f = jz5.h.b(new com.tencent.mm.plugin.voip.ui.l(this));
        this.f177003g = jz5.h.b(new com.tencent.mm.plugin.voip.ui.n(this));
        this.f177004h = jz5.h.b(new com.tencent.mm.plugin.voip.ui.m(this));
        this.f177005i = jz5.h.b(new com.tencent.mm.plugin.voip.ui.o(this));
        this.f177006m = jz5.h.b(new com.tencent.mm.plugin.voip.ui.q(this));
        this.f177007n = jz5.h.b(new com.tencent.mm.plugin.voip.ui.k(this));
        this.f177008o = jz5.h.b(new com.tencent.mm.plugin.voip.ui.p(this));
        this.f177009p = jz5.h.b(new com.tencent.mm.plugin.voip.ui.u(this));
        this.f177010q = kz5.c0.i(8, 4, 2, 16, 32);
        this.f177011r = kz5.c0.i(4, 6, 8, 10, 12);
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.cgd);
        setCanceledOnTouchOutside(true);
        java.lang.Object value = ((jz5.n) this.f177003g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.ArrayAdapter<java.lang.CharSequence> createFromResource = android.widget.ArrayAdapter.createFromResource(getContext(), com.tencent.mm.R.array.f478035ai, android.R.layout.simple_spinner_item);
        createFromResource.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ((android.widget.Spinner) value).setAdapter((android.widget.SpinnerAdapter) createFromResource);
        java.lang.Object value2 = ((jz5.n) this.f177004h).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        android.widget.ArrayAdapter<java.lang.CharSequence> createFromResource2 = android.widget.ArrayAdapter.createFromResource(getContext(), com.tencent.mm.R.array.f478036aj, android.R.layout.simple_spinner_item);
        createFromResource2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ((android.widget.Spinner) value2).setAdapter((android.widget.SpinnerAdapter) createFromResource2);
        jz5.g gVar = this.f177009p;
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        android.widget.ArrayAdapter<java.lang.CharSequence> createFromResource3 = android.widget.ArrayAdapter.createFromResource(getContext(), com.tencent.mm.R.array.f478037ak, android.R.layout.simple_spinner_item);
        createFromResource3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ((android.widget.Spinner) value3).setAdapter((android.widget.SpinnerAdapter) createFromResource3);
        java.lang.Object value4 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        ((android.widget.Spinner) value4).setSelection(1);
        java.lang.Object value5 = ((jz5.n) this.f177001e).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        ((android.view.View) value5).setOnClickListener(new com.tencent.mm.plugin.voip.ui.s(this));
        java.lang.Object value6 = ((jz5.n) this.f177002f).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        ((android.view.View) value6).setOnClickListener(new com.tencent.mm.plugin.voip.ui.t(this));
        android.view.Window window = getWindow();
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = com.tencent.mm.ui.bk.o(0.9f);
            window.setAttributes(attributes);
        }
    }
}
