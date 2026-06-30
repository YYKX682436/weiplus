package qg5;

/* loaded from: classes8.dex */
public final class v5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f363226a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f363227b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f363228c;

    /* renamed from: d, reason: collision with root package name */
    public final db5.g3 f363229d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f363230e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f363231f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f363232g;

    public v5(android.content.Context context, yz5.a aVar, yz5.a aVar2) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f363226a = context;
        this.f363227b = aVar;
        this.f363228c = aVar2;
        com.tencent.mars.xlog.Log.i("YuanBaoSummarizeTosDialog", "creating YuanBaoSummarizeTosDialog");
        qg5.s5 s5Var = new qg5.s5(this);
        java.lang.String string = context.getString(com.tencent.mm.R.string.pht);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.tencent.mm.R.string.pdi, string));
        spannableStringBuilder.setSpan(s5Var, spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        db5.g3 g3Var = new db5.g3(context);
        g3Var.H(false);
        g3Var.S.setVisibility(8);
        g3Var.E(new qg5.o5(this, g3Var));
        g3Var.D(new qg5.p5(g3Var));
        g3Var.F(context.getString(com.tencent.mm.R.string.f490568yq));
        g3Var.G(context.getString(com.tencent.mm.R.string.omq));
        android.widget.TextView textView = g3Var.M;
        textView.setTextColor(textView.getContext().getColor(com.tencent.mm.R.color.abw));
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        textView.setGravity(8388611);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setTextSize(0, textView.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
        g3Var.l(new qg5.q5(this));
        g3Var.w(new qg5.r5(this));
        this.f363229d = g3Var;
        this.f363231f = jz5.h.b(qg5.u5.f363217d);
        this.f363232g = jz5.h.b(qg5.t5.f363193d);
    }

    public static final void a(qg5.v5 v5Var, int i17) {
        ((cy1.a) ((dy1.r) ((jz5.n) v5Var.f363232g).getValue())).Hj("yuanbao_legal_popup", "view_clk", kz5.c1.m(((qg5.e3) ((ct.k3) ((jz5.n) v5Var.f363231f).getValue())).nj("journey_summarize"), kz5.b1.e(new jz5.l("clk_popup_btn", java.lang.Integer.valueOf(i17)))), 35480);
    }
}
