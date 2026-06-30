package mi5;

/* loaded from: classes9.dex */
public final class s implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.u0 f326911a;

    /* renamed from: b, reason: collision with root package name */
    public final yo0.i f326912b;

    /* renamed from: c, reason: collision with root package name */
    public fc5.h f326913c;

    public s() {
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f326912b = fVar.a();
    }

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.u0 u0Var = this.f326911a;
        android.view.View view = u0Var != null ? u0Var.f254829a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ehp, (android.view.ViewGroup) null);
        this.f326911a = new em.u0(inflate);
        c(null, this.f326913c);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.h hVar = (fc5.h) pVar;
        fc5.h hVar2 = this.f326913c;
        this.f326913c = hVar;
        c(hVar2, hVar);
    }

    public final void c(fc5.h hVar, fc5.h hVar2) {
        em.u0 u0Var = this.f326911a;
        java.lang.String j17 = hVar2 != null ? hVar2.j() : null;
        if (hVar2 == null || u0Var == null || j17 == null) {
            return;
        }
        android.view.View view = u0Var.f254829a;
        android.content.Context context = view.getContext();
        ot0.q v17 = ot0.q.v(j17);
        if (v17 != null) {
            zy2.m mVar = (zy2.m) v17.y(zy2.m.class);
            r45.mv2 mv2Var = mVar != null ? mVar.f477457b : null;
            if (mv2Var != null) {
                java.lang.String string = mv2Var.getInteger(1) == 1 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f8m, mv2Var.getString(0)) : mv2Var.getString(0);
                android.widget.TextView a17 = u0Var.a();
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                a17.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
                vo0.a aVar = vo0.e.f438468b;
                java.lang.String string2 = mv2Var.getString(2);
                kotlin.jvm.internal.o.d(string2);
                android.widget.ImageView b17 = u0Var.b();
                kotlin.jvm.internal.o.f(b17, "getFinderTopicIcon(...)");
                aVar.c(string2, b17, this.f326912b);
                if (u0Var.f254831c == null) {
                    u0Var.f254831c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tw_);
                }
                u0Var.f254831c.setText(mv2Var.getString(3));
                view.setOnClickListener(new mi5.r(this, context, hVar2, mv2Var));
            }
        }
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326913c;
    }
}
