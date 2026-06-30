package tt2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ko f421834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt2.d f421835e;

    public b(r45.ko koVar, tt2.d dVar) {
        this.f421834d = koVar;
        this.f421835e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingEditAdapter$BulkBuyEditViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ce0 ce0Var = (r45.ce0) this.f421834d.getCustom(6);
        if (ce0Var != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = this.f421835e.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ce0Var.getCustom(9));
            c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingEditAdapter$BulkBuyEditViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
