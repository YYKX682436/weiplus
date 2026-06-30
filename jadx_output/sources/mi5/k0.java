package mi5;

/* loaded from: classes9.dex */
public final class k0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.y0 f326868a;

    /* renamed from: b, reason: collision with root package name */
    public ld5.b f326869b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.y0 y0Var = this.f326868a;
        android.view.View view = y0Var != null ? y0Var.f254935a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ehr, (android.view.ViewGroup) null);
        this.f326868a = new em.y0(inflate);
        c(null, this.f326869b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        ld5.b bVar = (ld5.b) pVar;
        ld5.b bVar2 = this.f326869b;
        this.f326869b = bVar;
        c(bVar2, bVar);
    }

    public final void c(ld5.b bVar, ld5.b bVar2) {
        em.y0 y0Var = this.f326868a;
        if (bVar2 == null || y0Var == null) {
            return;
        }
        android.widget.TextView textView = y0Var.f254938d;
        android.view.View view = y0Var.f254935a;
        if (textView == null) {
            y0Var.f254938d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483931ci2);
        }
        y0Var.f254938d.setText(bVar2.j());
        boolean z17 = false;
        if (!gk5.b0.a(bVar2)) {
            java.util.LinkedList k17 = bVar2.k();
            if (!(k17 == null || k17.isEmpty())) {
                z17 = true;
            }
        }
        if (z17) {
            if (y0Var.f254937c == null) {
                y0Var.f254937c = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.che);
            }
            y0Var.f254937c.setOnClickListener(new mi5.j0(bVar2));
        } else {
            if (y0Var.f254936b == null) {
                y0Var.f254936b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cwk);
            }
            y0Var.f254936b.setVisibility(8);
        }
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326869b;
    }
}
