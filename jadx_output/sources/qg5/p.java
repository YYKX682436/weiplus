package qg5;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f363119a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f363120b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f363121c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f363122d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f363123e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f363124f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f363125g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f363126h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f363127i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f363128j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f363129k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.z2 f363130l;

    public p(android.content.Context context, java.util.List msgList, yz5.a aVar, yz5.a aVar2) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msgList, "msgList");
        this.f363119a = context;
        this.f363120b = msgList;
        this.f363121c = aVar;
        this.f363122d = aVar2;
        this.f363123e = jz5.h.b(qg5.d.f362943d);
        this.f363124f = jz5.h.b(qg5.m.f363066d);
        this.f363125g = jz5.h.b(qg5.o.f363103d);
        jz5.g b17 = jz5.h.b(new qg5.l(this));
        this.f363126h = b17;
        jz5.g b18 = jz5.h.b(new qg5.k(this));
        this.f363127i = jz5.h.b(new qg5.c(this));
        this.f363128j = jz5.h.b(new qg5.n(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "Creating staging dialog");
        em.f fVar = (em.f) ((jz5.n) b18).getValue();
        if (fVar.f254297b == null) {
            fVar.f254297b = (android.widget.TextView) fVar.f254296a.findViewById(com.tencent.mm.R.id.f485914ug4);
        }
        fVar.f254297b.setText(context.getString(com.tencent.mm.R.string.pda, java.lang.Integer.valueOf(msgList.size())));
        em.f fVar2 = (em.f) ((jz5.n) b18).getValue();
        if (fVar2.f254299d == null) {
            fVar2.f254299d = (android.widget.Button) fVar2.f254296a.findViewById(com.tencent.mm.R.id.t3i);
        }
        fVar2.f254299d.setOnClickListener(new qg5.e(this));
        qg5.j jVar = new qg5.j(this);
        java.lang.String string = context.getString(com.tencent.mm.R.string.pd8);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.tencent.mm.R.string.pd7, string));
        spannableStringBuilder.setSpan(jVar, spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        em.f fVar3 = (em.f) ((jz5.n) b18).getValue();
        if (fVar3.f254300e == null) {
            fVar3.f254300e = (android.widget.TextView) fVar3.f254296a.findViewById(com.tencent.mm.R.id.vgi);
        }
        android.widget.TextView textView = fVar3.f254300e;
        textView.setVisibility(b() ? 8 : 0);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        em.f fVar4 = (em.f) ((jz5.n) b18).getValue();
        if (fVar4.f254298c == null) {
            fVar4.f254298c = (android.widget.TextView) fVar4.f254296a.findViewById(com.tencent.mm.R.id.utm);
        }
        fVar4.f254298c.setVisibility(b() ? 0 : 8);
        android.view.View view = (android.view.View) ((jz5.n) b17).getValue();
        kotlin.jvm.internal.o.f(view, "<get-dialogBodyView>(...)");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 0, true);
        z2Var.f212058g.setBackgroundResource(com.tencent.mm.R.drawable.cw_);
        z2Var.j(view);
        z2Var.m(context.getString(com.tencent.mm.R.string.f490347sg), context.getString(b() ? com.tencent.mm.R.string.f490358sq : com.tencent.mm.R.string.f490568yq));
        qg5.f fVar5 = new qg5.f(z2Var);
        qg5.g gVar = new qg5.g(this, z2Var);
        z2Var.D = fVar5;
        z2Var.E = gVar;
        z2Var.n(6);
        z2Var.o(0);
        z2Var.l(new qg5.h(this));
        z2Var.w(new qg5.i(this));
        this.f363130l = z2Var;
    }

    public static final void a(qg5.p pVar, int i17, boolean z17) {
        ((qg5.e3) ((ct.k3) ((jz5.n) pVar.f363125g).getValue())).tj(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
    }

    public final boolean b() {
        return ((java.lang.Boolean) this.f363128j.getValue()).booleanValue();
    }
}
