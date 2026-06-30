package com.tencent.mm.plugin.remittance.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u000b\u000fB)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/remittance/ui/RemittanceRemarkInputHalfPage;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onActivityResume", "onActivityPause", "Lcom/tencent/mm/ui/MMActivity;", "context", "", "maxLimitLength", "", "placeorderReserves", "Lcom/tencent/mm/plugin/remittance/ui/l7;", "entryScene", "<init>", "(Lcom/tencent/mm/ui/MMActivity;ILjava/lang/String;Lcom/tencent/mm/plugin/remittance/ui/l7;)V", "com/tencent/mm/plugin/remittance/ui/m7", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RemittanceRemarkInputHalfPage implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f157561d;

    /* renamed from: e, reason: collision with root package name */
    public final int f157562e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f157563f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.remittance.ui.l7 f157564g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f157565h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.f5 f157566i;

    /* renamed from: m, reason: collision with root package name */
    public int f157567m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f157568n;

    public RemittanceRemarkInputHalfPage(com.tencent.mm.ui.MMActivity context, int i17, java.lang.String str, com.tencent.mm.plugin.remittance.ui.l7 entryScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(entryScene, "entryScene");
        this.f157561d = context;
        this.f157562e = i17;
        this.f157563f = str;
        this.f157564g = entryScene;
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(context);
        this.f157566i = f5Var;
        context.mo133getLifecycle().a(this);
        f5Var.f210400e = new com.tencent.mm.plugin.remittance.ui.k7(this);
    }

    public final void a(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.remittance.ui.m7 callback) {
        com.tencent.mm.plugin.remittance.ui.l7 l7Var;
        int i17;
        boolean z17;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f157565h;
        if (z2Var != null) {
            z2Var.B();
        }
        this.f157565h = new com.tencent.mm.ui.widget.dialog.z2(this.f157561d, 1, 2, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = this.f157565h;
        if (z2Var2 != null) {
            if (fp.h.c(36)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceRemarkInputHalfPage", "[showDialog] version >= 16");
                z2Var2.A(16);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceRemarkInputHalfPage", "[showDialog] version < 16");
                z2Var2.A(48);
            }
            if (com.tencent.mm.ui.b4.c(this.f157561d)) {
                z2Var2.A(48);
            }
            android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f157561d);
            android.view.View view = z2Var2.f212058g;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.cee, (android.view.ViewGroup) view, false);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.lwr);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById;
            android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.lwq);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.lws);
            android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.lw_);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById3;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                mMEditText.setHint(str2);
            }
            z2Var2.f212055d.setOnKeyListener(new com.tencent.mm.plugin.remittance.ui.r7(z2Var2, this, mMEditText));
            com.tencent.mm.wallet_core.ui.r1.k(weImageView, i65.a.b(this.f157561d, 20));
            com.tencent.mm.plugin.remittance.ui.l7 l7Var2 = this.f157564g;
            com.tencent.mm.plugin.remittance.ui.l7 l7Var3 = com.tencent.mm.plugin.remittance.ui.l7.f157807d;
            if (l7Var2 == l7Var3) {
                l7Var = l7Var3;
                i17 = 0;
                linearLayout.setPadding(i65.a.b(this.f157561d, 0), i65.a.b(this.f157561d, 0), i65.a.b(this.f157561d, 6), i65.a.b(this.f157561d, 0));
                z17 = true;
            } else {
                l7Var = l7Var3;
                i17 = 0;
                z17 = false;
            }
            if (z17) {
                weImageView.setVisibility(i17);
                weImageView.setForeground(this.f157561d.getDrawable(com.tencent.mm.R.drawable.f482065ax3));
            } else {
                weImageView.setVisibility(8);
            }
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = "";
            int length = str != null ? str.length() : 0;
            if (length > this.f157562e) {
                z2Var2.b(false);
                textView.setTextColor(this.f157561d.getResources().getColor(com.tencent.mm.R.color.f478532ac));
                textView.setVisibility(0);
            } else {
                z2Var2.b(true);
                textView.setVisibility(4);
            }
            weImageView.setOnClickListener(new com.tencent.mm.plugin.remittance.ui.u7(this, mMEditText, c0Var, h0Var, arrayList));
            java.lang.String format = java.lang.String.format("%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(this.f157562e)}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView.setText(format);
            mMEditText.addTextChangedListener(new com.tencent.mm.plugin.remittance.ui.v7(textView, this, z2Var2, new kotlin.jvm.internal.c0(), c0Var, arrayList));
            if (!(str == null || str.length() == 0)) {
                mMEditText.setText(str);
                mMEditText.setSelection(str.length());
            }
            z2Var2.j(viewGroup);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            java.lang.String str3 = this.f157568n;
            if (str3 == null || str3.length() == 0) {
                spannableStringBuilder.append((java.lang.CharSequence) this.f157561d.getString(com.tencent.mm.R.string.aeq));
            } else {
                spannableStringBuilder.append((java.lang.CharSequence) this.f157568n);
            }
            spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(null, 0, 0, null, null), 0, spannableStringBuilder.length(), 18);
            z2Var2.q(spannableStringBuilder);
            com.tencent.mm.wallet_core.ui.r1.d(z2Var2.C);
            z2Var2.m(this.f157561d.getString(com.tencent.mm.R.string.f490347sg), this.f157561d.getString(com.tencent.mm.R.string.f490507x1));
            com.tencent.mm.plugin.remittance.ui.w7 w7Var = new com.tencent.mm.plugin.remittance.ui.w7(callback, h0Var, this, mMEditText, z2Var2);
            com.tencent.mm.plugin.remittance.ui.x7 x7Var = new com.tencent.mm.plugin.remittance.ui.x7(callback, mMEditText, h0Var, this, z2Var2, arrayList);
            z2Var2.D = w7Var;
            z2Var2.E = x7Var;
            com.tencent.mm.ui.tools.f5 f5Var = this.f157566i;
            if (f5Var != null) {
                f5Var.f();
            }
            z2Var2.C();
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.remittance.ui.y7 y7Var = new com.tencent.mm.plugin.remittance.ui.y7(mMEditText, weImageView);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(y7Var, 50L, false);
            if (this.f157564g == l7Var) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22750, 1, this.f157563f);
            }
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public final void onActivityPause() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f157566i;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public final void onActivityResume() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f157566i;
        if (f5Var != null) {
            f5Var.f();
        }
    }
}
