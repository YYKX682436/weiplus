package io;

/* loaded from: classes.dex */
public final class x implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.a1 f293439a;

    /* renamed from: b, reason: collision with root package name */
    public ne5.a f293440b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.a1 a1Var = this.f293439a;
        android.view.View view = a1Var != null ? a1Var.f254049a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eht, (android.view.ViewGroup) null);
        this.f293439a = new em.a1(inflate);
        c(null, this.f293440b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        ne5.a aVar = (ne5.a) pVar;
        ne5.a aVar2 = this.f293440b;
        this.f293440b = aVar;
        c(aVar2, aVar);
    }

    public final void c(ne5.a aVar, ne5.a aVar2) {
        em.a1 a1Var = this.f293439a;
        if (aVar2 == null || a1Var == null) {
            return;
        }
        android.view.View view = a1Var.f254049a;
        android.content.Context context = view.getContext();
        android.text.Spanned fromHtml = android.text.Html.fromHtml(aVar2.j());
        if (a1Var.f254051c == null) {
            a1Var.f254051c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483931ci2);
        }
        android.widget.TextView textView = a1Var.f254051c;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, fromHtml));
        if (a1Var.f254050b == null) {
            a1Var.f254050b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cwk);
        }
        a1Var.f254050b.setOnClickListener(new io.w(a1Var, aVar2));
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293440b;
    }
}
