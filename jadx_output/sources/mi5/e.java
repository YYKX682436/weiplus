package mi5;

/* loaded from: classes9.dex */
public final class e implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.d1 f326819a;

    /* renamed from: b, reason: collision with root package name */
    public vd5.a f326820b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.d1 d1Var = this.f326819a;
        android.view.View view = d1Var != null ? d1Var.f254218a : null;
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ehw, (android.view.ViewGroup) null);
            this.f326819a = new em.d1(view);
            c(null, this.f326820b);
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        view.setScaleX(0.7f);
        view.setScaleY(0.7f);
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        vd5.a aVar = (vd5.a) pVar;
        vd5.a aVar2 = this.f326820b;
        this.f326820b = aVar;
        c(aVar2, aVar);
    }

    public final void c(vd5.a aVar, vd5.a aVar2) {
        java.lang.String j17;
        em.d1 d1Var = this.f326819a;
        v05.b j18 = aVar2 != null ? aVar2.j() : null;
        if (aVar2 == null || d1Var == null || j18 == null) {
            return;
        }
        android.view.View view = d1Var.f254218a;
        android.content.Context context = view.getContext();
        if (d1Var.f254221d == null) {
            d1Var.f254221d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483643bk2);
        }
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479718db);
        gk0.k kVar = new gk0.k(h17, h17);
        kVar.f272433d = 0.1f;
        int i17 = j18.f432315e;
        java.lang.String string = j18.getString(i17 + 14);
        gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
        if (d1Var.f254221d == null) {
            d1Var.f254221d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483643bk2);
        }
        android.widget.ImageView imageView = d1Var.f254221d;
        kotlin.jvm.internal.o.f(imageView, "getChattingAvatarIvCard(...)");
        java.lang.String str = "";
        if (string == null) {
            string = "";
        }
        ((h83.g) n0Var).wi(imageView, string, kVar);
        if (d1Var.f254219b == null) {
            d1Var.f254219b = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.bpv);
        }
        d1Var.f254219b.setText(j18.getString(j18.f368365d + 3));
        if (d1Var.f254222e == null) {
            d1Var.f254222e = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.brd);
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView = d1Var.f254222e;
        r05.l lVar = (r05.l) j18.getCustom(i17 + 41);
        if (lVar != null && (j17 = lVar.j()) != null) {
            str = j17;
        }
        mMTextView.setText(str);
        if (d1Var.f254220c == null) {
            d1Var.f254220c = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.br9);
        }
        d1Var.f254220c.setText(context.getString(com.tencent.mm.R.string.b3b));
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326820b;
    }
}
