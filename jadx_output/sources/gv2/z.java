package gv2;

/* loaded from: classes10.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gv2.n0 f276104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f276105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jv2.i f276106f;

    public z(gv2.n0 n0Var, in5.s0 s0Var, jv2.i iVar) {
        this.f276104d = n0Var;
        this.f276105e = s0Var;
        this.f276106f = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$13$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.uniComments.g2 g2Var = this.f276104d.f276047e;
        android.view.View itemView = this.f276105e.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = (com.tencent.mm.plugin.finder.uniComments.q3) g2Var;
        q3Var.getClass();
        jv2.i item = this.f276106f;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(itemView.getContext(), 1, false);
        iv2.b bVar = q3Var.f130371h;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        k0Var.f211872n = new com.tencent.mm.plugin.finder.uniComments.q4(item, bVar.f295129e);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.uniComments.t4(item, q3Var.f130368e, new com.tencent.mm.plugin.finder.uniComments.h3(q3Var));
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$13$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
