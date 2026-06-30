package qg5;

/* loaded from: classes8.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f362907a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f362908b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f362909c;

    /* renamed from: d, reason: collision with root package name */
    public final db5.g3 f362910d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f362911e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f362912f;

    public a4(android.content.Context context, yz5.a aVar, yz5.a aVar2) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f362907a = context;
        this.f362908b = aVar;
        this.f362909c = aVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyChatRecordsTosDialog", "Creating yuanbao copy chat records TOS dialog");
        qg5.y3 y3Var = new qg5.y3(this);
        java.lang.String string = context.getString(com.tencent.mm.R.string.pdj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.tencent.mm.R.string.pdi, string));
        spannableStringBuilder.setSpan(y3Var, spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        db5.g3 g3Var = new db5.g3(context);
        g3Var.H(false);
        g3Var.S.setVisibility(8);
        g3Var.E(new qg5.v3(this, g3Var));
        g3Var.D(new qg5.w3(g3Var));
        g3Var.F(context.getString(com.tencent.mm.R.string.f490568yq));
        g3Var.G(context.getString(com.tencent.mm.R.string.omq));
        android.widget.TextView textView = g3Var.M;
        textView.setTextColor(textView.getContext().getColor(com.tencent.mm.R.color.abw));
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        textView.setGravity(8388611);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setTextSize(0, textView.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
        g3Var.l(new qg5.x3(this));
        this.f362910d = g3Var;
        this.f362912f = jz5.h.b(qg5.z3.f363279d);
    }

    public final ct.k3 a() {
        return (ct.k3) ((jz5.n) this.f362912f).getValue();
    }
}
