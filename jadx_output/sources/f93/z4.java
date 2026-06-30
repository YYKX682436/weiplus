package f93;

/* loaded from: classes11.dex */
public final class z4 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f93.b5 f260530a;

    public z4(f93.b5 b5Var) {
        this.f260530a = b5Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c0m, viewGroup, false);
        f93.b5 b5Var = this.f260530a;
        f93.u4 u4Var = b5Var.F;
        kotlin.jvm.internal.o.e(u4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.HeaderLabelDataItem.HeaderLabelViewHolder");
        kotlin.jvm.internal.o.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.d98);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        u4Var.f260479a = (com.tencent.mm.ui.widget.MMEditText) findViewById;
        b5Var.H = java.lang.Integer.valueOf(i65.a.h(u4Var.a().getContext(), com.tencent.mm.R.dimen.f479853h2));
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f484039ct2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        u4Var.f260480b = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.dhb);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        u4Var.f260481c = (android.widget.TextView) findViewById3;
        u4Var.a();
        f93.b5 b5Var2 = u4Var.f260482d;
        b5Var2.getClass();
        u4Var.a().setFilters(new android.text.InputFilter[]{new f93.t4(u4Var)});
        u4Var.a().requestFocus();
        u4Var.a().addTextChangedListener(new f93.v4(b5Var, u4Var));
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new f93.w4(u4Var), 0L);
        android.widget.ImageView imageView = u4Var.f260480b;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("mDeleteBtn");
            throw null;
        }
        imageView.setOnClickListener(new f93.x4(u4Var, b5Var));
        u4Var.b();
        u4Var.b().setOnTouchListener(new f93.y4(u4Var));
        java.lang.String text = b5Var.C;
        kotlin.jvm.internal.o.g(text, "text");
        u4Var.a();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(text)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = u4Var.a().getContext();
            java.lang.Integer num = b5Var2.H;
            kotlin.jvm.internal.o.d(num);
            u4Var.a().setText(((ke0.e) xVar).bj(context2, text, num.intValue()));
        }
        u4Var.a().setHint(u4Var.a().getContext().getString(com.tencent.mm.R.string.g8z));
        inflate.setTag(u4Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
    }
}
