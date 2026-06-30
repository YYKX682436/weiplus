package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f119699a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f119700b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f119701c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f119702d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f119703e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f119704f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f119705g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f119706h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f119707i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.LinearLayout f119708j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.CheckBox f119709k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f119710l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f119711m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f119712n;

    /* renamed from: o, reason: collision with root package name */
    public yf2.h0 f119713o;

    public s2(android.content.Context context, yz5.a onConfirm, yz5.a aVar, yz5.a aVar2, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onConfirm, "onConfirm");
        this.f119699a = context;
        this.f119700b = onConfirm;
        this.f119701c = aVar;
        this.f119702d = aVar2;
        this.f119703e = z17;
        this.f119704f = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.m2(this));
    }

    public final void a(yf2.h0 h0Var) {
        android.widget.TextView textView = this.f119706h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("licenseText");
            throw null;
        }
        textView.setText(h0Var.f461705a);
        android.widget.TextView textView2 = this.f119707i;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("licenseContentText");
            throw null;
        }
        textView2.setText(h0Var.f461706b);
        android.widget.TextView textView3 = this.f119710l;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("checkboxText");
            throw null;
        }
        textView3.setText(h0Var.f461707c);
        android.widget.TextView textView4 = this.f119710l;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("checkboxText");
            throw null;
        }
        textView4.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.widget.TextView textView5 = this.f119710l;
        if (textView5 != null) {
            textView5.post(new com.tencent.mm.plugin.finder.live.widget.k2(this, h0Var));
        } else {
            kotlin.jvm.internal.o.o("checkboxText");
            throw null;
        }
    }

    public final com.tencent.mm.plugin.finder.view.e3 b() {
        return (com.tencent.mm.plugin.finder.view.e3) ((jz5.n) this.f119704f).getValue();
    }

    public final void c() {
        android.widget.TextView textView = this.f119711m;
        if (textView == null) {
            kotlin.jvm.internal.o.o("confirmButton");
            throw null;
        }
        android.widget.CheckBox checkBox = this.f119709k;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        textView.setEnabled(checkBox.isChecked());
        android.widget.TextView textView2 = this.f119711m;
        if (textView2 != null) {
            textView2.invalidate();
        } else {
            kotlin.jvm.internal.o.o("confirmButton");
            throw null;
        }
    }
}
