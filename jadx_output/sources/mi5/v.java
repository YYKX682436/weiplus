package mi5;

/* loaded from: classes9.dex */
public final class v implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.c1 f326927a;

    /* renamed from: b, reason: collision with root package name */
    public qc5.a f326928b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.c1 c1Var = this.f326927a;
        android.view.View view = c1Var != null ? c1Var.f254164a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ehv, (android.view.ViewGroup) null);
        this.f326927a = new em.c1(inflate);
        c(null, this.f326928b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        qc5.a aVar = (qc5.a) pVar;
        qc5.a aVar2 = this.f326928b;
        this.f326928b = aVar;
        c(aVar2, aVar);
    }

    public final void c(qc5.a aVar, qc5.a aVar2) {
        java.lang.String str;
        java.lang.String string;
        y05.c cVar;
        y05.d j17;
        y05.c cVar2;
        y05.d j18;
        y05.c cVar3;
        y05.d j19;
        y05.c cVar4;
        y05.d j27;
        em.c1 c1Var = this.f326927a;
        java.lang.String str2 = null;
        l15.c j28 = aVar2 != null ? aVar2.j() : null;
        if (aVar2 == null || c1Var == null || j28 == null) {
            return;
        }
        android.view.View view = c1Var.f254164a;
        android.content.Context context = view.getContext();
        if (c1Var.f254167d == null) {
            c1Var.f254167d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483643bk2);
        }
        android.widget.ImageView imageView = c1Var.f254167d;
        kotlin.jvm.internal.o.f(imageView, "getChattingAvatarIvCard(...)");
        v05.b k17 = j28.k();
        if (k17 == null || (cVar4 = (y05.c) k17.getCustom(k17.f432315e + 40)) == null || (j27 = cVar4.j()) == null || (str = j27.getIconUrl()) == null) {
            str = "";
        }
        r53.v vVar = new r53.v();
        boolean z17 = true;
        vVar.f392703a = true;
        vVar.f392704b = true;
        vVar.f392709g = 0.1f;
        r53.y.a().e(imageView, str, vVar.a(), null);
        if (c1Var.f254165b == null) {
            c1Var.f254165b = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.bpv);
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView = c1Var.f254165b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        v05.b k18 = j28.k();
        java.lang.String name = (k18 == null || (cVar3 = (y05.c) k18.getCustom(k18.f432315e + 40)) == null || (j19 = cVar3.j()) == null) ? null : j19.getName();
        ((ke0.e) xVar).getClass();
        mMTextView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, name));
        v05.b k19 = j28.k();
        if (k19 != null && (cVar2 = (y05.c) k19.getCustom(k19.f432315e + 40)) != null && (j18 = cVar2.j()) != null) {
            str2 = j18.j();
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            c1Var.a().setVisibility(8);
        } else {
            c1Var.a().setVisibility(0);
            com.tencent.mm.ui.widget.MMTextView a17 = c1Var.a();
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            a17.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
        }
        v05.b k27 = j28.k();
        if (k27 == null || (cVar = (y05.c) k27.getCustom(k27.f432315e + 40)) == null || (j17 = cVar.j()) == null || (string = j17.l()) == null) {
            string = context.getResources().getString(com.tencent.mm.R.string.f492220fo1);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        if (c1Var.f254166c == null) {
            c1Var.f254166c = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.br9);
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView2 = c1Var.f254166c;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        mMTextView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
        pt0.e0 e0Var = pt0.f0.f358209b1;
        int i17 = aVar2.f43702d;
        e0Var.n(aVar2.getString(i17 + 1), aVar2.getLong(i17 + 0));
        view.setOnClickListener(new mi5.u(j28, context));
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326928b;
    }
}
