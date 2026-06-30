package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.n f142949a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f142950b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.EditText f142951c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f142952d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f142953e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f142954f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f142955g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f142956h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f142957i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.c5 f142958j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f142959k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f142960l;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f142962n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f142963o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f142964p;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f142970v;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f142961m = "";

    /* renamed from: q, reason: collision with root package name */
    public long f142965q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f142966r = false;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f142967s = new com.tencent.mm.plugin.ipcall.ui.e(this);

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f142968t = new com.tencent.mm.sdk.platformtools.n3("IPCallDialQueryPhoneNumber");

    /* renamed from: u, reason: collision with root package name */
    public boolean f142969u = false;

    public o(com.tencent.mm.ui.MMActivity mMActivity, android.widget.EditText editText, android.widget.TextView textView, android.view.View view, com.tencent.mm.plugin.ipcall.ui.DialPad dialPad, android.widget.ImageButton imageButton, android.widget.TextView textView2, android.view.View view2, android.widget.TextView textView3, android.widget.TextView textView4) {
        com.tencent.mm.plugin.ipcall.ui.f fVar = new com.tencent.mm.plugin.ipcall.ui.f(this);
        this.f142970v = "";
        this.f142957i = mMActivity;
        this.f142951c = editText;
        this.f142950b = textView;
        this.f142952d = view;
        this.f142953e = textView2;
        this.f142954f = view2;
        this.f142955g = textView3;
        this.f142956h = textView4;
        this.f142958j = new com.tencent.mm.sdk.platformtools.c5();
        this.f142960l = t83.f.f();
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputCountryName", "");
        this.f142959k = com.tencent.mm.sdk.platformtools.t8.K0(string) ? t83.c.f(t83.c.h()) : string;
        textView.addTextChangedListener(fVar);
        textView.setText("+" + this.f142960l);
        dialPad.setDialButtonClickListener(new com.tencent.mm.plugin.ipcall.ui.g(this));
        view.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.h(this));
        view.setOnLongClickListener(new com.tencent.mm.plugin.ipcall.ui.i(this));
        textView.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.j(this));
        imageButton.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.k(this));
        editText.setHorizontallyScrolling(true);
        editText.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.l(this));
        editText.addTextChangedListener(new com.tencent.mm.plugin.ipcall.ui.m(this));
        if (fp.h.c(16)) {
            textView.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
            editText.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
            textView2.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
        }
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String f17 = this.f142958j.f(str, t83.f.i(str2));
        return com.tencent.mm.sdk.platformtools.t8.K0(f17) ? str2 : f17;
    }

    public void b() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f142968t;
        java.lang.Runnable runnable = this.f142967s;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 500L);
    }

    public void c(java.lang.String str) {
        this.f142960l = str;
        android.widget.TextView textView = this.f142950b;
        if (textView != null) {
            textView.setText("+" + str);
        }
    }

    public void d(java.util.LinkedList linkedList) {
        boolean z17;
        java.util.LinkedList linkedList2;
        this.f142964p = linkedList;
        java.lang.String replace = this.f142950b.getText().toString().replace("+", "");
        if (t83.c.l(replace) && (linkedList2 = this.f142964p) != null && linkedList2.size() > 0) {
            java.lang.String g17 = t83.c.g(replace);
            java.util.Iterator it = this.f142964p.iterator();
            while (it.hasNext()) {
                r45.o57 o57Var = (r45.o57) it.next();
                if (o57Var != null && o57Var.f381967e.equals(g17)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        android.widget.TextView textView = this.f142956h;
        if (z17) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    public void e(java.lang.String str, int i17) {
        android.widget.EditText editText = this.f142951c;
        editText.setText(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (i17 == -1) {
                editText.setSelection(editText.getText().length());
            } else if (this.f142969u) {
                if (i17 <= 0 || i17 > editText.getText().length()) {
                    editText.setSelection(editText.getText().length());
                } else {
                    editText.setSelection(i17);
                }
            }
        }
        this.f142961m = str;
    }
}
