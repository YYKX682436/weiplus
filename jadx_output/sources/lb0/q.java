package lb0;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final lb0.q f317688a = new lb0.q();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f317689b = jz5.h.b(lb0.l.f317681d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f317690c = jz5.h.b(lb0.j.f317677d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f317691d = jz5.h.b(lb0.i.f317676d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f317692e = jz5.h.b(lb0.g.f317674d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f317693f = jz5.h.b(lb0.h.f317675d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f317694g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f317695h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f317696i;

    static {
        jz5.h.b(lb0.f.f317673d);
        f317694g = jz5.h.b(lb0.e.f317672d);
        f317695h = jz5.h.b(lb0.p.f317687d);
        f317696i = jz5.h.b(lb0.o.f317686d);
    }

    public final boolean a(android.widget.TextView textView, int i17, boolean z17, java.lang.Integer num) {
        int i18;
        int i19;
        java.lang.String string;
        if (textView == null) {
            return false;
        }
        if (!z17 && f317688a.b(i17)) {
            return false;
        }
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = (java.lang.String) ((jz5.n) f317691d).getValue();
        switch (i17) {
            case 7:
                h0Var.f310123d = (java.lang.String) ((jz5.n) f317693f).getValue();
                i18 = com.tencent.mm.R.string.olr;
                i19 = com.tencent.mm.R.string.olo;
                break;
            case 8:
                h0Var.f310123d = (java.lang.String) ((jz5.n) f317692e).getValue();
                i18 = com.tencent.mm.R.string.o6p;
                i19 = com.tencent.mm.R.string.o6o;
                break;
            case 9:
                h0Var.f310123d = ((vh0.p3) ((vh0.o1) ((jz5.n) f317696i).getValue())).bj(true).f67867f;
                i18 = com.tencent.mm.R.string.ozw;
                i19 = com.tencent.mm.R.string.ozv;
                break;
            case 10:
                h0Var.f310123d = (java.lang.String) ((jz5.n) f317694g).getValue();
                i18 = com.tencent.mm.R.string.f493810p60;
                i19 = com.tencent.mm.R.string.p5y;
                break;
            default:
                i18 = com.tencent.mm.R.string.odi;
                i19 = com.tencent.mm.R.string.odb;
                break;
        }
        java.lang.String string2 = context.getString(i18);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        if (i19 == com.tencent.mm.R.string.ozv) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
            objArr[1] = string2;
            string = context.getString(i19, objArr);
        } else {
            string = context.getString(i19, string2);
        }
        kotlin.jvm.internal.o.d(string);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new lb0.k(h0Var, context, i17), spannableStringBuilder.length() - string2.length(), spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        return true;
    }

    public final boolean b(int i17) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.openway.RepairerConfigShowShareTips()) == 1) {
            return false;
        }
        if (i17 != 7 && i17 != 8) {
            i17 = 0;
        }
        jz5.g gVar = f317690c;
        java.lang.Boolean bool = (java.lang.Boolean) ((java.util.HashMap) ((jz5.n) gVar).getValue()).get(java.lang.Integer.valueOf(i17));
        if (bool != null && bool.booleanValue()) {
            return bool.booleanValue();
        }
        boolean i18 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f317689b).getValue()).i("ConfirmScene_" + i17, false);
        ((java.util.HashMap) ((jz5.n) gVar).getValue()).put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(i18));
        return i18;
    }

    public final void c(int i17) {
        if (i17 != 7 && i17 != 8) {
            i17 = 0;
        }
        ((java.util.HashMap) ((jz5.n) f317690c).getValue()).put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f317689b).getValue()).G("ConfirmScene_" + i17, true);
    }

    public final void d(android.content.Context context, int i17, yz5.a block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        if (b(i17)) {
            block.invoke();
            return;
        }
        db5.g3 g3Var = new db5.g3(context);
        g3Var.H(false);
        g3Var.S.setVisibility(8);
        g3Var.E(new lb0.m(g3Var, block, i17));
        g3Var.D(new lb0.n(g3Var));
        g3Var.G(context.getString(com.tencent.mm.R.string.f492808oe3));
        g3Var.F(context.getString(com.tencent.mm.R.string.f490568yq));
        int color = context.getColor(com.tencent.mm.R.color.FG_0);
        android.widget.TextView textView = g3Var.M;
        textView.setTextColor(color);
        a(textView, i17, false, null);
        textView.setVisibility(0);
        textView.setGravity(8388611);
        textView.setTextSize(14.0f);
        g3Var.C();
    }
}
