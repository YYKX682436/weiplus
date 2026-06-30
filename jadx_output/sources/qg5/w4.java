package qg5;

/* loaded from: classes8.dex */
public final class w4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f363245a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f363246b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f363247c;

    /* renamed from: d, reason: collision with root package name */
    public final db5.g3 f363248d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f363249e;

    public w4(android.content.Context context, yz5.a aVar, yz5.a aVar2) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f363245a = context;
        this.f363246b = aVar;
        this.f363247c = aVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsTosDialog", "Creating yuanbao forward chat records TOS dialog");
        qg5.v4 v4Var = new qg5.v4(this);
        java.lang.String string = context.getString(com.tencent.mm.R.string.pdj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.tencent.mm.R.string.pdi, string));
        spannableStringBuilder.setSpan(v4Var, spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        db5.g3 g3Var = new db5.g3(context);
        g3Var.H(false);
        g3Var.S.setVisibility(8);
        g3Var.E(new qg5.r4(this, g3Var));
        g3Var.D(new qg5.s4(g3Var));
        g3Var.F(context.getString(com.tencent.mm.R.string.f490568yq));
        g3Var.G(context.getString(com.tencent.mm.R.string.omq));
        android.widget.TextView textView = g3Var.M;
        textView.setTextColor(textView.getContext().getColor(com.tencent.mm.R.color.abw));
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        textView.setGravity(8388611);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setTextSize(0, textView.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
        g3Var.l(new qg5.t4(this));
        g3Var.w(new qg5.u4(this));
        this.f363248d = g3Var;
    }

    public static final void a(qg5.w4 w4Var, int i17) {
        w4Var.getClass();
        java.util.Map m17 = kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209300g, kz5.c1.k(new jz5.l("forward_sid", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b), new jz5.l("clk_popup_btn", java.lang.Integer.valueOf(i17)), new jz5.l("share_type", 13)));
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsTosDialog", "reportTosDialogClk: buttonId=" + i17 + ", " + m17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbao_legal_popup", "view_clk", m17, 32337);
    }
}
