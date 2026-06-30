package rb2;

/* loaded from: classes2.dex */
public final class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393569g;

    public a2(in5.s0 s0Var, java.lang.String str, so2.y0 y0Var, rb2.z2 z2Var) {
        this.f393566d = s0Var;
        this.f393567e = str;
        this.f393568f = y0Var;
        this.f393569g = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        in5.s0 s0Var = this.f393566d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String str = this.f393567e;
        so2.y0 y0Var = this.f393568f;
        rb2.z2 z2Var = this.f393569g;
        i0Var.ql(context, str, y0Var, z2Var.f393686e.a0(), z2Var.f393686e.k0());
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c17).Gk(context2, this.f393568f.f410703d.field_feedId, (r18 & 4) != 0 ? false : true, (r18 & 8) != 0 ? false : false, 2, (r18 & 32) != 0 ? false : false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
