package mi5;

/* loaded from: classes9.dex */
public final class k implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.u0 f326865a;

    /* renamed from: b, reason: collision with root package name */
    public final yo0.i f326866b;

    /* renamed from: c, reason: collision with root package name */
    public fc5.c f326867c;

    public k() {
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f326866b = fVar.a();
    }

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.u0 u0Var = this.f326865a;
        android.view.View view = u0Var != null ? u0Var.f254829a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ehp, (android.view.ViewGroup) null);
        this.f326865a = new em.u0(inflate);
        c(null, this.f326867c);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.c cVar = (fc5.c) pVar;
        fc5.c cVar2 = this.f326867c;
        this.f326867c = cVar;
        c(cVar2, cVar);
    }

    public final void c(fc5.c cVar, fc5.c cVar2) {
        java.lang.String str;
        java.lang.String string;
        em.u0 u0Var = this.f326865a;
        java.lang.String j17 = cVar2 != null ? cVar2.j() : null;
        if (cVar2 == null || u0Var == null || j17 == null) {
            return;
        }
        android.view.View view = u0Var.f254829a;
        android.content.Context context = view.getContext();
        ot0.q v17 = ot0.q.v(j17);
        if (v17 != null) {
            zy2.e eVar = (zy2.e) v17.y(zy2.e.class);
            r45.mv2 mv2Var = eVar != null ? eVar.f477372b : null;
            if (mv2Var != null) {
                r45.ht0 ht0Var = (r45.ht0) mv2Var.getCustom(6);
                yo0.i iVar = this.f326866b;
                str = "";
                if (ht0Var != null) {
                    zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                    r45.ht0 ht0Var2 = (r45.ht0) mv2Var.getCustom(6);
                    kotlin.jvm.internal.o.d(ht0Var2);
                    java.lang.String pj6 = ((c61.l7) b6Var).pj(ht0Var2);
                    java.lang.String obj = com.tencent.mm.sdk.platformtools.x2.f193071a.getText(com.tencent.mm.R.string.cmu).toString();
                    r45.ht0 ht0Var3 = (r45.ht0) mv2Var.getCustom(6);
                    kotlin.jvm.internal.o.d(ht0Var3);
                    if (!android.text.TextUtils.isEmpty(ht0Var3.getString(5))) {
                        r45.ht0 ht0Var4 = (r45.ht0) mv2Var.getCustom(6);
                        kotlin.jvm.internal.o.d(ht0Var4);
                        java.lang.String string2 = ht0Var4.getString(5);
                        obj = string2 != null ? string2 : "";
                    }
                    if (u0Var.f254833e == null) {
                        u0Var.f254833e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tfl);
                    }
                    u0Var.f254833e.setText(obj);
                    if (mv2Var.getString(2) != null) {
                        vo0.a aVar = vo0.e.f438468b;
                        java.lang.String string3 = mv2Var.getString(2);
                        kotlin.jvm.internal.o.d(string3);
                        android.widget.ImageView b17 = u0Var.b();
                        kotlin.jvm.internal.o.f(b17, "getFinderTopicIcon(...)");
                        aVar.c(string3, b17, iVar);
                    } else {
                        u0Var.b().setVisibility(4);
                    }
                    view.setOnClickListener(new mi5.i(this, context, cVar2, mv2Var));
                    str = pj6;
                } else {
                    if (mv2Var.getInteger(1) == 18) {
                        str = mv2Var.getString(0);
                        android.widget.TextView a17 = u0Var.a();
                        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                        a17.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
                        r45.ub4 ub4Var = (r45.ub4) mv2Var.getCustom(8);
                        if (ub4Var != null && ub4Var.getInteger(1) == 1) {
                            string = context.getResources().getString(com.tencent.mm.R.string.m9u);
                            kotlin.jvm.internal.o.d(string);
                        } else {
                            string = context.getResources().getString(com.tencent.mm.R.string.m9v);
                            kotlin.jvm.internal.o.d(string);
                        }
                        if (u0Var.f254833e == null) {
                            u0Var.f254833e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tfl);
                        }
                        u0Var.f254833e.setText(string);
                        u0Var.b().setVisibility(0);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(mv2Var.getString(2))) {
                            com.tencent.mm.plugin.sns.model.l4.hj().S(u0Var.b(), -1, com.tencent.mm.R.drawable.aqs, context.hashCode());
                        } else {
                            vo0.a aVar2 = vo0.e.f438468b;
                            java.lang.String string4 = mv2Var.getString(2);
                            kotlin.jvm.internal.o.d(string4);
                            android.widget.ImageView b18 = u0Var.b();
                            kotlin.jvm.internal.o.f(b18, "getFinderTopicIcon(...)");
                            aVar2.c(string4, b18, iVar);
                        }
                        view.setOnClickListener(new mi5.j(this, context, cVar2, mv2Var));
                    }
                }
                android.widget.TextView a18 = u0Var.a();
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                a18.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
                if (u0Var.f254831c == null) {
                    u0Var.f254831c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tw_);
                }
                u0Var.f254831c.setText(mv2Var.getString(3));
            }
        }
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326867c;
    }
}
