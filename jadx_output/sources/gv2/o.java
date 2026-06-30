package gv2;

/* loaded from: classes10.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv2.d f276049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f276050e;

    public o(jv2.d dVar, in5.s0 s0Var) {
        this.f276049d = dVar;
        this.f276050e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        java.lang.String D0 = this.f276049d.f302207d.D0();
        android.content.Context context = this.f276050e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.Bk(D0, context);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
