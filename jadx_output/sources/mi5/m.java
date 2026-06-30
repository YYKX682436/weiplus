package mi5;

/* loaded from: classes9.dex */
public final class m implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.s0 f326877a;

    /* renamed from: b, reason: collision with root package name */
    public fc5.d f326878b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.s0 s0Var = this.f326877a;
        android.view.View view = s0Var != null ? s0Var.f254767a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eho, (android.view.ViewGroup) null);
        this.f326877a = new em.s0(inflate);
        c(null, this.f326878b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.d dVar = (fc5.d) pVar;
        fc5.d dVar2 = this.f326878b;
        this.f326878b = dVar;
        c(dVar2, dVar);
    }

    public final void c(fc5.d dVar, fc5.d dVar2) {
        zy2.g gVar;
        r45.ev2 ev2Var;
        em.s0 s0Var = this.f326877a;
        java.lang.String j17 = dVar2 != null ? dVar2.j() : null;
        if (dVar2 == null || s0Var == null || j17 == null) {
            return;
        }
        android.view.View view = s0Var.f254767a;
        android.content.Context context = view.getContext();
        ot0.q v17 = ot0.q.v(j17);
        if (v17 == null || (gVar = (zy2.g) v17.y(zy2.g.class)) == null || (ev2Var = gVar.f477383b) == null) {
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f460502a;
        java.lang.String string = ev2Var.getString(3);
        if (s0Var.f254770d == null) {
            s0Var.f254770d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.tco);
        }
        lVar.h(string, s0Var.f254770d, mn2.f1.B);
        if (s0Var.f254768b == null) {
            s0Var.f254768b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484981tw0);
        }
        s0Var.f254768b.setText(ev2Var.getString(1));
        if (s0Var.f254771e == null) {
            s0Var.f254771e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484443tc4);
        }
        s0Var.f254771e.setText(context.getString(com.tencent.mm.R.string.etp, java.lang.Integer.valueOf(ev2Var.getInteger(4))));
        if (s0Var.f254769c == null) {
            s0Var.f254769c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tf_);
        }
        s0Var.f254769c.setText(v17.f348666i == 119 ? context.getString(com.tencent.mm.R.string.nyc) : context.getString(com.tencent.mm.R.string.njl));
        view.setOnClickListener(new mi5.l(ev2Var, dVar2, v17, context));
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326878b;
    }
}
