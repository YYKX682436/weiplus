package rb2;

/* loaded from: classes10.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.y0 f393747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393749f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f393750g;

    public s0(rb2.y0 y0Var, in5.s0 s0Var, so2.y0 y0Var2, android.view.ViewGroup viewGroup) {
        this.f393747d = y0Var;
        this.f393748e = s0Var;
        this.f393749f = y0Var2;
        this.f393750g = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$bindThumbLike$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.ViewGroup llThumbLikeContainer = this.f393750g;
        kotlin.jvm.internal.o.f(llThumbLikeContainer, "$llThumbLikeContainer");
        rb2.y0 y0Var = this.f393747d;
        y0Var.getClass();
        nv2.n1 n1Var = nv2.n1.f340551h;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = y0Var.f393829e;
        long j17 = finderItem.field_id;
        so2.y0 y0Var2 = this.f393749f;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = y0Var2.f410703d;
        int i17 = y0Var.f393830f;
        boolean i18 = n1Var.i(j17, yj0Var, i17);
        boolean isCommentClose = finderItem.isCommentClose();
        in5.s0 s0Var = this.f393748e;
        if (isCommentClose) {
            int i19 = i18 ? com.tencent.mm.R.string.m7l : com.tencent.mm.R.string.m7j;
            android.content.Context context = s0Var.f293121e;
            int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(i19);
            e4Var.c();
        } else {
            if (!i18) {
                hc2.f1.d(llThumbLikeContainer);
            }
            y0Var.f393832h.invoke(java.lang.Integer.valueOf(s0Var.getAdapterPosition()));
            y0Var.r(s0Var, !i18, n1Var.b(finderItem.field_id, y0Var2.f410703d, i17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$bindThumbLike$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
