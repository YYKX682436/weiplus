package ib0;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f290030b;

    /* renamed from: a, reason: collision with root package name */
    public static final ib0.e f290029a = new ib0.e();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f290031c = jz5.h.b(ib0.a.f290024d);

    public final void a(android.content.Context context, yz5.a block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        if (f290030b) {
            block.invoke();
            return;
        }
        jz5.g gVar = f290031c;
        if (((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).getBoolean("key_show_tips", false)) {
            f290030b = true;
            block.invoke();
            return;
        }
        f290030b = true;
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).putBoolean("key_show_tips", true);
        db5.g3 g3Var = new db5.g3(context);
        g3Var.H(false);
        g3Var.S.setVisibility(8);
        g3Var.E(new ib0.b(g3Var, block));
        g3Var.D(new ib0.c(g3Var));
        java.lang.String string = context.getString(com.tencent.mm.R.string.mje);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        g3Var.G(context.getString(com.tencent.mm.R.string.omq));
        g3Var.F(context.getString(com.tencent.mm.R.string.f490358sq));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.tencent.mm.R.string.f492670ob4, string));
        spannableStringBuilder.setSpan(new ib0.d(context), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        android.widget.TextView textView = g3Var.M;
        textView.setVisibility(0);
        textView.setGravity(8388611);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setTextSize(14.0f);
        g3Var.C();
    }
}
